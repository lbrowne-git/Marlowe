using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime.Misc;
using CSharp;

namespace Marlowe.Visitor
{
    public interface INamespaceVisitor<T>
    {
        //   namespace_member_declarations
        //:       namespace_member_declaration                      
        public T VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context);

        //namespace_member_declaration
        //: namespace_declaration
        //| type_declaration
        //;
        public T VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context);

        //namespace_declaration
        //: NAMESPACE qi = qualified_identifier namespace_body ';'?
        public T VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context);
        // namespace_body
        // OPEN_BRACE extern_alias_directives? using_directives? namespace_member_declarations? CLOSE_BRACE
        public T VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context);
    }
}
