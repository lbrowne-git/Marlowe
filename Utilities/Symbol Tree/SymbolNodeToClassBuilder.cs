using System;
using System.Collections.Generic;
using System.Reflection.Emit;
using System.Reflection;


namespace Marlowe.Utilities
{
    /// <summary>
    ///  Dynamically creates classes out of <see cref="ISymbolNode"/>s this is taken from <see href="https://stackoverflow.com/questions/3862226/how-to-dynamically-create-a-class">stackoverflow</see>.
    /// </summary>
    public static class SymbolNodeToClassBuilder
    {
        private static PropertyBuilder propertyBuilder;
        private static FieldBuilder fieldBuilder;
        /// <summary>
        ///     Defines a class by making use off the <see cref="System.Reflection"/> library and the context gathered by the collections contained in a <see cref="SymbolTable"/>.
        /// </summary>
        /// <param name="symbolNodes">The properties of the object</param>
        /// <returns>A new object of the class type provided by the <see cref="SymbolVariableNode"/>.</returns>
        public static object CreateNewObject(SymbolTable symbolTable)
        {
            var myType = CompileResultType(symbolTable);
            var myObject = Activator.CreateInstance(myType);
            return myObject;
        }

        /// <summary>
        ///     By making use of a collection of <see cref="SymbolTable"/> this function calls the <see cref="CreateNewObject(SymbolTable)"/>. 
        ///     
        /// </summary>
        /// <param name="symbolTables"></param>
        /// <returns>An <see cref="object"/> collection created out of a <see cref="SymbolTable"/> colllection.</returns>
        private static List<object> CreateNewObjects(List<SymbolTable> symbolTables)
        {
            List<object> classObjects = new List<object>();
            foreach (SymbolTable symbolTable in symbolTables)
            {
                classObjects.Add(CreateNewObject(symbolTable));
            }
            return classObjects;
        }

        private static Type CompileResultType(SymbolTable symbolTable){
            TypeBuilder tb = null;

            //ConstructorBuilder constructor = tb.DefineDefaultConstructor(MethodAttributes.Public | MethodAttributes.SpecialName | MethodAttributes.RTSpecialName);

            string typeSignature = "";
            foreach (KeyValuePair<string, SymbolNode> keyValuePair in symbolTable.Variables)
            {
                if (typeSignature != keyValuePair.Value.ClassName)
                {
                    typeSignature = keyValuePair.Value.ClassName;
                    tb = GetTypeBuilder(typeSignature);
                }
                CreateProperty(tb, keyValuePair.Key, keyValuePair.Value.Type);

            }
            if (tb != null){
                Type objectType = tb.CreateType();
                return objectType;
            }
            return null;
        }

        private static TypeBuilder GetTypeBuilder(string typeSignature)
        {
            var an = new AssemblyName(typeSignature);
            AssemblyBuilder assemblyBuilder = AssemblyBuilder.DefineDynamicAssembly(an, AssemblyBuilderAccess.Run);
            ModuleBuilder moduleBuilder = assemblyBuilder.DefineDynamicModule("MainModule");
            TypeBuilder tb = moduleBuilder.DefineType(typeSignature,
                    TypeAttributes.Public |
                    TypeAttributes.Class |
                    TypeAttributes.AutoClass |
                    TypeAttributes.AnsiClass |
                    TypeAttributes.BeforeFieldInit |
                    TypeAttributes.AutoLayout,
                    null);
            return tb;
        }


        /// <summary>
        ///     Works by making use of the <see cref="System.Reflection.Emit.ILGenerator"/> to conjure setters and getters for all properties of this class
        /// </summary>
        /// <param name="tb"></param>
        /// <param name="propertyName"></param>
        /// <param name="propertyType"></param>
        private static void CreateProperty(TypeBuilder tb, string propertyName, Type propertyType)
        {

            propertyBuilder = tb.DefineProperty(propertyName, PropertyAttributes.HasDefault, propertyType, null);
            fieldBuilder = tb.DefineField("_" + propertyName, propertyType, FieldAttributes.Private);


            CreateSetterFromProperty(tb, propertyName, propertyType);
            CreateGetterFromProperty(tb, propertyName, propertyType);


        }

        private static void CreateSetterFromProperty(TypeBuilder tb, string propertyName, Type propertyType)
        {
            MethodBuilder getPropMthdBldr = tb.DefineMethod("get_" + propertyName,
                                                MethodAttributes.Public |
                                                MethodAttributes.SpecialName |
                                                MethodAttributes.HideBySig,
                                                propertyType,
                                                Type.EmptyTypes);
            ILGenerator getIl = getPropMthdBldr.GetILGenerator();

            getIl.Emit(OpCodes.Ldarg_0);
            getIl.Emit(OpCodes.Ldfld, fieldBuilder);
            getIl.Emit(OpCodes.Ret);
            propertyBuilder.SetGetMethod(getPropMthdBldr);

        }
        private static void CreateGetterFromProperty(TypeBuilder tb, string propertyName, Type propertyType)
        {

            MethodBuilder setPropMthdBldr =
             tb.DefineMethod("set_" + propertyName,
               MethodAttributes.Public |
               MethodAttributes.SpecialName |
               MethodAttributes.HideBySig,
               null, new[] { propertyType });
            ILGenerator setIl = setPropMthdBldr.GetILGenerator();
            Label modifyProperty = setIl.DefineLabel();
            Label exitSet = setIl.DefineLabel();

            setIl.MarkLabel(modifyProperty);
            setIl.Emit(OpCodes.Ldarg_0);
            setIl.Emit(OpCodes.Ldarg_1);
            setIl.Emit(OpCodes.Stfld, fieldBuilder);

            setIl.Emit(OpCodes.Nop);
            setIl.MarkLabel(exitSet);
            setIl.Emit(OpCodes.Ret);
            propertyBuilder.SetSetMethod(setPropMthdBldr);


        }

    }

}
