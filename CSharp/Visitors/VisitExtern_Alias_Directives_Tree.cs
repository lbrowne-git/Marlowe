using System;
using System.Collections.Generic;
using System.Text;

namespace CSharp.Visitors
{
  /**
    *  The Compilation Process is divided into the following:
    *  BYTE_ORDER_MARK? extern_alias_directives? using_directives?
	*  global_attribute_section* namespace_member_declarations? EOF;
    *  
    *  This class represents the Extern_Alias_Directive Context and its Tree
    */
    public class VisitExtern_Alias_Directives_Tree : CSharpParserBaseVisitor<object?>
    {
        /* Implementing Extern Aliases is beyond the scope of this project;
            with only a limited amount of time, creating a functional Internpeter
            that is able to to handle package libraries would have taken far too long.
        */
    }
}
