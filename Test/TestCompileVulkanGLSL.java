package Test;

import static com.destranix.glslang.Main.FinalizeProcess;
import static com.destranix.glslang.Main.InitializeProcess;

import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;

import com.destranix.glslang.EShClient;
import com.destranix.glslang.EShLanguage;
import com.destranix.glslang.EShMessages;
import com.destranix.glslang.EShSource;
import com.destranix.glslang.EShTargetClientVersion;
import com.destranix.glslang.EShTargetLanguage;
import com.destranix.glslang.EShTargetLanguageVersion;
import com.destranix.glslang.Global;
import com.destranix.glslang.PointerBoundObject;
import com.destranix.glslang.SpvBuildLogger;
import com.destranix.glslang.SpvOptions;
import com.destranix.glslang.TBuiltInResource;
import com.destranix.glslang.TLimits;
import com.destranix.glslang.TProgram;
import com.destranix.glslang.TShader;
import com.destranix.glslang.TString;

public class TestCompileVulkanGLSL {
	
	public static final int[] defaultTBuiltInResourceValues = {
			/* .MaxLights = */ 32,
		    /* .MaxClipPlanes = */ 6,
		    /* .MaxTextureUnits = */ 32,
		    /* .MaxTextureCoords = */ 32,
		    /* .MaxVertexAttribs = */ 64,
		    /* .MaxVertexUniformComponents = */ 4096,
		    /* .MaxVaryingFloats = */ 64,
		    /* .MaxVertexTextureImageUnits = */ 32,
		    /* .MaxCombinedTextureImageUnits = */ 80,
		    /* .MaxTextureImageUnits = */ 32,
		    /* .MaxFragmentUniformComponents = */ 4096,
		    /* .MaxDrawBuffers = */ 32,
		    /* .MaxVertexUniformVectors = */ 128,
		    /* .MaxVaryingVectors = */ 8,
		    /* .MaxFragmentUniformVectors = */ 16,
		    /* .MaxVertexOutputVectors = */ 16,
		    /* .MaxFragmentInputVectors = */ 15,
		    /* .MinProgramTexelOffset = */ -8,
		    /* .MaxProgramTexelOffset = */ 7,
		    /* .MaxClipDistances = */ 8,
		    /* .MaxComputeWorkGroupCountX = */ 65535,
		    /* .MaxComputeWorkGroupCountY = */ 65535,
		    /* .MaxComputeWorkGroupCountZ = */ 65535,
		    /* .MaxComputeWorkGroupSizeX = */ 1024,
		    /* .MaxComputeWorkGroupSizeY = */ 1024,
		    /* .MaxComputeWorkGroupSizeZ = */ 64,
		    /* .MaxComputeUniformComponents = */ 1024,
		    /* .MaxComputeTextureImageUnits = */ 16,
		    /* .MaxComputeImageUniforms = */ 8,
		    /* .MaxComputeAtomicCounters = */ 8,
		    /* .MaxComputeAtomicCounterBuffers = */ 1,
		    /* .MaxVaryingComponents = */ 60,
		    /* .MaxVertexOutputComponents = */ 64,
		    /* .MaxGeometryInputComponents = */ 64,
		    /* .MaxGeometryOutputComponents = */ 128,
		    /* .MaxFragmentInputComponents = */ 128,
		    /* .MaxImageUnits = */ 8,
		    /* .MaxCombinedImageUnitsAndFragmentOutputs = */ 8,
		    /* .MaxCombinedShaderOutputResources = */ 8,
		    /* .MaxImageSamples = */ 0,
		    /* .MaxVertexImageUniforms = */ 0,
		    /* .MaxTessControlImageUniforms = */ 0,
		    /* .MaxTessEvaluationImageUniforms = */ 0,
		    /* .MaxGeometryImageUniforms = */ 0,
		    /* .MaxFragmentImageUniforms = */ 8,
		    /* .MaxCombinedImageUniforms = */ 8,
		    /* .MaxGeometryTextureImageUnits = */ 16,
		    /* .MaxGeometryOutputVertices = */ 256,
		    /* .MaxGeometryTotalOutputComponents = */ 1024,
		    /* .MaxGeometryUniformComponents = */ 1024,
		    /* .MaxGeometryVaryingComponents = */ 64,
		    /* .MaxTessControlInputComponents = */ 128,
		    /* .MaxTessControlOutputComponents = */ 128,
		    /* .MaxTessControlTextureImageUnits = */ 16,
		    /* .MaxTessControlUniformComponents = */ 1024,
		    /* .MaxTessControlTotalOutputComponents = */ 4096,
		    /* .MaxTessEvaluationInputComponents = */ 128,
		    /* .MaxTessEvaluationOutputComponents = */ 128,
		    /* .MaxTessEvaluationTextureImageUnits = */ 16,
		    /* .MaxTessEvaluationUniformComponents = */ 1024,
		    /* .MaxTessPatchComponents = */ 120,
		    /* .MaxPatchVertices = */ 32,
		    /* .MaxTessGenLevel = */ 64,
		    /* .MaxViewports = */ 16,
		    /* .MaxVertexAtomicCounters = */ 0,
		    /* .MaxTessControlAtomicCounters = */ 0,
		    /* .MaxTessEvaluationAtomicCounters = */ 0,
		    /* .MaxGeometryAtomicCounters = */ 0,
		    /* .MaxFragmentAtomicCounters = */ 8,
		    /* .MaxCombinedAtomicCounters = */ 8,
		    /* .MaxAtomicCounterBindings = */ 1,
		    /* .MaxVertexAtomicCounterBuffers = */ 0,
		    /* .MaxTessControlAtomicCounterBuffers = */ 0,
		    /* .MaxTessEvaluationAtomicCounterBuffers = */ 0,
		    /* .MaxGeometryAtomicCounterBuffers = */ 0,
		    /* .MaxFragmentAtomicCounterBuffers = */ 1,
		    /* .MaxCombinedAtomicCounterBuffers = */ 1,
		    /* .MaxAtomicCounterBufferSize = */ 16384,
		    /* .MaxTransformFeedbackBuffers = */ 4,
		    /* .MaxTransformFeedbackInterleavedComponents = */ 64,
		    /* .MaxCullDistances = */ 8,
		    /* .MaxCombinedClipAndCullDistances = */ 8,
		    /* .MaxSamples = */ 4,
		    /* .maxMeshOutputVerticesNV = */ 256,
		    /* .maxMeshOutputPrimitivesNV = */ 512,
		    /* .maxMeshWorkGroupSizeX_NV = */ 32,
		    /* .maxMeshWorkGroupSizeY_NV = */ 1,
		    /* .maxMeshWorkGroupSizeZ_NV = */ 1,
		    /* .maxTaskWorkGroupSizeX_NV = */ 32,
		    /* .maxTaskWorkGroupSizeY_NV = */ 1,
		    /* .maxTaskWorkGroupSizeZ_NV = */ 1,
		    /* .maxMeshViewCountNV = */ 4,
		    /* .maxDualSourceDrawBuffersEXT = */ 1
		    };
	public static final boolean[] defaultTLimitsValues = {
				/* .nonInductiveForLoops = */ true,
		        /* .whileLoops = */ true,
		        /* .doWhileLoops = */ true,
		        /* .generalUniformIndexing = */ true,
		        /* .generalAttributeMatrixVectorIndexing = */ true,
		        /* .generalVaryingIndexing = */ true,
		        /* .generalSamplerIndexing = */ true,
		        /* .generalVariableIndexing = */ true,
		        /* .generalConstantMatrixVectorIndexing = */ true
	};
	
	public static final String shaderStringVertex =
			"#version 450\r\n" + 
			"#extension GL_ARB_separate_shader_objects : enable\r\n" + 
			"\r\n" + 
			"layout(location = 0) in vec3 inPosition;\r\n" + 
			"\r\n" + 
			"layout(location = 0) out vec3 outColor;\r\n" + 
			"\r\n" + 
			"void main(){\r\n" + 
			"	gl_Position = vec4(inPosition, 1.0);\r\n" + 
			"	outColor = vec3(1, 0, 0);\r\n" + 
			"}";
	public static final String shaderStringFragment =
			"#version 450\r\n" + 
			"#extension GL_ARB_separate_shader_objects : enable\r\n" + 
			"#extension GL_ARB_shading_language_420pack : enable\r\n" + 
			"\r\n" + 
			"layout(location = 0) in vec3 fragColor;\r\n" + 
			"\r\n" + 
			"layout(location = 0) out vec4 outColor;\r\n" + 
			"\r\n" + 
			"void main(){\r\n" + 
			"	outColor = vec4(fragColor, 1);\r\n" + 
			"}";

	public static void main(String[] args) throws IOException {
		boolean callInitFuncts = true;
		if(args != null &&  Arrays.asList(args).contains("-noCallInitFuncts")){
			callInitFuncts = false;
		}
		if(callInitFuncts){
			InitializeProcess();
		}
		
		System.out.println("Essl version: "+Global.GetEsslVersionString());
		System.out.println("Glsl version: "+Global.GetGlslVersionString());
		
		TShader shaderVertex = new TShader(EShLanguage.EShLangVertex);
		TShader shaderFragment = new TShader(EShLanguage.EShLangFragment);
		
		shaderVertex.setStrings(new String[]{shaderStringVertex});
		shaderFragment.setStrings(new String[]{shaderStringFragment});
		
		shaderVertex.setEnvInput(EShSource.EShSourceGlsl, EShLanguage.EShLangVertex, EShClient.EShClientVulkan, 450);
		shaderFragment.setEnvInput(EShSource.EShSourceGlsl, EShLanguage.EShLangFragment, EShClient.EShClientVulkan, 450);
		
		shaderVertex.setEnvClient(EShClient.EShClientVulkan, EShTargetClientVersion.EShTargetVulkan_1_1);
		shaderFragment.setEnvClient(EShClient.EShClientVulkan, EShTargetClientVersion.EShTargetVulkan_1_1);
		
		shaderVertex.setEnvTarget(EShTargetLanguage.EShTargetSpv, EShTargetLanguageVersion.EShTargetSpv_1_3);
		shaderFragment.setEnvTarget(EShTargetLanguage.EShTargetSpv, EShTargetLanguageVersion.EShTargetSpv_1_3);
		
		TLimits limits = new TLimits(defaultTLimitsValues);
		
		TBuiltInResource resources = new TBuiltInResource(defaultTBuiltInResourceValues, limits);
		
		if(!shaderVertex.parse(resources, 450, true, EnumSet.of(EShMessages.EShMsgDefault))) {throw new AssertionError("Could not parse vertex shader!\r\n"+"Vertex Debuglog:\r\n"+shaderVertex.getInfoLog());};
		
		System.out.println("Vertex Infolog:\r\n"+shaderVertex.getInfoLog());
		
		if(!shaderFragment.parse(resources, 450, true, EnumSet.of(EShMessages.EShMsgDefault))) {throw new AssertionError("Could not parse fragment shader!\r\n"+"Fragment Debuglog:\r\n"+shaderFragment.getInfoLog());};
		
		System.out.println("Fragment Infolog:\r\n"+shaderFragment.getInfoLog());
		
		TProgram program = new TProgram();
		
		program.addShader(shaderVertex);
		program.addShader(shaderFragment);
		
		if(!program.link(EnumSet.of(EShMessages.EShMsgDefault))) {throw new AssertionError("Could not link program!\r\n"+"Program Debuglog:\r\n"+program.getInfoLog());};
		
		System.out.println("Program Infolog:\r\n"+program.getInfoLog());
		
		for(PointerBoundObject ext : program.getIntermediate(EShLanguage.EShLangVertex).getRequestedExtensions()){
			System.out.println(ext.cast(TString.class).asString());
		}
		
		long[][] spirv = new long[1][];
		SpvBuildLogger logger = new SpvBuildLogger();
		SpvOptions options = new SpvOptions();
		options.setGenerateDebugInfo(true);
		
		Global.GlslangToSpv(program.getIntermediate(EShLanguage.EShLangVertex), spirv, logger, options);
		System.out.println(logger.getAllMessages());
		Global.OutputSpvBin(spirv[0], "vert.spv");
		System.out.println("Disassambled vert.spv:");
		Global.SpirvToolsDisassemble(System.out, spirv[0]);
		
		Global.GlslangToSpv(program.getIntermediate(EShLanguage.EShLangFragment), spirv, logger, options);
		System.out.println(logger.getAllMessages());
		Global.OutputSpvBin(spirv[0], "frag.spv");
		System.out.println("Disassambled frag.spv:");
		Global.SpirvToolsDisassemble(System.out, spirv[0]);
		
		
		logger.free();
		options.free();
		
		program.free();
		
		shaderVertex.free();
		shaderFragment.free();
		
		resources.free();
		limits.free();
		
		if(callInitFuncts){
			FinalizeProcess();
		}
		
		
		System.out.println("Test succeeded!");
	}
	
}
