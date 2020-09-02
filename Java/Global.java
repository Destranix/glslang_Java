package Java;

import java.io.OutputStream;

import Java.Main.Void_BytearrayIntBytearray;
import Java.Main.Void_BytearrayReachReasonBytearray;

public class Global {

	public static Version GetVersion() {
		return PointerBoundObject.fromPtr(Main.GetVersion(), Version.class);
	}

	public static String GetEsslVersionString() {
		return Main.GetEsslVersionString();
	}

	public static String GetGlslVersionString() {
		return Main.GetGlslVersionString();
	}

	public static int GetKhronosToolId() {
		return Main.GetKhronosToolId();
	}

	public static boolean InitializeProcess() {
		return Main.InitializeProcess();
	}

	public static void FinalizeProcess() {
		Main.FinalizeProcess();
	}

	public static TCompiler ConstructCompiler(EShLanguage l, int i) {
		return PointerBoundObject.fromPtr(Main.ConstructCompiler(l, i), TCompiler.class);
	}

	public static TShHandleBase ConstructLinker(EShExecutable e, int i) {
		return PointerBoundObject.fromPtr(Main.ConstructLinker(e, i), TShHandleBase.class);
	}

	public static TShHandleBase ConstructBindings() {
		return PointerBoundObject.fromPtr(Main.ConstructBindings(), TShHandleBase.class);
	}

	public static void DeleteLinker(TShHandleBase linker) {
		Main.DeleteLinker(linker.getPtr());
	}

	public static void DeleteBindingList(TShHandleBase bindingList) {
		Main.DeleteLinker(bindingList.getPtr());
	}

	public static TUniformMap ConstructUniformMap() {
		return PointerBoundObject.fromPtr(Main.ConstructUniformMap(), TUniformMap.class);
	}

	public static void DeleteCompiler(TCompiler compiler) {
		Main.DeleteLinker(compiler.getPtr());
	}

	public static void DeleteUniformMap(TUniformMap uniformMap) {
		Main.DeleteLinker(uniformMap.getPtr());
	}

	public static String GetStorageQualifierString(TStorageQualifier q) {
		return Main.GetStorageQualifierString(q);
	}

	public static String GetPrecisionQualifierString(TPrecisionQualifier p) {
		return Main.GetPrecisionQualifierString(p);
	}

	public static String GetBuiltInVariableString(TBuiltInVariable v) {
		return Main.GetBuiltInVariableString(v);
	}

	public static boolean isTypeSignedInt(TBasicType type) {
		return Main.isTypeSignedInt(type.getConstant());
	}

	public static boolean isTypeUnsignedInt(TBasicType type) {
		return Main.isTypeUnsignedInt(type);
	}

	public static boolean isTypeInt(TBasicType type) {
		return Main.isTypeInt(type);
	}

	public static boolean isTypeFloat(TBasicType type) {
		return Main.isTypeFloat(type);
	}

	public static int getTypeRank(TBasicType type) {
		return Main.getTypeRank(type);
	}

	public static TPoolAllocator GetThreadPoolAllocator() {
		return PointerBoundObject.fromPtr(Main.GetThreadPoolAllocator(), TPoolAllocator.class);
	}

	public static void SetThreadPoolAllocator(TPoolAllocator poolAllocator) {
		Main.SetThreadPoolAllocator(poolAllocator.getPtr());
	}

	public static boolean IsAnonymous(String name) {
		return Main.IsAnonymous(name);
	}

	public static void RemoveAllTreeNodes(TIntermNode node) {
		Main.RemoveAllTreeNodes(node.getPtr());
	}

	public static void PropagateNoContraction(TIntermediate intermediate) {
		Main.PropagateNoContraction(intermediate.getPtr());
	}

	public static boolean SameSpecializationConstants(TIntermTyped node1, TIntermTyped node2) {
		return Main.SameSpecializationConstants(node1.getPtr(), node2.getPtr());
	}

	public static String ProfileName(EProfile profile) {
		return Main.ProfileName(profile);
	}

	public static PointerBoundObject Min(PointerBoundObject a, PointerBoundObject b) {
		return PointerBoundObject.fromPtrUndefined(Main.Min(a.getPtr(), b.getPtr()));
	}

	public static PointerBoundObject Max(PointerBoundObject a, PointerBoundObject b) {
		return PointerBoundObject.fromPtrUndefined(Main.Max(a.getPtr(), b.getPtr()));
	}

	public static String String(int i) {
		return Main.String(i);
	}

	public static String String(int i, int base) {
		return Main.String(i, base);
	}

	public static int getLastErrorCode() {
		return Main.getLastErrorCode();
	}

	public static String getLastErrorString() {
		return Main.getLastErrorString();
	}

	public static String getErrorStringFromCode(int code) {
		return Main.getErrorStringFromCode(code);
	}

	public static void GetSpirvVersion(String[] s) {
		Main.GetSpirvVersion(s);
	}

	public static int GetSpirvGeneratorVersion() {
		return Main.GetSpirvGeneratorVersion();
	}

	public static void GlslangToSpv(TIntermediate intermediate, long[][] spirv) {
		Main.GlslangToSpv(intermediate.getPtr(), spirv);
	}

	public static void GlslangToSpv(TIntermediate intermediate, long[][] spirv, SpvOptions options) {
		Main.GlslangToSpv(intermediate.getPtr(), spirv, options.getPtr());
	}

	public static void GlslangToSpvLogger(TIntermediate intermediate, long[][] spirv, SpvBuildLogger logger) {
		Main.GlslangToSpv(intermediate.getPtr(), spirv, logger.getPtr());
	}

	public static void GlslangToSpv(TIntermediate intermediate, long[][] spirv, SpvBuildLogger logger, SpvOptions options) {
		Main.GlslangToSpv(intermediate.getPtr(), spirv, logger.getPtr(), options.getPtr());
	}

	public static void OutputSpvBin(long[] spirv, String baseName) {
		Main.OutputSpvBin(spirv, baseName);
	}

	public static void OutputSpvHex(long[] spirv, String baseName, String varName) {
		Main.OutputSpvHex(spirv, baseName, varName);
	}

	public static void SpirvToolsDisassemble(OutputStream out, long[] spirv) {
		Main.SpirvToolsDisassemble(out, spirv);
	}

	public static void SpirvToolsValidate(TIntermediate intermediate, long[] spirv, SpvBuildLogger logger,
			boolean prelegalization) {
		Main.SpirvToolsValidate(intermediate.getPtr(), spirv, logger.getPtr(), prelegalization);
	}

	public static void SpirvToolsTransform(TIntermediate intermediate, long[] spirv, SpvBuildLogger logger,
			SpvOptions options) {
		Main.SpirvToolsTransform(intermediate.getPtr(), spirv, logger.getPtr(), options.getPtr());
	}

	public static void SpirvToolsStripDebugInfo(TIntermediate intermediate, long[] spirv, SpvBuildLogger logger) {
		Main.SpirvToolsStripDebugInfo(intermediate.getPtr(), spirv, logger.getPtr());
	}

	public static byte[] BitwiseCast(byte[] source) {
		return Main.BitwiseCast(source);
	}

	public static void Disassemble(OutputStream out, long[] spirv) {
		Main.Disassemble(out, spirv);
	}

	public static void Parameterize() {
		Main.Parameterize();
	}

	public static String SourceString(int v) {
		return Main.SourceString(v);
	}

	public static String AddressingString(int v) {
		return Main.AddressingString(v);
	}

	public static String MemoryString(int v) {
		return Main.MemoryString(v);
	}

	public static String ExecutionModelString(int v) {
		return Main.ExecutionModelString(v);
	}

	public static String ExecutionModeString(int v) {
		return Main.ExecutionModeString(v);
	}

	public static String StorageClassString(int v) {
		return Main.StorageClassString(v);
	}

	public static String DecorationString(int v) {
		return Main.DecorationString(v);
	}

	public static String BuiltInString(int v) {
		return Main.BuiltInString(v);
	}

	public static String DimensionString(int v) {
		return Main.DimensionString(v);
	}

	public static String SelectControlString(int v) {
		return Main.SelectControlString(v);
	}

	public static String LoopControlString(int v) {
		return Main.LoopControlString(v);
	}

	public static String FunctionControlString(int v) {
		return Main.FunctionControlString(v);
	}

	public static String SamplerAddressingModeString(int v) {
		return Main.SamplerAddressingModeString(v);
	}

	public static String SamplerFilterModeString(int v) {
		return Main.SamplerFilterModeString(v);
	}

	public static String ImageFormatString(int v) {
		return Main.ImageFormatString(v);
	}

	public static String ImageChannelOrderString(int v) {
		return Main.ImageChannelOrderString(v);
	}

	public static String ImageChannelTypeString(int v) {
		return Main.ImageChannelTypeString(v);
	}

	public static String ImageChannelDataTypeString(int type) {
		return Main.ImageChannelDataTypeString(type);
	}

	public static String ImageOperandsString(int format) {
		return Main.ImageOperandsString(format);
	}

	public static String ImageOperands(int v) {
		return Main.ImageOperands(v);
	}

	public static String FPFastMathString(int v) {
		return Main.FPFastMathString(v);
	}

	public static String FPRoundingModeString(int v) {
		return Main.FPRoundingModeString(v);
	}

	public static String LinkageTypeString(int v) {
		return Main.LinkageTypeString(v);
	}

	public static String FuncParamAttrString(int v) {
		return Main.FuncParamAttrString(v);
	}

	public static String AccessQualifierString(int v) {
		return Main.AccessQualifierString(v);
	}

	public static String MemorySemanticsString(int v) {
		return Main.MemorySemanticsString(v);
	}

	public static String MemoryAccessString(int v) {
		return Main.MemoryAccessString(v);
	}

	public static String ExecutionScopeString(int v) {
		return Main.ExecutionScopeString(v);
	}

	public static String GroupOperationString(int v) {
		return Main.GroupOperationString(v);
	}

	public static String KernelEnqueueFlagsString(int v) {
		return Main.KernelEnqueueFlagsString(v);
	}

	public static String KernelProfilingInfoString(int v) {
		return Main.KernelProfilingInfoString(v);
	}

	public static String CapabilityString(int v) {
		return Main.CapabilityString(v);
	}

	public static String OpcodeString(int v) {
		return Main.OpcodeString(v);
	}

	public static String ScopeString(int mem) {
		return Main.ScopeString(mem);
	}

	public static String GetOperandDesc(OperandClass operand) {
		return Main.GetOperandDesc(operand);
	}

	public static void PrintImmediateRow(int imm, String name, EnumParameters enumParams, boolean caps) {
		Main.PrintImmediateRow(imm, name, enumParams.getPtr(), caps);
	}

	public static void PrintImmediateRow(int imm, String name, EnumParameters enumParams, boolean caps, boolean hex) {
		Main.PrintImmediateRow(imm, name, enumParams.getPtr(), caps, hex);
	}

	public static void PrintOperands(OperandParameters operands, int reservedOperands) {
		Main.PrintOperands(operands.getPtr(), reservedOperands);
	}

	public static void HasResultAndType(Op opcode, boolean[] hasResult, boolean[] hasResultType) {// NOTE:Result will be
																									// stored in boolean
																									// array
		Main.HasResultAndType(opcode.getConstant(), hasResult, hasResultType);
	}

	public static void inReadableOrder(Block root, Void_BytearrayReachReasonBytearray callback) {
		Main.inReadableOrder(root.getPtr(), callback);
	}

	public static void inReadableOrder(Block root, Void_BytearrayIntBytearray callback) {
		Main.inReadableOrder(root.getPtr(), callback);
	}

}
