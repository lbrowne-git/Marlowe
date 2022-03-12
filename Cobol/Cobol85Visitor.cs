using Antlr4.Runtime.Tree;
using System;
using Marlowe.Utilities;
using System.Collections.Generic;

namespace Marlowe.Cobol
{
    public class Cobol85Visitor : ICobol85Visitor<object>
    {
        Dictionary<string, object> AST = new Dictionary<string, object?>();

        object ICobol85Visitor<object>.VisitStartRule(Cobol85Parser.StartRuleContext context)
        {
            if (!context.IsEmpty){

                AST[context.GetText()] = VisitChildren(context);
            }
            return null;
        }


        public object VisitChildren(IRuleNode node)
        {
            throw new NotImplementedException();
        }

        public object VisitErrorNode(IErrorNode node)
        {
            throw new NotImplementedException();
        }

        public object VisitTerminal(ITerminalNode node)
        {
            throw new NotImplementedException();
        }

        object IParseTreeVisitor<object>.Visit(IParseTree tree)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAbbreviation(Cobol85Parser.AbbreviationContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAcceptFromDateStatement(Cobol85Parser.AcceptFromDateStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAcceptFromEscapeKeyStatement(Cobol85Parser.AcceptFromEscapeKeyStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAcceptFromMnemonicStatement(Cobol85Parser.AcceptFromMnemonicStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAcceptMessageCountStatement(Cobol85Parser.AcceptMessageCountStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAcceptStatement(Cobol85Parser.AcceptStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAccessModeClause(Cobol85Parser.AccessModeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddCorrespondingStatement(Cobol85Parser.AddCorrespondingStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddFrom(Cobol85Parser.AddFromContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddGiving(Cobol85Parser.AddGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddStatement(Cobol85Parser.AddStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddTo(Cobol85Parser.AddToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddToGiving(Cobol85Parser.AddToGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddToGivingStatement(Cobol85Parser.AddToGivingStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAddToStatement(Cobol85Parser.AddToStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetAlso(Cobol85Parser.AlphabetAlsoContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetClause(Cobol85Parser.AlphabetClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetClauseFormat1(Cobol85Parser.AlphabetClauseFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetClauseFormat2(Cobol85Parser.AlphabetClauseFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetLiterals(Cobol85Parser.AlphabetLiteralsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetName(Cobol85Parser.AlphabetNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlphabetThrough(Cobol85Parser.AlphabetThroughContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlteredGoTo(Cobol85Parser.AlteredGoToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlternateRecordKeyClause(Cobol85Parser.AlternateRecordKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlterProceedTo(Cobol85Parser.AlterProceedToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAlterStatement(Cobol85Parser.AlterStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAndOrCondition(Cobol85Parser.AndOrConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitArgument(Cobol85Parser.ArgumentContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitArithmeticExpression(Cobol85Parser.ArithmeticExpressionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAssignClause(Cobol85Parser.AssignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAssignmentName(Cobol85Parser.AssignmentNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAtEndPhrase(Cobol85Parser.AtEndPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitAuthorParagraph(Cobol85Parser.AuthorParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitBasis(Cobol85Parser.BasisContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitBasisName(Cobol85Parser.BasisNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitBlockContainsClause(Cobol85Parser.BlockContainsClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitBlockContainsTo(Cobol85Parser.BlockContainsToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitBooleanLiteral(Cobol85Parser.BooleanLiteralContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallByContent(Cobol85Parser.CallByContentContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallByContentPhrase(Cobol85Parser.CallByContentPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallByReference(Cobol85Parser.CallByReferenceContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallByReferencePhrase(Cobol85Parser.CallByReferencePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallByValue(Cobol85Parser.CallByValueContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallByValuePhrase(Cobol85Parser.CallByValuePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallGivingPhrase(Cobol85Parser.CallGivingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallStatement(Cobol85Parser.CallStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallUsingParameter(Cobol85Parser.CallUsingParameterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCallUsingPhrase(Cobol85Parser.CallUsingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCancelCall(Cobol85Parser.CancelCallContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCancelStatement(Cobol85Parser.CancelStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCdName(Cobol85Parser.CdNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitChannelClause(Cobol85Parser.ChannelClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCharacterPosition(Cobol85Parser.CharacterPositionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCharacterSetClause(Cobol85Parser.CharacterSetClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCicsDfhRespLiteral(Cobol85Parser.CicsDfhRespLiteralContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCicsDfhValueLiteral(Cobol85Parser.CicsDfhValueLiteralContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClassClause(Cobol85Parser.ClassClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClassClauseFrom(Cobol85Parser.ClassClauseFromContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClassClauseThrough(Cobol85Parser.ClassClauseThroughContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClassClauseTo(Cobol85Parser.ClassClauseToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClassCondition(Cobol85Parser.ClassConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClassName(Cobol85Parser.ClassNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCloseFile(Cobol85Parser.CloseFileContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClosePortFileIOStatement(Cobol85Parser.ClosePortFileIOStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClosePortFileIOUsing(Cobol85Parser.ClosePortFileIOUsingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClosePortFileIOUsingAssociatedData(Cobol85Parser.ClosePortFileIOUsingAssociatedDataContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClosePortFileIOUsingAssociatedDataLength(Cobol85Parser.ClosePortFileIOUsingAssociatedDataLengthContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitClosePortFileIOUsingCloseDisposition(Cobol85Parser.ClosePortFileIOUsingCloseDispositionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCloseReelUnitStatement(Cobol85Parser.CloseReelUnitStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCloseRelativeStatement(Cobol85Parser.CloseRelativeStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCloseStatement(Cobol85Parser.CloseStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCobolWord(Cobol85Parser.CobolWordContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCodeSetClause(Cobol85Parser.CodeSetClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCollatingSequenceClause(Cobol85Parser.CollatingSequenceClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCollatingSequenceClauseAlphanumeric(Cobol85Parser.CollatingSequenceClauseAlphanumericContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCollatingSequenceClauseNational(Cobol85Parser.CollatingSequenceClauseNationalContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCombinableCondition(Cobol85Parser.CombinableConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommentEntry(Cobol85Parser.CommentEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommitmentControlClause(Cobol85Parser.CommitmentControlClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommunicationDescriptionEntry(Cobol85Parser.CommunicationDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommunicationDescriptionEntryFormat1(Cobol85Parser.CommunicationDescriptionEntryFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommunicationDescriptionEntryFormat2(Cobol85Parser.CommunicationDescriptionEntryFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommunicationDescriptionEntryFormat3(Cobol85Parser.CommunicationDescriptionEntryFormat3Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCommunicationSection(Cobol85Parser.CommunicationSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCompilationUnit(Cobol85Parser.CompilationUnitContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitComputerName(Cobol85Parser.ComputerNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitComputeStatement(Cobol85Parser.ComputeStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitComputeStore(Cobol85Parser.ComputeStoreContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCondition(Cobol85Parser.ConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitConditionName(Cobol85Parser.ConditionNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitConditionNameReference(Cobol85Parser.ConditionNameReferenceContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitConditionNameSubscriptReference(Cobol85Parser.ConditionNameSubscriptReferenceContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitConfigurationSection(Cobol85Parser.ConfigurationSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitConfigurationSectionParagraph(Cobol85Parser.ConfigurationSectionParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitContinueStatement(Cobol85Parser.ContinueStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitCurrencySignClause(Cobol85Parser.CurrencySignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataAlignedClause(Cobol85Parser.DataAlignedClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataBaseSection(Cobol85Parser.DataBaseSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataBaseSectionEntry(Cobol85Parser.DataBaseSectionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataBlankWhenZeroClause(Cobol85Parser.DataBlankWhenZeroClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataCommonOwnLocalClause(Cobol85Parser.DataCommonOwnLocalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDescName(Cobol85Parser.DataDescNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDescriptionEntry(Cobol85Parser.DataDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDescriptionEntryExecSql(Cobol85Parser.DataDescriptionEntryExecSqlContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDescriptionEntryFormat1(Cobol85Parser.DataDescriptionEntryFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDescriptionEntryFormat2(Cobol85Parser.DataDescriptionEntryFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDescriptionEntryFormat3(Cobol85Parser.DataDescriptionEntryFormat3Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDivision(Cobol85Parser.DataDivisionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataDivisionSection(Cobol85Parser.DataDivisionSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataExternalClause(Cobol85Parser.DataExternalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataGlobalClause(Cobol85Parser.DataGlobalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataIntegerStringClause(Cobol85Parser.DataIntegerStringClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataJustifiedClause(Cobol85Parser.DataJustifiedClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataName(Cobol85Parser.DataNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataOccursClause(Cobol85Parser.DataOccursClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataOccursSort(Cobol85Parser.DataOccursSortContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataOccursTo(Cobol85Parser.DataOccursToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataPictureClause(Cobol85Parser.DataPictureClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataReceivedByClause(Cobol85Parser.DataReceivedByClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataRecordAreaClause(Cobol85Parser.DataRecordAreaClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataRecordsClause(Cobol85Parser.DataRecordsClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataRedefinesClause(Cobol85Parser.DataRedefinesClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataRenamesClause(Cobol85Parser.DataRenamesClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataSignClause(Cobol85Parser.DataSignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataSynchronizedClause(Cobol85Parser.DataSynchronizedClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataThreadLocalClause(Cobol85Parser.DataThreadLocalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataTypeClause(Cobol85Parser.DataTypeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataTypeDefClause(Cobol85Parser.DataTypeDefClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataUsageClause(Cobol85Parser.DataUsageClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataUsingClause(Cobol85Parser.DataUsingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataValueClause(Cobol85Parser.DataValueClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataValueInterval(Cobol85Parser.DataValueIntervalContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataValueIntervalFrom(Cobol85Parser.DataValueIntervalFromContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataValueIntervalTo(Cobol85Parser.DataValueIntervalToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDataWithLowerBoundsClause(Cobol85Parser.DataWithLowerBoundsClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDateCompiledParagraph(Cobol85Parser.DateCompiledParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDateWrittenParagraph(Cobol85Parser.DateWrittenParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDecimalPointClause(Cobol85Parser.DecimalPointClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDefaultComputationalSignClause(Cobol85Parser.DefaultComputationalSignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDefaultDisplaySignClause(Cobol85Parser.DefaultDisplaySignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDeleteStatement(Cobol85Parser.DeleteStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDestinationCountClause(Cobol85Parser.DestinationCountClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDestinationTableClause(Cobol85Parser.DestinationTableClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDisableStatement(Cobol85Parser.DisableStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDiskSizeClause(Cobol85Parser.DiskSizeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDisplayAt(Cobol85Parser.DisplayAtContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDisplayOperand(Cobol85Parser.DisplayOperandContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDisplayStatement(Cobol85Parser.DisplayStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDisplayUpon(Cobol85Parser.DisplayUponContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDisplayWith(Cobol85Parser.DisplayWithContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideByGivingStatement(Cobol85Parser.DivideByGivingStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideGiving(Cobol85Parser.DivideGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideGivingPhrase(Cobol85Parser.DivideGivingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideInto(Cobol85Parser.DivideIntoContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideIntoGivingStatement(Cobol85Parser.DivideIntoGivingStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideIntoStatement(Cobol85Parser.DivideIntoStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideRemainder(Cobol85Parser.DivideRemainderContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitDivideStatement(Cobol85Parser.DivideStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEnableStatement(Cobol85Parser.EnableStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEndKeyClause(Cobol85Parser.EndKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEndProgramStatement(Cobol85Parser.EndProgramStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEntryStatement(Cobol85Parser.EntryStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEnvironmentDivision(Cobol85Parser.EnvironmentDivisionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEnvironmentDivisionBody(Cobol85Parser.EnvironmentDivisionBodyContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEnvironmentName(Cobol85Parser.EnvironmentNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEnvironmentSwitchNameClause(Cobol85Parser.EnvironmentSwitchNameClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEnvironmentSwitchNameSpecialNamesStatusPhrase(Cobol85Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitErrorKeyClause(Cobol85Parser.ErrorKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateAlsoCondition(Cobol85Parser.EvaluateAlsoConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateAlsoSelect(Cobol85Parser.EvaluateAlsoSelectContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateCondition(Cobol85Parser.EvaluateConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateSelect(Cobol85Parser.EvaluateSelectContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateStatement(Cobol85Parser.EvaluateStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateThrough(Cobol85Parser.EvaluateThroughContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateValue(Cobol85Parser.EvaluateValueContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateWhen(Cobol85Parser.EvaluateWhenContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateWhenOther(Cobol85Parser.EvaluateWhenOtherContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitEvaluateWhenPhrase(Cobol85Parser.EvaluateWhenPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExecCicsStatement(Cobol85Parser.ExecCicsStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExecSqlImsStatement(Cobol85Parser.ExecSqlImsStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExecSqlStatement(Cobol85Parser.ExecSqlStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExhibitOperand(Cobol85Parser.ExhibitOperandContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExhibitStatement(Cobol85Parser.ExhibitStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExitStatement(Cobol85Parser.ExitStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitExternalClause(Cobol85Parser.ExternalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFigurativeConstant(Cobol85Parser.FigurativeConstantContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileControlClause(Cobol85Parser.FileControlClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileControlEntry(Cobol85Parser.FileControlEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileControlParagraph(Cobol85Parser.FileControlParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileDescriptionEntry(Cobol85Parser.FileDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileDescriptionEntryClause(Cobol85Parser.FileDescriptionEntryClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileName(Cobol85Parser.FileNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileSection(Cobol85Parser.FileSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFileStatusClause(Cobol85Parser.FileStatusClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFunctionCall(Cobol85Parser.FunctionCallContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitFunctionName(Cobol85Parser.FunctionNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitGenerateStatement(Cobol85Parser.GenerateStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitGlobalClause(Cobol85Parser.GlobalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitGobackStatement(Cobol85Parser.GobackStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitGoToDependingOnStatement(Cobol85Parser.GoToDependingOnStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitGoToStatement(Cobol85Parser.GoToStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitGoToStatementSimple(Cobol85Parser.GoToStatementSimpleContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIdentificationDivision(Cobol85Parser.IdentificationDivisionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIdentificationDivisionBody(Cobol85Parser.IdentificationDivisionBodyContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIdentifier(Cobol85Parser.IdentifierContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIfElse(Cobol85Parser.IfElseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIfStatement(Cobol85Parser.IfStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIfThen(Cobol85Parser.IfThenContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInData(Cobol85Parser.InDataContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIndexName(Cobol85Parser.IndexNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInFile(Cobol85Parser.InFileContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInitializeReplacingBy(Cobol85Parser.InitializeReplacingByContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInitializeReplacingPhrase(Cobol85Parser.InitializeReplacingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInitializeStatement(Cobol85Parser.InitializeStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInitiateStatement(Cobol85Parser.InitiateStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInLibrary(Cobol85Parser.InLibraryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInMnemonic(Cobol85Parser.InMnemonicContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInputOutputSection(Cobol85Parser.InputOutputSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInputOutputSectionParagraph(Cobol85Parser.InputOutputSectionParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInSection(Cobol85Parser.InSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectAllLeading(Cobol85Parser.InspectAllLeadingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectAllLeadings(Cobol85Parser.InspectAllLeadingsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectBeforeAfter(Cobol85Parser.InspectBeforeAfterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectBy(Cobol85Parser.InspectByContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectCharacters(Cobol85Parser.InspectCharactersContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectConvertingPhrase(Cobol85Parser.InspectConvertingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectFor(Cobol85Parser.InspectForContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectReplacingAllLeading(Cobol85Parser.InspectReplacingAllLeadingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectReplacingAllLeadings(Cobol85Parser.InspectReplacingAllLeadingsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectReplacingCharacters(Cobol85Parser.InspectReplacingCharactersContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectReplacingPhrase(Cobol85Parser.InspectReplacingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectStatement(Cobol85Parser.InspectStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectTallyingPhrase(Cobol85Parser.InspectTallyingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectTallyingReplacingPhrase(Cobol85Parser.InspectTallyingReplacingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInspectTo(Cobol85Parser.InspectToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInstallationParagraph(Cobol85Parser.InstallationParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInTable(Cobol85Parser.InTableContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIntegerLiteral(Cobol85Parser.IntegerLiteralContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitInvalidKeyPhrase(Cobol85Parser.InvalidKeyPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIoControlClause(Cobol85Parser.IoControlClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitIoControlParagraph(Cobol85Parser.IoControlParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLabelRecordsClause(Cobol85Parser.LabelRecordsClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLanguageName(Cobol85Parser.LanguageNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLength(Cobol85Parser.LengthContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryAttributeClauseFormat1(Cobol85Parser.LibraryAttributeClauseFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryAttributeClauseFormat2(Cobol85Parser.LibraryAttributeClauseFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryAttributeFunction(Cobol85Parser.LibraryAttributeFunctionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryAttributeParameter(Cobol85Parser.LibraryAttributeParameterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryAttributeTitle(Cobol85Parser.LibraryAttributeTitleContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryDescriptionEntry(Cobol85Parser.LibraryDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryDescriptionEntryFormat1(Cobol85Parser.LibraryDescriptionEntryFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryDescriptionEntryFormat2(Cobol85Parser.LibraryDescriptionEntryFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureClauseFormat1(Cobol85Parser.LibraryEntryProcedureClauseFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureClauseFormat2(Cobol85Parser.LibraryEntryProcedureClauseFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureForClause(Cobol85Parser.LibraryEntryProcedureForClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureGivingClause(Cobol85Parser.LibraryEntryProcedureGivingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureUsingClause(Cobol85Parser.LibraryEntryProcedureUsingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureUsingName(Cobol85Parser.LibraryEntryProcedureUsingNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureWithClause(Cobol85Parser.LibraryEntryProcedureWithClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryEntryProcedureWithName(Cobol85Parser.LibraryEntryProcedureWithNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryIsCommonClause(Cobol85Parser.LibraryIsCommonClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryIsGlobalClause(Cobol85Parser.LibraryIsGlobalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLibraryName(Cobol85Parser.LibraryNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLinageAt(Cobol85Parser.LinageAtContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLinageClause(Cobol85Parser.LinageClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLinageFootingAt(Cobol85Parser.LinageFootingAtContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLinageLinesAtBottom(Cobol85Parser.LinageLinesAtBottomContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLinageLinesAtTop(Cobol85Parser.LinageLinesAtTopContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLinkageSection(Cobol85Parser.LinkageSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLiteral(Cobol85Parser.LiteralContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLocalName(Cobol85Parser.LocalNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitLocalStorageSection(Cobol85Parser.LocalStorageSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMemorySizeClause(Cobol85Parser.MemorySizeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeCollatingAlphanumeric(Cobol85Parser.MergeCollatingAlphanumericContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeCollatingNational(Cobol85Parser.MergeCollatingNationalContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeCollatingSequencePhrase(Cobol85Parser.MergeCollatingSequencePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeGiving(Cobol85Parser.MergeGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeGivingPhrase(Cobol85Parser.MergeGivingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeOnKeyClause(Cobol85Parser.MergeOnKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeOutputProcedurePhrase(Cobol85Parser.MergeOutputProcedurePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeOutputThrough(Cobol85Parser.MergeOutputThroughContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeStatement(Cobol85Parser.MergeStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMergeUsing(Cobol85Parser.MergeUsingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMessageCountClause(Cobol85Parser.MessageCountClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMessageDateClause(Cobol85Parser.MessageDateClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMessageTimeClause(Cobol85Parser.MessageTimeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMnemonicName(Cobol85Parser.MnemonicNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitModeStatement(Cobol85Parser.ModeStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMoveCorrespondingToSendingArea(Cobol85Parser.MoveCorrespondingToSendingAreaContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMoveCorrespondingToStatement(Cobol85Parser.MoveCorrespondingToStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMoveStatement(Cobol85Parser.MoveStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMoveToSendingArea(Cobol85Parser.MoveToSendingAreaContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMoveToStatement(Cobol85Parser.MoveToStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultDiv(Cobol85Parser.MultDivContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultDivs(Cobol85Parser.MultDivsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultipleFileClause(Cobol85Parser.MultipleFileClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultipleFilePosition(Cobol85Parser.MultipleFilePositionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultiplyGiving(Cobol85Parser.MultiplyGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultiplyGivingOperand(Cobol85Parser.MultiplyGivingOperandContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultiplyGivingResult(Cobol85Parser.MultiplyGivingResultContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultiplyRegular(Cobol85Parser.MultiplyRegularContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultiplyRegularOperand(Cobol85Parser.MultiplyRegularOperandContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitMultiplyStatement(Cobol85Parser.MultiplyStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitNotAtEndPhrase(Cobol85Parser.NotAtEndPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitNotInvalidKeyPhrase(Cobol85Parser.NotInvalidKeyPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitNotOnExceptionClause(Cobol85Parser.NotOnExceptionClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitNotOnOverflowPhrase(Cobol85Parser.NotOnOverflowPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitNotOnSizeErrorPhrase(Cobol85Parser.NotOnSizeErrorPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitNumericLiteral(Cobol85Parser.NumericLiteralContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitObjectComputerClause(Cobol85Parser.ObjectComputerClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitObjectComputerParagraph(Cobol85Parser.ObjectComputerParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOdtClause(Cobol85Parser.OdtClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOnExceptionClause(Cobol85Parser.OnExceptionClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOnOverflowPhrase(Cobol85Parser.OnOverflowPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOnSizeErrorPhrase(Cobol85Parser.OnSizeErrorPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenExtendStatement(Cobol85Parser.OpenExtendStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenInput(Cobol85Parser.OpenInputContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenInputStatement(Cobol85Parser.OpenInputStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenIOStatement(Cobol85Parser.OpenIOStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenOutput(Cobol85Parser.OpenOutputContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenOutputStatement(Cobol85Parser.OpenOutputStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOpenStatement(Cobol85Parser.OpenStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitOrganizationClause(Cobol85Parser.OrganizationClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPaddingCharacterClause(Cobol85Parser.PaddingCharacterClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitParagraph(Cobol85Parser.ParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitParagraphName(Cobol85Parser.ParagraphNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitParagraphs(Cobol85Parser.ParagraphsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPasswordClause(Cobol85Parser.PasswordClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformAfter(Cobol85Parser.PerformAfterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformBy(Cobol85Parser.PerformByContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformFrom(Cobol85Parser.PerformFromContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformInlineStatement(Cobol85Parser.PerformInlineStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformProcedureStatement(Cobol85Parser.PerformProcedureStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformStatement(Cobol85Parser.PerformStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformTestClause(Cobol85Parser.PerformTestClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformTimes(Cobol85Parser.PerformTimesContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformType(Cobol85Parser.PerformTypeContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformUntil(Cobol85Parser.PerformUntilContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformVarying(Cobol85Parser.PerformVaryingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformVaryingClause(Cobol85Parser.PerformVaryingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPerformVaryingPhrase(Cobol85Parser.PerformVaryingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPictureCardinality(Cobol85Parser.PictureCardinalityContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPictureChars(Cobol85Parser.PictureCharsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPictureString(Cobol85Parser.PictureStringContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPlusMinus(Cobol85Parser.PlusMinusContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPower(Cobol85Parser.PowerContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPowers(Cobol85Parser.PowersContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDeclarative(Cobol85Parser.ProcedureDeclarativeContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDeclaratives(Cobol85Parser.ProcedureDeclarativesContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivision(Cobol85Parser.ProcedureDivisionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionBody(Cobol85Parser.ProcedureDivisionBodyContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionByReference(Cobol85Parser.ProcedureDivisionByReferenceContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionByReferencePhrase(Cobol85Parser.ProcedureDivisionByReferencePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionByValue(Cobol85Parser.ProcedureDivisionByValueContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionByValuePhrase(Cobol85Parser.ProcedureDivisionByValuePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionGivingClause(Cobol85Parser.ProcedureDivisionGivingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionUsingClause(Cobol85Parser.ProcedureDivisionUsingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureDivisionUsingParameter(Cobol85Parser.ProcedureDivisionUsingParameterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureName(Cobol85Parser.ProcedureNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureSection(Cobol85Parser.ProcedureSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProcedureSectionHeader(Cobol85Parser.ProcedureSectionHeaderContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProgramIdParagraph(Cobol85Parser.ProgramIdParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProgramLibrarySection(Cobol85Parser.ProgramLibrarySectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProgramName(Cobol85Parser.ProgramNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitProgramUnit(Cobol85Parser.ProgramUnitContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitPurgeStatement(Cobol85Parser.PurgeStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitQualifiedDataName(Cobol85Parser.QualifiedDataNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitQualifiedDataNameFormat1(Cobol85Parser.QualifiedDataNameFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitQualifiedDataNameFormat2(Cobol85Parser.QualifiedDataNameFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitQualifiedDataNameFormat3(Cobol85Parser.QualifiedDataNameFormat3Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitQualifiedDataNameFormat4(Cobol85Parser.QualifiedDataNameFormat4Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitQualifiedInData(Cobol85Parser.QualifiedInDataContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReadInto(Cobol85Parser.ReadIntoContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReadKey(Cobol85Parser.ReadKeyContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReadStatement(Cobol85Parser.ReadStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReadWith(Cobol85Parser.ReadWithContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveBefore(Cobol85Parser.ReceiveBeforeContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveFrom(Cobol85Parser.ReceiveFromContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveFromStatement(Cobol85Parser.ReceiveFromStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveIntoStatement(Cobol85Parser.ReceiveIntoStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveNoData(Cobol85Parser.ReceiveNoDataContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveSize(Cobol85Parser.ReceiveSizeContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveStatement(Cobol85Parser.ReceiveStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveStatus(Cobol85Parser.ReceiveStatusContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveThread(Cobol85Parser.ReceiveThreadContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveWith(Cobol85Parser.ReceiveWithContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReceiveWithData(Cobol85Parser.ReceiveWithDataContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordContainsClause(Cobol85Parser.RecordContainsClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordContainsClauseFormat1(Cobol85Parser.RecordContainsClauseFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordContainsClauseFormat2(Cobol85Parser.RecordContainsClauseFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordContainsClauseFormat3(Cobol85Parser.RecordContainsClauseFormat3Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordContainsTo(Cobol85Parser.RecordContainsToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordDelimiterClause(Cobol85Parser.RecordDelimiterClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordingModeClause(Cobol85Parser.RecordingModeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordKeyClause(Cobol85Parser.RecordKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRecordName(Cobol85Parser.RecordNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReferenceModifier(Cobol85Parser.ReferenceModifierContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelationalOperator(Cobol85Parser.RelationalOperatorContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelationArithmeticComparison(Cobol85Parser.RelationArithmeticComparisonContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelationCombinedComparison(Cobol85Parser.RelationCombinedComparisonContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelationCombinedCondition(Cobol85Parser.RelationCombinedConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelationCondition(Cobol85Parser.RelationConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelationSignCondition(Cobol85Parser.RelationSignConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRelativeKeyClause(Cobol85Parser.RelativeKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReleaseStatement(Cobol85Parser.ReleaseStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRemarksParagraph(Cobol85Parser.RemarksParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportClause(Cobol85Parser.ReportClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescription(Cobol85Parser.ReportDescriptionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionEntry(Cobol85Parser.ReportDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionFirstDetailClause(Cobol85Parser.ReportDescriptionFirstDetailClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionFootingClause(Cobol85Parser.ReportDescriptionFootingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionGlobalClause(Cobol85Parser.ReportDescriptionGlobalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionHeadingClause(Cobol85Parser.ReportDescriptionHeadingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionLastDetailClause(Cobol85Parser.ReportDescriptionLastDetailClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportDescriptionPageLimitClause(Cobol85Parser.ReportDescriptionPageLimitClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupBlankWhenZeroClause(Cobol85Parser.ReportGroupBlankWhenZeroClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupColumnNumberClause(Cobol85Parser.ReportGroupColumnNumberClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupDescriptionEntry(Cobol85Parser.ReportGroupDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupDescriptionEntryFormat1(Cobol85Parser.ReportGroupDescriptionEntryFormat1Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupDescriptionEntryFormat2(Cobol85Parser.ReportGroupDescriptionEntryFormat2Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupDescriptionEntryFormat3(Cobol85Parser.ReportGroupDescriptionEntryFormat3Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupIndicateClause(Cobol85Parser.ReportGroupIndicateClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupJustifiedClause(Cobol85Parser.ReportGroupJustifiedClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupLineNumberClause(Cobol85Parser.ReportGroupLineNumberClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupLineNumberNextPage(Cobol85Parser.ReportGroupLineNumberNextPageContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupLineNumberPlus(Cobol85Parser.ReportGroupLineNumberPlusContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupNextGroupClause(Cobol85Parser.ReportGroupNextGroupClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupNextGroupNextPage(Cobol85Parser.ReportGroupNextGroupNextPageContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupNextGroupPlus(Cobol85Parser.ReportGroupNextGroupPlusContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupPictureClause(Cobol85Parser.ReportGroupPictureClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupResetClause(Cobol85Parser.ReportGroupResetClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupSignClause(Cobol85Parser.ReportGroupSignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupSourceClause(Cobol85Parser.ReportGroupSourceClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupSumClause(Cobol85Parser.ReportGroupSumClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypeClause(Cobol85Parser.ReportGroupTypeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypeControlFooting(Cobol85Parser.ReportGroupTypeControlFootingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypeControlHeading(Cobol85Parser.ReportGroupTypeControlHeadingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypeDetail(Cobol85Parser.ReportGroupTypeDetailContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypePageFooting(Cobol85Parser.ReportGroupTypePageFootingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypePageHeading(Cobol85Parser.ReportGroupTypePageHeadingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypeReportFooting(Cobol85Parser.ReportGroupTypeReportFootingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupTypeReportHeading(Cobol85Parser.ReportGroupTypeReportHeadingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupUsageClause(Cobol85Parser.ReportGroupUsageClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportGroupValueClause(Cobol85Parser.ReportGroupValueClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportName(Cobol85Parser.ReportNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReportSection(Cobol85Parser.ReportSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRerunClause(Cobol85Parser.RerunClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRerunEveryClock(Cobol85Parser.RerunEveryClockContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRerunEveryOf(Cobol85Parser.RerunEveryOfContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRerunEveryRecords(Cobol85Parser.RerunEveryRecordsContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReserveClause(Cobol85Parser.ReserveClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReserveNetworkClause(Cobol85Parser.ReserveNetworkClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReturnInto(Cobol85Parser.ReturnIntoContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitReturnStatement(Cobol85Parser.ReturnStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRewriteFrom(Cobol85Parser.RewriteFromContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRewriteStatement(Cobol85Parser.RewriteStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitRoutineName(Cobol85Parser.RoutineNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSameClause(Cobol85Parser.SameClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionAutoClause(Cobol85Parser.ScreenDescriptionAutoClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionBackgroundColorClause(Cobol85Parser.ScreenDescriptionBackgroundColorClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionBellClause(Cobol85Parser.ScreenDescriptionBellClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionBlankClause(Cobol85Parser.ScreenDescriptionBlankClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionBlankWhenZeroClause(Cobol85Parser.ScreenDescriptionBlankWhenZeroClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionBlinkClause(Cobol85Parser.ScreenDescriptionBlinkClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionColumnClause(Cobol85Parser.ScreenDescriptionColumnClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionControlClause(Cobol85Parser.ScreenDescriptionControlClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionEntry(Cobol85Parser.ScreenDescriptionEntryContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionEraseClause(Cobol85Parser.ScreenDescriptionEraseClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionForegroundColorClause(Cobol85Parser.ScreenDescriptionForegroundColorClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionFromClause(Cobol85Parser.ScreenDescriptionFromClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionFullClause(Cobol85Parser.ScreenDescriptionFullClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionGridClause(Cobol85Parser.ScreenDescriptionGridClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionJustifiedClause(Cobol85Parser.ScreenDescriptionJustifiedClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionLightClause(Cobol85Parser.ScreenDescriptionLightClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionLineClause(Cobol85Parser.ScreenDescriptionLineClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionPictureClause(Cobol85Parser.ScreenDescriptionPictureClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionPromptClause(Cobol85Parser.ScreenDescriptionPromptClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionPromptOccursClause(Cobol85Parser.ScreenDescriptionPromptOccursClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionRequiredClause(Cobol85Parser.ScreenDescriptionRequiredClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionReverseVideoClause(Cobol85Parser.ScreenDescriptionReverseVideoClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionSecureClause(Cobol85Parser.ScreenDescriptionSecureClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionSignClause(Cobol85Parser.ScreenDescriptionSignClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionSizeClause(Cobol85Parser.ScreenDescriptionSizeClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionToClause(Cobol85Parser.ScreenDescriptionToClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionUnderlineClause(Cobol85Parser.ScreenDescriptionUnderlineClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionUsageClause(Cobol85Parser.ScreenDescriptionUsageClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionUsingClause(Cobol85Parser.ScreenDescriptionUsingClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionValueClause(Cobol85Parser.ScreenDescriptionValueClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenDescriptionZeroFillClause(Cobol85Parser.ScreenDescriptionZeroFillClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenName(Cobol85Parser.ScreenNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitScreenSection(Cobol85Parser.ScreenSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSearchStatement(Cobol85Parser.SearchStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSearchVarying(Cobol85Parser.SearchVaryingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSearchWhen(Cobol85Parser.SearchWhenContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSectionName(Cobol85Parser.SectionNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSecurityParagraph(Cobol85Parser.SecurityParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSegmentLimitClause(Cobol85Parser.SegmentLimitClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSelectClause(Cobol85Parser.SelectClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendAdvancingLines(Cobol85Parser.SendAdvancingLinesContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendAdvancingMnemonic(Cobol85Parser.SendAdvancingMnemonicContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendAdvancingPage(Cobol85Parser.SendAdvancingPageContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendAdvancingPhrase(Cobol85Parser.SendAdvancingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendFromPhrase(Cobol85Parser.SendFromPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendReplacingPhrase(Cobol85Parser.SendReplacingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendStatement(Cobol85Parser.SendStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendStatementAsync(Cobol85Parser.SendStatementAsyncContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendStatementSync(Cobol85Parser.SendStatementSyncContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSendWithPhrase(Cobol85Parser.SendWithPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSentence(Cobol85Parser.SentenceContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSetByValue(Cobol85Parser.SetByValueContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSetStatement(Cobol85Parser.SetStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSetTo(Cobol85Parser.SetToContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSetToStatement(Cobol85Parser.SetToStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSetToValue(Cobol85Parser.SetToValueContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSetUpDownByStatement(Cobol85Parser.SetUpDownByStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSimpleCondition(Cobol85Parser.SimpleConditionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortCollatingAlphanumeric(Cobol85Parser.SortCollatingAlphanumericContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortCollatingNational(Cobol85Parser.SortCollatingNationalContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortCollatingSequencePhrase(Cobol85Parser.SortCollatingSequencePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortDuplicatesPhrase(Cobol85Parser.SortDuplicatesPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortGiving(Cobol85Parser.SortGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortGivingPhrase(Cobol85Parser.SortGivingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortInputProcedurePhrase(Cobol85Parser.SortInputProcedurePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortInputThrough(Cobol85Parser.SortInputThroughContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortOnKeyClause(Cobol85Parser.SortOnKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortOutputProcedurePhrase(Cobol85Parser.SortOutputProcedurePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortOutputThrough(Cobol85Parser.SortOutputThroughContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortStatement(Cobol85Parser.SortStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSortUsing(Cobol85Parser.SortUsingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSourceComputerParagraph(Cobol85Parser.SourceComputerParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSpecialNameClause(Cobol85Parser.SpecialNameClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSpecialNamesParagraph(Cobol85Parser.SpecialNamesParagraphContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSpecialRegister(Cobol85Parser.SpecialRegisterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStartKey(Cobol85Parser.StartKeyContext context){
            
            throw new NotImplementedException();

        }


        object ICobol85Visitor<object>.VisitStartStatement(Cobol85Parser.StartStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStatement(Cobol85Parser.StatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStatusKeyClause(Cobol85Parser.StatusKeyClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStopStatement(Cobol85Parser.StopStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringDelimitedByPhrase(Cobol85Parser.StringDelimitedByPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringForPhrase(Cobol85Parser.StringForPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringIntoPhrase(Cobol85Parser.StringIntoPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringSending(Cobol85Parser.StringSendingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringSendingPhrase(Cobol85Parser.StringSendingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringStatement(Cobol85Parser.StringStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitStringWithPointerPhrase(Cobol85Parser.StringWithPointerPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubscript_(Cobol85Parser.Subscript_Context context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractCorrespondingStatement(Cobol85Parser.SubtractCorrespondingStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractFromGivingStatement(Cobol85Parser.SubtractFromGivingStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractFromStatement(Cobol85Parser.SubtractFromStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractGiving(Cobol85Parser.SubtractGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractMinuend(Cobol85Parser.SubtractMinuendContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractMinuendCorresponding(Cobol85Parser.SubtractMinuendCorrespondingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractMinuendGiving(Cobol85Parser.SubtractMinuendGivingContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractStatement(Cobol85Parser.SubtractStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSubtractSubtrahend(Cobol85Parser.SubtractSubtrahendContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicCharacter(Cobol85Parser.SymbolicCharacterContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicCharacters(Cobol85Parser.SymbolicCharactersContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicCharactersClause(Cobol85Parser.SymbolicCharactersClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicDestinationClause(Cobol85Parser.SymbolicDestinationClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicQueueClause(Cobol85Parser.SymbolicQueueClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicSourceClause(Cobol85Parser.SymbolicSourceClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicSubQueueClause(Cobol85Parser.SymbolicSubQueueClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSymbolicTerminalClause(Cobol85Parser.SymbolicTerminalClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitSystemName(Cobol85Parser.SystemNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitTableCall(Cobol85Parser.TableCallContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitTerminateStatement(Cobol85Parser.TerminateStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitTextLengthClause(Cobol85Parser.TextLengthClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitTextName(Cobol85Parser.TextNameContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringCountIn(Cobol85Parser.UnstringCountInContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringDelimitedByPhrase(Cobol85Parser.UnstringDelimitedByPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringDelimiterIn(Cobol85Parser.UnstringDelimiterInContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringInto(Cobol85Parser.UnstringIntoContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringIntoPhrase(Cobol85Parser.UnstringIntoPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringOrAllPhrase(Cobol85Parser.UnstringOrAllPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringSendingPhrase(Cobol85Parser.UnstringSendingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringStatement(Cobol85Parser.UnstringStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringTallyingPhrase(Cobol85Parser.UnstringTallyingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUnstringWithPointerPhrase(Cobol85Parser.UnstringWithPointerPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUseAfterClause(Cobol85Parser.UseAfterClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUseAfterOn(Cobol85Parser.UseAfterOnContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUseDebugClause(Cobol85Parser.UseDebugClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUseDebugOn(Cobol85Parser.UseDebugOnContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitUseStatement(Cobol85Parser.UseStatementContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitValueOfClause(Cobol85Parser.ValueOfClauseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitValuePair(Cobol85Parser.ValuePairContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWorkingStorageSection(Cobol85Parser.WorkingStorageSectionContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteAdvancingLines(Cobol85Parser.WriteAdvancingLinesContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteAdvancingMnemonic(Cobol85Parser.WriteAdvancingMnemonicContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteAdvancingPage(Cobol85Parser.WriteAdvancingPageContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteAdvancingPhrase(Cobol85Parser.WriteAdvancingPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteAtEndOfPagePhrase(Cobol85Parser.WriteAtEndOfPagePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteFromPhrase(Cobol85Parser.WriteFromPhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteNotAtEndOfPagePhrase(Cobol85Parser.WriteNotAtEndOfPagePhraseContext context)
        {
            throw new NotImplementedException();
        }

        object ICobol85Visitor<object>.VisitWriteStatement(Cobol85Parser.WriteStatementContext context)
        {
            throw new NotImplementedException();
        }
    }
}