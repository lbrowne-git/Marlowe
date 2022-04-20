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
        /// <summary>
        ///     Defines a class by making use off the <see cref="System.Reflection"/> library and the context gathered by the collections contained in a <see cref="SymbolTable"/>.
        /// </summary>
        /// <param name="symbolNodes">The properties of the object</param>
        /// <returns>A new object of the class type provided by the <see cref="SymbolNode"/>.</returns>
        public static object CreateNewObject(Dictionary<string, ISymbolNode> symbolNodes)
        {
            var myType = CompileResultType(symbolNodes);
            var myObject = Activator.CreateInstance(myType);
            return myObject;
        }
        private static Type CompileResultType(Dictionary<string, ISymbolNode> symbolNodes){
            TypeBuilder tb = null;

            //ConstructorBuilder constructor = tb.DefineDefaultConstructor(MethodAttributes.Public | MethodAttributes.SpecialName | MethodAttributes.RTSpecialName);

            string typeSignature = "";
            foreach (KeyValuePair<string, ISymbolNode> keyValuePair in symbolNodes)
            {
                if (typeSignature != keyValuePair.Value.ClassName)
                {
                    tb = GetTypeBuilder(keyValuePair.Value.ClassName);
                }
                CreateProperty(tb, keyValuePair.Key, keyValuePair.Value.Type);

            }

            Type objectType = tb.CreateType();
            return objectType;
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

        private static void CreateProperty(TypeBuilder tb, string propertyName, Type propertyType)
        {
            FieldBuilder fieldBuilder = tb.DefineField("_" + propertyName, propertyType, FieldAttributes.Private);

            PropertyBuilder propertyBuilder = tb.DefineProperty(propertyName, PropertyAttributes.HasDefault, propertyType, null);
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

            propertyBuilder.SetGetMethod(getPropMthdBldr);
            propertyBuilder.SetSetMethod(setPropMthdBldr);
        }
    }

}
