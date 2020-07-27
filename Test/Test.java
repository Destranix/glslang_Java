package Test;

import static Java.Main.*;

import java.io.IOException;

import Java.EShExecutable;
import Java.EShLanguage;
import Java.EShOptimizationLevel;

public class Test {
	
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
		ShInitialize();
		
		byte[] compilerVertex = ShConstructCompiler(EShLanguage.EShLangVertex, 0);
		byte[] compilerFragment = ShConstructCompiler(EShLanguage.EShLangFragment, 0);
		byte[] linker = ShConstructLinker(EShExecutable.EShExFragment, 0);
		byte[] uniformMap = ShConstructUniformMap();
		
		byte[] limits = TLimits(defaultTLimitsValues);
		byte[] resource = TBuiltInResource(defaultTBuiltInResourceValues, limits);
		
		ShCompile(compilerVertex, new String[]{shaderStringVertex}, EShOptimizationLevel.EShOptNone, resource, 0, 450);
		ShCompile(compilerFragment, new String[]{shaderStringFragment}, EShOptimizationLevel.EShOptNone, resource, 0, 450);
		
		free(resource);
		free(limits);
		
		byte[] compilerArr = createArray(new byte[][]{compilerVertex, compilerFragment});
		
		ShLinkExt(linker, compilerArr, 2);
				
		free(compilerArr);
		
		byte[] executable = ShGetExecutable(linker);
		
		System.out.println("InfoLogs:");
		System.out.println("compilerVertex:");
		System.out.println(ShGetInfoLog(compilerVertex));
		System.out.println("compilerFragment:");
		System.out.println(ShGetInfoLog(compilerFragment));
		System.out.println("linker:");
		System.out.println(ShGetInfoLog(linker));
		System.out.println("uniformMap:");
		System.out.println(ShGetInfoLog(uniformMap));
		
		ShDestruct(uniformMap);
		ShDestruct(linker);
		ShDestruct(compilerFragment);
		ShDestruct(compilerVertex);
		
		ShFinalize();
	}

}
