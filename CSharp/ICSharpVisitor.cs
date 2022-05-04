﻿using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;

namespace Marlowe.Visitors
{

    ///
    /// <summary>
    ///     Acts an intermediary point for all the decoupled visitors.
    /// </summary>
    public interface ICSharpVisitor<Result> : ILogicalOperationsVisitor<Result>, ITypeVisitor<Result>, 
                                              IVaraibleVisitor<Result>,          IAssignmentVisitor<Result>,
                                              IAccessVisitor<Result>,            INamespaceVisitor<Result>, 
                                              IClassVisitor<Result>,             IGlobalVisitor<Result>,
                                              IMethodVisitor<Result>,            IParseTreeVisitor<Result>
    { }
}
