package com.destranix.glslang;

public class TBuiltInResource extends PointerBoundObject {

	private int[] values;
	private final TLimits limits;
	private final int constructorIndex;

	public TBuiltInResource() {
		this.values = null;
		this.limits = null;
		this.constructorIndex = 0;
		load();
	}

	public TBuiltInResource(Values values, TLimits limits) {
		this.values = values.asIntArray();
		this.limits = limits;
		this.constructorIndex = 1;
		load();
	}

	public TBuiltInResource(int[] values, TLimits limits) {
		this.values = values;
		this.limits = limits;
		this.constructorIndex = 1;
		load();
	}

	protected TBuiltInResource(byte[] ptr) {
		this.ptr = ptr;
		this.values = null;
		this.limits = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TBuiltInResource();
					break;
				case 1:
					ptr = Main.TBuiltInResource(values, limits.getPtr());
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	protected void free_intern() {
		if (ptr != null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
				case 0:
				case 1:
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public static class Values {
		public int maxLights = 32;
		public int maxClipPlanes = 6;
		public int maxTextureUnits = 32;
		public int maxTextureCoords = 32;
		public int maxVertexAttribs = 64;
		public int maxVertexUniformComponents = 4096;
		public int maxVaryingFloats = 64;
		public int maxVertexTextureImageUnits = 32;
		public int maxCombinedTextureImageUnits = 80;
		public int maxTextureImageUnits = 32;
		public int maxFragmentUniformComponents = 4096;
		public int maxDrawBuffers = 32;
		public int maxVertexUniformVectors = 128;
		public int maxVaryingVectors = 8;
		public int maxFragmentUniformVectors = 16;
		public int maxVertexOutputVectors = 16;
		public int maxFragmentInputVectors = 15;
		public int minProgramTexelOffset = -8;
		public int maxProgramTexelOffset = 7;
		public int maxClipDistances = 8;
		public int maxComputeWorkGroupCountX = 65535;
		public int maxComputeWorkGroupCountY = 65535;
		public int maxComputeWorkGroupCountZ = 65535;
		public int maxComputeWorkGroupSizeX = 1024;
		public int maxComputeWorkGroupSizeY = 1024;
		public int maxComputeWorkGroupSizeZ = 64;
		public int maxComputeUniformComponents = 1024;
		public int maxComputeTextureImageUnits = 16;
		public int maxComputeImageUniforms = 8;
		public int maxComputeAtomicCounters = 8;
		public int maxComputeAtomicCounterBuffers = 1;
		public int maxVaryingComponents = 60;
		public int maxVertexOutputComponents = 64;
		public int maxGeometryInputComponents = 64;
		public int maxGeometryOutputComponents = 128;
		public int maxFragmentInputComponents = 128;
		public int maxImageUnits = 8;
		public int maxCombinedImageUnitsAndFragmentOutputs = 8;
		public int maxCombinedShaderOutputResources = 8;
		public int maxImageSamples = 0;
		public int maxVertexImageUniforms = 0;
		public int maxTessControlImageUniforms = 0;
		public int maxTessEvaluationImageUniforms = 0;
		public int maxGeometryImageUniforms = 0;
		public int maxFragmentImageUniforms = 8;
		public int maxCombinedImageUniforms = 8;
		public int maxGeometryTextureImageUnits = 16;
		public int maxGeometryOutputVertices = 256;
		public int maxGeometryTotalOutputComponents = 1024;
		public int maxGeometryUniformComponents = 1024;
		public int maxGeometryVaryingComponents = 64;
		public int maxTessControlInputComponents = 128;
		public int maxTessControlOutputComponents = 128;
		public int maxTessControlTextureImageUnits = 16;
		public int maxTessControlUniformComponents = 1024;
		public int maxTessControlTotalOutputComponents = 4096;
		public int maxTessEvaluationInputComponents = 128;
		public int maxTessEvaluationOutputComponents = 128;
		public int maxTessEvaluationTextureImageUnits = 16;
		public int maxTessEvaluationUniformComponents = 1024;
		public int maxTessPatchComponents = 120;
		public int maxPatchVertices = 32;
		public int maxTessGenLevel = 64;
		public int maxViewports = 16;
		public int maxVertexAtomicCounters = 0;
		public int maxTessControlAtomicCounters = 0;
		public int maxTessEvaluationAtomicCounters = 0;
		public int maxGeometryAtomicCounters = 0;
		public int maxFragmentAtomicCounters = 8;
		public int maxCombinedAtomicCounters = 8;
		public int maxAtomicCounterBindings = 1;
		public int maxVertexAtomicCounterBuffers = 0;
		public int maxTessControlAtomicCounterBuffers = 0;
		public int maxTessEvaluationAtomicCounterBuffers = 0;
		public int maxGeometryAtomicCounterBuffers = 0;
		public int maxFragmentAtomicCounterBuffers = 1;
		public int maxCombinedAtomicCounterBuffers = 1;
		public int maxAtomicCounterBufferSize = 16384;
		public int maxTransformFeedbackBuffers = 4;
		public int maxTransformFeedbackInterleavedComponents = 64;
		public int maxCullDistances = 8;
		public int maxCombinedClipAndCullDistances = 8;
		public int maxSamples = 4;
		public int maxMeshOutputVerticesNV = 256;
		public int maxMeshOutputPrimitivesNV = 512;
		public int maxMeshWorkGroupSizeX_NV = 32;
		public int maxMeshWorkGroupSizeY_NV = 1;
		public int maxMeshWorkGroupSizeZ_NV = 1;
		public int maxTaskWorkGroupSizeX_NV = 32;
		public int maxTaskWorkGroupSizeY_NV = 1;
		public int maxTaskWorkGroupSizeZ_NV = 1;
		public int maxMeshViewCountNV = 4;
		public int maxDualSourceDrawBuffersEXT = 1;

		public int[] asIntArray() {
			int[] ret = new int[93];
			int i = 0;
			ret[i++] = maxLights;
			ret[i++] = maxClipPlanes;
			ret[i++] = maxTextureUnits;
			ret[i++] = maxTextureCoords;
			ret[i++] = maxVertexAttribs;
			ret[i++] = maxVertexUniformComponents;
			ret[i++] = maxVaryingFloats;
			ret[i++] = maxVertexTextureImageUnits;
			ret[i++] = maxCombinedTextureImageUnits;
			ret[i++] = maxTextureImageUnits;
			ret[i++] = maxFragmentUniformComponents;
			ret[i++] = maxDrawBuffers;
			ret[i++] = maxVertexUniformVectors;
			ret[i++] = maxVaryingVectors;
			ret[i++] = maxFragmentUniformVectors;
			ret[i++] = maxVertexOutputVectors;
			ret[i++] = maxFragmentInputVectors;
			ret[i++] = minProgramTexelOffset;
			ret[i++] = maxProgramTexelOffset;
			ret[i++] = maxClipDistances;
			ret[i++] = maxComputeWorkGroupCountX;
			ret[i++] = maxComputeWorkGroupCountY;
			ret[i++] = maxComputeWorkGroupCountZ;
			ret[i++] = maxComputeWorkGroupSizeX;
			ret[i++] = maxComputeWorkGroupSizeY;
			ret[i++] = maxComputeWorkGroupSizeZ;
			ret[i++] = maxComputeUniformComponents;
			ret[i++] = maxComputeTextureImageUnits;
			ret[i++] = maxComputeImageUniforms;
			ret[i++] = maxComputeAtomicCounters;
			ret[i++] = maxComputeAtomicCounterBuffers;
			ret[i++] = maxVaryingComponents;
			ret[i++] = maxVertexOutputComponents;
			ret[i++] = maxGeometryInputComponents;
			ret[i++] = maxGeometryOutputComponents;
			ret[i++] = maxFragmentInputComponents;
			ret[i++] = maxImageUnits;
			ret[i++] = maxCombinedImageUnitsAndFragmentOutputs;
			ret[i++] = maxCombinedShaderOutputResources;
			ret[i++] = maxImageSamples;
			ret[i++] = maxVertexImageUniforms;
			ret[i++] = maxTessControlImageUniforms;
			ret[i++] = maxTessEvaluationImageUniforms;
			ret[i++] = maxGeometryImageUniforms;
			ret[i++] = maxFragmentImageUniforms;
			ret[i++] = maxCombinedImageUniforms;
			ret[i++] = maxGeometryTextureImageUnits;
			ret[i++] = maxGeometryOutputVertices;
			ret[i++] = maxGeometryTotalOutputComponents;
			ret[i++] = maxGeometryUniformComponents;
			ret[i++] = maxGeometryVaryingComponents;
			ret[i++] = maxTessControlInputComponents;
			ret[i++] = maxTessControlOutputComponents;
			ret[i++] = maxTessControlTextureImageUnits;
			ret[i++] = maxTessControlUniformComponents;
			ret[i++] = maxTessControlTotalOutputComponents;
			ret[i++] = maxTessEvaluationInputComponents;
			ret[i++] = maxTessEvaluationOutputComponents;
			ret[i++] = maxTessEvaluationTextureImageUnits;
			ret[i++] = maxTessEvaluationUniformComponents;
			ret[i++] = maxTessPatchComponents;
			ret[i++] = maxPatchVertices;
			ret[i++] = maxTessGenLevel;
			ret[i++] = maxViewports;
			ret[i++] = maxVertexAtomicCounters;
			ret[i++] = maxTessControlAtomicCounters;
			ret[i++] = maxTessEvaluationAtomicCounters;
			ret[i++] = maxGeometryAtomicCounters;
			ret[i++] = maxFragmentAtomicCounters;
			ret[i++] = maxCombinedAtomicCounters;
			ret[i++] = maxAtomicCounterBindings;
			ret[i++] = maxVertexAtomicCounterBuffers;
			ret[i++] = maxTessControlAtomicCounterBuffers;
			ret[i++] = maxTessEvaluationAtomicCounterBuffers;
			ret[i++] = maxGeometryAtomicCounterBuffers;
			ret[i++] = maxFragmentAtomicCounterBuffers;
			ret[i++] = maxCombinedAtomicCounterBuffers;
			ret[i++] = maxAtomicCounterBufferSize;
			ret[i++] = maxTransformFeedbackBuffers;
			ret[i++] = maxTransformFeedbackInterleavedComponents;
			ret[i++] = maxCullDistances;
			ret[i++] = maxCombinedClipAndCullDistances;
			ret[i++] = maxSamples;
			ret[i++] = maxMeshOutputVerticesNV;
			ret[i++] = maxMeshOutputPrimitivesNV;
			ret[i++] = maxMeshWorkGroupSizeX_NV;
			ret[i++] = maxMeshWorkGroupSizeY_NV;
			ret[i++] = maxMeshWorkGroupSizeZ_NV;
			ret[i++] = maxTaskWorkGroupSizeX_NV;
			ret[i++] = maxTaskWorkGroupSizeY_NV;
			ret[i++] = maxTaskWorkGroupSizeZ_NV;
			ret[i++] = maxMeshViewCountNV;
			ret[i++] = maxDualSourceDrawBuffersEXT;

			return ret;
		}
	}

}
