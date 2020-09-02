package Java;

import java.io.OutputStream;
import java.math.BigInteger;
import java.util.EnumSet;

public class Main {

	public static final int E_SH_LANG_VERTEX = 0;
	public static final int E_SH_LANG_TESS_CONTROL = 1;
	public static final int E_SH_LANG_TESS_EVALUATION = 2;
	public static final int E_SH_LANG_GEOMETRY = 3;
	public static final int E_SH_LANG_FRAGMENT = 4;
	public static final int E_SH_LANG_COMPUTE = 5;
	public static final int E_SH_LANG_RAY_GEN = 6;
	public static final int E_SH_LANG_INTERSECT = 7;
	public static final int E_SH_LANG_ANY_HIT = 8;
	public static final int E_SH_LANG_CLOSEST_HIT = 9;
	public static final int E_SH_LANG_MISS = 10;
	public static final int E_SH_LANG_CALLABLE = 11;
	public static final int E_SH_LANG_TASK_NV = 12;
	public static final int E_SH_LANG_MESH_NV = 13;

	public static final int E_SH_LANG_VERTEX_MASK = (1 << E_SH_LANG_VERTEX);
	public static final int E_SH_LANG_TESS_CONTROL_MASK = (1 << E_SH_LANG_TESS_CONTROL);
	public static final int E_SH_LANG_TESS_EVALUATION_MASK = (1 << E_SH_LANG_TESS_EVALUATION);
	public static final int E_SH_LANG_GEOMETRY_MASK = (1 << E_SH_LANG_GEOMETRY);
	public static final int E_SH_LANG_FRAGMENT_MASK = (1 << E_SH_LANG_FRAGMENT);
	public static final int E_SH_LANG_COMPUTE_MASK = (1 << E_SH_LANG_COMPUTE);
	public static final int E_SH_LANG_RAY_GEN_MASK = (1 << E_SH_LANG_RAY_GEN);
	public static final int E_SH_LANG_INTERSECT_MASK = (1 << E_SH_LANG_INTERSECT);
	public static final int E_SH_LANG_ANY_HIT_MASK = (1 << E_SH_LANG_ANY_HIT);
	public static final int E_SH_LANG_CLOSEST_HIT_MASK = (1 << E_SH_LANG_CLOSEST_HIT);
	public static final int E_SH_LANG_MISS_MASK = (1 << E_SH_LANG_MISS);
	public static final int E_SH_LANG_CALLABLE_MASK = (1 << E_SH_LANG_CALLABLE);
	public static final int E_SH_LANG_TASK_NV_MASK = (1 << E_SH_LANG_TASK_NV);
	public static final int E_SH_LANG_MESH_NV_MASK = (1 << E_SH_LANG_MESH_NV);

	public static final int E_SH_SOURCE_NONE = 0;
	public static final int E_SH_SOURCE_GLSL = 1;
	public static final int E_SH_SOURCE_HLSL = 2;

	public static final int E_SH_CLIENT_NONE = 0;
	public static final int E_SH_CLIENT_VULKAN = 1;
	public static final int E_SH_CLIENT_OPENGL = 2;

	public static final int E_SH_TARGET_NONE = 0;
	public static final int E_SH_TARGET_SPV = 1;

	public static final int E_SH_TARGET_VULKAN_1_0 = (1 << 22);
	public static final int E_SH_TARGET_VULKAN_1_1 = (1 << 22) | (1 << 12);
	public static final int E_SH_TARGET_VULKAN_1_2 = (1 << 22) | (2 << 12);
	public static final int E_SH_TARGET_OPENGL_450 = 450;

	public static final int E_SH_TARGET_SPV_1_0 = (1 << 16);
	public static final int E_SH_TARGET_SPV_1_1 = (1 << 16) | (1 << 8);
	public static final int E_SH_TARGET_SPV_1_2 = (1 << 16) | (2 << 8);
	public static final int E_SH_TARGET_SPV_1_3 = (1 << 16) | (3 << 8);
	public static final int E_SH_TARGET_SPV_1_4 = (1 << 16) | (4 << 8);
	public static final int E_SH_TARGET_SPV_1_5 = (1 << 16) | (5 << 8);

	public static final int SPV_1_0 = (1 << 16);
	public static final int SPV_1_1 = (1 << 16) | (1 << 8);
	public static final int SPV_1_2 = (1 << 16) | (2 << 8);
	public static final int SPV_1_3 = (1 << 16) | (3 << 8);
	public static final int SPV_1_4 = (1 << 16) | (4 << 8);
	public static final int SPV_1_5 = (1 << 16) | (5 << 8);

	public static final int E_SH_EX_VERTEX_FRAGMENT = 0;
	public static final int E_SH_EX_FRAGMENT = 1;

	public static final int E_SH_OPT_NO_GENERATION = 0;
	public static final int E_SH_OPT_NONE = 1;
	public static final int E_SH_OPT_SIMPLE = 2;
	public static final int E_SH_OPT_FULL = 3;

	public static final int E_SH_TES_SAMP_TRANS_KEEP = 0;
	public static final int E_SH_TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER = 1;

	public static final int E_SH_MSG_DEFAULT = 0;
	public static final int E_SH_MSG_RELAXED_ERRORS = (1 << 0);
	public static final int E_SH_MSG_SUPRESS_WARNINGS = (1 << 1);
	public static final int E_SH_MSG_AST = (1 << 2);
	public static final int E_SH_MSG_SPV_RULES = (1 << 3);
	public static final int E_SH_MSG_VULKAN_RULES = (1 << 4);
	public static final int E_SH_MSG_ONLY_PREPROCESSOR = (1 << 5);
	public static final int E_SH_MSG_READ_HLSL = (1 << 6);
	public static final int E_SH_MSG_CASCADING_ERRORS = (1 << 7);
	public static final int E_SH_MSG_KEEP_UNCALLED = (1 << 8);
	public static final int E_SH_MSG_HLSL_OFFSETS = (1 << 9);
	public static final int E_SH_MSG_DEBUG_INFO = (1 << 10);
	public static final int E_SH_MSG_HLSL_ENABLE_16BIT_TYPES = (1 << 11);
	public static final int E_SH_MSG_HLSL_LEGALIZATION = (1 << 12);
	public static final int E_SH_MSG_HLSL_DX9_COMPATIBLE = (1 << 13);
	public static final int E_SH_MSG_BUITLIN_SYMBOL_TABLE = (1 << 14);

	public static final int E_SH_REFLECTION_DEFAULT = 0;
	public static final int E_SH_REFLECTION_STRICT_ARRAY_SUFFIX = (1 << 0);
	public static final int E_SH_REFLECTION_BASIC_ARRAY_SUFFIX = (1 << 1);
	public static final int E_SH_REFLECTION_INTERMEDIATE_IO = (1 << 2);
	public static final int E_SH_REFLECTION_SEPARATE_BUFFERS = (1 << 3);
	public static final int E_SH_REFLECTION_ALL_BLOCK_VARIABLES = (1 << 4);
	public static final int E_SH_REFLECTION_UNWRAP_IO_BLOCKS = (1 << 5);
	public static final int E_SH_REFLECTION_ALL_IO_VARIABLES = (1 << 6);
	public static final int E_SH_REFLECTION_SHARED_STD_1400_SSBO = (1 << 7);
	public static final int E_SH_REFLECTION_SHARED_STD_1400_UBO = (1 << 8);

	public static final int E_RES_SAMPLER = 0;
	public static final int E_RES_TEXTURE = 1;
	public static final int E_RES_IMAGE = 2;
	public static final int E_RES_UBO = 3;
	public static final int E_RES_SSBO = 4;
	public static final int E_RES_UAV = 5;

	public static final int E_BAD_PROFILE = 0;
	public static final int E_NO_PROFILE = (1 << 0);
	public static final int E_CORE_PROFILE = (1 << 1);
	public static final int E_COMPATIBILITY_PROFILE = (1 << 2);
	public static final int E_ES_PROFILE = (1 << 3);

	public static final int EBT_VOID = 0;
	public static final int EBT_FLOAT = 1;
	public static final int EBT_DOUBLE = 2;

	public static final int EPQ_NONE = 0;
	public static final int EPQ_LOW = 1;
	public static final int EPQ_MEDIUM = 2;
	public static final int EPQ_HIGH = 3;

	public static final int E_PREFIX_NONE = 0;
	public static final int E_PREFIX_WARNING = 1;
	public static final int E_PREFIX_ERROR = 2;
	public static final int E_PREFIX_INTERNAL_ERROR = 3;
	public static final int E_PREFIX_UNIMPLEMENTED = 4;
	public static final int E_PREFIX_NOTE = 5;

	public static final int E_BH_MISSING = 0;
	public static final int E_BH_REQUIRE = 1;
	public static final int E_BH_ENABLE = 2;
	public static final int E_BH_WARN = 3;
	public static final int E_BH_DISABLE = 4;
	public static final int E_BH_DISABLE_PARTIAL = 5;

	public static final int E_OP_NULL = 0;
	public static final int E_OP_SEQUENCE = 1;
	public static final int E_OP_LINKER_OBJECTS = 2;
	public static final int E_OP_FUNCTION_CALL = 3;
	public static final int E_OP_FUNCTION = 4;
	public static final int E_OP_PARAMETERS = 5;
	public static final int E_OP_NEGATIVE = 6;
	public static final int E_OP_LOGICAL_NOT = 7;
	public static final int E_OP_VECTOR_LOGICAL_NOT = 8;
	public static final int E_OP_BITWISE_NOT = 9;
	public static final int E_OP_POST_INCREMENT = 10;
	public static final int E_OP_POST_DECREMENT = 11;
	public static final int E_OP_PRE_INCREMENT = 12;
	public static final int E_OP_PRE_DECREMENT = 13;
	public static final int E_OP_COPY_OBJECT = 14;
	public static final int E_OP_CONV_INT8_TO_BOOL = 15;
	public static final int E_OP_CONV_UINT8_TO_BOOL = 16;
	public static final int E_OP_CONV_INT16_TO_BOOL = 17;
	public static final int E_OP_CONV_UINT16_TO_BOOL = 18;
	public static final int E_OP_CONV_INT_TO_BOOL = 19;
	public static final int E_OP_CONV_UINT_TO_BOOL = 20;
	public static final int E_OP_CONV_INT64_TO_BOOL = 21;
	public static final int E_OP_CONV_UINT64_TO_BOOL = 22;
	public static final int E_OP_CONV_FLOAT16_TO_BOOL = 23;
	public static final int E_OP_CONV_FLOAT_TO_BOOL = 24;
	public static final int E_OP_CONV_DOUBLE_TO_BOOL = 25;
	public static final int E_OP_CONV_BOOL_TO_INT8 = 26;
	public static final int E_OP_CONV_BOOL_TO_UINT8 = 27;
	public static final int E_OP_CONV_BOOL_TO_INT16 = 28;
	public static final int E_OP_CONV_BOOL_TO_UINT16 = 29;
	public static final int E_OP_CONV_BOOL_TO_INT = 30;
	public static final int E_OP_CONV_BOOL_TO_UINT = 31;
	public static final int E_OP_CONV_BOOL_TO_INT64 = 32;
	public static final int E_OP_CONV_BOOL_TO_UINT64 = 33;
	public static final int E_OP_CONV_BOOL_TO_FLOAT16 = 34;
	public static final int E_OP_CONV_BOOL_TO_FLOAT = 35;
	public static final int E_OP_CONV_BOOL_TO_DOUBLE = 36;
	public static final int E_OP_CONV_INT8_TO_INT16 = 37;
	public static final int E_OP_CONV_INT8_TO_INT = 38;
	public static final int E_OP_CONV_INT8_TO_INT64 = 39;
	public static final int E_OP_CONV_INT8_TO_UINT8 = 40;
	public static final int E_OP_CONV_INT8_TO_UINT16 = 41;
	public static final int E_OP_CONV_INT8_TO_UINT = 42;
	public static final int E_OP_CONV_INT8_TO_UINT64 = 43;
	public static final int E_OP_CONV_UINT8_TO_INT8 = 44;
	public static final int E_OP_CONV_UINT8_TO_INT16 = 45;
	public static final int E_OP_CONV_UINT8_TO_INT = 46;
	public static final int E_OP_CONV_UINT8_TO_INT64 = 47;
	public static final int E_OP_CONV_UINT8_TO_UINT16 = 48;
	public static final int E_OP_CONV_UINT8_TO_UINT = 49;
	public static final int E_OP_CONV_UINT8_TO_UINT64 = 50;
	public static final int E_OP_CONV_INT8_TO_FLOAT16 = 51;
	public static final int E_OP_CONV_INT8_TO_FLOAT = 52;
	public static final int E_OP_CONV_INT8_TO_DOUBLE = 53;
	public static final int E_OP_CONV_UINT8_TO_FLOAT16 = 54;
	public static final int E_OP_CONV_UINT8_TO_FLOAT = 55;
	public static final int E_OP_CONV_UINT8_TO_DOUBLE = 56;
	public static final int E_OP_CONV_INT16_TO_INT8 = 57;
	public static final int E_OP_CONV_INT16_TO_INT = 58;
	public static final int E_OP_CONV_INT16_TO_INT64 = 59;
	public static final int E_OP_CONV_INT16_TO_UINT8 = 60;
	public static final int E_OP_CONV_INT16_TO_UINT16 = 61;
	public static final int E_OP_CONV_INT16_TO_UINT = 62;
	public static final int E_OP_CONV_INT16_TO_UINT64 = 63;
	public static final int E_OP_CONV_UINT16_TO_INT8 = 64;
	public static final int E_OP_CONV_UINT16_TO_INT16 = 65;
	public static final int E_OP_CONV_UINT16_TO_INT = 66;
	public static final int E_OP_CONV_UINT16_TO_INT64 = 67;
	public static final int E_OP_CONV_UINT16_TO_UINT8 = 68;
	public static final int E_OP_CONV_UINT16_TO_UINT = 69;
	public static final int E_OP_CONV_UINT16_TO_UINT64 = 70;
	public static final int E_OP_CONV_INT16_TO_FLOAT16 = 71;
	public static final int E_OP_CONV_INT16_TO_FLOAT = 72;
	public static final int E_OP_CONV_INT16_TO_DOUBLE = 73;
	public static final int E_OP_CONV_UINT16_TO_FLOAT16 = 74;
	public static final int E_OP_CONV_UINT16_TO_FLOAT = 75;
	public static final int E_OP_CONV_UINT16_TO_DOUBLE = 76;
	public static final int E_OP_CONV_INT_TO_INT8 = 77;
	public static final int E_OP_CONV_INT_TO_INT16 = 78;
	public static final int E_OP_CONV_INT_TO_INT64 = 79;
	public static final int E_OP_CONV_INT_TO_UINT8 = 80;
	public static final int E_OP_CONV_INT_TO_UINT16 = 81;
	public static final int E_OP_CONV_INT_TO_UINT = 82;
	public static final int E_OP_CONV_INT_TO_UINT64 = 83;
	public static final int E_OP_CONV_UINT_TO_INT8 = 84;
	public static final int E_OP_CONV_UINT_TO_INT16 = 85;
	public static final int E_OP_CONV_UINT_TO_INT = 86;
	public static final int E_OP_CONV_UINT_TO_INT64 = 87;
	public static final int E_OP_CONV_UINT_TO_UINT8 = 88;
	public static final int E_OP_CONV_UINT_TO_UINT16 = 89;
	public static final int E_OP_CONV_UINT_TO_UINT64 = 90;
	public static final int E_OP_CONV_INT_TO_FLOAT16 = 91;
	public static final int E_OP_CONV_INT_TO_FLOAT = 92;
	public static final int E_OP_CONV_INT_TO_DOUBLE = 93;
	public static final int E_OP_CONV_UINT_TO_FLOAT16 = 94;
	public static final int E_OP_CONV_UINT_TO_FLOAT = 95;
	public static final int E_OP_CONV_UINT_TO_DOUBLE = 96;
	public static final int E_OP_CONV_INT64_TO_INT8 = 97;
	public static final int E_OP_CONV_INT64_TO_INT16 = 98;
	public static final int E_OP_CONV_INT64_TO_INT = 99;
	public static final int E_OP_CONV_INT64_TO_UINT8 = 100;
	public static final int E_OP_CONV_INT64_TO_UINT16 = 101;
	public static final int E_OP_CONV_INT64_TO_UINT = 102;
	public static final int E_OP_CONV_INT64_TO_UINT64 = 103;
	public static final int E_OP_CONV_UINT64_TO_INT8 = 104;
	public static final int E_OP_CONV_UINT64_TO_INT16 = 105;
	public static final int E_OP_CONV_UINT64_TO_INT = 106;
	public static final int E_OP_CONV_UINT64_TO_INT64 = 107;
	public static final int E_OP_CONV_UINT64_TO_UINT8 = 108;
	public static final int E_OP_CONV_UINT64_TO_UINT16 = 109;
	public static final int E_OP_CONV_UINT64_TO_UINT = 110;
	public static final int E_OP_CONV_INT64_TO_FLOAT16 = 111;
	public static final int E_OP_CONV_INT64_TO_FLOAT = 112;
	public static final int E_OP_CONV_INT64_TO_DOUBLE = 113;
	public static final int E_OP_CONV_UINT64_TO_FLOAT16 = 114;
	public static final int E_OP_CONV_UINT64_TO_FLOAT = 115;
	public static final int E_OP_CONV_UINT64_TO_DOUBLE = 116;
	public static final int E_OP_CONV_FLOAT16_TO_INT8 = 117;
	public static final int E_OP_CONV_FLOAT16_TO_INT16 = 118;
	public static final int E_OP_CONV_FLOAT16_TO_INT = 119;
	public static final int E_OP_CONV_FLOAT16_TO_INT64 = 120;
	public static final int E_OP_CONV_FLOAT16_TO_UINT8 = 121;
	public static final int E_OP_CONV_FLOAT16_TO_UINT16 = 122;
	public static final int E_OP_CONV_FLOAT16_TO_UINT = 123;
	public static final int E_OP_CONV_FLOAT16_TO_UINT64 = 124;
	public static final int E_OP_CONV_FLOAT16_TO_FLOAT = 125;
	public static final int E_OP_CONV_FLOAT16_TO_DOUBLE = 126;
	public static final int E_OP_CONV_FLOAT_TO_INT8 = 127;
	public static final int E_OP_CONV_FLOAT_TO_INT16 = 128;
	public static final int E_OP_CONV_FLOAT_TO_INT = 129;
	public static final int E_OP_CONV_FLOAT_TO_INT64 = 130;
	public static final int E_OP_CONV_FLOAT_TO_UINT8 = 131;
	public static final int E_OP_CONV_FLOAT_TO_UINT16 = 132;
	public static final int E_OP_CONV_FLOAT_TO_UINT = 133;
	public static final int E_OP_CONV_FLOAT_TO_UINT64 = 134;
	public static final int E_OP_CONV_FLOAT_TO_FLOAT16 = 135;
	public static final int E_OP_CONV_FLOAT_TO_DOUBLE = 136;
	public static final int E_OP_CONV_DOUBLE_TO_INT8 = 137;
	public static final int E_OP_CONV_DOUBLE_TO_INT16 = 138;
	public static final int E_OP_CONV_DOUBLE_TO_INT = 139;
	public static final int E_OP_CONV_DOUBLE_TO_INT64 = 140;
	public static final int E_OP_CONV_DOUBLE_TO_UINT8 = 141;
	public static final int E_OP_CONV_DOUBLE_TO_UINT16 = 142;
	public static final int E_OP_CONV_DOUBLE_TO_UINT = 143;
	public static final int E_OP_CONV_DOUBLE_TO_UINT64 = 144;
	public static final int E_OP_CONV_DOUBLE_TO_FLOAT16 = 145;
	public static final int E_OP_CONV_DOUBLE_TO_FLOAT = 146;
	public static final int E_OP_CONV_UINT64_TO_PTR = 147;
	public static final int E_OP_CONV_PTR_TO_UINT64 = 148;
	public static final int E_OP_CONV_UVEC2_TO_PTR = 149;
	public static final int E_OP_CONV_PTR_TO_UVEC2 = 150;
	public static final int E_OP_ADD = 151;
	public static final int E_OP_SUB = 152;
	public static final int E_OP_MUL = 153;
	public static final int E_OP_DIV = 154;
	public static final int E_OP_MOD = 155;
	public static final int E_OP_RIGHT_SHIFT = 156;
	public static final int E_OP_LEFT_SHIFT = 157;
	public static final int E_OP_AND = 158;
	public static final int E_OP_INCLUSIVE_OR = 159;
	public static final int E_OP_EXCLUSIVE_OR = 160;
	public static final int E_OP_EQUAL = 161;
	public static final int E_OP_NOT_EQUAL = 162;
	public static final int E_OP_VECTOR_EQUAL = 163;
	public static final int E_OP_VECTOR_NOT_EQUAL = 164;
	public static final int E_OP_LESS_THAN = 165;
	public static final int E_OP_GREATER_THAN = 166;
	public static final int E_OP_LESS_THAN_EQUAL = 167;
	public static final int E_OP_GREATER_THAN_EQUAL = 168;
	public static final int E_OP_COMMA = 169;
	public static final int E_OP_VECTOR_TIMES_SCALAR = 170;
	public static final int E_OP_VECTOR_TIMES_MATRIX = 171;
	public static final int E_OP_MATRIX_TIMES_VECTOR = 172;
	public static final int E_OP_MATRIX_TIMES_SCALAR = 173;
	public static final int E_OP_LOGICAL_OR = 174;
	public static final int E_OP_LOGICAL_XOR = 175;
	public static final int E_OP_LOGICAL_AND = 176;
	public static final int E_OP_INDEX_DIRECT = 177;
	public static final int E_OP_INDEX_INDIRECT = 178;
	public static final int E_OP_INDEX_DIRECT_STRUCT = 179;
	public static final int E_OP_VECTOR_SWIZZLE = 180;
	public static final int E_OP_METHOD = 181;
	public static final int E_OP_SCOPING = 182;
	public static final int E_OP_RADIANS = 183;
	public static final int E_OP_DEGREES = 184;
	public static final int E_OP_SIN = 185;
	public static final int E_OP_COS = 186;
	public static final int E_OP_TAN = 187;
	public static final int E_OP_ASIN = 188;
	public static final int E_OP_ACOS = 189;
	public static final int E_OP_ATAN = 190;
	public static final int E_OP_SINH = 191;
	public static final int E_OP_COSH = 192;
	public static final int E_OP_TANH = 193;
	public static final int E_OP_ASINH = 194;
	public static final int E_OP_ACOSH = 195;
	public static final int E_OP_ATANH = 196;
	public static final int E_OP_POW = 197;
	public static final int E_OP_EXP = 198;
	public static final int E_OP_LOG = 199;
	public static final int E_OP_EXP2 = 200;
	public static final int E_OP_LOG2 = 201;
	public static final int E_OP_SQRT = 202;
	public static final int E_OP_INVERSE_SQRT = 203;
	public static final int E_OP_ABS = 204;
	public static final int E_OP_SIGN = 205;
	public static final int E_OP_FLOOR = 206;
	public static final int E_OP_TRUNC = 207;
	public static final int E_OP_ROUND = 208;
	public static final int E_OP_ROUND_EVEN = 209;
	public static final int E_OP_CEIL = 210;
	public static final int E_OP_FRACT = 211;
	public static final int E_OP_MODF = 212;
	public static final int E_OP_MIN = 213;
	public static final int E_OP_MAX = 214;
	public static final int E_OP_CLAMP = 215;
	public static final int E_OP_MIX = 216;
	public static final int E_OP_STEP = 217;
	public static final int E_OP_SMOOTH_STEP = 218;
	public static final int E_OP_IS_NAN = 219;
	public static final int E_OP_IS_INF = 220;
	public static final int E_OP_FMA = 221;
	public static final int E_OP_FREXP = 222;
	public static final int E_OP_LDEXP = 223;
	public static final int E_OP_FLOAT_BITS_TO_INT = 224;
	public static final int E_OP_FLOAT_BITS_TO_UINT = 225;
	public static final int E_OP_INT_BITS_TO_FLOAT = 226;
	public static final int E_OP_UINT_BITS_TO_FLOAT = 227;
	public static final int E_OP_DOUBLE_BITS_TO_INT64 = 228;
	public static final int E_OP_DOUBLE_BITS_TO_UINT64 = 229;
	public static final int E_OP_INT64_BITS_TO_DOUBLE = 230;
	public static final int E_OP_UINT64_BITS_TO_DOUBLE = 231;
	public static final int E_OP_FLOAT16_BITS_TO_INT16 = 232;
	public static final int E_OP_FLOAT16_BITS_TO_UINT16 = 233;
	public static final int E_OP_INT16_BITS_TO_FLOAT16 = 234;
	public static final int E_OP_UINT16_BITS_TO_FLOAT16 = 235;
	public static final int E_OP_PACK_SNORM2X16 = 236;
	public static final int E_OP_UNPACK_SNORM2X16 = 237;
	public static final int E_OP_PACK_UNORM2X16 = 238;
	public static final int E_OP_UNPACK_UNORM2X16 = 239;
	public static final int E_OP_PACK_SNORM4X8 = 240;
	public static final int E_OP_UNPACK_SNORM4X8 = 241;
	public static final int E_OP_PACK_UNORM4X8 = 242;
	public static final int E_OP_UNPACK_UNORM4X8 = 243;
	public static final int E_OP_PACK_HALF2X16 = 244;
	public static final int E_OP_UNPACK_HALF2X16 = 245;
	public static final int E_OP_PACK_DOUBLE2X32 = 246;
	public static final int E_OP_UNPACK_DOUBLE2X32 = 247;
	public static final int E_OP_PACK_INT2X32 = 248;
	public static final int E_OP_UNPACK_INT2X32 = 249;
	public static final int E_OP_PACK_UINT2X32 = 250;
	public static final int E_OP_UNPACK_UINT2X32 = 251;
	public static final int E_OP_PACK_FLOAT2X16 = 252;
	public static final int E_OP_UNPACK_FLOAT2X16 = 253;
	public static final int E_OP_PACK_INT2X16 = 254;
	public static final int E_OP_UNPACK_INT2X16 = 255;
	public static final int E_OP_PACK_UINT2X16 = 256;
	public static final int E_OP_UNPACK_UINT2X16 = 257;
	public static final int E_OP_PACK_INT4X16 = 258;
	public static final int E_OP_UNPACK_INT4X16 = 259;
	public static final int E_OP_PACK_UINT4X16 = 260;
	public static final int E_OP_UNPACK_UINT4X16 = 261;
	public static final int E_OP_PACK16 = 262;
	public static final int E_OP_PACK32 = 263;
	public static final int E_OP_PACK64 = 264;
	public static final int E_OP_UNPACK32 = 265;
	public static final int E_OP_UNPACK16 = 266;
	public static final int E_OP_UNPACK8 = 267;
	public static final int E_OP_LENGTH = 268;
	public static final int E_OP_DISTANCE = 269;
	public static final int E_OP_DOT = 270;
	public static final int E_OP_CROSS = 271;
	public static final int E_OP_NORMALIZE = 272;
	public static final int E_OP_FACE_FORWARD = 273;
	public static final int E_OP_REFLECT = 274;
	public static final int E_OP_REFRACT = 275;
	public static final int E_OP_MIN3 = 276;
	public static final int E_OP_MAX3 = 277;
	public static final int E_OP_MID3 = 278;
	public static final int E_OP_DPDX = 279;
	public static final int E_OP_DPDY = 280;
	public static final int E_OP_FWIDTH = 281;
	public static final int E_OP_DPDXFINE = 282;
	public static final int E_OP_DPDYFINE = 283;
	public static final int E_OP_FWIDTH_FINE = 284;
	public static final int E_OP_DPDXCOARSE = 285;
	public static final int E_OP_DPDYCOARSE = 286;
	public static final int E_OP_FWIDTH_COARSE = 287;
	public static final int E_OP_INTERPOLATE_AT_CENTROID = 288;
	public static final int E_OP_INTERPOLATE_AT_SAMPLE = 289;
	public static final int E_OP_INTERPOLATE_AT_OFFSET = 290;
	public static final int E_OP_INTERPOLATE_AT_VERTEX = 291;
	public static final int E_OP_MATRIX_TIMES_MATRIX = 292;
	public static final int E_OP_OUTER_PRODUCT = 293;
	public static final int E_OP_DETERMINANT = 294;
	public static final int E_OP_MATRIX_INVERSE = 295;
	public static final int E_OP_TRANSPOSE = 296;
	public static final int E_OP_FTRANSFORM = 297;
	public static final int E_OP_NOISE = 298;
	public static final int E_OP_EMIT_VERTEX = 299;
	public static final int E_OP_END_PRIMITIVE = 300;
	public static final int E_OP_EMIT_STREAM_VERTEX = 301;
	public static final int E_OP_END_STREAM_PRIMITIVE = 302;
	public static final int E_OP_BARRIER = 303;
	public static final int E_OP_MEMORY_BARRIER = 304;
	public static final int E_OP_MEMORY_BARRIER_ATOMIC_COUNTER = 305;
	public static final int E_OP_MEMORY_BARRIER_BUFFER = 306;
	public static final int E_OP_MEMORY_BARRIER_IMAGE = 307;
	public static final int E_OP_MEMORY_BARRIER_SHARED = 308;
	public static final int E_OP_GROUP_MEMORY_BARRIER = 309;
	public static final int E_OP_BALLOT = 310;
	public static final int E_OP_READ_INVOCATION = 311;
	public static final int E_OP_READ_FIRST_INVOCATION = 312;
	public static final int E_OP_ANY_INVOCATION = 313;
	public static final int E_OP_ALL_INVOCATIONS = 314;
	public static final int E_OP_ALL_INVOCATIONS_EQUAL = 315;
	public static final int E_OP_SUBGROUP_GUARD_START = 316;
	public static final int E_OP_SUBGROUP_BARRIER = 317;
	public static final int E_OP_SUBGROUP_MEMORY_BARRIER = 318;
	public static final int E_OP_SUBGROUP_MEMORY_BARRIER_BUFFER = 319;
	public static final int E_OP_SUBGROUP_MEMORY_BARRIER_IMAGE = 320;
	public static final int E_OP_SUBGROUP_MEMORY_BARRIER_SHARED = 321;
	public static final int E_OP_SUBGROUP_ELECT = 322;
	public static final int E_OP_SUBGROUP_ALL = 323;
	public static final int E_OP_SUBGROUP_ANY = 324;
	public static final int E_OP_SUBGROUP_ALL_EQUAL = 325;
	public static final int E_OP_SUBGROUP_BROADCAST = 326;
	public static final int E_OP_SUBGROUP_BROADCAST_FIRST = 327;
	public static final int E_OP_SUBGROUP_BALLOT = 328;
	public static final int E_OP_SUBGROUP_INVERSE_BALLOT = 329;
	public static final int E_OP_SUBGROUP_BALLOT_BIT_EXTRACT = 330;
	public static final int E_OP_SUBGROUP_BALLOT_BIT_COUNT = 331;
	public static final int E_OP_SUBGROUP_BALLOT_INCLUSIVE_BIT_COUNT = 332;
	public static final int E_OP_SUBGROUP_BALLOT_EXCLUSIVE_BIT_COUNT = 333;
	public static final int E_OP_SUBGROUP_BALLOT_FIND_LSB = 334;
	public static final int E_OP_SUBGROUP_BALLOT_FIND_MSB = 335;
	public static final int E_OP_SUBGROUP_SHUFFLE = 336;
	public static final int E_OP_SUBGROUP_SHUFFLE_XOR = 337;
	public static final int E_OP_SUBGROUP_SHUFFLE_UP = 338;
	public static final int E_OP_SUBGROUP_SHUFFLE_DOWN = 339;
	public static final int E_OP_SUBGROUP_ADD = 340;
	public static final int E_OP_SUBGROUP_MUL = 341;
	public static final int E_OP_SUBGROUP_MIN = 342;
	public static final int E_OP_SUBGROUP_MAX = 343;
	public static final int E_OP_SUBGROUP_AND = 344;
	public static final int E_OP_SUBGROUP_OR = 345;
	public static final int E_OP_SUBGROUP_XOR = 346;
	public static final int E_OP_SUBGROUP_INCLUSIVE_ADD = 347;
	public static final int E_OP_SUBGROUP_INCLUSIVE_MUL = 348;
	public static final int E_OP_SUBGROUP_INCLUSIVE_MIN = 349;
	public static final int E_OP_SUBGROUP_INCLUSIVE_MAX = 350;
	public static final int E_OP_SUBGROUP_INCLUSIVE_AND = 351;
	public static final int E_OP_SUBGROUP_INCLUSIVE_OR = 352;
	public static final int E_OP_SUBGROUP_INCLUSIVE_XOR = 353;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_ADD = 354;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_MUL = 355;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_MIN = 356;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_MAX = 357;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_AND = 358;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_OR = 359;
	public static final int E_OP_SUBGROUP_EXCLUSIVE_XOR = 360;
	public static final int E_OP_SUBGROUP_CLUSTERED_ADD = 361;
	public static final int E_OP_SUBGROUP_CLUSTERED_MUL = 362;
	public static final int E_OP_SUBGROUP_CLUSTERED_MIN = 363;
	public static final int E_OP_SUBGROUP_CLUSTERED_MAX = 364;
	public static final int E_OP_SUBGROUP_CLUSTERED_AND = 365;
	public static final int E_OP_SUBGROUP_CLUSTERED_OR = 366;
	public static final int E_OP_SUBGROUP_CLUSTERED_XOR = 367;
	public static final int E_OP_SUBGROUP_QUAD_BROADCAST = 368;
	public static final int E_OP_SUBGROUP_QUAD_SWAP_HORIZONTAL = 369;
	public static final int E_OP_SUBGROUP_QUAD_SWAP_VERTICAL = 370;
	public static final int E_OP_SUBGROUP_QUAD_SWAP_DIAGONAL = 371;
	public static final int E_OP_SUBGROUP_PARTITION = 372;
	public static final int E_OP_SUBGROUP_PARTITIONED_ADD = 373;
	public static final int E_OP_SUBGROUP_PARTITIONED_MUL = 374;
	public static final int E_OP_SUBGROUP_PARTITIONED_MIN = 375;
	public static final int E_OP_SUBGROUP_PARTITIONED_MAX = 376;
	public static final int E_OP_SUBGROUP_PARTITIONED_AND = 377;
	public static final int E_OP_SUBGROUP_PARTITIONED_OR = 378;
	public static final int E_OP_SUBGROUP_PARTITIONED_XOR = 379;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_ADD = 380;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MUL = 381;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MIN = 382;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MAX = 383;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_AND = 384;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_OR = 385;
	public static final int E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_XOR = 386;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_ADD = 387;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MUL = 388;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MIN = 389;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MAX = 390;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_AND = 391;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_OR = 392;
	public static final int E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_XOR = 393;
	public static final int E_OP_SUBGROUP_GUARD_STOP = 394;
	public static final int E_OP_MIN_INVOCATIONS = 395;
	public static final int E_OP_MAX_INVOCATIONS = 396;
	public static final int E_OP_ADD_INVOCATIONS = 397;
	public static final int E_OP_MIN_INVOCATIONS_NON_UNIFORM = 398;
	public static final int E_OP_MAX_INVOCATIONS_NON_UNIFORM = 399;
	public static final int E_OP_ADD_INVOCATIONS_NON_UNIFORM = 400;
	public static final int E_OP_MIN_INVOCATIONS_INCLUSIVE_SCAN = 401;
	public static final int E_OP_MAX_INVOCATIONS_INCLUSIVE_SCAN = 402;
	public static final int E_OP_ADD_INVOCATIONS_INCLUSIVE_SCAN = 403;
	public static final int E_OP_MIN_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM = 404;
	public static final int E_OP_MAX_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM = 405;
	public static final int E_OP_ADD_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM = 406;
	public static final int E_OP_MIN_INVOCATIONS_EXCLUSIVE_SCAN = 407;
	public static final int E_OP_MAX_INVOCATIONS_EXCLUSIVE_SCAN = 408;
	public static final int E_OP_ADD_INVOCATIONS_EXCLUSIVE_SCAN = 409;
	public static final int E_OP_MIN_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM = 410;
	public static final int E_OP_MAX_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM = 411;
	public static final int E_OP_ADD_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM = 412;
	public static final int E_OP_SWIZZLE_INVOCATIONS = 413;
	public static final int E_OP_SWIZZLE_INVOCATIONS_MASKED = 414;
	public static final int E_OP_WRITE_INVOCATION = 415;
	public static final int E_OP_MBCNT = 416;
	public static final int E_OP_CUBE_FACE_INDEX = 417;
	public static final int E_OP_CUBE_FACE_COORD = 418;
	public static final int E_OP_TIME = 419;
	public static final int E_OP_ATOMIC_ADD = 420;
	public static final int E_OP_ATOMIC_MIN = 421;
	public static final int E_OP_ATOMIC_MAX = 422;
	public static final int E_OP_ATOMIC_AND = 423;
	public static final int E_OP_ATOMIC_OR = 424;
	public static final int E_OP_ATOMIC_XOR = 425;
	public static final int E_OP_ATOMIC_EXCHANGE = 426;
	public static final int E_OP_ATOMIC_COMP_SWAP = 427;
	public static final int E_OP_ATOMIC_LOAD = 428;
	public static final int E_OP_ATOMIC_STORE = 429;
	public static final int E_OP_ATOMIC_COUNTER_INCREMENT = 430;
	public static final int E_OP_ATOMIC_COUNTER_DECREMENT = 431;
	public static final int E_OP_ATOMIC_COUNTER = 432;
	public static final int E_OP_ATOMIC_COUNTER_ADD = 433;
	public static final int E_OP_ATOMIC_COUNTER_SUBTRACT = 434;
	public static final int E_OP_ATOMIC_COUNTER_MIN = 435;
	public static final int E_OP_ATOMIC_COUNTER_MAX = 436;
	public static final int E_OP_ATOMIC_COUNTER_AND = 437;
	public static final int E_OP_ATOMIC_COUNTER_OR = 438;
	public static final int E_OP_ATOMIC_COUNTER_XOR = 439;
	public static final int E_OP_ATOMIC_COUNTER_EXCHANGE = 440;
	public static final int E_OP_ATOMIC_COUNTER_COMP_SWAP = 441;
	public static final int E_OP_ANY = 442;
	public static final int E_OP_ALL = 443;
	public static final int E_OP_COOPERATIVE_MATRIX_LOAD = 444;
	public static final int E_OP_COOPERATIVE_MATRIX_STORE = 445;
	public static final int E_OP_COOPERATIVE_MATRIX_MUL_ADD = 446;
	public static final int E_OP_BEGIN_INVOCATION_INTERLOCK = 447;
	public static final int E_OP_END_INVOCATION_INTERLOCK = 448;
	public static final int E_OP_IS_HELPER_INVOCATION = 449;
	public static final int E_OP_DEBUG_PRINTF = 450;
	public static final int E_OP_KILL = 451;
	public static final int E_OP_RETURN = 452;
	public static final int E_OP_BREAK = 453;
	public static final int E_OP_CONTINUE = 454;
	public static final int E_OP_CASE = 455;
	public static final int E_OP_DEFAULT = 456;
	public static final int E_OP_DEMOTE = 457;
	public static final int E_OP_CONSTRUCT_GUARD_START = 458;
	public static final int E_OP_CONSTRUCT_INT = 459;
	public static final int E_OP_CONSTRUCT_UINT = 460;
	public static final int E_OP_CONSTRUCT_INT8 = 461;
	public static final int E_OP_CONSTRUCT_UINT8 = 462;
	public static final int E_OP_CONSTRUCT_INT16 = 463;
	public static final int E_OP_CONSTRUCT_UINT16 = 464;
	public static final int E_OP_CONSTRUCT_INT64 = 465;
	public static final int E_OP_CONSTRUCT_UINT64 = 466;
	public static final int E_OP_CONSTRUCT_BOOL = 467;
	public static final int E_OP_CONSTRUCT_FLOAT = 468;
	public static final int E_OP_CONSTRUCT_DOUBLE = 469;
	public static final int E_OP_CONSTRUCT_VEC2 = 470;
	public static final int E_OP_CONSTRUCT_VEC3 = 471;
	public static final int E_OP_CONSTRUCT_VEC4 = 472;
	public static final int E_OP_CONSTRUCT_MAT2X2 = 473;
	public static final int E_OP_CONSTRUCT_MAT2X3 = 474;
	public static final int E_OP_CONSTRUCT_MAT2X4 = 475;
	public static final int E_OP_CONSTRUCT_MAT3X2 = 476;
	public static final int E_OP_CONSTRUCT_MAT3X3 = 477;
	public static final int E_OP_Construct_Mat3x4 = 478;
	public static final int E_OP_CONSTRUCT_MAT4X2 = 479;
	public static final int E_OP_CONSTRUCT_MAT4X3 = 480;
	public static final int E_OP_CONSTRUCT_MAT4X4 = 481;
	public static final int E_OP_CONSTRUCT_DVEC2 = 482;
	public static final int E_OP_CONSTRUCT_DVEC3 = 483;
	public static final int E_OP_CONSTRUCT_DVEC4 = 484;
	public static final int E_OP_CONSTRUCT_BVEC2 = 485;
	public static final int E_OP_CONSTRUCT_BVEC3 = 486;
	public static final int E_OP_CONSTRUCT_BVEC4 = 487;
	public static final int E_OP_CONSTRUCT_I8_VEC2 = 488;
	public static final int E_OP_CONSTRUCT_I8_VEC3 = 489;
	public static final int E_OP_CONSTRUCT_I8_VEC4 = 490;
	public static final int E_OP_CONSTRUCT_U8_VEC2 = 491;
	public static final int E_OP_CONSTRUCT_U8_VEC3 = 492;
	public static final int E_OP_CONSTRUCT_U8_VEC4 = 493;
	public static final int E_OP_CONSTRUCT_I16_VEC2 = 494;
	public static final int E_OP_CONSTRUCT_I16_VEC3 = 495;
	public static final int E_OP_CONSTRUCT_I16_VEC4 = 496;
	public static final int E_OP_CONSTRUCT_U16_VEC2 = 497;
	public static final int E_OP_CONSTRUCT_U16_VEC3 = 498;
	public static final int E_OP_CONSTRUCT_U16_VEC4 = 499;
	public static final int E_OP_CONSTRUCT_IVEC2 = 500;
	public static final int E_OP_CONSTRUCT_IVEC3 = 501;
	public static final int E_OP_CONSTRUCT_IVEC4 = 502;
	public static final int E_OP_CONSTRUCT_UVEC2 = 503;
	public static final int E_OP_CONSTRUCT_UVEC3 = 504;
	public static final int E_OP_CONSTRUCT_UVEC4 = 505;
	public static final int E_OP_CONSTRUCT_I64_VEC2 = 506;
	public static final int E_OP_CONSTRUCT_I64_VEC3 = 507;
	public static final int E_OP_CONSTRUCT_I64_VEC4 = 508;
	public static final int E_OP_CONSTRUCT_U64_VEC2 = 509;
	public static final int E_OP_CONSTRUCT_U64_VEC3 = 510;
	public static final int E_OP_CONSTRUCT_U64_VEC4 = 511;
	public static final int E_OP_CONSTRUCT_DMAT2X2 = 512;
	public static final int E_OP_CONSTRUCT_DMAT2X3 = 513;
	public static final int E_OP_CONSTRUCT_DMAT2X4 = 514;
	public static final int E_OP_CONSTRUCT_DMAT3X2 = 515;
	public static final int E_OP_CONSTRUCT_DMAT3X3 = 516;
	public static final int E_OP_CONSTRUCT_DMAT3X4 = 517;
	public static final int E_OP_CONSTRUCT_DMAT4X2 = 518;
	public static final int E_OP_CONSTRUCT_DMAT4X3 = 519;
	public static final int E_OP_CONSTRUCT_DMAT4X4 = 520;
	public static final int E_OP_CONSTRUCT_IMAT2X2 = 521;
	public static final int E_OP_CONSTRUCT_IMAT2X3 = 522;
	public static final int E_OP_CONSTRUCT_IMAT2X4 = 523;
	public static final int E_OP_CONSTRUCT_IMAT3X2 = 524;
	public static final int E_OP_CONSTRUCT_IMAT3X3 = 525;
	public static final int E_OP_CONSTRUCT_IMAT3X4 = 526;
	public static final int E_OP_CONSTRUCT_IMAT4X2 = 527;
	public static final int E_OP_CONSTRUCT_IMAT4X3 = 528;
	public static final int E_OP_CONSTRUCT_IMAT4X4 = 529;
	public static final int E_OP_CONSTRUCT_UMAT2X2 = 530;
	public static final int E_OP_CONSTRUCT_UMAT2X3 = 531;
	public static final int E_OP_CONSTRUCT_UMAT2X4 = 532;
	public static final int E_OP_CONSTRUCT_UMAT3X2 = 533;
	public static final int E_OP_CONSTRUCT_UMAT3X3 = 534;
	public static final int E_OP_CONSTRUCT_UMAT3X4 = 535;
	public static final int E_OP_CONSTRUCT_UMAT4X2 = 536;
	public static final int E_OP_CONSTRUCT_UMAT4X3 = 537;
	public static final int E_OP_CONSTRUCT_UMAT4X4 = 538;
	public static final int E_OP_CONSTRUCT_BMAT2X2 = 539;
	public static final int E_OP_CONSTRUCT_BMAT2X3 = 540;
	public static final int E_OP_CONSTRUCT_BMAT2X4 = 541;
	public static final int E_OP_CONSTRUCT_BMAT3X2 = 542;
	public static final int E_OP_CONSTRUCT_BMAT3X3 = 543;
	public static final int E_OP_CONSTRUCT_BMAT3X4 = 544;
	public static final int E_OP_CONSTRUCT_BMAT4X2 = 545;
	public static final int E_OP_CONSTRUCT_BMAT4X3 = 546;
	public static final int E_OP_CONSTRUCT_BMAT4X4 = 547;
	public static final int E_OP_CONSTRUCT_FLOAT16 = 548;
	public static final int E_OP_CONSTRUCT_F16_VEC2 = 549;
	public static final int E_OP_CONSTRUCT_F16_VEC3 = 550;
	public static final int E_OP_CONSTRUCT_F16_VEC4 = 551;
	public static final int E_OP_CONSTRUCT_F16_MAT2X2 = 552;
	public static final int E_OP_CONSTRUCT_F16_MAT2X3 = 553;
	public static final int E_OP_CONSTRUCT_F16_MAT2X4 = 554;
	public static final int E_OP_CONSTRUCT_F16_MAT3X2 = 555;
	public static final int E_OP_CONSTRUCT_F16_MAT3X3 = 556;
	public static final int E_OP_CONSTRUCT_F16_MAT3X4 = 557;
	public static final int E_OP_CONSTRUCT_F16_MAT4X2 = 558;
	public static final int E_OP_CONSTRUCT_F16_MAT4X3 = 559;
	public static final int E_OP_CONSTRUCT_F16_MAT4X4 = 560;
	public static final int E_OP_CONSTRUCT_STRUCT = 561;
	public static final int E_OP_CONSTRUCT_TEXTURE_SAMPLER = 562;
	public static final int E_OP_CONSTRUCT_NONUNIFORM = 563;
	public static final int E_OP_CONSTRUCT_REFERENCE = 564;
	public static final int E_OP_CONSTRUCT_COOPERATIVE_MATRIX = 565;
	public static final int E_OP_CONSTRUCT_GUARD_END = 566;
	public static final int E_OP_ASSIGN = 567;
	public static final int E_OP_ADD_ASSIGN = 568;
	public static final int E_OP_SUB_ASSIGN = 569;
	public static final int E_OP_MUL_ASSIGN = 570;
	public static final int E_OP_VECTOR_TIMES_MATRIX_ASSIGN = 571;
	public static final int E_OP_VECTOR_TIMES_SCALAR_ASSIGN = 572;
	public static final int E_OP_MATRIX_TIMES_SCALAR_ASSIGN = 573;
	public static final int E_OP_MATRIX_TIMES_MATRIX_ASSIGN = 574;
	public static final int E_OP_DIV_ASSIGN = 575;
	public static final int E_OP_MOD_ASSIGN = 576;
	public static final int E_OP_AND_ASSIGN = 577;
	public static final int E_OP_INCLUSIVE_OR_ASSIGN = 578;
	public static final int E_OP_EXCLUSIVE_OR_ASSIGN = 579;
	public static final int E_OP_LEFT_SHIFT_ASSIGN = 580;
	public static final int E_OP_RIGHT_SHIFT_ASSIGN = 581;
	public static final int E_OP_ARRAY_LENGTH = 582;
	public static final int E_OP_IMAGE_GUARD_BEGIN = 583;
	public static final int E_OP_IMAGE_QUERY_SIZE = 584;
	public static final int E_OP_IMAGE_QUERY_SAMPLES = 585;
	public static final int E_OP_IMAGE_LOAD = 586;
	public static final int E_OP_IMAGE_STORE = 587;
	public static final int E_OP_IMAGE_LOAD_LOD = 588;
	public static final int E_OP_IMAGE_STORE_LOD = 589;
	public static final int E_OP_IMAGE_ATOMIC_ADD = 590;
	public static final int E_OP_IMAGE_ATOMIC_MIN = 591;
	public static final int E_OP_IMAGE_ATOMIC_MAX = 592;
	public static final int E_OP_IMAGE_ATOMIC_AND = 593;
	public static final int E_OP_IMAGE_ATOMIC_OR = 594;
	public static final int E_OP_IMAGE_ATOMIC_XOR = 595;
	public static final int E_OP_IMAGE_ATOMIC_EXCHANGE = 596;
	public static final int E_OP_IMAGE_ATOMIC_COMP_SWAP = 597;
	public static final int E_OP_IMAGE_ATOMIC_LOAD = 598;
	public static final int E_OP_IMAGE_ATOMIC_STORE = 599;
	public static final int E_OP_SUBPASS_LOAD = 600;
	public static final int E_OP_SUBPASS_LOAD_MS = 601;
	public static final int E_OP_SPARSE_IMAGE_LOAD = 602;
	public static final int E_OP_SPARSE_IMAGE_LOAD_LOD = 603;
	public static final int E_OP_IMAGE_GUARD_END = 604;
	public static final int E_OP_TEXTURE_GUARD_BEGIN = 605;
	public static final int E_OP_TEXTURE_QUERY_SIZE = 606;
	public static final int E_OP_TEXTURE_QUERY_LOD = 607;
	public static final int E_OP_TEXTURE_QUERY_LEVELS = 608;
	public static final int E_OP_TEXTURE_QUERY_SAMPLES = 609;
	public static final int E_OP_SAMPLING_GUARD_BEGIN = 610;
	public static final int E_OP_TEXTURE = 611;
	public static final int E_OP_TEXTURE_PROJ = 612;
	public static final int E_OP_TEXTURE_LOD = 613;
	public static final int E_OP_TEXTURE_OFFSET = 614;
	public static final int E_OP_TEXTURE_FETCH = 615;
	public static final int E_OP_TEXTURE_FETCH_OFFSET = 616;
	public static final int E_OP_TEXTURE_PROJ_OFFSET = 617;
	public static final int E_OP_TEXTURE_LOD_OFFSET = 618;
	public static final int E_OP_TEXTURE_PROJ_LOD = 619;
	public static final int E_OP_TEXTURE_PROJ_LOD_OFFSET = 620;
	public static final int E_OP_TEXTURE_GRAD = 621;
	public static final int E_OP_TEXTURE_GRAD_OFFSET = 622;
	public static final int E_OP_TEXTURE_PROJ_GRAD = 623;
	public static final int E_OP_TEXTURE_PROJ_GRAD_OFFSET = 624;
	public static final int E_OP_TEXTURE_GATHER = 625;
	public static final int E_OP_TEXTURE_GATHER_OFFSET = 626;
	public static final int E_OP_TEXTURE_GATHER_OFFSETS = 627;
	public static final int E_OP_TEXTURE_CLAMP = 628;
	public static final int E_OP_TEXTURE_OFFSET_CLAMP = 629;
	public static final int E_OP_TEXTURE_GRAD_CLAMP = 630;
	public static final int E_OP_TEXTURE_GRAD_OFFSET_CLAMP = 631;
	public static final int E_OP_TEXTURE_GATHER_LOD = 632;
	public static final int E_OP_TEXTURE_GATHER_LOD_OFFSET = 633;
	public static final int E_OP_TEXTURE_GATHER_LOD_OFFSETS = 634;
	public static final int E_OP_FRAGMENT_MASK_FETCH = 635;
	public static final int E_OP_FRAGMENT_FETCH = 636;
	public static final int E_OP_SPARSE_TEXTURE_GUARD_BEGIN = 637;
	public static final int E_OP_SPARSE_TEXTURE = 638;
	public static final int E_OP_SPARSE_TEXTURE_LOD = 639;
	public static final int E_OP_SPARSE_TEXTURE_OFFSET = 640;
	public static final int E_OP_SPARSE_TEXTURE_FETCH = 641;
	public static final int E_OP_SPARSE_TEXTURE_FETCH_OFFSET = 642;
	public static final int E_OP_SPARSE_TEXTURE_LOD_OFFSET = 643;
	public static final int E_OP_SPARSE_TEXTURE_GRAD = 644;
	public static final int E_OP_SPARSE_TEXTURE_GRAD_OFFSET = 645;
	public static final int E_OP_SPARSE_TEXTURE_GATHER = 646;
	public static final int E_OP_SPARSE_TEXTURE_GATHER_OFFSET = 647;
	public static final int E_OP_SPARSE_TEXTURE_GATHER_OFFSETS = 648;
	public static final int E_OP_SPARSE_TEXELS_RESIDENT = 649;
	public static final int E_OP_SPARSE_TEXTURE_CLAMP = 650;
	public static final int E_OP_SPARSE_TEXTURE_OFFSET_CLAMP = 651;
	public static final int E_OP_SPARSE_TEXTURE_GRAD_CLAMP = 652;
	public static final int E_OP_SPARSE_TEXTURE_GRAD_OFFSET_CLAMP = 653;
	public static final int E_OP_SPARSE_TEXTURE_GATHER_LOD = 654;
	public static final int E_OP_SPARSE_TEXTURE_GATHER_LOD_OFFSET = 655;
	public static final int E_OP_SPARSE_TEXTURE_GATHER_LOD_OFFSETS = 656;
	public static final int E_OP_SPARSE_TEXTURE_GUARD_END = 657;
	public static final int E_OP_IMAGE_FOOTPRINT_GUARD_BEGIN = 658;
	public static final int E_OP_IMAGE_SAMPLE_FOOTPRINT_NV = 659;
	public static final int E_OP_IMAGE_SAMPLE_FOOTPRINT_CLAMP_NV = 660;
	public static final int E_OP_IMAGE_SAMPLE_FOOTPRINT_LOD_NV = 661;
	public static final int E_OP_IMAGE_SAMPLE_FOOTPRINT_GRAD_NV = 662;
	public static final int E_OP_IMAGE_SAMPLE_FOOTPRINT_GRAD_CLAMP_NV = 663;
	public static final int E_OP_IMAGE_FOOTPRINT_GUARD_END = 664;
	public static final int E_OP_SAMPLING_GUARD_END = 665;
	public static final int E_OP_TEXTURE_GUARD_END = 666;
	public static final int E_OP_ADD_CARRY = 667;
	public static final int E_OP_SUB_BORROW = 668;
	public static final int E_OP_UMULEXTENDED = 669;
	public static final int E_OP_IMULEXTENDED = 670;
	public static final int E_OP_BITFIELD_EXTRACT = 671;
	public static final int E_OP_BITFIELD_INSERT = 672;
	public static final int E_OP_BIT_FIELD_REVERSE = 673;
	public static final int E_OP_BIT_COUNT = 674;
	public static final int E_OP_FIND_LSB = 675;
	public static final int E_OP_FIND_MSB = 676;
	public static final int E_OP_COUNT_LEADING_ZEROS = 677;
	public static final int E_OP_COUNT_TRAILING_ZEROS = 678;
	public static final int E_OP_ABS_DIFFERENCE = 679;
	public static final int E_OP_ADD_SATURATE = 680;
	public static final int E_OP_SUB_SATURATE = 681;
	public static final int E_OP_AVERAGE = 682;
	public static final int E_OP_AVERAGE_ROUNDED = 683;
	public static final int E_OP_MUL32X16 = 684;
	public static final int E_OP_TRACE = 685;
	public static final int E_OP_REPORT_INTERSECTION = 686;
	public static final int E_OP_IGNORE_INTERSECTION = 687;
	public static final int E_OP_TERMINATE_RAY = 688;
	public static final int E_OP_EXECUTE_CALLABLE = 689;
	public static final int E_OP_WRITE_PACKED_PRIMITIVE_INDICES4X8_NV = 690;
	public static final int E_OP_RAY_QUERY_INITIALIZE = 691;
	public static final int E_OP_RAY_QUERY_TERMINATE = 692;
	public static final int E_OP_RAY_QUERY_GENERATE_INTERSECTION = 693;
	public static final int E_OP_RAY_QUERY_CONFIRM_INTERSECTION = 694;
	public static final int E_OP_RAY_QUERY_PROCEED = 695;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_TYPE = 696;
	public static final int E_OP_RAY_QUERY_GET_RAY_TMIN = 697;
	public static final int E_OP_RAY_QUERY_GET_RAY_FLAGS = 698;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTIONT = 699;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_CUSTOM_INDEX = 700;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_ID = 701;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_SHADER_BINDING_TABLE_RECORD_OFFSET = 702;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_GEOMETRY_INDEX = 703;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_PRIMITIVE_INDEX = 704;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_BARYCENTRICS = 705;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_FRONT_FACE = 706;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_CANDIDATE_AABBOPAQUE = 707;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_DIRECTION = 708;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_ORIGIN = 709;
	public static final int E_OP_RAY_QUERY_GET_WORLD_RAY_DIRECTION = 710;
	public static final int E_OP_RAY_QUERY_GET_WORLD_RAY_ORIGIN = 711;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_TO_WORLD = 712;
	public static final int E_OP_RAY_QUERY_GET_INTERSECTION_WORLD_TO_OBJECT = 713;
	public static final int E_OP_CLIP = 714;
	public static final int E_OP_IS_FINITE = 715;
	public static final int E_OP_LOG10 = 716;
	public static final int E_OP_RCP = 717;
	public static final int E_OP_SATURATE = 718;
	public static final int E_OP_SIN_COS = 719;
	public static final int E_OP_GEN_MUL = 720;
	public static final int E_OP_DST = 721;
	public static final int E_OP_INTERLOCKED_ADD = 722;
	public static final int E_OP_INTERLOCKED_AND = 723;
	public static final int E_OP_INTERLOCKED_COMPARE_EXCHANGE = 724;
	public static final int E_OP_INTERLOCKED_COMPARE_STORE = 725;
	public static final int E_OP_INTERLOCKED_EXCHANGE = 726;
	public static final int E_OP_INTERLOCKED_MAX = 727;
	public static final int E_OP_INTERLOCKED_MIN = 728;
	public static final int E_OP_INTERLOCKED_OR = 729;
	public static final int E_OP_INTERLOCKED_XOR = 730;
	public static final int E_OP_ALL_MEMORY_BARRIER_WITH_GROUP_SYNC = 731;
	public static final int E_OP_DEVICE_MEMORY_BARRIER = 732;
	public static final int E_OP_DEVICE_MEMORY_BARRIER_WITH_GROUP_SYNC = 733;
	public static final int E_OP_WORKGROUP_MEMORY_BARRIER = 734;
	public static final int E_OP_WORKGROUP_MEMORY_BARRIER_WITH_GROUP_SYNC = 735;
	public static final int E_OP_EVALUATE_ATTRIBUTE_SNAPPED = 736;
	public static final int E_OP_F32TOF16 = 737;
	public static final int E_OP_F16TOF32 = 738;
	public static final int E_OP_LIT = 739;
	public static final int E_OP_TEXTURE_BIAS = 740;
	public static final int E_OP_AS_DOUBLE = 741;
	public static final int E_OP_D3D_COLOR_TO_UBYTE4 = 742;
	public static final int E_OP_METHOD_SAMPLE = 743;
	public static final int E_OP_METHOD_SAMPLE_BIAS = 744;
	public static final int E_OP_METHOD_SAMPLE_CMP = 745;
	public static final int E_OP_METHOD_SAMPLE_CMP_LEVEL_ZERO = 746;
	public static final int E_OP_METHOD_SAMPLE_GRAD = 747;
	public static final int E_OP_METHOD_SAMPLE_LEVEL = 748;
	public static final int E_OP_METHOD_LOAD = 749;
	public static final int E_OP_METHOD_GET_DIMENSIONS = 750;
	public static final int E_OP_METHOD_GET_SAMPLE_POSITION = 751;
	public static final int E_OP_METHOD_GATHER = 752;
	public static final int E_OP_METHOD_CALCULATE_LEVEL_OF_DETAIL = 753;
	public static final int E_OP_METHOD_CALCULATE_LEVEL_OF_DETAIL_UNCLAMPED = 754;
	public static final int E_OP_METHOD_LOAD2 = 755;
	public static final int E_OP_METHOD_LOAD3 = 756;
	public static final int E_OP_METHOD_LOAD4 = 757;
	public static final int E_OP_METHOD_STORE = 758;
	public static final int E_OP_METHOD_STORE2 = 759;
	public static final int E_OP_METHOD_STORE3 = 760;
	public static final int E_OP_METHOD_STORE4 = 761;
	public static final int E_OP_METHOD_INCREMENT_COUNTER = 762;
	public static final int E_OP_METHOD_DECREMENT_COUNTER = 763;
	public static final int E_OP_METHOD_CONSUME = 764;
	public static final int E_OP_METHOD_GATHER_RED = 765;
	public static final int E_OP_METHOD_GATHER_GREEN = 766;
	public static final int E_OP_METHOD_GATHER_BLUE = 767;
	public static final int E_OP_METHOD_GATHER_ALPHA = 768;
	public static final int E_OP_METHOD_GATHER_CMP = 769;
	public static final int E_OP_METHOD_GATHER_CMP_RED = 770;
	public static final int E_OP_METHOD_GATHER_CMP_GREEN = 771;
	public static final int E_OP_METHOD_GATHER_CMP_BLUE = 772;
	public static final int E_OP_METHOD_GATHER_CMP_ALPHA = 773;
	public static final int E_OP_METHOD_APPEND = 774;
	public static final int E_OP_METHOD_RESTART_STRIP = 775;
	public static final int E_OP_MATRIX_SWIZZLE = 776;
	public static final int E_OP_WAVE_GET_LANE_COUNT = 777;
	public static final int E_OP_WAVE_GET_LANE_INDEX = 778;
	public static final int E_OP_WAVE_ACTIVE_COUNT_BITS = 779;
	public static final int E_OP_WAVE_PREFIX_COUNT_BITS = 780;
	public static final int E_OP_READ_CLOCK_SUBGROUP_KHR = 781;
	public static final int E_OP_READ_CLOCK_DEVICE_KHR = 782;

	public static final int ELG_NONE = 0;
	public static final int ELG_POINTS = 1;
	public static final int ELG_LINES = 2;
	public static final int ELG_LINES_ADJACENCY = 3;
	public static final int ELG_LINE_STRIP = 4;
	public static final int ELG_TRIANGLES = 5;
	public static final int ELG_TRIANGLES_ADJACENCY = 6;
	public static final int ELG_TRIANGLE_STRIP = 7;
	public static final int ELG_QUADS = 8;
	public static final int ELG_ISOLINES = 9;

	public static final int ELD_NONE = 0;
	public static final int ELD_ANY = 1;
	public static final int ELD_GREATER = 2;
	public static final int ELD_LESS = 3;
	public static final int ELD_UNCHANGED = 4;

	public static final int EIO_NONE = 0;
	public static final int EIO_PIXEL_INTERLOCK_ORDERED = 1;
	public static final int EIO_PIXEL_INTERLOCK_UNORDERED = 2;
	public static final int EIO_SAMPLE_INTERLOCK_ORDERED = 3;
	public static final int EIO_SAMPLE_INTERLOCK_UNORDERED = 4;
	public static final int EIO_SHADING_RATE_INTERLOCK_ORDERED = 5;
	public static final int EIO_SHADING_RATE_INTERLOCK_UNORDERED = 6;

	public static final int LAYOUT_DERIVATIVE_NONE = 0;
	public static final int LAYOUT_DERIVATIVE_GROUP_QUADS = 1;
	public static final int LAYOUT_DERIVATIVE_GROUP_LINEAR = 2;

	public static final int EVS_NONE = 0;
	public static final int EVS_EQUAL = 1;
	public static final int EVS_FRACTIONAL_EVEN = 2;
	public static final int EVS_FRACTIONAL_ODD = 3;

	public static final int EVO_NONE = 0;
	public static final int EVO_CW = 1;
	public static final int EVO_CCW = 2;

	public static final int E_BLEND_MULTIPLY = 0;
	public static final int E_BLEND_SCREEN = 1;
	public static final int E_BLEND_OVERLAY = 2;
	public static final int E_BLEND_DARKEN = 3;
	public static final int E_BLEND_LIGHTEN = 4;
	public static final int E_BLEND_COLORDODGE = 5;
	public static final int E_BLEND_COLORBURN = 6;
	public static final int E_BLEND_HARDLIGHT = 7;
	public static final int E_BLEND_SOFTLIGHT = 8;
	public static final int E_BLEND_DIFFERENCE = 9;
	public static final int E_BLEND_EXCLUSION = 10;
	public static final int E_BLEND_HSL_HUE = 11;
	public static final int E_BLEND_HSL_SATURATION = 12;
	public static final int E_BLEND_HSL_COLOR = 13;
	public static final int E_BLEND_HSL_LUMINOSITY = 14;
	public static final int E_BLEND_ALL_EQUATIONS = 15;

	public static final int EVQ_TEMPORARY = 0;
	public static final int EVQ_GLOBAL = 1;
	public static final int EVQ_CONST = 2;
	public static final int EVQ_VARYING_IN = 3;
	public static final int EVQ_VARYING_OUT = 4;
	public static final int EVQ_UNIFORM = 5;
	public static final int EVQ_BUFFER = 6;
	public static final int EVQ_SHARED = 7;
	public static final int EVQ_PAYLOAD = 8;
	public static final int EVQ_PAYLOAD_IN = 9;
	public static final int EVQ_HIT_ATTR = 10;
	public static final int EVQ_CALLABLE_DATA = 11;
	public static final int EVQ_CALLABLE_DATA_IN = 12;
	public static final int EVQ_IN = 13;
	public static final int EVQ_OUT = 14;
	public static final int EVQ_IN_OUT = 15;
	public static final int EVQ_CONST_READ_ONLY = 16;
	public static final int EVQ_VERTEX_ID = 17;
	public static final int EVQ_INSTANCE_ID = 18;
	public static final int EVQ_POSITION = 19;
	public static final int EVQ_POINT_SIZE = 20;
	public static final int EVQ_CLIP_VERTEX = 21;
	public static final int EVQ_FACE = 22;
	public static final int EVQ_FRAG_COORD = 23;
	public static final int EVQ_POINT_COORD = 24;
	public static final int EVQ_FRAG_COLOR = 25;
	public static final int EVQ_FRAG_DEPTH = 26;

	public static final int ESI_UNIFORM = 0;
	public static final int ESI_INPUT = 1;
	public static final int ESI_OUTPUT = 2;
	public static final int ESI_NONE = 3;

	public static final int ESD_NONE = 0;
	public static final int ESD_1D = 1;
	public static final int ESD_2D = 2;
	public static final int ESD_3D = 3;
	public static final int ESD_CUBE = 4;
	public static final int ESD_RECT = 5;
	public static final int ESD_BUFFER = 6;
	public static final int ESD_SUBPASS = 7;

	public static final int ELF_NONE = 0;
	public static final int ELF_RGBA32F = 1;
	public static final int ELF_RGBA16F = 2;
	public static final int ELF_R32F = 3;
	public static final int ELF_RGBA8 = 4;
	public static final int ELF_RGBA8_SNORM = 5;
	public static final int ELF_ES_FLOAT_GUARD = 6;
	public static final int ELF_RG32F = 7;
	public static final int ELF_RG16F = 8;
	public static final int ELF_R11F_G11F_B10F = 9;
	public static final int ELF_R16F = 10;
	public static final int ELF_RGBA16 = 11;
	public static final int ELF_RGB10A2 = 12;
	public static final int ELF_RG16 = 13;
	public static final int ELF_RG8 = 14;
	public static final int ELF_R16 = 15;
	public static final int ELF_R8 = 16;
	public static final int ELF_RGBA16_SNORM = 17;
	public static final int ELF_RG16_SNORM = 18;
	public static final int ELF_RG8_SNORM = 19;
	public static final int ELF_R16_SNORM = 20;
	public static final int ELF_R8_SNORM = 21;
	public static final int ELF_FLOAT_GUARD = 22;
	public static final int ELF_RGBA32I = 23;
	public static final int ELF_RGBA16I = 24;
	public static final int ELF_RGBA8I = 25;
	public static final int ELF_R32I = 26;
	public static final int ELF_ES_INT_GUARD = 27;
	public static final int ELF_RG32I = 28;
	public static final int ELF_RG16I = 29;
	public static final int ELF_RG8I = 30;
	public static final int ELF_R16I = 31;
	public static final int ELF_R8I = 32;
	public static final int ELF_INT_GUARD = 33;
	public static final int ELF_RGBA32UI = 34;
	public static final int ELF_RGBA16UI = 35;
	public static final int ELF_RGBA8UI = 36;
	public static final int ELF_R32UI = 37;
	public static final int ELF_ES_UINT_GUARD = 38;
	public static final int ELF_RG32UI = 39;
	public static final int ELF_RG16UI = 40;
	public static final int ELF_RGB10A2UI = 41;
	public static final int ELF_RG8UI = 42;
	public static final int ELF_R16UI = 43;
	public static final int ELF_R8UI = 44;

	public static final int EBV_NONE = 0;
	public static final int EBV_NUM_WORK_GROUPS = 1;
	public static final int EBV_WORK_GROUP_SIZE = 2;
	public static final int EBV_WORK_GROUP_ID = 3;
	public static final int EBV_LOCAL_INVOCATION_ID = 4;
	public static final int EBV_GLOBAL_INVOCATION_ID = 5;
	public static final int EBV_LOCAL_INVOCATION_INDEX = 6;
	public static final int EBV_NUM_SUBGROUPS = 7;
	public static final int EBV_SUBGROUP_ID = 8;
	public static final int EBV_SUB_GROUP_SIZE = 9;
	public static final int EBV_SUB_GROUP_INVOCATION = 10;
	public static final int EBV_SUB_GROUP_EQ_MASK = 11;
	public static final int EBV_SUB_GROUP_GE_MASK = 12;
	public static final int EBV_SUB_GROUP_GT_MASK = 13;
	public static final int EBV_SUB_GROUP_LE_MASK = 14;
	public static final int EBV_SUB_GROUP_LT_MASK = 15;
	public static final int EBV_SUBGROUP_SIZE2 = 16;
	public static final int EBV_SUBGROUP_INVOCATION2 = 17;
	public static final int EBV_SUBGROUP_EQ_MASK2 = 18;
	public static final int EBV_SUBGROUP_GE_MASK2 = 19;
	public static final int EBV_SUBGROUP_GT_MASK2 = 20;
	public static final int EBV_SUBGROUP_LE_MASK2 = 21;
	public static final int EBV_SUBGROUP_LT_MASK2 = 22;
	public static final int EBV_VERTEX_ID = 23;
	public static final int EBV_INSTANCE_ID = 24;
	public static final int EBV_VERTEX_INDEX = 25;
	public static final int EBV_INSTANCE_INDEX = 26;
	public static final int EBV_BASE_VERTEX = 27;
	public static final int EBV_BASE_INSTANCE = 28;
	public static final int EBV_DRAW_ID = 29;
	public static final int EBV_POSITION = 30;
	public static final int EBV_POINT_SIZE = 31;
	public static final int EBV_CLIP_VERTEX = 32;
	public static final int EBV_CLIP_DISTANCE = 33;
	public static final int EBV_CULL_DISTANCE = 34;
	public static final int EBV_NORMAL = 35;
	public static final int EBV_VERTEX = 36;
	public static final int EBV_MULTI_TEX_COOR0 = 37;
	public static final int EBV_MULTI_TEX_COORD1 = 38;
	public static final int EBV_MULTI_TEX_COORD2 = 39;
	public static final int EBV_MULTI_TEX_COORD3 = 40;
	public static final int EBV_MULTI_TEX_COORD4 = 41;
	public static final int EBV_MULTI_TEX_COORD5 = 42;
	public static final int EBV_MULTI_TEX_COORD6 = 43;
	public static final int EBV_MULTI_TEX_COORD7 = 44;
	public static final int EBV_FRONT_COLOR = 45;
	public static final int EBV_BACK_COLOR = 46;
	public static final int EBV_FRONT_SECONDARY_COLOR = 47;
	public static final int EBV_BACK_SECONDARY_COLOR = 48;
	public static final int EBV_TEX_COORD = 49;
	public static final int EBV_FOG_FRAG_COORD = 50;
	public static final int EBV_INVOCATION_ID = 51;
	public static final int EBV_PRIMITIVE_ID = 52;
	public static final int EBV_LAYER = 53;
	public static final int EBV_VIEWPORT_INDEX = 54;
	public static final int EBV_PATCH_VERTICES = 55;
	public static final int EBV_TESS_LEVEL_OUTER = 56;
	public static final int EBV_TESS_LEVEL_INNER = 57;
	public static final int EBV_BOUNDING_BOX = 58;
	public static final int EBV_TESS_COORD = 59;
	public static final int EBV_COLOR = 60;
	public static final int EBV_SECONDARY_COLOR = 61;
	public static final int EBV_FACE = 62;
	public static final int EBV_FRAG_COORD = 63;
	public static final int EBV_POINT_COORD = 64;
	public static final int EBV_FRAG_COLOR = 65;
	public static final int EBV_FRAG_DATA = 66;
	public static final int EBV_FRAG_DEPTH = 67;
	public static final int EBV_FRAG_STENCIL_REF = 68;
	public static final int EBV_SAMPLE_ID = 69;
	public static final int EBV_SAMPLE_POSITION = 70;
	public static final int EBV_SAMPLE_MASK = 71;
	public static final int EBV_HELPER_INVOCATION = 72;
	public static final int EBV_BARY_COORD_NO_PERSP = 73;
	public static final int EBV_BARY_COORD_NO_PERSP_CENTROID = 74;
	public static final int EBV_BARY_COORD_NO_PERSP_SAMPLE = 75;
	public static final int EBV_BARY_COORD_SMOOTH = 76;
	public static final int EBV_BARY_COORD_SMOOTH_CENTROID = 77;
	public static final int EBV_BARY_COORD_SMOOTH_SAMPLE = 78;
	public static final int EBV_BARY_COORD_PULL_MODEL = 79;
	public static final int EBV_VIEW_INDEX = 80;
	public static final int EBV_DEVICE_INDEX = 81;
	public static final int EBV_FRAG_SIZE_EXT = 82;
	public static final int EBV_FRAG_INVOCATION_COUNT_EXT = 83;
	public static final int EBV_SECONDARY_FRAG_DATA_EXT = 84;
	public static final int EBV_SECONDARY_FRAG_COLOR_EXT = 85;
	public static final int EBV_VIEWPORT_MASK_NV = 86;
	public static final int EBV_SECONDARY_POSITION_NV = 87;
	public static final int EBV_SECONDARY_VIEWPORT_MASK_NV = 88;
	public static final int EBV_POSITIONPER_VIEW_NV = 89;
	public static final int EBV_VIEWPORT_MASK_PER_VIEW_NV = 90;
	public static final int EBV_FRAG_FULLY_COVERED_NV = 91;
	public static final int EBV_FRAGMENT_SIZE_NV = 92;
	public static final int EBV_INVOCATIONS_PER_PIXEL_NV = 93;
	public static final int EBV_LAUNCH_ID = 94;
	public static final int EBV_LAUNCH_SIZE = 95;
	public static final int EBV_INSTANCE_CUSTOM_INDEX = 96;
	public static final int EBV_GEOMETRY_INDEX = 97;
	public static final int EBV_WORLD_RAY_ORIGIN = 98;
	public static final int EBV_WORLD_RAY_DIRECTION = 99;
	public static final int EBV_OBJECT_RAY_ORIGIN = 100;
	public static final int EBV_OBJECT_RAY_DIRECTION = 101;
	public static final int EBV_RAY_TMIN = 102;
	public static final int EBV_RAY_TMAX = 103;
	public static final int EBV_HIT_T = 104;
	public static final int EBV_HIT_KIND = 105;
	public static final int EBV_OBJECT_TO_WORLD = 106;
	public static final int EBV_OBJECT_TO_WORLD3X4 = 107;
	public static final int EBV_WORLD_TO_OBJECT = 108;
	public static final int EBV_WORLD_TO_OBJECT3X4 = 109;
	public static final int EBV_INCOMING_RAY_FLAGS = 110;
	public static final int EBV_BARY_COORD_NV = 111;
	public static final int EBV_BARY_COORD_NO_PERSP_NV = 112;
	public static final int EBV_TASK_COUNT_NV = 113;
	public static final int EBV_PRIMITIVE_COUNT_NV = 114;
	public static final int EBV_PRIMITIVE_INDICES_NV = 115;
	public static final int EBV_CLIP_DISTANCE_PER_VIEW_NV = 116;
	public static final int EBV_CULL_DISTANCE_PER_VIEW_NV = 117;
	public static final int EBV_LAYER_PER_VIEW_NV = 118;
	public static final int EBV_MESH_VIEW_COUNT_NV = 119;
	public static final int EBV_MESH_VIEW_INDICES_NV = 120;
	public static final int EBV_WARPS_PER_SM = 121;
	public static final int EBV_SM_COUNT = 122;
	public static final int EBV_WARP_ID = 123;
	public static final int EBV_SM_ID = 124;
	public static final int EBV_FRAG_DEPTH_GREATER = 125;
	public static final int EBV_FRAG_DEPTH_LESSER = 126;
	public static final int EBV_GS_OUTPUT_STREAM = 127;
	public static final int EBV_OUTPUT_PATCH = 128;
	public static final int EBV_INPUT_PATCH = 129;
	public static final int EBV_APPEND_CONSUME = 130;
	public static final int EBV_RW_STRUCTURED_BUFFER = 131;
	public static final int EBV_STRUCTURED_BUFFER = 132;
	public static final int EBV_BYTE_ADDRESS_BUFFER = 133;
	public static final int EBV_RW_BYTE_ADDRESS_BUFFER = 134;

	public static final int EAT_NONE = 0;
	public static final int EAT_ALLOW_UAV_CONDITION = 1;
	public static final int EAT_BRANCH = 2;
	public static final int EAT_CALL = 3;
	public static final int EAT_DOMAIN = 4;
	public static final int EAT_EARLY_DEPTH_STENCIL = 5;
	public static final int EAT_FAST_OPT = 6;
	public static final int EAT_FLATTEN = 7;
	public static final int EAT_FORCE_CASE = 8;
	public static final int EAT_INSTANCE = 9;
	public static final int EAT_MAX_TESS_FACTOR = 10;
	public static final int EAT_NUM_THREADS = 11;
	public static final int EAT_MAX_VERTEX_COUNT = 12;
	public static final int EAT_OUTPUT_CONTROL_POINTS = 13;
	public static final int EAT_OUTPUT_TOPOLOGY = 14;
	public static final int EAT_PARTITIONING = 15;
	public static final int EAT_PATCH_CONSTANT_FUNC = 16;
	public static final int EAT_PATCH_SIZE = 17;
	public static final int EAT_UNROLL = 18;
	public static final int EAT_LOOP = 19;
	public static final int EAT_BINDING = 20;
	public static final int EAT_GLOBAL_BINDING = 21;
	public static final int EAT_LOCATION = 22;
	public static final int EAT_INPUT_ATTACHMENT = 23;
	public static final int EAT_BUILTIN = 24;
	public static final int EAT_PUSH_CONSTANT = 25;
	public static final int EAT_CONSTANT_ID = 26;
	public static final int EAT_DEPENDENCY_INFINITE = 27;
	public static final int EAT_DEPENDENCY_LENGTH = 28;
	public static final int EAT_MIN_ITERATIONS = 29;
	public static final int EAT_MAX_ITERATIONS = 30;
	public static final int EAT_ITERATION_MULTIPLE = 31;
	public static final int EAT_PEEL_COUNT = 32;
	public static final int EAT_PARTIAL_COUNT = 33;
	public static final int EAT_FORMAT_RGBA32F = 34;
	public static final int EAT_FORMAT_RGBA16F = 35;
	public static final int EAT_FORMAT_R32F = 36;
	public static final int EAT_FORMAT_RGBA8 = 37;
	public static final int EAT_FORMAT_RGBA8_SNORM = 38;
	public static final int EAT_FORMAT_RG32F = 39;
	public static final int EAT_FORMAT_RG16F = 40;
	public static final int EAT_FORMAT_R11F_G11F_B10F = 41;
	public static final int EAT_FORMAT_R16F = 42;
	public static final int EAT_FORMAT_RGBA16 = 43;
	public static final int EAT_FORMAT_RGB10_A2 = 44;
	public static final int EAT_FORMAT_RG16 = 45;
	public static final int EAT_FORMAT_RG8 = 46;
	public static final int EAT_FORMAT_R16 = 47;
	public static final int EAT_FORMAT_R8 = 48;
	public static final int EAT_FORMAT_RGBA16_SNORM = 49;
	public static final int EAT_FORMAT_RG16_SNORM = 50;
	public static final int EAT_FORMAT_RG8_SNORM = 51;
	public static final int EAT_FORMAT_R16_SNORM = 52;
	public static final int EAT_FORMAT_R8_SNORM = 53;
	public static final int EAT_FORMAT_RGBA32I = 54;
	public static final int EAT_FORMAT_RGBA16I = 55;
	public static final int EAT_FORMAT_RGBA8I = 56;
	public static final int EAT_FORMAT_R32I = 57;
	public static final int EAT_FORMAT_RG32I = 58;
	public static final int EAT_FORMAT_RG16I = 59;
	public static final int EAT_FORMAT_RG8I = 60;
	public static final int EAT_FORMAT_R16I = 61;
	public static final int EAT_FORMAT_R8I = 62;
	public static final int EAT_FORMAT_RGBA32UI = 63;
	public static final int EAT_FORMAT_RGBA16UI = 64;
	public static final int EAT_FORMAT_RGBA8UI = 65;
	public static final int EAT_FORMAT_R32UI = 66;
	public static final int EAT_FORMAT_RGB10A2UI = 67;
	public static final int EAT_FORMAT_RG32UI = 68;
	public static final int EAT_FORMAT_RG16UI = 69;
	public static final int EAT_FORMAT_RG8UI = 70;
	public static final int EAT_FORMAT_R16UI = 71;
	public static final int EAT_FORMAT_R8UI = 72;
	public static final int EAT_FORMAT_UNKNOWN = 73;
	public static final int EAT_NON_WRITABLE = 74;
	public static final int EAT_NON_READABLE = 75;

	public static final int PL_BAD = 0;
	public static final int PL_LOGICAL_OR = 1;
	public static final int PL_LOGICAL_XOR = 2;
	public static final int PL_LOGICAL_AND = 3;
	public static final int PL_BITWISE_OR = 4;
	public static final int PL_BITWISE_XOR = 5;
	public static final int PL_BITWISE_AND = 6;
	public static final int PL_EQUALITY = 7;
	public static final int PL_RELATIONAL = 8;
	public static final int PL_SHIFT = 9;
	public static final int PL_ADD = 10;
	public static final int PL_MUL = 11;

	public static final int E_H_TOK_NONE = 0;
	public static final int E_H_TOK_STATIC = 1;
	public static final int E_H_TOK_CONST = 2;
	public static final int E_H_TOK_SNORM = 3;
	public static final int E_H_TOK_UNORM = 4;
	public static final int E_H_TOK_EXTERN = 5;
	public static final int E_H_TOK_UNIFORM = 6;
	public static final int E_H_TOK_VOLATILE = 7;
	public static final int E_H_TOK_PRECISE = 8;
	public static final int E_H_TOK_SHARED = 9;
	public static final int E_H_TOK_GROUP_SHARED = 10;
	public static final int E_H_TOK_LINEAR = 11;
	public static final int E_H_TOK_CENTROID = 12;
	public static final int E_H_TOK_NOINTERPOLATION = 13;
	public static final int E_H_TOK_NOPERSPECTIVE = 14;
	public static final int E_H_TOK_SAMPLE = 15;
	public static final int E_H_TOK_ROW_MAJOR = 16;
	public static final int E_H_TOK_COLUMN_MAJOR = 17;
	public static final int E_H_TOK_PACK_OFFSET = 18;
	public static final int E_H_TOK_IN = 19;
	public static final int E_H_TOK_OUT = 20;
	public static final int E_H_TOK_IN_OUT = 21;
	public static final int E_H_TOK_LAYOUT = 22;
	public static final int E_H_TOK_GLOBALLY_COHERENT = 23;
	public static final int E_H_TOK_INLINE = 24;
	public static final int E_H_TOK_POINT = 25;
	public static final int E_H_TOK_LINE = 26;
	public static final int E_H_TOK_TRIANGLE = 27;
	public static final int E_H_TOK_LINEADJ = 28;
	public static final int E_H_TOK_TRIANGLE_ADJ = 29;
	public static final int E_H_TOK_POINT_STREAM = 30;
	public static final int E_H_TOK_LINE_STREAM = 31;
	public static final int E_H_TOK_TRIANGLE_STREAM = 32;
	public static final int E_H_TOK_INPUT_PATCH = 33;
	public static final int E_H_TOK_OUTPUT_PATCH = 34;
	public static final int E_H_TOK_BUFFER = 35;
	public static final int E_H_TOK_VECTOR = 36;
	public static final int E_H_TOK_MATRIX = 37;
	public static final int E_H_TOK_VOID = 38;
	public static final int E_H_TOK_STRING = 39;
	public static final int E_H_TOK_BOOL = 40;
	public static final int E_H_TOK_INT = 41;
	public static final int E_H_TOK_UINT = 42;
	public static final int E_H_TOK_UINT64 = 43;
	public static final int E_H_TOK_DWORD = 44;
	public static final int E_H_TOK_HALF = 45;
	public static final int E_H_TOK_FLOAT = 46;
	public static final int E_H_TOK_DOUBLE = 47;
	public static final int E_H_TOK_MIN16FLOAT = 48;
	public static final int E_H_TOK_MIN10FLOAT = 49;
	public static final int E_H_TOK_MIN16INT = 50;
	public static final int E_H_TOK_MIN12INT = 51;
	public static final int E_H_TOK_MIN16UINT = 52;
	public static final int E_H_TOK_BOOL1 = 53;
	public static final int E_H_TOK_BOOL2 = 54;
	public static final int E_H_TOK_BOOL3 = 55;
	public static final int E_H_TOK_BOOL4 = 56;
	public static final int E_H_TOK_FLOAT1 = 57;
	public static final int E_H_TOK_FLOAT2 = 58;
	public static final int E_H_TOK_FLOAT3 = 59;
	public static final int E_H_TOK_FLOAT4 = 60;
	public static final int E_H_TOK_INT1 = 61;
	public static final int E_H_TOK_INT2 = 62;
	public static final int E_H_TOK_INT3 = 63;
	public static final int E_H_TOK_INT4 = 64;
	public static final int E_H_TOK_DOUBLE1 = 65;
	public static final int E_H_TOK_DOUBLE2 = 66;
	public static final int E_H_TOK_DOUBLE3 = 67;
	public static final int E_H_TOK_DOUBLE4 = 68;
	public static final int E_H_TOK_UINT1 = 69;
	public static final int E_H_TOK_UINT2 = 70;
	public static final int E_H_TOK_UINT3 = 71;
	public static final int E_H_TOK_UINT4 = 72;
	public static final int E_H_TOK_HALF1 = 73;
	public static final int E_H_TOK_HALF2 = 74;
	public static final int E_H_TOK_HALF3 = 75;
	public static final int E_H_TOK_HALF4 = 76;
	public static final int E_H_TOK_MIN16FLOAT1 = 77;
	public static final int E_H_TOK_MIN16FLOAT2 = 78;
	public static final int E_H_TOK_MIN16FLOAT3 = 79;
	public static final int E_H_TOK_MIN16FLOAT4 = 80;
	public static final int E_H_TOK_MIN10FLOAT1 = 81;
	public static final int E_H_TOK_MIN10FLOAT2 = 82;
	public static final int E_H_TOK_MIN10FLOAT3 = 83;
	public static final int E_H_TOK_MIN10FLOAT4 = 84;
	public static final int E_H_TOK_MIN16INT1 = 85;
	public static final int E_H_TOK_MIN16INT2 = 86;
	public static final int E_H_TOK_MIN16INT3 = 87;
	public static final int E_H_TOK_MIN16INT4 = 88;
	public static final int E_H_TOK_MIN12INT1 = 89;
	public static final int E_H_TOK_MIN12INT2 = 90;
	public static final int E_H_TOK_MIN12INT3 = 91;
	public static final int E_H_TOK_MIN12INT4 = 92;
	public static final int E_H_TOK_MIN16UINT1 = 93;
	public static final int E_H_TOK_MIN16UINT2 = 94;
	public static final int E_H_TOK_MIN16UINT3 = 95;
	public static final int E_H_TOK_MIN16UINT4 = 96;
	public static final int E_H_TOK_INT1X1 = 97;
	public static final int E_H_TOK_INT1X2 = 98;
	public static final int E_H_TOK_INT1X3 = 99;
	public static final int E_H_TOK_INT1X4 = 100;
	public static final int E_H_TOK_INT2X1 = 101;
	public static final int E_H_TOK_INT2X2 = 102;
	public static final int E_H_TOK_INT2X3 = 103;
	public static final int E_H_TOK_INT2X4 = 104;
	public static final int E_H_TOK_INT3X1 = 105;
	public static final int E_H_TOK_INT3X2 = 106;
	public static final int E_H_TOK_INT3X3 = 107;
	public static final int E_H_TOK_INT3X4 = 108;
	public static final int E_H_TOK_INT4X1 = 109;
	public static final int E_H_TOK_INT4X2 = 110;
	public static final int E_H_TOK_INT4X3 = 111;
	public static final int E_H_TOK_INT4X4 = 112;
	public static final int E_H_TOK_UINT1X1 = 113;
	public static final int E_H_TOK_UINT1X2 = 114;
	public static final int E_H_TOK_UINT1X3 = 115;
	public static final int E_H_TOK_UINT1X4 = 116;
	public static final int E_H_TOK_UINT2X1 = 117;
	public static final int E_H_TOK_UINT2X2 = 118;
	public static final int E_H_TOK_UINT2X3 = 119;
	public static final int E_H_TOK_UINT2X4 = 120;
	public static final int E_H_TOK_UINT3X1 = 121;
	public static final int E_H_TOK_UINT3X2 = 122;
	public static final int E_H_TOK_UINT3X3 = 123;
	public static final int E_H_TOK_UINT3X4 = 124;
	public static final int E_H_TOK_UINT4X1 = 125;
	public static final int E_H_TOK_UINT4X2 = 126;
	public static final int E_H_TOK_UINT4X3 = 127;
	public static final int E_H_TOK_UINT4X4 = 128;
	public static final int E_H_TOK_BOOL1X1 = 129;
	public static final int E_H_TOK_BOOL1X2 = 130;
	public static final int E_H_TOK_BOOL1X3 = 131;
	public static final int E_H_TOK_BOOL1X4 = 132;
	public static final int E_H_TOK_BOOL2X1 = 133;
	public static final int E_H_TOK_BOOL2X2 = 134;
	public static final int E_H_TOK_BOOL2X3 = 135;
	public static final int E_H_TOK_BOOL2X4 = 136;
	public static final int E_H_TOK_BOOL3X1 = 137;
	public static final int E_H_TOK_BOOL3X2 = 138;
	public static final int E_H_TOK_BOOL3X3 = 139;
	public static final int E_H_TOK_BOOL3X4 = 140;
	public static final int E_H_TOK_BOOL4X1 = 141;
	public static final int E_H_TOK_BOOL4X2 = 142;
	public static final int E_H_TOK_BOOL4X3 = 143;
	public static final int E_H_TOK_BOOL4X4 = 144;
	public static final int E_H_TOK_FLOAT1X1 = 145;
	public static final int E_H_TOK_FLOAT1X2 = 146;
	public static final int E_H_TOK_FLOAT1X3 = 147;
	public static final int E_H_TOK_FLOAT1X4 = 148;
	public static final int E_H_TOK_FLOAT2X1 = 149;
	public static final int E_H_TOK_FLOAT2X2 = 150;
	public static final int E_H_TOK_FLOAT2X3 = 151;
	public static final int E_H_TOK_FLOAT2X4 = 152;
	public static final int E_H_TOK_FLOAT3X1 = 153;
	public static final int E_H_TOK_FLOAT3X2 = 154;
	public static final int E_H_TOK_FLOAT3X3 = 155;
	public static final int E_H_TOK_FLOAT3X4 = 156;
	public static final int E_H_TOK_FLOAT4X1 = 157;
	public static final int E_H_TOK_FLOAT4X2 = 158;
	public static final int E_H_TOK_FLOAT4X3 = 159;
	public static final int E_H_TOK_FLOAT4X4 = 160;
	public static final int E_H_TOK_HALF1X1 = 161;
	public static final int E_H_TOK_HALF1X2 = 162;
	public static final int E_H_TOK_HALF1X3 = 163;
	public static final int E_H_TOK_HALF1X4 = 164;
	public static final int E_H_TOK_HALF2X1 = 165;
	public static final int E_H_TOK_HALF2X2 = 166;
	public static final int E_H_TOK_HALF2X3 = 167;
	public static final int E_H_TOK_HALF2X4 = 168;
	public static final int E_H_TOK_HALF3X1 = 169;
	public static final int E_H_TOK_HALF3X2 = 170;
	public static final int E_H_TOK_HALF3X3 = 171;
	public static final int E_H_TOK_HALF3X4 = 172;
	public static final int E_H_TOK_HALF4X1 = 173;
	public static final int E_H_TOK_HALF4X2 = 174;
	public static final int E_H_TOK_HALF4X3 = 175;
	public static final int E_H_TOK_HALF4X4 = 176;
	public static final int E_H_TOK_DOUBLE1X1 = 177;
	public static final int E_H_TOK_DOUBLE1X2 = 178;
	public static final int E_H_TOK_DOUBLE1X3 = 179;
	public static final int E_H_TOK_DOUBLE1X4 = 180;
	public static final int E_H_TOK_DOUBLE2X1 = 181;
	public static final int E_H_TOK_DOUBLE2X2 = 182;
	public static final int E_H_TOK_DOUBLE2X3 = 183;
	public static final int E_H_TOK_DOUBLE2X4 = 184;
	public static final int E_H_TOK_DOUBLE3X1 = 185;
	public static final int E_H_TOK_DOUBLE3X2 = 186;
	public static final int E_H_TOK_DOUBLE3X3 = 187;
	public static final int E_H_TOK_DOUBLE3X4 = 188;
	public static final int E_H_TOK_DOUBLE4X1 = 189;
	public static final int E_H_TOK_DOUBLE4X2 = 190;
	public static final int E_H_TOK_DOUBLE4X3 = 191;
	public static final int E_H_TOK_DOUBLE4X4 = 192;
	public static final int E_H_TOK_SAMPLER = 193;
	public static final int E_H_TOK_SAMPLER1D = 194;
	public static final int E_H_TOK_SAMPLER2D = 195;
	public static final int E_H_TOK_SAMPLER3D = 196;
	public static final int E_H_TOK_SAMPLER_CUBE = 197;
	public static final int E_H_TOK_SAMPLER_STATE = 198;
	public static final int E_H_TOK_SAMPLER_COMPARISON_STATE = 199;
	public static final int E_H_TOK_TEXTURE = 200;
	public static final int E_H_TOK_TEXTURE1D = 201;
	public static final int E_H_TOK_TEXTURE1DARRAY = 202;
	public static final int E_H_TOK_TEXTURE2D = 203;
	public static final int E_H_TOK_TEXTURE2DARRAY = 204;
	public static final int E_H_TOK_TEXTURE3D = 205;
	public static final int E_H_TOK_TEXTURE_CUBE = 206;
	public static final int E_H_TOK_TEXTURE_CUBEARRAY = 207;
	public static final int E_H_TOK_TEXTURE2D_MS = 208;
	public static final int E_H_TOK_TEXTURE2D_MSARRAY = 209;
	public static final int E_H_TOK_RW_TEXTURE1D = 210;
	public static final int E_H_TOK_RW_TEXTURE1DARRAY = 211;
	public static final int E_H_TOK_RW_TEXTURE2D = 212;
	public static final int E_H_TOK_RW_TEXTURE2DARRAY = 213;
	public static final int E_H_TOK_RW_TEXTURE3D = 214;
	public static final int E_H_TOK_RW_BUFFER = 215;
	public static final int E_H_TOK_SUBPASS_INPUT = 216;
	public static final int E_H_TOK_SUBPASS_INPUT_MS = 217;
	public static final int E_H_TOK_APPEND_STRUCTURED_BUFFER = 218;
	public static final int E_H_TOK_BYTE_ADDRESS_BUFFER = 219;
	public static final int E_H_TOK_CONSUME_STRUCTURED_BUFFER = 220;
	public static final int E_H_TOK_RW_BYTE_ADDRESS_BUFFER = 221;
	public static final int E_H_TOK_RW_STRUCTURED_BUFFER = 222;
	public static final int E_H_TOK_STRUCTURED_BUFFER = 223;
	public static final int E_H_TOK_TEXTURE_BUFFER = 224;
	public static final int E_H_TOK_IDENTIFIER = 225;
	public static final int E_H_TOK_CLASS = 226;
	public static final int E_H_TOK_STRUCT = 227;
	public static final int E_H_TOK_CBUFFER = 228;
	public static final int E_H_TOK_TBUFFER = 229;
	public static final int E_H_TOK_TYPEDEF = 230;
	public static final int E_H_TOK_THIS = 231;
	public static final int E_H_TOK_NAMESPACE = 232;
	public static final int E_H_TOK_CONSTANT_BUFFER = 233;
	public static final int E_H_TOK_FLOAT16_CONSTANT = 234;
	public static final int E_H_TOK_FLOAT_CONSTANT = 235;
	public static final int E_H_TOK_DOUBLE_CONSTANT = 236;
	public static final int E_H_TOK_INT_CONSTANT = 237;
	public static final int E_H_TOK_UINT_CONSTANT = 238;
	public static final int E_H_TOK_BOOL_CONSTANT = 239;
	public static final int E_H_TOK_STRING_CONSTANT = 240;
	public static final int E_H_TOK_FOR = 241;
	public static final int E_H_TOK_DO = 242;
	public static final int E_H_TOK_WHILE = 243;
	public static final int E_H_TOK_BREAK = 244;
	public static final int E_H_TOK_CONTINUE = 245;
	public static final int E_H_TOK_IF = 246;
	public static final int E_H_TOK_ELSE = 247;
	public static final int E_H_TOK_DISCARD = 248;
	public static final int E_H_TOK_RETURN = 249;
	public static final int E_H_TOK_SWITCH = 250;
	public static final int E_H_TOK_CASE = 251;
	public static final int E_H_TOK_DEFAULT = 252;
	public static final int E_H_TOK_LEFT_OP = 253;
	public static final int E_H_TOK_RIGHT_OP = 254;
	public static final int E_H_TOK_INC_OP = 255;
	public static final int E_H_TOK_DEC_OP = 256;
	public static final int E_H_TOK_LE_OP = 257;
	public static final int E_H_TOK_GE_OP = 258;
	public static final int E_H_TOK_EQ_OP = 259;
	public static final int E_H_TOK_NE_OP = 260;
	public static final int E_H_TOK_AND_OP = 261;
	public static final int E_H_TOK_OR_OP = 262;
	public static final int E_H_TOK_XOR_OP = 263;
	public static final int E_H_TOK_ASSIGN = 264;
	public static final int E_H_TOK_MUL_ASSIGN = 265;
	public static final int E_H_TOK_DIV_ASSIGN = 266;
	public static final int E_H_TOK_ADD_ASSIGN = 267;
	public static final int E_H_TOK_MOD_ASSIGN = 268;
	public static final int E_H_TOK_LEFT_ASSIGN = 269;
	public static final int E_H_TOK_RIGHT_ASSIGN = 270;
	public static final int E_H_TOK_AND_ASSIGN = 271;
	public static final int E_H_TOK_XOR_ASSIGN = 272;
	public static final int E_H_TOK_OR_ASSIGN = 273;
	public static final int E_H_TOK_SUB_ASSIGN = 274;
	public static final int E_H_TOK_LEFT_PAREN = 275;
	public static final int E_H_TOK_RIGHT_PAREN = 276;
	public static final int E_H_TOK_LEFT_BRACKET = 277;
	public static final int E_H_TOK_RIGHT_BRACKET = 278;
	public static final int E_H_TOK_LEFT_BRACE = 279;
	public static final int E_H_TOK_RIGHT_BRACE = 280;
	public static final int E_H_TOK_DOT = 281;
	public static final int E_H_TOK_COMMA = 282;
	public static final int E_H_TOK_COLON = 283;
	public static final int E_H_TOK_COLON_COLON = 284;
	public static final int E_H_TOK_SEMICOLON = 285;
	public static final int E_H_TOK_BANG = 286;
	public static final int E_H_TOK_DASH = 287;
	public static final int E_H_TOK_TILDE = 288;
	public static final int E_H_TOK_PLUS = 289;
	public static final int E_H_TOK_STAR = 290;
	public static final int E_H_TOK_SLASH = 291;
	public static final int E_H_TOK_PERCENT = 292;
	public static final int E_H_TOK_LEFT_ANGLE = 293;
	public static final int E_H_TOK_RIGHT_ANGLE = 294;
	public static final int E_H_TOK_VERTICAL_BAR = 295;
	public static final int E_H_TOK_CARET = 296;
	public static final int E_H_TOK_AMPERSAND = 297;
	public static final int E_H_TOK_QUESTION = 298;

	public static final int EV_PRE_VISIT = 0;
	public static final int EV_IN_VISIT = 1;
	public static final int EV_POST_VISIT = 2;

	public static final int ELP_NONE = 0;
	public static final int ELP_SHARED = 1;
	public static final int ELP_STD140 = 2;
	public static final int ELP_STD430 = 3;
	public static final int ELP_PACKED = 4;
	public static final int ELP_SCALAR = 5;

	public static final int ELM_NONE = 0;
	public static final int ELM_ROW_MAJOR = 1;
	public static final int ELM_COLUMN_MAJOR = 2;

	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES = 1 << 0;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT8 = 1 << 1;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT16 = 1 << 2;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT32 = 1 << 3;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT64 = 1 << 4;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT16 = 1 << 5;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT32 = 1 << 6;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT64 = 1 << 7;
	public static final int TNUMERICFEATURES_FEATURE_SHADER_IMPLICIT_CONVERSIONS = 1 << 8;
	public static final int TNUMERICFEATURES_FEATURE_GPU_SHADER_FP64 = 1 << 9;
	public static final int TNUMERICFEATURES_FEATURE_GPU_SHADER_INT16 = 1 << 10;
	public static final int TNUMERICFEATURES_FEATURE_GPU_SHADER_HALF_FLOAT = 1 << 11;

	public static final int SPIRVBIN_BASE_T_OPTIONS_NONE = 0;
	public static final int SPIRVBIN_BASE_T_OPTIONS_STRIP = (1 << 0);
	public static final int SPIRVBIN_BASE_T_OPTIONS_MAP_TYPES = (1 << 1);
	public static final int SPIRVBIN_BASE_T_OPTIONS_MAP_NAMES = (1 << 2);
	public static final int SPIRVBIN_BASE_T_OPTIONS_MAP_FUNCS = (1 << 3);
	public static final int SPIRVBIN_BASE_T_OPTIONS_DCE_FUNCS = (1 << 4);
	public static final int SPIRVBIN_BASE_T_OPTIONS_DCE_VARS = (1 << 5);
	public static final int SPIRVBIN_BASE_T_OPTIONS_DCE_TYPES = (1 << 6);
	public static final int SPIRVBIN_BASE_T_OPTIONS_OPT_LOADSTORE = (1 << 7);
	public static final int SPIRVBIN_BASE_T_OPTIONS_OPT_FWD_LS = (1 << 8);
	public static final int SPIRVBIN_BASE_T_OPTIONS_MAP_ALL = (SPIRVBIN_BASE_T_OPTIONS_MAP_TYPES
			| SPIRVBIN_BASE_T_OPTIONS_MAP_NAMES | SPIRVBIN_BASE_T_OPTIONS_MAP_FUNCS);
	public static final int SPIRVBIN_BASE_T_OPTIONS_DCE_ALL = (SPIRVBIN_BASE_T_OPTIONS_DCE_FUNCS
			| SPIRVBIN_BASE_T_OPTIONS_DCE_VARS | SPIRVBIN_BASE_T_OPTIONS_DCE_TYPES);
	public static final int SPIRVBIN_BASE_T_OPTIONS_OPT_ALL = (SPIRVBIN_BASE_T_OPTIONS_OPT_LOADSTORE);
	public static final int SPIRVBIN_BASE_T_OPTIONS_ALL_BUT_STRIP = (SPIRVBIN_BASE_T_OPTIONS_MAP_ALL
			| SPIRVBIN_BASE_T_OPTIONS_DCE_ALL | SPIRVBIN_BASE_T_OPTIONS_OPT_ALL);
	public static final int SPIRVBIN_BASE_T_OPTIONS_DO_EVERYTHING = (SPIRVBIN_BASE_T_OPTIONS_STRIP
			| SPIRVBIN_BASE_T_OPTIONS_ALL_BUT_STRIP);

	public static final int OP_CLASS_MISC = 0;
	public static final int OP_CLASS_DEBUG = 1;
	public static final int OP_CLASS_ANNOTATE = 2;
	public static final int OP_CLASS_EXTENSION = 3;
	public static final int OP_CLASS_MODE = 4;
	public static final int OP_CLASS_TYPE = 5;
	public static final int OP_CLASS_CONSTANT = 6;
	public static final int OP_CLASS_MEMORY = 7;
	public static final int OP_CLASS_FUNCTION = 8;
	public static final int OP_CLASS_IMAGE = 9;
	public static final int OP_CLASS_CONVERT = 10;
	public static final int OP_CLASS_COMPOSITE = 11;
	public static final int OP_CLASS_ARITHMETIC = 12;
	public static final int OP_CLASS_BIT = 13;
	public static final int OP_CLASS_RELATIONAL_LOGICAL = 14;
	public static final int OP_CLASS_DERIVATIVE = 15;
	public static final int OP_CLASS_FLOW_CONTROL = 16;
	public static final int OP_CLASS_ATOMIC = 17;
	public static final int OP_CLASS_PRIMITIVE = 18;
	public static final int OP_CLASS_BARRIER = 19;
	public static final int OP_CLASS_GROUP = 20;
	public static final int OP_CLASS_DEVICE_SIDE_ENQUEUE = 21;
	public static final int OP_CLASS_PIPE = 22;
	public static final int OP_CLASS_COUNT = 23;
	public static final int OP_CLASS_MISSING = 24;

	public static final int OPERAND_NONE = 0;
	public static final int OPERAND_ID = 1;
	public static final int OPERAND_VARIABLE_IDS = 2;
	public static final int OPERAND_OPTIONAL_LITERAL = 3;
	public static final int OPERAND_OPTIONAL_LITERAL_STRING = 4;
	public static final int OPERAND_VARIABLE_LITERALS = 5;
	public static final int OPERAND_VARIABLE_ID_LITERAL = 6;
	public static final int OPERAND_VARIABLE_LITERAL_ID = 7;
	public static final int OPERAND_LITERAL_NUMBER = 8;
	public static final int OPERAND_LITERAL_STRING = 9;
	public static final int OPERAND_SOURCE = 10;
	public static final int OPERAND_EXECUTION_MODEL = 11;
	public static final int OPERAND_ADDRESSING = 12;
	public static final int OPERAND_MEMORY = 13;
	public static final int OPERAND_EXECUTION_MODE = 14;
	public static final int OPERAND_STORAGE = 15;
	public static final int OPERAND_DIMENSIONALITY = 16;
	public static final int OPERAND_SAMPLER_ADDRESSING_MODE = 17;
	public static final int OPERAND_SAMPLER_FILTER_MODE = 18;
	public static final int OPERAND_SAMPLER_IMAGE_FORMAT = 19;
	public static final int OPERAND_IMAGE_CHANNEL_ORDER = 20;
	public static final int OPERAND_IMAGE_CHANNEL_DATA_TYPE = 21;
	public static final int OPERAND_IMAGE_OPERANDS = 22;
	public static final int OPERAND_FP_FAST_MATH = 23;
	public static final int OPERAND_FP_ROUNDING_MODE = 24;
	public static final int OPERAND_LINKAGE_TYPE = 25;
	public static final int OPERAND_ACCESS_QUALIFIER = 26;
	public static final int OPERAND_FUNC_PARAM_ATTR = 27;
	public static final int OPERAND_DECORATION = 28;
	public static final int OPERAND_BUILT_IN = 29;
	public static final int OPERAND_SELECT = 30;
	public static final int OPERAND_LOOP = 31;
	public static final int OPERAND_FUNCTION = 32;
	public static final int OPERAND_MEMORY_SEMANTICS = 33;
	public static final int OPERAND_MEMORY_ACCESS = 34;
	public static final int OPERAND_SCOPE = 35;
	public static final int OPERAND_GROUP_OPERATION = 36;
	public static final int OPERAND_KERNEL_ENQUEUE_FLAGS = 37;
	public static final int OPERAND_KERNEL_PROFILING_INFO = 38;
	public static final int OPERAND_CAPABILITY = 39;
	public static final int OPERAND_OPCODE = 40;

	public static final int SHADER_BALLOT_BAD_AMD = 0;
	public static final int SWIZZLE_INVOCATIONS_AMD = 1;
	public static final int SWIZZLE_INVOCATIONS_MASKED_AMD = 2;
	public static final int WRITE_INVOCATION_AMD = 3;
	public static final int MBCNT_AMD = 4;

	public static final int SHADER_TRINARY_MIN_MAX_BAD_AMD = 0;
	public static final int F_MIN3_AMD = 1;
	public static final int U_MIN3_AMD = 2;
	public static final int S_MIN3_AMD = 3;
	public static final int F_MAX3_AMD = 4;
	public static final int U_MAX3_AMD = 5;
	public static final int S_MAX3_AMD = 6;
	public static final int F_MID3_AMD = 7;
	public static final int U_MID3_AMD = 8;
	public static final int S_MID3_AMD = 9;

	public static final int SHADER_EXPLICIT_VERTEX_PARAMETER_BAD_AMD = 0;
	public static final int INTERPOLATE_AT_VERTEX_AMD = 1;

	public static final int GCN_SHADER_BAD_AMD = 0;
	public static final int CUBE_FACE_INDEX_AMD = 1;
	public static final int CUBE_FACE_COORD_AMD = 2;
	public static final int TIME_AMD = 3;

	public static final int GLSL_STD_450_BAD = 0;
	public static final int GLSL_STD_450_ROUND = 1;
	public static final int GLSL_STD_450_ROUND_EVEN = 2;
	public static final int GLSL_STD_450_TRUNC = 3;
	public static final int GLSL_STD_450_F_ABS = 4;
	public static final int GLSL_STD_450_S_ABS = 5;
	public static final int GLSL_STD_450_F_SIGN = 6;
	public static final int GLSL_STD_450_S_SIGN = 7;
	public static final int GLSL_STD_450_FLOOR = 8;
	public static final int GLSL_STD_450_CEIL = 9;
	public static final int GLSL_STD_450_FRACT = 10;
	public static final int GLSL_STD_450_RADIANS = 11;
	public static final int GLSL_STD_450_DEGREES = 12;
	public static final int GLSL_STD_450_SIN = 13;
	public static final int GLSL_STD_450_COS = 14;
	public static final int GLSL_STD_450_TAN = 15;
	public static final int GLSL_STD_450_ASIN = 16;
	public static final int GLSL_STD_450_ACOS = 17;
	public static final int GLSL_STD_450_ATAN = 18;
	public static final int GLSL_STD_450_SINH = 19;
	public static final int GLSL_STD_450_COSH = 20;
	public static final int GLSL_STD_450_TANH = 21;
	public static final int GLSL_STD_450_ASINH = 22;
	public static final int GLSL_STD_450_ACOSH = 23;
	public static final int GLSL_STD_450_ATANH = 24;
	public static final int GLSL_STD_450_ATAN2 = 25;
	public static final int GLSL_STD_450_POW = 26;
	public static final int GLSL_STD_450_EXP = 27;
	public static final int GLSL_STD_450_LOG = 28;
	public static final int GLSL_STD_450_EXP2 = 29;
	public static final int GLSL_STD_450_LOG2 = 30;
	public static final int GLSL_STD_450_SQRT = 31;
	public static final int GLSL_STD_450_INVERSE_SQRT = 32;
	public static final int GLSL_STD_450_DETERMINANT = 33;
	public static final int GLSL_STD_450_MATRIX_INVERSE = 34;
	public static final int GLSL_STD_450_MODF = 35;
	public static final int GLSL_STD_450_MODF_STRUCT = 36;
	public static final int GLSL_STD_450_F_MIN = 37;
	public static final int GLSL_STD_450_U_MIN = 38;
	public static final int GLSL_STD_450_S_MIN = 39;
	public static final int GLSL_STD_450_F_MAX = 40;
	public static final int GLSL_STD_450_U_MAX = 41;
	public static final int GLSL_STD_450_S_MAX = 42;
	public static final int GLSL_STD_450_F_CLAMP = 43;
	public static final int GLSL_STD_450_U_CLAMP = 44;
	public static final int GLSL_STD_450_S_CLAMP = 45;
	public static final int GLSL_STD_450_F_MIX = 46;
	public static final int GLSL_STD_450_I_MIX = 47;
	public static final int GLSL_STD_450_STEP = 48;
	public static final int GLSL_STD_450_SMOOTH_STEP = 49;
	public static final int GLSL_STD_450_FMA = 50;
	public static final int GLSL_STD_450_FREXP = 51;
	public static final int GLSL_STD_450_FREXP_STRUCT = 52;
	public static final int GLSL_STD_450_LDEXP = 53;
	public static final int GLSL_STD_450_PACK_SNORM_4X8 = 54;
	public static final int GLSL_STD_450_PACK_UNORM_4X8 = 55;
	public static final int GLSL_STD_450_PACK_SNORM_2X16 = 56;
	public static final int GLSL_STD_450_PACK_UNORM_2X16 = 57;
	public static final int GLSL_STD_450_PACK_HALF_2X16 = 58;
	public static final int GLSL_STD_450_PACK_DOUBLE_2X32 = 59;
	public static final int GLSL_STD_450_UNPACK_SNORM_2X16 = 60;
	public static final int GLSL_STD_450_UNPACK_UNORM_2X16 = 61;
	public static final int GLSL_STD_450_UNPACK_HALF_2X16 = 62;
	public static final int GLSL_STD_450_UNPACK_SNORM_4X8 = 63;
	public static final int GLSL_STD_450_UNPACK_UNORM_4X8 = 64;
	public static final int GLSL_STD_450_UNPACK_DOUBLE_2X32 = 65;
	public static final int GLSL_STD_450_LENGTH = 66;
	public static final int GLSL_STD_450_DISTANCE = 67;
	public static final int GLSL_STD_450_CROSS = 68;
	public static final int GLSL_STD_450_NORMALIZE = 69;
	public static final int GLSL_STD_450_FACE_FORWARD = 70;
	public static final int GLSL_STD_450_REFLECT = 71;
	public static final int GLSL_STD_450_REFRACT = 72;
	public static final int GLSL_STD_450_FIND_I_LSB = 73;
	public static final int GLSL_STD_450_FIND_S_MSB = 74;
	public static final int GLSL_STD_450_FIND_U_MSB = 75;
	public static final int GLSL_STD_450_INTERPOLATE_AT_CENTROID = 76;
	public static final int GLSL_STD_450_INTERPOLATE_AT_SAMPLE = 77;
	public static final int GLSL_STD_450_INTERPOLATE_AT_OFFSET = 78;
	public static final int GLSL_STD_450_N_MIN = 79;
	public static final int GLSL_STD_450_N_MAX = 80;
	public static final int GLSL_STD_450_N_CLAMP = 81;

	public static final int KROUND_TO_ZERO = 0;
	public static final int KROUND_TO_NEAREST_EVEN = 1;
	public static final int KROUND_TO_POSITIVE_INFINITY = 2;
	public static final int KROUND_TO_NEGATIVE_INFINITY = 3;

	public static final int SOURCE_LANGUAGE_UNKNOWN = 0;
	public static final int SOURCE_LANGUAGE_ESSL = 1;
	public static final int SOURCE_LANGUAGE_GLSL = 2;
	public static final int SOURCE_LANGUAGE_OPEN_CL_C = 3;
	public static final int SOURCE_LANGUAGE_OPEN_CL_CPP = 4;
	public static final int SOURCE_LANGUAGE_HLSL = 5;
	public static final int SOURCE_LANGUAGE_MAX = 0x7fffffff;

	public static final int EXECUTION_MODEL_VERTEX = 0;
	public static final int EXECUTION_MODEL_TESSELLATION_CONTROL = 1;
	public static final int EXECUTION_MODEL_TESSELLATION_EVALUATION = 2;
	public static final int EXECUTION_MODEL_GEOMETRY = 3;
	public static final int EXECUTION_MODEL_FRAGMENT = 4;
	public static final int EXECUTION_MODEL_GLCOMPUTE = 5;
	public static final int EXECUTION_MODEL_KERNEL = 6;
	public static final int EXECUTION_MODEL_TASKNV = 5267;
	public static final int EXECUTION_MODEL_MESHNV = 5268;
	public static final int EXECUTION_MODEL_RAYGENERATION_KHR = 5313;
	public static final int EXECUTION_MODEL_RAYGENERATION_NV = 5313;
	public static final int EXECUTION_MODEL_INTERSECTION_KHR = 5314;
	public static final int EXECUTION_MODEL_INTERSECTION_NV = 5314;
	public static final int EXECUTION_MODEL_ANY_HIT_KHR = 5315;
	public static final int EXECUTION_MODEL_ANY_HIT_NV = 5315;
	public static final int EXECUTION_MODEL_CLOSEST_HIT_KHR = 5316;
	public static final int EXECUTION_MODEL_CLOSEST_HIT_NV = 5316;
	public static final int EXECUTION_MODEL_MISS_KHR = 5317;
	public static final int EXECUTION_MODEL_MISS_NV = 5317;
	public static final int EXECUTION_MODEL_CALLABLE_KHR = 5318;
	public static final int EXECUTION_MODEL_CALLABLE_NV = 5318;
	public static final int EXECUTION_MODEL_MAX = 0x7fffffff;

	public static final int ADDRESSING_MODEL_LOGICAL = 0;
	public static final int ADDRESSING_MODEL_PHYSICAL_32 = 1;
	public static final int ADDRESSING_MODEL_PHYSICAL_64 = 2;
	public static final int ADDRESSING_MODEL_PHYSICAL_STORAGE_BUFFER_64 = 5348;
	public static final int ADDRESSING_MODEL_PHYSICAL_STORAGE_BUFFER_64_EXT = 5348;
	public static final int ADDRESSING_MODEL_MAX = 0x7fffffff;

	public static final int MEMORY_MODEL_SIMPLE = 0;
	public static final int MEMORY_MODEL_GLSL_450 = 1;
	public static final int MEMORY_MODEL_OPEN_CL = 2;
	public static final int MEMORY_MODEL_VULKAN = 3;
	public static final int MEMORY_MODEL_VULKAN_KHR = 3;
	public static final int MEMORY_MODEL_MAX = 0x7fffffff;

	public static final int EXECUTION_MODE_INVOCATIONS = 0;
	public static final int EXECUTION_MODE_SPACING_EQUAL = 1;
	public static final int EXECUTION_MODE_SPACING_FRACTIONAL_EVEN = 2;
	public static final int EXECUTION_MODE_SPACING_FRACTIONAL_ODD = 3;
	public static final int EXECUTION_MODE_VERTEX_ORDER_CW = 4;
	public static final int EXECUTION_MODE_VERTEX_ORDER_CCW = 5;
	public static final int EXECUTION_MODE_PIXEL_CENTER_INTEGER = 6;
	public static final int EXECUTION_MODE_ORIGIN_UPPER_LEFT = 7;
	public static final int EXECUTION_MODE_ORIGIN_LOWER_LEFT = 8;
	public static final int EXECUTION_MODE_EARLY_FRAGMENT_TESTS = 9;
	public static final int EXECUTION_MODE_POINT_MODE = 10;
	public static final int EXECUTION_MODE_XFB = 11;
	public static final int EXECUTION_MODE_DEPTH_REPLACING = 12;
	public static final int EXECUTION_MODE_DEPTH_GREATER = 14;
	public static final int EXECUTION_MODE_DEPTH_LESS = 15;
	public static final int EXECUTION_MODE_DEPTH_UNCHANGED = 16;
	public static final int EXECUTION_MODE_LOCAL_SIZE = 17;
	public static final int EXECUTION_MODE_LOCAL_SIZE_HINT = 18;
	public static final int EXECUTION_MODE_INPUT_POINTS = 19;
	public static final int EXECUTION_MODE_INPUT_LINES = 20;
	public static final int EXECUTION_MODE_INPUT_LINES_ADJACENCY = 21;
	public static final int EXECUTION_MODE_TRIANGLES = 22;
	public static final int EXECUTION_MODE_INPUT_TRIANGLES_ADJACENCY = 23;
	public static final int EXECUTION_MODE_QUADS = 24;
	public static final int EXECUTION_MODE_ISOLINES = 25;
	public static final int EXECUTION_MODE_OUTPUT_VERTICES = 26;
	public static final int EXECUTION_MODE_OUTPUT_POINTS = 27;
	public static final int EXECUTION_MODE_OUTPUT_LINE_STRIP = 28;
	public static final int EXECUTION_MODE_OUTPUT_TRIANGLE_STRIP = 29;
	public static final int EXECUTION_MODE_VEC_TYPE_HINT = 30;
	public static final int EXECUTION_MODE_CONTRACTION_OFF = 31;
	public static final int EXECUTION_MODE_INITIALIZER = 33;
	public static final int EXECUTION_MODE_FINALIZER = 34;
	public static final int EXECUTION_MODE_SUBGROUP_SIZE = 35;
	public static final int EXECUTION_MODE_SUBGROUPS_PER_WORKGROUP = 36;
	public static final int EXECUTION_MODE_SUBGROUPS_PER_WORKGROUP_ID = 37;
	public static final int EXECUTION_MODE_LOCAL_SIZE_ID = 38;
	public static final int EXECUTION_MODE_LOCAL_SIZE_HINT_ID = 39;
	public static final int EXECUTION_MODE_POST_DEPTH_COVERAGE = 4446;
	public static final int EXECUTION_MODE_DENORM_PRESERVE = 4459;
	public static final int EXECUTION_MODE_DENORM_FLUSH_TO_ZERO = 4460;
	public static final int EXECUTION_MODE_SIGNED_ZERO_INF_NAN_PRESERVE = 4461;
	public static final int EXECUTION_MODE_ROUNDING_MODE_RTE = 4462;
	public static final int EXECUTION_MODE_ROUNDING_MODE_RTZ = 4463;
	public static final int EXECUTION_MODE_STENCIL_REF_REPLACING_EXT = 5027;
	public static final int EXECUTION_MODE_OUTPUT_LINES_NV = 5269;
	public static final int EXECUTION_MODE_OUTPUT_PRIMITIVES_NV = 5270;
	public static final int EXECUTION_MODE_DERIVATIVE_GROUP_QUADS_NV = 5289;
	public static final int EXECUTION_MODE_DERIVATIVE_GROUP_LINEAR_NV = 5290;
	public static final int EXECUTION_MODE_OUTPUT_TRIANGLES_NV = 5298;
	public static final int EXECUTION_MODE_PIXEL_INTERLOCK_ORDERED_EXT = 5366;
	public static final int EXECUTION_MODE_PIXEL_INTERLOCK_UNORDERED_EXT = 5367;
	public static final int EXECUTION_MODE_SAMPLE_INTERLOCK_ORDERED_EXT = 5368;
	public static final int EXECUTION_MODE_SAMPLE_INTERLOCK_UNORDERED_EXT = 5369;
	public static final int EXECUTION_MODE_SHADING_RATE_INTERLOCK_ORDERED_EXT = 5370;
	public static final int EXECUTION_MODE_SHADING_RATE_INTERLOCK_UNORDERED_EXT = 5371;
	public static final int EXECUTION_MODE_MAX_WORKGROUP_SIZE_INTEL = 5893;
	public static final int EXECUTION_MODE_MAX_WORK_DIM_INTEL = 5894;
	public static final int EXECUTION_MODE_NO_GLOBAL_OFFSET_INTEL = 5895;
	public static final int EXECUTION_MODE_NUM_SIMD_WORKITEMS_INTEL = 5896;
	public static final int EXECUTION_MODE_MAX = 0x7fffffff;

	public static final int STORAGE_CLASS_UNIFORM_CONSTANT = 0;
	public static final int STORAGE_CLASS_INPUT = 1;
	public static final int STORAGE_CLASS_UNIFORM = 2;
	public static final int STORAGE_CLASS_OUTPUT = 3;
	public static final int STORAGE_CLASS_WORKGROUP = 4;
	public static final int STORAGE_CLASS_CROSS_WORKGROUP = 5;
	public static final int STORAGE_CLASS_PRIVATE = 6;
	public static final int STORAGE_CLASS_FUNCTION = 7;
	public static final int STORAGE_CLASS_GENERIC = 8;
	public static final int STORAGE_CLASS_PUSH_CONSTANT = 9;
	public static final int STORAGE_CLASS_ATOMIC_COUNTER = 10;
	public static final int STORAGE_CLASS_IMAGE = 11;
	public static final int STORAGE_CLASS_STORAGE_BUFFER = 12;
	public static final int STORAGE_CLASS_CALLABLE_DATA_KHR = 5328;
	public static final int STORAGE_CLASS_CALLABLE_DATA_NV = 5328;
	public static final int STORAGE_CLASS_INCOMING_CALLABLE_DATA_KHR = 5329;
	public static final int STORAGE_CLASS_INCOMING_CALLABLE_DATA_NV = 5329;
	public static final int STORAGE_CLASS_RAY_PAYLOAD_KHR = 5338;
	public static final int STORAGE_CLASS_RAY_PAYLOAD_NV = 5338;
	public static final int STORAGE_CLASS_HIT_ATTRIBUTE_KHR = 5339;
	public static final int STORAGE_CLASS_HIT_ATTRIBUTE_NV = 5339;
	public static final int STORAGE_CLASS_INCOMING_RAY_PAYLOAD_KHR = 5342;
	public static final int STORAGE_CLASS_INCOMING_RAY_PAYLOAD_NV = 5342;
	public static final int STORAGE_CLASS_SHADER_RECORD_BUFFER_KHR = 5343;
	public static final int STORAGE_CLASS_SHADER_RECORD_BUFFER_NV = 5343;
	public static final int STORAGE_CLASS_PHYSICAL_STORAGE_BUFFER = 5349;
	public static final int STORAGE_CLASS_PHYSICAL_STORAGE_BUFFER_EXT = 5349;
	public static final int STORAGE_CLASS_CODE_SECTION_INTEL = 5605;
	public static final int STORAGE_CLASS_MAX = 0x7fffffff;

	public static final int DIM_1D = 0;
	public static final int DIM_2D = 1;
	public static final int DIM_3D = 2;
	public static final int DIM_CUBE = 3;
	public static final int DIM_RECT = 4;
	public static final int DIM_BUFFER = 5;
	public static final int DIM_SUBPASS_DATA = 6;
	public static final int DIM_MAX = 0x7fffffff;

	public static final int SAMPLER_ADDRESSING_MODE_NONE = 0;
	public static final int SAMPLER_ADDRESSING_MODE_CLAMP_TO_EDGE = 1;
	public static final int SAMPLER_ADDRESSING_MODE_CLAMP = 2;
	public static final int SAMPLER_ADDRESSING_MODE_REPEAT = 3;
	public static final int SAMPLER_ADDRESSING_MODE_REPEAT_MIRRORED = 4;
	public static final int SAMPLER_ADDRESSING_MODE_MAX = 0x7fffffff;

	public static final int SAMPLER_FILTER_MODE_NEAREST = 0;
	public static final int SAMPLER_FILTER_MODE_LINEAR = 1;
	public static final int SAMPLER_FILTER_MODE_MAX = 0x7fffffff;

	public static final int IMAGE_FORMAT_UNKNOWN = 0;
	public static final int IMAGE_FORMAT_RGBA32F = 1;
	public static final int IMAGE_FORMAT_RGBA16F = 2;
	public static final int IMAGE_FORMAT_R32F = 3;
	public static final int IMAGE_FORMAT_RGBA8 = 4;
	public static final int IMAGE_FORMAT_RGBA8_SNORM = 5;
	public static final int IMAGE_FORMAT_RG32F = 6;
	public static final int IMAGE_FORMAT_RG16F = 7;
	public static final int IMAGE_FORMAT_R11FG11FB10F = 8;
	public static final int IMAGE_FORMAT_R16F = 9;
	public static final int IMAGE_FORMAT_RGBA16 = 10;
	public static final int IMAGE_FORMAT_RGB10A2 = 11;
	public static final int IMAGE_FORMAT_RG16 = 12;
	public static final int IMAGE_FORMAT_RG8 = 13;
	public static final int IMAGE_FORMAT_R16 = 14;
	public static final int IMAGE_FORMAT_R8 = 15;
	public static final int IMAGE_FORMAT_RGBA16_SNORM = 16;
	public static final int IMAGE_FORMAT_RG16_SNORM = 17;
	public static final int IMAGE_FORMAT_RG8_SNORM = 18;
	public static final int IMAGE_FORMAT_R16_SNORM = 19;
	public static final int IMAGE_FORMAT_R8_SNORM = 20;
	public static final int IMAGE_FORMAT_RGBA32I = 21;
	public static final int IMAGE_FORMAT_RGBA16I = 22;
	public static final int IMAGE_FORMAT_RGBA8I = 23;
	public static final int IMAGE_FORMAT_R32I = 24;
	public static final int IMAGE_FORMAT_RG32I = 25;
	public static final int IMAGE_FORMAT_RG16I = 26;
	public static final int IMAGE_FORMAT_RG8I = 27;
	public static final int IMAGE_FORMAT_R16I = 28;
	public static final int IMAGE_FORMAT_R8I = 29;
	public static final int IMAGE_FORMAT_RGBA32UI = 30;
	public static final int IMAGE_FORMAT_RGBA16UI = 31;
	public static final int IMAGE_FORMAT_RGBA8UI = 32;
	public static final int IMAGE_FORMAT_R32UI = 33;
	public static final int IMAGE_FORMAT_RGB10A2UI = 34;
	public static final int IMAGE_FORMAT_RG32UI = 35;
	public static final int IMAGE_FORMAT_RG16UI = 36;
	public static final int IMAGE_FORMAT_RG8UI = 37;
	public static final int IMAGE_FORMAT_R16UI = 38;
	public static final int IMAGE_FORMAT_R8UI = 39;
	public static final int IMAGE_FORMAT_MAX = 0x7fffffff;

	public static final int IMAGE_CHANNEL_ORDER_R = 0;
	public static final int IMAGE_CHANNEL_ORDER_A = 1;
	public static final int IMAGE_CHANNEL_ORDER_RG = 2;
	public static final int IMAGE_CHANNEL_ORDER_RA = 3;
	public static final int IMAGE_CHANNEL_ORDER_RGB = 4;
	public static final int IMAGE_CHANNEL_ORDER_RGBA = 5;
	public static final int IMAGE_CHANNEL_ORDER_BGRA = 6;
	public static final int IMAGE_CHANNEL_ORDER_ARGB = 7;
	public static final int IMAGE_CHANNEL_ORDER_INTENSITY = 8;
	public static final int IMAGE_CHANNEL_ORDER_LUMINANCE = 9;
	public static final int IMAGE_CHANNEL_ORDER_RX = 10;
	public static final int IMAGE_CHANNEL_ORDER_RGX = 11;
	public static final int IMAGE_CHANNEL_ORDER_RGBX = 12;
	public static final int IMAGE_CHANNEL_ORDER_DEPTH = 13;
	public static final int IMAGE_CHANNEL_ORDER_DEPTH_STENCIL = 14;
	public static final int IMAGE_CHANNEL_ORDER_SRGB = 15;
	public static final int IMAGE_CHANNEL_ORDER_SRGBX = 16;
	public static final int IMAGE_CHANNEL_ORDER_SRGBA = 17;
	public static final int IMAGE_CHANNEL_ORDER_SBGRA = 18;
	public static final int IMAGE_CHANNEL_ORDER_ABGR = 19;
	public static final int IMAGE_CHANNEL_ORDER_MAX = 0x7fffffff;

	public static final int IMAGE_CHANNEL_DATA_TYPE_SNORM_INT8 = 0;
	public static final int IMAGE_CHANNEL_DATA_TYPE_SNORM_INT16 = 1;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_INT8 = 2;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_INT16 = 3;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_SHORT565 = 4;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_SHORT555 = 5;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_INT101010 = 6;
	public static final int IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT8 = 7;
	public static final int IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT16 = 8;
	public static final int IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT32 = 9;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT8 = 10;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT16 = 11;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT32 = 12;
	public static final int IMAGE_CHANNEL_DATA_TYPE_HALF_FLOAT = 13;
	public static final int IMAGE_CHANNEL_DATA_TYPE_FLOAT = 14;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_INT24 = 15;
	public static final int IMAGE_CHANNEL_DATA_TYPE_UNORM_INT101010_2 = 16;
	public static final int IMAGE_CHANNEL_DATA_TYPE_MAX = 0x7fffffff;

	public static final int IMAGE_OPERANDS_BIAS_SHIFT = 0;
	public static final int IMAGE_OPERANDS_LOD_SHIFT = 1;
	public static final int IMAGE_OPERANDS_GRAD_SHIFT = 2;
	public static final int IMAGE_OPERANDS_CONST_OFFSET_SHIFT = 3;
	public static final int IMAGE_OPERANDS_OFFSET_SHIFT = 4;
	public static final int IMAGE_OPERANDS_CONST_OFFSETS_SHIFT = 5;
	public static final int IMAGE_OPERANDS_SAMPLE_SHIFT = 6;
	public static final int IMAGE_OPERANDS_MIN_LOD_SHIFT = 7;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_SHIFT = 8;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_KHR_SHIFT = 8;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_SHIFT = 9;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_KHR_SHIFT = 9;
	public static final int IMAGE_OPERANDS_NON_PRIVATE_TEXEL_SHIFT = 10;
	public static final int IMAGE_OPERANDS_NON_PRIVATE_TEXEL_KHR_SHIFT = 10;
	public static final int IMAGE_OPERANDS_VOLATILE_TEXEL_SHIFT = 11;
	public static final int IMAGE_OPERANDS_VOLATILE_TEXEL_KHR_SHIFT = 11;
	public static final int IMAGE_OPERANDS_SIGN_EXTEND_SHIFT = 12;
	public static final int IMAGE_OPERANDS_ZERO_EXTEND_SHIFT = 13;
	public static final int IMAGE_OPERANDS_MAX = 0x7fffffff;

	public static final int IMAGE_OPERANDS_MASK_NONE = 0;
	public static final int IMAGE_OPERANDS_BIAS_MASK = 0x00000001;
	public static final int IMAGE_OPERANDS_LOD_MASK = 0x00000002;
	public static final int IMAGE_OPERANDS_GRAD_MASK = 0x00000004;
	public static final int IMAGE_OPERANDS_CONST_OFFSET_MASK = 0x00000008;
	public static final int IMAGE_OPERANDS_OFFSET_MASK = 0x00000010;
	public static final int IMAGE_OPERANDS_CONST_OFFSETS_MASK = 0x00000020;
	public static final int IMAGE_OPERANDS_SAMPLE_MASK = 0x00000040;
	public static final int IMAGE_OPERANDS_MIN_LOD_MASK = 0x00000080;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_MASK = 0x00000100;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_KHR_MASK = 0x00000100;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_MASK = 0x00000200;
	public static final int IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_KHR_MASK = 0x00000200;
	public static final int IMAGE_OPERANDS_NON_PRIVATE_TEXEL_MASK = 0x00000400;
	public static final int IMAGE_OPERANDS_NON_PRIVATE_TEXEL_KHR_MASK = 0x00000400;
	public static final int IMAGE_OPERANDS_VOLATILE_TEXEL_MASK = 0x00000800;
	public static final int IMAGE_OPERANDS_VOLATILE_TEXEL_KHR_MASK = 0x00000800;
	public static final int IMAGE_OPERANDS_SIGN_EXTEND_MASK = 0x00001000;
	public static final int IMAGE_OPERANDS_ZERO_EXTEND_MASK = 0x00002000;

	public static final int FP_FAST_MATH_MODE_NOT_NAN_SHIFT = 0;
	public static final int FP_FAST_MATH_MODE_NOT_INF_SHIFT = 1;
	public static final int FP_FAST_MATH_MODE_NSZ_SHIFT = 2;
	public static final int FP_FAST_MATH_MODE_ALLOW_RECIP_SHIFT = 3;
	public static final int FP_FAST_MATH_MODE_FAST_SHIFT = 4;
	public static final int FP_FAST_MATH_MODE_MAX = 0x7fffffff;

	public static final int FP_FAST_MATH_MODE_MASK_NONE = 0;
	public static final int FP_FAST_MATH_MODE_NOT_NAN_MASK = 0x00000001;
	public static final int FP_FAST_MATH_MODE_NOT_INF_MASK = 0x00000002;
	public static final int FP_FAST_MATH_MODE_NSZ_MASK = 0x00000004;
	public static final int FP_FAST_MATH_MODE_ALLOW_RECIP_MASK = 0x00000008;
	public static final int FP_FAST_MATH_MODE_FAST_MASK = 0x00000010;

	public static final int FP_ROUNDING_MODE_RTE = 0;
	public static final int FP_ROUNDING_MODE_RTZ = 1;
	public static final int FP_ROUNDING_MODE_RTP = 2;
	public static final int FP_ROUNDING_MODE_RTN = 3;
	public static final int FP_ROUNDING_MODE_MAX = 0x7fffffff;

	public static final int LINKAGE_TYPE_EXPORT = 0;
	public static final int LINKAGE_TYPE_IMPORT = 1;
	public static final int LINKAGE_TYPE_MAX = 0x7fffffff;

	public static final int ACCESS_QUALIFIER_READ_ONLY = 0;
	public static final int ACCESS_QUALIFIER_WRITE_ONLY = 1;
	public static final int ACCESS_QUALIFIER_READ_WRITE = 2;
	public static final int ACCESS_QUALIFIER_MAX = 0x7fffffff;

	public static final int FUNCTION_PARAMETER_ATTRIBUTE_ZEXT = 0;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_SEXT = 1;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_BY_VAL = 2;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_SRET = 3;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_NO_ALIAS = 4;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_NO_CAPTURE = 5;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_NO_WRITE = 6;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_NO_READ_WRITE = 7;
	public static final int FUNCTION_PARAMETER_ATTRIBUTE_MAX = 0x7fffffff;

	public static final int DECORATION_RELAXEDPRECISION = 0;
	public static final int DECORATION_SPEC_ID = 1;
	public static final int DECORATION_BLOCK = 2;
	public static final int DECORATION_BUFFER_BLOCK = 3;
	public static final int DECORATION_ROW_MAJOR = 4;
	public static final int DECORATION_COL_MAJOR = 5;
	public static final int DECORATION_ARRAY_STRIDE = 6;
	public static final int DECORATION_MATRIX_STRIDE = 7;
	public static final int DECORATION_GLSL_SHARED = 8;
	public static final int DECORATION_GLSL_PACKED = 9;
	public static final int DECORATION_C_PACKED = 10;
	public static final int DECORATION_BUILT_IN = 11;
	public static final int DECORATION_NO_PERSPECTIVE = 13;
	public static final int DECORATION_FLAT = 14;
	public static final int DECORATION_PATCH = 15;
	public static final int DECORATION_CENTROID = 16;
	public static final int DECORATION_SAMPLE = 17;
	public static final int DECORATION_INVARIANT = 18;
	public static final int DECORATION_RESTRICT = 19;
	public static final int DECORATION_ALIASED = 20;
	public static final int DECORATION_VOLATILE = 21;
	public static final int DECORATION_CONSTANT = 22;
	public static final int DECORATION_COHERENT = 23;
	public static final int DECORATION_NON_WRITABLE = 24;
	public static final int DECORATION_NON_READABLE = 25;
	public static final int DECORATION_UNIFORM = 26;
	public static final int DECORATION_UNIFORMID = 27;
	public static final int DECORATION_SATURATED_CONVERSION = 28;
	public static final int DECORATION_STREAM = 29;
	public static final int DECORATION_LOCATION = 30;
	public static final int DECORATION_COMPONENT = 31;
	public static final int DECORATION_INDEX = 32;
	public static final int DECORATION_BINDING = 33;
	public static final int DECORATION_DESCRIPTOR_SET = 34;
	public static final int DECORATION_OFFSET = 35;
	public static final int DECORATION_XFB_BUFFER = 36;
	public static final int DECORATION_XFB_STRIDE = 37;
	public static final int DECORATION_FUNC_PARAM_ATTR = 38;
	public static final int DECORATION_FP_ROUNDING_MODE = 39;
	public static final int DECORATION_FP_FAST_MATH_MODE = 40;
	public static final int DECORATION_LINKAGE_ATTRIBUTES = 41;
	public static final int DECORATION_NO_CONTRACTION = 42;
	public static final int DECORATION_INPUT_ATTACHMENT_INDEX = 43;
	public static final int DECORATION_ALIGNMENT = 44;
	public static final int DECORATION_MAX_BYTE_OFFSET = 45;
	public static final int DECORATION_ALIGNMENT_ID = 46;
	public static final int DECORATION_MAX_BYTE_OFFSET_ID = 47;
	public static final int DECORATION_NO_SIGNED_WRAP = 4469;
	public static final int DECORATION_NO_UNSIGNED_WRAP = 4470;
	public static final int DECORATION_EXPLICIT_INTERP_AMD = 4999;
	public static final int DECORATION_OVERRIDE_COVERAGE_NV = 5248;
	public static final int DECORATION_PASSTHROUGH_NV = 5250;
	public static final int DECORATION_VIEWPORT_RELATIVE_NV = 5252;
	public static final int DECORATION_SECONDARY_VIEWPORT_RELATIVE_NV = 5256;
	public static final int DECORATION_PER_PRIMITIVE_NV = 5271;
	public static final int DECORATION_PER_VIEW_NV = 5272;
	public static final int DECORATION_PER_TASK_NV = 5273;
	public static final int DECORATION_PER_VERTEX_NV = 5285;
	public static final int DECORATION_NON_UNIFORM = 5300;
	public static final int DECORATION_NON_UNIFORM_EXT = 5300;
	public static final int DECORATION_RESTRICT_POINTER = 5355;
	public static final int DECORATION_RESTRICT_POINTER_EXT = 5355;
	public static final int DECORATION_ALIASED_POINTER = 5356;
	public static final int DECORATION_ALIASED_POINTER_EXT = 5356;
	public static final int DECORATION_REFERENCED_INDIRECTLY_INTEL = 5602;
	public static final int DECORATION_COUNTER_BUFFER = 5634;
	public static final int DECORATION_HLSL_COUNTER_BUFFER_GOOGLE = 5634;
	public static final int DECORATION_HLSL_SEMANTIC_GOOGLE = 5635;
	public static final int DECORATION_USER_SEMANTIC = 5635;
	public static final int DECORATION_USER_TYPE_GOOGLE = 5636;
	public static final int DECORATION_REGISTER_INTEL = 5825;
	public static final int DECORATION_MEMORY_INTEL = 5826;
	public static final int DECORATION_NUMBANKS_INTEL = 5827;
	public static final int DECORATION_BANKWIDTH_INTEL = 5828;
	public static final int DECORATION_MAX_PRIVATE_COPIES_INTEL = 5829;
	public static final int DECORATION_SINGLEPUMP_INTEL = 5830;
	public static final int DECORATION_DOUBLEPUMP_INTEL = 5831;
	public static final int DECORATION_MAX_REPLICATES_INTEL = 5832;
	public static final int DECORATION_SIMPLE_DUAL_PORT_INTEL = 5833;
	public static final int DECORATION_MERGE_INTEL = 5834;
	public static final int DECORATION_BANK_BITS_INTEL = 5835;
	public static final int DECORATION_FORCE_POW2_DEPTH_INTEL = 5836;
	public static final int DECORATION_MAX = 0x7fffffff;

	public static final int BUILT_IN_POSITION = 0;
	public static final int BUILT_IN_POINT_SIZE = 1;
	public static final int BUILT_IN_CLIP_DISTANCE = 3;
	public static final int BUILT_IN_CULL_DISTANCE = 4;
	public static final int BUILT_IN_VERTEX_ID = 5;
	public static final int BUILT_IN_INSTANCE_ID = 6;
	public static final int BUILT_IN_PRIMITIVE_ID = 7;
	public static final int BUILT_IN_INVOCATION_ID = 8;
	public static final int BUILT_IN_LAYER = 9;
	public static final int BUILT_IN_VIEWPORT_INDEX = 10;
	public static final int BUILT_IN_TESS_LEVEL_OUTER = 11;
	public static final int BUILT_IN_TESS_LEVEL_INNER = 12;
	public static final int BUILT_IN_TESS_COORD = 13;
	public static final int BUILT_IN_PATCH_VERTICES = 14;
	public static final int BUILT_IN_FRAG_COORD = 15;
	public static final int BUILT_IN_POINT_COORD = 16;
	public static final int BUILT_IN_FRONT_FACING = 17;
	public static final int BUILT_IN_SAMPLE_ID = 18;
	public static final int BUILT_IN_SAMPLE_POSITION = 19;
	public static final int BUILT_IN_SAMPLE_MASK = 20;
	public static final int BUILT_IN_FRAG_DEPTH = 22;
	public static final int BUILT_IN_HELPER_INVOCATION = 23;
	public static final int BUILT_IN_NUM_WORKGROUPS = 24;
	public static final int BUILT_IN_WORKGROUP_SIZE = 25;
	public static final int BUILT_IN_WORKGROUP_ID = 26;
	public static final int BUILT_IN_LOCAL_INVOCATION_ID = 27;
	public static final int BUILT_IN_GLOBAL_INVOCATION_ID = 28;
	public static final int BUILT_IN_LOCAL_INVOCATION_INDEX = 29;
	public static final int BUILT_IN_WORK_DIM = 30;
	public static final int BUILT_IN_GLOBAL_SIZE = 31;
	public static final int BUILT_IN_ENQUEUED_WORKGROUP_SIZE = 32;
	public static final int BUILT_IN_GLOBAL_OFFSET = 33;
	public static final int BUILT_IN_GLOBAL_LINEAR_ID = 34;
	public static final int BUILT_IN_SUBGROUP_SIZE = 36;
	public static final int BUILT_IN_SUBGROUP_MAX_SIZE = 37;
	public static final int BUILT_IN_NUM_SUBGROUPS = 38;
	public static final int BUILT_IN_NUM_ENQUEUED_SUBGROUPS = 39;
	public static final int BUILT_IN_SUBGROUP_ID = 40;
	public static final int BUILT_IN_SUBGROUP_LOCAL_INVOCATION_ID = 41;
	public static final int BUILT_IN_VERTEX_INDEX = 42;
	public static final int BUILT_IN_INSTANCE_INDEX = 43;
	public static final int BUILT_IN_SUBGROUP_EQ_MASK = 4416;
	public static final int BUILT_IN_SUBGROUP_EQ_MASK_KHR = 4416;
	public static final int BUILT_IN_SUBGROUP_GE_MASK = 4417;
	public static final int BUILT_IN_SUBGROUP_GE_MASK_KHR = 4417;
	public static final int BUILT_IN_SUBGROUP_GT_MASK = 4418;
	public static final int BUILT_IN_SUBGROUP_GT_MASK_KHR = 4418;
	public static final int BUILT_IN_SUBGROUP_LE_MASK = 4419;
	public static final int BUILT_IN_SUBGROUP_LE_MASK_KHR = 4419;
	public static final int BUILT_IN_SUBGROUP_LT_MASK = 4420;
	public static final int BUILT_IN_SUBGROUP_LT_MASK_KHR = 4420;
	public static final int BUILT_IN_BASE_VERTEX = 4424;
	public static final int BUILT_IN_BASE_INSTANCE = 4425;
	public static final int BUILT_IN_DRAW_INDEX = 4426;
	public static final int BUILT_IN_DEVICE_INDEX = 4438;
	public static final int BUILT_IN_VIEW_INDEX = 4440;
	public static final int BUILT_IN_BARY_COORD_NO_PERSP_AMD = 4992;
	public static final int BUILT_IN_BARY_COORD_NO_PERSP_CENTROID_AMD = 4993;
	public static final int BUILT_IN_BARY_COORD_NO_PERSP_SAMPLE_AMD = 4994;
	public static final int BUILT_IN_BARY_COORD_SMOOTH_AMD = 4995;
	public static final int BUILT_IN_BARY_COORD_SMOOTH_CENTROID_AMD = 4996;
	public static final int BUILT_IN_BARY_COORD_SMOOTH_SAMPLE_AMD = 4997;
	public static final int BUILT_IN_BARY_COORD_PULL_MODEL_AMD = 4998;
	public static final int BUILT_IN_FRAG_STENCIL_REF_EXT = 5014;
	public static final int BUILT_IN_VIEWPORT_MASK_NV = 5253;
	public static final int BUILT_IN_SECONDARY_POSITION_NV = 5257;
	public static final int BUILT_IN_SECONDARY_VIEWPORT_MASK_NV = 5258;
	public static final int BUILT_IN_POSITION_PER_VIEW_NV = 5261;
	public static final int BUILT_IN_VIEWPORT_MASK_PER_VIEW_NV = 5262;
	public static final int BUILT_IN_FULLY_COVERED_EXT = 5264;
	public static final int BUILT_IN_TASK_COUNT_NV = 5274;
	public static final int BUILT_IN_PRIMITIVE_COUNT_NV = 5275;
	public static final int BUILT_IN_PRIMITIVE_INDICES_NV = 5276;
	public static final int BUILT_IN_CLIP_DISTANCE_PER_VIEW_NV = 5277;
	public static final int BUILT_IN_CULL_DISTANCE_PER_VIEW_NV = 5278;
	public static final int BUILT_IN_LAYER_PER_VIEW_NV = 5279;
	public static final int BUILT_IN_MESH_VIEW_COUNT_NV = 5280;
	public static final int BUILT_IN_MESH_VIEW_INDICES_NV = 5281;
	public static final int BUILT_IN_BARY_COORD_NV = 5286;
	public static final int BUILT_IN_BARY_COORD_NO_PERSP_NV = 5287;
	public static final int BUILT_IN_FRAG_SIZE_EXT = 5292;
	public static final int BUILT_IN_FRAGMENT_SIZE_NV = 5292;
	public static final int BUILT_IN_FRAG_INVOCATION_COUNT_EXT = 5293;
	public static final int BUILT_IN_INVOCATIONS_PER_PIXEL_NV = 5293;
	public static final int BUILT_IN_LAUNCH_ID_KHR = 5319;
	public static final int BUILT_IN_LAUNCH_ID_NV = 5319;
	public static final int BUILT_IN_LAUNCH_SIZE_KHR = 5320;
	public static final int BUILT_IN_LAUNCH_SIZE_NV = 5320;
	public static final int BUILT_IN_WORLD_RAY_ORIGIN_KHR = 5321;
	public static final int BUILT_IN_WORLD_RAY_ORIGIN_NV = 5321;
	public static final int BUILT_IN_WORLD_RAY_DIRECTION_KHR = 5322;
	public static final int BUILT_IN_WORLD_RAY_DIRECTION_NV = 5322;
	public static final int BUILT_IN_OBJECT_RAY_ORIGIN_KHR = 5323;
	public static final int BUILT_IN_OBJECT_RAY_ORIGIN_NV = 5323;
	public static final int BUILT_IN_OBJECT_RAY_DIRECTION_KHR = 5324;
	public static final int BUILT_IN_OBJECT_RAY_DIRECTION_NV = 5324;
	public static final int BUILT_IN_RAY_TMIN_KHR = 5325;
	public static final int BUILT_IN_RAY_TMIN_NV = 5325;
	public static final int BUILT_IN_RAY_TMAX_KHR = 5326;
	public static final int BUILT_IN_RAY_TMAX_NV = 5326;
	public static final int BUILT_IN_INSTANCE_CUSTOM_INDEX_KHR = 5327;
	public static final int BUILT_IN_INSTANCE_CUSTOM_INDEX_NV = 5327;
	public static final int BUILT_IN_OBJECT_TO_WORLD_KHR = 5330;
	public static final int BUILT_IN_OBJECT_TO_WORLD_NV = 5330;
	public static final int BUILT_IN_WORLD_TO_OBJECT_KHR = 5331;
	public static final int BUILT_IN_WORLD_TO_OBJECT_NV = 5331;
	public static final int BUILT_IN_HIT_T_KHR = 5332;
	public static final int BUILT_IN_HIT_T_NV = 5332;
	public static final int BUILT_IN_HIT_KIND_KHR = 5333;
	public static final int BUILT_IN_HIT_KIND_NV = 5333;
	public static final int BUILT_IN_INCOMING_RAY_FLAGS_KHR = 5351;
	public static final int BUILT_IN_INCOMING_RAY_FLAGS_NV = 5351;
	public static final int BUILT_IN_RAY_GEOMETRY_INDEX_KHR = 5352;
	public static final int BUILT_IN_WARPS_PER_SM_NV = 5374;
	public static final int BUILT_IN_SM_COUNT_NV = 5375;
	public static final int BUILT_IN_WARP_ID_NV = 5376;
	public static final int BUILT_IN_SM_ID_NV = 5377;
	public static final int BUILT_IN_MAX = 0x7fffffff;

	public static final int SELECTION_CONTROL_FLATTEN_SHIFT = 0;
	public static final int SELECTION_CONTROL_DONT_FLATTEN_SHIFT = 1;
	public static final int SELECTION_CONTROL_MAX = 0x7fffffff;

	public static final int SELECTION_CONTROL_MASK_NONE = 0;
	public static final int SELECTION_CONTROL_FLATTEN_MASK = 0x00000001;
	public static final int SELECTION_CONTROL_DONT_FLATTEN_MASK = 0x00000002;

	public static final int LOOP_CONTROL_UNROLL_SHIFT = 0;
	public static final int LOOP_CONTROL_DONT_UNROLL_SHIFT = 1;
	public static final int LOOP_CONTROL_DEPENDENCY_INFINITE_SHIFT = 2;
	public static final int LOOP_CONTROL_DEPENDENCY_LENGTH_SHIFT = 3;
	public static final int LOOP_CONTROL_MIN_ITERATIONS_SHIFT = 4;
	public static final int LOOP_CONTROL_MAX_ITERATIONS_SHIFT = 5;
	public static final int LOOP_CONTROL_ITERATION_MULTIPLE_SHIFT = 6;
	public static final int LOOP_CONTROL_PEEL_COUNT_SHIFT = 7;
	public static final int LOOP_CONTROL_PARTIAL_COUNT_SHIFT = 8;
	public static final int LOOP_CONTROL_INITIATION_INTERVAL_INTEL_SHIFT = 16;
	public static final int LOOP_CONTROL_MAX_CONCURRENCY_INTEL_SHIFT = 17;
	public static final int LOOP_CONTROL_DEPENDENCY_ARRAY_INTEL_SHIFT = 18;
	public static final int LOOP_CONTROL_PIPELINE_ENABLE_INTEL_SHIFT = 19;
	public static final int LOOP_CONTROL_LOOP_COALESCE_INTEL_SHIFT = 20;
	public static final int LOOP_CONTROL_MAX_INTERLEAVING_INTEL_SHIFT = 21;
	public static final int LOOP_CONTROL_SPECULATED_ITERATIONS_INTEL_SHIFT = 22;
	public static final int LOOP_CONTROL_MAX = 0x7fffffff;

	public static final int LOOP_CONTROL_MASK_NONE = 0;
	public static final int LOOP_CONTROL_UNROLL_MASK = 0x00000001;
	public static final int LOOP_CONTROL_DONT_UNROLL_MASK = 0x00000002;
	public static final int LOOP_CONTROL_DEPENDENCY_INFINITE_MASK = 0x00000004;
	public static final int LOOP_CONTROL_DEPENDENCY_LENGTH_MASK = 0x00000008;
	public static final int LOOP_CONTROL_MIN_ITERATIONS_MASK = 0x00000010;
	public static final int LOOP_CONTROL_MAX_ITERATIONS_MASK = 0x00000020;
	public static final int LOOP_CONTROL_ITERATION_MULTIPLE_MASK = 0x00000040;
	public static final int LOOP_CONTROL_PEEL_COUNT_MASK = 0x00000080;
	public static final int LOOP_CONTROL_PARTIAL_COUNT_MASK = 0x00000100;
	public static final int LOOP_CONTROL_INITIATION_INTERVAL_INTEL_MASK = 0x00010000;
	public static final int LOOP_CONTROL_MAX_CONCURRENCY_INTEL_MASK = 0x00020000;
	public static final int LOOP_CONTROL_DEPENDENCY_ARRAY_INTEL_MASK = 0x00040000;
	public static final int LOOP_CONTROL_PIPELINE_ENABLE_INTEL_MASK = 0x00080000;
	public static final int LOOP_CONTROL_LOOP_COALESCE_INTEL_MASK = 0x00100000;
	public static final int LOOP_CONTROL_MAX_INTERLEAVING_INTEL_MASK = 0x00200000;
	public static final int LOOP_CONTROL_SPECULATED_ITERATIONS_INTEL_MASK = 0x00400000;

	public static final int FUNCTION_CONTROL_INLINE_SHIFT = 0;
	public static final int FUNCTION_CONTROL_DONT_INLINE_SHIFT = 1;
	public static final int FUNCTION_CONTROL_PURE_SHIFT = 2;
	public static final int FUNCTION_CONTROL_CONST_SHIFT = 3;
	public static final int FUNCTION_CONTROL_MAX = 0x7fffffff;

	public static final int FUNCTION_CONTROL_MASK_NONE = 0;
	public static final int FUNCTION_CONTROL_INLINE_MASK = 0x00000001;
	public static final int FUNCTION_CONTROL_DONT_INLINE_MASK = 0x00000002;
	public static final int FUNCTION_CONTROL_PURE_MASK = 0x00000004;
	public static final int FUNCTION_CONTROL_CONST_MASK = 0x00000008;

	public static final int MEMORY_SEMANTICS_ACQUIRE_SHIFT = 1;
	public static final int MEMORY_SEMANTICS_RELEASE_SHIFT = 2;
	public static final int MEMORY_SEMANTICS_ACQUIRE_RELEASE_SHIFT = 3;
	public static final int MEMORY_SEMANTICS_SEQUENTIALLY_CONSISTENT_SHIFT = 4;
	public static final int MEMORY_SEMANTICS_UNIFORM_MEMORY_SHIFT = 6;
	public static final int MEMORY_SEMANTICS_SUBGROUP_MEMORY_SHIFT = 7;
	public static final int MEMORY_SEMANTICS_WORKGROUP_MEMORY_SHIFT = 8;
	public static final int MEMORY_SEMANTICS_CROSS_WORKGROUP_MEMORY_SHIFT = 9;
	public static final int MEMORY_SEMANTICS_ATOMIC_COUNTER_MEMORY_SHIFT = 10;
	public static final int MEMORY_SEMANTICS_IMAGEMEMORY_SHIFT = 11;
	public static final int MEMORY_SEMANTICS_OUTPUT_MEMORY_SHIFT = 12;
	public static final int MEMORY_SEMANTICS_OUTPUT_MEMORY_KHR_SHIFT = 12;
	public static final int MEMORY_SEMANTICS_MAKE_AVAILABLE_SHIFT = 13;
	public static final int MEMORY_SEMANTICS_MAKE_AVAILABLE_KHR_SHIFT = 13;
	public static final int MEMORY_SEMANTICS_MAKE_VISIBLE_SHIFT = 14;
	public static final int MEMORY_SEMANTICS_MAKE_VISIBLE_KHR_SHIFT = 14;
	public static final int MEMORY_SEMANTICS_VOLATILE_SHIFT = 15;
	public static final int MEMORY_SEMANTICS_MAX = 0x7fffffff;

	public static final int MEMORY_SEMANTICS_MASK_NONE = 0;
	public static final int MEMORY_SEMANTICS_ACQUIRE_MASK = 0x00000002;
	public static final int MEMORY_SEMANTICS_RELEASE_MASK = 0x00000004;
	public static final int MEMORY_SEMANTICS_ACQUIRE_RELEASE_MASK = 0x00000008;
	public static final int MEMORY_SEMANTICS_SEQUENTIALLY_CONSISTENT_MASK = 0x00000010;
	public static final int MEMORY_SEMANTICS_UNIFORM_MEMORY_MASK = 0x00000040;
	public static final int MEMORY_SEMANTICS_SUBGROUP_MEMORY_MASK = 0x00000080;
	public static final int MEMORY_SEMANTICS_WORKGROUP_MEMORY_MASK = 0x00000100;
	public static final int MEMORY_SEMANTICS_CROSS_WORKGROUP_MEMORY_MASK = 0x00000200;
	public static final int MEMORY_SEMANTICS_ATOMIC_COUNTER_MEMORY_MASK = 0x00000400;
	public static final int MEMORY_SEMANTICS_IMAGE_MEMORY_MASK = 0x00000800;
	public static final int MEMORY_SEMANTICS_OUTPUT_MEMORY_MASK = 0x00001000;
	public static final int MEMORY_SEMANTICS_OUTPUT_MEMORY_KHR_MASK = 0x00001000;
	public static final int MEMORY_SEMANTICS_MAKE_AVAILABLE_MASK = 0x00002000;
	public static final int MEMORY_SEMANTICS_MAKE_AVAILABLE_KHR_MASK = 0x00002000;
	public static final int MEMORY_SEMANTICS_MAKE_VISIBLE_MASK = 0x00004000;
	public static final int MEMORY_SEMANTICS_MAKE_VISIBLE_KHR_MASK = 0x00004000;
	public static final int MEMORY_SEMANTICS_VOLATILE_MASK = 0x00008000;

	public static final int MEMORY_ACCESS_VOLATILE_SHIFT = 0;
	public static final int MEMORY_ACCESS_ALIGNED_SHIFT = 1;
	public static final int MEMORY_ACCESS_NONTEMPORAL_SHIFT = 2;
	public static final int MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_SHIFT = 3;
	public static final int MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_KHR_SHIFT = 3;
	public static final int MEMORY_ACCESS_MAKE_POINTER_VISIBLE_SHIFT = 4;
	public static final int MEMORY_ACCESS_MAKE_POINTER_VISIBLE_KHR_SHIFT = 4;
	public static final int MEMORY_ACCESS_NON_PRIVATE_POINTER_SHIFT = 5;
	public static final int MEMORY_ACCESS_NON_PRIVATE_POINTER_KHR_SHIFT = 5;
	public static final int MEMORY_ACCESS_MAX = 0x7fffffff;

	public static final int MEMORY_ACCESS_MASK_NONE = 0;
	public static final int MEMORY_ACCESS_VOLATILE_MASK = 0x00000001;
	public static final int MEMORY_ACCESS_ALIGNED_MASK = 0x00000002;
	public static final int MEMORY_ACCESS_NONTEMPORAL_MASK = 0x00000004;
	public static final int MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_MASK = 0x00000008;
	public static final int MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_KHR_MASK = 0x00000008;
	public static final int MEMORY_ACCESS_MAKE_POINTER_VISIBLE_MASK = 0x00000010;
	public static final int MEMORY_ACCESS_MAKE_POINTER_VISIBLE_KHR_MASK = 0x00000010;
	public static final int MEMORY_ACCESS_NON_PRIVATE_POINTER_MASK = 0x00000020;
	public static final int MEMORY_ACCESS_NON_PRIVATE_POINTER_KHR_MASK = 0x00000020;

	public static final int SCOPE_CROSS_DEVICE = 0;
	public static final int SCOPE_DEVICE = 1;
	public static final int SCOPE_WORKGROUP = 2;
	public static final int SCOPE_SUBGROUP = 3;
	public static final int SCOPE_INVOCATION = 4;
	public static final int SCOPE_QUEUE_FAMILY = 5;
	public static final int SCOPE_QUEUE_FAMILY_KHR = 5;
	public static final int SCOPE_SHADER_CALL_KHR = 6;
	public static final int SCOPE_MAX = 0x7fffffff;

	public static final int GROUP_OPERATION_REDUCE = 0;
	public static final int GROUP_OPERATION_INCLUSIVE_SCAN = 1;
	public static final int GROUP_OPERATION_EXCLUSIVE_SCAN = 2;
	public static final int GROUP_OPERATION_CLUSTERED_REDUCE = 3;
	public static final int GROUP_OPERATION_PARTITIONED_REDUCE_NV = 6;
	public static final int GROUP_OPERATION_PARTITIONED_INCLUSIVE_SCAN_NV = 7;
	public static final int GROUP_OPERATION_PARTITIONED_EXCLUSIVE_SCAN_NV = 8;
	public static final int GROUP_OPERATION_MAX = 0x7fffffff;

	public static final int KERNEL_ENQUEUE_FLAGS_NO_WAIT = 0;
	public static final int KERNEL_ENQUEUE_FLAGS_WAIT_KERNEL = 1;
	public static final int KERNEL_ENQUEUE_FLAGS_WAIT_WORK_GROUP = 2;
	public static final int KERNEL_ENQUEUE_FLAGS_MAX = 0x7fffffff;

	public static final int KERNEL_PROFILING_INFO_CMD_EXEC_TIME_SHIFT = 0;
	public static final int KERNEL_PROFILING_INFO_MAX = 0x7fffffff;

	public static final int KERNEL_PROFILING_INFO_MASK_NONE = 0;
	public static final int KERNEL_PROFILING_INFO_CMD_EXEC_TIME_MASK = 0x00000001;

	public static final int CAPABILITY_MATRIX = 0;
	public static final int CAPABILITY_SHADER = 1;
	public static final int CAPABILITY_GEOMETRY = 2;
	public static final int CAPABILITY_TESSELLATION = 3;
	public static final int CAPABILITY_ADDRESSES = 4;
	public static final int CAPABILITY_LINKAGE = 5;
	public static final int CAPABILITY_KERNEL = 6;
	public static final int CAPABILITY_VECTOR16 = 7;
	public static final int CAPABILITY_FLOAT16_BUFFER = 8;
	public static final int CAPABILITY_FLOAT16 = 9;
	public static final int CAPABILITY_FLOAT64 = 10;
	public static final int CAPABILITY_INT64 = 11;
	public static final int CAPABILITY_INT64_ATOMICS = 12;
	public static final int CAPABILITY_IMAGE_BASIC = 13;
	public static final int CAPABILITY_IMAGE_READ_WRITE = 14;
	public static final int CAPABILITY_IMAGE_MIPMAP = 15;
	public static final int CAPABILITY_PIPES = 17;
	public static final int CAPABILITY_GROUPS = 18;
	public static final int CAPABILITY_DEVICE_ENQUEUE = 19;
	public static final int CAPABILITY_LITERAL_SAMPLER = 20;
	public static final int CAPABILITY_ATOMIC_STORAGE = 21;
	public static final int CAPABILITY_INT16 = 22;
	public static final int CAPABILITY_TESSELLATION_POINT_SIZE = 23;
	public static final int CAPABILITY_GEOMETRY_POINT_SIZE = 24;
	public static final int CAPABILITY_IMAGE_GATHER_EXTENDED = 25;
	public static final int CAPABILITY_STORAGE_IMAGE_MULTISAMPLE = 27;
	public static final int CAPABILITY_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING = 28;
	public static final int CAPABILITY_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING = 29;
	public static final int CAPABILITY_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING = 30;
	public static final int CAPABILITY_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING = 31;
	public static final int CAPABILITY_CLIP_DISTANCE = 32;
	public static final int CAPABILITY_CULL_DISTANCE = 33;
	public static final int CAPABILITY_IMAGE_CUBE_ARRAY = 34;
	public static final int CAPABILITY_SAMPLE_RATE_SHADING = 35;
	public static final int CAPABILITY_IMAGE_RECT = 36;
	public static final int CAPABILITY_SAMPLED_RECT = 37;
	public static final int CAPABILITY_GENERIC_POINTER = 38;
	public static final int CAPABILITY_INT8 = 39;
	public static final int CAPABILITY_INPUT_ATTACHMENT = 40;
	public static final int CAPABILITY_SPARSE_RESIDENCY = 41;
	public static final int CAPABILITY_MIN_LOD = 42;
	public static final int CAPABILITY_SAMPLED1D = 43;
	public static final int CAPABILITY_IMAGE1D = 44;
	public static final int CAPABILITY_SAMPLED_CUBE_ARRAY = 45;
	public static final int CAPABILITY_SAMPLED_BUFFER = 46;
	public static final int CAPABILITY_IMAGE_BUFFER = 47;
	public static final int CAPABILITY_IMAGE_MS_ARRAY = 48;
	public static final int CAPABILITY_STORAGE_IMAGE_EXTENDED_FORMATS = 49;
	public static final int CAPABILITY_IMAGE_QUERY = 50;
	public static final int CAPABILITY_DERIVATIVE_CONTROL = 51;
	public static final int CAPABILITY_INTERPOLATION_FUNCTION = 52;
	public static final int CAPABILITY_TRANSFORM_FEEDBACK = 53;
	public static final int CAPABILITY_GEOMETRY_STREAMS = 54;
	public static final int CAPABILITY_STORAGE_IMAGE_READ_WITHOUT_FORMAT = 55;
	public static final int CAPABILITY_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT = 56;
	public static final int CAPABILITY_MULTI_VIEWPORT = 57;
	public static final int CAPABILITY_SUBGROUP_DISPATCH = 58;
	public static final int CAPABILITY_NAMED_BARRIER = 59;
	public static final int CAPABILITY_PIPE_STORAGE = 60;
	public static final int CAPABILITY_GROUP_NON_UNIFORM = 61;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_VOTE = 62;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_ARITHMETIC = 63;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_BALLOT = 64;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_SHUFFLE = 65;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_SHUFFLE_RELATIVE = 66;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_CLUSTERED = 67;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_QUAD = 68;
	public static final int CAPABILITY_SHADER_LAYER = 69;
	public static final int CAPABILITY_SHADER_VIEWPORT_INDEX = 70;
	public static final int CAPABILITY_SUBGROUP_BALLOT_KHR = 4423;
	public static final int CAPABILITY_DRAW_PARAMETERS = 4427;
	public static final int CAPABILITY_SUBGROUP_VOTE_KHR = 4431;
	public static final int CAPABILITY_STORAGE_BUFFER_16BIT_ACCESS = 4433;
	public static final int CAPABILITY_STORAGE_UNIFORM_BUFFER_BLOCK_16 = 4433;
	public static final int CAPABILITY_STORAGE_UNIFORM_16 = 4434;
	public static final int CAPABILITY_UNIFORM_AND_STORAGE_BUFFER_16BIT_ACCESS = 4434;
	public static final int CAPABILITY_STORAGE_PUSH_CONSTANT_16 = 4435;
	public static final int CAPABILITY_STORAGE_INPUT_OUTPUT_16 = 4436;
	public static final int CAPABILITY_DEVICE_GROUP = 4437;
	public static final int CAPABILITY_MULTI_VIEW = 4439;
	public static final int CAPABILITY_VARIABLE_POINTERS_STORAGE_BUFFER = 4441;
	public static final int CAPABILITY_VARIABLE_POINTERS = 4442;
	public static final int CAPABILITY_ATOMIC_STORAGE_OPS = 4445;
	public static final int CAPABILITY_SAMPLE_MASK_POST_DEPTH_COVERAGE = 4447;
	public static final int CAPABILITY_STORAGE_BUFFER_8BIT_ACCESS = 4448;
	public static final int CAPABILITY_UNIFORM_AND_STORAGE_BUFFER_8BIT_ACCESS = 4449;
	public static final int CAPABILITY_STORAGE_PUSH_CONSTANT_8 = 4450;
	public static final int CAPABILITY_DENORM_PRESERVE = 4464;
	public static final int CAPABILITY_DENORM_FLUSH_TO_ZERO = 4465;
	public static final int CAPABILITY_SIGNED_ZERO_INF_NAN_PRESERVE = 4466;
	public static final int CAPABILITY_ROUNDING_MODE_RTE = 4467;
	public static final int CAPABILITY_ROUNDING_MODE_RTZ = 4468;
	public static final int CAPABILITY_RAY_QUERY_PROVISIONAL_KHR = 4471;
	public static final int CAPABILITY_RAY_TRAVERSAL_PRIMITIVE_CULLING_PROVISIONAL_KHR = 4478;
	public static final int CAPABILITY_FLOAT16_IMAGE_AMD = 5008;
	public static final int CAPABILITY_IMAGE_GATHER_BIAS_LOD_AMD = 5009;
	public static final int CAPABILITY_FRAGMENT_MASK_AMD = 5010;
	public static final int CAPABILITY_STENCIL_EXPORT_EXT = 5013;
	public static final int CAPABILITY_IMAGE_READ_WRITE_LOD_AMD = 5015;
	public static final int CAPABILITY_SHADER_CLOCK_KHR = 5055;
	public static final int CAPABILITY_SAMPLE_MASK_OVERRIDE_COVERAGE_NV = 5249;
	public static final int CAPABILITY_GEOMETRY_SHADER_PASSTHROUGH_NV = 5251;
	public static final int CAPABILITY_SHADER_VIEWPORT_INDEX_LAYER_EXT = 5254;
	public static final int CAPABILITY_SHADER_VIEWPORT_INDEX_LAYER_NV = 5254;
	public static final int CAPABILITY_SHADER_VIEWPORT_MASK_NV = 5255;
	public static final int CAPABILITY_SHADER_STEREO_VIEW_NV = 5259;
	public static final int CAPABILITY_PER_VIEW_ATTRIBUTES_NV = 5260;
	public static final int CAPABILITY_FRAGMENT_FULLY_COVERED_EXT = 5265;
	public static final int CAPABILITY_MESH_SHADING_NV = 5266;
	public static final int CAPABILITY_IMAGE_FOOTPRINT_NV = 5282;
	public static final int CAPABILITY_FRAGMENT_BARYCENTRIC_NV = 5284;
	public static final int CAPABILITY_COMPUTE_DERIVATIVE_GROUP_QUADS_NV = 5288;
	public static final int CAPABILITY_FRAGMENT_DENSITY_EXT = 5291;
	public static final int CAPABILITY_SHADING_RATE_NV = 5291;
	public static final int CAPABILITY_GROUP_NON_UNIFORM_PARTITIONED_NV = 5297;
	public static final int CAPABILITY_SHADER_NON_UNIFORM = 5301;
	public static final int CAPABILITY_SHADER_NON_UNIFORM_EXT = 5301;
	public static final int CAPABILITY_RUNTIME_DESCRIPTOR_ARRAY = 5302;
	public static final int CAPABILITY_RUNTIME_DESCRIPTOR_ARRAY_EXT = 5302;
	public static final int CAPABILITY_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING = 5303;
	public static final int CAPABILITY_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_EXT = 5303;
	public static final int CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING = 5304;
	public static final int CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_EXT = 5304;
	public static final int CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING = 5305;
	public static final int CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_EXT = 5305;
	public static final int CAPABILITY_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING = 5306;
	public static final int CAPABILITY_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT = 5306;
	public static final int CAPABILITY_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING = 5307;
	public static final int CAPABILITY_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_EXT = 5307;
	public static final int CAPABILITY_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING = 5308;
	public static final int CAPABILITY_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT = 5308;
	public static final int CAPABILITY_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING = 5309;
	public static final int CAPABILITY_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_EXT = 5309;
	public static final int CAPABILITY_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING = 5310;
	public static final int CAPABILITY_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_EXT = 5310;
	public static final int CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING = 5311;
	public static final int CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT = 5311;
	public static final int CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING = 5312;
	public static final int CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT = 5312;
	public static final int CAPABILITY_RAY_TRACING_NV = 5340;
	public static final int CAPABILITY_VULKAN_MEMORY_MODEL = 5345;
	public static final int CAPABILITY_VULKAN_MEMORY_MODEL_KHR = 5345;
	public static final int CAPABILITY_VULKAN_MEMORY_MODEL_DEVICE_SCOPE = 5346;
	public static final int CAPABILITY_VULKAN_MEMORY_MODEL_DEVICE_SCOPE_KHR = 5346;
	public static final int CAPABILITY_PHYSICAL_STORAGE_BUFFER_ADDRESSES = 5347;
	public static final int CAPABILITY_PHYSICAL_STORAGE_BUFFER_ADDRESSES_EXT = 5347;
	public static final int CAPABILITY_COMPUTE_DERIVATIVE_GROUP_LINEAR_NV = 5350;
	public static final int CAPABILITY_RAY_TRACING_PROVISIONAL_KHR = 5353;
	public static final int CAPABILITY_COOPERATIVE_MATRIX_NV = 5357;
	public static final int CAPABILITY_FRAGMENT_SHADER_SAMPLE_INTERLOCK_EXT = 5363;
	public static final int CAPABILITY_FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_EXT = 5372;
	public static final int CAPABILITY_SHADER_SM_BUILTINS_NV = 5373;
	public static final int CAPABILITY_FRAGMENT_SHADER_PIXEL_INTERLOCK_EXT = 5378;
	public static final int CAPABILITY_DEMOTE_TO_HELPER_INVOCATION_EXT = 5379;
	public static final int CAPABILITY_SUBGROUP_SHUFFLE_INTEL = 5568;
	public static final int CAPABILITY_SUBGROUP_BUFFER_BLOCK_IO_INTEL = 5569;
	public static final int CAPABILITY_SUBGROUP_IMAGE_BLOCK_IO_INTEL = 5570;
	public static final int CAPABILITY_SUBGROUP_IMAGE_MEDIA_BLOCK_IO_INTEL = 5579;
	public static final int CAPABILITY_INTEGER_FUNCTIONS2_INTEL = 5584;
	public static final int CAPABILITY_FUNCTION_POINTERS_INTEL = 5603;
	public static final int CAPABILITY_INDIRECT_REFERENCES_INTEL = 5604;
	public static final int CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_INTEL = 5696;
	public static final int CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_INTRA_INTEL = 5697;
	public static final int CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_CHROMA_INTEL = 5698;
	public static final int CAPABILITY_FPGA_MEMORY_ATTRIBUTES_INTEL = 5824;
	public static final int CAPABILITY_UNSTRUCTURED_LOOP_CONTROLS_INTEL = 5886;
	public static final int CAPABILITY_FPGA_LOOP_CONTROLS_INTEL = 5888;
	public static final int CAPABILITY_KERNEL_ATTRIBUTES_INTEL = 5892;
	public static final int CAPABILITY_FPGA_KERNEL_ATTRIBUTES_INTEL = 5897;
	public static final int CAPABILITY_BLOCKING_PIPES_INTEL = 5945;
	public static final int CAPABILITY_FPGA_REG_INTEL = 5948;
	public static final int CAPABILITY_ATOMIC_FLOAT32_ADD_EXT = 6033;
	public static final int CAPABILITY_ATOMIC_FLOAT64_ADD_EXT = 6034;
	public static final int CAPABILITY_MAX = 0x7fffffff;

	public static final int RAY_FLAGS_OPAQUE_KHR_SHIFT = 0;
	public static final int RAY_FLAGS_NO_OPAQUE_KHR_SHIFT = 1;
	public static final int RAY_FLAGS_TERMINATE_ON_FIRST_HIT_KHR_SHIFT = 2;
	public static final int RAY_FLAGS_SKIP_CLOSEST_HIT_SHADER_KHR_SHIFT = 3;
	public static final int RAY_FLAGS_CULL_BACK_FACING_TRIANGLES_KHR_SHIFT = 4;
	public static final int RAY_FLAGS_CULL_FRONT_FACING_TRIANGLES_KHR_SHIFT = 5;
	public static final int RAY_FLAGS_CULL_OPAQUE_KHR_SHIFT = 6;
	public static final int RAY_FLAGS_CULL_NO_OPAQUE_KHR_SHIFT = 7;
	public static final int RAY_FLAGS_SKIP_TRIANGLES_KHR_SHIFT = 8;
	public static final int RAY_FLAGS_SKIP_AABBS_KHR_SHIFT = 9;
	public static final int RAY_FLAGS_MAX = 0x7fffffff;

	public static final int RAY_FLAGS_MASK_NONE = 0;
	public static final int RAY_FLAGS_OPAQUE_KHR_MASK = 0x00000001;
	public static final int RAY_FLAGS_NO_OPAQUE_KHR_MASK = 0x00000002;
	public static final int RAY_FLAGS_TERMINATE_ON_FIRST_HIT_KHR_MASK = 0x00000004;
	public static final int RAY_FLAGS_SKIP_CLOSEST_HIT_SHADER_KHR_MASK = 0x00000008;
	public static final int RAY_FLAGS_CULL_BACK_FACING_TRIANGLES_KHR_MASK = 0x00000010;
	public static final int RAY_FLAGS_CULL_FRONT_FACING_TRIANGLES_KHR_MASK = 0x00000020;
	public static final int RAY_FLAGS_CULL_OPAQUE_KHR_MASK = 0x00000040;
	public static final int RAY_FLAGS_CULL_NO_OPAQUE_KHR_MASK = 0x00000080;
	public static final int RAY_FLAGS_SKIP_TRIANGLES_KHR_MASK = 0x00000100;
	public static final int RAY_FLAGS_SKIP_AABBS_KHR_MASK = 0x00000200;

	public static final int RAY_QUERY_INTERSECTION_RAY_QUERY_CANDIDATE_INTERSECTION_KHR = 0;
	public static final int RAY_QUERY_INTERSECTION_RAY_QUERY_COMMITTED_INTERSECTION_KHR = 1;
	public static final int RAY_QUERY_INTERSECTION_MAX = 0x7fffffff;

	public static final int RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_NONE_KHR = 0;
	public static final int RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TRIANGLE_KHR = 1;
	public static final int RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_GENERATED_KHR = 2;
	public static final int RAY_QUERY_COMMITTED_INTERSECTION_TYPE_MAX = 0x7fffffff;

	public static final int RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TRIANGLE_KHR = 0;
	public static final int RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_AABB_KHR = 1;
	public static final int RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_MAX = 0x7fffffff;

	public static final int OP_NOP = 0;
	public static final int OP_UNDEF = 1;
	public static final int OP_SOURCE_CONTINUED = 2;
	public static final int OP_SOURCE = 3;
	public static final int OP_SOURCE_EXTENSION = 4;
	public static final int OP_NAME = 5;
	public static final int OP_MEMBER_NAME = 6;
	public static final int OP_STRING = 7;
	public static final int OP_LINE = 8;
	public static final int OP_EXTENSION = 10;
	public static final int OP_EXT_INST_IMPORT = 11;
	public static final int OP_EXT_INST = 12;
	public static final int OP_MEMORY_MODEL = 14;
	public static final int OP_ENTRY_POINT = 15;
	public static final int OP_EXECUTION_MODE = 16;
	public static final int OP_CAPABILITY = 17;
	public static final int OP_TYPE_VOID = 19;
	public static final int OP_TYPE_BOOL = 20;
	public static final int OP_TYPE_INT = 21;
	public static final int OP_TYPE_FLOAT = 22;
	public static final int OP_TYPE_VECTOR = 23;
	public static final int OP_TYPE_MATRIX = 24;
	public static final int OP_TYPE_IMAGE = 25;
	public static final int OP_TYPE_SAMPLER = 26;
	public static final int OP_TYPE_SAMPLED_IMAGE = 27;
	public static final int OP_TYPE_ARRAY = 28;
	public static final int OP_TYPE_RUNTIME_ARRAY = 29;
	public static final int OP_TYPE_STRUCT = 30;
	public static final int OP_TYPE_OPAQUE = 31;
	public static final int OP_TYPE_POINTER = 32;
	public static final int OP_TYPE_FUNCTION = 33;
	public static final int OP_TYPE_EVENT = 34;
	public static final int OP_TYPE_DEVICE_EVENT = 35;
	public static final int OP_TYPE_RESERVEID = 36;
	public static final int OP_TYPE_QUEUE = 37;
	public static final int OP_TYPE_PIPE = 38;
	public static final int OP_TYPE_FORWARD_POINTER = 39;
	public static final int OP_CONSTANT_TRUE = 41;
	public static final int OP_CONSTANT_FALSE = 42;
	public static final int OP_CONSTANT = 43;
	public static final int OP_CONSTANT_COMPOSITE = 44;
	public static final int OP_CONSTANT_SAMPLER = 45;
	public static final int Op_Constant_Null = 46;
	public static final int OP_SPEC_CONSTANT_TRUE = 48;
	public static final int Op_Spec_Constant_False = 49;
	public static final int OP_SPEC_CONSTANT = 50;
	public static final int OP_SPEC_CONSTANT_COMPOSITE = 51;
	public static final int OP_SPEC_CONSTANT_OP = 52;
	public static final int OP_FUNCTION = 54;
	public static final int OP_FUNCTION_PARAMETER = 55;
	public static final int OP_FUNCTION_END = 56;
	public static final int OP_FUNCTION_CALL = 57;
	public static final int OP_VARIABLE = 59;
	public static final int OP_IMAGE_TEXEL_POINTER = 60;
	public static final int OP_LOAD = 61;
	public static final int OP_STORE = 62;
	public static final int OP_COPY_MEMORY = 63;
	public static final int OP_COPY_MEMORY_SIZED = 64;
	public static final int OP_ACCESS_CHAIN = 65;
	public static final int OP_IN_BOUNDS_ACCESS_CHAIN = 66;
	public static final int OP_PTR_ACCESS_CHAIN = 67;
	public static final int OP_ARRAY_LENGTH = 68;
	public static final int OP_GENERIC_PTR_MEM_SEMANTICS = 69;
	public static final int OP_IN_BOUNDS_PTR_ACCESS_CHAIN = 70;
	public static final int OP_DECORATE = 71;
	public static final int OP_MEMBER_DECORATE = 72;
	public static final int OP_DECORATION_GROUP = 73;
	public static final int OP_GROUP_DECORATE = 74;
	public static final int OP_GROUP_MEMBER_DECORATE = 75;
	public static final int OP_VECTOR_EXTRACT_DYNAMIC = 77;
	public static final int OP_VECTOR_INSERT_DYNAMIC = 78;
	public static final int OP_VECTOR_SHUFFLE = 79;
	public static final int OP_COMPOSITE_CONSTRUCT = 80;
	public static final int OP_COMPOSITE_EXTRACT = 81;
	public static final int OP_COMPOSITE_INSERT = 82;
	public static final int OP_COPY_OBJECT = 83;
	public static final int OP_TRANSPOSE = 84;
	public static final int OP_SAMPLED_IMAGE = 86;
	public static final int OP_IMAGE_SAMPLE_IMPLICIT_LOD = 87;
	public static final int OP_IMAGE_SAMPLE_EXPLICIT_LOD = 88;
	public static final int OP_IMAGE_SAMPLE_DREF_IMPLICIT_LOD = 89;
	public static final int OP_IMAGE_SAMPLE_DREF_EXPLICIT_LOD = 90;
	public static final int OP_IMAGE_SAMPLE_PROJ_IMPLICIT_LOD = 91;
	public static final int OP_IMAGE_SAMPLE_PROJ_EXPLICIT_LOD = 92;
	public static final int OP_IMAGE_SAMPLE_PROJ_DREF_IMPLICIT_LOD = 93;
	public static final int OP_IMAGE_SAMPLE_PROJ_DREF_EXPLICIT_LOD = 94;
	public static final int Op_Image_Fetch = 95;
	public static final int Op_Image_Gather = 96;
	public static final int OP_IMAGE_DREF_GATHER = 97;
	public static final int OP_IMAGE_READ = 98;
	public static final int OP_IMAGE_WRITE = 99;
	public static final int OP_IMAGE = 100;
	public static final int OP_IMAGE_QUERY_FORMAT = 101;
	public static final int OP_IMAGE_QUERY_ORDER = 102;
	public static final int OP_IMAGE_QUERY_SIZE_LOD = 103;
	public static final int OP_IMAGE_QUERY_SIZE = 104;
	public static final int OP_IMAGE_QUERY_LOD = 105;
	public static final int OP_IMAGE_QUERY_LEVELS = 106;
	public static final int OP_IMAGE_QUERY_SAMPLES = 107;
	public static final int OP_CONVERT_F_TO_U = 109;
	public static final int OP_CONVERT_F_TO_S = 110;
	public static final int OP_CONVERT_S_TO_F = 111;
	public static final int OP_CONVERT_U_TO_F = 112;
	public static final int OP_U_CONVERT = 113;
	public static final int OP_S_CONVERT = 114;
	public static final int OP_F_CONVERT = 115;
	public static final int OP_QUANTIZE_TO_F16 = 116;
	public static final int OP_CONVERT_PTR_TO_U = 117;
	public static final int Op_Sat_Convert_S_To_U = 118;
	public static final int OP_SAT_CONVERT_U_TO_S = 119;
	public static final int OP_CONVERT_U_TO_PTR = 120;
	public static final int OP_PTR_CAST_TO_GENERIC = 121;
	public static final int OP_GENERIC_CAST_TO_PTR = 122;
	public static final int OP_GENERIC_CAST_TO_PTR_EXPLICIT = 123;
	public static final int OP_BITCAST = 124;
	public static final int OP_S_NEGATE = 126;
	public static final int OP_F_NEGATE = 127;
	public static final int OP_I_ADD = 128;
	public static final int OP_F_ADD = 129;
	public static final int OP_I_SUB = 130;
	public static final int OP_F_SUB = 131;
	public static final int OP_I_MUL = 132;
	public static final int OP_F_MUL = 133;
	public static final int OP_U_DIV = 134;
	public static final int OP_S_DIV = 135;
	public static final int OP_F_DIV = 136;
	public static final int OP_U_MOD = 137;
	public static final int OP_S_REM = 138;
	public static final int OP_S_MOD = 139;
	public static final int OP_F_REM = 140;
	public static final int OP_F_MOD = 141;
	public static final int OP_VECTOR_TIMES_SCALAR = 142;
	public static final int OP_MATRIX_TIMES_SCALAR = 143;
	public static final int OP_VECTOR_TIMES_MATRIX = 144;
	public static final int OP_MATRIX_TIMES_VECTOR = 145;
	public static final int OP_MATRIX_TIMES_MATRIX = 146;
	public static final int OP_OUTER_PRODUCT = 147;
	public static final int OP_DOT = 148;
	public static final int OP_I_ADD_CARRY = 149;
	public static final int OP_I_SUB_BORROW = 150;
	public static final int OP_U_MUL_EXTENDED = 151;
	public static final int OP_S_MUL_EXTENDED = 152;
	public static final int OP_ANY = 154;
	public static final int OP_ALL = 155;
	public static final int OP_IS_NAN = 156;
	public static final int OP_IS_INF = 157;
	public static final int OP_IS_FINITE = 158;
	public static final int OP_IS_NORMAL = 159;
	public static final int OP_SIGN_BIT_SET = 160;
	public static final int OP_LESS_OR_GREATER = 161;
	public static final int OP_ORDERED = 162;
	public static final int OP_UNORDERED = 163;
	public static final int OP_LOGICAL_EQUAL = 164;
	public static final int OP_LOGICAL_NOT_EQUAL = 165;
	public static final int OP_LOGICAL_OR = 166;
	public static final int OP_LOGICAL_AND = 167;
	public static final int OP_LOGICAL_NOT = 168;
	public static final int OP_SELECT = 169;
	public static final int OP_I_EQUAL = 170;
	public static final int OP_I_NOT_EQUAL = 171;
	public static final int OP_U_GREATER_THAN = 172;
	public static final int OP_S_GREATER_THAN = 173;
	public static final int OP_U_GREATER_THAN_EQUAL = 174;
	public static final int OP_S_GREATER_THAN_EQUAL = 175;
	public static final int OP_U_LESS_THAN = 176;
	public static final int OP_S_LESS_THAN = 177;
	public static final int OP_U_LESS_THAN_EQUAL = 178;
	public static final int OP_S_LESS_THAN_EQUAL = 179;
	public static final int OP_F_ORD_EQUAL = 180;
	public static final int OP_F_UNORD_EQUAL = 181;
	public static final int OP_F_ORD_NOT_EQUAL = 182;
	public static final int OP_F_UNORD_NOT_EQUAL = 183;
	public static final int OP_F_ORD_LESS_THAN = 184;
	public static final int OP_F_UNORD_LESS_THAN = 185;
	public static final int OP_F_ORD_GREATER_THAN = 186;
	public static final int OP_F_UNORD_GREATER_THAN = 187;
	public static final int OP_F_ORD_LESS_THAN_EQUAL = 188;
	public static final int OP_F_UNORD_LESS_THAN_EQUAL = 189;
	public static final int OP_F_ORD_GREATER_THAN_EQUAL = 190;
	public static final int OP_F_UNORD_GREATER_THAN_EQUAL = 191;
	public static final int OP_SHIFT_RIGHT_LOGICAL = 194;
	public static final int OP_SHIFT_RIGHT_ARITHMETIC = 195;
	public static final int OP_SHIFT_LEFT_LOGICAL = 196;
	public static final int OP_BITWISE_OR = 197;
	public static final int OP_BITWISE_XOR = 198;
	public static final int OP_BITWISE_AND = 199;
	public static final int OP_NOT = 200;
	public static final int OP_BIT_FIELD_INSERT = 201;
	public static final int OP_BIT_FIELD_S_EXTRACT = 202;
	public static final int OP_BIT_FIELD_U_EXTRACT = 203;
	public static final int OP_BIT_REVERSE = 204;
	public static final int OP_BIT_COUNT = 205;
	public static final int OP_DPDX = 207;
	public static final int OP_DPDY = 208;
	public static final int OP_F_WIDTH = 209;
	public static final int OP_DPDX_FINE = 210;
	public static final int OP_DPDY_FINE = 211;
	public static final int OP_F_WIDTH_FINE = 212;
	public static final int OP_DPDX_COARSE = 213;
	public static final int OP_DPDY_COARSE = 214;
	public static final int OP_F_WIDTH_COARSE = 215;
	public static final int OP_EMIT_VERTEX = 218;
	public static final int OP_END_PRIMITIVE = 219;
	public static final int OP_EMIT_STREAM_VERTEX = 220;
	public static final int OP_END_STREAM_PRIMITIVE = 221;
	public static final int OP_CONTROL_BARRIER = 224;
	public static final int OP_MEMORY_BARRIER = 225;
	public static final int OP_ATOMIC_LOAD = 227;
	public static final int OP_ATOMIC_STORE = 228;
	public static final int OP_ATOMIC_EXCHANGE = 229;
	public static final int OP_ATOMIC_COMPARE_EXCHANGE = 230;
	public static final int OP_ATOMIC_COMPARE_EXCHANGE_WEAK = 231;
	public static final int OP_ATOMIC_I_INCREMENT = 232;
	public static final int OP_ATOMIC_I_DECREMENT = 233;
	public static final int OP_ATOMIC_I_ADD = 234;
	public static final int OP_ATOMIC_I_SUB = 235;
	public static final int OP_ATOMIC_S_MIN = 236;
	public static final int OP_ATOMIC_U_MIN = 237;
	public static final int OP_ATOMIC_S_MAX = 238;
	public static final int OP_ATOMIC_U_MAX = 239;
	public static final int OP_ATOMIC_AND = 240;
	public static final int OP_ATOMIC_OR = 241;
	public static final int OP_ATOMIC_XOR = 242;
	public static final int OP_PHI = 245;
	public static final int OP_LOOP_MERGE = 246;
	public static final int OP_SELECTION_MERGE = 247;
	public static final int OP_LABEL = 248;
	public static final int OP_BRANCH = 249;
	public static final int OP_BRANCH_CONDITIONAL = 250;
	public static final int OP_SWITCH = 251;
	public static final int OP_KILL = 252;
	public static final int OP_RETURN = 253;
	public static final int OP_RETURN_VALUE = 254;
	public static final int OP_UNREACHABLE = 255;
	public static final int OP_LIFETIME_START = 256;
	public static final int OP_LIFETIME_STOP = 257;
	public static final int OP_GROUP_ASYNC_COPY = 259;
	public static final int OP_GROUP_WAIT_EVENTS = 260;
	public static final int OP_GROUP_ALL = 261;
	public static final int OP_GROUP_ANY = 262;
	public static final int Op_Group_Broadcast = 263;
	public static final int OP_GROUP_I_ADD = 264;
	public static final int OP_GROUP_F_ADD = 265;
	public static final int OP_GROUP_F_MIN = 266;
	public static final int OP_GROUP_U_MIN = 267;
	public static final int OP_GROUP_S_MIN = 268;
	public static final int OP_GROUP_F_MAX = 269;
	public static final int OP_GROUP_U_MAX = 270;
	public static final int OP_GROUP_S_MAX = 271;
	public static final int OP_READ_PIPE = 274;
	public static final int OP_WRITE_PIPE = 275;
	public static final int Op_ReservEd_Read_Pipe = 276;
	public static final int OP_RESERVED_WRITE_PIPE = 277;
	public static final int OP_RESERVE_READ_PIPE_PACKETS = 278;
	public static final int OP_RESERVE_WRITE_PIPE_PACKETS = 279;
	public static final int OP_COMMIT_READ_PIPE = 280;
	public static final int OP_COMMIT_WRITE_PIPE = 281;
	public static final int OP_IS_VALID_RESERVE_ID = 282;
	public static final int OP_GET_NUM_PIPE_PACKETS = 283;
	public static final int OP_GET_MAX_PIPE_PACKETS = 284;
	public static final int OP_GROUP_RESERVE_READ_PIPE_PACKETS = 285;
	public static final int OP_GROUP_RESERVE_WRITE_PIPE_PACKETS = 286;
	public static final int OP_GROUP_COMMIT_READ_PIPE = 287;
	public static final int OP_GROUP_COMMIT_WRITE_PIPE = 288;
	public static final int OP_ENQUEUE_MARKER = 291;
	public static final int OP_ENQUEUE_KERNEL = 292;
	public static final int OP_GET_KERNEL_NDRANGE_SUB_GROUP_COUNT = 293;
	public static final int OP_GET_KERNEL_NDRANGE_MAX_SUB_GROUP_SIZE = 294;
	public static final int OP_GET_KERNEL_WORK_GROUP_SIZE = 295;
	public static final int OP_GET_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 296;
	public static final int OP_RETAIN_EVENT = 297;
	public static final int OP_RELEASE_EVENT = 298;
	public static final int OP_CREATE_USER_EVENT = 299;
	public static final int OP_IS_VALID_EVENT = 300;
	public static final int OP_SET_USER_EVENT_STATUS = 301;
	public static final int OP_CAPTURE_EVENT_PROFILING_INFO = 302;
	public static final int OP_GET_DEFAULT_QUEUE = 303;
	public static final int OP_BUILD_ND_RANGE = 304;
	public static final int OP_IMAGE_SPARSE_SAMPLE_IMPLICIT_LOD = 305;
	public static final int OP_IMAGE_SPARSE_SAMPLE_EXPLICIT_LOD = 306;
	public static final int OP_IMAGE_SPARSE_SAMPLE_DREF_IMPLICIT_LOD = 307;
	public static final int OP_IMAGE_SPARSE_SAMPLE_DREF_EXPLICIT_LOD = 308;
	public static final int OP_IMAGE_SPARSE_SAMPLE_PROJ_IMPLICIT_LOD = 309;
	public static final int OP_IMAGE_SPARSE_SAMPLE_PROJ_EXPLICIT_LOD = 310;
	public static final int OP_IMAGE_SPARSE_SAMPLE_PROJ_DREF_IMPLICIT_LOD = 311;
	public static final int OP_IMAGE_SPARSE_SAMPLE_PROJ_DREF_EXPLICIT_LOD = 312;
	public static final int OP_IMAGE_SPARSE_FETCH = 313;
	public static final int OP_IMAGE_SPARSE_GATHER = 314;
	public static final int OP_IMAGE_SPARSE_DREF_GATHER = 315;
	public static final int OP_IMAGE_SPARSE_TEXELS_RESIDENT = 316;
	public static final int OP_NO_LINE = 317;
	public static final int OP_ATOMIC_FLAG_TEST_AND_SET = 318;
	public static final int OP_ATOMIC_FLAG_CLEAR = 319;
	public static final int OP_IMAGE_SPARSE_READ = 320;
	public static final int OP_SIZE_OF = 321;
	public static final int OP_TYPE_PIPE_STORAGE = 322;
	public static final int OP_CONSTANT_PIPE_STORAGE = 323;
	public static final int OP_CREATE_PIPE_FROM_PIPE_STORAGE = 324;
	public static final int OP_GET_KERNEL_LOCAL_SIZE_FOR_SUBGROUP_COUNT = 325;
	public static final int OP_GET_KERNEL_MAX_NUM_SUBGROUPS = 326;
	public static final int OP_TYPE_NAMED_BARRIER = 327;
	public static final int OP_NAMED_BARRIER_INITIALIZE = 328;
	public static final int OP_MEMORY_NAMED_BARRIER = 329;
	public static final int OP_MODULE_PROCESSED = 330;
	public static final int OP_EXECUTION_MODE_ID = 331;
	public static final int OP_DECORATE_ID = 332;
	public static final int OP_GROUP_NON_UNIFORM_ELECT = 333;
	public static final int OP_GROUP_NON_UNIFORM_ALL = 334;
	public static final int OP_GROUP_NON_UNIFORM_ANY = 335;
	public static final int OP_GROUP_NON_UNIFORM_ALL_EQUAL = 336;
	public static final int OP_GROUP_NON_UNIFORM_BROADCAST = 337;
	public static final int OP_GROUP_NON_UNIFORM_BROADCAST_FIRST = 338;
	public static final int OP_GROUP_NON_UNIFORM_BALLOT = 339;
	public static final int OP_GROUP_NON_UNIFORM_INVERSE_BALLOT = 340;
	public static final int OP_GROUP_NON_UNIFORM_BALLOT_BIT_EXTRACT = 341;
	public static final int OP_GROUP_NON_UNIFORM_BALLOT_BIT_COUNT = 342;
	public static final int OP_GROUP_NON_UNIFORM_BALLOT_FIND_LSB = 343;
	public static final int OP_GROUP_NON_UNIFORM_BALLOT_FIND_MSB = 344;
	public static final int OP_GROUP_NON_UNIFORM_SHUFFLE = 345;
	public static final int OP_GROUP_NON_UNIFORM_SHUFFLE_XOR = 346;
	public static final int OP_GROUP_NON_UNIFORM_SHUFFLE_UP = 347;
	public static final int OP_GROUP_NON_UNIFORM_SHUFFLE_DOWN = 348;
	public static final int OP_GROUP_NON_UNIFORM_I_ADD = 349;
	public static final int OP_GROUP_NON_UNIFORM_F_ADD = 350;
	public static final int OP_GROUP_NON_UNIFORM_I_MUL = 351;
	public static final int OP_GROUP_NON_UNIFORM_F_MUL = 352;
	public static final int OP_GROUP_NON_UNIFORM_S_MIN = 353;
	public static final int OP_GROUP_NON_UNIFORM_U_MIN = 354;
	public static final int OP_GROUP_NON_UNIFORM_F_MIN = 355;
	public static final int OP_GROUP_NON_UNIFORM_S_MAX = 356;
	public static final int OP_GROUP_NON_UNIFORM_U_MAX = 357;
	public static final int OP_GROUP_NON_UNIFORM_F_MAX = 358;
	public static final int OP_GROUP_NON_UNIFORM_BITWISE_AND = 359;
	public static final int OP_GROUP_NON_UNIFORM_BITWISE_OR = 360;
	public static final int OP_GROUP_NON_UNIFORM_BITWISE_XOR = 361;
	public static final int OP_GROUP_NON_UNIFORM_LOGICAL_AND = 362;
	public static final int OP_GROUP_NON_UNIFORM_LOGICAL_OR = 363;
	public static final int OP_GROUP_NON_UNIFORM_LOGICAL_XOR = 364;
	public static final int OP_GROUP_NON_UNIFORM_QUAD_BROADCAST = 365;
	public static final int OP_GROUP_NON_UNIFORM_QUAD_SWAP = 366;
	public static final int OP_COPY_LOGICAL = 400;
	public static final int OP_PTR_EQUAL = 401;
	public static final int OP_PTR_NOT_EQUAL = 402;
	public static final int OP_PTR_DIFF = 403;
	public static final int OP_SUBGROUP_BALLOT_KHR = 4421;
	public static final int OP_SUBGROUP_FIRST_INVOCATION_KHR = 4422;
	public static final int OP_SUBGROUP_ALL_KHR = 4428;
	public static final int OP_SUBGROUP_ANY_KHR = 4429;
	public static final int OP_SUBGROUP_ALL_EQUAL_KHR = 4430;
	public static final int OP_SUBGROUP_READ_INVOCATION_KHR = 4432;
	public static final int Op_Type_Ray_Query_Provisional_KHR = 4472;
	public static final int OP_RAY_QUERY_INITIALIZE_KHR = 4473;
	public static final int OP_RAY_QUERY_TERMINATE_KHR = 4474;
	public static final int OP_RAY_QUERY_GENERATE_INTERSECTION_KHR = 4475;
	public static final int OP_RAY_QUERY_CONFIRM_INTERSECTION_KHR = 4476;
	public static final int OP_RAY_QUERY_PROCEED_KHR = 4477;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_TYPE_KHR = 4479;
	public static final int OP_GROUP_I_ADD_NON_UNIFORM_AMD = 5000;
	public static final int OP_GROUP_F_ADD_NON_UNIFORM_AMD = 5001;
	public static final int OP_GROUP_F_MIN_NON_UNIFORM_AMD = 5002;
	public static final int OP_GROUP_U_MIN_NON_UNIFORM_AMD = 5003;
	public static final int OP_GROUP_S_MIN_NON_UNIFORM_AMD = 5004;
	public static final int OP_GROUP_F_MAX_NON_UNIFORM_AMD = 5005;
	public static final int OP_GROUP_U_MAX_NON_UNIFORM_AMD = 5006;
	public static final int OP_GROUP_S_MAX_NON_UNIFORM_AMD = 5007;
	public static final int OP_FRAGMENT_MASK_FETCH_AMD = 5011;
	public static final int OP_FRAGMENT_FETCH_AMD = 5012;
	public static final int OP_READ_CLOCK_KHR = 5056;
	public static final int OP_IMAGE_SAMPLE_FOOTPRINT_NV = 5283;
	public static final int OP_GROUP_NON_UNIFORM_PARTITION_NV = 5296;
	public static final int OP_WRITE_PACKED_PRIMITIVE_INDICES_4X8_NV = 5299;
	public static final int OP_REPORT_INTERSECTION_KHR = 5334;
	public static final int OP_REPORT_INTERSECTION_NV = 5334;
	public static final int OP_IGNORE_INTERSECTION_KHR = 5335;
	public static final int OP_IGNORE_INTERSECTION_NV = 5335;
	public static final int OP_TERMINATE_RAY_KHR = 5336;
	public static final int OP_TERMINATE_RAY_NV = 5336;
	public static final int OP_TRACE_NV = 5337;
	public static final int OP_TRACE_RAY_KHR = 5337;
	public static final int OP_TYPE_ACCELERATION_STRUCTURE_KHR = 5341;
	public static final int OP_TYPE_ACCELERATION_STRUCTURE_NV = 5341;
	public static final int OP_EXECUTE_CALLABLE_KHR = 5344;
	public static final int OP_EXECUTE_CALLABLE_NV = 5344;
	public static final int OP_TYPE_COOPERATIVE_MATRIX_NV = 5358;
	public static final int OP_COOPERATIVE_MATRIX_LOAD_NV = 5359;
	public static final int OP_COOPERATIVE_MATRIX_STORE_NV = 5360;
	public static final int OP_COOPERATIVE_MATRIX_MUL_ADD_NV = 5361;
	public static final int OP_COOPERATIVE_MATRIX_LENGTH_NV = 5362;
	public static final int OP_BEGIN_INVOCATION_INTERLOCK_EXT = 5364;
	public static final int OP_END_INVOCATION_INTERLOCK_EXT = 5365;
	public static final int OP_DEMOTE_TO_HELPER_INVOCATION_EXT = 5380;
	public static final int OP_IS_HELPER_INVOCATION_EXT = 5381;
	public static final int OP_SUBGROUP_SHUFFLE_INTEL = 5571;
	public static final int OP_SUBGROUP_SHUFFLE_DOWN_INTEL = 5572;
	public static final int OP_SUBGROUP_SHUFFLE_UP_INTEL = 5573;
	public static final int OP_SUBGROUP_SHUFFLE_XOR_INTEL = 5574;
	public static final int OP_SUBGROUP_BLOCK_READ_INTEL = 5575;
	public static final int OP_SUBGROUP_BLOCK_WRITE_INTEL = 5576;
	public static final int OP_SUBGROUP_IMAGE_BLOCK_READ_INTEL = 5577;
	public static final int OP_SUBGROUP_IMAGE_BLOCK_WRITE_INTEL = 5578;
	public static final int OP_SUBGROUP_IMAGE_MEDIA_BLOCK_READ_INTEL = 5580;
	public static final int OP_SUBGROUP_IMAGE_MEDIA_BLOCK_WRITE_INTEL = 5581;
	public static final int OP_U_COUNT_LEADING_ZEROS_INTEL = 5585;
	public static final int OP_U_COUNT_TRAILING_ZEROS_INTEL = 5586;
	public static final int OP_ABS_I_SUB_INTEL = 5587;
	public static final int OP_ABS_U_SUB_INTEL = 5588;
	public static final int OP_I_ADD_SAT_INTEL = 5589;
	public static final int OP_U_ADD_SAT_INTEL = 5590;
	public static final int OP_I_AVERAGE_INTEL = 5591;
	public static final int OP_U_AVERAGE_INTEL = 5592;
	public static final int OP_I_AVERAGE_ROUNDED_INTEL = 5593;
	public static final int OP_U_AVERAGE_ROUNDED_INTEL = 5594;
	public static final int OP_I_SUB_SAT_INTEL = 5595;
	public static final int OP_U_SUB_SAT_INTEL = 5596;
	public static final int OP_I_MUL_32X16_INTEL = 5597;
	public static final int OP_U_MUL_32X16_INTEL = 5598;
	public static final int OP_FUNCTION_POINTER_INTEL = 5600;
	public static final int OP_FUNCTION_POINTER_CALL_INTEL = 5601;
	public static final int OP_DECORATE_STRING = 5632;
	public static final int OP_DECORATE_STRING_GOOGLE = 5632;
	public static final int OP_MEMBER_DECORATE_STRING = 5633;
	public static final int OP_MEMBER_DECORATE_STRING_GOOGLE = 5633;
	public static final int OP_VME_IMAGE_INTEL = 5699;
	public static final int OP_TYPE_VME_IMAGE_INTEL = 5700;
	public static final int OP_TYPE_AVC_IME_PAYLOAD_INTEL = 5701;
	public static final int OP_TYPE_AVC_REF_PAYLOAD_INTEL = 5702;
	public static final int OP_TYPE_AVC_SIC_PAYLOAD_INTEL = 5703;
	public static final int OP_TYPE_AVC_MCE_PAYLOAD_INTEL = 5704;
	public static final int OP_TYPE_AVC_MCE_RESULT_INTEL = 5705;
	public static final int OP_TYPE_AVC_IME_RESULT_INTEL = 5706;
	public static final int OP_TYPE_AVC_IME_RESULT_SINGLE_REFERENCE_STREAMOUT_INTEL = 5707;
	public static final int OP_TYPE_AVC_IME_RESULT_DUAL_REFERENCE_STREAMOUT_INTEL = 5708;
	public static final int OP_TYPE_AVC_IME_SINGLE_REFERENCE_STREAMIN_INTEL = 5709;
	public static final int OP_TYPE_AVC_IME_DUAL_REFERENCE_STREAMIN_INTEL = 5710;
	public static final int OP_TYPE_AVC_REF_RESULT_INTEL = 5711;
	public static final int OP_TYPE_AVC_SIC_RESULT_INTEL = 5712;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_BASE_MULTI_REFERENCE_PENALTY_INTEL = 5713;
	public static final int OP_SUBGROUP_AVC_MCE_SET_INTER_BASE_MULTI_REFERENCE_PENALTY_INTEL = 5714;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_SHAPE_PENALTY_INTEL = 5715;
	public static final int OP_SUBGROUP_AVC_MCE_SET_INTER_SHAPE_PENALTY_INTEL = 5716;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_DIRECTION_PENALTY_INTEL = 5717;
	public static final int OP_SUBGROUP_AVC_MCE_SET_INTE_DIRECTION_PENALTY_INTEL = 5718;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_LUMA_SHAPE_PENALTY_INTEL = 5719;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_MOTION_VECTOR_COST_TABLE_INTEL = 5720;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_HIGH_PENALTY_COST_TABLE_INTEL = 5721;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_MEDIUM_PENALTY_COST_TABLE_INTEL = 5722;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_LOW_PENALTY_COST_TABLE_INTEL = 5723;
	public static final int OP_SUBGROUP_AVC_MCE_SET_MOTION_VECTOR_COST_FUNCTION_INTEL = 5724;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_LUMA_MODE_PENALTY_INTEL = 5725;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_NON_DC_LUMA_INTRA_PENALTY_INTEL = 5726;
	public static final int OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_CHROMA_MODE_BASE_PENALTY_INTEL = 5727;
	public static final int OP_SUBGROUP_AVC_MCE_SET_AC_ONLY_HAAR_INTEL = 5728;
	public static final int OP_SUBGROUP_AVC_MCE_SET_SOURCE_INTERLACED_FIELD_POLARITY_INTEL = 5729;
	public static final int OP_SUBGROUP_AVC_MCE_SET_SINGLE_REFERENCE_INTERLACED_FIELD_POLARITY_INTEL = 5730;
	public static final int OP_SUBGROUP_AVC_MCE_SET_DUAL_REFERENCE_INTERLACED_FIELD_POLARITIES_INTEL = 5731;
	public static final int OP_SUBGROUP_AVC_MCE_CONVERT_TO_IME_PAYLOAD_INTEL = 5732;
	public static final int OP_SUBGROUP_AVC_MCE_CONVERT_TO_IME_RESULT_INTEL = 5733;
	public static final int OP_SUBGROUP_AVC_MCE_CONVERT_TO_REF_PAYLOAD_INTEL = 5734;
	public static final int OP_SUBGROUP_AVC_MCE_CONVERT_TO_REF_RESULT_INTEL = 5735;
	public static final int OP_SUBGROUP_AVC_MCE_CONVERT_TO_SIC_PAYLOAD_INTEL = 5736;
	public static final int OP_SUBGROUP_AVC_MCE_CONVERT_TO_SIC_RESULT_INTEL = 5737;
	public static final int OP_SUBGROUP_AVC_MCE_GET_MOTION_VECTORS_INTEL = 5738;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_DISTORTIONS_INTEL = 5739;
	public static final int OP_SUBGROUP_AVC_MCE_GET_BEST_INTER_DISTORTIONS_INTEL = 5740;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_MAJOR_SHAPE_INTEL = 5741;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_MINOR_SHAPE_INTEL = 5742;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_DIRECTIONS_INTEL = 5743;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_MOTION_VECTOR_COUNT_INTEL = 5744;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_REFERENCE_IDS_INTEL = 5745;
	public static final int OP_SUBGROUP_AVC_MCE_GET_INTER_REFERENCE_INTERLACED_FIELD_POLARITIES_INTEL = 5746;
	public static final int Op_Subgroup_Avc_Ime_Initialize_INTEL = 5747;
	public static final int OP_SUBGROUP_AVC_IME_SET_SINGLE_REFERENCE_INTEL = 5748;
	public static final int OP_SUBGROUP_AVC_IME_SET_DUAL_REFERENCE_INTEL = 5749;
	public static final int OP_SUBGROUP_AVC_IME_REF_WINDOW_SIZE_INTEL = 5750;
	public static final int OP_SUBGROUP_AVC_IME_ADJUST_REF_OFFSET_INTEL = 5751;
	public static final int OP_SUBGROUP_AVC_IME_CONVERT_TO_MCE_PAYLOAD_INTEL = 5752;
	public static final int OP_SUBGROUP_AVC_IME_SET_MAX_MOTION_VECTOR_COUNT_INTEL = 5753;
	public static final int OP_SUBGROUP_AVC_IME_SET_UNIDIRECTIONAL_MIX_DISABLE_INTEL = 5754;
	public static final int OP_SUBGROUP_AVC_IME_SET_EARLY_SEARCH_TERMINATION_THRESHOLD_INTEL = 5755;
	public static final int OP_SUBGROUP_AVC_IME_SET_WEIGHTED_SAD_INTEL = 5756;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_INTEL = 5757;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_INTEL = 5758;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMIN_INTEL = 5759;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMIN_INTEL = 5760;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMOUT_INTEL = 5761;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMOUT_INTEL = 5762;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMINOUT_INTEL = 5763;
	public static final int OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMINOUT_INTEL = 5764;
	public static final int OP_SUBGROUP_AVC_IME_CONVERT_TO_MCE_RESULT_INTEL = 5765;
	public static final int OP_SUBGROUP_AVC_IME_GET_SINGLE_REFERENCE_STREAMIN_INTEL = 5766;
	public static final int OP_SUBGROUP_AVC_IME_GET_DUAL_REFERENCE_STREAMIN_INTEL = 5767;
	public static final int OP_SUBGROUP_AVC_IME_STRIP_SINGLE_REFERENCE_STREAMOUT_INTEL = 5768;
	public static final int OP_SUBGROUP_AVC_IME_STRIP_DUAL_REFERENCE_STREAMOUT_INTEL = 5769;
	public static final int OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_MOTION_VECTORS_INTEL = 5770;
	public static final int OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_DISTORTIONS_INTEL = 5771;
	public static final int OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_REFERENCE_IDS_INTEL = 5772;
	public static final int OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_MOTION_VECTORS_INTEL = 5773;
	public static final int OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_DISTORTIONS_INTEL = 5774;
	public static final int OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_REFERENCE_IDS_INTEL = 5775;
	public static final int OP_SUBGROUP_AVC_IME_GET_BORDER_REACHED_INTEL = 5776;
	public static final int OP_SUBGROUP_AVC_IME_GET_TRUNCATED_SEARCH_INDICATION_INTEL = 5777;
	public static final int OP_SUBGROUP_AVC_IME_GET_UNIDIRECTIONAL_EARLY_SEARCH_TERMINATION_INTEL = 5778;
	public static final int OP_SUBGROUP_AVC_IME_GET_WEIGHTING_PATTERN_MINIMUM_MOTION_VECTOR_INTEL = 5779;
	public static final int OP_SUBGROUP_AVC_IME_GET_WEIGHTING_PATTERN_MINIMUM_DISTORTION_INTEL = 5780;
	public static final int OP_SUBGROUP_AVC_FME_INITIALIZE_INTEL = 5781;
	public static final int OP_SUBGROUP_AVC_BME_INITIALIZE_INTEL = 5782;
	public static final int OP_SUBGROUP_AVC_REF_CONVERT_TO_MCE_PAYLOAD_INTEL = 5783;
	public static final int OP_SUBGROUP_AVC_REF_SET_BIDIRECTIONAL_MIX_DISABLE_INTEL = 5784;
	public static final int OP_SUBGROUP_AVC_REF_SET_BILINEAR_FILTER_ENABLE_INTEL = 5785;
	public static final int OP_SUBGROUP_AVC_REF_EVALUATE_WITH_SINGLE_REFERENCE_INTEL = 5786;
	public static final int OP_SUBGROUP_AVC_REF_EVALUATE_WITH_DUAL_REFERENCE_INTEL = 5787;
	public static final int OP_SUBGROUP_AVC_REF_EVALUATE_WITH_MULTI_REFERENCE_INTEL = 5788;
	public static final int OP_SUBGROUP_AVC_REF_EVALUATE_WITH_MULTI_REFERENCE_INTERLACED_INTEL = 5789;
	public static final int OP_SUBGROUP_AVC_REF_CONVERT_TO_MCE_RESULT_INTEL = 5790;
	public static final int OP_SUBGROUP_AVC_SIC_INITIALIZE_INTEL = 5791;
	public static final int OP_SUBGROUP_AVC_SIC_CONFIGURE_SKC_INTEL = 5792;
	public static final int OP_SUBGROUP_AVC_SIC_CONFIGURE_IPE_LUMA_INTEL = 5793;
	public static final int OP_SUBGROUP_AVC_SIC_CONFIGURE_IPE_LUMA_CHROMA_INTEL = 5794;
	public static final int OP_SUBGROUP_AVC_SIC_GET_MOTION_VECTOR_MASK_INTEL = 5795;
	public static final int OP_SUBGROUP_AVC_SIC_CONVERT_TO_MCE_PAYLOAD_INTEL = 5796;
	public static final int OP_SUBGROUP_AVC_SIC_SET_INTRA_LUMA_SHAPE_PENALTY_INTEL = 5797;
	public static final int OP_SUBGROUP_AVC_SIC_SET_INTRA_LUMA_MODE_COST_FUNCTION_INTEL = 5798;
	public static final int OP_SUBGROUP_AVC_SIC_SET_INTRA_CHROMA_MODE_COST_FUNCTION_INTEL = 5799;
	public static final int OP_SUBGROUP_AVC_SIC_SET_BILINEAR_FILTER_ENABLE_INTEL = 5800;
	public static final int OP_SUBGROUP_AVC_SIC_SET_SKC_FORWARD_TRANSFORM_ENABLE_INTEL = 5801;
	public static final int OP_SUBGROUP_AVC_SIC_SET_BLOCK_BASED_RAW_SKIP_SAD_INTEL = 5802;
	public static final int OP_SUBGROUP_AVC_SIC_EVALUATE_IPE_INTEL = 5803;
	public static final int OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_SINGLE_REFERENCE_INTEL = 5804;
	public static final int OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_DUAL_REFERENCE_INTEL = 5805;
	public static final int OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_MULTI_REFERENCE_INTEL = 5806;
	public static final int OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_MULTI_REFERENCE_INTERLACED_INTEL = 5807;
	public static final int OP_SUBGROUP_AVC_SIC_CONVERT_TO_MCE_RESULT_INTEL = 5808;
	public static final int OP_SUBGROUP_AVC_SIC_GET_IPE_LUMA_SHAPE_INTEL = 5809;
	public static final int OP_SUBGROUP_AVC_SIC_GET_BEST_IPE_LUMA_DISTORTION_INTEL = 5810;
	public static final int OP_SUBGROUP_AVC_SIC_GET_BEST_IPE_CHROMA_DISTORTION_INTEL = 5811;
	public static final int OP_SUBGROUP_AVC_SIC_GET_PACKED_IPE_LUMA_MODES_INTEL = 5812;
	public static final int OP_SUBGROUP_AVC_SIC_GET_IPE_CHROMA_MODE_INTEL = 5813;
	public static final int OP_SUBGROUP_AVC_SIC_GET_PACKED_SKC_LUMA_COUNT_THRESHOLD_INTEL = 5814;
	public static final int OP_SUBGROUP_AVC_SIC_GET_PACKED_SKC_LUMA_SUM_THRESHOLD_INTEL = 5815;
	public static final int OP_SUBGROUP_AVC_SIC_GET_INTER_RAW_SADS_INTEL = 5816;
	public static final int OP_LOOP_CONTROL_INTEL = 5887;
	public static final int OP_READ_PIPE_BLOCKING_INTEL = 5946;
	public static final int OP_WRITE_PIPE_BLOCKING_INTEL = 5947;
	public static final int OP_FPGA_REG_INTEL = 5949;
	public static final int OP_RAY_QUERY_GET_RAYTMIN_KHR = 6016;
	public static final int OP_RAY_QUERY_GET_RAYFLAGS_KHR = 6017;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_T_KHR = 6018;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_CUSTOM_INDEX_KHR = 6019;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_ID_KHR = 6020;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_SHADER_BINDING_TABLE_RECORD_OFFSET_KHR = 6021;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_GEOMETRY_INDEX_KHR = 6022;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_PRIMITIVE_INDEX_KHR = 6023;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_BARYCENTRICS_KHR = 6024;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_FRONT_FACE_KHR = 6025;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_CANDIDATE_AABB_OPAQUE_KHR = 6026;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_DIRECTION_KHR = 6027;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_ORIGIN_KHR = 6028;
	public static final int OP_RAY_QUERY_GET_WORLD_RAY_DIRECTION_KHR = 6029;
	public static final int OP_RAY_QUERY_GET_WORLD_RAY_ORIGIN_KHR = 6030;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_OBJECT_TO_WORLD_KHR = 6031;
	public static final int OP_RAY_QUERY_GET_INTERSECTION_WORLD_TO_OBJECT_KHR = 6032;
	public static final int OP_ATOMIC_F_ADD_EXT = 6035;
	public static final int OP_MAX = 0x7fffffff;

	public static final int REACH_VIA_CONTROL_FLOW = 0;
	public static final int REACH_DEAD_CONTINUE = 1;
	public static final int REACH_DEAD_MERGE = 2;

	public static final int GLSLANG_ERROR_NONE = 0;
	public static final int GLSLANG_ERROR_INVALID_LENGTH = 1;
	public static final int GLSLANG_ERROR_ARRAY_INDEX_OUT_OF_BOUNDS = 2;
	public static final int GLSLANG_ERROR_NOT_YET_IMPLEMENTED = 3;
	public static final int GLSLANG_ERROR_INVALID_ARGUMENT = 4;

	public static final int GLSLANG_ERROR_MODE_NONE = 0;
	public static final int GLSLANG_ERROR_MODE_CODE = 1;
	public static final int GLSLANG_ERROR_MODE_EXCEPTION = 2;

	static {
		System.loadLibrary("Main");
	}

	public static native int ShInitialize();

	public static native int ShFinalize();

	public static byte[] TInputLanguage(EShSource languageFamily, EShLanguage stage, EShClient dialect,
			int dialectVersion) {
		return TInputLanguage(languageFamily.getConstant(), stage.getConstant(), dialect.getConstant(), dialectVersion);
	}

	public static byte[] TInputLanguage(int languageFamily, EShLanguage stage, EShClient dialect, int dialectVersion) {
		return TInputLanguage(languageFamily, stage.getConstant(), dialect.getConstant(), dialectVersion);
	}

	public static byte[] TInputLanguage(EShSource languageFamily, int stage, EShClient dialect, int dialectVersion) {
		return TInputLanguage(languageFamily.getConstant(), stage, dialect.getConstant(), dialectVersion);
	}

	public static byte[] TInputLanguage(EShSource languageFamily, EShLanguage stage, int dialect, int dialectVersion) {
		return TInputLanguage(languageFamily.getConstant(), stage.getConstant(), dialect, dialectVersion);
	}

	public static byte[] TInputLanguage(int languageFamily, int stage, EShClient dialect, int dialectVersion) {
		return TInputLanguage(languageFamily, stage, dialect.getConstant(), dialectVersion);
	}

	public static byte[] TInputLanguage(int languageFamily, EShLanguage stage, int dialect, int dialectVersion) {
		return TInputLanguage(languageFamily, stage.getConstant(), dialect, dialectVersion);
	}

	public static byte[] TInputLanguage(EShSource languageFamily, int stage, int dialect, int dialectVersion) {
		return TInputLanguage(languageFamily.getConstant(), stage, dialect, dialectVersion);
	}

	public static native byte[] TInputLanguage(int languageFamily, int stage, int dialect, int dialectVersion);

	public static native byte[] TInputLanguage();

	public static native void TInputLanguage_setLanguageFamily(byte[] ptr, int v);

	public static native void TInputLanguage_setStage(byte[] ptr, int v);

	public static native void TInputLanguage_setDialect(byte[] ptr, int v);

	public static native void TInputLanguage_setDialectVersion(byte[] ptr, int v);

	public static native int TInputLanguage_getLanguageFamily(byte[] ptr);

	public static native int TInputLanguage_getStage(byte[] ptr);

	public static native int TInputLanguage_getDialect(byte[] ptr);

	public static native int TInputLanguage_getDialectVersion(byte[] ptr);

	public static byte[] TClient(EShClient client, EShTargetClientVersion version) {
		return TClient(client.getConstant(), version.getConstant());
	}

	public static byte[] TClient(int client, EShTargetClientVersion version) {
		return TClient(client, version.getConstant());
	}

	public static byte[] TClient(EShClient client, int version) {
		return TClient(client.getConstant(), version);
	}

	public static native byte[] TClient(int client, int version);

	public static native byte[] TClient();

	public static native void TClient_setClient(byte[] ptr, int v);

	public static native void TClient_setVersion(byte[] ptr, int v);

	public static native int TClient_getClient(byte[] ptr);

	public static native int TClient_getVersion(byte[] ptr);

	public static byte[] TTarget(EShTargetLanguage language, EShTargetLanguageVersion version,
			boolean hlslFunctionality1) {
		return TTarget(language.getConstant(), version.getConstant(), hlslFunctionality1);
	}

	public static byte[] TTarget(int language, EShTargetLanguageVersion version, boolean hlslFunctionality1) {
		return TTarget(language, version.getConstant(), hlslFunctionality1);
	}

	public static byte[] TTarget(EShTargetLanguage language, int version, boolean hlslFunctionality1) {
		return TTarget(language.getConstant(), version, hlslFunctionality1);
	}

	public static native byte[] TTarget(int language, int version, boolean hlslFunctionality1);

	public static native byte[] TTarget();

	public static native void TTarget_setLanguage(byte[] ptr, int v);

	public static native void TTarget_setVersion(byte[] ptr, int v);

	public static native void TTarget_setHlslFunctionality1(byte[] ptr, boolean v);

	public static native int TTarget_getLanguage(byte[] ptr);

	public static native int TTarget_getVersion(byte[] ptr);

	public static native boolean TTarget_getHlslFunctionality1(byte[] ptr);

	public static native byte[] TEnvironment(byte[] input, byte[] client, byte[] target);

	public static native byte[] TEnvironment();

	public static native void TEnvironment_setInput(byte[] ptr, byte[] v);

	public static native void TEnvironment_setClient(byte[] ptr, byte[] v);

	public static native void TEnvironment_setTarget(byte[] ptr, byte[] v);

	public static native byte[] TEnvironment_getInput(byte[] ptr);

	public static native byte[] TEnvironment_getClient(byte[] ptr);

	public static native byte[] TEnvironment_getTarget(byte[] ptr);

	public static native byte[] ShBinding(String name, int binding);

	public static native byte[] ShBinding();

	public static native void ShBinding_setName(byte[] ptr, String v);

	public static native void ShBinding_setBinding(byte[] ptr, int v);

	public static native String ShBinding_getName(byte[] ptr);

	public static native int ShBinding_getBinding(byte[] ptr);

	public static native byte[] ShBindingTable(int numBindings, byte[] bindings);

	public static native byte[] ShBindingTable();

	public static native void ShBindingTable_setNumBindings(byte[] ptr, int v);

	public static native void ShBindingTable_setBindings(byte[] ptr, byte[] v);

	public static native int ShBindingTable_getNumBindings(byte[] ptr);

	public static native byte[] ShBindingTable_getBindings(byte[] ptr);

	public static byte[] ShConstructCompiler(EShLanguage language, int debugOptions) {
		return ShConstructCompiler(language.getConstant(), debugOptions);
	}

	public static native byte[] ShConstructCompiler(int language, int debugOptions);

	public static byte[] ShConstructLinker(EShExecutable executable, int debugOptions) {
		return ShConstructLinker(executable.getConstant(), debugOptions);
	}

	public static native byte[] ShConstructLinker(int executable, int debugOptions);

	public static native byte[] ShConstructUniformMap();

	public static native void ShDestruct(byte[] handle);

	public static native byte[] TBuiltInResource(int[] values, byte[] limits);

	public static native byte[] TBuiltInResource();

	public static native byte[] TLimits(boolean[] values);

	public static native byte[] TLimits();

	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel,
			byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible) {
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions,
				defaultVersion, forwardCompatible);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel,
			byte[] resources, int debugOptions, int defaultVersion) {
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions,
				defaultVersion);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel,
			byte[] resources, int debugOptions) {
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel,
			byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible,
			EnumSet<EShMessages> messages) {
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions,
				defaultVersion, forwardCompatible, EShMessages.setToInt(messages));
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel,
			byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible, int messages) {
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions,
				defaultVersion, forwardCompatible, messages);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, int optimizationLevel, byte[] resources,
			int debugOptions, int defaultVersion, boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, defaultVersion,
				forwardCompatible, EShMessages.setToInt(messages));
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, int optimizationLevel, byte[] resources,
			int debugOptions) {
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, 110, false,
				E_SH_MSG_DEFAULT);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, int optimizationLevel, byte[] resources,
			int debugOptions, int defaultVersion) {
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, defaultVersion, false,
				E_SH_MSG_DEFAULT);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, int optimizationLevel, byte[] resources,
			int debugOptions, int defaultVersion, boolean forwardCompatible) {
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, defaultVersion,
				forwardCompatible, E_SH_MSG_DEFAULT);
	}

	public static int ShCompile(byte[] handle, String[] shaderStrings, int optimizationLevel, byte[] resources,
			int debugOptions, int defaultVersion, boolean forwardCompatible, int messages) {
		return ShCompile(handle, shaderStrings, shaderStrings.length, optimizationLevel, resources, debugOptions,
				defaultVersion, forwardCompatible, messages);
	}

	private static native int ShCompile(byte[] handle, String[] shaderStrings, int numStrings, int optimizationLevel,
			byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible, int messages);

	public static native int ShLinkExt(byte[] handle, byte[] h, int numHandles);

	public static native void ShSetEncryptionMethod(byte[] handle);

	public static native String ShGetInfoLog(byte[] handle);

	public static native byte[] ShGetExecutable(byte[] handle);

	public static native int ShSetVirtualAttributeBindings(byte[] handle, byte[] bindingTable);

	public static native int ShSetFixedAttributeBindings(byte[] handle, byte[] bindingTable);

	public static int ShExcludeAttributes(byte[] handle, int[] attributes) {
		return ShExcludeAttributes(handle, attributes, attributes.length);
	}

	private static native int ShExcludeAttributes(byte[] handle, int[] attributes, int count);

	public static native int ShGetUniformLocation(byte[] handle, String name);

	public static native byte[] Version();

	public static native byte[] Version(int major, int minor, int patch, String flavor);

	public static native void Version_setMajor(byte[] ptr, int v);

	public static native void Version_setMinor(byte[] ptr, int v);

	public static native void Version_setPatch(byte[] ptr, int v);

	public static native int Version_getMajor(byte[] ptr);

	public static native int Version_getMinor(byte[] ptr);

	public static native int Version_getPatch(byte[] ptr);

	public static native String Version_getFlavor(byte[] ptr);

	public static byte[] TShader(EShLanguage language) {
		return TShader(language.getConstant());
	}

	public static native byte[] TShader(int language);

	public static void TShader_setStrings(byte[] ptr, String[] s) {
		TShader_setStrings(ptr, s, s.length);
	}

	private static native void TShader_setStrings(byte[] ptr, String[] s, int n);

	public static void TShader_setStringsWithLengths(byte[] ptr, String[] s, int[] l) {
		TShader_setStringsWithLengths(ptr, s, l, s.length);
	}

	private static native void TShader_setStringsWithLengths(byte[] ptr, String[] s, int[] l, int n);

	public static void TShader_setStringsWithLengthsAndNames(byte[] ptr, String[] s, int[] l, String[] names) {
		TShader_setStringsWithLengthsAndNames(ptr, s, l, names, s.length);
	}

	private static native void TShader_setStringsWithLengthsAndNames(byte[] ptr, String[] s, int[] l, String[] names,
			int n);

	public static native void TShader_setPreamble(byte[] ptr, String s);

	public static native void TShader_setEntryPoint(byte[] ptr, String entryPoint);

	public static native void TShader_setSourceEntryPoint(byte[] ptr, String sourceEntryPointName);

	public static native void TShader_addProcesses(byte[] ptr, String[] processes);

	public static void TShader_setShiftBinding(byte[] ptr, TResourceType res, long base) {
		TShader_setShiftBinding(ptr, res.getConstant(), base);
	}

	public static native void TShader_setShiftBinding(byte[] ptr, int res, long base);

	public static native void TShader_setShiftSamplerBinding(byte[] ptr, long base);

	public static native void TShader_setShiftTextureBinding(byte[] ptr, long base);

	public static native void TShader_setShiftImageBinding(byte[] ptr, long base);

	public static native void TShader_setShiftUboBinding(byte[] ptr, long base);

	public static native void TShader_setShiftUavBinding(byte[] ptr, long base);

	public static native void TShader_setShiftCbufferBinding(byte[] ptr, long base);

	public static native void TShader_setShiftSsboBinding(byte[] ptr, long base);

	public static void TShader_setShiftBindingForSet(byte[] ptr, TResourceType res, long base, long set) {
		TShader_setShiftBindingForSet(ptr, res.getConstant(), base, set);
	}

	public static native void TShader_setShiftBindingForSet(byte[] ptr, int res, long base, long set);

	public static native void TShader_setResourceSetBinding(byte[] ptr, String[] base);

	public static native void TShader_setAutoMapBindings(byte[] ptr, boolean map);

	public static native void TShader_setAutoMapLocations(byte[] ptr, boolean map);

	public static native void TShader_addUniformLocationOverride(byte[] ptr, String name, int loc);

	public static native void TShader_setUniformLocationBase(byte[] ptr, int base);

	public static native void TShader_setInvertY(byte[] ptr, boolean invert);

	public static native void TShader_setHlslIoMapping(byte[] ptr, boolean hlslIoMap);

	public static native void TShader_setFlattenUniformArrays(byte[] ptr, boolean flatten);

	public static native void TShader_setNoStorageFormat(byte[] ptr, boolean useUnknownFormat);

	public static native void TShader_setNanMinMaxClamp(byte[] ptr, boolean nanMinMaxClamp);

	public static void TShader_setTextureSamplerTransformMode(byte[] ptr, EShTextureSamplerTransformMode mode) {
		TShader_setTextureSamplerTransformMode(ptr, mode.getConstant());
	}

	public static native void TShader_setTextureSamplerTransformMode(byte[] ptr, int mode);

	public static void TShader_setEnvInput(byte[] ptr, EShSource lang, EShLanguage envStage, EShClient client,
			int version) {
		TShader_setEnvInput(ptr, lang.getConstant(), envStage.getConstant(), client.getConstant(), version);
	}

	public static void TShader_setEnvInput(byte[] ptr, int lang, EShLanguage envStage, EShClient client, int version) {
		TShader_setEnvInput(ptr, lang, envStage.getConstant(), client.getConstant(), version);
	}

	public static void TShader_setEnvInput(byte[] ptr, EShSource lang, int envStage, EShClient client, int version) {
		TShader_setEnvInput(ptr, lang.getConstant(), envStage, client.getConstant(), version);
	}

	public static void TShader_setEnvInput(byte[] ptr, EShSource lang, EShLanguage envStage, int client, int version) {
		TShader_setEnvInput(ptr, lang.getConstant(), envStage.getConstant(), client, version);
	}

	public static void TShader_setEnvInput(byte[] ptr, int lang, int envStage, EShClient client, int version) {
		TShader_setEnvInput(ptr, lang, envStage, client.getConstant(), version);
	}

	public static void TShader_setEnvInput(byte[] ptr, int lang, EShLanguage envStage, int client, int version) {
		TShader_setEnvInput(ptr, lang, envStage.getConstant(), client, version);
	}

	public static void TShader_setEnvInput(byte[] ptr, EShSource lang, int envStage, int client, int version) {
		TShader_setEnvInput(ptr, lang.getConstant(), envStage, client, version);
	}

	public static native void TShader_setEnvInput(byte[] ptr, int lang, int envStage, int client, int version);

	public static void TShader_setEnvClient(byte[] ptr, EShClient client, EShTargetClientVersion version) {
		TShader_setEnvClient(ptr, client.getConstant(), version.getConstant());
	}

	public static void TShader_setEnvClient(byte[] ptr, int client, EShTargetClientVersion version) {
		TShader_setEnvClient(ptr, client, version.getConstant());
	}

	public static void TShader_setEnvClient(byte[] ptr, EShClient client, int version) {
		TShader_setEnvClient(ptr, client.getConstant(), version);
	}

	public static native void TShader_setEnvClient(byte[] ptr, int client, int version);

	public static void TShader_setEnvTarget(byte[] ptr, EShTargetLanguage lang, EShTargetLanguageVersion version) {
		TShader_setEnvTarget(ptr, lang.getConstant(), version.getConstant());
	}

	public static void TShader_setEnvTarget(byte[] ptr, EShTargetLanguage lang, int version) {
		TShader_setEnvTarget(ptr, lang.getConstant(), version);
	}

	public static void TShader_setEnvTarget(byte[] ptr, int lang, EShTargetLanguageVersion version) {
		TShader_setEnvTarget(ptr, lang, version.getConstant());
	}

	public static native void TShader_setEnvTarget(byte[] ptr, int lang, int version);

	public static native String[] TShader_getStrings(byte[] ptr);

	public static native void TShader_setEnvTargetHlslFunctionality1(byte[] ptr);

	public static native boolean TShader_getEnvTargetHlslFunctionality1(byte[] ptr);

	public static native byte[] TShader_Includer_IncludeResult(String headerName, String headerData, long headerLength,
			byte[] userData);// NOTE: Interface not exact. size_t might be larger than long.

	public static native void TShader_Includer_IncludeResult_setUserData(byte[] ptr, byte[] v);

	public static native String TShader_Includer_IncludeResult_getHeaderName(byte[] ptr);

	public static native String TShader_Includer_IncludeResult_getHeaderData(byte[] ptr);

	public static native long TShader_Includer_IncludeResult_getHeaderLength(byte[] ptr);// NOTE: Interface not exact.
																							// size_t might be larger
																							// than long.

	public static native byte[] TShader_Includer_IncludeResult_getUserData(byte[] ptr);

	public static native byte[] TShader_ForbidIncluder();

	public static native byte[] TShader_ForbidIncluder_includeSystem(byte[] ptr, String headerName, String includerName,
			long inclusionDepth);// NOTE: Interface not exact. size_t might be larger than long.

	public static native byte[] TShader_ForbidIncluder_includeLocal(byte[] ptr, String headerName, String includerName,
			long inclusionDepth);// NOTE: Interface not exact. size_t might be larger than long.

	public static native void TShader_ForbidIncluder_releaseInclude(byte[] ptr, byte[] result);

	public static boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> messages,
			byte[] includer) {
		return TShader_parse(ptr, res, defaultVersion, defaultProfile.getConstant(), forceDefaultVersionAndProfile,
				forwardCompatible, EShMessages.setToInt(messages), includer);
	}

	public static boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, int defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> messages,
			byte[] includer) {
		return TShader_parse(ptr, res, defaultVersion, defaultProfile, forceDefaultVersionAndProfile, forwardCompatible,
				EShMessages.setToInt(messages), includer);
	}

	public static boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, int messages, byte[] includer) {
		return TShader_parse(ptr, res, defaultVersion, defaultProfile.getConstant(), forceDefaultVersionAndProfile,
				forwardCompatible, messages, includer);
	}

	public static native boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, int defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, int messages, byte[] includer);

	public static boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return TShader_parse(ptr, res, defaultVersion, defaultProfile.getConstant(), forceDefaultVersionAndProfile,
				forwardCompatible, EShMessages.setToInt(messages));
	}

	public static boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, int defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return TShader_parse(ptr, res, defaultVersion, defaultProfile, forceDefaultVersionAndProfile, forwardCompatible,
				EShMessages.setToInt(messages));
	}

	public static boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, int messages) {
		return TShader_parse(ptr, res, defaultVersion, defaultProfile.getConstant(), forceDefaultVersionAndProfile,
				forwardCompatible, messages);
	}

	public static native boolean TShader_parse(byte[] ptr, byte[] res, int defaultVersion, int defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, int messages);

	public static boolean TShader_parse(byte[] ptr, byte[] builtInResources, int defaultVersion,
			boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return TShader_parse(ptr, builtInResources, defaultVersion, forwardCompatible, EShMessages.setToInt(messages));
	}

	public static native boolean TShader_parse(byte[] ptr, byte[] builtInResources, int defaultVersion,
			boolean forwardCompatible, int messages);

	public static boolean TShader_parse(byte[] ptr, byte[] builtInResources, int defaultVersion,
			boolean forwardCompatible, EnumSet<EShMessages> messages, byte[] includer) {
		return TShader_parse(ptr, builtInResources, defaultVersion, forwardCompatible, EShMessages.setToInt(messages),
				includer);
	}

	public static native boolean TShader_parse(byte[] ptr, byte[] builtInResources, int defaultVersion,
			boolean forwardCompatible, int messages, byte[] includer);

	public static boolean TShader_preprocess(byte[] ptr, byte[] builtInResources, int defaultVersion,
			EProfile defaultProfile, boolean forceDefaultVersionAndProfile, boolean forwardCompatible,
			EnumSet<EShMessages> message, String[] outputString, byte[] includer) {
		return TShader_preprocess(ptr, builtInResources, defaultVersion, defaultProfile.getConstant(),
				forceDefaultVersionAndProfile, forwardCompatible, EShMessages.setToInt(message), outputString,
				includer);
	}

	public static boolean TShader_preprocess(byte[] ptr, byte[] builtInResources, int defaultVersion,
			int defaultProfile, boolean forceDefaultVersionAndProfile, boolean forwardCompatible,
			EnumSet<EShMessages> message, String[] outputString, byte[] includer) {
		return TShader_preprocess(ptr, builtInResources, defaultVersion, defaultProfile, forceDefaultVersionAndProfile,
				forwardCompatible, EShMessages.setToInt(message), outputString, includer);
	}

	public static boolean TShader_preprocess(byte[] ptr, byte[] builtInResources, int defaultVersion,
			EProfile defaultProfile, boolean forceDefaultVersionAndProfile, boolean forwardCompatible, int message,
			String[] outputString, byte[] includer) {
		return TShader_preprocess(ptr, builtInResources, defaultVersion, defaultProfile.getConstant(),
				forceDefaultVersionAndProfile, forwardCompatible, message, outputString, includer);
	}

	public static native boolean TShader_preprocess(byte[] ptr, byte[] builtInResources, int defaultVersion,
			int defaultProfile, boolean forceDefaultVersionAndProfile, boolean forwardCompatible, int message,
			String[] outputString, byte[] includer);

	public static native String TShader_getInfoLog(byte[] ptr);

	public static native String TShader_getInfoDebugLog(byte[] ptr);

	public static native int TShader_getStage(byte[] ptr);

	public static native byte[] TShader_getIntermediate(byte[] ptr);

	public static native byte[] TObjectReflection(String pName, byte[] pType, int pOffset, int pGLDefineType, int pSize,
			int pIndex);

	public static native byte[] TObjectReflection_getType(byte[] ptr);

	public static native int TObjectReflection_getBinding(byte[] ptr);

	public static native void TObjectReflection_dump(byte[] ptr);

	public static native void TObjectReflection_setName(byte[] ptr, String v);

	public static native void TObjectReflection_setOffset(byte[] ptr, int v);

	public static native void TObjectReflection_setGlDefineType(byte[] ptr, int v);

	public static native void TObjectReflection_setSize(byte[] ptr, int v);

	public static native void TObjectReflection_setIndex(byte[] ptr, int v);

	public static native void TObjectReflection_setCounterIndex(byte[] ptr, int v);

	public static native void TObjectReflection_setNumMembers(byte[] ptr, int v);

	public static native void TObjectReflection_setArrayStride(byte[] ptr, int v);

	public static native void TObjectReflection_setTopLevelArraySize(byte[] ptr, int v);

	public static native void TObjectReflection_setTopLevelArrayStride(byte[] ptr, int v);

	public static native void TObjectReflection_setStages(byte[] ptr, int v);

	public static native String TObjectReflection_getName(byte[] ptr);

	public static native int TObjectReflection_getOffset(byte[] ptr);

	public static native int TObjectReflection_getGlDefineType(byte[] ptr);

	public static native int TObjectReflection_getSize(byte[] ptr);

	public static native int TObjectReflection_getIndex(byte[] ptr);

	public static native int TObjectReflection_getCounterIndex(byte[] ptr);

	public static native int TObjectReflection_getNumMembers(byte[] ptr);

	public static native int TObjectReflection_getArrayStride(byte[] ptr);

	public static native int TObjectReflection_getTopLevelArraySize(byte[] ptr);

	public static native int TObjectReflection_getTopLevelArrayStride(byte[] ptr);

	public static native int TObjectReflection_getStages(byte[] ptr);

	public static native byte[] TObjectReflection_badReflection();

	public static native byte[] TIoMapResolver();

	public static byte[] TVarEntryInfo(int id, byte[] symbol, boolean live, int newBinding, int newSet, int newLocation,
			int newComponent, int newIndex, EShLanguage stage) {
		return TVarEntryInfo(id, symbol, live, newBinding, newSet, newLocation, newComponent, newIndex,
				stage.getConstant());
	}

	public static native byte[] TVarEntryInfo(int id, byte[] symbol, boolean live, int newBinding, int newSet,
			int newLocation, int newComponent, int newIndex, int stage);

	public static native byte[] TVarEntryInfo();

	public static native void TVarEntryInfo_setId(byte[] ptr, int v);

	public static native void TVarEntryInfo_setSymbol(byte[] ptr, byte[] v);

	public static native void TVarEntryInfo_setLive(byte[] ptr, int v);

	public static native void TVarEntryInfo_setNewBinding(byte[] ptr, int v);

	public static native void TVarEntryInfo_setNewSet(byte[] ptr, int v);

	public static native void TVarEntryInfo_setNewLocation(byte[] ptr, int v);

	public static native void TVarEntryInfo_setNewComponent(byte[] ptr, int v);

	public static native void TVarEntryInfo_setNewIndex(byte[] ptr, int v);

	public static native void TVarEntryInfo_setStage(byte[] ptr, int v);

	public static native int TVarEntryInfo_getId(byte[] ptr);

	public static native byte[] TVarEntryInfo_getSymbol(byte[] ptr);

	public static native boolean TVarEntryInfo_getLive(byte[] ptr);

	public static native int TVarEntryInfo_getNewBinding(byte[] ptr);

	public static native int TVarEntryInfo_getNewSet(byte[] ptr);

	public static native int TVarEntryInfo_getNewLocation(byte[] ptr);

	public static native int TVarEntryInfo_getNewComponent(byte[] ptr);

	public static native int TVarEntryInfo_getNewIndex(byte[] ptr);

	public static native int TVarEntryInfo_getStage(byte[] ptr);

	public static native byte[] TVarEntryInfo_TOrderById();

	public static native boolean TVarEntryInfo_TOrderById_operatorCall(byte[] ptr, byte[] l, byte[] r);

	public static native byte[] TVarEntryInfo_TOrderByPriority();

	public static native boolean TVarEntryInfo_TOrderByPriority_operatorCall(byte[] ptr, byte[] l, byte[] r);

	public static native byte[] TInfoSink();

	public static native void TInfoSink_setInfo(byte[] ptr, byte[] info);

	public static native void TInfoSink_setDebug(byte[] ptr, byte[] debug);

	public static native byte[] TInfoSink_getInfo(byte[] ptr);

	public static native byte[] TInfoSink_getDebug(byte[] ptr);

	public static native byte[] TIntermSymbol(int i, String n, byte[] t);

	public static native int TIntermSymbol_getId(byte[] ptr);

	public static native void TIntermSymbol_changeId(byte[] ptr, int i);

	public static native String TIntermSymbol_getName(byte[] ptr);

	public static native void TIntermSymbol_traverse(byte[] ptr, byte[] traverser);

	public static native byte[] TIntermSymbol_getAsSymbolNode(byte[] ptr);

	public static native void TIntermSymbol_setConstArray(byte[] ptr, byte[] c);

	public static native byte[] TIntermSymbol_getConstArray(byte[] ptr);

	public static native void TIntermSymbol_setConstSubtree(byte[] ptr, byte[] subtree);

	public static native byte[] TIntermSymbol_getConstSubtree(byte[] ptr);

	public static native void TIntermSymbol_setFlattenSubset(byte[] ptr, int subset);

	public static native int TIntermSymbol_getFlattenSubset(byte[] ptr);

	public static native void TIntermSymbol_switchId(byte[] ptr, int newId);

	public static byte[] TIntermTraverser() {
		return TIntermTraverser(true, false, false, false);
	}

	public static byte[] TIntermTraverser(boolean preVisit) {
		return TIntermTraverser(preVisit, false, false, false);
	}

	public static byte[] TIntermTraverser(boolean preVisit, boolean inVisit) {
		return TIntermTraverser(preVisit, inVisit, false, false);
	}

	public static byte[] TIntermTraverser(boolean preVisit, boolean inVisit, boolean postVisit) {
		return TIntermTraverser(preVisit, inVisit, postVisit, false);
	}

	public static native byte[] TIntermTraverser(boolean preVisit, boolean inVisit, boolean postVisit,
			boolean rightToLeft);

	public static native void TIntermTraverser_visitSymbol(byte[] ptr, byte[] symbol);

	public static native void TIntermTraverser_visitConstantUnion(byte[] ptr, byte[] node);

	public static boolean TIntermTraverser_visitBinary(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitBinary(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitBinary(byte[] ptr, int visit, byte[] node);

	public static boolean TIntermTraverser_visitUnary(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitUnary(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitUnary(byte[] ptr, int visit, byte[] node);

	public static boolean TIntermTraverser_visitSelection(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitSelection(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitSelection(byte[] ptr, int visit, byte[] node);

	public static boolean TIntermTraverser_visitAggregate(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitAggregate(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitAggregate(byte[] ptr, int visit, byte[] node);

	public static boolean TIntermTraverser_visitLoop(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitLoop(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitLoop(byte[] ptr, int visit, byte[] node);

	public static boolean TIntermTraverser_visitBranch(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitBranch(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitBranch(byte[] ptr, int visit, byte[] node);

	public static boolean TIntermTraverser_visitSwitch(byte[] ptr, TVisit visit, byte[] node) {
		return TIntermTraverser_visitSwitch(ptr, visit.getConstant(), node);
	}

	public static native boolean TIntermTraverser_visitSwitch(byte[] ptr, int visit, byte[] node);

	public static native int TIntermTraverser_getMaxDepth(byte[] ptr);

	public static native void TIntermTraverser_incrementDepth(byte[] ptr, byte[] current);

	public static native void TIntermTraverser_decrementDepth(byte[] ptr);

	public static native byte[] TIntermTraverser_getParentNode(byte[] ptr);

	public static native boolean TIntermTraverser_getPreVisit(byte[] ptr);

	public static native boolean TIntermTraverser_getInVisit(byte[] ptr);

	public static native boolean TIntermTraverser_getPostVisit(byte[] ptr);

	public static native boolean TIntermTraverser_getRightToLeft(byte[] ptr);

	public static native byte[] TConstUnionArray();

	public static native byte[] TConstUnionArray(int size);

	public static native byte[] TConstUnionArray(byte[] a);

	public static native byte[] TConstUnionArray(byte[] a, int start, int size);

	public static native byte[] TConstUnionArray(int size, byte[] val);

	public static native int TConstUnionArray_size(byte[] ptr);

	public static native double TConstUnionArray_dot(byte[] ptr, byte[] rhs);

	public static native boolean TConstUnionArray_empty(byte[] ptr);

	public static native byte[] TConstUnionArray_operatorAt(byte[] ptr, long index);// NOTE: Interface not exact. size_t
																					// might be larger than long.

	public static native boolean TConstUnionArray_operatorEqual(byte[] ptr, byte[] rhs);

	public static native boolean TConstUnionArray_operatorNotEqual(byte[] ptr, byte[] rhs);

	public static native byte[] TConstUnion();

	public static native void TConstUnion_setI8Const(byte[] ptr, byte i);

	public static native void TConstUnion_setU8Const(byte[] ptr, short u);

	public static native void TConstUnion_setI16Const(byte[] ptr, short i);

	public static native void TConstUnion_setU16Const(byte[] ptr, int u);

	public static native void TConstUnion_setIConst(byte[] ptr, int i);

	public static native void TConstUnion_setUConst(byte[] ptr, long u);

	public static native void TConstUnion_setI64Const(byte[] ptr, BigInteger i64);

	public static native void TConstUnion_setU64Const(byte[] ptr, BigInteger u64);

	public static native void TConstUnion_setDConst(byte[] ptr, double d);

	public static native void TConstUnion_setBConst(byte[] ptr, boolean b);

	public static native void TConstUnion_setSConst(byte[] ptr, String s);

	public static native byte TConstUnion_getI8Const(byte[] ptr);

	public static native short TConstUnion_getU8Const(byte[] ptr);

	public static native short TConstUnion_getI16Const(byte[] ptr);

	public static native int TConstUnion_getU16Const(byte[] ptr);

	public static native int TConstUnion_getIConst(byte[] ptr);

	public static native long TConstUnion_getUConst(byte[] ptr);

	public static native BigInteger TConstUnion_getI64Const(byte[] ptr);

	public static native BigInteger TConstUnion_getU64Const(byte[] ptr);

	public static native double TConstUnion_getDConst(byte[] ptr);

	public static native boolean TConstUnion_getBConst(byte[] ptr);

	public static native String TConstUnion_getSConst(byte[] ptr);

	public static native int TConstUnion_getType(byte[] ptr);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, byte i);

	public static native boolean TConstUnion_operatorEqualUnsigned(byte[] ptr, short u);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, short i);

	public static native boolean TConstUnion_operatorEqualUnsigned(byte[] ptr, int u);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, int i);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, long u);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, BigInteger i64);

	public static native boolean TConstUnion_operatorEqualUnsigned(byte[] ptr, BigInteger u64);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, double d);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, boolean b);

	public static native boolean TConstUnion_operatorEqual(byte[] ptr, byte[] constant);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, byte i);

	public static native boolean TConstUnion_operatorNotEqualUnsigned(byte[] ptr, short u);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, short i);

	public static native boolean TConstUnion_operatorNotEqualUnsigned(byte[] ptr, int u);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, int i);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, long u);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, BigInteger i);

	public static native boolean TConstUnion_operatorNotEqualUnsigned(byte[] ptr, BigInteger u);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, float f);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, boolean b);

	public static native boolean TConstUnion_operatorNotEqual(byte[] ptr, byte[] constant);

	public static native boolean TConstUnion_operatorGreaterThan(byte[] ptr, byte[] constant);

	public static native boolean TConstUnion_operatorLowerThan(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorPlus(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorMinus(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorMul(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorMod(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorShiftRight(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorShiftLeft(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorBitwiseAnd(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorBitwiseOr(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorBitwiseXor(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorBitwiseInvert(byte[] ptr);

	public static native byte[] TConstUnion_operatorAnd(byte[] ptr, byte[] constant);

	public static native byte[] TConstUnion_operatorOr(byte[] ptr, byte[] constant);

	public static native byte[] TIntermTyped_getAsTyped(byte[] ptr);

	public static native void TIntermTyped_setType(byte[] ptr, byte[] t);

	public static native byte[] TIntermTyped_getType(byte[] ptr);

	public static native byte[] TIntermTyped_getWritableType(byte[] ptr);

	public static native int TIntermTyped_getBasicType(byte[] ptr);

	public static native byte[] TIntermTyped_getQualifier(byte[] ptr);

	public static void TIntermTyped_propagatePrecision(byte[] ptr, TPrecisionQualifier qualifier) {
		TIntermTyped_propagatePrecision(ptr, qualifier.getConstant());
	}

	public static native void TIntermTyped_propagatePrecision(byte[] ptr, int qualifier);

	public static native int TIntermTyped_getVectorSize(byte[] ptr);

	public static native int TIntermTyped_getMatrixCols(byte[] ptr);

	public static native int TIntermTyped_getMatrixRows(byte[] ptr);

	public static native boolean TIntermTyped_isMatrix(byte[] ptr);

	public static native boolean TIntermTyped_isArray(byte[] ptr);

	public static native boolean TIntermTyped_isVector(byte[] ptr);

	public static native boolean TIntermTyped_isScalar(byte[] ptr);

	public static native boolean TIntermTyped_isStruct(byte[] ptr);

	public static native boolean TIntermTyped_isFloatingDomain(byte[] ptr);

	public static native boolean TIntermTyped_isIntegerDomain(byte[] ptr);

	public static native boolean TIntermTyped_isAtomic(byte[] ptr);

	public static native boolean TIntermTyped_isReference(byte[] ptr);

	public static native String TIntermTyped_getCompleteString(byte[] ptr);

	public static native byte[] TInfoSinkBase();

	public static native void TInfoSinkBase_erase(byte[] ptr);

	public static native String TInfoSinkBase_c_str(byte[] ptr);

	public static void TInfoSinkBase_prefix(byte[] ptr, TPrefixType message) {
		TInfoSinkBase_prefix(ptr, message.getConstant());
	}

	public static native void TInfoSinkBase_prefix(byte[] ptr, int message);

	public static native void TInfoSinkBase_location(byte[] ptr, byte[] loc);

	public static void TInfoSinkBase_message(byte[] ptr, TPrefixType message, String s) {
		TInfoSinkBase_message(ptr, message.getConstant(), s);
	}

	public static native void TInfoSinkBase_message(byte[] ptr, int message, String s);

	public static void TInfoSinkBase_message(byte[] ptr, TPrefixType message, String s, byte[] loc) {
		TInfoSinkBase_message(ptr, message.getConstant(), s, loc);
	}

	public static native void TInfoSinkBase_message(byte[] ptr, int message, String s, byte[] loc);

	public static void TInfoSinkBase_setOutputStream(byte[] ptr) {
		TInfoSinkBase_setOutputStream(ptr, 4);
	}

	public static native void TInfoSinkBase_setOutputStream(byte[] ptr, int output);

	public static native byte[] TInfoSinkBase_operatorShiftLeft(byte[] ptr, char c);

	public static native byte[] TInfoSinkBase_operatorShiftLeft(byte[] ptr, String s);

	public static native byte[] TInfoSinkBase_operatorShiftLeft(byte[] ptr, int n);

	public static native byte[] TInfoSinkBase_operatorShiftLeft(byte[] ptr, long n);

	public static native byte[] TInfoSinkBase_operatorShiftLeft(byte[] ptr, float n);

	public static native byte[] TInfoSinkBase_operatorPlus(byte[] ptr, String t);

	public static native byte[] TSourceLoc(String name, int string, int line, int column);

	public static native byte[] TSourceLoc();

	public static native void TSourceLoc_init(byte[] ptr);

	public static native void TSourceLoc_init(byte[] ptr, int stringNum);

	public static String TSourceLoc_getStringNameOrNum(byte[] ptr) {
		return TSourceLoc_getStringNameOrNum(ptr, true);
	}

	public static native String TSourceLoc_getStringNameOrNum(byte[] ptr, boolean quoteStringName);

	public static native String TSourceLoc_getFilename(byte[] ptr);

	public static native String TSourceLoc_getFilenameStr(byte[] ptr);

	public static native void TSourceLoc_setName(byte[] ptr, String name);

	public static native void TSourceLoc_setString(byte[] ptr, int string);

	public static native void TSourceLoc_setLine(byte[] ptr, int line);

	public static native void TSourceLoc_setColumn(byte[] ptr, int column);

	public static native String TSourceLoc_getName(byte[] ptr);

	public static native int TSourceLoc_getString(byte[] ptr);

	public static native int TSourceLoc_getLine(byte[] ptr);

	public static native int TSourceLoc_getColumn(byte[] ptr);

	public static native byte[] TProgram();

	public static native void TProgram_addShader(byte[] ptr, byte[] shader);

	public static byte[] TProgram_getShaders(byte[] ptr, EShLanguage stage) {
		return TProgram_getShaders(ptr, stage.getConstant());
	}

	public static native byte[] TProgram_getShaders(byte[] ptr, int stage);

	public static boolean TProgram_link(byte[] ptr, EnumSet<EShMessages> messages) {
		return TProgram_link(ptr, EShMessages.setToInt(messages));
	}

	public static native boolean TProgram_link(byte[] ptr, int messages);

	public static native String TProgram_getInfoLog(byte[] ptr);

	public static native String TProgram_getInfoDebugLog(byte[] ptr);

	public static byte[] TProgram_getIntermediate(byte[] ptr, EShLanguage stage) {
		return TProgram_getIntermediate(ptr, stage.getConstant());
	}

	public static native byte[] TProgram_getIntermediate(byte[] ptr, int stage);

	public static boolean TProgram_buildReflection(byte[] ptr) {
		return TProgram_buildReflection(ptr, E_SH_REFLECTION_DEFAULT);
	}

	public static boolean TProgram_buildReflection(byte[] ptr, EnumSet<EShReflectionOptions> opts) {
		return TProgram_buildReflection(ptr, EShReflectionOptions.setToInt(opts));
	}

	public static native boolean TProgram_buildReflection(byte[] ptr, int opts);

	public static native long TProgram_getLocalSize(byte[] ptr, int dim);

	public static native int TProgram_getReflectionIndex(byte[] ptr, String name);

	public static native int TProgram_getReflectionPipeIOIndex(byte[] ptr, String name, boolean inOrOut);

	public static native int TProgram_getNumUniformVariables(byte[] ptr);

	public static native byte[] TProgram_getUniform(byte[] ptr, int index);

	public static native int TProgram_getNumUniformBlocks(byte[] ptr);

	public static native byte[] TProgram_getUniformBlock(byte[] ptr, int index);

	public static native int TProgram_getNumPipeInputs(byte[] ptr);

	public static native byte[] TProgram_getPipeInput(byte[] ptr, int index);

	public static native int TProgram_getNumPipeOutputs(byte[] ptr);

	public static native byte[] TProgram_getPipeOutput(byte[] ptr, int index);

	public static native int TProgram_getNumBufferVariables(byte[] ptr);

	public static native byte[] TProgram_getBufferVariable(byte[] ptr, int index);

	public static native int TProgram_getNumBufferBlocks(byte[] ptr);

	public static native byte[] TProgram_getBufferBlock(byte[] ptr, int index);

	public static native int TProgram_getNumAtomicCounters(byte[] ptr);

	public static native byte[] TProgram_getAtomicCounter(byte[] ptr, int index);

	public static native int TProgram_getNumLiveUniformVariables(byte[] ptr);

	public static native int TProgram_getNumLiveUniformBlocks(byte[] ptr);

	public static native int TProgram_getNumLiveAttributes(byte[] ptr);

	public static native int TProgram_getUniformIndex(byte[] ptr, String name);

	public static native int TProgram_getPipeIOIndex(byte[] ptr, String name, boolean inOrOut);

	public static native String TProgram_getUniformName(byte[] ptr, int index);

	public static native int TProgram_getUniformBinding(byte[] ptr, int index);

	public static native int TProgram_getUniformStages(byte[] ptr, int index);

	public static native int TProgram_getUniformBlockIndex(byte[] ptr, int index);

	public static native int TProgram_getUniformType(byte[] ptr, int index);

	public static native int TProgram_getUniformBufferOffset(byte[] ptr, int index);

	public static native int TProgram_getUniformArraySize(byte[] ptr, int index);

	public static native byte[] TProgram_getUniformTType(byte[] ptr, int index);

	public static native String TProgram_getUniformBlockName(byte[] ptr, int index);

	public static native int TProgram_getUniformBlockSize(byte[] ptr, int index);

	public static native int TProgram_getUniformBlockBinding(byte[] ptr, int index);

	public static native int TProgram_getUniformBlockCounterIndex(byte[] ptr, int index);

	public static native byte[] TProgram_getUniformBlockTType(byte[] ptr, int index);

	public static native String TProgram_getAttributeName(byte[] ptr, int index);

	public static native int TProgram_getAttributeType(byte[] ptr, int index);

	public static native byte[] TProgram_getAttributeTType(byte[] ptr, int index);

	public static native void TProgram_dumpReflection(byte[] ptr);

	public static boolean TProgram_mapIO(byte[] ptr) {
		return TProgram_mapIO(ptr, null, null);
	}

	public static boolean TProgram_mapIO(byte[] ptr, byte[] pResolver) {
		return TProgram_mapIO(ptr, pResolver, null);
	}

	public static native boolean TProgram_mapIO(byte[] ptr, byte[] pResolver, byte[] pIoMapper);

	public static native byte[] TIoMapper();

	public static boolean TIoMapper_addStage(byte[] ptr, EShLanguage language, byte[] intermediate, byte[] sink,
			byte[] resolver) {
		return TIoMapper_addStage(ptr, language.getConstant(), intermediate, sink, resolver);
	}

	public static native boolean TIoMapper_addStage(byte[] ptr, int language, byte[] intermediate, byte[] sink,
			byte[] resolver);

	public static native boolean TIoMapper_doMap(byte[] ptr, byte[] resolver, byte[] sink);

	public static byte[] TIntermediate(EShLanguage l) {
		return TIntermediate(l.getConstant(), 0, E_NO_PROFILE);
	}

	public static byte[] TIntermediate(int l) {
		return TIntermediate(l, 0, E_NO_PROFILE);
	}

	public static byte[] TIntermediate(EShLanguage l, int v) {
		return TIntermediate(l.getConstant(), v, E_NO_PROFILE);
	}

	public static byte[] TIntermediate(int l, int v) {
		return TIntermediate(l, v, E_NO_PROFILE);
	}

	public static byte[] TIntermediate(EShLanguage l, int v, EProfile p) {
		return TIntermediate(l.getConstant(), v, p.getConstant());
	}

	public static byte[] TIntermediate(EShLanguage l, int v, int p) {
		return TIntermediate(l.getConstant(), v, p);
	}

	public static byte[] TIntermediate(int l, int v, EProfile p) {
		return TIntermediate(l, v, p.getConstant());
	}

	public static native byte[] TIntermediate(int l, int v, int p);

	public static native void TIntermediate_setVersion(byte[] ptr, int v);

	public static native int TIntermediate_getVersion(byte[] ptr);

	public static void TIntermediate_setProfile(byte[] ptr, EProfile p) {
		TIntermediate_setProfile(ptr, p.getConstant());
	}

	public static native void TIntermediate_setProfile(byte[] ptr, int p);

	public static native int TIntermediate_getProfile(byte[] ptr);

	public static native void TIntermediate_setSpv(byte[] ptr, byte[] s);

	public static native byte[] TIntermediate_getSpv(byte[] ptr);

	public static native int TIntermediate_getStage(byte[] ptr);

	public static native void TIntermediate_addRequestedExtension(byte[] ptr, String extension);

	public static void TIntermediate_updateRequestedExtension(byte[] ptr, String extension,
			TExtensionBehavior behavior) {
		TIntermediate_updateRequestedExtension(ptr, extension, behavior.getConstant());
	}

	public static native void TIntermediate_updateRequestedExtension(byte[] ptr, String extension, int behavior);

	public static native byte[] TIntermediate_getRequestedExtensions(byte[] ptr);

	public static native void TIntermediate_setTreeRoot(byte[] ptr, byte[] r);

	public static native byte[] TIntermediate_getTreeRoot(byte[] ptr);

	public static native void TIntermediate_incrementEntryPointCount(byte[] ptr);

	public static native int TIntermediate_getNumEntryPoints(byte[] ptr);

	public static native int TIntermediate_getNumErrors(byte[] ptr);

	public static native void TIntermediate_addPushConstantCount(byte[] ptr);

	public static native void TIntermediate_setLimits(byte[] ptr, byte[] r);

	public static boolean TIntermediate_postProcess(byte[] ptr, byte[] node, EShLanguage language) {
		return TIntermediate_postProcess(ptr, node, language.getConstant());
	}

	public static native boolean TIntermediate_postProcess(byte[] ptr, byte[] node, int language);

	public static native void TIntermediate_removeTree(byte[] ptr);

	public static native void TIntermediate_setEntryPointName(byte[] ptr, String ep);

	public static native void TIntermediate_setEntryPointMangledName(byte[] ptr, String ep);

	public static native String TIntermediate_getEntryPointName(byte[] ptr);

	public static native String TIntermediate_getEntryPointMangledName(byte[] ptr);

	public static native void TIntermediate_setInvertY(byte[] ptr, boolean invert);

	public static native boolean TIntermediate_getInvertY(byte[] ptr);

	public static void TIntermediate_setSource(byte[] ptr, EShSource s) {
		TIntermediate_setSource(ptr, s.getConstant());
	}

	public static native void TIntermediate_setSource(byte[] ptr, int s);

	public static native int TIntermediate_getSource(byte[] ptr);

	public static native boolean TIntermediate_isRecursive(byte[] ptr);

	public static native byte[] TIntermediate_addSymbol(byte[] ptr, byte[] t, byte[] loc);

	public static native byte[] TIntermediate_addSymbol(byte[] ptr, byte[] symbol);

	public static native byte[] TIntermediate_addSymbolVariable(byte[] ptr, byte[] t, byte[] loc);

	public static native byte[] TIntermediate_addSymbolVariable(byte[] ptr, byte[] symbol);

	public static byte[] TIntermediate_addConversionType(byte[] ptr, TOperator op, byte[] node0, byte[] node1) {
		return TIntermediate_addConversionType(ptr, op.getConstant(), node0, node1);
	}

	public static native byte[] TIntermediate_addConversionType(byte[] ptr, int op, byte[] node0, byte[] node1);

	public static byte[] TIntermediate_addConversion(byte[] ptr, TOperator op, byte[] node0, byte[] node1) {
		return TIntermediate_addConversion(ptr, op.getConstant(), node0, node1);
	}

	public static native byte[] TIntermediate_addConversion(byte[] ptr, int op, byte[] node0, byte[] node1);

	public static byte[] TIntermediate_addUniShapeConversion(byte[] ptr, TOperator op, byte[] t, byte[] node) {
		return TIntermediate_addUniShapeConversion(ptr, op.getConstant(), t, node);
	}

	public static native byte[] TIntermediate_addUniShapeConversion(byte[] ptr, int op, byte[] t, byte[] node);

	public static byte[] TIntermediate_addConversion(byte[] ptr, TBasicType convertTo, byte[] node) {
		return TIntermediate_addConversion(ptr, convertTo.getConstant(), node);
	}

	public static native byte[] TIntermediate_addConversion(byte[] ptr, int convertTo, byte[] node);

	public static void TIntermediate_addBiShapeConversion(byte[] ptr, TOperator op, byte[] lhsNode, byte[] rhsNode) {
		TIntermediate_addBiShapeConversion(ptr, op.getConstant(), lhsNode, rhsNode);
	}

	public static native void TIntermediate_addBiShapeConversion(byte[] ptr, int op, byte[] lhsNode, byte[] rhsNode);

	public static native byte[] TIntermediate_addShapeConversion(byte[] ptr, byte[] t, byte[] node);

	public static byte[] TIntermediate_addBinaryMath(byte[] ptr, TOperator op, byte[] left, byte[] right, byte[] loc) {
		return TIntermediate_addBinaryMath(ptr, op.getConstant(), left, right, loc);
	}

	public static native byte[] TIntermediate_addBinaryMath(byte[] ptr, int op, byte[] left, byte[] right, byte[] loc);

	public static byte[] TIntermediate_addAssign(byte[] ptr, TOperator op, byte[] left, byte[] right, byte[] loc) {
		return TIntermediate_addAssign(ptr, op, left, right, loc);
	}

	public static native byte[] TIntermediate_addAssign(byte[] ptr, int op, byte[] left, byte[] right, byte[] loc);

	public static byte[] TIntermediate_addIndex(byte[] ptr, TOperator op, byte[] base, byte[] index, byte[] loc) {
		return TIntermediate_addIndex(ptr, op.getConstant(), base, index, loc);
	}

	public static native byte[] TIntermediate_addIndex(byte[] ptr, int op, byte[] base, byte[] index, byte[] loc);

	public static byte[] TIntermediate_addUnaryMath(byte[] ptr, TOperator op, byte[] child, byte[] loc) {
		return TIntermediate_addUnaryMath(ptr, op.getConstant(), child, loc);
	}

	public static native byte[] TIntermediate_addUnaryMath(byte[] ptr, int op, byte[] child, byte[] loc);

	public static byte[] TIntermediate_addBuiltInFunctionCall(byte[] ptr, byte[] line, TOperator op, boolean unary,
			byte[] node, byte[] returnType) {
		return TIntermediate_addBuiltInFunctionCall(ptr, line, op.getConstant(), unary, node, returnType);
	}

	public static native byte[] TIntermediate_addBuiltInFunctionCall(byte[] ptr, byte[] line, int op, boolean unary,
			byte[] node, byte[] returnType);

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, TBasicType from, TBasicType to) {
		return TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to.getConstant(), E_OP_NULL);
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, int from, TBasicType to) {
		return TIntermediate_canImplicitlyPromote(ptr, from, to.getConstant(), E_OP_NULL);
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, TBasicType from, int to) {
		return TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to, E_OP_NULL);
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, int from, int to) {
		return TIntermediate_canImplicitlyPromote(ptr, from, to, E_OP_NULL);
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, TBasicType from, TBasicType to, TOperator op) {
		return TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to.getConstant(), op.getConstant());
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, int from, TBasicType to, TOperator op) {
		return TIntermediate_canImplicitlyPromote(ptr, from, to.getConstant(), op.getConstant());
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, TBasicType from, int to, TOperator op) {
		return TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to, op.getConstant());
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, TBasicType from, TBasicType to, int op) {
		return TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to.getConstant(), op);
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, int from, int to, TOperator op) {
		return TIntermediate_canImplicitlyPromote(ptr, from, to, op.getConstant());
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, int from, TBasicType to, int op) {
		return TIntermediate_canImplicitlyPromote(ptr, from, to.getConstant(), op);
	}

	public static boolean TIntermediate_canImplicitlyPromote(byte[] ptr, TBasicType from, int to, int op) {
		return TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to, op);
	}

	public static native boolean TIntermediate_canImplicitlyPromote(byte[] ptr, int from, int to, int op);

	public static boolean TIntermediate_isIntegralPromotion(byte[] ptr, TBasicType from, TBasicType to) {
		return TIntermediate_isIntegralPromotion(ptr, from.getConstant(), to.getConstant());
	}

	public static boolean TIntermediate_isIntegralPromotion(byte[] ptr, int from, TBasicType to) {
		return TIntermediate_isIntegralPromotion(ptr, from, to.getConstant());
	}

	public static boolean TIntermediate_isIntegralPromotion(byte[] ptr, TBasicType from, int to) {
		return TIntermediate_isIntegralPromotion(ptr, from.getConstant(), to);
	}

	public static native boolean TIntermediate_isIntegralPromotion(byte[] ptr, int from, int to);

	public static boolean TIntermediate_isFPPromotion(byte[] ptr, TBasicType from, TBasicType to) {
		return TIntermediate_isFPPromotion(ptr, from.getConstant(), to.getConstant());
	}

	public static boolean TIntermediate_isFPPromotion(byte[] ptr, int from, TBasicType to) {
		return TIntermediate_isFPPromotion(ptr, from, to.getConstant());
	}

	public static boolean TIntermediate_isFPPromotion(byte[] ptr, TBasicType from, int to) {
		return TIntermediate_isFPPromotion(ptr, from.getConstant(), to);
	}

	public static native boolean TIntermediate_isFPPromotion(byte[] ptr, int from, int to);

	public static boolean TIntermediate_isIntegralConversion(byte[] ptr, TBasicType from, TBasicType to) {
		return TIntermediate_isIntegralConversion(ptr, from.getConstant(), to.getConstant());
	}

	public static boolean TIntermediate_isIntegralConversion(byte[] ptr, int from, TBasicType to) {
		return TIntermediate_isIntegralConversion(ptr, from, to.getConstant());
	}

	public static boolean TIntermediate_isIntegralConversion(byte[] ptr, TBasicType from, int to) {
		return TIntermediate_isIntegralConversion(ptr, from.getConstant(), to);
	}

	public static native boolean TIntermediate_isIntegralConversion(byte[] ptr, int from, int to);

	public static boolean TIntermediate_isFPConversion(byte[] ptr, TBasicType from, TBasicType to) {
		return TIntermediate_isFPConversion(ptr, from.getConstant(), to.getConstant());
	}

	public static boolean TIntermediate_isFPConversion(byte[] ptr, int from, TBasicType to) {
		return TIntermediate_isFPConversion(ptr, from, to.getConstant());
	}

	public static boolean TIntermediate_isFPConversion(byte[] ptr, TBasicType from, int to) {
		return TIntermediate_isFPConversion(ptr, from.getConstant(), to);
	}

	public static native boolean TIntermediate_isFPConversion(byte[] ptr, int from, int to);

	public static boolean TIntermediate_isFPIntegralConversion(byte[] ptr, TBasicType from, TBasicType to) {
		return TIntermediate_isFPIntegralConversion(ptr, from.getConstant(), to.getConstant());
	}

	public static boolean TIntermediate_isFPIntegralConversion(byte[] ptr, int from, TBasicType to) {
		return TIntermediate_isFPIntegralConversion(ptr, from, to.getConstant());
	}

	public static boolean TIntermediate_isFPIntegralConversion(byte[] ptr, TBasicType from, int to) {
		return TIntermediate_isFPIntegralConversion(ptr, from.getConstant(), to);
	}

	public static native boolean TIntermediate_isFPIntegralConversion(byte[] ptr, int from, int to);

	public static native int TIntermediate_mapTypeToConstructorOp(byte[] ptr, byte[] t);

	public static native byte[] TIntermediate_growAggregate(byte[] ptr, byte[] left, byte[] right);

	public static native byte[] TIntermediate_growAggregate(byte[] ptr, byte[] left, byte[] right, byte[] loc);

	public static native byte[] TIntermediate_makeAggregate(byte[] ptr, byte[] node);

	public static native byte[] TIntermediate_makeAggregate(byte[] ptr, byte[] node, byte[] loc);

	public static native byte[] TIntermediate_makeAggregateLoc(byte[] ptr, byte[] loc);

	public static byte[] TIntermediate_setAggregateOperator(byte[] ptr, byte[] node, TOperator op, byte[] type,
			byte[] loc) {
		return TIntermediate_setAggregateOperator(ptr, node, op.getConstant(), type, loc);
	}

	public static native byte[] TIntermediate_setAggregateOperator(byte[] ptr, byte[] node, int op, byte[] type,
			byte[] loc);

	public static native boolean TIntermediate_areAllChildConst(byte[] ptr, byte[] aggrNode);

	public static native byte[] TIntermediate_addSelection(byte[] ptr, byte[] cond, byte[] code, byte[] loc);

	public static native byte[] TIntermediate_addSelection(byte[] ptr, byte[] cond, byte[] trueBlock, byte[] falseBlock,
			byte[] loc);

	public static native byte[] TIntermediate_addComma(byte[] ptr, byte[] left, byte[] right, byte[] loc);

	public static native byte[] TIntermediate_addMethod(byte[] ptr, byte[] node, byte[] t, String s, byte[] loc);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, byte[] array, byte[] t, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, array, t, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, byte[] array, byte[] t, byte[] loc,
			boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, byte val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, byte val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, short val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, short val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_addConstantUnionUnsignedChar(byte[] ptr, short val, byte[] loc) {
		return TIntermediate_addConstantUnionUnsignedChar(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnionUnsignedChar(byte[] ptr, short val, byte[] loc,
			boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, int val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, int val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_addConstantUnionUnsignedShort(byte[] ptr, int val, byte[] loc) {
		return TIntermediate_addConstantUnionUnsignedShort(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnionUnsignedShort(byte[] ptr, int val, byte[] loc,
			boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, long val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, long val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, BigInteger val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, BigInteger val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_addConstantUnionUnsignedLong(byte[] ptr, BigInteger val, byte[] loc) {
		return TIntermediate_addConstantUnionUnsignedLong(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnionUnsignedLong(byte[] ptr, BigInteger val, byte[] loc,
			boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, boolean val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, boolean val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, double val, TBasicType t, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, t.getConstant(), loc, false);
	}

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, double val, int t, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, t, loc, false);
	}

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, double val, TBasicType t, byte[] loc,
			boolean literal) {
		return TIntermediate_addConstantUnion(ptr, val, t.getConstant(), loc, literal);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, double val, int t, byte[] loc,
			boolean literal);

	public static byte[] TIntermediate_addConstantUnion(byte[] ptr, String val, byte[] loc) {
		return TIntermediate_addConstantUnion(ptr, val, loc, false);
	}

	public static native byte[] TIntermediate_addConstantUnion(byte[] ptr, String val, byte[] loc, boolean literal);

	public static byte[] TIntermediate_promoteConstantUnion(byte[] ptr, TBasicType t, byte[] union) {
		return TIntermediate_promoteConstantUnion(ptr, t.getConstant(), union);
	}

	public static native byte[] TIntermediate_promoteConstantUnion(byte[] ptr, int t, byte[] union);

	public static boolean TIntermediate_parseConstTree(byte[] ptr, byte[] node, byte[] arr, TOperator op, byte[] t) {
		return TIntermediate_parseConstTree(ptr, node, arr, op.getConstant(), t, false);
	}

	public static boolean TIntermediate_parseConstTree(byte[] ptr, byte[] node, byte[] arr, int op, byte[] t) {
		return TIntermediate_parseConstTree(ptr, node, arr, op, t, false);
	}

	public static boolean TIntermediate_parseConstTree(byte[] ptr, byte[] node, byte[] arr, TOperator op, byte[] t,
			boolean singleConstantParam) {
		return TIntermediate_parseConstTree(ptr, node, arr, op.getConstant(), t, singleConstantParam);
	}

	public static native boolean TIntermediate_parseConstTree(byte[] ptr, byte[] node, byte[] arr, int op, byte[] t,
			boolean singleConstantParam);

	public static native byte[] TIntermediate_addLoop(byte[] ptr, byte[] node, byte[] typed0, byte[] typed1,
			boolean testFirst, byte[] loc);

	public static native byte[] TIntermediate_addForLoop(byte[] ptr, byte[] node0, byte[] node1, byte[] typed0,
			byte[] typed1, boolean testFirst, byte[] loc, byte[] loop);

	public static byte[] TIntermediate_addBranch(byte[] ptr, TOperator op, byte[] loc) {
		return TIntermediate_addBranch(ptr, op.getConstant(), loc);
	}

	public static native byte[] TIntermediate_addBranch(byte[] ptr, int op, byte[] loc);

	public static byte[] TIntermediate_addBranch(byte[] ptr, TOperator op, byte[] node, byte[] loc) {
		return TIntermediate_addBranch(ptr, op.getConstant(), node, loc);
	}

	public static native byte[] TIntermediate_addBranch(byte[] ptr, int op, byte[] node, byte[] loc);

	public static native byte[] TIntermediate_addSwizzle(byte[] ptr, byte[] selector, byte[] loc);

	public static byte[] TIntermediate_addBinaryNode(byte[] ptr, TOperator op, byte[] left, byte[] right, byte[] loc) {
		return TIntermediate_addBinaryNode(ptr, op.getConstant(), left, right, loc);
	}

	public static native byte[] TIntermediate_addBinaryNode(byte[] ptr, int op, byte[] left, byte[] right, byte[] loc);

	public static byte[] TIntermediate_addBinaryNode(byte[] ptr, TOperator op, byte[] left, byte[] right, byte[] loc,
			byte[] t) {
		return TIntermediate_addBinaryNode(ptr, op.getConstant(), left, right, loc, t);
	}

	public static native byte[] TIntermediate_addBinaryNode(byte[] ptr, int op, byte[] left, byte[] right, byte[] loc,
			byte[] t);

	public static byte[] TIntermediate_addUnaryNode(byte[] ptr, TOperator op, byte[] child, byte[] loc) {
		return TIntermediate_addUnaryNode(ptr, op.getConstant(), child, loc);
	}

	public static native byte[] TIntermediate_addUnaryNode(byte[] ptr, int op, byte[] child, byte[] loc);

	public static byte[] TIntermediate_addUnaryNode(byte[] ptr, TOperator op, byte[] child, byte[] loc, byte[] t) {
		return TIntermediate_addUnaryNode(ptr, op.getConstant(), child, loc, t);
	}

	public static native byte[] TIntermediate_addUnaryNode(byte[] ptr, int op, byte[] child, byte[] loc, byte[] t);

	public static native byte[] TIntermediate_fold(byte[] ptr, byte[] aggrNode);

	public static native byte[] TIntermediate_foldConstructor(byte[] ptr, byte[] aggrNode);

	public static native byte[] TIntermediate_foldDereference(byte[] ptr, byte[] node, int index, byte[] loc);

	public static native byte[] TIntermediate_foldSwizzle(byte[] ptr, byte[] node, byte[] fields, byte[] loc);

	public static void TIntermediate_addSymbolLinkageNodes(byte[] ptr, byte[] linkage, EShLanguage language,
			byte[] table) {
		TIntermediate_addSymbolLinkageNodes(ptr, linkage, language.getConstant(), table);
	}

	public static native void TIntermediate_addSymbolLinkageNodes(byte[] ptr, byte[] linkage, int language,
			byte[] table);

	public static native void TIntermediate_addSymbolLinkageNode(byte[] ptr, byte[] linkage, byte[] symbol);

	public static native void TIntermediate_setUseStorageBuffer(byte[] ptr);

	public static native boolean TIntermediate_usingStorageBuffer(byte[] ptr);

	public static native void TIntermediate_setDepthReplacing(byte[] ptr);

	public static native boolean TIntermediate_isDepthReplacing(byte[] ptr);

	public static native boolean TIntermediate_setLocalSize(byte[] ptr, int dim, int size);

	public static native long TIntermediate_getLocalSize(byte[] ptr, int dim);

	public static native boolean TIntermediate_setLocalSizeSpecId(byte[] ptr, int dim, int id);

	public static native int TIntermediate_getLocalSizeSpecId(byte[] ptr, int dim);

	public static native void TIntermediate_output(byte[] ptr, byte[] sink, boolean tree);

	public static native boolean TIntermediate_isEsProfile(byte[] ptr);

	public static native boolean TIntermediate_getXfbMode(byte[] ptr);

	public static native boolean TIntermediate_isMultiStream(byte[] ptr);

	public static native int TIntermediate_getOutputPrimitive(byte[] ptr);

	public static native boolean TIntermediate_getPostDepthCoverage(byte[] ptr);

	public static native boolean TIntermediate_getEarlyFragmentTests(byte[] ptr);

	public static native int TIntermediate_getDepth(byte[] ptr);

	public static native boolean TIntermediate_getPixelCenterInteger(byte[] ptr);

	public static native void TIntermediate_setOriginUpperLeft(byte[] ptr);

	public static native boolean TIntermediate_getOriginUpperLeft(byte[] ptr);

	public static native int TIntermediate_getInterlockOrdering(byte[] ptr);

	public static native boolean TIntermediate_getAutoMapBindings(byte[] ptr);

	public static native boolean TIntermediate_getAutoMapLocations(byte[] ptr);

	public static native int TIntermediate_getNumPushConstants(byte[] ptr);

	public static native void TIntermediate_addShaderRecordCount(byte[] ptr);

	public static native void TIntermediate_addTaskNVCount(byte[] ptr);

	public static native void TIntermediate_setUseVulkanMemoryModel(byte[] ptr);

	public static native boolean TIntermediate_usingVulkanMemoryModel(byte[] ptr);

	public static native boolean TIntermediate_usingPhysicalStorageBuffer(byte[] ptr);

	public static native boolean TIntermediate_usingVariablePointers(byte[] ptr);

	public static native long TIntermediate_getXfbStride(byte[] ptr, int buffer);

	public static native boolean TIntermediate_hasLayoutDerivativeModeNone(byte[] ptr);

	public static native int TIntermediate_getLayoutDerivativeModeNone(byte[] ptr);

	public static void TIntermediate_setShiftBinding(byte[] ptr, TResourceType res, long shift) {
		TIntermediate_setShiftBinding(ptr, res.getConstant(), shift);
	}

	public static native void TIntermediate_setShiftBinding(byte[] ptr, int res, long shift);

	public static long TIntermediate_getShiftBinding(byte[] ptr, TResourceType res) {
		return TIntermediate_getShiftBinding(ptr, res.getConstant());
	}

	public static native long TIntermediate_getShiftBinding(byte[] ptr, int res);

	public static void TIntermediate_setShiftBindingForSet(byte[] ptr, TResourceType res, long shift, long set) {
		TIntermediate_setShiftBindingForSet(ptr, res.getConstant(), shift, set);
	}

	public static native void TIntermediate_setShiftBindingForSet(byte[] ptr, int res, long shift, long set);

	public static int TIntermediate_getShiftBindingForSet(byte[] ptr, TResourceType res, long set) {
		return TIntermediate_getShiftBindingForSet(ptr, res.getConstant(), set);
	}

	public static native int TIntermediate_getShiftBindingForSet(byte[] ptr, int res, long set);

	public static boolean TIntermediate_hasShiftBindingForSet(byte[] ptr, TResourceType res) {
		return TIntermediate_hasShiftBindingForSet(ptr, res.getConstant());
	}

	public static native boolean TIntermediate_hasShiftBindingForSet(byte[] ptr, int res);

	public static native void TIntermediate_setResourceSetBinding(byte[] ptr, String[] shift);

	public static native String[] TIntermediate_getResourceSetBinding(byte[] ptr);

	public static native void TIntermediate_setAutoMapBindings(byte[] ptr, boolean map);

	public static native void TIntermediate_setAutoMapLocations(byte[] ptr, boolean map);

	public static native void TIntermediate_setFlattenUniformArrays(byte[] ptr, boolean flatten);

	public static native boolean TIntermediate_getFlattenUniformArrays(byte[] ptr);

	public static native boolean TIntermediate_getNoStorageFormat(byte[] ptr);

	public static native byte[] TIntermediate_addCounterBufferName(byte[] ptr, byte[] name);

	public static native boolean TIntermediate_hasCounterBufferName(byte[] ptr, String name);

	public static void TIntermediate_setTextureSamplerTransformMode(byte[] ptr, EShTextureSamplerTransformMode mode) {
		TIntermediate_setTextureSamplerTransformMode(ptr, mode.getConstant());
	}

	public static native void TIntermediate_setTextureSamplerTransformMode(byte[] ptr, int mode);

	public static native boolean TIntermediate_setInvocations(byte[] ptr, int i);

	public static native int TIntermediate_getInvocations(byte[] ptr);

	public static native boolean TIntermediate_setVertices(byte[] ptr, int m);

	public static native int TIntermediate_getVertices(byte[] ptr);

	public static native int TIntermediate_getInputPrimitive(byte[] ptr);

	public static boolean TIntermediate_setVertexSpacing(byte[] ptr, TVertexSpacing s) {
		return TIntermediate_setVertexSpacing(ptr, s.getConstant());
	}

	public static native boolean TIntermediate_setVertexSpacing(byte[] ptr, int s);

	public static native int TIntermediate_getVertexSpacing(byte[] ptr);

	public static boolean TIntermediate_setVertexOrder(byte[] ptr, TVertexOrder o) {
		return TIntermediate_setVertexOrder(ptr, o.getConstant());
	}

	public static native boolean TIntermediate_setVertexOrder(byte[] ptr, int o);

	public static native int TIntermediate_getVertexOrder(byte[] ptr);

	public static native void TIntermediate_setPointMode(byte[] ptr);

	public static native boolean TIntermediate_getPointMode(byte[] ptr);

	public static boolean TIntermediate_setInterlockOrdering(byte[] ptr, TInterlockOrdering o) {
		return TIntermediate_setInterlockOrdering(ptr, o.getConstant());
	}

	public static native boolean TIntermediate_setInterlockOrdering(byte[] ptr, int o);

	public static native void TIntermediate_setXfbMode(byte[] ptr);

	public static native void TIntermediate_setMultiStream(byte[] ptr);

	public static boolean TIntermediate_setOutputPrimitive(byte[] ptr, TLayoutGeometry p) {
		return TIntermediate_setOutputPrimitive(ptr, p.getConstant());
	}

	public static native boolean TIntermediate_setOutputPrimitive(byte[] ptr, int p);

	public static native void TIntermediate_setPostDepthCoverage(byte[] ptr);

	public static native void TIntermediate_setEarlyFragmentTests(byte[] ptr);

	public static boolean TIntermediate_setDepth(byte[] ptr, TLayoutDepth d) {
		return TIntermediate_setDepth(ptr, d.getConstant());
	}

	public static native boolean TIntermediate_setDepth(byte[] ptr, int d);

	public static native void TIntermediate_setPixelCenterInteger(byte[] ptr);

	public static void TIntermediate_addBlendEquation(byte[] ptr, TBlendEquationShift b) {
		TIntermediate_ddBlendEquation(ptr, b.getConstant());
	}

	public static native void TIntermediate_ddBlendEquation(byte[] ptr, int b);

	public static native long TIntermediate_getBlendEquations(byte[] ptr);

	public static native boolean TIntermediate_setXfbBufferStride(byte[] ptr, int buffer, long stride);

	public static native int TIntermediate_addXfbBufferOffset(byte[] ptr, byte[] t);

	public static native long TIntermediate_computeTypeXfbSize(byte[] ptr, byte[] t, boolean contains64BitType,
			boolean contains32BitType, boolean contains16BitType);

	public static native long TIntermediate_computeTypeXfbSize(byte[] ptr, byte[] t, boolean contains64BitType);

	public static native void TIntermediate_setLayoutOverrideCoverage(byte[] ptr);

	public static native boolean TIntermediate_getLayoutOverrideCoverage(byte[] ptr);

	public static native void TIntermediate_setGeoPassthroughEXT(byte[] ptr);

	public static native boolean TIntermediate_getGeoPassthroughEXT(byte[] ptr);

	public static void TIntermediate_setLayoutDerivativeMode(byte[] ptr, ComputeDerivativeMode mode) {
		TIntermediate_setLayoutDerivativeMode(ptr, mode.getConstant());
	}

	public static native void TIntermediate_setLayoutDerivativeMode(byte[] ptr, int mode);

	public static native void TIntermediate_setLayoutPrimitiveCulling(byte[] ptr);

	public static native boolean TIntermediate_getLayoutPrimitiveCulling(byte[] ptr);

	public static native boolean TIntermediate_setPrimitives(byte[] ptr, int m);

	public static native int TIntermediate_getPrimitives(byte[] ptr);

	public static native String TIntermediate_addSemanticName(byte[] ptr, String name);

	public static native void TIntermediate_addUniformLocationOverride(byte[] ptr, String nameStr, int location);

	public static native int TIntermediate_getUniformLocationOverride(byte[] ptr, String nameStr);

	public static native void TIntermediate_setUniformLocationBase(byte[] ptr, int base);

	public static native int TIntermediate_getUniformLocationBase(byte[] ptr);

	public static native void TIntermediate_setNeedsLegalization(byte[] ptr);

	public static native boolean TIntermediate_needsLegalization(byte[] ptr);

	public static native void TIntermediate_setBinaryDoubleOutput(byte[] ptr);

	public static native boolean TIntermediate_getBinaryDoubleOutput(byte[] ptr);

	public static native void TIntermediate_setHlslFunctionality1(byte[] ptr);

	public static native void TIntermediate_setHlslOffsets(byte[] ptr);

	public static native void TIntermediate_setHlslIoMapping(byte[] ptr, boolean b);

	public static native boolean TIntermediate_getHlslFunctionality1(byte[] ptr);

	public static native boolean TIntermediate_usingHlslOffsets(byte[] ptr);

	public static native boolean TIntermediate_usingHlslIoMapping(byte[] ptr);

	public static native void TIntermediate_addToCallGraph(byte[] ptr, byte[] sink, String caller, String callee);

	public static native void TIntermediate_merge(byte[] ptr, byte[] sink, byte[] intermediate);

	public static native void TIntermediate_finalCheck(byte[] ptr, byte[] sink, boolean keepUncalled);

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, TBasicType dst, TBasicType src,
			TOperator convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst.getConstant(), src.getConstant(), convertOp.getConstant());
	}

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, int dst, TBasicType src, TOperator convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst, src.getConstant(), convertOp.getConstant());
	}

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, TBasicType dst, int src, TOperator convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst.getConstant(), src, convertOp.getConstant());
	}

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, TBasicType dst, TBasicType src, int convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst.getConstant(), src.getConstant(), convertOp);
	}

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, int dst, int src, TOperator convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst, src, convertOp.getConstant());
	}

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, int dst, TBasicType src, int convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst, src.getConstant(), convertOp);
	}

	public static boolean TIntermediate_buildConvertOp(byte[] ptr, TBasicType dst, int src, int convertOp) {
		return TIntermediate_buildConvertOp(ptr, dst.getConstant(), src, convertOp);
	}

	public static native boolean TIntermediate_buildConvertOp(byte[] ptr, int dst, int src, int convertOp);

	public static byte[] TIntermediate_createConversion(byte[] ptr, TBasicType convertTo, byte[] node) {
		return TIntermediate_createConversion(ptr, convertTo.getConstant(), node);
	}

	public static native byte[] TIntermediate_createConversion(byte[] ptr, int convertTo, byte[] node);

	public static native void TIntermediate_addIoAccessed(byte[] ptr, String name);

	public static native boolean TIntermediate_inIoAccessed(byte[] ptr, String name);

	public static native int TIntermediate_addUsedLocation(byte[] ptr, byte[] qualifier, byte[] t,
			boolean typeCollision);

	public static native int TIntermediate_checkLocationRange(byte[] ptr, int set, byte[] range, byte[] t,
			boolean typeCollision);

	public static native int TIntermediate_addUsedOffsets(byte[] ptr, int binding, int offset, int numOffsets);

	public static native boolean TIntermediate_addUsedConstantId(byte[] ptr, int id);

	public static native boolean TIntermediate_promote(byte[] ptr, byte[] operator);

	public static native void TIntermediate_setNanMinMaxClamp(byte[] ptr, boolean setting);

	public static native boolean TIntermediate_getNanMinMaxClamp(byte[] ptr);

	public static native void TIntermediate_setSourceFile(byte[] ptr, String file);

	public static native String TIntermediate_getSourceFile(byte[] ptr);

	public static native void TIntermediate_addSourceText(byte[] ptr, String text, long len);// NOTE: Interface not
																								// exact. size_t might
																								// be larger than long.

	public static native String TIntermediate_getSourceText(byte[] ptr);

	public static native byte[] TIntermediate_getIncludeText(byte[] ptr);

	public static native void TIntermediate_addIncludeText(byte[] ptr, String name, String text, long len);// NOTE:
																											// Interface
																											// not
																											// exact.
																											// size_t
																											// might be
																											// larger
																											// than
																											// long.

	public static native void TIntermediate_addProcesses(byte[] ptr, String[] p);

	public static native void TIntermediate_addProcess(byte[] ptr, String process);

	public static native void TIntermediate_addProcessArgument(byte[] ptr, String arg);

	public static native String[] TIntermediate_getProcesses(byte[] ptr);

	public static native byte[] TIntermediate_findLValueBase(byte[] node, boolean swizzleOkay);

	public static int TIntermediate_computeTypeLocationSize(byte[] t, EShLanguage language) {
		return TIntermediate_computeTypeLocationSize(t, language.getConstant());
	}

	public static native int TIntermediate_computeTypeLocationSize(byte[] t, int language);

	public static native int TIntermediate_computeTypeUniformLocationSize(byte[] t);

	public static native int TIntermediate_getBaseAlignmentScalar(byte[] t, int size);

	public static int TIntermediate_getBaseAlignment(byte[] t, int size, int stride, TLayoutPacking layoutPacking,
			boolean rowMajor) {
		return TIntermediate_getBaseAlignment(t, size, stride, layoutPacking.getConstant(), rowMajor);
	}

	public static native int TIntermediate_getBaseAlignment(byte[] t, int size, int stride, int layoutPacking,
			boolean rowMajor);

	public static native int TIntermediate_getScalarAlignment(byte[] t, int size, int stride, boolean rowMajor);

	public static int TIntermediate_getMemberAlignment(byte[] t, int size, int stride, TLayoutPacking layoutPacking,
			boolean rowMajor) {
		return TIntermediate_getMemberAlignment(t, size, stride, layoutPacking.getConstant(), rowMajor);
	}

	public static native int TIntermediate_getMemberAlignment(byte[] t, int size, int stride, int layoutPacking,
			boolean rowMajor);

	public static native boolean TIntermediate_improperStraddle(byte[] type, int size, int offset);

	public static native void TIntermediate_updateOffset(byte[] parentType, byte[] memberType, int offset,
			int memberSize);

	public static native int TIntermediate_getOffset(byte[] type, int index);

	public static native int TIntermediate_getBlockSize(byte[] blockType);

	public static native int TIntermediate_computeBufferReferenceTypeSize(byte[] t);

	public static byte[] TType() {
		return TType(EBT_VOID, EVQ_TEMPORARY, 1, 0, 0, false);
	}

	public static byte[] TType(TBasicType t) {
		return TType(t.getConstant(), EVQ_TEMPORARY, 1, 0, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q) {
		return TType(t.getConstant(), q.getConstant(), 1, 0, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, int vs) {
		return TType(t.getConstant(), q.getConstant(), vs, 0, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, int vs, int mc) {
		return TType(t.getConstant(), q.getConstant(), vs, mc, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, int vs, int mc, int mr) {
		return TType(t.getConstant(), q.getConstant(), vs, mc, mr, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, int vs, int mc, int mr, boolean isVector) {
		return TType(t.getConstant(), q.getConstant(), vs, mc, mr, isVector);
	}

	public static native byte[] TType(int t, int q, int vs, int mc, int mr, boolean isVector);

	public static byte[] TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p) {
		return TType(t.getConstant(), q.getConstant(), p.getConstant(), 1, 0, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs) {
		return TType(t.getConstant(), q.getConstant(), p.getConstant(), vs, 0, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs, int mc) {
		return TType(t.getConstant(), q.getConstant(), p.getConstant(), vs, mc, 0, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs, int mc, int mr) {
		return TType(t.getConstant(), q.getConstant(), p.getConstant(), vs, mc, mr, false);
	}

	public static byte[] TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs, int mc, int mr,
			boolean isVector) {
		return TType(t.getConstant(), q.getConstant(), p.getConstant(), vs, mc, mr, isVector);
	}

	public static native byte[] TType(int t, int q, int p, int vs, int mc, int mr, boolean isVector);

	public static native byte[] TType(byte[] p);

	public static byte[] TType(byte[] sampler, TStorageQualifier q) {
		return TType(sampler, q.getConstant(), null);
	}

	public static byte[] TType(byte[] sampler, TStorageQualifier q, byte[] as) {
		return TType(sampler, q.getConstant(), as);
	}

	public static native byte[] TType(byte[] sampler, int q, byte[] as);

	public static native byte[] TType(byte[] type, int derefIndex, boolean rowMajor);

	public static native byte[] TType(byte[] userDef, String n);

	public static native byte[] TType(byte[] userDef, String n, byte[] q);

	public static byte[] TType(TBasicType t, byte[] p, String n) {
		return TType(t.getConstant(), p, n);
	}

	public static native byte[] TType(int t, byte[] p, String n);

	public static native void TType_shallowCopy(byte[] ptr, byte[] copyOf);

	public static native void TType_deepCopy(byte[] ptr, byte[] copyOf);

	public static native void TType_makeTemporary(byte[] ptr);

	public static native byte[] TType_clone(byte[] ptr);

	public static native void TType_makeVector(byte[] ptr);

	public static native void TType_hideMember(byte[] ptr);

	public static native boolean TType_hiddenMember(byte[] ptr);

	public static native void TType_setFieldName(byte[] ptr, String n);

	public static native String TType_getFieldName(byte[] ptr);

	public static native int TType_getShaderInterface(byte[] ptr);

	public static native int TType_getBasicType(byte[] ptr);

	public static native byte[] TType_getSampler(byte[] ptr);

	public static native byte[] TType_getQualifier(byte[] ptr);

	public static native int TType_getVectorSize(byte[] ptr);

	public static native int TType_getMatrixCols(byte[] ptr);

	public static native int TType_getMatrixRows(byte[] ptr);

	public static native int TType_getOuterArraySize(byte[] ptr);

	public static native byte[] TType_getOuterArrayNode(byte[] ptr);

	public static native int TType_getCumulativeArraySize(byte[] ptr);

	public static native boolean TType_isArrayOfArrays(byte[] ptr);

	public static native int TType_getImplicitArraySize(byte[] ptr);

	public static native byte[] TType_getArraySizes(byte[] ptr);

	public static native byte[] TType_getReferentType(byte[] ptr);

	public static native byte[] TType_getTypeParameters(byte[] ptr);

	public static native boolean TType_isScalar(byte[] ptr);

	public static native boolean TType_isScalarOrVec1(byte[] ptr);

	public static native boolean TType_isVector(byte[] ptr);

	public static native boolean TType_isMatrix(byte[] ptr);

	public static native boolean TType_isArray(byte[] ptr);

	public static native boolean TType_isSizedArray(byte[] ptr);

	public static native boolean TType_isUnsizedArray(byte[] ptr);

	public static native boolean TType_isArrayVariablyIndexed(byte[] ptr);

	public static native void TType_setArrayVariablyIndexed(byte[] ptr);

	public static native void TType_updateImplicitArraySize(byte[] ptr, int size);

	public static native boolean TType_isStruct(byte[] ptr);

	public static native boolean TType_isFloatingDomain(byte[] ptr);

	public static native boolean TType_isIntegerDomain(byte[] ptr);

	public static native boolean TType_isOpaque(byte[] ptr);

	public static native boolean TType_isBuiltIn(byte[] ptr);

	public static native boolean TType_isImage(byte[] ptr);

	public static native boolean TType_isSubpass(byte[] ptr);

	public static native boolean TType_isTexture(byte[] ptr);

	public static native boolean TType_isUnusableName(byte[] ptr);

	public static native boolean TType_isParameterized(byte[] ptr);

	public static native boolean TType_isAtomic(byte[] ptr);

	public static native boolean TType_isCoopMat(byte[] ptr);

	public static native boolean TType_isReference(byte[] ptr);

	public static native boolean TType_contains(byte[] ptr, byte[] predicate);

	public static boolean TType_containsBasicType(byte[] ptr, TBasicType checkType) {
		return TType_containsBasicType(ptr, checkType.getConstant());
	}

	public static native boolean TType_containsBasicType(byte[] ptr, int checkType);

	public static native boolean TType_containsArray(byte[] ptr);

	public static native boolean TType_containsStructure(byte[] ptr);

	public static native boolean TType_containsUnsizedArray(byte[] ptr);

	public static native boolean TType_containsOpaque(byte[] ptr);

	public static native boolean TType_containsBuiltIn(byte[] ptr);

	public static native boolean TType_containsNonOpaque(byte[] ptr);

	public static native boolean TType_containsSpecializationSize(byte[] ptr);

	public static native boolean TType_containsDouble(byte[] ptr);

	public static native boolean TType_contains16BitFloat(byte[] ptr);

	public static native boolean TType_contains64BitInt(byte[] ptr);

	public static native boolean TType_contains16BitInt(byte[] ptr);

	public static native boolean TType_contains8BitInt(byte[] ptr);

	public static native boolean TType_containsCoopMat(byte[] ptr);

	public static native boolean TType_containsReference(byte[] ptr);

	public static native void TType_updateArraySizes(byte[] ptr, byte[] type);

	public static native void TType_copyArraySizes(byte[] ptr, byte[] s);

	public static native void TType_transferArraySizes(byte[] ptr, byte[] s);

	public static native void TType_clearArraySizes(byte[] ptr);

	public static native void TType_copyArrayInnerSizes(byte[] ptr, byte[] s);

	public static native void TType_changeOuterArraySize(byte[] ptr, int s);

	public static native void TType_adoptImplicitArraySizes(byte[] ptr, boolean skipNonvariablyIndexed);

	public static native void TType_updateTypeParameters(byte[] ptr, byte[] type);

	public static native void TType_copyTypeParameters(byte[] ptr, byte[] s);

	public static native void TType_transferTypeParameters(byte[] ptr, byte[] s);

	public static native void TType_clearTypeParameters(byte[] ptr);

	public static native void TType_copyTypeParametersInnerSizes(byte[] ptr, byte[] s);

	public static native String TType_getBasicString(byte[] ptr);

	public static native String TType_getBasicTypeString(byte[] ptr);

	public static native String TType_getCompleteString(byte[] ptr);

	public static native String TType_getStorageQualifierString(byte[] ptr);

	public static native String TType_getBuiltInVariableString(byte[] ptr);

	public static native String TType_getPrecisionQualifierString(byte[] ptr);

	public static native byte[] TType_getStruct(byte[] ptr);

	public static native void TType_setStruct(byte[] ptr, byte[] s);

	public static native byte[] TType_getWritableStruct(byte[] ptr);

	public static void TType_setBasicType(byte[] ptr, TBasicType t) {
		TType_setBasicType(ptr, t.getConstant());
	}

	public static native void TType_setBasicType(byte[] ptr, int t);

	public static native int TType_computeNumComponents(byte[] ptr);

	public static native void TType_appendMangledName(byte[] ptr, String name);

	public static native boolean TType_sameStructType(byte[] ptr, byte[] right);

	public static native boolean TType_sameReferenceType(byte[] ptr, byte[] right);

	public static native boolean TType_sameElementType(byte[] ptr, byte[] right);

	public static native boolean TType_sameArrayness(byte[] ptr, byte[] right);

	public static native boolean TType_sameInnerArrayness(byte[] ptr, byte[] right);

	public static native boolean TType_sameTypeParameters(byte[] ptr, byte[] right);

	public static native boolean TType_sameElementShape(byte[] ptr, byte[] right);

	public static native boolean TType_coopMatParameterOK(byte[] ptr, byte[] right);

	public static native boolean TType_sameCoopMatBaseType(byte[] ptr, byte[] right);

	public static native long TType_getBufferReferenceAlignment(byte[] ptr);

	public static String TType_getBasicString(TBasicType t) {
		return TType_getBasicString(t.getConstant());
	}

	public static native String TType_getBasicString(int t);

	public static native boolean TType_operatorEqual(byte[] ptr, byte[] right);

	public static native boolean TType_operatorNotEqual(byte[] ptr, byte[] right);

	public static native byte[] TPublicType();

	public static native boolean TPublicType_isCoopmat(byte[] ptr);

	public static native void TPublicType_initType(byte[] ptr, byte[] l);

	public static void TPublicType_initQualifiers(byte[] ptr) {
		TPublicType_initQualifiers(ptr, false);
	}

	public static native void TPublicType_initQualifiers(byte[] ptr, boolean global);

	public static void TPublicType_init(byte[] ptr, byte[] l) {
		TPublicType_init(ptr, l, false);
	}

	public static native void TPublicType_init(byte[] ptr, byte[] l, boolean global);

	public static native void TPublicType_setVector(byte[] ptr, int s);

	public static native void TPublicType_setMatrix(byte[] ptr, int c, int r);

	public static native boolean TPublicType_isScalar(byte[] ptr);

	public static native boolean TPublicType_isImage(byte[] ptr);

	public static native boolean TPublicType_isSubpass(byte[] ptr);

	public static native void TPublicType_setBasicType(byte[] ptr, int v);

	public static native void TPublicType_setSampler(byte[] ptr, byte[] v);

	public static native void TPublicType_setQualifier(byte[] ptr, byte[] v);

	public static native void TPublicType_setShaderQualifiers(byte[] ptr, byte[] v);

	public static native void TPublicType_setVectorSize(byte[] ptr, int v);

	public static native void TPublicType_setMatrixCols(byte[] ptr, int v);

	public static native void TPublicType_setMatrixRows(byte[] ptr, int v);

	public static native void TPublicType_setCoopmat(byte[] ptr, boolean v);

	public static native void TPublicType_setArraySizes(byte[] ptr, byte[] v);

	public static native void TPublicType_setUserDef(byte[] ptr, byte[] v);

	public static native void TPublicType_setLoc(byte[] ptr, byte[] v);

	public static native void TPublicType_setTypeParameters(byte[] ptr, byte[] v);

	public static native int TPublicType_getBasicType(byte[] ptr);

	public static native byte[] TPublicType_getSampler(byte[] ptr);

	public static native byte[] TPublicType_getQualifier(byte[] ptr);

	public static native byte[] TPublicType_getShaderQualifiers(byte[] ptr);

	public static native int TPublicType_getVectorSize(byte[] ptr);

	public static native int TPublicType_getMatrixCols(byte[] ptr);

	public static native int TPublicType_getMatrixRows(byte[] ptr);

	public static native boolean TPublicType_getCoopmat(byte[] ptr);

	public static native byte[] TPublicType_getArraySizes(byte[] ptr);

	public static native byte[] TPublicType_getUserDef(byte[] ptr);

	public static native byte[] TPublicType_getLoc(byte[] ptr);

	public static native byte[] TPublicType_getTypeParameters(byte[] ptr);

	public static native byte[] TSampler();

	public static native boolean TSampler_is1D(byte[] ptr);

	public static native boolean TSampler_isBuffer(byte[] ptr);

	public static native boolean TSampler_isRect(byte[] ptr);

	public static native boolean TSampler_isSubpass(byte[] ptr);

	public static native boolean TSampler_isCombined(byte[] ptr);

	public static native boolean TSampler_isImage(byte[] ptr);

	public static native boolean TSampler_isImageClass(byte[] ptr);

	public static native boolean TSampler_isMultiSample(byte[] ptr);

	public static native boolean TSampler_isExternal(byte[] ptr);

	public static native void TSampler_setExternal(byte[] ptr, boolean e);

	public static native boolean TSampler_isYuv(byte[] ptr);

	public static native boolean TSampler_isTexture(byte[] ptr);

	public static native boolean TSampler_isPureSampler(byte[] ptr);

	public static native void TSampler_setCombined(byte[] ptr, boolean c);

	public static void TSampler_setBasicType(byte[] ptr, TBasicType t) {
		TSampler_setBasicType(ptr, t.getConstant());
	}

	public static native void TSampler_setBasicType(byte[] ptr, int t);

	public static native int TSampler_getBasicType(byte[] ptr);

	public static native boolean TSampler_isShadow(byte[] ptr);

	public static native boolean TSampler_isArrayed(byte[] ptr);

	public static native void TSampler_clear(byte[] ptr);

	public static void TSampler_set(byte[] ptr, TBasicType t, TSamplerDim d) {
		TSampler_set(ptr, t.getConstant(), d.getConstant(), false, false, false);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, TSamplerDim d, boolean a) {
		TSampler_set(ptr, t.getConstant(), d.getConstant(), a, false, false);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, TSamplerDim d, boolean a, boolean s) {
		TSampler_set(ptr, t.getConstant(), d.getConstant(), a, s, false);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, TSamplerDim d, boolean a, boolean s, boolean m) {
		TSampler_set(ptr, t.getConstant(), d.getConstant(), a, s, m);
	}

	public static void TSampler_set(byte[] ptr, int t, TSamplerDim d) {
		TSampler_set(ptr, t, d.getConstant(), false, false, false);
	}

	public static void TSampler_set(byte[] ptr, int t, TSamplerDim d, boolean a) {
		TSampler_set(ptr, t, d.getConstant(), a, false, false);
	}

	public static void TSampler_set(byte[] ptr, int t, TSamplerDim d, boolean a, boolean s) {
		TSampler_set(ptr, t, d.getConstant(), a, s, false);
	}

	public static void TSampler_set(byte[] ptr, int t, TSamplerDim d, boolean a, boolean s, boolean m) {
		TSampler_set(ptr, t, d.getConstant(), a, s, m);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, int d) {
		TSampler_set(ptr, t.getConstant(), d, false, false, false);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, int d, boolean a) {
		TSampler_set(ptr, t.getConstant(), d, a, false, false);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, int d, boolean a, boolean s) {
		TSampler_set(ptr, t.getConstant(), d, a, s, false);
	}

	public static void TSampler_set(byte[] ptr, TBasicType t, int d, boolean a, boolean s, boolean m) {
		TSampler_set(ptr, t.getConstant(), d, a, s, m);
	}

	public static void TSampler_set(byte[] ptr, int t, int d) {
		TSampler_set(ptr, t, d, false, false, false);
	}

	public static void TSampler_set(byte[] ptr, int t, int d, boolean a) {
		TSampler_set(ptr, t, d, a, false, false);
	}

	public static void TSampler_set(byte[] ptr, int t, int d, boolean a, boolean s) {
		TSampler_set(ptr, t, d, a, s, false);
	}

	public static native void TSampler_set(byte[] ptr, int t, int d, boolean a, boolean s, boolean m);

	public static void TSampler_setImage(byte[] ptr, TBasicType t, TSamplerDim d) {
		TSampler_setImage(ptr, t.getConstant(), d.getConstant(), false, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, TSamplerDim d, boolean a) {
		TSampler_setImage(ptr, t.getConstant(), d.getConstant(), a, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, TSamplerDim d, boolean a, boolean s) {
		TSampler_setImage(ptr, t.getConstant(), d.getConstant(), a, s, false);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, TSamplerDim d, boolean a, boolean s, boolean m) {
		TSampler_setImage(ptr, t.getConstant(), d.getConstant(), a, s, m);
	}

	public static void TSampler_setImage(byte[] ptr, int t, TSamplerDim d) {
		TSampler_setImage(ptr, t, d.getConstant(), false, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, int t, TSamplerDim d, boolean a) {
		TSampler_setImage(ptr, t, d.getConstant(), a, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, int t, TSamplerDim d, boolean a, boolean s) {
		TSampler_setImage(ptr, t, d.getConstant(), a, s, false);
	}

	public static void TSampler_setImage(byte[] ptr, int t, TSamplerDim d, boolean a, boolean s, boolean m) {
		TSampler_setImage(ptr, t, d.getConstant(), a, s, m);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, int d) {
		TSampler_setImage(ptr, t.getConstant(), d, false, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, int d, boolean a) {
		TSampler_setImage(ptr, t.getConstant(), d, a, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, int d, boolean a, boolean s) {
		TSampler_setImage(ptr, t.getConstant(), d, a, s, false);
	}

	public static void TSampler_setImage(byte[] ptr, TBasicType t, int d, boolean a, boolean s, boolean m) {
		TSampler_setImage(ptr, t.getConstant(), d, a, s, m);
	}

	public static void TSampler_setImage(byte[] ptr, int t, int d) {
		TSampler_setImage(ptr, t, d, false, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, int t, int d, boolean a) {
		TSampler_setImage(ptr, t, d, a, false, false);
	}

	public static void TSampler_setImage(byte[] ptr, int t, int d, boolean a, boolean s) {
		TSampler_setImage(ptr, t, d, a, s, false);
	}

	public static native void TSampler_setImage(byte[] ptr, int t, int d, boolean a, boolean s, boolean m);

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, TSamplerDim d) {
		TSampler_setTexture(ptr, t.getConstant(), d.getConstant(), false, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, TSamplerDim d, boolean a) {
		TSampler_setTexture(ptr, t.getConstant(), d.getConstant(), a, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, TSamplerDim d, boolean a, boolean s) {
		TSampler_setTexture(ptr, t.getConstant(), d.getConstant(), a, s, false);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, TSamplerDim d, boolean a, boolean s, boolean m) {
		TSampler_setTexture(ptr, t.getConstant(), d.getConstant(), a, s, m);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, TSamplerDim d) {
		TSampler_setTexture(ptr, t, d.getConstant(), false, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, TSamplerDim d, boolean a) {
		TSampler_setTexture(ptr, t, d.getConstant(), a, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, TSamplerDim d, boolean a, boolean s) {
		TSampler_setTexture(ptr, t, d.getConstant(), a, s, false);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, TSamplerDim d, boolean a, boolean s, boolean m) {
		TSampler_setTexture(ptr, t, d.getConstant(), a, s, m);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, int d) {
		TSampler_setTexture(ptr, t.getConstant(), d, false, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, int d, boolean a) {
		TSampler_setTexture(ptr, t.getConstant(), d, a, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, int d, boolean a, boolean s) {
		TSampler_setTexture(ptr, t.getConstant(), d, a, s, false);
	}

	public static void TSampler_setTexture(byte[] ptr, TBasicType t, int d, boolean a, boolean s, boolean m) {
		TSampler_setTexture(ptr, t.getConstant(), d, a, s, m);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, int d) {
		TSampler_setTexture(ptr, t, d, false, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, int d, boolean a) {
		TSampler_setTexture(ptr, t, d, a, false, false);
	}

	public static void TSampler_setTexture(byte[] ptr, int t, int d, boolean a, boolean s) {
		TSampler_setTexture(ptr, t, d, a, s, false);
	}

	public static native void TSampler_setTexture(byte[] ptr, int t, int d, boolean a, boolean s, boolean m);

	public static native void TSampler_setPureSampler(byte[] ptr, boolean s);

	public static void TSampler_setSubpass(byte[] ptr, TBasicType t) {
		TSampler_setSubpass(ptr, t.getConstant(), false);
	}

	public static void TSampler_setSubpass(byte[] ptr, TBasicType t, boolean m) {
		TSampler_setSubpass(ptr, t.getConstant(), m);
	}

	public static void TSampler_setSubpass(byte[] ptr, int t) {
		TSampler_setSubpass(ptr, t, false);
	}

	public static native void TSampler_setSubpass(byte[] ptr, int t, boolean m);

	public static native void TSampler_setArrayed(byte[] ptr, boolean c);

	public static native void TSampler_setShadow(byte[] ptr, boolean c);

	public static native void TSampler_setMs(byte[] ptr, boolean c);

	public static native void TSampler_setImage(byte[] ptr, boolean c);

	public static native void TSampler_setSampler(byte[] ptr, boolean c);

	public static native void TSampler_setYuv(byte[] ptr, boolean c);

	public static native void TSampler_setDim(byte[] ptr, int c);

	public static native void TSampler_setVectorSize(byte[] ptr, long c);

	public static native void TSampler_setStructReturnIndex(byte[] ptr, long c);

	public static native int TSampler_getDim(byte[] ptr);

	public static native long TSampler_getStructReturnIndex(byte[] ptr);

	public static native long TSampler_getVectorSize(byte[] ptr);

	public static native long TSampler_getStructReturnIndexBits();

	public static native long TSampler_getStructReturnSlots();

	public static native long TSampler_getNoReturnStruct();

	public static native boolean TSampler_operatorEqual(byte[] ptr, byte[] right);

	public static native boolean TSampler_operatorNotEqual(byte[] ptr, byte[] right);

	public static native byte[] TTypeLoc();

	public static native byte[] TTypeLoc(byte[] type, byte[] loc);

	public static native void TTypeLoc_setType(byte[] ptr, byte[] type);

	public static native void TTypeLoc_setLoc(byte[] ptr, byte[] loc);

	public static native byte[] TTypeLoc_getType(byte[] ptr);

	public static native byte[] TTypeLoc_getLoc(byte[] ptr);

	public static native byte[] TArraySizes();

	public static native int TArraySizes_getNumDims(byte[] ptr);

	public static native int TArraySizes_getDimSize(byte[] ptr, int dim);

	public static native byte[] TArraySizes_getDimNode(byte[] ptr, int dim);

	public static native void TArraySizes_setDimSize(byte[] ptr, int dim, int size);

	public static native int TArraySizes_getOuterSize(byte[] ptr);

	public static native byte[] TArraySizes_getOuterNode(byte[] ptr);

	public static native int TArraySizes_getCumulativeSize(byte[] ptr);

	public static native void TArraySizes_addInnerSize(byte[] ptr);

	public static native void TArraySizes_addInnerSize(byte[] ptr, int s);

	public static native void TArraySizes_addInnerSize(byte[] ptr, int s, byte[] n);

	public static native void TArraySizes_addInnerSize(byte[] ptr, byte[] pair);

	public static native void TArraySizes_addInnerSizes(byte[] ptr, byte[] s);

	public static native void TArraySizes_changeOuterSize(byte[] ptr, int s);

	public static native int TArraySizes_getImplicitSize(byte[] ptr);

	public static native void TArraySizes_updateImplicitSize(byte[] ptr, int s);

	public static native boolean TArraySizes_isInnerUnsized(byte[] ptr);

	public static native boolean TArraySizes_clearInnerUnsized(byte[] ptr);

	public static native boolean TArraySizes_isInnerSpecialization(byte[] ptr);

	public static native boolean TArraySizes_isOuterSpecialization(byte[] ptr);

	public static native boolean TArraySizes_hasUnsized(byte[] ptr);

	public static native boolean TArraySizes_isSized(byte[] ptr);

	public static native void TArraySizes_dereference(byte[] ptr);

	public static native void TArraySizes_copyDereferenced(byte[] ptr, byte[] rhs);

	public static native boolean TArraySizes_sameInnerArrayness(byte[] ptr, byte[] rhs);

	public static native void TArraySizes_setVariablyIndexed(byte[] ptr);

	public static native boolean TArraySizes_isVariablyIndexed(byte[] ptr);

	public static native byte[] TArraySizes_operatorAssign(byte[] ptr, byte[] from);

	public static native boolean TArraySizes_operatorEqual(byte[] ptr, byte[] rhs);

	public static native boolean TArraySizes_operatorNotEqual(byte[] ptr, byte[] rhs);

	public static native byte[] TArraySize();

	public static native byte[] TArraySize(long size, byte[] node);

	public static native void TArraySize_setSize(byte[] ptr, long v);

	public static native void TArraySize_setNode(byte[] ptr, byte[] v);

	public static native long TArraySize_getSize(byte[] ptr);

	public static native byte[] TArraySize_getNode(byte[] ptr);

	public static native boolean TArraySize_operatorEqual(byte[] ptr, byte[] rhs);

	public static native byte[] TIntermNode_getLoc(byte[] ptr);

	public static native void TIntermNode_setLoc(byte[] ptr, byte[] l);

	public static native void TIntermNode_traverse(byte[] ptr, byte[] traverser);

	public static native byte[] TIntermNode_getAsTyped(byte[] ptr);

	public static native byte[] TIntermNode_getAsOperator(byte[] ptr);

	public static native byte[] TIntermNode_getAsConstantUnion(byte[] ptr);

	public static native byte[] TIntermNode_getAsAggregate(byte[] ptr);

	public static native byte[] TIntermNode_getAsUnaryNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsBinaryNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsSelectionNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsSwitchNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsMethodNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsSymbolNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsBranchNode(byte[] ptr);

	public static native byte[] TIntermNode_getAsLoopNode(byte[] ptr);

	public static native byte[] TIntermLoop(byte[] aBody, byte[] aTest, byte[] aTerminal, boolean testFirst);

	public static native byte[] TIntermLoop_getAsLoopNode(byte[] ptr);

	public static native void TIntermLoop_traverse(byte[] ptr, byte[] traverser);

	public static native byte[] TIntermLoop_getBody(byte[] ptr);

	public static native byte[] TIntermLoop_getTest(byte[] ptr);

	public static native byte[] TIntermLoop_getTerminal(byte[] ptr);

	public static native boolean TIntermLoop_testFirst(byte[] ptr);

	public static native void TIntermLoop_setUnroll(byte[] ptr);

	public static native void TIntermLoop_setDontUnroll(byte[] ptr);

	public static native boolean TIntermLoop_getUnroll(byte[] ptr);

	public static native boolean TIntermLoop_getDontUnroll(byte[] ptr);

	public static native void TIntermLoop_setLoopDependency(byte[] ptr, int d);

	public static native int TIntermLoop_getLoopDependency(byte[] ptr);

	public static native void TIntermLoop_setMinIterations(byte[] ptr, long v);

	public static native long TIntermLoop_getMinIterations(byte[] ptr);

	public static native void TIntermLoop_setMaxIterations(byte[] ptr, long v);

	public static native long TIntermLoop_getMaxIterations(byte[] ptr);

	public static native void TIntermLoop_setIterationMultiple(byte[] ptr, long v);

	public static native long TIntermLoop_getIterationMultiple(byte[] ptr);

	public static native void TIntermLoop_setPeelCount(byte[] ptr, long v);

	public static native long TIntermLoop_getPeelCount(byte[] ptr);

	public static native void TIntermLoop_setPartialCount(byte[] ptr, long v);

	public static native long TIntermLoop_getPartialCount(byte[] ptr);

	public static byte[] TIntermBranch(TOperator op, byte[] e) {
		return TIntermBranch(op.getConstant(), e);
	}

	public static native byte[] TIntermBranch(int op, byte[] e);

	public static native byte[] TIntermBranch_getAsBranchNode(byte[] ptr);

	public static native void TIntermBranch_traverse(byte[] ptr, byte[] traverser);

	public static native int TIntermBranch_getFlowOp(byte[] ptr);

	public static native byte[] TIntermBranch_getExpression(byte[] ptr);

	public static native void TIntermBranch_setExpression(byte[] ptr, byte[] pExpression);

	public static void TIntermBranch_updatePrecision(byte[] ptr, TPrecisionQualifier parentPrecision) {
		TIntermBranch_updatePrecision(ptr, parentPrecision.getConstant());
	}

	public static native void TIntermBranch_updatePrecision(byte[] ptr, int parentPrecision);

	public static native byte[] TIntermConstantUnion(byte[] ua, byte[] t);

	public static native byte[] TIntermConstantUnion_getConstArray(byte[] ptr);

	public static native byte[] TIntermConstantUnion_getAsConstantUnion(byte[] ptr);

	public static native void TIntermConstantUnion_traverse(byte[] ptr, byte[] traverser);

	public static byte[] TIntermConstantUnion_foldTyped(byte[] ptr, TOperator op, byte[] node) {
		return TIntermConstantUnion_foldTyped(ptr, op.getConstant(), node);
	}

	public static native byte[] TIntermConstantUnion_foldTyped(byte[] ptr, int op, byte[] node);

	public static byte[] TIntermConstantUnion_fold(byte[] ptr, TOperator op, byte[] t) {
		return TIntermConstantUnion_fold(ptr, op.getConstant(), t);
	}

	public static native byte[] TIntermConstantUnion_fold(byte[] ptr, int op, byte[] t);

	public static native void TIntermConstantUnion_setLiteral(byte[] ptr);

	public static native void TIntermConstantUnion_setExpression(byte[] ptr);

	public static native boolean TIntermConstantUnion_isLiteral(byte[] ptr);

	public static native byte[] TIntermSelection(byte[] cond, byte[] trueB, byte[] falseB);

	public static native byte[] TIntermSelection(byte[] cond, byte[] trueB, byte[] falseB, byte[] type);

	public static native void TIntermSelection_traverse(byte[] ptr, byte[] traverser);

	public static native byte[] TIntermSelection_getCondition(byte[] ptr);

	public static native byte[] TIntermSelection_getTrueBlock(byte[] ptr);

	public static native byte[] TIntermSelection_getFalseBlock(byte[] ptr);

	public static native byte[] TIntermSelection_getAsSelectionNode(byte[] ptr);

	public static native void TIntermSelection_setNoShortCircuit(byte[] ptr);

	public static native boolean TIntermSelection_getShortCircuit(byte[] ptr);

	public static native void TIntermSelection_setFlatten(byte[] ptr);

	public static native void TIntermSelection_setDontFlatten(byte[] ptr);

	public static native boolean TIntermSelection_getFlatten(byte[] ptr);

	public static native boolean TIntermSelection_getDontFlatten(byte[] ptr);

	public static native byte[] TIntermSwitch(byte[] cond, byte[] b);

	public static native void TIntermSwitch_traverse(byte[] ptr, byte[] traverser);

	public static native byte[] TIntermSwitch_getCondition(byte[] ptr);

	public static native byte[] TIntermSwitch_getBody(byte[] ptr);

	public static native byte[] TIntermSwitch_getAsSwitchNode(byte[] ptr);

	public static native void TIntermSwitch_setFlatten(byte[] ptr);

	public static native void TIntermSwitch_setDontFlatten(byte[] ptr);

	public static native boolean TIntermSwitch_getFlatten(byte[] ptr);

	public static native boolean TIntermSwitch_getDontFlatten(byte[] ptr);

	public static native byte[] TIntermMethod(byte[] o, byte[] t, String m);

	public static native byte[] TIntermMethod_getAsMethodNode(byte[] ptr);

	public static native String TIntermMethod_getMethodName(byte[] ptr);

	public static native byte[] TIntermMethod_getObject(byte[] ptr);

	public static native void TIntermMethod_traverse(byte[] ptr, byte[] traverser);

	public static native byte[] TIntermAggregate();

	public static byte[] TIntermAggregate(TOperator o) {
		return TIntermAggregate(o.getConstant());
	}

	public static native byte[] TIntermAggregate(int o);

	public static native byte[] TIntermAggregate_getAsAggregate(byte[] ptr);

	public static void TIntermAggregate_setOperator(byte[] ptr, TOperator o) {
		TIntermAggregate_setOperator(ptr, o.getConstant());
	}

	public static native void TIntermAggregate_setOperator(byte[] ptr, int o);

	public static native byte[] TIntermAggregate_getSequence(byte[] ptr);

	public static native void TIntermAggregate_setName(byte[] ptr, String n);

	public static native String TIntermAggregate_getName(byte[] ptr);

	public static native void TIntermAggregate_traverse(byte[] ptr, byte[] traverser);

	public static native void TIntermAggregate_setUserDefined(byte[] ptr);

	public static native boolean TIntermAggregate_isUserDefined(byte[] ptr);

	public static native int[] TIntermAggregate_getQualifierList(byte[] ptr);

	public static native void TIntermAggregate_setOptimize(byte[] ptr, boolean o);

	public static native void TIntermAggregate_setDebug(byte[] ptr, boolean d);

	public static native boolean TIntermAggregate_getOptimize(byte[] ptr);

	public static native boolean TIntermAggregate_getDebug(byte[] ptr);

	public static native void TIntermAggregate_setPragmaTable(byte[] ptr, byte[] pTable);

	public static native byte[] TIntermAggregate_getPragmaTable(byte[] ptr);

	public static native byte[] TIntermOperator_getAsOperator(byte[] ptr);

	public static native int TIntermOperator_getOp(byte[] ptr);

	public static void TIntermOperator_setOp(byte[] ptr, TOperator newOp) {
		TIntermOperator_setOp(ptr, newOp.getConstant());
	}

	public static native void TIntermOperator_setOp(byte[] ptr, int newOp);

	public static native boolean TIntermOperator_modifiesState(byte[] ptr);

	public static native boolean TIntermOperator_isConstructor(byte[] ptr);

	public static native boolean TIntermOperator_isTexture(byte[] ptr);

	public static native boolean TIntermOperator_isSampling(byte[] ptr);

	public static native boolean TIntermOperator_isImage(byte[] ptr);

	public static native boolean TIntermOperator_isSparseTexture(byte[] ptr);

	public static native boolean TIntermOperator_isImageFootprint(byte[] ptr);

	public static native boolean TIntermOperator_isSparseImage(byte[] ptr);

	public static native boolean TIntermOperator_isSubgroup(byte[] ptr);

	public static void TIntermOperator_setOperationPrecision(byte[] ptr, TPrecisionQualifier p) {
		TIntermOperator_setOperationPrecision(ptr, p.getConstant());
	}

	public static native void TIntermOperator_setOperationPrecision(byte[] ptr, int p);

	public static native int TIntermOperator_getOperationPrecision(byte[] ptr);

	public static native String TIntermOperator_getCompleteString(byte[] ptr);

	public static native void TIntermOperator_crackTexture(byte[] ptr, byte[] sampler, byte[] cracked);

	public static byte[] TIntermBinary(TOperator o) {
		return TIntermBinary(o.getConstant());
	}

	public static native byte[] TIntermBinary(int o);

	public static native void TIntermBinary_traverse(byte[] ptr, byte[] traverser);

	public static native void TIntermBinary_setLeft(byte[] ptr, byte[] n);

	public static native void TIntermBinary_setRight(byte[] ptr, byte[] n);

	public static native byte[] TIntermBinary_getLeft(byte[] ptr);

	public static native byte[] TIntermBinary_getRight(byte[] ptr);

	public static native byte[] TIntermBinary_getAsBinaryNode(byte[] ptr);

	public static native void TIntermBinary_updatePrecision(byte[] ptr);

	public static byte[] TIntermUnary(TOperator o, byte[] t) {
		return TIntermUnary(o.getConstant(), t);
	}

	public static native byte[] TIntermUnary(int o, byte[] t);

	public static byte[] TIntermUnary(TOperator o) {
		return TIntermUnary(o.getConstant());
	}

	public static native byte[] TIntermUnary(int o);

	public static native void TIntermUnary_traverse(byte[] ptr, byte[] traverser);

	public static native void TIntermUnary_setOperand(byte[] ptr, byte[] o);

	public static native byte[] TIntermUnary_getOperand(byte[] ptr);

	public static native byte[] TIntermUnary_getAsUnaryNode(byte[] ptr);

	public static native void TIntermUnary_updatePrecision(byte[] ptr);

	public static native byte[] TIntermNodePair(byte[] node1, byte[] node2);

	public static native byte[] TIntermNodePair();

	public static native void TIntermNodePair_setNode1(byte[] ptr, byte[] v);

	public static native void TIntermNodePair_setNode2(byte[] ptr, byte[] v);

	public static native byte[] TIntermNodePair_getNode1(byte[] ptr);

	public static native byte[] TIntermNodePair_getNode2(byte[] ptr);

	public static native byte[] TPragmaTable();

	public static native byte[] TCrackedTextureOp();

	public static native byte[] TCrackedTextureOp(boolean query, boolean proj, boolean lod, boolean fetch,
			boolean offset, boolean offsets, boolean gather, boolean grad, boolean subpass, boolean lodClamp,
			boolean fragMask);

	public static native void TCrackedTextureOp_setQuery(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setProj(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setLod(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setFetch(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setOffset(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setOffsets(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setGather(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setGrad(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setSubpass(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setLodClamp(byte[] ptr, boolean v);

	public static native void TCrackedTextureOp_setFragMask(byte[] ptr, boolean v);

	public static native boolean TCrackedTextureOp_getQuery(byte[] ptr);

	public static native boolean TCrackedTextureOp_getProj(byte[] ptr);

	public static native boolean TCrackedTextureOp_getLod(byte[] ptr);

	public static native boolean TCrackedTextureOp_getFetch(byte[] ptr);

	public static native boolean TCrackedTextureOp_getOffset(byte[] ptr);

	public static native boolean TCrackedTextureOp_getOffsets(byte[] ptr);

	public static native boolean TCrackedTextureOp_getGather(byte[] ptr);

	public static native boolean TCrackedTextureOp_getGrad(byte[] ptr);

	public static native boolean TCrackedTextureOp_getSubpass(byte[] ptr);

	public static native boolean TCrackedTextureOp_getLodClamp(byte[] ptr);

	public static native boolean TCrackedTextureOp_getFragMask(byte[] ptr);

	public static native byte[] TSwizzleSelectors();

	public static native void TSwizzleSelectors_push_back(byte[] ptr, byte[] comp);

	public static native void TSwizzleSelectors_resize(byte[] ptr, int s);

	public static native int TSwizzleSelectors_size(byte[] ptr);

	public static native byte[] TSwizzleSelectors_operatorAt(byte[] ptr, int i);

	public static native byte[] TSwizzleSelectorsInt();

	public static native void TSwizzleSelectorsInt_push_back(byte[] ptr, int comp);

	public static native void TSwizzleSelectorsInt_resize(byte[] ptr, int s);

	public static native int TSwizzleSelectorsInt_size(byte[] ptr);

	public static native int TSwizzleSelectorsInt_operatorAt(byte[] ptr, int i);

	public static native byte[] TSymbolTable();

	public static native void TSymbolTable_adoptLevels(byte[] ptr, byte[] symTable);

	public static native boolean TSymbolTable_isEmpty(byte[] ptr);

	public static native boolean TSymbolTable_atBuiltInLevel(byte[] ptr);

	public static native boolean TSymbolTable_atGlobalLevel(byte[] ptr);

	public static native void TSymbolTable_setNoBuiltInRedeclarations(byte[] ptr);

	public static native void TSymbolTable_setSeparateNameSpaces(byte[] ptr);

	public static native void TSymbolTable_push(byte[] ptr);

	public static native void TSymbolTable_pushThis(byte[] ptr, byte[] thisSymbol);

	public static void TSymbolTable_pop(byte[] ptr, TPrecisionQualifier p) {
		TSymbolTable_pop(ptr, p.getConstant());
	}

	public static native void TSymbolTable_pop(byte[] ptr, int p);

	public static native boolean TSymbolTable_insert(byte[] ptr, byte[] symbol);

	public static native boolean TSymbolTable_amend(byte[] ptr, byte[] symbol, int firstNewMember);

	public static native void TSymbolTable_makeInternalVariable(byte[] ptr, byte[] symbol);

	public static native byte[] TSymbolTable_copyUpDeferredInsert(byte[] ptr, byte[] shared);

	public static native byte[] TSymbolTable_copyUp(byte[] ptr, byte[] shared);

	public static byte[] TSymbolTable_find(byte[] ptr, String name) {
		return TSymbolTable_find(ptr, name, false, false, 0);
	}

	public static byte[] TSymbolTable_find(byte[] ptr, String name, boolean builtIn) {
		return TSymbolTable_find(ptr, name, builtIn, false, 0);
	}

	public static byte[] TSymbolTable_find(byte[] ptr, String name, boolean builtIn, boolean currentScope) {
		return TSymbolTable_find(ptr, name, builtIn, currentScope, 0);
	}

	public static native byte[] TSymbolTable_find(byte[] ptr, String name, boolean builtIn, boolean currentScope,
			int thisDepthP);

	public static native byte[] TSymbolTable_find(byte[] ptr, String name, int thisDepth);

	public static native boolean TSymbolTable_isFunctionNameVariable(byte[] ptr, String name);

	public static native void TSymbolTable_findFunctionNameList(byte[] ptr, String name, byte[] list, boolean builtIn);

	public static void TSymbolTable_relateToOperator(byte[] ptr, String name, TOperator op) {
		TSymbolTable_relateToOperator(ptr, name, op.getConstant());
	}

	public static native void TSymbolTable_relateToOperator(byte[] ptr, String name, int op);

	public static native void TSymbolTable_setFunctionExtensions(byte[] ptr, String name, String[] extensions);

	public static native void TSymbolTable_setVariableExtensions(byte[] ptr, String name, String[] extensions);

	public static native void TSymbolTable_setVariableExtensions(byte[] ptr, String blockName, String name,
			String[] extensions);

	public static native int TSymbolTable_getMaxSymbolId(byte[] ptr);

	public static void TSymbolTable_dump(byte[] ptr, byte[] infoSink) {
		TSymbolTable_dump(ptr, infoSink, false);
	}

	public static native void TSymbolTable_dump(byte[] ptr, byte[] infoSink, boolean complete);

	public static native void TSymbolTable_copyTable(byte[] ptr, byte[] copyOf);

	public static void TSymbolTable_setPreviousDefaultPrecisions(byte[] ptr, TPrecisionQualifier p) {
		TSymbolTable_setPreviousDefaultPrecisions(ptr, p.getConstant());
	}

	public static native void TSymbolTable_setPreviousDefaultPrecisions(byte[] ptr, int p);

	public static native void TSymbolTable_readOnly(byte[] ptr);

	public static native byte[] TQualifier();

	public static native void TQualifier_clear(byte[] ptr);

	public static native void TQualifier_makeTemporary(byte[] ptr);

	public static native void TQualifier_clearInterstage(byte[] ptr);

	public static native void TQualifier_clearInterpolation(byte[] ptr);

	public static native void TQualifier_clearMemory(byte[] ptr);

	public static native boolean TQualifier_isWriteOnly(byte[] ptr);

	public static native boolean TQualifier_isReadOnly(byte[] ptr);

	public static native boolean TQualifier_isRestrict(byte[] ptr);

	public static native boolean TQualifier_isCoherent(byte[] ptr);

	public static native boolean TQualifier_isVolatile(byte[] ptr);

	public static native boolean TQualifier_isSample(byte[] ptr);

	public static native boolean TQualifier_isMemory(byte[] ptr);

	public static native boolean TQualifier_isMemoryQualifierImageAndSSBOOnly(byte[] ptr);

	public static native boolean TQualifier_bufferReferenceNeedsVulkanMemoryModel(byte[] ptr);

	public static native boolean TQualifier_isInterpolation(byte[] ptr);

	public static native boolean TQualifier_isExplicitInterpolation(byte[] ptr);

	public static native boolean TQualifier_isAuxiliary(byte[] ptr);

	public static native boolean TQualifier_isPatch(byte[] ptr);

	public static native boolean TQualifier_isNoContraction(byte[] ptr);

	public static native void TQualifier_setNoContraction(byte[] ptr);

	public static native boolean TQualifier_isPervertexNV(byte[] ptr);

	public static native boolean TQualifier_isPipeInput(byte[] ptr);

	public static native boolean TQualifier_isPipeOutput(byte[] ptr);

	public static native boolean TQualifier_isParamInput(byte[] ptr);

	public static native boolean TQualifier_isParamOutput(byte[] ptr);

	public static native boolean TQualifier_isUniformOrBuffer(byte[] ptr);

	public static native boolean TQualifier_isIo(byte[] ptr);

	public static native boolean TQualifier_isLinkable(byte[] ptr);

	public static native boolean TQualifier_isPerPrimitive(byte[] ptr);

	public static native boolean TQualifier_isPerView(byte[] ptr);

	public static native boolean TQualifier_isTaskMemory(byte[] ptr);

	public static boolean TQualifier_isArrayedIo(byte[] ptr, EShLanguage language) {
		return TQualifier_isArrayedIo(ptr, language.getConstant());
	}

	public static native boolean TQualifier_isArrayedIo(byte[] ptr, int language);

	public static native void TQualifier_clearLayout(byte[] ptr);

	public static native void TQualifier_clearInterstageLayout(byte[] ptr);

	public static native void TQualifier_clearStreamLayout(byte[] ptr);

	public static native void TQualifier_clearXfbLayout(byte[] ptr);

	public static native boolean TQualifier_hasNonXfbLayout(byte[] ptr);

	public static native boolean TQualifier_hasLayout(byte[] ptr);

	public static native boolean TQualifier_hasUniformLayout(byte[] ptr);

	public static native void TQualifier_clearUniformLayout(byte[] ptr);

	public static native boolean TQualifier_hasMatrix(byte[] ptr);

	public static native boolean TQualifier_hasPacking(byte[] ptr);

	public static native boolean TQualifier_hasAlign(byte[] ptr);

	public static native boolean TQualifier_hasAnyLocation(byte[] ptr);

	public static native boolean TQualifier_hasLocation(byte[] ptr);

	public static native boolean TQualifier_hasSet(byte[] ptr);

	public static native boolean TQualifier_hasBinding(byte[] ptr);

	public static native boolean TQualifier_hasOffset(byte[] ptr);

	public static native boolean TQualifier_isNonPerspective(byte[] ptr);

	public static native boolean TQualifier_hasIndex(byte[] ptr);

	public static native long TQualifier_getIndex(byte[] ptr);

	public static native boolean TQualifier_hasComponent(byte[] ptr);

	public static native boolean TQualifier_hasStream(byte[] ptr);

	public static native boolean TQualifier_hasFormat(byte[] ptr);

	public static native boolean TQualifier_hasXfb(byte[] ptr);

	public static native boolean TQualifier_hasXfbBuffer(byte[] ptr);

	public static native boolean TQualifier_hasXfbStride(byte[] ptr);

	public static native boolean TQualifier_hasXfbOffset(byte[] ptr);

	public static native boolean TQualifier_hasAttachment(byte[] ptr);

	public static native int TQualifier_getFormat(byte[] ptr);

	public static native boolean TQualifier_isPushConstant(byte[] ptr);

	public static native boolean TQualifier_isShaderRecord(byte[] ptr);

	public static native boolean TQualifier_hasBufferReference(byte[] ptr);

	public static native boolean TQualifier_hasBufferReferenceAlign(byte[] ptr);

	public static native boolean TQualifier_isNonUniform(byte[] ptr);

	public static native boolean TQualifier_hasSpecConstantId(byte[] ptr);

	public static native boolean TQualifier_isSpecConstant(byte[] ptr);

	public static native boolean TQualifier_isFrontEndConstant(byte[] ptr);

	public static native boolean TQualifier_isConstant(byte[] ptr);

	public static native void TQualifier_makeSpecConstant(byte[] ptr);

	public static native void TQualifier_setSemanticName(byte[] ptr, String v);

	public static native void TQualifier_setStorage(byte[] ptr, int v);

	public static native void TQualifier_setBuiltIn(byte[] ptr, int v);

	public static native void TQualifier_setDeclaredBuiltIn(byte[] ptr, int v);

	public static native void TQualifier_setPrecision(byte[] ptr, int v);

	public static native void TQualifier_setInvariant(byte[] ptr, boolean v);

	public static native void TQualifier_setCentroid(byte[] ptr, boolean v);

	public static native void TQualifier_setSmooth(byte[] ptr, boolean v);

	public static native void TQualifier_setFlat(byte[] ptr, boolean v);

	public static native void TQualifier_setSpecConstant(byte[] ptr, boolean v);

	public static native void TQualifier_setNonUniform(byte[] ptr, boolean v);

	public static native void TQualifier_setExplicitOffset(byte[] ptr, boolean v);

	public static native void TQualifier_setNopersp(byte[] ptr, boolean v);

	public static native void TQualifier_setExplicitInterp(byte[] ptr, boolean v);

	public static native void TQualifier_setPervertexNV(byte[] ptr, boolean v);

	public static native void TQualifier_setPerPrimitiveNV(byte[] ptr, boolean v);

	public static native void TQualifier_setPerViewNV(byte[] ptr, boolean v);

	public static native void TQualifier_setPerTaskNV(byte[] ptr, boolean v);

	public static native void TQualifier_setPatch(byte[] ptr, boolean v);

	public static native void TQualifier_setSample(byte[] ptr, boolean v);

	public static native void TQualifier_setRestrict(byte[] ptr, boolean v);

	public static native void TQualifier_setReadonly(byte[] ptr, boolean v);

	public static native void TQualifier_setWriteonly(byte[] ptr, boolean v);

	public static native void TQualifier_setCoherent(byte[] ptr, boolean v);

	public static native void TQualifier_setVolatil(byte[] ptr, boolean v);

	public static native void TQualifier_setDevicecoherent(byte[] ptr, boolean v);

	public static native void TQualifier_setQueuefamilycoherent(byte[] ptr, boolean v);

	public static native void TQualifier_setWorkgroupcoherent(byte[] ptr, boolean v);

	public static native void TQualifier_setSubgroupcoherent(byte[] ptr, boolean v);

	public static native void TQualifier_setShadercallcoherent(byte[] ptr, boolean v);

	public static native void TQualifier_setNonprivate(byte[] ptr, boolean v);

	public static native void TQualifier_setLayoutMatrix(byte[] ptr, int v);

	public static native void TQualifier_setLayoutPacking(byte[] ptr, int v);

	public static native void TQualifier_setLayoutOffset(byte[] ptr, int v);

	public static native void TQualifier_setLayoutAlign(byte[] ptr, int v);

	public static native void TQualifier_setLayoutLocation(byte[] ptr, long v);

	public static native void TQualifier_setLayoutComponent(byte[] ptr, long v);

	public static native void TQualifier_setLayoutSet(byte[] ptr, long v);

	public static native void TQualifier_setLayoutBinding(byte[] ptr, long v);

	public static native void TQualifier_setLayoutIndex(byte[] ptr, long v);

	public static native void TQualifier_setLayoutStream(byte[] ptr, long v);

	public static native void TQualifier_setLayoutXfbBuffer(byte[] ptr, long v);

	public static native void TQualifier_setLayoutXfbStride(byte[] ptr, long v);

	public static native void TQualifier_setLayoutXfbOffset(byte[] ptr, long v);

	public static native void TQualifier_setLayoutAttachment(byte[] ptr, long v);

	public static native void TQualifier_setLayoutSpecConstantId(byte[] ptr, long v);

	public static native void TQualifier_setLayoutBufferReferenceAlign(byte[] ptr, long v);

	public static native void TQualifier_setLayoutFormat(byte[] ptr, int v);

	public static native void TQualifier_setLayoutPushConstant(byte[] ptr, boolean v);

	public static native void TQualifier_setLayoutBufferReference(byte[] ptr, boolean v);

	public static native void TQualifier_setLayoutPassthrough(byte[] ptr, boolean v);

	public static native void TQualifier_setLayoutViewportRelative(byte[] ptr, boolean v);

	public static native void TQualifier_setLayoutSecondaryViewportRelativeOffset(byte[] ptr, int v);

	public static native void TQualifier_setLayoutShaderRecord(byte[] ptr, boolean v);

	public static native String TQualifier_getSemanticName(byte[] ptr);

	public static native int TQualifier_getStorage(byte[] ptr);

	public static native int TQualifier_getBuiltIn(byte[] ptr);

	public static native int TQualifier_getDeclaredBuiltIn(byte[] ptr);

	public static native int TQualifier_getPrecision(byte[] ptr);

	public static native boolean TQualifier_getInvariant(byte[] ptr);

	public static native boolean TQualifier_getCentroid(byte[] ptr);

	public static native boolean TQualifier_getSmooth(byte[] ptr);

	public static native boolean TQualifier_getFlat(byte[] ptr);

	public static native boolean TQualifier_getSpecConstant(byte[] ptr);

	public static native boolean TQualifier_getNonUniform(byte[] ptr);

	public static native boolean TQualifier_getExplicitOffset(byte[] ptr);

	public static native boolean TQualifier_getNoContraction(byte[] ptr);

	public static native boolean TQualifier_getNopersp(byte[] ptr);

	public static native boolean TQualifier_getExplicitInterp(byte[] ptr);

	public static native boolean TQualifier_getPervertexNV(byte[] ptr);

	public static native boolean TQualifier_getPerPrimitiveNV(byte[] ptr);

	public static native boolean TQualifier_getPerViewNV(byte[] ptr);

	public static native boolean TQualifier_getPerTaskNV(byte[] ptr);

	public static native boolean TQualifier_getPatch(byte[] ptr);

	public static native boolean TQualifier_getSample(byte[] ptr);

	public static native boolean TQualifier_getRestrict(byte[] ptr);

	public static native boolean TQualifier_getReadonly(byte[] ptr);

	public static native boolean TQualifier_getWriteonly(byte[] ptr);

	public static native boolean TQualifier_getCoherent(byte[] ptr);

	public static native boolean TQualifier_getVolatil(byte[] ptr);

	public static native boolean TQualifier_getDevicecoherent(byte[] ptr);

	public static native boolean TQualifier_getQueuefamilycoherent(byte[] ptr);

	public static native boolean TQualifier_getWorkgroupcoherent(byte[] ptr);

	public static native boolean TQualifier_getSubgroupcoherent(byte[] ptr);

	public static native boolean TQualifier_getShadercallcoherent(byte[] ptr);

	public static native boolean TQualifier_getNonprivate(byte[] ptr);

	public static native int TQualifier_getLayoutMatrix(byte[] ptr);

	public static native int TQualifier_getLayoutPacking(byte[] ptr);

	public static native int TQualifier_getLayoutOffset(byte[] ptr);

	public static native int TQualifier_getLayoutAlign(byte[] ptr);

	public static native long TQualifier_getLayoutLocation(byte[] ptr);

	public static native long TQualifier_getLayoutComponent(byte[] ptr);

	public static native long TQualifier_getLayoutSet(byte[] ptr);

	public static native long TQualifier_getLayoutBinding(byte[] ptr);

	public static native long TQualifier_getLayoutIndex(byte[] ptr);

	public static native long TQualifier_getLayoutStream(byte[] ptr);

	public static native long TQualifier_getLayoutXfbBuffer(byte[] ptr);

	public static native long TQualifier_getLayoutXfbStride(byte[] ptr);

	public static native long TQualifier_getLayoutXfbOffset(byte[] ptr);

	public static native long TQualifier_getLayoutAttachment(byte[] ptr);

	public static native long TQualifier_getLayoutSpecConstantId(byte[] ptr);

	public static native long TQualifier_getLayoutBufferReferenceAlign(byte[] ptr);

	public static native int TQualifier_getLayoutFormat(byte[] ptr);

	public static native boolean TQualifier_getLayoutPushConstant(byte[] ptr);

	public static native boolean TQualifier_getLayoutBufferReference(byte[] ptr);

	public static native boolean TQualifier_getLayoutPassthrough(byte[] ptr);

	public static native boolean TQualifier_getLayoutViewportRelative(byte[] ptr);

	public static native int TQualifier_getLayoutSecondaryViewportRelativeOffset(byte[] ptr);

	public static native boolean TQualifier_getLayoutShaderRecord(byte[] ptr);

	public static native long TQualifier_getLayoutLocationEnd();

	public static native long TQualifier_getLayoutComponentEnd();

	public static native long TQualifier_getLayoutSetEnd();

	public static native long TQualifier_getLayoutBindingEnd();

	public static native long TQualifier_getLayoutIndexEnd();

	public static native long TQualifier_getLayoutStreamEnd();

	public static native long TQualifier_getLayoutXfbBufferEnd();

	public static native long TQualifier_getLayoutXfbStrideEnd();

	public static native long TQualifier_getLayoutXfbOffsetEnd();

	public static native long TQualifier_getLayoutAttachmentEnd();

	public static native long TQualifier_getLayoutSpecConstantIdEnd();

	public static native long TQualifier_getLayoutBufferReferenceAlignEnd();

	public static String TQualifier_getLayoutPackingString(TLayoutPacking packing) {
		return TQualifier_getLayoutPackingString(packing.getConstant());
	}

	public static native String TQualifier_getLayoutPackingString(int packing);

	public static String TQualifier_getLayoutMatrixString(TLayoutMatrix m) {
		return TQualifier_getLayoutMatrixString(m.getConstant());
	}

	public static native String TQualifier_getLayoutMatrixString(int m);

	public static String TQualifier_getLayoutFormatString(TLayoutFormat f) {
		return TQualifier_getLayoutFormatString(f.getConstant());
	}

	public static native String TQualifier_getLayoutFormatString(int f);

	public static String TQualifier_getLayoutDepthString(TLayoutDepth f) {
		return TQualifier_getLayoutDepthString(f.getConstant());
	}

	public static native String TQualifier_getLayoutDepthString(int d);

	public static String TQualifier_getBlendEquationString(TBlendEquationShift f) {
		return TQualifier_getBlendEquationString(f.getConstant());
	}

	public static native String TQualifier_getBlendEquationString(int e);

	public static String TQualifier_getGeometryString(TLayoutGeometry f) {
		return TQualifier_getGeometryString(f.getConstant());
	}

	public static native String TQualifier_getGeometryString(int geometry);

	public static String TQualifier_getVertexSpacingString(TVertexSpacing f) {
		return TQualifier_getVertexSpacingString(f.getConstant());
	}

	public static native String TQualifier_getVertexSpacingString(int spacing);

	public static String TQualifier_getVertexOrderString(TVertexOrder f) {
		return TQualifier_getVertexOrderString(f.getConstant());
	}

	public static native String TQualifier_getVertexOrderString(int order);

	public static int TQualifier_mapGeometryToSize(TLayoutGeometry f) {
		return TQualifier_mapGeometryToSize(f.getConstant());
	}

	public static native int TQualifier_mapGeometryToSize(int geometry);

	public static String TQualifier_getInterlockOrderingString(TInterlockOrdering f) {
		return TQualifier_getInterlockOrderingString(f.getConstant());
	}

	public static native String TQualifier_getInterlockOrderingString(int order);

	public static byte[] TIoRange(byte[] location, byte[] component, TBasicType basicType, int index) {
		return TIoRange(location, component, basicType.getConstant(), index);
	}

	public static native byte[] TIoRange(byte[] location, byte[] component, int basicType, int index);

	public static native boolean TIoRange_overlap(byte[] ptr, byte[] rhs);

	public static native void TIoRange_setLocation(byte[] ptr, byte[] v);

	public static native void TIoRange_setComponent(byte[] ptr, byte[] v);

	public static native void TIoRange_setBasicType(byte[] ptr, int v);

	public static native void TIoRange_setindex(byte[] ptr, int v);

	public static native byte[] TIoRange_getLocation(byte[] ptr);

	public static native byte[] TIoRange_getComponent(byte[] ptr);

	public static native int TIoRange_getBasicType(byte[] ptr);

	public static native int TIoRange_getIndex(byte[] ptr);

	public static native byte[] TRange(int start, int last);

	public static native boolean TRange_overlap(byte[] ptr, byte[] rhs);

	public static native void TRange_setStart(byte[] ptr, int v);

	public static native void TRange_setLast(byte[] ptr, int v);

	public static native int TRange_getStart(byte[] ptr);

	public static native int TRange_getLast(byte[] ptr);

	public static byte[] TAllocation(long size, byte[] mem) {// NOTE: Interface not exact. size_t might be larger than
																// long.
		return TAllocation(size, mem, null);
	}

	public static native byte[] TAllocation(long size, byte[] mem, byte[] prev);// NOTE: Interface not exact. size_t
																				// might be larger than long.

	public static native void TAllocation_check(byte[] ptr);

	public static native void TAllocation_checkAllocList(byte[] ptr);

	public static native long TAllocation_allocationSize(long size);// NOTE: Interface not exact. size_t might be larger
																	// than long.

	public static native byte[] TAllocation_offsetAllocation(byte[] m);

	public static byte[] TPoolAllocator() {
		return TPoolAllocator(8 * 1024, 16);
	}

	public static byte[] TPoolAllocator(int growthIncrement) {
		return TPoolAllocator(growthIncrement, 16);
	}

	public static native byte[] TPoolAllocator(int growthIncrement, int allocationAlignment);

	public static native void TPoolAllocator_push(byte[] ptr);

	public static native void TPoolAllocator_pop(byte[] ptr);

	public static native void TPoolAllocator_popAll(byte[] ptr);

	public static native byte[] TPoolAllocator_allocate(byte[] ptr, long numBytes);// NOTE: Interface not exact. size_t
																					// might be larger than long.

	public static native byte[] TShHandleBase();

	public static native byte[] TShHandleBase_getAsCompiler(byte[] ptr);

	public static native byte[] TShHandleBase_getAsLinker(byte[] ptr);

	public static native byte[] TShHandleBase_getAsUniformMap(byte[] ptr);

	public static native byte[] TShHandleBase_getPool(byte[] ptr);

	public static native byte[] TUniformMap_getAsUniformMap(byte[] ptr);

	public static native byte[] TUniformMap_getInfoSink(byte[] ptr);

	public static native void TUniformMap_setInfoSink(byte[] ptr, byte[] infoSink);

	public static native int TCompiler_getLanguage(byte[] ptr);

	public static native byte[] TCompiler_getInfoSink(byte[] ptr);

	public static native byte[] TCompiler_getAsCompiler(byte[] ptr);

	public static native boolean TCompiler_linkable(byte[] ptr);

	public static native void TCompiler_setInfoSink(byte[] ptr, byte[] infoSink);

	public static native byte[] TLinker_getAsLinker(byte[] ptr);

	public static native boolean TLinker_link(byte[] ptr, byte[] list);

	public static native void TLinker_setAppAttributeBindings(byte[] ptr, byte[] t);

	public static native void TLinker_setFixedAttributeBindings(byte[] ptr, byte[] t);

	public static native void TLinker_setExcludedAttributes(byte[] ptr, int[] attributes, int count);

	public static native byte[] TLinker_getUniformBindings(byte[] ptr);

	public static native byte[] TLinker_getObjectCode(byte[] ptr);

	public static native byte[] TLinker_getInfoSink(byte[] ptr);

	public static native void TLinker_setInfoSink(byte[] ptr, byte[] infoSink);

	public static byte[] TShaderQualifiers(TLayoutGeometry geometry, boolean pixelCenterInteger,
			boolean originUpperLeft, int invocations, int vertices, TVertexSpacing spacing, TVertexOrder order,
			boolean pointMode, int[] localSize, boolean[] localSizeNotDefault, int[] localSizeSpecId,
			boolean earlyFragmentTests, boolean postDepthCoverage, TLayoutDepth layoutDepth, boolean blendEquation,
			int numViews, TInterlockOrdering interlockOrdering, boolean layoutOverrideCoverage,
			boolean layoutDerivativeGroupQuads, boolean layoutDerivativeGroupLinear, int primitives,
			boolean layoutPrimitiveCulling) {
		return TShaderQualifiers(geometry.getConstant(), pixelCenterInteger, originUpperLeft, invocations, vertices,
				spacing.getConstant(), order.getConstant(), pointMode, localSize, localSizeNotDefault, localSizeSpecId,
				earlyFragmentTests, postDepthCoverage, layoutDepth.getConstant(), blendEquation, numViews,
				interlockOrdering.getConstant(), layoutOverrideCoverage, layoutDerivativeGroupQuads,
				layoutDerivativeGroupLinear, primitives, layoutPrimitiveCulling);
	}

	public static native byte[] TShaderQualifiers(int geometry, boolean pixelCenterInteger, boolean originUpperLeft,
			int invocations, int vertices, int spacing, int order, boolean pointMode, int[] localSize,
			boolean[] localSizeNotDefault, int[] localSizeSpecId, boolean earlyFragmentTests, boolean postDepthCoverage,
			int layoutDepth, boolean blendEquation, int numViews, int interlockOrdering, boolean layoutOverrideCoverage,
			boolean layoutDerivativeGroupQuads, boolean layoutDerivativeGroupLinear, int primitives,
			boolean layoutPrimitiveCulling);

	public static native byte[] TShaderQualifiers();

	public static native int TShaderQualifiers_getDepth(byte[] ptr);

	public static native void TShaderQualifiers_init(byte[] ptr);

	public static native boolean TShaderQualifiers_hasBlendEquation(byte[] ptr);

	public static native void TShaderQualifiers_merge(byte[] ptr, byte[] src);

	public static void TShaderQualifiers_setGeometry(byte[] ptr, TLayoutGeometry v) {
		TShaderQualifiers_setGeometry(ptr, v.getConstant());
	}

	public static native void TShaderQualifiers_setGeometry(byte[] ptr, int v);

	public static native void TShaderQualifiers_setPixelCenterInteger(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setOriginUpperLeft(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setInvocations(byte[] ptr, int v);

	public static native void TShaderQualifiers_setVertices(byte[] ptr, int v);

	public static void TShaderQualifiers_setSpacing(byte[] ptr, TVertexSpacing v) {
		TShaderQualifiers_setSpacing(ptr, v.getConstant());
	}

	public static native void TShaderQualifiers_setSpacing(byte[] ptr, int v);

	public static void TShaderQualifiers_setOrder(byte[] ptr, TVertexOrder v) {
		TShaderQualifiers_setOrder(ptr, v.getConstant());
	}

	public static native void TShaderQualifiers_setOrder(byte[] ptr, int v);

	public static native void TShaderQualifiers_setPointMode(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setLocalSize(byte[] ptr, int[] v);

	public static native void TShaderQualifiers_setLocalSizeNotDefault(byte[] ptr, boolean[] v);

	public static native void TShaderQualifiers_setLocalSizeSpecId(byte[] ptr, int[] v);

	public static native void TShaderQualifiers_setEarlyFragmentTests(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setPostDepthCoverage(byte[] ptr, boolean v);

	public static void TShaderQualifiers_setLayoutDepth(byte[] ptr, TLayoutDepth v) {
		TShaderQualifiers_setLayoutDepth(ptr, v.getConstant());
	}

	public static native void TShaderQualifiers_setLayoutDepth(byte[] ptr, int v);

	public static native void TShaderQualifiers_setBlendEquation(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setNumViews(byte[] ptr, int v);

	public static void TShaderQualifiers_setInterlockOrdering(byte[] ptr, TInterlockOrdering v) {
		TShaderQualifiers_setInterlockOrdering(ptr, v.getConstant());
	}

	public static native void TShaderQualifiers_setInterlockOrdering(byte[] ptr, int v);

	public static native void TShaderQualifiers_setLayoutOverrideCoverage(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setLayoutDerivativeGroupQuads(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setLayoutDerivativeGroupLinear(byte[] ptr, boolean v);

	public static native void TShaderQualifiers_setPrimitives(byte[] ptr, int v);

	public static native void TShaderQualifiers_setLayoutPrimitiveCulling(byte[] ptr, boolean v);

	public static native int TShaderQualifiers_getGeometry(byte[] ptr);

	public static native boolean TShaderQualifiers_getPixelCenterInteger(byte[] ptr);

	public static native boolean TShaderQualifiers_getOriginUpperLeft(byte[] ptr);

	public static native int TShaderQualifiers_getInvocations(byte[] ptr);

	public static native int TShaderQualifiers_getVertices(byte[] ptr);

	public static native int TShaderQualifiers_getSpacing(byte[] ptr);

	public static native int TShaderQualifiers_getOrder(byte[] ptr);

	public static native boolean TShaderQualifiers_getPointMode(byte[] ptr);

	public static native int[] TShaderQualifiers_getLocalSize(byte[] ptr);

	public static native boolean[] TShaderQualifiers_getLocalSizeNotDefault(byte[] ptr);

	public static native int[] TShaderQualifiers_getLocalSizeSpecId(byte[] ptr);

	public static native boolean TShaderQualifiers_getEarlyFragmentTests(byte[] ptr);

	public static native boolean TShaderQualifiers_getPostDepthCoverage(byte[] ptr);

	public static native int TShaderQualifiers_getLayoutDepth(byte[] ptr);

	public static native boolean TShaderQualifiers_getBlendEquation(byte[] ptr);

	public static native int TShaderQualifiers_getNumViews(byte[] ptr);

	public static native int TShaderQualifiers_getInterlockOrdering(byte[] ptr);

	public static native boolean TShaderQualifiers_getLayoutOverrideCoverage(byte[] ptr);

	public static native boolean TShaderQualifiers_getLayoutDerivativeGroupQuads(byte[] ptr);

	public static native boolean TShaderQualifiers_getLayoutDerivativeGroupLinear(byte[] ptr);

	public static native int TShaderQualifiers_getPrimitives(byte[] ptr);

	public static native boolean TShaderQualifiers_getLayoutPrimitiveCulling(byte[] ptr);

	public static native byte[] TSmallArrayVector();

	public static native int TSmallArrayVector_size(byte[] ptr);

	public static native long TSmallArrayVector_frontSize(byte[] ptr);

	public static native byte[] TSmallArrayVector_frontNode(byte[] ptr);

	public static native void TSmallArrayVector_changeFront(byte[] ptr, long s);

	public static native void TSmallArrayVector_push_back(byte[] ptr, long e, byte[] n);

	public static native void TSmallArrayVector_push_back(byte[] ptr, byte[] newDims);

	public static native void TSmallArrayVector_pop_front(byte[] ptr);

	public static native void TSmallArrayVector_copyNonFront(byte[] ptr, byte[] rhs);

	public static native long TSmallArrayVector_getDimSize(byte[] ptr, int i);

	public static native void TSmallArrayVector_setDimSize(byte[] ptr, int i, long size);

	public static native byte[] TSmallArrayVector_getDimNode(byte[] ptr, int i);

	public static native byte[] TSmallArrayVector_operatorAssign(byte[] ptr, byte[] from);

	public static native boolean TSmallArrayVector_operatorEqual(byte[] ptr, byte[] rhs);

	public static native boolean TSmallArrayVector_operatorNotEqual(byte[] ptr, byte[] rhs);

	public static native byte[] TPpToken();

	public static native void TPpToken_clear(byte[] ptr);

	public static native void TPpToken_setLoc(byte[] ptr, byte[] v);

	public static native void TPpToken_setSpace(byte[] ptr, boolean v);

	public static native void TPpToken_setIval(byte[] ptr, int v);

	public static native void TPpToken_setDval(byte[] ptr, double v);

	public static native void TPpToken_setI64val(byte[] ptr, BigInteger v);

	public static native void TPpToken_setName(byte[] ptr, String v);

	public static native byte[] TPpToken_getLoc(byte[] ptr);

	public static native boolean TPpToken_getSpace(byte[] ptr);

	public static native int TPpToken_getIval(byte[] ptr);

	public static native double TPpToken_getDval(byte[] ptr);

	public static native BigInteger TPpToken_getI64val(byte[] ptr);

	public static native String TPpToken_getName(byte[] ptr);

	public static native boolean TPpToken_operatorEqual(byte[] ptr, byte[] right);

	public static native boolean TPpToken_operatorNotEqual(byte[] ptr, byte[] right);

	public static native byte[] TStringAtomMap();

	public static native int TStringAtomMap_getAtom(byte[] ptr, String s);

	public static native int TStringAtomMap_getAddAtom(byte[] ptr, String s);

	public static native String TStringAtomMap_getString(byte[] ptr, int atom);

	public static native byte[] TPpContext(byte[] contextBase, String rootFileName, byte[] includer);

	public static native void TPpContext_setPreamble(byte[] ptr, String preamble);// NOTE: Interface not exact. size_t
																					// might be larger than long.

	public static native int TPpContext_tokenize(byte[] ptr, byte[] ppToken);

	public static native int TPpContext_tokenPaste(byte[] ptr, int token, byte[] ppToken);

	public static native void TPpContext_setInput(byte[] ptr, byte[] input, boolean versionWillBeError);

	public static native void TPpContext_pushInput(byte[] ptr, byte[] in);

	public static native void TPpContext_popInput(byte[] ptr);

	public static native void TPpContext_setMacroDefs(byte[] ptr, byte[] v);

	public static native byte[] TPpContext_getMacroDefs(byte[] ptr);

	public static native int TPpContext_tInput_scan(byte[] ptr, byte[] ppToken);

	public static native int TPpContext_tInput_getch(byte[] ptr);

	public static native void TPpContext_tInput_ungetch(byte[] ptr);

	public static native boolean TPpContext_tInput_peekPasting(byte[] ptr);

	public static native boolean TPpContext_tInput_peekContinuedPasting(byte[] ptr, int i);

	public static native boolean TPpContext_tInput_endOfReplacementList(byte[] ptr);

	public static native boolean TPpContext_tInput_isMacroInput(byte[] ptr);

	public static native void TPpContext_tInput_notifyActivated(byte[] ptr);

	public static native void TPpContext_tInput_notifyDeleted(byte[] ptr);

	public static native byte[] TPpContext_TokenStream();

	public static native void TPpContext_TokenStream_putToken(byte[] ptr, int token, byte[] ppToken);

	public static native boolean TPpContext_TokenStream_peekToken(byte[] ptr, int atom);

	public static native boolean TPpContext_TokenStream_peekContinuedPasting(byte[] ptr, int atom);

	public static native int TPpContext_TokenStream_getToken(byte[] ptr, byte[] contextBase, byte[] ppToken);

	public static native boolean TPpContext_TokenStream_atEnd(byte[] ptr);

	public static native boolean TPpContext_TokenStream_peekTokenizedPasting(byte[] ptr, boolean lastTokenPastes);

	public static native boolean TPpContext_TokenStream_peekUntokenizedPasting(byte[] ptr);

	public static native void TPpContext_TokenStream_reset(byte[] ptr);

	public static native byte[] TPpContext_TokenStream_Token(int atom, byte[] ppToken);

	public static native int TPpContext_TokenStream_Token_get(byte[] ptr, byte[] ppToken);

	public static native boolean TPpContext_TokenStream_Token_isAtom(byte[] ptr, int a);

	public static native int TPpContext_TokenStream_Token_getAtom(byte[] ptr);

	public static native boolean TPpContext_TokenStream_Token_nonSpaced(byte[] ptr);

	public static native byte[] TPpContext_MacroSymbol();

	public static native void TPpContext_MacroSymbol_setArgs(byte[] ptr, int[] v);

	public static native void TPpContext_MacroSymbol_setBody(byte[] ptr, byte[] v);

	public static native void TPpContext_MacroSymbol_setFunctionLike(byte[] ptr, long v);

	public static native void TPpContext_MacroSymbol_setBusy(byte[] ptr, long v);

	public static native void TPpContext_MacroSymbol_setUndef(byte[] ptr, long v);

	public static native int[] TPpContext_MacroSymbol_getArgs(byte[] ptr);

	public static native byte[] TPpContext_MacroSymbol_getBody(byte[] ptr);

	public static native long TPpContext_MacroSymbol_getFunctionLike(byte[] ptr);

	public static native long TPpContext_MacroSymbol_getBusy(byte[] ptr);

	public static native long TPpContext_MacroSymbol_getUndef(byte[] ptr);

	public static native byte[] TPpContext_lookupMacroDef(byte[] ptr, int atom);

	public static native void TPpContext_addMacroDef(byte[] ptr, int atom, byte[] macroDef);

	public static void TBuiltInParseables_initialize(byte[] ptr, int version, EProfile profile, byte[] spvVersion) {
		TBuiltInParseables_initialize(ptr, version, profile.getConstant(), spvVersion);
	}

	public static native void TBuiltInParseables_initialize(byte[] ptr, int version, int profile, byte[] spvVersion);

	public static void TBuiltInParseables_initialize(byte[] ptr, byte[] resources, int version, EProfile profile,
			byte[] spvVersion, EShLanguage language) {
		TBuiltInParseables_initialize(ptr, resources, version, profile.getConstant(), spvVersion,
				language.getConstant());
	}

	public static void TBuiltInParseables_initialize(byte[] ptr, byte[] resources, int version, int profile,
			byte[] spvVersion, EShLanguage language) {
		TBuiltInParseables_initialize(ptr, resources, version, profile, spvVersion, language.getConstant());
	}

	public static void TBuiltInParseables_initialize(byte[] ptr, byte[] resources, int version, EProfile profile,
			byte[] spvVersion, int language) {
		TBuiltInParseables_initialize(ptr, resources, version, profile.getConstant(), spvVersion, language);
	}

	public static native void TBuiltInParseables_initialize(byte[] ptr, byte[] resources, int version, int profile,
			byte[] spvVersion, int language);

	public static native String TBuiltInParseables_getCommonString(byte[] ptr);

	public static String TBuiltInParseables_getStageString(byte[] ptr, EShLanguage language) {
		return TBuiltInParseables_getStageString(ptr, language.getConstant());
	}

	public static native String TBuiltInParseables_getStageString(byte[] ptr, int language);

	public static void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable) {
		TBuiltInParseables_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language.getConstant(),
				symbolTable);
	}

	public static void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable) {
		TBuiltInParseables_identifyBuiltIns(ptr, version, profile, spvVersion, language.getConstant(), symbolTable);
	}

	public static void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			int language, byte[] symbolTable) {
		TBuiltInParseables_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language, symbolTable);
	}

	public static native void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, int profile,
			byte[] spvVersion, int language, byte[] symbolTable);

	public static void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable, byte[] resources) {
		TBuiltInParseables_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language.getConstant(),
				symbolTable, resources);
	}

	public static void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable, byte[] resources) {
		TBuiltInParseables_identifyBuiltIns(ptr, version, profile, spvVersion, language.getConstant(), symbolTable,
				resources);
	}

	public static void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			int language, byte[] symbolTable, byte[] resources) {
		TBuiltInParseables_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language, symbolTable,
				resources);
	}

	public static native void TBuiltInParseables_identifyBuiltIns(byte[] ptr, int version, int profile,
			byte[] spvVersion, int language, byte[] symbolTable, byte[] resources);

	public static native byte[] TBuiltIns();

	public static void TBuiltIns_initialize(byte[] ptr, int version, EProfile profile, byte[] spvVersion) {
		TBuiltIns_initialize(ptr, version, profile.getConstant(), spvVersion);
	}

	public static native void TBuiltIns_initialize(byte[] ptr, int version, int profile, byte[] spvVersion);

	public static void TBuiltIns_initialize(byte[] ptr, byte[] resources, int version, EProfile profile,
			byte[] spvVersion, EShLanguage language) {
		TBuiltIns_initialize(ptr, resources, version, profile.getConstant(), spvVersion, language.getConstant());
	}

	public static void TBuiltIns_initialize(byte[] ptr, byte[] resources, int version, int profile, byte[] spvVersion,
			EShLanguage language) {
		TBuiltIns_initialize(ptr, resources, version, profile, spvVersion, language.getConstant());
	}

	public static void TBuiltIns_initialize(byte[] ptr, byte[] resources, int version, EProfile profile,
			byte[] spvVersion, int language) {
		TBuiltIns_initialize(ptr, resources, version, profile.getConstant(), spvVersion, language);
	}

	public static native void TBuiltIns_initialize(byte[] ptr, byte[] resources, int version, int profile,
			byte[] spvVersion, int language);

	public static void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable) {
		TBuiltIns_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language.getConstant(),
				symbolTable);
	}

	public static void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable) {
		TBuiltIns_identifyBuiltIns(ptr, version, profile, spvVersion, language.getConstant(), symbolTable);
	}

	public static void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			int language, byte[] symbolTable) {
		TBuiltIns_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language, symbolTable);
	}

	public static native void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			int language, byte[] symbolTable);

	public static void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable, byte[] resources) {
		TBuiltIns_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language.getConstant(), symbolTable,
				resources);
	}

	public static void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable, byte[] resources) {
		TBuiltIns_identifyBuiltIns(ptr, version, profile, spvVersion, language.getConstant(), symbolTable, resources);
	}

	public static void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, EProfile profile, byte[] spvVersion,
			int language, byte[] symbolTable, byte[] resources) {
		TBuiltIns_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language, symbolTable, resources);
	}

	public static native void TBuiltIns_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			int language, byte[] symbolTable, byte[] resources);

	public static byte[] TLiveTraverser(byte[] i) {
		return TLiveTraverser(i, false, true, false, false);
	}

	public static byte[] TLiveTraverser(byte[] i, boolean traverseAll) {
		return TLiveTraverser(i, traverseAll, true, false, false);
	}

	public static byte[] TLiveTraverser(byte[] i, boolean traverseAll, boolean preVisit) {
		return TLiveTraverser(i, traverseAll, preVisit, false, false);
	}

	public static byte[] TLiveTraverser(byte[] i, boolean traverseAll, boolean preVisit, boolean inVisit) {
		return TLiveTraverser(i, traverseAll, preVisit, inVisit, false);
	}

	public static native byte[] TLiveTraverser(byte[] i, boolean traverseAll, boolean preVisit, boolean inVisit,
			boolean postVisit);

	public static native void TLiveTraverser_pushFunction(byte[] ptr, String name);

	public static native void TLiveTraverser_pushGlobalReference(byte[] ptr, String name);

	public static native void TLiveTraverser_setDestinations(byte[] ptr, byte[] v);

	public static native byte[] TLiveTraverser_getDestinations(byte[] ptr);

	public static native byte[] TPragma(boolean optimize, boolean debug);

	public static native void TPragma_setOptimize(byte[] ptr, boolean v);

	public static native void TPragma_setDebug(byte[] ptr, boolean v);

	public static native void TPragma_setPragmaTable(byte[] ptr, byte[] v);

	public static native boolean TPragma_getOptimize(byte[] ptr);

	public static native boolean TPragma_getDebug(byte[] ptr);

	public static native byte[] TPragma_getPragmaTable(byte[] ptr);

	public static native void TParseContextBase_error(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseContextBase_warn(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseContextBase_ppError(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseContextBase_ppWarn(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseContextBase_setLimits(byte[] ptr, byte[] resource);

	public static native void TParseContextBase_checkIndex(byte[] ptr, byte[] loc, byte[] t, int index);

	public static native int TParseContextBase_getLanguage(byte[] ptr);

	public static native void TParseContextBase_setScanContext(byte[] ptr, byte[] c);

	public static native byte[] TParseContextBase_getScanContext(byte[] ptr);

	public static native void TParseContextBase_setPpContext(byte[] ptr, byte[] c);

	public static native byte[] TParseContextBase_getPpContext(byte[] ptr);

	public static native void TParseContextBase_setLineCallback(byte[] ptr, Void_IntIntBooleanIntString func);

	public static native void TParseContextBase_setExtensionCallback(byte[] ptr, Void_IntStringString func);

	public static native void TParseContextBase_setVersionCallback(byte[] ptr, Void_IntIntString func);

	public static native void TParseContextBase_setPragmaCallback(byte[] ptr, Void_IntStringarray func);

	public static native void TParseContextBase_setErrorCallback(byte[] ptr, Void_IntString func);

	public static native void TParseContextBase_reservedPpErrorCheck(byte[] ptr, byte[] loc, String name, String op);

	public static native boolean TParseContextBase_lineContinuationCheck(byte[] ptr, byte[] loc, boolean endOfComment);

	public static native boolean TParseContextBase_lineDirectiveShouldSetNextLine(byte[] ptr);

	public static native void TParseContextBase_handlePragma(byte[] ptr, byte[] loc, String[] strings);

	public static boolean TParseContextBase_parseShaderStrings(byte[] ptr, byte[] c, byte[] input) {
		return TParseContextBase_parseShaderStrings(ptr, c, input, false);
	}

	public static native boolean TParseContextBase_parseShaderStrings(byte[] ptr, byte[] c, byte[] input,
			boolean versionWillBeError);

	public static native void TParseContextBase_notifyVersion(byte[] ptr, int line, int version, String type_string);

	public static native void TParseContextBase_notifyErrorDirective(byte[] ptr, int line, String error_message);

	public static native void TParseContextBase_notifyLineDirective(byte[] ptr, int curLineNo, int newLineNo,
			boolean hasSource, int sourceNum, String sourceName);

	public static native void TParseContextBase_notifyExtensionDirective(byte[] ptr, int line, String extension,
			String behavior);

	public static void TParseContextBase_growGlobalUniformBlock(byte[] ptr, byte[] loc, byte[] t, String memberName) {
		TParseContextBase_growGlobalUniformBlock(ptr, loc, t, memberName, null);
	}

	public static native void TParseContextBase_growGlobalUniformBlock(byte[] ptr, byte[] loc, byte[] t,
			String memberName, byte[] typeList);

	public static native void TParseContextBase_renameShaderFunction(byte[] ptr, String name);

	public static native boolean TParseContextBase_lValueErrorCheck(byte[] ptr, byte[] loc, String op, byte[] node);

	public static native void TParseContextBase_rValueErrorCheck(byte[] ptr, byte[] loc, String op, byte[] node);

	public static native void TParseContextBase_setSymbolTable(byte[] ptr, byte[] v);

	public static native void TParseContextBase_setStatementNestingLevel(byte[] ptr, int v);

	public static native void TParseContextBase_setLoopNestingLevel(byte[] ptr, int v);

	public static native void TParseContextBase_setStructNestingLevel(byte[] ptr, int v);

	public static native void TParseContextBase_setControlFlowNestingLevel(byte[] ptr, int v);

	public static native void TParseContextBase_setFunctionReturnsValue(byte[] ptr, boolean v);

	public static native void TParseContextBase_setPostEntryPointReturn(byte[] ptr, boolean v);

	public static native void TParseContextBase_setSwitchSequenceStack(byte[] ptr, byte[] v);

	public static native void TParseContextBase_setSwitchLevel(byte[] ptr, int[] v);

	public static native void TParseContextBase_setContextPragma(byte[] ptr, byte[] v);

	public static native void TParseContextBase_setBeginInvocationInterlockCount(byte[] ptr, int v);

	public static native void TParseContextBase_setEndInvocationInterlockCount(byte[] ptr, int v);

	public static native String TParseContextBase_getScopeMangler(byte[] ptr);

	public static native byte[] TParseContextBase_getSymbolTable(byte[] ptr);

	public static native int TParseContextBase_getStatementNestingLevel(byte[] ptr);

	public static native int TParseContextBase_getLoopNestingLevel(byte[] ptr);

	public static native int TParseContextBase_getStructNestingLevel(byte[] ptr);

	public static native int TParseContextBase_getControlFlowNestingLevel(byte[] ptr);

	public static native byte[] TParseContextBase_getCurrentFunctionType(byte[] ptr);

	public static native boolean TParseContextBase_getFunctionReturnsValue(byte[] ptr);

	public static native boolean TParseContextBase_getPostEntryPointReturn(byte[] ptr);

	public static native byte[] TParseContextBase_getSwitchSequenceStack(byte[] ptr);

	public static native int[] TParseContextBase_getSwitchLevel(byte[] ptr);

	public static native byte[] TParseContextBase_getContextPragma(byte[] ptr);

	public static native int TParseContextBase_getBeginInvocationInterlockCount(byte[] ptr);

	public static native int TParseContextBase_getEndInvocationInterlockCount(byte[] ptr);

	public static native byte[] TPrecisionManager();

	public static native void TPrecisionManager_respectPrecisionQualifiers(byte[] ptr);

	public static native boolean TPrecisionManager_respectingPrecisionQualifiers(byte[] ptr);

	public static native boolean TPrecisionManager_shouldWarnAboutDefaults(byte[] ptr);

	public static native void TPrecisionManager_defaultWarningGiven(byte[] ptr);

	public static native void TPrecisionManager_warnAboutDefaults(byte[] ptr);

	public static native void TPrecisionManager_explicitIntDefaultSeen(byte[] ptr);

	public static native void TPrecisionManager_explicitFloatDefaultSeen(byte[] ptr);

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, false, E_SH_MSG_DEFAULT, null);
	}

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink, boolean forwardCompatible) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, forwardCompatible, E_SH_MSG_DEFAULT, null);
	}

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink, boolean forwardCompatible,
			EnumSet<EShMessages> messages) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, forwardCompatible, EShMessages.setToInt(messages), null);
	}

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink, boolean forwardCompatible,
			EnumSet<EShMessages> messages, String entryPoint) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, forwardCompatible, EShMessages.setToInt(messages), entryPoint);
	}

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			int profile, byte[] spvVersion, int language, byte[] sink) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile, spvVersion, language, sink, false,
				E_SH_MSG_DEFAULT, null);
	}

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			int profile, byte[] spvVersion, int language, byte[] sink, boolean forwardCompatible) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile, spvVersion, language, sink,
				forwardCompatible, E_SH_MSG_DEFAULT, null);
	}

	public static byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			int profile, byte[] spvVersion, int language, byte[] sink, boolean forwardCompatible, int messages) {
		return TParseContext(table, intermediate, parsingBuiltins, version, profile, spvVersion, language, sink,
				forwardCompatible, messages, null);
	}

	public static native byte[] TParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			int profile, byte[] spvVersion, int language, byte[] sink, boolean forwardCompatible, int messages,
			String entryPoint);

	public static native boolean TParseContext_obeyPrecisionQualifiers(byte[] ptr);

	public static native void TParseContext_setPrecisionDefaults(byte[] ptr);

	public static native void TParseContext_setLimits(byte[] ptr, byte[] resource);

	public static boolean TParseContext_parseShaderStrings(byte[] ptr, byte[] c, byte[] input) {
		return TParseContext_parseShaderStrings(ptr, c, input, false);
	}

	public static native boolean TParseContext_parseShaderStrings(byte[] ptr, byte[] c, byte[] input,
			boolean versionWillBeError);

	public static native void TParseContext_parserError(byte[] ptr, String s);

	public static native void TParseContext_reservedErrorCheck(byte[] ptr, byte[] loc, String s);

	public static native void TParseContext_reservedPpErrorCheck(byte[] ptr, byte[] loc, String name, String op);

	public static native boolean TParseContext_lineContinuationCheck(byte[] ptr, byte[] loc, boolean endOfComment);

	public static native boolean TParseContext_lineDirectiveShouldSetNextLine(byte[] ptr);

	public static native boolean TParseContext_builtInName(byte[] ptr, String s);

	public static native void TParseContext_handlePragma(byte[] ptr, byte[] loc, String[] strings);

	public static native byte[] TParseContext_handleVariable(byte[] ptr, byte[] loc, byte[] symbol, String string);

	public static native byte[] TParseContext_handleBracketDereference(byte[] ptr, byte[] loc, byte[] base,
			byte[] index);

	public static native void TParseContext_handleIndexLimits(byte[] ptr, byte[] loc, byte[] base, byte[] index);

	public static native void TParseContext_makeEditable(byte[] ptr, byte[] symbol);

	public static native void TParseContext_ioArrayCheck(byte[] ptr, byte[] loc, byte[] t, String identifier);

	public static native boolean TParseContext_isIoResizeArray(byte[] ptr, byte[] t);

	public static native void TParseContext_fixIoArraySize(byte[] ptr, byte[] loc, byte[] t);

	public static native void TParseContext_handleIoResizeArrayAccess(byte[] ptr, byte[] loc, byte[] base);

	public static void TParseContext_checkIoArraysConsistency(byte[] ptr, byte[] loc) {
		TParseContext_checkIoArraysConsistency(ptr, loc, false);
	}

	public static native void TParseContext_checkIoArraysConsistency(byte[] ptr, byte[] loc, boolean tailOnly);

	public static int TParseContext_getIoArrayImplicitSize(byte[] ptr, byte[] qualifier) {
		return TParseContext_getIoArrayImplicitSize(ptr, qualifier, null);
	}

	public static native int TParseContext_getIoArrayImplicitSize(byte[] ptr, byte[] qualifier, String featureString);

	public static native void TParseContext_checkIoArrayConsistency(byte[] ptr, byte[] loc, int requiredSize,
			String feature, byte[] t, String s);

	public static byte[] TParseContext_handleBinaryMath(byte[] ptr, byte[] loc, String str, TOperator op, byte[] left,
			byte[] right) {
		return TParseContext_handleBinaryMath(ptr, loc, str, op.getConstant(), left, right);
	}

	public static native byte[] TParseContext_handleBinaryMath(byte[] ptr, byte[] loc, String str, int op, byte[] left,
			byte[] right);

	public static byte[] TParseContext_handleUnaryMath(byte[] ptr, byte[] loc, String str, TOperator op,
			byte[] childNode) {
		return TParseContext_handleUnaryMath(ptr, loc, str, op.getConstant(), childNode);
	}

	public static native byte[] TParseContext_handleUnaryMath(byte[] ptr, byte[] loc, String str, int op,
			byte[] childNode);

	public static native byte[] TParseContext_handleDotDereference(byte[] ptr, byte[] loc, byte[] base, String field);

	public static native byte[] TParseContext_handleDotSwizzle(byte[] ptr, byte[] loc, byte[] base, String field);

	public static native void TParseContext_blockMemberExtensionCheck(byte[] ptr, byte[] loc, byte[] base, int member,
			String memberName);

	public static native byte[] TParseContext_handleFunctionDeclarator(byte[] ptr, byte[] loc, byte[] function,
			boolean prototype);

	public static native byte[] TParseContext_handleFunctionDefinition(byte[] ptr, byte[] loc, byte[] function);

	public static native byte[] TParseContext_handleFunctionCall(byte[] ptr, byte[] loc, byte[] function, byte[] node);

	public static native byte[] TParseContext_handleBuiltInFunctionCall(byte[] ptr, byte[] loc, byte[] arguments,
			byte[] function);

	public static native void TParseContext_computeBuiltinPrecisions(byte[] ptr, byte[] node, byte[] function);

	public static native byte[] TParseContext_handleReturnValue(byte[] ptr, byte[] loc, byte[] node);

	public static void TParseContext_checkLocation(byte[] ptr, byte[] loc, TOperator op) {
		TParseContext_checkLocation(ptr, loc, op.getConstant());
	}

	public static native void TParseContext_checkLocation(byte[] ptr, byte[] loc, int op);

	public static native byte[] TParseContext_handleLengthMethod(byte[] ptr, byte[] loc, byte[] function, byte[] node);

	public static native void TParseContext_addInputArgumentConversions(byte[] ptr, byte[] function, byte[] node);

	public static native byte[] TParseContext_addOutputArgumentConversions(byte[] ptr, byte[] function, byte[] node);

	public static native void TParseContext_builtInOpCheck(byte[] ptr, byte[] loc, byte[] function, byte[] node);

	public static native void TParseContext_nonOpBuiltInCheck(byte[] ptr, byte[] loc, byte[] function, byte[] node);

	public static native void TParseContext_userFunctionCallCheck(byte[] ptr, byte[] loc, byte[] node);

	public static native void TParseContext_samplerConstructorLocationCheck(byte[] ptr, byte[] loc, String token,
			byte[] node);

	public static native byte[] TParseContext_handleConstructorCall(byte[] ptr, byte[] loc, byte[] t);

	public static void TParseContext_handlePrecisionQualifier(byte[] ptr, byte[] loc, byte[] qualifier,
			TPrecisionQualifier precisionQualifier) {
		TParseContext_handlePrecisionQualifier(ptr, loc, qualifier, precisionQualifier.getConstant());
	}

	public static native void TParseContext_handlePrecisionQualifier(byte[] ptr, byte[] loc, byte[] qualifier,
			int precisionQualifier);

	public static void TParseContext_checkPrecisionQualifier(byte[] ptr, byte[] loc,
			TPrecisionQualifier precisionQualifier) {
		TParseContext_checkPrecisionQualifier(ptr, loc, precisionQualifier.getConstant());
	}

	public static native void TParseContext_checkPrecisionQualifier(byte[] ptr, byte[] loc, int precisionQualifier);

	public static native void TParseContext_memorySemanticsCheck(byte[] ptr, byte[] loc, byte[] function,
			byte[] callNode);

	public static native void TParseContext_assignError(byte[] ptr, byte[] loc, String op, String left, String right);

	public static native void TParseContext_unaryOpError(byte[] ptr, byte[] loc, String op, String operand);

	public static native void TParseContext_binaryOpError(byte[] ptr, byte[] loc, String op, String left, String right);

	public static native void TParseContext_variableCheck(byte[] ptr, byte[] nodePtr);

	public static native boolean TParseContext_lValueErrorCheck(byte[] ptr, byte[] loc, String op, byte[] node);

	public static native void TParseContext_rValueErrorCheck(byte[] ptr, byte[] loc, String op, byte[] node);

	public static native void TParseContext_constantValueCheck(byte[] ptr, byte[] node, String token);

	public static native void TParseContext_integerCheck(byte[] ptr, byte[] node, String token);

	public static native void TParseContext_globalCheck(byte[] ptr, byte[] loc, String token);

	public static boolean TParseContext_constructorError(byte[] ptr, byte[] loc, byte[] node, byte[] function,
			TOperator op, byte[] t) {
		return TParseContext_constructorError(ptr, loc, node, function, op.getConstant(), t);
	}

	public static native boolean TParseContext_constructorError(byte[] ptr, byte[] loc, byte[] node, byte[] function,
			int op, byte[] t);

	public static native boolean TParseContext_constructorTextureSamplerError(byte[] ptr, byte[] loc, byte[] function);

	public static native void TParseContext_arraySizeCheck(byte[] ptr, byte[] loc, byte[] expr, byte[] arraySize,
			String sizeType);

	public static native boolean TParseContext_arrayQualifierError(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native boolean TParseContext_arrayError(byte[] ptr, byte[] loc, byte[] t);

	public static native void TParseContext_arraySizeRequiredCheck(byte[] ptr, byte[] loc, byte[] arraySize);

	public static native void TParseContext_structArrayCheck(byte[] ptr, byte[] loc, byte[] structure);

	public static native void TParseContext_arraySizesCheck(byte[] ptr, byte[] loc, byte[] qualifier, byte[] arraySized,
			byte[] initializer, boolean lastMember);

	public static native void TParseContext_arrayOfArrayVersionCheck(byte[] ptr, byte[] loc, byte[] arraySizes);

	public static boolean TParseContext_voidErrorCheck(byte[] ptr, byte[] loc, String s, TBasicType t) {
		return TParseContext_voidErrorCheck(ptr, loc, s, t.getConstant());
	}

	public static native boolean TParseContext_voidErrorCheck(byte[] ptr, byte[] loc, String s, int t);

	public static native void TParseContext_boolCheck(byte[] ptr, byte[] loc, byte[] node);

	public static native void TParseContext_boolCheckType(byte[] ptr, byte[] loc, byte[] t);

	public static native void TParseContext_samplerCheck(byte[] ptr, byte[] loc, byte[] t, String identifier,
			byte[] initializer);

	public static native void TParseContext_atomicUintCheck(byte[] ptr, byte[] loc, byte[] t, String identifier);

	public static native void TParseContext_accStructCheck(byte[] ptr, byte[] loc, byte[] type, String identifier);

	public static native void TParseContext_transparentOpaqueCheck(byte[] ptr, byte[] loc, byte[] t, String identifier);

	public static native void TParseContext_memberQualifierCheck(byte[] ptr, byte[] t);

	public static native void TParseContext_globalQualifierFixCheck(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native void TParseContext_globalQualifierTypeCheck(byte[] ptr, byte[] loc, byte[] qualifier,
			byte[] t);

	public static native boolean TParseContext_structQualifierErrorCheck(byte[] ptr, byte[] loc, byte[] pType);

	public static native void TParseContext_mergeQualifiers(byte[] ptr, byte[] loc, byte[] dst, byte[] src,
			boolean force);

	public static void TParseContext_setDefaultPrecision(byte[] ptr, byte[] loc, byte[] t,
			TPrecisionQualifier precisionQualifier) {
		TParseContext_setDefaultPrecision(ptr, loc, t, precisionQualifier.getConstant());
	}

	public static native void TParseContext_setDefaultPrecision(byte[] ptr, byte[] loc, byte[] t,
			int precisionQualifier);

	public static native int TParseContext_computeSamplerTypeIndex(byte[] ptr, byte[] sampler);

	public static native int TParseContext_getDefaultPrecision(byte[] ptr, byte[] t);

	public static void TParseContext_precisionQualifierCheck(byte[] ptr, byte[] loc, TBasicType t, byte[] qualifier) {
		TParseContext_precisionQualifierCheck(ptr, loc, t.getConstant(), qualifier);
	}

	public static native void TParseContext_precisionQualifierCheck(byte[] ptr, byte[] loc, int t, byte[] qualifier);

	public static void TParseContext_parameterTypeCheck(byte[] ptr, byte[] loc, TStorageQualifier qualifier,
			byte[] type) {
		TParseContext_parameterTypeCheck(ptr, loc, qualifier.getConstant(), type);
	}

	public static native void TParseContext_parameterTypeCheck(byte[] ptr, byte[] loc, int qualifier, byte[] type);

	public static boolean TParseContext_containsFieldWithBasicType(byte[] ptr, byte[] type, TBasicType basicType) {
		return TParseContext_containsFieldWithBasicType(ptr, type, basicType.getConstant());
	}

	public static native boolean TParseContext_containsFieldWithBasicType(byte[] ptr, byte[] type, int basicType);

	public static native byte[] TParseContext_redeclareBuiltinVariable(byte[] ptr, byte[] loc, String s,
			byte[] qualifier, byte[] shaderQualifiers);

	public static native void TParseContext_redeclareBuiltinBlock(byte[] ptr, byte[] loc, byte[] typeList,
			String blockName, String instanceName, byte[] arraySizes);

	public static void TParseContext_paramCheckFixStorage(byte[] ptr, byte[] loc, TStorageQualifier qualifier,
			byte[] type) {
		TParseContext_paramCheckFixStorage(ptr, loc, qualifier.getConstant(), type);
	}

	public static native void TParseContext_paramCheckFixStorage(byte[] ptr, byte[] loc, int qualifier, byte[] type);

	public static native void TParseContext_paramCheckFix(byte[] ptr, byte[] loc, byte[] qualifier, byte[] type);

	public static native void TParseContext_nestedBlockCheck(byte[] ptr, byte[] loc);

	public static native void TParseContext_nestedStructCheck(byte[] ptr, byte[] loc);

	public static native void TParseContext_arrayObjectCheck(byte[] ptr, byte[] loc, byte[] t, String op);

	public static native void TParseContext_opaqueCheck(byte[] ptr, byte[] loc, byte[] t, String op);

	public static native void TParseContext_referenceCheck(byte[] ptr, byte[] loc, byte[] t, String op);

	public static native void TParseContext_storage16BitAssignmentCheck(byte[] ptr, byte[] loc, byte[] t, String op);

	public static native void TParseContext_specializationCheck(byte[] ptr, byte[] loc, byte[] t, String op);

	public static native void TParseContext_structTypeCheck(byte[] ptr, byte[] loc, byte[] t);

	public static native void TParseContext_inductiveLoopCheck(byte[] ptr, byte[] loc, byte[] init, byte[] loop);

	public static native void TParseContext_arrayLimitCheck(byte[] ptr, byte[] loc, String s, int size);

	public static native void TParseContext_limitCheck(byte[] ptr, byte[] loc, int value, String limit, String feature);

	public static native void TParseContext_inductiveLoopBodyCheck(byte[] ptr, byte[] node, int loopIndexId,
			byte[] table);

	public static native void TParseContext_constantIndexExpressionCheck(byte[] ptr, byte[] node);

	public static native void TParseContext_setLayoutQualifier(byte[] ptr, byte[] loc, byte[] t, String s);

	public static native void TParseContext_setLayoutQualifier(byte[] ptr, byte[] loc, byte[] t, String s, byte[] node);

	public static native void TParseContext_mergeObjectLayoutQualifiers(byte[] ptr, byte[] dest, byte[] src,
			boolean inheritOnly);

	public static native void TParseContext_layoutObjectCheck(byte[] ptr, byte[] loc, byte[] symbol);

	public static native void TParseContext_layoutMemberLocationArrayCheck(byte[] ptr, byte[] loc,
			boolean memberWithLocation, byte[] arraySizes);

	public static native void TParseContext_layoutTypeCheck(byte[] ptr, byte[] loc, byte[] t);

	public static native void TParseContext_layoutQualifierCheck(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native void TParseContext_checkNoShaderLayouts(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native void TParseContext_fixOffset(byte[] ptr, byte[] loc, byte[] symbol);

	public static native byte[] TParseContext_findFunction(byte[] ptr, byte[] loc, byte[] call, boolean builtIn);

	public static native byte[] TParseContext_findFunctionExact(byte[] ptr, byte[] loc, byte[] call, boolean builtIn);

	public static native byte[] TParseContext_findFunction120(byte[] ptr, byte[] loc, byte[] call, boolean builtIn);

	public static native byte[] TParseContext_findFunction400(byte[] ptr, byte[] loc, byte[] call, boolean builtIn);

	public static native byte[] TParseContext_findFunctionExplicitTypes(byte[] ptr, byte[] loc, byte[] call,
			boolean builtIn);

	public static native void TParseContext_declareTypeDefaults(byte[] ptr, byte[] loc, byte[] t);

	public static byte[] TParseContext_declareVariable(byte[] ptr, byte[] loc, String identifier, byte[] t) {
		return TParseContext_declareVariable(ptr, loc, identifier, t, null, null);
	}

	public static byte[] TParseContext_declareVariable(byte[] ptr, byte[] loc, String identifier, byte[] t,
			byte[] typeArray) {
		return TParseContext_declareVariable(ptr, loc, identifier, t, typeArray, null);
	}

	public static native byte[] TParseContext_declareVariable(byte[] ptr, byte[] loc, String identifier, byte[] t,
			byte[] typeArray, byte[] initializer);

	public static native byte[] TParseContext_addConstructor(byte[] ptr, byte[] loc, byte[] node, byte[] t);

	public static native byte[] TParseContext_constructAggregate(byte[] ptr, byte[] node, byte[] t, int i, byte[] loc);

	public static byte[] TParseContext_constructBuiltIn(byte[] ptr, byte[] t, TOperator op, byte[] node, byte[] loc,
			boolean subset) {
		return TParseContext_constructBuiltIn(ptr, t, op.getConstant(), node, loc, subset);
	}

	public static native byte[] TParseContext_constructBuiltIn(byte[] ptr, byte[] t, int op, byte[] node, byte[] loc,
			boolean subset);

	public static native void TParseContext_inheritMemoryQualifiers(byte[] ptr, byte[] from, byte[] to);

	public static void TParseContext_declareBlock(byte[] ptr, byte[] loc, byte[] typeList) {
		TParseContext_declareBlock(ptr, loc, typeList, null, null);
	}

	public static void TParseContext_declareBlock(byte[] ptr, byte[] loc, byte[] typeList, String instanceName) {
		TParseContext_declareBlock(ptr, loc, typeList, instanceName, null);
	}

	public static native void TParseContext_declareBlock(byte[] ptr, byte[] loc, byte[] typeList, String instanceName,
			byte[] arraySizes);

	public static native void TParseContext_blockStageIoCheck(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native void TParseContext_blockQualifierCheck(byte[] ptr, byte[] loc, byte[] qualifier,
			boolean instanceName);

	public static native void TParseContext_fixBlockLocations(byte[] ptr, byte[] loc, byte[] qualifier, byte[] list,
			boolean memberWithLocation, boolean memberWithoutLocation);

	public static native void TParseContext_fixXfbOffsets(byte[] ptr, byte[] qualifier, byte[] list);

	public static native void TParseContext_fixBlockUniformOffsets(byte[] ptr, byte[] qualifier, byte[] list);

	public static native void TParseContext_fixBlockUniformLayoutMatrix(byte[] ptr, byte[] qualifier, byte[] list0,
			byte[] list1);

	public static native void TParseContext_fixBlockUniformLayoutPacking(byte[] ptr, byte[] qualifier, byte[] list0,
			byte[] list1);

	public static native void TParseContext_addQualifierToExisting(byte[] ptr, byte[] loc, byte[] qualifier,
			String identifier);

	public static native void TParseContext_addQualifierToExisting(byte[] ptr, byte[] loc, byte[] qualifier,
			byte[] list);

	public static native void TParseContext_invariantCheck(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native void TParseContext_updateStandaloneQualifierDefaults(byte[] ptr, byte[] loc, byte[] t);

	public static native void TParseContext_wrapupSwitchSubsequence(byte[] ptr, byte[] statements, byte[] branchNode);

	public static native byte[] TParseContext_addSwitch(byte[] ptr, byte[] loc, byte[] expression, byte[] body);

	public static native byte[] TParseContext_recordStructCopy(byte[] ptr, byte[] record, byte[] t0, byte[] t1);

	public static native int TParseContext_attributeFromName(byte[] ptr, String name);

	public static native byte[] TParseContext_makeAttributes(byte[] ptr, String identifier);

	public static native byte[] TParseContext_makeAttributes(byte[] ptr, String identifier, byte[] node);

	public static native byte[] TParseContext_mergeAttributes(byte[] ptr, byte[] a0, byte[] a1);

	public static native void TParseContext_handleSelectionAttributes(byte[] ptr, byte[] attributes, byte[] node);

	public static native void TParseContext_handleSwitchAttributes(byte[] ptr, byte[] attributes, byte[] node);

	public static native void TParseContext_handleLoopAttributes(byte[] ptr, byte[] attributes, byte[] node);

	public static native void TParseContext_checkAndResizeMeshViewDim(byte[] ptr, byte[] loc, byte[] t,
			boolean isBlockMember);

	public static native void TParseContext_setInMain(byte[] ptr, boolean v);

	public static native void TParseContext_setBlockName(byte[] ptr, String v);

	public static native void TParseContext_setCurrentBlockQualifier(byte[] ptr, byte[] v);

	public static native void TParseContext_setDefaultPrecision(byte[] ptr, int[] v);

	public static native void TParseContext_setResources(byte[] ptr, byte[] v);

	public static native void TParseContext_setLimitsSetter(byte[] ptr, byte[] v);

	public static native boolean TParseContext_getInMain(byte[] ptr);

	public static native String TParseContext_getBlockName(byte[] ptr);

	public static native byte[] TParseContext_getCurrentBlockQualifier(byte[] ptr);

	public static native int[] TParseContext_getDefaultPrecision(byte[] ptr);

	public static native byte[] TParseContext_getResources(byte[] ptr);

	public static native byte[] TParseContext_getLimits(byte[] ptr);

	public static byte[] TInputScanner(int n, String[] s, long[] L) {// NOTE: Interface not exact. size_t might be
																		// larger than long.
		return TInputScanner(n, s, L, null, 0, 0, false);
	}

	public static byte[] TInputScanner(int n, String[] s, long[] L, String[] names) {// NOTE: Interface not exact.
																						// size_t might be larger than
																						// long.
		return TInputScanner(n, s, L, names, 0, 0, false);
	}

	public static byte[] TInputScanner(int n, String[] s, long[] L, String[] names, int b) {// NOTE: Interface not
																							// exact. size_t might be
																							// larger than long.
		return TInputScanner(n, s, L, names, b, 0, false);
	}

	public static byte[] TInputScanner(int n, String[] s, long[] L, String[] names, int b, int f) {// NOTE: Interface
																									// not exact. size_t
																									// might be larger
																									// than long.
		return TInputScanner(n, s, L, names, b, f, false);
	}

	public static native byte[] TInputScanner(int n, String[] s, long[] L, String[] names, int b, int f,
			boolean single);// NOTE: Interface not exact. size_t might be larger than long.

	public static native int TInputScanner_get(byte[] ptr);

	public static native int TInputScanner_peek(byte[] ptr);

	public static native void TInputScanner_unget(byte[] ptr);

	public static native void TInputScanner_setLine(byte[] ptr, int newLine);

	public static native void TInputScanner_setFile(byte[] ptr, String filename);

	public static native void TInputScanner_setFile(byte[] ptr, String filename, int i);

	public static native void TInputScanner_setString(byte[] ptr, int newString);

	public static native void TInputScanner_setColumn(byte[] ptr, int col);

	public static native void TInputScanner_setEndOfInput(byte[] ptr);

	public static native boolean TInputScanner_atEndOfInput(byte[] ptr);

	public static native byte[] TInputScanner_getSourceLoc(byte[] ptr);

	public static native int TInputScanner_getLastValidSourceIndex(byte[] ptr);

	public static native void TInputScanner_consumeWhiteSpace(byte[] ptr, boolean foundNonSpaceTab);

	public static native boolean TInputScanner_consumeComment(byte[] ptr);

	public static native void TInputScanner_consumeWhitespaceComment(byte[] ptr, boolean foundNonSpaceTab);

	public static boolean TInputScanner_scanVersion(byte[] ptr, int version, EProfile profile, boolean notFirstToken) {
		return TInputScanner_scanVersion(ptr, version, profile.getConstant(), notFirstToken);
	}

	public static native boolean TInputScanner_scanVersion(byte[] ptr, int version, int profile, boolean notFirstToken);

	public static native byte[] TScanContext(byte[] pc);

	public static native int TScanContext_tokenize(byte[] ptr, byte[] context, byte[] token);

	public static native void TScanContext_fillInKeywordMap();

	public static native void TScanContext_deleteKeywordMap();

	public static native byte[] TSymbol_clone(byte[] ptr);

	public static native String TSymbol_getName(byte[] ptr);

	public static native void TSymbol_changeName(byte[] ptr, String newName);

	public static native void TSymbol_addPrefix(byte[] ptr, String prefix);

	public static native String TSymbol_getMangledName(byte[] ptr);

	public static native byte[] TSymbol_getAsFunction(byte[] ptr);

	public static native byte[] TSymbol_getAsVariable(byte[] ptr);

	public static native byte[] TSymbol_getAsAnonMember(byte[] ptr);

	public static native byte[] TSymbol_getType(byte[] ptr);

	public static native byte[] TSymbol_getWritableType(byte[] ptr);

	public static native void TSymbol_setUniqueId(byte[] ptr, int id);

	public static native int TSymbol_getUniqueId(byte[] ptr);

	public static native void TSymbol_setExtensions(byte[] ptr, String[] exts);

	public static native int TSymbol_getNumExtensions(byte[] ptr);

	public static native String[] TSymbol_getExtensions(byte[] ptr);

	public static void TSymbol_dump(byte[] ptr, byte[] infoSink) {
		TSymbol_dump(ptr, infoSink, false);
	}

	public static native void TSymbol_dump(byte[] ptr, byte[] infoSink, boolean complete);

	public static native void TSymbol_dumpExtensions(byte[] ptr, byte[] infoSink);

	public static native boolean TSymbol_isReadOnly(byte[] ptr);

	public static native void TSymbol_makeReadOnly(byte[] ptr);

	public static byte[] TVariable(String name, byte[] t) {
		return TVariable(name, t, false);
	}

	public static native byte[] TVariable(String name, byte[] t, boolean uT);

	public static native byte[] TVariable_clone(byte[] ptr);

	public static native byte[] TVariable_getAsVariable(byte[] ptr);

	public static native byte[] TVariable_getType(byte[] ptr);

	public static native byte[] TVariable_getWritableType(byte[] ptr);

	public static native boolean TVariable_isUserType(byte[] ptr);

	public static native byte[] TVariable_getConstArray(byte[] ptr);

	public static native byte[] TVariable_getWritableConstArray(byte[] ptr);

	public static native void TVariable_setConstArray(byte[] ptr, byte[] array);

	public static native void TVariable_setConstSubtree(byte[] ptr, byte[] subtree);

	public static native byte[] TVariable_getConstSubtree(byte[] ptr);

	public static native void TVariable_setAnonId(byte[] ptr, int i);

	public static native int TVariable_getAnonId(byte[] ptr);

	public static native void TVariable_setMemberExtensions(byte[] ptr, int member, String[] exts);

	public static native boolean TVariable_hasMemberExtensions(byte[] ptr);

	public static native int TVariable_getNumMemberExtensions(byte[] ptr, int member);

	public static native String[] TVariable_getMemberExtensions(byte[] ptr, int member);

	public static void TVariable_dump(byte[] ptr, byte[] infoSink) {
		TVariable_dump(ptr, infoSink, false);
	}

	public static native void TVariable_dump(byte[] ptr, byte[] infoSink, boolean complete);

	public static native byte[] TParameter();

	public static native byte[] TParameter(String name, byte[] type, byte[] defaultValue);

	public static native void TParameter_copyParam(byte[] ptr, byte[] param);

	public static native int TParameter_getDeclaredBuiltIn(byte[] ptr);

	public static native void TParameter_setName(byte[] ptr, String v);

	public static native void TParameter_setType(byte[] ptr, byte[] v);

	public static native void TParameter_setDefaultValue(byte[] ptr, byte[] v);

	public static native String TParameter_getName(byte[] ptr);

	public static native byte[] TParameter_getType(byte[] ptr);

	public static native byte[] TParameter_getDefaultValue(byte[] ptr);

	public static byte[] TFunction(TOperator o) {
		return TFunction(o.getConstant());
	}

	public static native byte[] TFunction(int o);

	public static byte[] TFunction(String name, byte[] retType, TOperator tOp) {
		return TFunction(name, retType, tOp.getConstant());
	}

	public static byte[] TFunction(String name, byte[] retType) {
		return TFunction(name, retType, E_OP_NULL);
	}

	public static native byte[] TFunction(String name, byte[] retType, int tOp);

	public static native byte[] TFunction_clone(byte[] ptr);

	public static native byte[] TFunction_getAsFunction(byte[] ptr);

	public static native void TFunction_addParameter(byte[] ptr, byte[] p);

	public static native void TFunction_addThisParameter(byte[] ptr, byte[] type, String name);

	public static native void TFunction_addPrefix(byte[] ptr, String prefix);

	public static native void TFunction_removePrefix(byte[] ptr, String prefix);

	public static native String TFunction_getMangledName(byte[] ptr);

	public static native byte[] TFunction_getType(byte[] ptr);

	public static native int TFunction_getDeclaredBuiltInType(byte[] ptr);

	public static native byte[] TFunction_getWritableType(byte[] ptr);

	public static void TFunction_relateToOperator(byte[] ptr, TOperator o) {
		TFunction_relateToOperator(ptr, o.getConstant());
	}

	public static native void TFunction_relateToOperator(byte[] ptr, int o);

	public static native int TFunction_getBuiltInOp(byte[] ptr);

	public static native void TFunction_setDefined(byte[] ptr);

	public static native boolean TFunction_isDefined(byte[] ptr);

	public static native void TFunction_setPrototyped(byte[] ptr);

	public static native boolean TFunction_isPrototyped(byte[] ptr);

	public static native void TFunction_setImplicitThis(byte[] ptr);

	public static native boolean TFunction_hasImplicitThis(byte[] ptr);

	public static native void TFunction_setIllegalImplicitThis(byte[] ptr);

	public static native boolean TFunction_hasIllegalImplicitThis(byte[] ptr);

	public static native int TFunction_getParamCount(byte[] ptr);

	public static native int TFunction_getDefaultParamCount(byte[] ptr);

	public static native int TFunction_getFixedParamCount(byte[] ptr);

	public static void TFunction_dump(byte[] ptr, byte[] infoSink) {
		TFunction_dump(ptr, infoSink, false);
	}

	public static native void TFunction_dump(byte[] ptr, byte[] infoSink, boolean complete);

	public static native byte[] TFunction_operatorAt(byte[] ptr, int i);

	public static native byte[] TAnonMember(String n, long m, byte[] a, int an);

	public static native byte[] TAnonMember_clone(byte[] ptr);

	public static native byte[] TAnonMember_getAsAnonMember(byte[] ptr);

	public static native byte[] TAnonMember_getAnonContainer(byte[] ptr);

	public static native long TAnonMember_getMemberNumber(byte[] ptr);

	public static native byte[] TAnonMember_getType(byte[] ptr);

	public static native byte[] TAnonMember_getWritableType(byte[] ptr);

	public static native void TAnonMember_setExtensions(byte[] ptr, String[] exts);

	public static native int TAnonMember_getNumExtensions(byte[] ptr);

	public static native String[] TAnonMember_getExtensions(byte[] ptr);

	public static native int TAnonMember_getAnonId(byte[] ptr);

	public static void TAnonMember_dump(byte[] ptr, byte[] infoSink) {
		TAnonMember_dump(ptr, infoSink, false);
	}

	public static native void TAnonMember_dump(byte[] ptr, byte[] infoSink, boolean complete);

	public static native byte[] TSymbolTableLevel();

	public static native boolean TSymbolTableLevel_insert(byte[] ptr, byte[] symbol, boolean separateNameSpaces);

	public static native boolean TSymbolTableLevel_amend(byte[] ptr, byte[] symbol, int firstNewMember);

	public static native boolean TSymbolTableLevel_insertAnonymousMembers(byte[] ptr, byte[] symbol, int firstMember);

	public static native byte[] TSymbolTableLevel_find(byte[] ptr, String name);

	public static native void TSymbolTableLevel_findFunctionNameList(byte[] ptr, String name, byte[] list);

	public static native boolean TSymbolTableLevel_hasFunctionName(byte[] ptr, String name);

	public static native boolean TSymbolTableLevel_findFunctionVariableName(byte[] ptr, String name, boolean variable);

	public static void TSymbolTableLevel_setPreviousDefaultPrecisions(byte[] ptr, TPrecisionQualifier p) {
		TSymbolTableLevel_setPreviousDefaultPrecisions(ptr, p.getConstant());
	}

	public static native void TSymbolTableLevel_setPreviousDefaultPrecisions(byte[] ptr, int p);

	public static void TSymbolTableLevel_getPreviousDefaultPrecisions(byte[] ptr, TPrecisionQualifier p) {
		TSymbolTableLevel_getPreviousDefaultPrecisions(ptr, p.getConstant());
	}

	public static native void TSymbolTableLevel_getPreviousDefaultPrecisions(byte[] ptr, int p);

	public static void TSymbolTableLevel_relateToOperator(byte[] ptr, String name, TOperator op) {
		TSymbolTableLevel_relateToOperator(ptr, name, op.getConstant());
	}

	public static native void TSymbolTableLevel_relateToOperator(byte[] ptr, String name, int op);

	public static native void TSymbolTableLevel_setFunctionExtensions(byte[] ptr, String name, String[] extensions);

	public static void TSymbolTableLevel_dump(byte[] ptr, byte[] infoSink) {
		TSymbolTableLevel_dump(ptr, infoSink, false);
	}

	public static native void TSymbolTableLevel_dump(byte[] ptr, byte[] infoSink, boolean complete);

	public static native byte[] TSymbolTableLevel_clone(byte[] ptr);

	public static native void TSymbolTableLevel_readOnly(byte[] ptr);

	public static native void TSymbolTableLevel_setThisLevel(byte[] ptr);

	public static native boolean TSymbolTableLevel_isThisLevel(byte[] ptr);

	public static byte[] TAttributeArgs(TAttributeType name, byte[] args) {
		return TAttributeArgs(name.getConstant(), args);
	}

	public static native byte[] TAttributeArgs(int name, byte[] args);

	public static native byte[] TAttributeArgs();

	public static boolean TAttributeArgs_getInt(byte[] ptr, int value) {
		return TAttributeArgs_getInt(ptr, value, 0);
	}

	public static native boolean TAttributeArgs_getInt(byte[] ptr, int value, int argNum);

	public static boolean TAttributeArgs_getString(byte[] ptr, String value) {
		return TAttributeArgs_getString(ptr, value, 0, true);
	}

	public static boolean TAttributeArgs_getString(byte[] ptr, String value, int argNum) {
		return TAttributeArgs_getString(ptr, value, argNum, true);
	}

	public static native boolean TAttributeArgs_getString(byte[] ptr, String value, int argNum, boolean convertToLower);

	public static native int TAttributeArgs_size(byte[] ptr);

	public static native void TAttributeArgs_setName(byte[] ptr, int v);

	public static native int TAttributeArgs_getName(byte[] ptr);

	public static native byte[] TAttributeArgs_getArgs(byte[] ptr);

	public static boolean TDefaultIoResolverBase_validateBinding(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_validateBinding(ptr, stage.getConstant(), ent);
	}

	public static native boolean TDefaultIoResolverBase_validateBinding(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultIoResolverBase_resolveBinding(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_resolveBinding(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultIoResolverBase_resolveBinding(byte[] ptr, int stage, byte[] ent);

	public static void TDefaultIoResolverBase_notifyBinding(byte[] ptr, EShLanguage language, byte[] ent) {
		TDefaultIoResolverBase_notifyBinding(ptr, language.getConstant(), ent);
	}

	public static native void TDefaultIoResolverBase_notifyBinding(byte[] ptr, int language, byte[] ent);

	public static void TDefaultIoResolverBase_notifyInOut(byte[] ptr, EShLanguage language, byte[] ent) {
		TDefaultIoResolverBase_notifyInOut(ptr, language.getConstant(), ent);
	}

	public static native void TDefaultIoResolverBase_notifyInOut(byte[] ptr, int language, byte[] ent);

	public static void TDefaultIoResolverBase_beginNotifications(byte[] ptr, EShLanguage language) {
		TDefaultIoResolverBase_beginNotifications(ptr, language.getConstant());
	}

	public static native void TDefaultIoResolverBase_beginNotifications(byte[] ptr, int language);

	public static void TDefaultIoResolverBase_endNotifications(byte[] ptr, EShLanguage language) {
		TDefaultIoResolverBase_endNotifications(ptr, language.getConstant());
	}

	public static native void TDefaultIoResolverBase_endNotifications(byte[] ptr, int language);

	public static void TDefaultIoResolverBase_beginResolve(byte[] ptr, EShLanguage language) {
		TDefaultIoResolverBase_beginResolve(ptr, language.getConstant());
	}

	public static native void TDefaultIoResolverBase_beginResolve(byte[] ptr, int language);

	public static void TDefaultIoResolverBase_endResolve(byte[] ptr, EShLanguage language) {
		TDefaultIoResolverBase_endResolve(ptr, language.getConstant());
	}

	public static native void TDefaultIoResolverBase_endResolve(byte[] ptr, int language);

	public static void TDefaultIoResolverBase_beginCollect(byte[] ptr, EShLanguage language) {
		TDefaultIoResolverBase_beginCollect(ptr, language.getConstant());
	}

	public static native void TDefaultIoResolverBase_beginCollect(byte[] ptr, int language);

	public static void TDefaultIoResolverBase_endCollect(byte[] ptr, EShLanguage language) {
		TDefaultIoResolverBase_endCollect(ptr, language.getConstant());
	}

	public static native void TDefaultIoResolverBase_endCollect(byte[] ptr, int language);

	public static native void TDefaultIoResolverBase_reserverResourceSlot(byte[] ptr, byte[] ent, byte[] infoSink);

	public static native void TDefaultIoResolverBase_reserverStorageSlot(byte[] ptr, byte[] ent, byte[] infoSink);

	public static int TDefaultIoResolverBase_getBaseBinding(byte[] ptr, TResourceType res, long set) {
		return TDefaultIoResolverBase_getBaseBinding(ptr, res.getConstant(), set);
	}

	public static native int TDefaultIoResolverBase_getBaseBinding(byte[] ptr, int res, long set);

	public static native String[] TDefaultIoResolverBase_getResourceSetBinding(byte[] ptr);

	public static native int TDefaultIoResolverBase_getResourceType(byte[] ptr, byte[] type);

	public static native boolean TDefaultIoResolverBase_doAutoBindingMapping(byte[] ptr);

	public static native boolean TDefaultIoResolverBase_doAutoLocationMapping(byte[] ptr);

	public static native byte[] TDefaultIoResolverBase_findSlot(byte[] ptr, int set, int slot);

	public static native boolean TDefaultIoResolverBase_checkEmpty(byte[] ptr, int set, int slot);

	public static boolean TDefaultIoResolverBase_validateInOut(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_validateInOut(ptr, stage.getConstant(), ent);
	}

	public static native boolean TDefaultIoResolverBase_validateInOut(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultIoResolverBase_reserveSlot(byte[] ptr, int set, int slot) {
		return TDefaultIoResolverBase_reserveSlot(ptr, set, slot, 1);
	}

	public static native int TDefaultIoResolverBase_reserveSlot(byte[] ptr, int set, int slot, int size);

	public static int TDefaultIoResolverBase_getFreeSlot(byte[] ptr, int set, int slot) {
		return TDefaultIoResolverBase_getFreeSlot(ptr, set, slot, 1);
	}

	public static native int TDefaultIoResolverBase_getFreeSlot(byte[] ptr, int set, int base, int size);

	public static int TDefaultIoResolverBase_resolveSet(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_resolveSet(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultIoResolverBase_resolveSet(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultIoResolverBase_resolveUniformLocation(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_resolveUniformLocation(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultIoResolverBase_resolveUniformLocation(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultIoResolverBase_resolveInOutLocation(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_resolveInOutLocation(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultIoResolverBase_resolveInOutLocation(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultIoResolverBase_resolveInOutComponent(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_resolveInOutComponent(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultIoResolverBase_resolveInOutComponent(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultIoResolverBase_resolveInOutIndex(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultIoResolverBase_resolveInOutIndex(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultIoResolverBase_resolveInOutIndex(byte[] ptr, int stage, byte[] ent);

	public static void TDefaultIoResolverBase_addStage(byte[] ptr, EShLanguage stage) {
		TDefaultIoResolverBase_addStage(ptr, stage.getConstant());
	}

	public static native void TDefaultIoResolverBase_addStage(byte[] ptr, int stage);

	public static long TDefaultIoResolverBase_computeTypeLocationSize(byte[] ptr, byte[] type, EShLanguage stage) {
		return TDefaultIoResolverBase_computeTypeLocationSize(ptr, type, stage.getConstant());
	}

	public static native long TDefaultIoResolverBase_computeTypeLocationSize(byte[] ptr, byte[] type, int stage);

	public static native void TDefaultIoResolverBase_setSlots(byte[] ptr, byte[] v);

	public static native void TDefaultIoResolverBase_setHasError(byte[] ptr, boolean v);

	public static native byte[] TDefaultIoResolverBase_getSlots(byte[] ptr);

	public static native boolean TDefaultIoResolverBase_getHasError(byte[] ptr);

	public static native byte[] TDefaultGlslIoResolver(byte[] intermediate);

	public static boolean TDefaultGlslIoResolver_validateBinding(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultGlslIoResolver_validateBinding(ptr, stage.getConstant(), ent);
	}

	public static native boolean TDefaultGlslIoResolver_validateBinding(byte[] ptr, int stage, byte[] ent);

	public static native int TDefaultGlslIoResolver_getResourceType(byte[] ptr, byte[] type);

	public static int TDefaultGlslIoResolver_resolveInOutLocation(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultGlslIoResolver_resolveInOutLocation(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultGlslIoResolver_resolveInOutLocation(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultGlslIoResolver_resolveUniformLocation(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultGlslIoResolver_resolveUniformLocation(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultGlslIoResolver_resolveUniformLocation(byte[] ptr, int stage, byte[] ent);

	public static int TDefaultGlslIoResolver_resolveBinding(byte[] ptr, EShLanguage stage, byte[] ent) {
		return TDefaultGlslIoResolver_resolveBinding(ptr, stage.getConstant(), ent);
	}

	public static native int TDefaultGlslIoResolver_resolveBinding(byte[] ptr, int stage, byte[] ent);

	public static void TDefaultGlslIoResolver_beginResolve(byte[] ptr, EShLanguage stage) {
		TDefaultGlslIoResolver_beginResolve(ptr, stage.getConstant());
	}

	public static native void TDefaultGlslIoResolver_beginResolve(byte[] ptr, int stage);

	public static void TDefaultGlslIoResolver_endResolve(byte[] ptr, EShLanguage stage) {
		TDefaultGlslIoResolver_endResolve(ptr, stage.getConstant());
	}

	public static native void TDefaultGlslIoResolver_endResolve(byte[] ptr, int stage);

	public static void TDefaultGlslIoResolver_beginCollect(byte[] ptr, EShLanguage stage) {
		TDefaultGlslIoResolver_beginCollect(ptr, stage.getConstant());
	}

	public static native void TDefaultGlslIoResolver_beginCollect(byte[] ptr, int stage);

	public static void TDefaultGlslIoResolver_endCollect(byte[] ptr, EShLanguage stage) {
		TDefaultGlslIoResolver_endCollect(ptr, stage.getConstant());
	}

	public static native void TDefaultGlslIoResolver_endCollect(byte[] ptr, int stage);

	public static native void TDefaultGlslIoResolver_reserverStorageSlot(byte[] ptr, byte[] ent, byte[] infoSink);

	public static native void TDefaultGlslIoResolver_reserverResourceSlot(byte[] ptr, byte[] ent, byte[] infoSink);

	public static native String TDefaultGlslIoResolver_getAccessName(byte[] ptr, byte[] symbol);

	public static int TDefaultGlslIoResolver_buildStorageKey(byte[] ptr, EShLanguage stage, TStorageQualifier type) {
		return TDefaultGlslIoResolver_buildStorageKey(ptr, stage.getConstant(), type.getConstant());
	}

	public static int TDefaultGlslIoResolver_buildStorageKey(byte[] ptr, int stage, TStorageQualifier type) {
		return TDefaultGlslIoResolver_buildStorageKey(ptr, stage, type.getConstant());
	}

	public static int TDefaultGlslIoResolver_buildStorageKey(byte[] ptr, EShLanguage stage, int type) {
		return TDefaultGlslIoResolver_buildStorageKey(ptr, stage.getConstant(), type);
	}

	public static native int TDefaultGlslIoResolver_buildStorageKey(byte[] ptr, int stage, int type);

	public static native byte[] TVarLivePair(byte[] Right);

	public static native byte[] TVarLivePairFromPair(byte[] src);

	public static native byte[] TVarLivePair_operatorAssign(byte[] ptr, byte[] _Right);

	public static native byte[] TGlslIoMapper();

	public static boolean TGlslIoMapper_addStage(byte[] ptr, EShLanguage language, byte[] intermediate, byte[] sink,
			byte[] resolver) {
		return TGlslIoMapper_addStage(ptr, language.getConstant(), intermediate, sink, resolver);
	}

	public static native boolean TGlslIoMapper_addStage(byte[] ptr, int language, byte[] intermediate, byte[] sink,
			byte[] resolver);

	public static native boolean TGlslIoMapper_doMap(byte[] ptr, byte[] resolver, byte[] sink);

	public static native void TGlslIoMapper_setInVarMaps(byte[] ptr, byte[] v);

	public static native void TGlslIoMapper_setOutVarMaps(byte[] ptr, byte[] v);

	public static native void TGlslIoMapper_setUniformVarMap(byte[] ptr, byte[] v);

	public static native void TGlslIoMapper_setIntermediates(byte[] ptr, byte[] v);

	public static native void TGlslIoMapper_setHadError(byte[] ptr, boolean v);

	public static native byte[] TGlslIoMapper_getInVarMaps(byte[] ptr);

	public static native byte[] TGlslIoMapper_getOutVarMaps(byte[] ptr);

	public static native byte[] TGlslIoMapper_getUniformVarMap(byte[] ptr);

	public static native byte[] TGlslIoMapper_getIntermediates(byte[] ptr);

	public static native boolean TGlslIoMapper_getHadError(byte[] ptr);

	public static native byte[] TMatrixSelector();

	public static native byte[] TMatrixSelector(int coord1, int coord2);

	public static native void TMatrixSelector_setCoord1(byte[] ptr, int v);

	public static native void TMatrixSelector_setCoord2(byte[] ptr, int v);

	public static native int TMatrixSelector_getCoord1(byte[] ptr);

	public static native int TMatrixSelector_getCoord2(byte[] ptr);

	public static native byte[] TCall(String pCaller, String pCallee);

	public static native void TCall_setCaller(byte[] ptr, String v);

	public static native void TCall_setCallee(byte[] ptr, String v);

	public static native void TCall_setVisited(byte[] ptr, boolean v);

	public static native void TCall_setCurrentPath(byte[] ptr, boolean v);

	public static native void TCall_setErrorGiven(byte[] ptr, boolean v);

	public static native void TCall_setCalleeBodyPosition(byte[] ptr, int v);

	public static native String TCall_getCaller(byte[] ptr);

	public static native String TCall_getCallee(byte[] ptr);

	public static native boolean TCall_getVisited(byte[] ptr);

	public static native boolean TCall_getCurrentPath(byte[] ptr);

	public static native boolean TCall_getErrorGiven(byte[] ptr);

	public static native int TCall_getCalleeBodyPosition(byte[] ptr);

	public static native byte[] TOffsetRange(byte[] binding, byte[] offset);

	public static native boolean TOffsetRange_overlap(byte[] ptr, byte[] rhs);

	public static native void TOffsetRange_setBinding(byte[] ptr, byte[] v);

	public static native void TOffsetRange_setOffset(byte[] ptr, byte[] v);

	public static native byte[] TOffsetRange_getBinding(byte[] ptr);

	public static native byte[] TOffsetRange_getOffset(byte[] ptr);

	public static native byte[] TXfbBuffer();

	public static native void TXfBuffer_setRanges(byte[] ptr, byte[] v);

	public static native void TXfBuffer_setStride(byte[] ptr, long v);

	public static native void TXfBuffer_setImplicitStride(byte[] ptr, long v);

	public static native void TXfBuffer_setContains64BitType(byte[] ptr, boolean v);

	public static native void TXfBuffer_setContains32BitType(byte[] ptr, boolean v);

	public static native void TXfBuffer_setContains16BitType(byte[] ptr, boolean v);

	public static native byte[] TXfBuffer_getRanges(byte[] ptr);

	public static native long TXfBuffer_getStride(byte[] ptr);

	public static native long TXfBuffer_getImplicitStride(byte[] ptr);

	public static native boolean TXfBuffer_getContains64BitType(byte[] ptr);

	public static native boolean TXfBuffer_getContains32BitType(byte[] ptr);

	public static native boolean TXfBuffer_getContains16BitType(byte[] ptr);

	public static native byte[] TProcesses();

	public static native void TProcesses_addProcess(byte[] ptr, String process);

	public static native void TProcesses_addArgument(byte[] ptr, int arg);

	public static native void TProcesses_addArgument(byte[] ptr, String arg);

	public static native void TProcesses_addIfNonZero(byte[] ptr, String process, int value);

	public static native String[] TProcesses_getProcesses(byte[] ptr);

	public static native byte[] TIdMaps();

	public static native byte[] TIdMaps_operatorAt(byte[] ptr, int i);

	public static native byte[] TNumericFeatures();

	public static native byte[] TNumericFeatures(byte[] rhs);

	public static native byte[] TNumericFeatures_operatorAssign(byte[] ptr, byte[] rhs);

	public static void TNumericFeatures_insert(byte[] ptr, TNumericFeatures_feature f) {
		TNumericFeatures_insert(ptr, f.getConstant());
	}

	public static native void TNumericFeatures_insert(byte[] ptr, int f);

	public static void TNumericFeatures_erase(byte[] ptr, TNumericFeatures_feature f) {
		TNumericFeatures_erase(ptr, f.getConstant());
	}

	public static native void TNumericFeatures_erase(byte[] ptr, int f);

	public static boolean TNumericFeatures_contains(byte[] ptr, TNumericFeatures_feature f) {
		return TNumericFeatures_contains(ptr, f.getConstant());
	}

	public static native boolean TNumericFeatures_contains(byte[] ptr, int f);

	public static void TParseVersions_requireStageMask(byte[] ptr, byte[] loc, EnumSet<EShLanguageMask> languageMask,
			String featureDesc) {
		TParseVersions_requireStageMask(ptr, loc, EShLanguageMask.setToInt(languageMask), featureDesc);
	}

	public static native void TParseVersions_requireStageMask(byte[] ptr, byte[] loc, int languageMask,
			String featureDesc);

	public static void TParseVersions_requireStage(byte[] ptr, byte[] loc, EShLanguage language, String featureDesc) {
		TParseVersions_requireStage(ptr, loc, language.getConstant(), featureDesc);
	}

	public static native void TParseVersions_requireStage(byte[] ptr, byte[] loc, int language, String featureDesc);

	public static native boolean TParseVersions_isEsProfile(byte[] ptr);

	public static native void TParseVersions_requireProfile(byte[] ptr, byte[] loc, int profileMask,
			String featureDesc);

	public static native void TParseVersions_profileRequires(byte[] ptr, byte[] loc, int profileMask, int minVersion,
			String[] extensions, String featureDesc);

	public static native void TParseVersions_profileRequires(byte[] ptr, byte[] loc, int profileMask, int minVersion,
			String extension, String featureDesc);

	public static native void TParseVersions_initializeExtensionBehavior(byte[] ptr);

	public static native void TParseVersions_checkDeprecated(byte[] ptr, byte[] loc, int queryProfiles, int depVersion,
			String featureDesc);

	public static native void TParseVersions_requireNotRemoved(byte[] ptr, byte[] loc, int queryProfiles,
			int removedVersion, String featureDesc);

	public static native void TParseVersions_requireExtensions(byte[] ptr, byte[] loc, String[] extensions,
			String featureDesc);

	public static native void TParseVersions_ppRequireExtensions(byte[] ptr, byte[] loc, String[] extensions,
			String featureDesc);

	public static native int TParseVersions_getExtensionBehavior(byte[] ptr, String s);

	public static native boolean TParseVersions_extensionTurnedOn(byte[] ptr, String extension);

	public static native boolean TParseVersions_extensionsTurnedOn(byte[] ptr, String[] extensions);

	public static native void TParseVersions_updateExtensionBehavior(byte[] ptr, int line, String extension,
			String behavior);

	public static void TParseVersions_updateExtensionBehavior(byte[] ptr, String extension,
			TExtensionBehavior behavior) {
		TParseVersions_updateExtensionBehavior(ptr, extension, behavior.getConstant());
	}

	public static native void TParseVersions_updateExtensionBehavior(byte[] ptr, String extension, int behavior);

	public static native boolean TParseVersions_checkExtensionsRequested(byte[] ptr, byte[] loc, String[] extensions,
			String featureDesc);

	public static native void TParseVersions_checkExtensionStage(byte[] ptr, byte[] loc, String extension);

	public static native void TParseVersions_extensionRequires(byte[] ptr, byte[] loc, String extension,
			String behavior);

	public static native void TParseVersions_fullIntegerCheck(byte[] ptr, byte[] loc, String op);

	public static native void TParseVersions_unimplemented(byte[] ptr, byte[] loc, String featureDesc);

	public static native void TParseVersions_doubleCheck(byte[] ptr, byte[] loc, String op);

	public static void TParseVersions_float16Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_float16Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_float16Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_float16ScalarVectorCheck(byte[] ptr, byte[] loc, String op) {
		TParseVersions_float16ScalarVectorCheck(ptr, loc, op, false);
	}

	public static native void TParseVersions_float16ScalarVectorCheck(byte[] ptr, byte[] loc, String op,
			boolean builtIn);

	public static native boolean TParseVersions_float16Arithmetic(byte[] ptr);

	public static native void TParseVersions_requireFloat16Arithmetic(byte[] ptr, byte[] loc, String op,
			String featureDesc);

	public static void TParseVersions_int16ScalarVectorCheck(byte[] ptr, byte[] loc, String op) {
		TParseVersions_int16ScalarVectorCheck(ptr, loc, op, false);
	}

	public static native void TParseVersions_int16ScalarVectorCheck(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static native boolean TParseVersions_int16Arithmetic(byte[] ptr);

	public static native void TParseVersions_requireInt16Arithmetic(byte[] ptr, byte[] loc, String op,
			String featureDesc);

	public static void TParseVersions_int8ScalarVectorCheck(byte[] ptr, byte[] loc, String op) {
		TParseVersions_int8ScalarVectorCheck(ptr, loc, op, false);
	}

	public static native void TParseVersions_int8ScalarVectorCheck(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static native boolean TParseVersions_int8Arithmetic(byte[] ptr);

	public static native void TParseVersions_requireInt8Arithmetic(byte[] ptr, byte[] loc, String op,
			String featureDesc);

	public static void TParseVersions_float16OpaqueCheck(byte[] ptr, byte[] loc, String op) {
		TParseVersions_float16OpaqueCheck(ptr, loc, op, false);
	}

	public static native void TParseVersions_float16OpaqueCheck(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_int64Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_int64Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_int64Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_explicitInt8Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_explicitInt8Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_explicitInt8Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_explicitInt16Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_explicitInt16Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_explicitInt16Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_explicitInt32Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_explicitInt32Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_explicitInt32Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_explicitFloat32Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_explicitFloat32Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_explicitFloat32Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_explicitFloat64Check(byte[] ptr, byte[] loc, String op) {
		TParseVersions_explicitFloat64Check(ptr, loc, op, false);
	}

	public static native void TParseVersions_explicitFloat64Check(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_fcoopmatCheck(byte[] ptr, byte[] loc, String op) {
		TParseVersions_fcoopmatCheck(ptr, loc, op, false);
	}

	public static native void TParseVersions_fcoopmatCheck(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static void TParseVersions_intcoopmatCheck(byte[] ptr, byte[] loc, String op) {
		TParseVersions_intcoopmatCheck(ptr, loc, op, false);
	}

	public static native void TParseVersions_intcoopmatCheck(byte[] ptr, byte[] loc, String op, boolean builtIn);

	public static native boolean TParseVersions_relaxedErrors(byte[] ptr);

	public static native boolean TParseVersions_suppressWarnings(byte[] ptr);

	public static native boolean TParseVersions_isForwardCompatible(byte[] ptr);

	public static native void TParseVersions_spvRemoved(byte[] ptr, byte[] loc, String op);

	public static native void TParseVersions_vulkanRemoved(byte[] ptr, byte[] loc, String op);

	public static native void TParseVersions_requireVulkan(byte[] ptr, byte[] loc, String op);

	public static native void TParseVersions_requireSpv(byte[] ptr, byte[] loc, String op);

	public static native void TParseVersions_requireSpv(byte[] ptr, byte[] loc, String op, long version);

	public static native void TParseVersions_error(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseVersions_warn(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseVersions_ppError(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseVersions_ppWarn(byte[] ptr, byte[] loc, String szReason, String szToken,
			String szExtraInfoFormat, byte[]... additional);

	public static native void TParseVersions_addError(byte[] ptr);

	public static native int TParseVersions_getNumErrors(byte[] ptr);

	public static native void TParseVersions_setScanner(byte[] ptr, byte[] scanner);

	public static native byte[] TParseVersions_getScanner(byte[] ptr);

	public static native byte[] TParseVersions_getCurrentLoc(byte[] ptr);

	public static native void TParseVersions_setCurrentLine(byte[] ptr, int line);

	public static native void TParseVersions_setCurrentColumn(byte[] ptr, int col);

	public static native void TParseVersions_setCurrentSourceName(byte[] ptr, String name);

	public static native void TParseVersions_setCurrentString(byte[] ptr, int string);

	public static native String TParseVersions_getPreamble(byte[] ptr);

	public static native boolean TParseVersions_isReadingHLSL(byte[] ptr);

	public static native boolean TParseVersions_hlslEnable16BitTypes(byte[] ptr);

	public static native boolean TParseVersions_hlslDX9Compatible(byte[] ptr);

	public static native void TParseVersions_setForwardCompatible(byte[] ptr, boolean v);

	public static native void TParseVersions_setProfile(byte[] ptr, int v);

	public static native void TParseVersions_setInfoSink(byte[] ptr, byte[] v);

	public static native void TParseVersions_setVersion(byte[] ptr, int v);

	public static native void TParseVersions_setLanguage(byte[] ptr, int v);

	public static native void TParseVersions_setSpvVersion(byte[] ptr, byte[] v);

	public static native boolean TParseVersions_getForwardCompatible(byte[] ptr);

	public static native int TParseVersions_getProfile(byte[] ptr);

	public static native byte[] TParseVersions_getInfoSink(byte[] ptr);

	public static native int TParseVersions_getVersion(byte[] ptr);

	public static native int TParseVersions_getLanguage(byte[] ptr);

	public static native byte[] TParseVersions_getSpvVersion(byte[] ptr);

	public static native byte[] TParseVersions_getIntermediate(byte[] ptr);

	public static byte[] TReflection(EnumSet<EShReflectionOptions> opts, EShLanguage first, EShLanguage last) {
		return TReflection(EShReflectionOptions.setToInt(opts), first.getConstant(), last.getConstant());
	}

	public static byte[] TReflection(int opts, EShLanguage first, EShLanguage last) {
		return TReflection(opts, first.getConstant(), last.getConstant());
	}

	public static byte[] TReflection(EnumSet<EShReflectionOptions> opts, int first, EShLanguage last) {
		return TReflection(EShReflectionOptions.setToInt(opts), first, last.getConstant());
	}

	public static byte[] TReflection(EnumSet<EShReflectionOptions> opts, EShLanguage first, int last) {
		return TReflection(EShReflectionOptions.setToInt(opts), first.getConstant(), last);
	}

	public static byte[] TReflection(int opts, int first, EShLanguage last) {
		return TReflection(opts, first, last.getConstant());
	}

	public static byte[] TReflection(int opts, EShLanguage first, int last) {
		return TReflection(opts, first.getConstant(), last);
	}

	public static byte[] TReflection(EnumSet<EShReflectionOptions> opts, int first, int last) {
		return TReflection(EShReflectionOptions.setToInt(opts), first, last);
	}

	public static native byte[] TReflection(int opts, int first, int last);

	public static boolean TReflection_addStage(byte[] ptr, EShLanguage language, byte[] intermediate) {
		return TReflection_addStage(ptr, language.getConstant(), intermediate);
	}

	public static native boolean TReflection_addStage(byte[] ptr, int language, byte[] intermediate);

	public static native int TReflection_getNumUniforms(byte[] ptr);

	public static native byte[] TReflection_getUniform(byte[] ptr, int i);

	public static native int TReflection_getNumUniformBlocks(byte[] ptr);

	public static native byte[] TReflection_getUniformBlock(byte[] ptr, int i);

	public static native int TReflection_getNumPipeInputs(byte[] ptr);

	public static native byte[] TReflection_getPipeInput(byte[] ptr, int i);

	public static native int TReflection_getNumPipeOutputs(byte[] ptr);

	public static native byte[] TReflection_getPipeOutput(byte[] ptr, int i);

	public static native int TReflection_getNumAtomicCounters(byte[] ptr);

	public static native byte[] TReflection_getAtomicCounter(byte[] ptr, int i);

	public static native int TReflection_getNumBufferVariables(byte[] ptr);

	public static native byte[] TReflection_getBufferVariable(byte[] ptr, int i);

	public static native int TReflection_getNumStorageBuffers(byte[] ptr);

	public static native byte[] TReflection_getStorageBufferBlock(byte[] ptr, int i);

	public static native int TReflection_getIndex(byte[] ptr, String name);

	public static native int TReflection_getPipeIOIndex(byte[] ptr, String name, boolean inOrOut);

	public static native long TReflection_getLocalSize(byte[] ptr, int dim);

	public static native void TReflection_dump(byte[] ptr);

	public static native byte[] TFunctionDeclarator();

	public static native void TFunctionDeclarator_setLoc(byte[] ptr, byte[] loc);

	public static native void TFunctionDeclarator_setFunction(byte[] ptr, byte[] function);

	public static native void TFunctionDeclarator_setAttributes(byte[] ptr, byte[] attributes);

	public static native void TFunctionDeclarator_setBody(byte[] ptr, byte[] body);

	public static native byte[] TFunctionDeclarator_getLoc(byte[] ptr);

	public static native byte[] TFunctionDeclarator_getFunction(byte[] ptr);

	public static native byte[] TFunctionDeclarator_getAttributes(byte[] ptr);

	public static native byte[] TFunctionDeclarator_getBody(byte[] ptr);

	public static int HlslOpMap_assignment(EHlslTokenClass op) {
		return HlslOpMap_assignment(op.getConstant());
	}

	public static native int HlslOpMap_assignment(int op);

	public static int HlslOpMap_binary(EHlslTokenClass op) {
		return HlslOpMap_binary(op.getConstant());
	}

	public static native int HlslOpMap_binary(int op);

	public static int HlslOpMap_preUnary(EHlslTokenClass op) {
		return HlslOpMap_preUnary(op.getConstant());
	}

	public static native int HlslOpMap_preUnary(int op);

	public static int HlslOpMap_postUnary(EHlslTokenClass op) {
		return HlslOpMap_postUnary(op.getConstant());
	}

	public static native int HlslOpMap_postUnary(int op);

	public static int HlslOpMap_precedenceLevel(EHlslTokenClass op) {
		return HlslOpMap_precedenceLevel(op.getConstant());
	}

	public static native int HlslOpMap_precedenceLevel(int op);

	public static native byte[] HlslGrammar(byte[] scanner, byte[] parseContext);

	public static native boolean HlslGrammar_parse(byte[] ptr);

	public static byte[] HlslParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink, String sourceEntryPointName) {
		return HlslParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, sourceEntryPointName, false, E_SH_MSG_DEFAULT);
	}

	public static byte[] HlslParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink, String sourceEntryPointName,
			boolean forwardCompatible) {
		return HlslParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, sourceEntryPointName, forwardCompatible, E_SH_MSG_DEFAULT);
	}

	public static byte[] HlslParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			EProfile profile, byte[] spvVersion, EShLanguage language, byte[] sink, String sourceEntryPointName,
			boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return HlslParseContext(table, intermediate, parsingBuiltins, version, profile.getConstant(), spvVersion,
				language.getConstant(), sink, sourceEntryPointName, forwardCompatible, EShMessages.setToInt(messages));
	}

	public static byte[] HlslParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			int profile, byte[] spvVersion, int language, byte[] sink, String sourceEntryPointName) {
		return HlslParseContext(table, intermediate, parsingBuiltins, version, profile, spvVersion, language, sink,
				sourceEntryPointName, false, E_SH_MSG_DEFAULT);
	}

	public static byte[] HlslParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins, int version,
			int profile, byte[] spvVersion, int language, byte[] sink, String sourceEntryPointName,
			boolean forwardCompatible) {
		return HlslParseContext(table, intermediate, parsingBuiltins, version, profile, spvVersion, language, sink,
				sourceEntryPointName, forwardCompatible, E_SH_MSG_DEFAULT);
	}

	public static native byte[] HlslParseContext(byte[] table, byte[] intermediate, boolean parsingBuiltins,
			int version, int profile, byte[] spvVersion, int language, byte[] sink, String sourceEntryPointName,
			boolean forwardCompatible, int messages);

	public static native void HlslParseContext_initializeExtensionBehavior(byte[] ptr);

	public static native void HlslParseContext_setLimits(byte[] ptr, byte[] resources);

	public static boolean HlslParseContext_parseShaderStrings(byte[] ptr, byte[] context, byte[] input) {
		return HlslParseContext_parseShaderStrings(ptr, context, input, false);
	}

	public static native boolean HlslParseContext_parseShaderStrings(byte[] ptr, byte[] context, byte[] input,
			boolean versionWillBeError);

	public static native String HlslParseContext_getGlobalUniformBlockName(byte[] ptr);

	public static native void HlslParseContext_setUniformBlockDefaults(byte[] ptr, byte[] block);

	public static native void HlslParseContext_reservedPpErrorCheck(byte[] ptr, byte[] loc, String name, String op);

	public static native boolean HlslParseContext_lineContinuationCheck(byte[] ptr, byte[] loc, boolean endOfComment);

	public static native boolean HlslParseContext_lineDirectiveShouldSetNextLine(byte[] ptr);

	public static native boolean HlslParseContext_builtInName(byte[] ptr, String s);

	public static native void HlslParseContext_handlePragma(byte[] ptr, byte[] loc, String[] strings);

	public static native byte[] HlslParseContext_handleVariable(byte[] ptr, byte[] loc, String string);

	public static native byte[] HlslParseContext_handleBracketDereference(byte[] ptr, byte[] loc, byte[] base,
			byte[] index);

	public static native byte[] HlslParseContext_handleBracketOperator(byte[] ptr, byte[] loc, byte[] base,
			byte[] index);

	public static byte[] HlslParseContext_handleBinaryMath(byte[] ptr, byte[] loc, String str, TOperator op,
			byte[] left, byte[] right) {
		return HlslParseContext_handleBinaryMath(ptr, loc, str, op.getConstant(), left, right);
	}

	public static native byte[] HlslParseContext_handleBinaryMath(byte[] ptr, byte[] loc, String str, int op,
			byte[] left, byte[] right);

	public static byte[] HlslParseContext_handleUnaryMath(byte[] ptr, byte[] loc, String str, TOperator op,
			byte[] childNode) {
		return HlslParseContext_handleUnaryMath(ptr, loc, str, op.getConstant(), childNode);
	}

	public static native byte[] HlslParseContext_handleUnaryMath(byte[] ptr, byte[] loc, String str, int op,
			byte[] childNode);

	public static native byte[] HlslParseContext_handleDotDereference(byte[] ptr, byte[] loc, byte[] base,
			String field);

	public static native boolean HlslParseContext_isBuiltInMethod(byte[] ptr, byte[] loc, byte[] base, String field);

	public static native void HlslParseContext_assignToInterface(byte[] ptr, byte[] variable);

	public static native void HlslParseContext_handleFunctionDeclarator(byte[] ptr, byte[] loc, byte[] function,
			boolean prototype);

	public static native byte[] HlslParseContext_handleFunctionDefinition(byte[] ptr, byte[] loc, byte[] func,
			byte[] attr, byte[] entryPointTree);

	public static native byte[] HlslParseContext_transformEntryPoint(byte[] ptr, byte[] loc, byte[] func, byte[] attr);

	public static native void HlslParseContext_handleEntryPointAttributes(byte[] ptr, byte[] loc, byte[] attr);

	public static void HlslParseContext_transferTypeAttributes(byte[] ptr, byte[] loc, byte[] attr, byte[] t) {
		HlslParseContext_transferTypeAttributes(ptr, loc, attr, t, false);
	}

	public static native void HlslParseContext_transferTypeAttributes(byte[] ptr, byte[] loc, byte[] attr, byte[] t,
			boolean allowEntry);

	public static native void HlslParseContext_handleFunctionBody(byte[] ptr, byte[] loc, byte[] func,
			byte[] functionBody, byte[] node);

	public static native void HlslParseContext_remapEntryPointIO(byte[] ptr, byte[] function, byte[] returnValue,
			byte[] inputs, byte[] outputs);

	public static native void HlslParseContext_remapNonEntryPointIO(byte[] ptr, byte[] function);

	public static native byte[] HlslParseContext_handleReturnValue(byte[] ptr, byte[] loc, byte[] node);

	public static native void HlslParseContext_handleFunctionArgument(byte[] ptr, byte[] func, byte[] arguments,
			byte[] newArg);

	public static byte[] HlslParseContext_handleAssign(byte[] ptr, byte[] loc, TOperator op, byte[] left,
			byte[] right) {
		return HlslParseContext_handleAssign(ptr, loc, op.getConstant(), left, right);
	}

	public static native byte[] HlslParseContext_handleAssign(byte[] ptr, byte[] loc, int op, byte[] left,
			byte[] right);

	public static byte[] HlslParseContext_handleAssignToMatrixSwizzle(byte[] ptr, byte[] loc, TOperator op, byte[] left,
			byte[] right) {
		return HlslParseContext_handleAssignToMatrixSwizzle(ptr, loc, op.getConstant(), left, right);
	}

	public static native byte[] HlslParseContext_handleAssignToMatrixSwizzle(byte[] ptr, byte[] loc, int op,
			byte[] left, byte[] right);

	public static native byte[] HlslParseContext_handleFunctionCall(byte[] ptr, byte[] loc, byte[] func, byte[] node);

	public static byte[] HlslParseContext_assignClipCullDistance(byte[] ptr, byte[] loc, TOperator op, int semanticId,
			byte[] left, byte[] right) {
		return HlslParseContext_assignClipCullDistance(ptr, loc, op.getConstant(), semanticId, left, right);
	}

	public static native byte[] HlslParseContext_assignClipCullDistance(byte[] ptr, byte[] loc, int op, int semanticId,
			byte[] left, byte[] right);

	public static byte[] HlslParseContext_assignPosition(byte[] ptr, byte[] loc, TOperator op, byte[] left,
			byte[] right) {
		return HlslParseContext_assignPosition(ptr, loc, op.getConstant(), left, right);
	}

	public static native byte[] HlslParseContext_assignPosition(byte[] ptr, byte[] loc, int op, byte[] left,
			byte[] right);

	public static native void HlslParseContext_decomposeIntrinsic(byte[] ptr, byte[] loc, byte[] node,
			byte[] arguments);

	public static native void HlslParseContext_decomposeSampleMethods(byte[] ptr, byte[] loc, byte[] node,
			byte[] arguments);

	public static native void HlslParseContext_decomposeStructBufferMethods(byte[] ptr, byte[] loc, byte[] node,
			byte[] arguments);

	public static native void HlslParseContext_decomposeGeometryMethods(byte[] ptr, byte[] loc, byte[] node,
			byte[] arguments);

	public static native void HlslParseContext_pushFrontArguments(byte[] ptr, byte[] front, byte[] arguments);

	public static native void HlslParseContext_addInputArgumentConversions(byte[] ptr, byte[] func, byte[] node);

	public static native void HlslParseContext_expandArguments(byte[] ptr, byte[] loc, byte[] func, byte[] node);

	public static native byte[] HlslParseContext_addOutputArgumentConversions(byte[] ptr, byte[] func, byte[] node);

	public static native void HlslParseContext_builtInOpCheck(byte[] ptr, byte[] loc, byte[] func, byte[] node);

	public static native byte[] HlslParseContext_makeConstructorCall(byte[] ptr, byte[] loc, byte[] t);

	public static void HlslParseContext_handleSemantic(byte[] ptr, byte[] loc, byte[] qualifier, TBuiltInVariable var,
			String upperCase) {
		HlslParseContext_handleSemantic(ptr, loc, qualifier, var.getConstant(), upperCase);
	}

	public static native void HlslParseContext_handleSemantic(byte[] ptr, byte[] loc, byte[] qualifier, int var,
			String upperCase);

	public static native void HlslParseContext_handlePackOffset(byte[] ptr, byte[] loc, byte[] qualifier,
			String location, String component);

	public static native void HlslParseContext_handleRegister(byte[] ptr, byte[] loc, byte[] qualifier, String profile,
			String desc, int subComponent, String s);

	public static byte[] HlslParseContext_convertConditionalExpression(byte[] ptr, byte[] loc, byte[] node) {
		return HlslParseContext_convertConditionalExpression(ptr, loc, node, true);
	}

	public static native byte[] HlslParseContext_convertConditionalExpression(byte[] ptr, byte[] loc, byte[] node,
			boolean mustBeScalar);

	public static native byte[] HlslParseContext_handleSamplerTextureCombine(byte[] ptr, byte[] loc, byte[] argTex,
			byte[] argSampler);

	public static native boolean HlslParseContext_parseMatrixSwizzleSelector(byte[] ptr, byte[] loc, String s, int cols,
			int rows, byte[] selectors);

	public static native int HlslParseContext_getMatrixComponentsColumn(byte[] ptr, int rows, byte[] selectors);

	public static native void HlslParseContext_assignError(byte[] ptr, byte[] loc, String op, String left,
			String right);

	public static native void HlslParseContext_unaryOpError(byte[] ptr, byte[] loc, String op, String operand);

	public static native void HlslParseContext_binaryOpError(byte[] ptr, byte[] loc, String op, String left,
			String right);

	public static native void HlslParseContext_variableCheck(byte[] ptr, byte[] nodePtr);

	public static native void HlslParseContext_constantValueCheck(byte[] ptr, byte[] node, String token);

	public static native void HlslParseContext_integerCheck(byte[] ptr, byte[] node, String token);

	public static native void HlslParseContext_globalCheck(byte[] ptr, byte[] loc, String token);

	public static boolean HlslParseContext_constructorError(byte[] ptr, byte[] loc, byte[] node, byte[] func,
			TOperator op, byte[] t) {
		return HlslParseContext_constructorError(ptr, loc, node, func, op.getConstant(), t);
	}

	public static native boolean HlslParseContext_constructorError(byte[] ptr, byte[] loc, byte[] node, byte[] func,
			int op, byte[] t);

	public static native void HlslParseContext_arraySizeCheck(byte[] ptr, byte[] loc, byte[] expr, byte[] arraySize);

	public static native void HlslParseContext_arraySizeRequiredCheck(byte[] ptr, byte[] loc, byte[] arraySizes);

	public static native void HlslParseContext_structArrayCheck(byte[] ptr, byte[] loc, byte[] structure);

	public static boolean HlslParseContext_voidErrorCheck(byte[] ptr, byte[] loc, String s, TBasicType t) {
		return HlslParseContext_voidErrorCheck(ptr, loc, s, t.getConstant());
	}

	public static native boolean HlslParseContext_voidErrorCheck(byte[] ptr, byte[] loc, String s, int t);

	public static native void HlslParseContext_globalQualifierFix(byte[] ptr, byte[] loc, byte[] qualifier);

	public static native boolean HlslParseContext_structQualifierErrorCheck(byte[] ptr, byte[] loc, byte[] pType);

	public static native void HlslParseContext_mergeQualifiers(byte[] ptr, byte[] dst, byte[] src);

	public static native int HlslParseContext_computeSamplerTypeIndex(byte[] ptr, byte[] sampler);

	public static native byte[] HlslParseContext_redeclareBuiltinVariable(byte[] ptr, byte[] loc, String s,
			byte[] qualifier, byte[] shaderQualifiers);

	public static native void HlslParseContext_paramFix(byte[] ptr, byte[] type);

	public static native void HlslParseContext_specializationCheck(byte[] ptr, byte[] loc, byte[] t, String op);

	public static native void HlslParseContext_setLayoutQualifier(byte[] ptr, byte[] loc, byte[] qualifier, String s);

	public static native void HlslParseContext_setLayoutQualifier(byte[] ptr, byte[] loc, byte[] qualifier, String s,
			byte[] node);

	public static native void HlslParseContext_setSpecConstantId(byte[] ptr, byte[] loc, byte[] qualifier, int value);

	public static native void HlslParseContext_mergeObjectLayoutQualifiers(byte[] ptr, byte[] dest, byte[] src,
			boolean inheritOnly);

	public static native void HlslParseContext_checkNoShaderLayouts(byte[] ptr, byte[] loc, byte[] shaderQualifiers);

	public static native byte[] HlslParseContext_findFunction(byte[] ptr, byte[] loc, byte[] call, boolean builtIn,
			int thisDepth, byte[] args);

	public static native void HlslParseContext_addGenMulArgumentConversion(byte[] ptr, byte[] loc, byte[] call,
			byte[] args);

	public static native void HlslParseContext_declareTypedef(byte[] ptr, byte[] loc, String identifier, byte[] t);

	public static native void HlslParseContext_declareStruct(byte[] ptr, byte[] loc, String structName, byte[] t);

	public static native byte[] HlslParseContext_lookupUserType(byte[] ptr, String s, byte[] t);

	public static byte[] HlslParseContext_declareVariable(byte[] ptr, byte[] loc, String identifier, byte[] t) {
		return HlslParseContext_declareVariable(ptr, loc, identifier, t, null);
	}

	public static native byte[] HlslParseContext_declareVariable(byte[] ptr, byte[] loc, String identifier, byte[] t,
			byte[] initializer);

	public static native void HlslParseContext_lengthenList(byte[] ptr, byte[] loc, byte[] list, int size,
			byte[] scalarInit);

	public static native byte[] HlslParseContext_handleConstructor(byte[] ptr, byte[] loc, byte[] node, byte[] t);

	public static native byte[] HlslParseContext_addConstructor(byte[] ptr, byte[] loc, byte[] node, byte[] t);

	public static native byte[] HlslParseContext_convertArray(byte[] ptr, byte[] node, byte[] t);

	public static native byte[] HlslParseContext_constructAggregate(byte[] ptr, byte[] node, byte[] t, int i,
			byte[] loc);

	public static byte[] HlslParseContext_constructBuiltIn(byte[] ptr, byte[] t, TOperator op, byte[] node, byte[] loc,
			boolean subset) {
		return HlslParseContext_constructBuiltIn(ptr, t, op.getConstant(), node, loc, subset);
	}

	public static native byte[] HlslParseContext_constructBuiltIn(byte[] ptr, byte[] t, int op, byte[] node, byte[] loc,
			boolean subset);

	public static void HlslParseContext_declareBlock(byte[] ptr, byte[] loc, byte[] t) {
		HlslParseContext_declareBlock(ptr, loc, t, null);
	}

	public static native void HlslParseContext_declareBlock(byte[] ptr, byte[] loc, byte[] t, String instanceName);

	public static native void HlslParseContext_declareStructBufferCounter(byte[] ptr, byte[] loc, byte[] bufferType,
			String name);

	public static native void HlslParseContext_fixBlockLocations(byte[] ptr, byte[] loc, byte[] qualifier, byte[] list,
			boolean memberWithLocation, boolean memberWithoutLocation);

	public static native void HlslParseContext_fixXfbOffsets(byte[] ptr, byte[] qualifier, byte[] list);

	public static native void HlslParseContext_fixBlockUniformOffsets(byte[] ptr, byte[] qualifier, byte[] list);

	public static native void HlslParseContext_addQualifierToExisting(byte[] ptr, byte[] loc, byte[] qualifier,
			String identifier);

	public static native void HlslParseContext_addQualifierToExisting(byte[] ptr, byte[] loc, byte[] qualifier,
			byte[] list);

	public static native void HlslParseContext_updateStandaloneQualifierDefaults(byte[] ptr, byte[] loc, byte[] t);

	public static native void HlslParseContext_wrapupSwitchSubsequence(byte[] ptr, byte[] statements,
			byte[] branchNode);

	public static native byte[] HlslParseContext_addSwitch(byte[] ptr, byte[] loc, byte[] expression, byte[] body,
			byte[] attr);

	public static native void HlslParseContext_nestLooping(byte[] ptr);

	public static native void HlslParseContext_unnestLooping(byte[] ptr);

	public static native void HlslParseContext_nestAnnotations(byte[] ptr);

	public static native void HlslParseContext_unnestAnnotations(byte[] ptr);

	public static native int HlslParseContext_getAnnotationNestingLevel(byte[] ptr);

	public static native void HlslParseContext_pushScope(byte[] ptr);

	public static native void HlslParseContext_popScope(byte[] ptr);

	public static native void HlslParseContext_pushThisScope(byte[] ptr, byte[] t, byte[] declarators);

	public static native void HlslParseContext_popThisScope(byte[] ptr);

	public static native void HlslParseContext_pushImplicitThis(byte[] ptr, byte[] thisParameter);

	public static native void HlslParseContext_popImplicitThis(byte[] ptr);

	public static native byte[] HlslParseContext_getImplicitThis(byte[] ptr, int thisDepth);

	public static native void HlslParseContext_pushNamespace(byte[] ptr, String name);

	public static native void HlslParseContext_popNamespace(byte[] ptr);

	public static native void HlslParseContext_getFullNamespaceName(byte[] ptr, String[] s);

	public static native void HlslParseContext_addScopeMangler(byte[] ptr, String s);

	public static native void HlslParseContext_beginParameterParsing(byte[] ptr, byte[] function);

	public static native void HlslParseContext_pushSwitchSequence(byte[] ptr, byte[] sequence);

	public static native void HlslParseContext_popSwitchSequence(byte[] ptr);

	public static void HlslParseContext_growGlobalUniformBlock(byte[] ptr, byte[] loc, byte[] t, String memberName) {
		HlslParseContext_growGlobalUniformBlock(ptr, loc, t, memberName, null);
	}

	public static native void HlslParseContext_growGlobalUniformBlock(byte[] ptr, byte[] loc, byte[] t,
			String memberName, byte[] typeList);

	public static native byte[] HlslParseContext_handleLvalue(byte[] ptr, byte[] loc, String op, byte[] node);

	public static native boolean HlslParseContext_lValueErrorCheck(byte[] ptr, byte[] loc, String op, byte[] node);

	public static native int HlslParseContext_getLayoutFromTxType(byte[] ptr, byte[] loc, byte[] t);

	public static boolean HlslParseContext_handleOutputGeometry(byte[] ptr, byte[] loc, TLayoutGeometry geometry) {
		return HlslParseContext_handleOutputGeometry(ptr, loc, geometry.getConstant());
	}

	public static native boolean HlslParseContext_handleOutputGeometry(byte[] ptr, byte[] loc, int geometry);

	public static boolean HlslParseContext_handleInputGeometry(byte[] ptr, byte[] loc, TLayoutGeometry geometry) {
		return HlslParseContext_handleInputGeometry(ptr, loc, geometry.getConstant());
	}

	public static native boolean HlslParseContext_handleInputGeometry(byte[] ptr, byte[] loc, int geometry);

	public static native void HlslParseContext_handleSelectionAttributes(byte[] ptr, byte[] loc, byte[] node,
			byte[] attributes);

	public static native void HlslParseContext_handleSwitchAttributes(byte[] ptr, byte[] loc, byte[] node,
			byte[] attributes);

	public static native void HlslParseContext_handleLoopAttributes(byte[] ptr, byte[] loc, byte[] node,
			byte[] attributes);

	public static native void HlslParseContext_shareStructBufferType(byte[] ptr, byte[] t);

	public static native boolean HlslParseContext_setTextureReturnType(byte[] ptr, byte[] sampler, byte[] retType,
			byte[] loc);

	public static native void HlslParseContext_getTextureReturnType(byte[] ptr, byte[] sampler, byte[] retType);

	public static native int HlslParseContext_attributeFromName(byte[] ptr, String nameSpace, String name);

	public static native byte[] TBuiltInParseablesHlsl();

	public static void TBuiltInParseablesHlsl_initialize(byte[] ptr, int version, EProfile profile, byte[] spvVersion) {
		TBuiltInParseablesHlsl_initialize(ptr, version, profile.getConstant(), spvVersion);
	}

	public static native void TBuiltInParseablesHlsl_initialize(byte[] ptr, int version, int profile,
			byte[] spvVersion);

	public static void TBuiltInParseablesHlsl_initialize(byte[] ptr, byte[] resources, int version, EProfile profile,
			byte[] spvVersion, EShLanguage language) {
		TBuiltInParseablesHlsl_initialize(ptr, resources, version, profile.getConstant(), spvVersion,
				language.getConstant());
	}

	public static void TBuiltInParseablesHlsl_initialize(byte[] ptr, byte[] resources, int version, int profile,
			byte[] spvVersion, EShLanguage language) {
		TBuiltInParseablesHlsl_initialize(ptr, resources, version, profile, spvVersion, language.getConstant());
	}

	public static void TBuiltInParseablesHlsl_initialize(byte[] ptr, byte[] resources, int version, EProfile profile,
			byte[] spvVersion, int language) {
		TBuiltInParseablesHlsl_initialize(ptr, resources, version, profile.getConstant(), spvVersion, language);
	}

	public static native void TBuiltInParseablesHlsl_initialize(byte[] ptr, byte[] resources, int version, int profile,
			byte[] spvVersion, int language);

	public static void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, EProfile profile,
			byte[] spvVersion, EShLanguage language, byte[] symbolTable) {
		TBuiltInParseablesHlsl_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language.getConstant(),
				symbolTable);
	}

	public static void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable) {
		TBuiltInParseablesHlsl_identifyBuiltIns(ptr, version, profile, spvVersion, language.getConstant(), symbolTable);
	}

	public static void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, EProfile profile,
			byte[] spvVersion, int language, byte[] symbolTable) {
		TBuiltInParseablesHlsl_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language, symbolTable);
	}

	public static native void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, int profile,
			byte[] spvVersion, int language, byte[] symbolTable);

	public static void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, EProfile profile,
			byte[] spvVersion, EShLanguage language, byte[] symbolTable, byte[] resources) {
		TBuiltInParseablesHlsl_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language.getConstant(),
				symbolTable, resources);
	}

	public static void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, int profile, byte[] spvVersion,
			EShLanguage language, byte[] symbolTable, byte[] resources) {
		TBuiltInParseablesHlsl_identifyBuiltIns(ptr, version, profile, spvVersion, language.getConstant(), symbolTable,
				resources);
	}

	public static void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, EProfile profile,
			byte[] spvVersion, int language, byte[] symbolTable, byte[] resources) {
		TBuiltInParseablesHlsl_identifyBuiltIns(ptr, version, profile.getConstant(), spvVersion, language, symbolTable,
				resources);
	}

	public static native void TBuiltInParseablesHlsl_identifyBuiltIns(byte[] ptr, int version, int profile,
			byte[] spvVersion, int language, byte[] symbolTable, byte[] resources);

	public static native byte[] HlslToken();

	public static native void HlslToken_setLoc(byte[] ptr, byte[] loc);

	public static void HlslToken_setTokenClass(byte[] ptr, EHlslTokenClass tokenClass) {
		HlslToken_setTokenClass(ptr, tokenClass.getConstant());
	}

	public static native void HlslToken_setTokenClass(byte[] ptr, int tokenClass);

	public static native void HlslToken_setString(byte[] ptr, String string);

	public static native void HlslToken_setI(byte[] ptr, int i);

	public static native void HlslToken_setU(byte[] ptr, long u);

	public static native void HlslToken_setB(byte[] ptr, boolean b);

	public static native void HlslToken_setD(byte[] ptr, double d);

	public static native byte[] HlslToken_getLoc(byte[] ptr);

	public static native int HlslToken_getTokenClass(byte[] ptr);

	public static native String HlslToken_getString(byte[] ptr);

	public static native int HlslToken_getI(byte[] ptr);

	public static native long HlslToken_getU(byte[] ptr);

	public static native boolean HlslToken_getB(byte[] ptr);

	public static native double HlslToken_getD(byte[] ptr);

	public static native byte[] HlslScanContext(byte[] parseContext, byte[] ppContext);

	public static native void HlslScanContext_fillInKeywordMap();

	public static native void HlslScanContext_deleteKeywordMap();

	public static native void HlslScanContext_tokenize(byte[] ptr, byte[] token);

	public static native int HlslScanContext_mapSemantic(byte[] ptr, String s);

	public static native byte[] HlslTokenStream(byte[] scanner);

	public static native void HlslTokenStream_advanceToken(byte[] ptr);

	public static native void HlslTokenStream_recedeToken(byte[] ptr);

	public static boolean HlslTokenStream_acceptTokenClass(byte[] ptr, EHlslTokenClass tokenClass) {
		return HlslTokenStream_acceptTokenClass(ptr, tokenClass.getConstant());
	}

	public static native boolean HlslTokenStream_acceptTokenClass(byte[] ptr, int tokenClass);

	public static native int HlslTokenStream_peek(byte[] ptr);

	public static boolean HlslTokenStream_peekTokenClass(byte[] ptr, EHlslTokenClass tokenClass) {
		return HlslTokenStream_peekTokenClass(ptr, tokenClass.getConstant());
	}

	public static native boolean HlslTokenStream_peekTokenClass(byte[] ptr, int tokenClass);

	public static native int HlslTokenStream_mapSemantic(byte[] ptr, String upperCase);

	public static native void HlslTokenStream_pushTokenStream(byte[] ptr, byte[] tokens);

	public static native void HlslTokenStream_popTokenStream(byte[] ptr);

	public static native byte[] SpvVersion();

	public static native void SpvVersion_setSpv(byte[] ptr, long v);

	public static native void SpvVersion_setVulkanGlsl(byte[] ptr, int v);

	public static native void SpvVersion_setVulkan(byte[] ptr, int v);

	public static native void SpvVersion_setOpenGl(byte[] ptr, int v);

	public static native long SpvVersion_getSpv(byte[] ptr);

	public static native int SpvVersion_getVulkanGlsl(byte[] ptr);

	public static native int SpvVersion_getVulkan(byte[] ptr);

	public static native int SpvVersion_getOpenGl(byte[] ptr);

	public static native byte[] TVector();

	public static native byte[] TVector(byte[] allocator);

	public static native byte[] TVector(int i);

	public static native byte[] TVector(int i, byte[] val);

	public static native byte[] TList();

	public static native byte[] TMap();

	public static native byte[] pool_allocator();

	public static native byte[] pool_allocatorByTPoolAllocator(byte[] a);

	public static native byte[] pool_allocator(byte[] p);

	public static native byte[] pool_allocator_address(byte[] ptr, byte[] x);

	public static native byte[] pool_allocator_allocate(byte[] ptr, long n);// NOTE: Interface not exact. size_t might
																			// be larger than long.

	public static native byte[] pool_allocator_allocate(byte[] ptr, long n, byte[] ref);// NOTE: Interface not exact.
																						// size_t might be larger than
																						// long.

	public static native void pool_allocator_deallocate(byte[] ptr, byte[] ref, long n);// NOTE: Interface not exact.
																						// size_t might be larger than
																						// long.

	public static native byte[] pool_allocator__Charalloc(byte[] ptr, long n);// NOTE: Interface not exact. size_t might
																				// be larger than long.

	public static native void pool_allocator_construct(byte[] ptr, byte[] p, byte[] val);

	public static native void pool_allocator_destroy(byte[] ptr, byte[] p);

	public static native long pool_allocator_max_size(byte[] ptr);// NOTE: Interface not exact. size_t might be larger
																	// than long.

	public static native long pool_allocator_max_size(byte[] ptr, int size);// NOTE: Interface not exact. size_t might
																			// be larger than long.

	public static native byte[] pool_allocator_getAllocator(byte[] ptr);

	public static native boolean pool_allocator_operatorEqual(byte[] ptr, byte[] rhs);

	public static native boolean pool_allocator_operatorNotEqual(byte[] ptr, byte[] rhs);

	public static native byte[] IntKeyedIntArrayCMap();

	public static native int IntKeyedIntArrayCMap_size(byte[] ptr);

	public static native boolean IntKeyedIntArrayCMap_isEmpty(byte[] ptr);

	public static native boolean IntKeyedIntArrayCMap_containsKey(byte[] ptr, int key);

	public static native boolean IntKeyedIntArrayCMap_containsValue(byte[] ptr, int[] value);

	public static native int[] IntKeyedIntArrayCMap_get(byte[] ptr, int key);

	public static native int[] IntKeyedIntArrayCMap_put(byte[] ptr, int key, int[] value);

	public static native int[] IntKeyedIntArrayCMap_remove(byte[] ptr, int key);

	public static native void IntKeyedIntArrayCMap_clear(byte[] ptr);

	public static native int[] IntKeyedIntArrayCMap_keys(byte[] ptr);

	public static native int[][] IntKeyedIntArrayCMap_values(byte[] ptr);

	public static native byte[] IntKeyedIntArrayCMap_entries(byte[] ptr);// Returns Array of entries

	public static native byte[] IntKeyedIntArrayCEntry();

	public static native int IntKeyedIntArrayCEntry_getKey(byte[] ptr);

	public static native int[] IntKeyedIntArrayCEntry_getValue(byte[] ptr);

	public static native int[] IntKeyedIntArrayCEntry_setValue(byte[] ptr, int[] value);

	public static native byte[] IntKeyedCMap();

	public static native int IntKeyedCMap_size(byte[] ptr);

	public static native boolean IntKeyedCMap_isEmpty(byte[] ptr);

	public static native boolean IntKeyedCMap_containsKey(byte[] ptr, int key);

	public static native boolean IntKeyedCMap_containsValue(byte[] ptr, byte[] value);

	public static native byte[] IntKeyedCMap_get(byte[] ptr, int key);

	public static native byte[] IntKeyedCMap_put(byte[] ptr, int key, byte[] value);

	public static native byte[] IntKeyedCMap_remove(byte[] ptr, int key);

	public static native void IntKeyedCMap_clear(byte[] ptr);

	public static native int[] IntKeyedCMap_keys(byte[] ptr);

	public static native byte[] IntKeyedCMap_values(byte[] ptr);

	public static native byte[] IntKeyedCMap_entries(byte[] ptr);// Returns Array of entries

	public static native byte[] IntKeyedCEntry();

	public static native int IntKeyedCEntry_getKey(byte[] ptr);

	public static native byte[] IntKeyedCEntry_getValue(byte[] ptr);

	public static native byte[] IntKeyedCEntry_setValue(byte[] ptr, byte[] value);

	public static native byte[] IntCMap();

	public static native int IntCMap_size(byte[] ptr);

	public static native boolean IntCMap_isEmpty(byte[] ptr);

	public static native boolean IntCMap_containsKey(byte[] ptr, byte[] key);

	public static native boolean IntCMap_containsValue(byte[] ptr, int value);

	public static native int IntCMap_get(byte[] ptr, byte[] key);

	public static native int IntCMap_put(byte[] ptr, byte[] key, int value);

	public static native int IntCMap_remove(byte[] ptr, byte[] key);

	public static native void IntCMap_clear(byte[] ptr);

	public static native byte[] IntCMap_keySet(byte[] ptr);

	public static native int[] IntCMap_values(byte[] ptr);

	public static native byte[] IntCMap_entries(byte[] ptr);// Returns Array of entries

	public static native byte[] IntCEntry();

	public static native byte[] IntCEntry_getKey(byte[] ptr);

	public static native int IntCEntry_getValue(byte[] ptr);

	public static native int IntCEntry_setValue(byte[] ptr, int value);

	public static native byte[] CMap();

	public static native int CMap_size(byte[] ptr);

	public static native boolean CMap_isEmpty(byte[] ptr);

	public static native boolean CMap_containsKey(byte[] ptr, byte[] key);

	public static native boolean CMap_containsValue(byte[] ptr, byte[] value);

	public static native byte[] CMap_get(byte[] ptr, byte[] key);

	public static native byte[] CMap_put(byte[] ptr, byte[] key, byte[] value);

	public static native byte[] CMap_remove(byte[] ptr, byte[] key);

	public static native void CMap_clear(byte[] ptr);

	public static native byte[] CMap_keySet(byte[] ptr);

	public static native byte[] CMap_values(byte[] ptr);

	public static native byte[] CMap_entries(byte[] ptr);// Returns Array of entries

	public static native byte[] CEntry();

	public static native byte[] CEntry_getKey(byte[] ptr);

	public static native byte[] CEntry_getValue(byte[] ptr);

	public static native byte[] CEntry_setValue(byte[] ptr, byte[] value);

	public static native byte[] CPair();

	public static native byte[] CPair_getFirst(byte[] ptr);

	public static native byte[] CPair_getLast(byte[] ptr);

	public static native byte[] CPair_setFirst(byte[] ptr, byte[] value);

	public static native byte[] CPair_setLast(byte[] ptr, byte[] value);

	public static native byte[] CList();

	public static native int CList_size(byte[] ptr);

	public static native boolean CList_isEmpty(byte[] ptr);

	public static native boolean CList_contains(byte[] ptr, byte[] o);

	public static native byte[] CList_iterator(byte[] ptr);

	public static native boolean CList_add(byte[] ptr, byte[] e);

	public static native boolean CList_remove(byte[] ptr, byte[] o);

	public static native void CList_insert(byte[] ptr, int index, byte[] array);

	public static native void CList_clear(byte[] ptr);

	public static native byte[] CList_get(byte[] ptr, int index);

	public static native byte[] CList_set(byte[] ptr, int index, byte[] element);

	public static native void CList_add(byte[] ptr, int index, byte[] element);

	public static native byte[] CList_remove(byte[] ptr, int index);

	public static native int CList_indexOf(byte[] ptr, byte[] o);

	public static native int CList_lastIndexOf(byte[] ptr, byte[] o);

	public static native byte[] CList_listIterator(byte[] ptr);

	public static native byte[] CList_listIterator(byte[] ptr, int index);

	public static native byte[] CVector();

	public static native int CVector_size(byte[] ptr);

	public static native boolean CVector_isEmpty(byte[] ptr);

	public static native boolean CVector_contains(byte[] ptr, byte[] o);

	public static native byte[] CVector_iterator(byte[] ptr);

	public static native boolean CVector_add(byte[] ptr, byte[] e);

	public static native boolean CVector_remove(byte[] ptr, byte[] o);

	public static native void CVector_insert(byte[] ptr, int index, byte[] array);

	public static native void CVector_clear(byte[] ptr);

	public static native byte[] CVector_get(byte[] ptr, int index);

	public static native byte[] CVector_set(byte[] ptr, int index, byte[] element);

	public static native void CVector_add(byte[] ptr, int index, byte[] element);

	public static native byte[] CVector_remove(byte[] ptr, int index);

	public static native int CVector_indexOf(byte[] ptr, byte[] o);

	public static native int CVector_lastIndexOf(byte[] ptr, byte[] o);

	public static native byte[] CVector_listIterator(byte[] ptr);

	public static native byte[] CVector_listIterator(byte[] ptr, int index);

	public static native byte[] CSet();

	public static native int CSet_size(byte[] ptr);

	public static native boolean CSet_isEmpty(byte[] ptr);

	public static native boolean CSet_contains(byte[] ptr, byte[] o);

	public static native byte[] CSet_iterator(byte[] ptr);

	public static native boolean CSet_add(byte[] ptr, byte[] e);

	public static native boolean CSet_remove(byte[] ptr, byte[] o);

	public static native void CSet_clear(byte[] ptr);

	public static native boolean CIterator_hasNext(byte[] ptr);

	public static native byte[] CIterator_next(byte[] ptr);

	public static native boolean CListIterator_hasPrevious(byte[] ptr);

	public static native byte[] CListIterator_previous(byte[] ptr);

	public static native int CListIterator_nextIndex(byte[] ptr);

	public static native int CListIterator_previousIndex(byte[] ptr);

	public static native void CListIterator_remove(byte[] ptr);

	public static native void CListIterator_set(byte[] ptr, byte[] e);

	public static native void CListIterator_add(byte[] ptr, byte[] e);

	public static native boolean CPrimitiveIterator_OfDouble_hasNext(byte[] ptr);

	public static native double CPrimitiveIterator_OfDouble_next(byte[] ptr);

	public static native boolean CPrimitiveIterator_OfInt_hasNext(byte[] ptr);

	public static native int CPrimitiveIterator_OfInt_next(byte[] ptr);

	public static native boolean CPrimitiveIterator_OfLong_hasNext(byte[] ptr);

	public static native long CPrimitiveIterator_OfLong_next(byte[] ptr);

	// SPIRV
	public static native byte[] SpvBuildLogger();

	public static native void SpvBuildLogger_tbdFunctionality(byte[] ptr, String f);

	public static native void SpvBuildLogger_missingFunctionality(byte[] ptr, String f);

	public static native void SpvBuildLogger_warning(byte[] ptr, String w);

	public static native void SpvBuildLogger_error(byte[] ptr, String e);

	public static native String SpvBuildLogger_getAllMessages(byte[] ptr);

	public static byte[] spirvbin_t() {
		return spirvbin_t(0);
	}

	public static native byte[] spirvbin_t(int verbose);

	public static void spirvbin_t_remap(byte[] ptr, long[] spv) {
		spirvbin_t_remap(ptr, spv, SPIRVBIN_BASE_T_OPTIONS_DO_EVERYTHING);
	}

	public static native void spirvbin_t_remap(byte[] ptr, long[] spv, long opts);

	public static native void spirvbin_t_registerErrorHandler(Void_String handler);

	public static native void spirvbin_t_registerLogHandler(Void_String handler);

	public static native byte[] Builder(long spvVersion, long userNumber, byte[] logger);

	public static native long Builder_getSpvVersion(byte[] ptr);

	public static void Builder_setSource(byte[] ptr, SourceLanguage lang, int version) {
		Builder_setSource(ptr, lang.getConstant(), version);
	}

	public static native void Builder_setSource(byte[] ptr, int lang, int version);

	public static native long Builder_getStringId(byte[] ptr, String str);

	public static native void Builder_setSourceFile(byte[] ptr, String file);

	public static native void Builder_setSourceText(byte[] ptr, String text);

	public static native void Builder_addSourceExtension(byte[] ptr, String ext);

	public static native void Builder_addModuleProcessed(byte[] ptr, String p);

	public static native void Builder_setEmitOpLines(byte[] ptr);

	public static native void Builder_addExtension(byte[] ptr, String ext);

	public static native void Builder_removeExtension(byte[] ptr, String ext);

	public static void Builder_addIncorporatedExtension(byte[] ptr, String ext, SpvVersion incorporatedVersion) {
		Builder_addIncorporatedExtension(ptr, ext, incorporatedVersion.getConstant());
	}

	public static native void Builder_addIncorporatedExtension(byte[] ptr, String ext, int incorporatedVersion);

	public static void Builder_promoteIncorporatedExtension(byte[] ptr, String baseExt, String promoExt,
			SpvVersion incorporatedVersion) {
		Builder_promoteIncorporatedExtension(ptr, baseExt, promoExt, incorporatedVersion.getConstant());
	}

	public static native void Builder_promoteIncorporatedExtension(byte[] ptr, String baseExt, String promoExt,
			int incorporatedVersion);

	public static native void Builder_addInclude(byte[] ptr, String name, String text);

	public static native long Builder_import(byte[] ptr, String s);

	public static void Builder_setMemoryModel(byte[] ptr, AddressingModel addr, MemoryModel mem) {
		Builder_setMemoryModel(ptr, addr.getConstant(), mem.getConstant());
	}

	public static void Builder_setMemoryModel(byte[] ptr, int addr, MemoryModel mem) {
		Builder_setMemoryModel(ptr, addr, mem.getConstant());
	}

	public static void Builder_setMemoryModel(byte[] ptr, AddressingModel addr, int mem) {
		Builder_setMemoryModel(ptr, addr.getConstant(), mem);
	}

	public static native void Builder_setMemoryModel(byte[] ptr, int addr, int mem);

	public static void Builder_addCapability(byte[] ptr, Capability cap) {
		Builder_addCapability(ptr, cap.getConstant());
	}

	public static native void Builder_addCapability(byte[] ptr, int cap);

	public static native long Builder_getUniqueId(byte[] ptr);

	public static native long Builder_getUniqueIds(byte[] ptr, int numIds);

	public static native void Builder_setLine(byte[] ptr, int line);

	public static native void Builder_setLine(byte[] ptr, int line, String filename);

	public static native void Builder_addLine(byte[] ptr, long fileName, int line, int column);

	public static native long Builder_makeVoidType(byte[] ptr);

	public static native long Builder_makeBoolType(byte[] ptr);

	public static long Builder_makePointer(byte[] ptr, StorageClass storageClass, long pointee) {
		return Builder_makePointer(ptr, storageClass.getConstant(), pointee);
	}

	public static native long Builder_makePointer(byte[] ptr, int storageClass, long pointee);

	public static long Builder_makeForwardPointer(byte[] ptr, StorageClass storageClass) {
		return Builder_makeForwardPointer(ptr, storageClass.getConstant());
	}

	public static native long Builder_makeForwardPointer(byte[] ptr, int storageClass);

	public static long Builder_makePointerFromForwardPointer(byte[] ptr, StorageClass storageClass,
			long forwardPointerType, long pointee) {
		return Builder_makePointerFromForwardPointer(ptr, storageClass.getConstant(), forwardPointerType, pointee);
	}

	public static native long Builder_makePointerFromForwardPointer(byte[] ptr, int storageClass,
			long forwardPointerType, long pointee);

	public static native long Builder_makeIntegerType(byte[] ptr, int width, boolean hasSign);

	public static native long Builder_makeIntType(byte[] ptr, int width);

	public static native long Builder_makeUintType(byte[] ptr, int width);

	public static native long Builder_makeFloatType(byte[] ptr, int width);

	public static native long Builder_makeStructType(byte[] ptr, long[] members, String s);

	public static native long Builder_makeStructResultType(byte[] ptr, long type0, long type1);

	public static native long Builder_makeVectorType(byte[] ptr, long component, int size);

	public static native long Builder_makeMatrixType(byte[] ptr, long component, int cols, int rows);

	public static native long Builder_makeArrayType(byte[] ptr, long element, long sizeId, int stride);

	public static native long Builder_makeRuntimeArray(byte[] ptr, long element);

	public static native long Builder_makeFunctionType(byte[] ptr, long returnType, long[] paramTypes);

	public static long Builder_makeImageType(byte[] ptr, long sampledType, Dim dim, boolean depth, boolean arrayed,
			boolean ms, long sampled, ImageFormat format) {
		return Builder_makeImageType(ptr, sampledType, dim.getConstant(), depth, arrayed, ms, sampled,
				format.getConstant());
	}

	public static long Builder_makeImageType(byte[] ptr, long sampledType, int dim, boolean depth, boolean arrayed,
			boolean ms, long sampled, ImageFormat format) {
		return Builder_makeImageType(ptr, sampledType, dim, depth, arrayed, ms, sampled, format.getConstant());
	}

	public static long Builder_makeImageType(byte[] ptr, long sampledType, Dim dim, boolean depth, boolean arrayed,
			boolean ms, long sampled, int format) {
		return Builder_makeImageType(ptr, sampledType, dim.getConstant(), depth, arrayed, ms, sampled, format);
	}

	public static native long Builder_makeImageType(byte[] ptr, long sampledType, int dim, boolean depth,
			boolean arrayed, boolean ms, long sampled, int format);

	public static native long Builder_makeSamplerType(byte[] ptr);

	public static native long Builder_makeSampledImageType(byte[] ptr, long imageType);

	public static native long Builder_makeCooperativeMatrixType(byte[] ptr, long component, long scope, long rows,
			long cols);

	public static native long Builder_makeAccelerationStructureType(byte[] ptr);

	public static native long Builder_makeRayQueryType(byte[] ptr);

	public static native long Builder_getTypeId(byte[] ptr, long resultId);

	public static native long Builder_getDerefTypeId(byte[] ptr, long resultId);

	public static native int Builder_getOpCode(byte[] ptr, long id);

	public static native int Builder_getTypeClass(byte[] ptr, long typeId);

	public static native int Builder_getMostBasicTypeClass(byte[] ptr, long typeId);

	public static native int Builder_getNumComponents(byte[] ptr, long resultId);

	public static native int Builder_getNumTypeConstituents(byte[] ptr, long typeId);

	public static native int Builder_getNumTypeComponents(byte[] ptr, long typeId);

	public static native long Builder_getScalarTypeId(byte[] ptr, long typeId);

	public static native long Builder_getContainedTypeId(byte[] ptr, long typeId);

	public static native long Builder_getContainedTypeId(byte[] ptr, long typeId, int i);

	public static native int Builder_getTypeStorageClass(byte[] ptr, long typeId);

	public static native int Builder_getImageTypeFormat(byte[] ptr, long typeId);

	public static native boolean Builder_isPointer(byte[] ptr, long resultId);

	public static native boolean Builder_isScalar(byte[] ptr, long resultId);

	public static native boolean Builder_isVector(byte[] ptr, long resultId);

	public static native boolean Builder_isMatrix(byte[] ptr, long resultId);

	public static native boolean Builder_isCooperativeMatrix(byte[] ptr, long resultId);

	public static native boolean Builder_isAggregate(byte[] ptr, long resultId);

	public static native boolean Builder_isSampledImage(byte[] ptr, long resultId);

	public static native boolean Builder_isBoolType(byte[] ptr, long typeId);

	public static native boolean Builder_isIntType(byte[] ptr, long typeId);

	public static native boolean Builder_isUintType(byte[] ptr, long typeId);

	public static native boolean Builder_isFloatType(byte[] ptr, long typeId);

	public static native boolean Builder_isPointerType(byte[] ptr, long typeId);

	public static native boolean Builder_isScalarType(byte[] ptr, long typeId);

	public static native boolean Builder_isVectorType(byte[] ptr, long typeId);

	public static native boolean Builder_isMatrixType(byte[] ptr, long typeId);

	public static native boolean Builder_isStructType(byte[] ptr, long typeId);

	public static native boolean Builder_isArrayType(byte[] ptr, long typeId);

	public static native boolean Builder_isCooperativeMatrixType(byte[] ptr, long typeId);

	public static native boolean Builder_isAggregateType(byte[] ptr, long typeId);

	public static native boolean Builder_isImageType(byte[] ptr, long typeId);

	public static native boolean Builder_isSamplerType(byte[] ptr, long typeId);

	public static native boolean Builder_isSampledImageType(byte[] ptr, long typeId);

	public static boolean Builder_containsType(byte[] ptr, long typeId, Op typeOp, long width) {
		return Builder_containsType(ptr, typeId, typeOp.getConstant(), width);
	}

	public static native boolean Builder_containsType(byte[] ptr, long typeId, int typeOp, long width);

	public static native boolean Builder_containsPhysicalStorageBufferOrArray(byte[] ptr, long typeId);

	public static boolean Builder_isConstantOpCode(byte[] ptr, Op typeOp) {
		return Builder_isConstantOpCode(ptr, typeOp.getConstant());
	}

	public static native boolean Builder_isConstantOpCode(byte[] ptr, int opcode);

	public static boolean Builder_isSpecConstantOpCode(byte[] ptr, Op typeOp) {
		return Builder_isSpecConstantOpCode(ptr, typeOp.getConstant());
	}

	public static native boolean Builder_isSpecConstantOpCode(byte[] ptr, int opcode);

	public static native boolean Builder_isConstant(byte[] ptr, long resultId);

	public static native boolean Builder_isConstantScalar(byte[] ptr, long resultId);

	public static native boolean Builder_isSpecConstant(byte[] ptr, long resultId);

	public static native long Builder_getConstantScalar(byte[] ptr, long resultId);

	public static native int Builder_getStorageClass(byte[] ptr, long resultId);

	public static boolean Builder_isVariableOpCode(byte[] ptr, Op typeOp) {
		return Builder_isVariableOpCode(ptr, typeOp.getConstant());
	}

	public static native boolean Builder_isVariableOpCode(byte[] ptr, int opcode);

	public static native boolean Builder_isVariable(byte[] ptr, long resultId);

	public static native boolean Builder_isGlobalStorage(byte[] ptr, long resultId);

	public static native boolean Builder_isGlobalVariable(byte[] ptr, long resultId);

	public static native boolean Builder_isValidInitializer(byte[] ptr, long resultId);

	public static native int Builder_getScalarTypeWidth(byte[] ptr, long typeId);

	public static native int Builder_getTypeNumColumns(byte[] ptr, long typeId);

	public static native int Builder_getNumColumns(byte[] ptr, long resultId);

	public static native int Builder_getTypeNumRows(byte[] ptr, long typeId);

	public static native int Builder_getNumRows(byte[] ptr, long resultId);

	public static native int Builder_getTypeDimensionality(byte[] ptr, long typeId);

	public static native long Builder_getImageType(byte[] ptr, long resultId);

	public static native boolean Builder_isArrayedImageType(byte[] ptr, long typeId);

	public static long Builder_makeBoolConstant(byte[] ptr, boolean b) {
		return Builder_makeBoolConstant(ptr, b, false);
	}

	public static native long Builder_makeBoolConstant(byte[] ptr, boolean b, boolean specConstant);

	public static long Builder_makeInt8Constant(byte[] ptr, int i) {
		return Builder_makeInt8Constant(ptr, i, false);
	}

	public static native long Builder_makeInt8Constant(byte[] ptr, int i, boolean specConstant);

	public static long Builder_makeUint8Constant(byte[] ptr, long u) {
		return Builder_makeUint8Constant(ptr, u, false);
	}

	public static native long Builder_makeUint8Constant(byte[] ptr, long u, boolean specConstant);

	public static long Builder_makeInt16Constant(byte[] ptr, int i) {
		return Builder_makeInt16Constant(ptr, i, false);
	}

	public static native long Builder_makeInt16Constant(byte[] ptr, int i, boolean specConstant);

	public static long Builder_makeUint16Constant(byte[] ptr, long u) {
		return Builder_makeUint16Constant(ptr, u, false);
	}

	public static native long Builder_makeUint16Constant(byte[] ptr, long u, boolean specConstant);

	public static long Builder_makeIntConstant(byte[] ptr, int i) {
		return Builder_makeIntConstant(ptr, i, false);
	}

	public static native long Builder_makeIntConstant(byte[] ptr, int i, boolean specConstant);

	public static long Builder_makeUintConstant(byte[] ptr, long u) {
		return Builder_makeUintConstant(ptr, u, false);
	}

	public static native long Builder_makeUintConstant(byte[] ptr, long u, boolean specConstant);

	public static long Builder_makeInt64Constant(byte[] ptr, BigInteger i) {
		return Builder_makeInt64Constant(ptr, i, false);
	}

	public static native long Builder_makeInt64Constant(byte[] ptr, BigInteger i, boolean specConstant);

	public static long Builder_makeUint64Constant(byte[] ptr, BigInteger u) {
		return Builder_makeUint64Constant(ptr, u, false);
	}

	public static native long Builder_makeUint64Constant(byte[] ptr, BigInteger u, boolean specConstant);

	public static long Builder_makeFloatConstant(byte[] ptr, float f) {
		return Builder_makeFloatConstant(ptr, f, false);
	}

	public static native long Builder_makeFloatConstant(byte[] ptr, float f, boolean specConstant);

	public static long Builder_makeDoubleConstant(byte[] ptr, double d) {
		return Builder_makeDoubleConstant(ptr, d, false);
	}

	public static native long Builder_makeDoubleConstant(byte[] ptr, double d, boolean specConstant);

	public static long Builder_makeFloat16Constant(byte[] ptr, float f16) {
		return Builder_makeFloat16Constant(ptr, f16, false);
	}

	public static native long Builder_makeFloat16Constant(byte[] ptr, float f16, boolean specConstant);

	public static long Builder_makeFpConstant(byte[] ptr, long type, double d) {
		return Builder_makeFpConstant(ptr, type, d, false);
	}

	public static native long Builder_makeFpConstant(byte[] ptr, long type, double d, boolean specConstant);

	public static long Builder_makeCompositeConstant(byte[] ptr, long type, long[] comps) {
		return Builder_makeCompositeConstant(ptr, type, comps, false);
	}

	public static native long Builder_makeCompositeConstant(byte[] ptr, long type, long[] comps, boolean specConst);

	public static byte[] Builder_addEntryPoint(byte[] ptr, ExecutionModel mode, byte[] func, String name) {
		return Builder_addEntryPoint(ptr, mode.getConstant(), func, name);
	}

	public static native byte[] Builder_addEntryPoint(byte[] ptr, int mode, byte[] func, String name);

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, ExecutionMode mode) {
		Builder_addExecutionMode(ptr, func, mode.getConstant(), -1, -1, -1);
	}

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, ExecutionMode mode, int value1) {
		Builder_addExecutionMode(ptr, func, mode.getConstant(), value1, -1, -1);
	}

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, ExecutionMode mode, int value1, int value2) {
		Builder_addExecutionMode(ptr, func, mode.getConstant(), value1, value2, -1);
	}

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, ExecutionMode mode, int value1, int value2,
			int value3) {
		Builder_addExecutionMode(ptr, func, mode.getConstant(), value1, value2, value3);
	}

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, int mode) {
		Builder_addExecutionMode(ptr, func, mode, -1, -1, -1);
	}

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, int mode, int value1) {
		Builder_addExecutionMode(ptr, func, mode, value1, -1, -1);
	}

	public static void Builder_addExecutionMode(byte[] ptr, byte[] func, int mode, int value1, int value2) {
		Builder_addExecutionMode(ptr, func, mode, value1, value2, -1);
	}

	public static native void Builder_addExecutionMode(byte[] ptr, byte[] func, int mode, int value1, int value2,
			int value3);

	public static native void Builder_addName(byte[] ptr, long id, String name);

	public static native void Builder_addMemberName(byte[] ptr, long id, int member, String name);

	public static void Builder_addDecoration(byte[] ptr, long id, Decoration decoration) {
		Builder_addDecoration(ptr, id, decoration.getConstant(), -1);
	}

	public static void Builder_addDecoration(byte[] ptr, long id, Decoration decoration, int num) {
		Builder_addDecoration(ptr, id, decoration.getConstant(), num);
	}

	public static void Builder_addDecoration(byte[] ptr, long id, int decoration) {
		Builder_addDecoration(ptr, id, decoration, -1);
	}

	public static native void Builder_addDecoration(byte[] ptr, long id, int decoration, int num);

	public static void Builder_addDecoration(byte[] ptr, long id, Decoration decoration, String s) {
		Builder_addDecoration(ptr, id, decoration.getConstant(), s);
	}

	public static native void Builder_addDecoration(byte[] ptr, long id, int decoration, String s);

	public static void Builder_addDecorationId(byte[] ptr, long id, Decoration decoration, long idDecoration) {
		Builder_addDecorationId(ptr, id, decoration.getConstant(), idDecoration);
	}

	public static native void Builder_addDecorationId(byte[] ptr, long id, int decoration, long idDecoration);

	public static void Builder_addMemberDecoration(byte[] ptr, long id, long member, Decoration decoration) {
		Builder_addMemberDecoration(ptr, id, member, decoration.getConstant(), -1);
	}

	public static void Builder_addMemberDecoration(byte[] ptr, long id, long member, Decoration decoration, int num) {
		Builder_addMemberDecoration(ptr, id, member, decoration.getConstant(), num);
	}

	public static void Builder_addMemberDecoration(byte[] ptr, long id, long member, int decoration) {
		Builder_addMemberDecoration(ptr, id, member, decoration, -1);
	}

	public static native void Builder_addMemberDecoration(byte[] ptr, long id, long member, int decoration, int num);

	public static void Builder_addMemberDecoration(byte[] ptr, long id, long member, Decoration decoration, String s) {
		Builder_addMemberDecoration(ptr, id, member, decoration.getConstant(), s);
	}

	public static native void Builder_addMemberDecoration(byte[] ptr, long id, long member, int decoration, String s);

	public static native void Builder_setBuildPoint(byte[] ptr, byte[] bp);

	public static native byte[] Builder_getBuildPoint(byte[] ptr);

	public static native byte[] Builder_makeEntryPoint(byte[] ptr, String s);

	public static byte[] Builder_makeFunctionEntry(byte[] ptr, Decoration precision, long returnType, String name,
			long[] paramTypes, int[][] precisions) {
		return Builder_makeFunctionEntry(ptr, precision.getConstant(), returnType, name, paramTypes, precisions, null);
	}// NODET:Last member is array!

	public static byte[] Builder_makeFunctionEntry(byte[] ptr, Decoration precision, long returnType, String name,
			long[] paramTypes, int[][] precisions, byte[][] entry) {
		return Builder_makeFunctionEntry(ptr, precision.getConstant(), returnType, name, paramTypes, precisions, entry);
	}// NODET:Last member is array!

	public static byte[] Builder_makeFunctionEntry(byte[] ptr, int precision, long returnType, String name,
			long[] paramTypes, int[][] precisions) {
		return Builder_makeFunctionEntry(ptr, precision, returnType, name, paramTypes, precisions, null);
	}// NODET:Last member is array!

	public static native byte[] Builder_makeFunctionEntry(byte[] ptr, int precision, long returnType, String name,
			long[] paramTypes, int[][] precisions, byte[][] entry);

	public static void Builder_makeReturn(byte[] ptr, boolean implicit) {
		Builder_makeReturn(ptr, implicit, 0);
	}

	public static native void Builder_makeReturn(byte[] ptr, boolean implicit, long retVal);

	public static native void Builder_leaveFunction(byte[] ptr);

	public static native void Builder_makeDiscard(byte[] ptr);

	public static long Builder_createVariable(byte[] ptr, Decoration precision, StorageClass storageClass, long type) {
		return Builder_createVariable(ptr, precision.getConstant(), storageClass.getConstant(), type, null, 0);
	}

	public static long Builder_createVariable(byte[] ptr, Decoration precision, StorageClass storageClass, long type,
			String name) {
		return Builder_createVariable(ptr, precision.getConstant(), storageClass.getConstant(), type, name, 0);
	}

	public static long Builder_createVariable(byte[] ptr, Decoration precision, StorageClass storageClass, long type,
			String name, long initializer) {
		return Builder_createVariable(ptr, precision.getConstant(), storageClass.getConstant(), type, name,
				initializer);
	}

	public static long Builder_createVariable(byte[] ptr, int precision, StorageClass storageClass, long type) {
		return Builder_createVariable(ptr, precision, storageClass.getConstant(), type, null, 0);
	}

	public static long Builder_createVariable(byte[] ptr, int precision, StorageClass storageClass, long type,
			String name) {
		return Builder_createVariable(ptr, precision, storageClass.getConstant(), type, name, 0);
	}

	public static long Builder_createVariable(byte[] ptr, int precision, StorageClass storageClass, long type,
			String name, long initializer) {
		return Builder_createVariable(ptr, precision, storageClass.getConstant(), type, name, initializer);
	}

	public static long Builder_createVariable(byte[] ptr, Decoration precision, int storageClass, long type) {
		return Builder_createVariable(ptr, precision.getConstant(), storageClass, type, null, 0);
	}

	public static long Builder_createVariable(byte[] ptr, Decoration precision, int storageClass, long type,
			String name) {
		return Builder_createVariable(ptr, precision.getConstant(), storageClass, type, name, 0);
	}

	public static long Builder_createVariable(byte[] ptr, Decoration precision, int storageClass, long type,
			String name, long initializer) {
		return Builder_createVariable(ptr, precision.getConstant(), storageClass, type, name, initializer);
	}

	public static long Builder_createVariable(byte[] ptr, int precision, int storageClass, long type) {
		return Builder_createVariable(ptr, precision, storageClass, type, null, 0);
	}

	public static long Builder_createVariable(byte[] ptr, int precision, int storageClass, long type, String name) {
		return Builder_createVariable(ptr, precision, storageClass, type, name, 0);
	}

	public static native long Builder_createVariable(byte[] ptr, int precision, int storageClass, long type,
			String name, long initializer);

	public static native long Builder_createUndefined(byte[] ptr, long type);

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue) {
		Builder_createStore(ptr, rValue, lValue, MEMORY_ACCESS_MASK_NONE, SCOPE_MAX, 0);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, MemoryAccessMask memoryAccess) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess.getConstant(), SCOPE_MAX, 0);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, MemoryAccessMask memoryAccess,
			Scope scope) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess.getConstant(), scope.getConstant(), 0);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, MemoryAccessMask memoryAccess,
			Scope scope, long alignment) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess.getConstant(), scope.getConstant(), alignment);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, int memoryAccess) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess, SCOPE_MAX, 0);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, int memoryAccess, Scope scope) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess, scope.getConstant(), 0);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, int memoryAccess, Scope scope,
			long alignment) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess, scope.getConstant(), alignment);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, MemoryAccessMask memoryAccess,
			int scope) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess.getConstant(), scope, 0);
	}

	public static void Builder_createStore(byte[] ptr, long rValue, long lValue, MemoryAccessMask memoryAccess,
			int scope, long alignment) {
		Builder_createStore(ptr, rValue, lValue, memoryAccess.getConstant(), scope, alignment);
	}

	public static native void Builder_createStore(byte[] ptr, long rValue, long lValue, int memoryAccess, int scope,
			long alignment);

	public static long Builder_createLoad(byte[] ptr, long lValue, Decoration precision) {
		return Builder_createLoad(ptr, lValue, precision.getConstant(), MEMORY_ACCESS_MASK_NONE, SCOPE_MAX, 0);
	}

	public static long Builder_createLoad(byte[] ptr, long lValue, Decoration precision,
			MemoryAccessMask memoryAccess) {
		return Builder_createLoad(ptr, lValue, precision.getConstant(), memoryAccess.getConstant(), SCOPE_MAX, 0);
	}

	public static long Builder_createLoad(byte[] ptr, long lValue, Decoration precision, MemoryAccessMask memoryAccess,
			Scope scope) {
		return Builder_createLoad(ptr, lValue, precision.getConstant(), memoryAccess.getConstant(), scope.getConstant(),
				0);
	}

	public static long Builder_createLoad(byte[] ptr, long lValue, Decoration precision, MemoryAccessMask memoryAccess,
			Scope scope, long alignment) {
		return Builder_createLoad(ptr, lValue, precision.getConstant(), memoryAccess.getConstant(), scope.getConstant(),
				alignment);
	}

	public static long Builder_createLoad(byte[] ptr, long lValue, int precision) {
		return Builder_createLoad(ptr, lValue, precision, MEMORY_ACCESS_MASK_NONE, SCOPE_MAX, 0);
	}

	public static long Builder_createLoad(byte[] ptr, long lValue, int precision, int memoryAccess) {
		return Builder_createLoad(ptr, lValue, precision, memoryAccess, SCOPE_MAX, 0);
	}

	public static long Builder_createLoad(byte[] ptr, long lValue, int precision, int memoryAccess, int scope) {
		return Builder_createLoad(ptr, lValue, precision, memoryAccess, scope, 0);
	}

	public static native long Builder_createLoad(byte[] ptr, long lValue, int precision, int memoryAccess, int scope,
			long alignment);

	public static long Builder_createAccessChain(byte[] ptr, StorageClass storageClass, long base, long[] offsets) {
		return Builder_createAccessChain(ptr, storageClass.getConstant(), base, offsets);
	}

	public static native long Builder_createAccessChain(byte[] ptr, int storageClass, long base, long[] offsets);

	public static native long Builder_createArrayLength(byte[] ptr, long base, long member);

	public static native long Builder_createCooperativeMatrixLength(byte[] ptr, long type);

	public static native long Builder_createCompositeExtract(byte[] ptr, long composite, long typeId, long index);

	public static native long Builder_createCompositeExtract(byte[] ptr, long composite, long typeId, long[] indexes);

	public static native long Builder_createCompositeInsert(byte[] ptr, long object, long composite, long typeId,
			long index);

	public static native long Builder_createCompositeInsert(byte[] ptr, long object, long composite, long typeId,
			long[] indexes);

	public static native long Builder_createVectorExtractDynamic(byte[] ptr, long vector, long typeId,
			long componentIndex);

	public static native long Builder_createVectorInsertDynamic(byte[] ptr, long vector, long typeId, long component,
			long componentIndex);

	public static void Builder_createNoResultOp(byte[] ptr, Op op) {
		Builder_createNoResultOp(ptr, op.getConstant());
	}

	public static native void Builder_createNoResultOp(byte[] ptr, int op);

	public static void Builder_createNoResultOp(byte[] ptr, Op op, long operand) {
		Builder_createNoResultOp(ptr, op.getConstant(), operand);
	}

	public static native void Builder_createNoResultOp(byte[] ptr, int op, long operand);

	public static void Builder_createNoResultOp(byte[] ptr, Op op, long[] operands) {
		Builder_createNoResultOp(ptr, op.getConstant(), operands);
	}

	public static native void Builder_createNoResultOp(byte[] ptr, int op, long[] operands);

	public static void Builder_createNoResultOp(byte[] ptr, Op op, byte[] operands) {
		Builder_createNoResultOp(ptr, op.getConstant(), operands);
	}

	public static native void Builder_createNoResultOp(byte[] ptr, int op, byte[] operands);

	public static void Builder_createControlBarrier(byte[] ptr, Scope execution, Scope memory,
			EnumSet<MemorySemanticsMask> mask) {
		Builder_createControlBarrier(ptr, execution.getConstant(), memory.getConstant(),
				MemorySemanticsMask.setToInt(mask));
	}

	public static void Builder_createControlBarrier(byte[] ptr, int execution, Scope memory,
			EnumSet<MemorySemanticsMask> mask) {
		Builder_createControlBarrier(ptr, execution, memory.getConstant(), MemorySemanticsMask.setToInt(mask));
	}

	public static void Builder_createControlBarrier(byte[] ptr, Scope execution, int memory,
			EnumSet<MemorySemanticsMask> mask) {
		Builder_createControlBarrier(ptr, execution.getConstant(), memory, MemorySemanticsMask.setToInt(mask));
	}

	public static void Builder_createControlBarrier(byte[] ptr, Scope execution, Scope memory, int mask) {
		Builder_createControlBarrier(ptr, execution.getConstant(), memory.getConstant(), mask);
	}

	public static void Builder_createControlBarrier(byte[] ptr, int execution, int memory,
			EnumSet<MemorySemanticsMask> mask) {
		Builder_createControlBarrier(ptr, execution, memory, MemorySemanticsMask.setToInt(mask));
	}

	public static void Builder_createControlBarrier(byte[] ptr, int execution, Scope memory, int mask) {
		Builder_createControlBarrier(ptr, execution, memory.getConstant(), mask);
	}

	public static void Builder_createControlBarrier(byte[] ptr, Scope execution, int memory, int mask) {
		Builder_createControlBarrier(ptr, execution.getConstant(), memory, mask);
	}

	public static native void Builder_createControlBarrier(byte[] ptr, int execution, int memory, int mask);

	public static native void Builder_createMemoryBarrier(byte[] ptr, long executionScope, long memorySemantics);

	public static long Builder_createUnaryOp(byte[] ptr, Op op, long typeId, long operand) {
		return Builder_createUnaryOp(ptr, op.getConstant(), typeId, operand);
	}

	public static native long Builder_createUnaryOp(byte[] ptr, int op, long typeId, long operand);

	public static long Builder_createBinOp(byte[] ptr, Op op, long typeId, long operand1, long operand2) {
		return Builder_createBinOp(ptr, op.getConstant(), typeId, operand1, operand2);
	}

	public static native long Builder_createBinOp(byte[] ptr, int op, long typeId, long operand1, long operand2);

	public static long Builder_createTriOp(byte[] ptr, Op op, long typeId, long operand1, long operand2,
			long operand3) {
		return Builder_createTriOp(ptr, op.getConstant(), typeId, operand1, operand2, operand3);
	}

	public static native long Builder_createTriOp(byte[] ptr, int op, long typeId, long operand1, long operand2,
			long operand3);

	public static long Builder_createOp(byte[] ptr, Op op, long typeId, long[] operands) {
		return Builder_createOp(ptr, op.getConstant(), typeId, operands);
	}

	public static native long Builder_createOp(byte[] ptr, int op, long typeId, long[] operands);

	public static long Builder_createOp(byte[] ptr, Op op, long typeId, byte[] operands) {
		return Builder_createOp(ptr, op.getConstant(), typeId, operands);
	}

	public static native long Builder_createOp(byte[] ptr, int op, long typeId, byte[] operands);

	public static native long Builder_createFunctionCall(byte[] ptr, byte[] func, long[] ids);

	public static long Builder_createSpecConstantOp(byte[] ptr, Op op, long typeId, long[] operands, long[] literals) {
		return Builder_createSpecConstantOp(ptr, op.getConstant(), typeId, operands, literals);
	}

	public static native long Builder_createSpecConstantOp(byte[] ptr, int op, long typeId, long[] operands,
			long[] literals);

	public static long Builder_createRvalueSwizzle(byte[] ptr, Decoration precision, long typeId, long source,
			long[] channels) {
		return Builder_createRvalueSwizzle(ptr, precision.getConstant(), typeId, source, channels);
	}

	public static native long Builder_createRvalueSwizzle(byte[] ptr, int precision, long typeId, long source,
			long[] channels);

	public static native long Builder_createLvalueSwizzle(byte[] ptr, long typeId, long target, long source,
			long[] channels);

	public static long Builder_setPrecision(byte[] ptr, long id, Decoration precision) {
		return Builder_setPrecision(ptr, id, precision.getConstant());
	}

	public static native long Builder_setPrecision(byte[] ptr, long id, int precision);

	public static void Builder_promoteScalar(byte[] ptr, Decoration precision, long[] left, long[] right) {
		Builder_promoteScalar(ptr, precision.getConstant(), left, right);
	}

	public static native void Builder_promoteScalar(byte[] ptr, int precision, long[] left, long[] right);

	public static long Builder_smearScalar(byte[] ptr, Decoration precision, long scalarVal, long vectorType) {
		return Builder_smearScalar(ptr, precision.getConstant(), scalarVal, vectorType);
	}

	public static native long Builder_smearScalar(byte[] ptr, int precision, long scalarVal, long vectorType);

	public static native long Builder_createBuiltinCall(byte[] ptr, long resultType, long builtins, int entryPoint,
			long[] args);

	public static long Builder_createTextureCall(byte[] ptr, Decoration precision, long resultType, boolean sparse,
			boolean fetch, boolean proj, boolean gather, boolean noImplicit, byte[] textureParameters,
			EnumSet<ImageOperandsMask> mask) {
		return Builder_createTextureCall(ptr, precision.getConstant(), resultType, sparse, fetch, proj, gather,
				noImplicit, textureParameters, ImageOperandsMask.setToInt(mask));
	}

	public static long Builder_createTextureCall(byte[] ptr, int precision, long resultType, boolean sparse,
			boolean fetch, boolean proj, boolean gather, boolean noImplicit, byte[] textureParameters,
			EnumSet<ImageOperandsMask> mask) {
		return Builder_createTextureCall(ptr, precision, resultType, sparse, fetch, proj, gather, noImplicit,
				textureParameters, ImageOperandsMask.setToInt(mask));
	}

	public static long Builder_createTextureCall(byte[] ptr, Decoration precision, long resultType, boolean sparse,
			boolean fetch, boolean proj, boolean gather, boolean noImplicit, byte[] textureParameters, int mask) {
		return Builder_createTextureCall(ptr, precision.getConstant(), resultType, sparse, fetch, proj, gather,
				noImplicit, textureParameters, mask);
	}

	public static native long Builder_createTextureCall(byte[] ptr, int precision, long resultType, boolean sparse,
			boolean fetch, boolean proj, boolean gather, boolean noImplicit, byte[] textureParameters, int mask);

	public static long Builder_createTextureQueryCall(byte[] ptr, Op op, byte[] textureParameters,
			boolean isUnsignedResult) {
		return Builder_createTextureQueryCall(ptr, op.getConstant(), textureParameters, isUnsignedResult);
	}

	public static native long Builder_createTextureQueryCall(byte[] ptr, int op, byte[] textureParameters,
			boolean isUnsignedResult);

	public static long Builder_createSamplePositionCall(byte[] ptr, Decoration precision, long id0, long id1) {
		return Builder_createSamplePositionCall(ptr, precision.getConstant(), id0, id1);
	}

	public static native long Builder_createSamplePositionCall(byte[] ptr, int precision, long id0, long id1);

	public static long Builder_createBitFieldExtractCall(byte[] ptr, Decoration precision, long id0, long id1, long id2,
			boolean isSigned) {
		return Builder_createBitFieldExtractCall(ptr, precision.getConstant(), id0, id1, id2, isSigned);
	}

	public static native long Builder_createBitFieldExtractCall(byte[] ptr, int precision, long id0, long id1, long id2,
			boolean isSigned);

	public static long Builder_createBitFieldInsertCall(byte[] ptr, Decoration precision, long id0, long id1, long id2,
			long id3) {
		return Builder_createBitFieldInsertCall(ptr, precision.getConstant(), id0, id1, id2, id3);
	}

	public static native long Builder_createBitFieldInsertCall(byte[] ptr, int precision, long id0, long id1, long id2,
			long id3);

	public static long Builder_createCompositeCompare(byte[] ptr, Decoration precision, long id0, long id1,
			boolean equal) {
		return Builder_createCompositeCompare(ptr, precision.getConstant(), id0, id1, equal);
	}

	public static native long Builder_createCompositeCompare(byte[] ptr, int precision, long id0, long id1,
			boolean equal);

	public static native long Builder_createCompositeConstruct(byte[] ptr, long typeId, long[] constituents);

	public static long Builder_createConstructor(byte[] ptr, Decoration precision, long[] sources, long resultTypeId) {
		return Builder_createConstructor(ptr, precision.getConstant(), sources, resultTypeId);
	}

	public static native long Builder_createConstructor(byte[] ptr, int precision, long[] sources, long resultTypeId);

	public static long Builder_createMatrixConstructor(byte[] ptr, Decoration precision, long[] sources,
			long constructee) {
		return Builder_createMatrixConstructor(ptr, precision.getConstant(), sources, constructee);
	}

	public static native long Builder_createMatrixConstructor(byte[] ptr, int precision, long[] sources,
			long constructee);

	public static native void Builder_makeSwitch(byte[] ptr, long condition, long control, int numSegments,
			int[] caseValues, int[] valueToSegment, int defaultSegment, byte[] segmentBB);

	public static native void Builder_addSwitchBreak(byte[] ptr);

	public static native void Builder_nextSwitchSegment(byte[] ptr, byte[] segmentBB, int segment);

	public static native void Builder_endSwitch(byte[] ptr, byte[] segmentBB);

	public static native byte[] Builder_makeNewLoop(byte[] ptr);

	public static native byte[] Builder_makeNewBlock(byte[] ptr);

	public static native void Builder_createLoopContinue(byte[] ptr);

	public static native void Builder_createLoopExit(byte[] ptr);

	public static native void Builder_closeLoop(byte[] ptr);

	public static native byte[] Builder_getAccessChain(byte[] ptr);

	public static native void Builder_setAccessChain(byte[] ptr, byte[] newChain);

	public static native void Builder_clearAccessChain(byte[] ptr);

	public static native void Builder_setAccessChainLValue(byte[] ptr, long lValue);

	public static native void Builder_setAccessChainRValue(byte[] ptr, long rValue);

	public static native void Builder_accessChainPush(byte[] ptr, long offset, byte[] coherentFlags, long alignment);

	public static native void Builder_accessChainPushSwizzle(byte[] ptr, long[] swizzle, long preSwizzleBaseType,
			byte[] coherentFlags, long alignment);

	public static native void Builder_accessChainPushComponent(byte[] ptr, long component, long preSwizzleBaseType,
			byte[] coherentFlags, long alignment);

	public static void Builder_accessChainStore(byte[] ptr, long rvalue) {
		Builder_accessChainStore(ptr, rvalue, MEMORY_ACCESS_MASK_NONE, SCOPE_MAX, 0);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, MemoryAccessMask memoryAccess) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess.getConstant(), SCOPE_MAX, 0);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, MemoryAccessMask memoryAccess, Scope scope) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess.getConstant(), scope.getConstant(), 0);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, MemoryAccessMask memoryAccess, Scope scope,
			long alignment) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess.getConstant(), scope.getConstant(), alignment);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, int memoryAccess) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess, SCOPE_MAX, 0);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, int memoryAccess, Scope scope) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess, scope.getConstant(), 0);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, int memoryAccess, Scope scope,
			long alignment) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess, scope.getConstant(), alignment);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, MemoryAccessMask memoryAccess, int scope) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess.getConstant(), scope, 0);
	}

	public static void Builder_accessChainStore(byte[] ptr, long rvalue, MemoryAccessMask memoryAccess, int scope,
			long alignment) {
		Builder_accessChainStore(ptr, rvalue, memoryAccess.getConstant(), scope, alignment);
	}

	public static native void Builder_accessChainStore(byte[] ptr, long rvalue, int memoryAccess, int scope,
			long alignment);

	public static long Builder_accessChainLoad(byte[] ptr, Decoration precision, Decoration nonUniform,
			long ResultType) {
		return Builder_accessChainLoad(ptr, precision.getConstant(), nonUniform.getConstant(), ResultType,
				MEMORY_ACCESS_MASK_NONE, SCOPE_MAX, 0);
	}

	public static long Builder_accessChainLoad(byte[] ptr, Decoration precision, Decoration nonUniform, long ResultType,
			MemoryAccessMask memoryAccess) {
		return Builder_accessChainLoad(ptr, precision.getConstant(), nonUniform.getConstant(), ResultType,
				memoryAccess.getConstant(), SCOPE_MAX, 0);
	}

	public static long Builder_accessChainLoad(byte[] ptr, Decoration precision, Decoration nonUniform, long ResultType,
			MemoryAccessMask memoryAccess, Scope scope) {
		return Builder_accessChainLoad(ptr, precision.getConstant(), nonUniform.getConstant(), ResultType,
				memoryAccess.getConstant(), scope.getConstant(), 0);
	}

	public static long Builder_accessChainLoad(byte[] ptr, Decoration precision, Decoration nonUniform, long ResultType,
			MemoryAccessMask memoryAccess, Scope scope, long alignment) {
		return Builder_accessChainLoad(ptr, precision.getConstant(), nonUniform.getConstant(), ResultType,
				memoryAccess.getConstant(), scope.getConstant(), alignment);
	}

	public static long Builder_accessChainLoad(byte[] ptr, int precision, int nonUniform, long ResultType) {
		return Builder_accessChainLoad(ptr, precision, nonUniform, ResultType, SCOPE_MAX, SCOPE_MAX, 0);
	}

	public static long Builder_accessChainLoad(byte[] ptr, int precision, int nonUniform, long ResultType,
			int memoryAccess) {
		return Builder_accessChainLoad(ptr, precision, nonUniform, ResultType, memoryAccess, SCOPE_MAX, 0);
	}

	public static long Builder_accessChainLoad(byte[] ptr, int precision, int nonUniform, long ResultType,
			int memoryAccess, int scope) {
		return Builder_accessChainLoad(ptr, precision, nonUniform, ResultType, memoryAccess, scope, 0);
	}

	public static native long Builder_accessChainLoad(byte[] ptr, int precision, int nonUniform, long ResultType,
			int memoryAccess, int scope, long alignment);

	public static native boolean Builder_isSpvLvalue(byte[] ptr);

	public static native long Builder_accessChainGetLValue(byte[] ptr);

	public static native long Builder_accessChainGetInferredType(byte[] ptr);

	public static native void Builder_postProcess(byte[] ptr);

	public static native void Builder_postProcessCFG(byte[] ptr);

	public static native void Builder_postProcessFeatures(byte[] ptr);

	public static native void Builder_postProcess(byte[] ptr, byte[] instruction);

	public static native void Builder_postProcessType(byte[] ptr, byte[] instruction, long typeId);

	public static native void Builder_dump(byte[] ptr, long[][] l);

	public static native void Builder_createBranch(byte[] ptr, byte[] block);

	public static native void Builder_createConditionalBranch(byte[] ptr, long condition, byte[] thenBlock,
			byte[] elseBlock);

	public static native void Builder_createLoopMerge(byte[] ptr, byte[] mergeBlock, byte[] continueBlock, long control,
			long[] operands);

	public static native void Builder_setToSpecConstCodeGenMode(byte[] ptr);

	public static native void Builder_setToNormalCodeGenMode(byte[] ptr);

	public static native boolean Builder_isInSpecConstCodeGenMode(byte[] ptr);

	public static native byte[] Builder_TextureParameters();

	public static native byte[] Builder_TextureParameters(long sampler, long coords, long bias, long lod, long Dref,
			long offset, long offsets, long gradX, long gradY, long sample, long component, long texelOut,
			long lodClamp, long granularity, long coarse, boolean nonprivate, boolean volatil);

	public static native void Builder_TextureParameters_setSampler(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setCoords(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setBias(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setLod(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setDref(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setOffset(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setOffsets(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setGradX(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setGradY(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setSample(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setComponent(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setLodClamp(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setGranularity(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setCoarse(byte[] ptr, long v);

	public static native void Builder_TextureParameters_setNonprivate(byte[] ptr, boolean v);

	public static native void Builder_TextureParameters_setVolatil(byte[] ptr, boolean v);

	public static native long Builder_TextureParameters_getSampler(byte[] ptr);

	public static native long Builder_TextureParameters_getCoords(byte[] ptr);

	public static native long Builder_TextureParameters_getBias(byte[] ptr);

	public static native long Builder_TextureParameters_getLod(byte[] ptr);

	public static native long Builder_TextureParameters_getDref(byte[] ptr);

	public static native long Builder_TextureParameters_getOffset(byte[] ptr);

	public static native long Builder_TextureParameters_getOffsets(byte[] ptr);

	public static native long Builder_TextureParameters_getGradX(byte[] ptr);

	public static native long Builder_TextureParameters_getGradY(byte[] ptr);

	public static native long Builder_TextureParameters_getSample(byte[] ptr);

	public static native long Builder_TextureParameters_getComponent(byte[] ptr);

	public static native long Builder_TextureParameters_getLodClamp(byte[] ptr);

	public static native long Builder_TextureParameters_getGranularity(byte[] ptr);

	public static native long Builder_TextureParameters_getCoarse(byte[] ptr);

	public static native boolean Builder_TextureParameters_getNonprivate(byte[] ptr);

	public static native boolean Builder_TextureParameters_getVolatil(byte[] ptr);

	public static native byte[] Builder_If(long condition, long ctrl, byte[] builder);

	public static native void Builder_If_makeBeginElse(byte[] ptr);

	public static native void Builder_If_makeEndIf(byte[] ptr);

	public static native byte[] Builder_LoopBlocks(byte[] head, byte[] body, byte[] merge, byte[] continue_target);

	public static native byte[] Builder_LoopBlocks_getHead(byte[] ptr);

	public static native byte[] Builder_LoopBlocks_getBody(byte[] ptr);

	public static native byte[] Builder_LoopBlocks_getMerge(byte[] ptr);

	public static native byte[] Builder_LoopBlocks_getContinue_target(byte[] ptr);

	public static native byte[] Builder_AccessChain();

	public static native byte[] Builder_AccessChain(long base, long[] indexChain, long instr, long[] swizzle,
			long component, long preSwizzleBaseType, boolean isRValue, long alignment, byte[] coherentFlags);

	public static native void Builder_AccessChain_setBase(byte[] ptr, long v);

	public static native void Builder_AccessChain_setIndexChain(byte[] ptr, long[] v);

	public static native void Builder_AccessChain_setInstr(byte[] ptr, long v);

	public static native void Builder_AccessChain_setSwizzle(byte[] ptr, long[] v);

	public static native void Builder_AccessChain_setComponent(byte[] ptr, long v);

	public static native void Builder_AccessChain_setPreSwizzleBaseType(byte[] ptr, long v);

	public static native void Builder_AccessChain_setIsRValue(byte[] ptr, boolean v);

	public static native void Builder_AccessChain_setAlignment(byte[] ptr, long v);

	public static native void Builder_AccessChain_setCoherentFlags(byte[] ptr, byte[] v);

	public static native long Builder_AccessChain_getBase(byte[] ptr);

	public static native long[] Builder_AccessChain_getIndexChain(byte[] ptr);

	public static native long Builder_AccessChain_getInstr(byte[] ptr);

	public static native long[] Builder_AccessChain_getSwizzle(byte[] ptr);

	public static native long Builder_AccessChain_getComponent(byte[] ptr);

	public static native long Builder_AccessChain_getPreSwizzleBaseType(byte[] ptr);

	public static native boolean Builder_AccessChain_getIsRValue(byte[] ptr);

	public static native long Builder_AccessChain_getAlignment(byte[] ptr);

	public static native byte[] Builder_AccessChain_getCoherentFlags(byte[] ptr);

	public static native byte[] Builder_AccessChain_CoherentFlags();

	public static native boolean Builder_AccessChain_CoherentFlags_isVolatile(byte[] ptr);

	public static native byte[] Builder_AccessChain_CoherentFlags_operatorBitwiseOrAssign(byte[] ptr, byte[] other);

	public static native boolean Builder_AccessChain_CoherentFlags_anyCoherent(byte[] ptr);

	public static native void Builder_AccessChain_CoherentFlags_clear(byte[] ptr);

	public static native void Builder_AccessChain_CoherentFlags_setCoherent(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setDevicecoherent(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setQueuefamilycoherent(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setWorkgroupcoherent(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setSubgroupcoherent(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setShadercallcoherent(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setNonprivate(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setVolatil(byte[] ptr, long v);

	public static native void Builder_AccessChain_CoherentFlags_setIsImage(byte[] ptr, long v);

	public static native long Builder_AccessChain_CoherentFlags_getCoherent(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getDevicecoherent(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getQueuefamilycoherent(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getWorkgroupcoherent(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getSubgroupcoherent(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getShadercallcoherent(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getNonprivate(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getVolatil(byte[] ptr);

	public static native long Builder_AccessChain_CoherentFlags_getIsImage(byte[] ptr);

	public static native byte[] SpvOptions();

	public static native void SpvOptions_setGenerateDebugInfo(byte[] ptr, boolean v);

	public static native void SpvOptions_setStripDebugInfo(byte[] ptr, boolean v);

	public static native void SpvOptions_setDisableOptimizer(byte[] ptr, boolean v);

	public static native void SpvOptions_setOptimizeSize(byte[] ptr, boolean v);

	public static native void SpvOptions_setDisassemble(byte[] ptr, boolean v);

	public static native void SpvOptions_setValidate(byte[] ptr, boolean v);

	public static native boolean SpvOptions_getGenerateDebugInfo(byte[] ptr);

	public static native boolean SpvOptions_getStripDebugInfo(byte[] ptr);

	public static native boolean SpvOptions_getDisableOptimizer(byte[] ptr);

	public static native boolean SpvOptions_getOptimizeSize(byte[] ptr);

	public static native boolean SpvOptions_getDisassemble(byte[] ptr);

	public static native boolean SpvOptions_getValidate(byte[] ptr);

	public static native byte[] OperandParameters();

	public static void OperandParameters_push(byte[] ptr, OperandClass oc, String d) {
		OperandParameters_push(ptr, oc.getConstant(), d, false);
	}

	public static void OperandParameters_push(byte[] ptr, OperandClass oc, String d, boolean opt) {
		OperandParameters_push(ptr, oc.getConstant(), d, opt);
	}

	public static void OperandParameters_push(byte[] ptr, int oc, String d) {
		OperandParameters_push(ptr, oc, d, false);
	}

	public static native void OperandParameters_push(byte[] ptr, int oc, String d, boolean opt);

	public static native void OperandParameters_setOptional(byte[] ptr);

	public static native int OperandParameters_getClass(byte[] ptr, int op);

	public static native String OperandParameters_getDesc(byte[] ptr, int op);

	public static native boolean OperandParameters_isOptional(byte[] ptr, int op);

	public static native int OperandParameters_getNum(byte[] ptr);

	public static native byte[] EnumParameters();

	public static native void EnumParameters_setDesc(byte[] ptr, String v);

	public static native String EnumParameters_getDesc(byte[] ptr);

	public static native byte[] EnumDefinition();

	public static void EnumDefinition_set(byte[] ptr, int ceil, String_Int name, byte[] ep) {
		EnumDefinition_set(ptr, ceil, name, ep, false);
	}

	public static native void EnumDefinition_set(byte[] ptr, int ceil, String_Int name, byte[] ep, boolean mask);

	public static native void EnumDefinition_setOperands(byte[] ptr, byte[] op);

	public static native void EnumDefinition_setCeiling(byte[] ptr, int v);

	public static native void EnumDefinition_setBitmask(byte[] ptr, boolean v);

	public static native void EnumDefinition_setGetName(byte[] ptr, String_Int v);

	public static native void EnumDefinition_setEnumParams(byte[] ptr, byte[] v);

	public static native void EnumDefinition_setOperandParams(byte[] ptr, byte[] v);

	public static native int EnumDefinition_getCeiling(byte[] ptr);

	public static native boolean EnumDefinition_getBitmask(byte[] ptr);

	public static native byte[] EnumDefinition_getGetName(byte[] ptr);

	public static native byte[] EnumDefinition_getEnumParams(byte[] ptr);

	public static native byte[] EnumDefinition_getOperandParams(byte[] ptr);

	public static native byte[] InstructionParameters();

	public static native void InstructionParameters_setResultAndType(byte[] ptr, boolean r, boolean t);

	public static native boolean InstructionParameters_hasResult(byte[] ptr);

	public static native boolean InstructionParameters_hasType(byte[] ptr);

	public static native void InstructionParameters_setOpDesc(byte[] ptr, String v);

	public static native void InstructionParameters_setOpClass(byte[] ptr, int v);

	public static native void InstructionParameters_setOperands(byte[] ptr, byte[] v);

	public static native String InstructionParameters_getOpDesc(byte[] ptr);

	public static native int InstructionParameters_getOpClass(byte[] ptr);

	public static native byte[] InstructionParameters_getOperands(byte[] ptr);

	public static native byte[] IdImmediate(boolean i, long w);

	public static native void IdImmediate_setIsId(byte[] ptr, boolean v);

	public static native void IdImmediate_setWord(byte[] ptr, long v);

	public static native boolean IdImmediate_getIsId(byte[] ptr);

	public static native long IdImmediate_getWord(byte[] ptr);

	public static byte[] Instruction(long resultId, long typeId, Op opCode) {
		return Instruction(resultId, typeId, opCode.getConstant());
	}

	public static native byte[] Instruction(long resultId, long typeId, int opCode);

	public static byte[] Instruction(Op opCode) {
		return Instruction(opCode.getConstant());
	}

	public static native byte[] Instruction(int opCode);

	public static native void Instruction_addIdOperand(byte[] ptr, long id);

	public static native void Instruction_addImmediateOperand(byte[] ptr, long immediate);

	public static native void Instruction_setImmediateOperand(byte[] ptr, long idx, long immediate);

	public static native void Instruction_addStringOperand(byte[] ptr, String str);

	public static native boolean Instruction_isIdOperand(byte[] ptr, int op);

	public static native void Instruction_setBlock(byte[] ptr, byte[] b);

	public static native byte[] Instruction_getBlock(byte[] ptr);

	public static native int Instruction_getOpCode(byte[] ptr);

	public static native int Instruction_getNumOperands(byte[] ptr);

	public static native long Instruction_getResultId(byte[] ptr);

	public static native long Instruction_getTypeId(byte[] ptr);

	public static native long Instruction_getIdOperand(byte[] ptr, int op);

	public static native long Instruction_getImmediateOperand(byte[] ptr, int op);

	public static native void Instruction_dump(byte[] ptr, long[][] out);

	public static native byte[] Block(long id, byte[] parent);

	public static native long Block_getId(byte[] ptr);

	public static native byte[] Block_getParent(byte[] ptr);

	public static native void Block_addInstruction(byte[] ptr, byte[] inst);

	public static native void Block_addPredecessor(byte[] ptr, byte[] pred);

	public static native void Block_addLocalVariable(byte[] ptr, byte[] inst);

	public static native byte[] Block_getPredecessors(byte[] ptr);

	public static native byte[] Block_getSuccessors(byte[] ptr);

	public static native byte[] Block_getInstructions(byte[] ptr);

	public static native byte[] Block_getLocalVariables(byte[] ptr);

	public static native void Block_setUnreachable(byte[] ptr);

	public static native boolean Block_isUnreachable(byte[] ptr);

	public static native byte[] Block_getMergeInstruction(byte[] ptr);

	public static native void Block_rewriteAsCanonicalUnreachableMerge(byte[] ptr);

	public static native void Block_rewriteAsCanonicalUnreachableContinue(byte[] ptr, byte[] header);

	public static native boolean Block_isTerminated(byte[] ptr);

	public static native void Block_dump(byte[] ptr, long[][] out);

	public static native byte[] Function(long id, long resultType, long functionType, long firstParam, byte[] parent);

	public static native long Function_getId(byte[] ptr);

	public static native long Function_getParamId(byte[] ptr, int p);

	public static native long Function_getParamType(byte[] ptr, int p);

	public static native void Function_addBlock(byte[] ptr, byte[] block);

	public static native void Function_removeBlock(byte[] ptr, byte[] block);

	public static native byte[] Function_getParent(byte[] ptr);

	public static native byte[] Function_getEntryBlock(byte[] ptr);

	public static native byte[] Function_getLastBlock(byte[] ptr);

	public static native byte[] Function_getBlocks(byte[] ptr);

	public static native void Function_addLocalVariable(byte[] ptr, byte[] inst);

	public static native long Function_getReturnType(byte[] ptr);

	public static void Function_setReturnPrecision(byte[] ptr, Decoration precision) {
		Function_setReturnPrecision(ptr, precision.getConstant());
	}

	public static native void Function_setReturnPrecision(byte[] ptr, int precision);

	public static native int Function_getReturnPrecision(byte[] ptr);

	public static native void Function_setImplicitThis(byte[] ptr);

	public static native boolean Function_hasImplicitThis(byte[] ptr);

	public static void Function_addParamPrecision(byte[] ptr, long param, Decoration precision) {
		Function_addParamPrecision(ptr, param, precision.getConstant());
	}

	public static native void Function_addParamPrecision(byte[] ptr, long param, int precision);

	public static native int Function_getParamPrecision(byte[] ptr, long param);

	public static native void Function_dump(byte[] ptr, long[][] out);

	public static native byte[] Module();

	public static native void Module_addFunction(byte[] ptr, byte[] fun);

	public static native void Module_mapInstruction(byte[] ptr, byte[] instruction);

	public static native byte[] Module_getInstruction(byte[] ptr, long id);

	public static native byte[] Module_getFunctions(byte[] ptr);

	public static native long Module_getTypeId(byte[] ptr, long resultId);

	public static native int Module_getStorageClass(byte[] ptr, long typeId);

	public static native void Module_dump(byte[] ptr, long[][] out);
	
	public static native String CString_Int_op(byte[] ptr, int i);

	// Static Methods of C++ API
	public static native byte[] GetVersion();

	public static native String GetEsslVersionString();

	public static native String GetGlslVersionString();

	public static native int GetKhronosToolId();

	public static native boolean InitializeProcess();

	public static native void FinalizeProcess();

	public static byte[] ConstructCompiler(EShLanguage l, int i) {
		return ConstructCompiler(l.getConstant(), i);
	}

	public static native byte[] ConstructCompiler(int l, int i);

	public static byte[] ConstructLinker(EShExecutable e, int i) {
		return ConstructLinker(e.getConstant(), i);
	}

	public static native byte[] ConstructLinker(int e, int i);

	public static native byte[] ConstructBindings();

	public static native void DeleteLinker(byte[] linker);

	public static native void DeleteBindingList(byte[] bindingList);

	public static native byte[] ConstructUniformMap();

	public static native void DeleteCompiler(byte[] compiler);

	public static native void DeleteUniformMap(byte[] uniformMap);

	public static String GetStorageQualifierString(TStorageQualifier q) {
		return GetStorageQualifierString(q.getConstant());
	}

	public static native String GetStorageQualifierString(int q);

	public static String GetPrecisionQualifierString(TPrecisionQualifier p) {
		return GetPrecisionQualifierString(p.getConstant());
	}

	public static native String GetPrecisionQualifierString(int p);

	public static String GetBuiltInVariableString(TBuiltInVariable v) {
		return GetBuiltInVariableString(v.getConstant());
	}

	public static native String GetBuiltInVariableString(int v);

	public static boolean isTypeSignedInt(TBasicType type) {
		return isTypeSignedInt(type.getConstant());
	}

	public static native boolean isTypeSignedInt(int type);

	public static boolean isTypeUnsignedInt(TBasicType type) {
		return isTypeUnsignedInt(type.getConstant());
	}

	public static native boolean isTypeUnsignedInt(int type);

	public static boolean isTypeInt(TBasicType type) {
		return isTypeInt(type.getConstant());
	}

	public static native boolean isTypeInt(int type);

	public static boolean isTypeFloat(TBasicType type) {
		return isTypeFloat(type.getConstant());
	}

	public static native boolean isTypeFloat(int type);

	public static int getTypeRank(TBasicType type) {
		return getTypeRank(type.getConstant());
	}

	public static native int getTypeRank(int type);

	public static native byte[] GetThreadPoolAllocator();

	public static native void SetThreadPoolAllocator(byte[] poolAllocator);

	public static native boolean IsAnonymous(String name);

	public static native void RemoveAllTreeNodes(byte[] node);

	public static native void PropagateNoContraction(byte[] intermediate);

	public static native boolean SameSpecializationConstants(byte[] node1, byte[] node2);

	public static String ProfileName(EProfile profile) {
		return ProfileName(profile.getConstant());
	}

	public static native String ProfileName(int profile);

	public static native byte[] Min(byte[] a, byte[] b);

	public static native byte[] Max(byte[] a, byte[] b);

	public static String String(int i) {
		return String(i, 10);
	}

	public static native String String(int i, int base);

	public static native boolean IsPow2(byte[] powerOf2);

	public static native void RoundToPow2(byte[] number, int powerOf2);

	public static native boolean IsMultipleOfPow2(byte[] number, int powerOf2);

	public static native void GetSpirvVersion(String[] s);

	public static native int GetSpirvGeneratorVersion();

	public static void GlslangToSpv(byte[] intermediate, long[][] spirv) {
		GlslangToSpv(intermediate, spirv, null);
	}

	public static native void GlslangToSpv(byte[] intermediate, long[][] spirv, byte[] options);

	public static void GlslangToSpvLogger(byte[] intermediate, long[][] spirv, byte[] logger) {
		GlslangToSpv(intermediate, spirv, logger, null);
	}

	public static native void GlslangToSpv(byte[] intermediate, long[][] spirv, byte[] logger, byte[] options);

	public static native void OutputSpvBin(long[] spirv, String baseName);

	public static native void OutputSpvHex(long[] spirv, String baseName, String varName);

	public static native void SpirvToolsDisassemble(OutputStream out, long[] spirv);

	public static native void SpirvToolsValidate(byte[] intermediate, long[] spirv, byte[] logger,
			boolean prelegalization);

	public static native void SpirvToolsTransform(byte[] intermediate, long[] spirv, byte[] logger, byte[] options);

	public static native void SpirvToolsStripDebugInfo(byte[] intermediate, long[] spirv, byte[] logger);

	public static native byte[] BitwiseCast(byte[] source);

	public static native void Disassemble(OutputStream out, long[] spirv);

	public static native void Parameterize();

	public static native String SourceString(int v);

	public static native String AddressingString(int v);

	public static native String MemoryString(int v);

	public static native String ExecutionModelString(int v);

	public static native String ExecutionModeString(int v);

	public static native String StorageClassString(int v);

	public static native String DecorationString(int v);

	public static native String BuiltInString(int v);

	public static native String DimensionString(int v);

	public static native String SelectControlString(int v);

	public static native String LoopControlString(int v);

	public static native String FunctionControlString(int v);

	public static native String SamplerAddressingModeString(int v);

	public static native String SamplerFilterModeString(int v);

	public static native String ImageFormatString(int v);

	public static native String ImageChannelOrderString(int v);

	public static native String ImageChannelTypeString(int v);

	public static native String ImageChannelDataTypeString(int type);

	public static native String ImageOperandsString(int format);

	public static native String ImageOperands(int v);

	public static native String FPFastMathString(int v);

	public static native String FPRoundingModeString(int v);

	public static native String LinkageTypeString(int v);

	public static native String FuncParamAttrString(int v);

	public static native String AccessQualifierString(int v);

	public static native String MemorySemanticsString(int v);

	public static native String MemoryAccessString(int v);

	public static native String ExecutionScopeString(int v);

	public static native String GroupOperationString(int v);

	public static native String KernelEnqueueFlagsString(int v);

	public static native String KernelProfilingInfoString(int v);

	public static native String CapabilityString(int v);

	public static native String OpcodeString(int v);

	public static native String ScopeString(int mem);
	
	public static String GetOperandDesc(OperandClass operand){
		return GetOperandDesc(operand.getConstant());
	}
	public static native String GetOperandDesc(int operand);

	public static void PrintImmediateRow(int imm, String name, byte[] enumParams, boolean caps) {
		PrintImmediateRow(imm, name, enumParams, caps, false);
	}

	public static native void PrintImmediateRow(int imm, String name, byte[] enumParams, boolean caps, boolean hex);

	public static native void PrintOperands(byte[] operands, int reservedOperands);

	public static void HasResultAndType(Op opcode, boolean[] hasResult, boolean[] hasResultType) {// NOTE:Result will be
																									// stored in boolean
																									// array
		HasResultAndType(opcode.getConstant(), hasResult, hasResultType);
	}

	public static native void HasResultAndType(int opcode, boolean[] hasResult, boolean[] hasResultType);// NOTE:Result
																											// will be
																											// stored in
																											// boolean
																											// arrays

	public static void inReadableOrder(byte[] root, Void_BytearrayReachReasonBytearray callback) {
		inReadableOrder(root, new Void_BytearrayIntBytearray() {
			public void op(byte[] ba0, int i0, byte[] ba1) {
				callback.op(ba0, ReachReason.valueByConstant(i0), ba1);
			}
		});
	}

	public static native void inReadableOrder(byte[] root, Void_BytearrayIntBytearray callback);

	public static native byte[] TString(String str);

	public static native String TString_asString(byte[] ptr);

	// TODO: Cleanup code

	// TODO: Fix Enums that are actually EnumSets.(Like EShLanguageMask) Create
	// Method for Conversion form int to Set.

	// NOTE: Load == call of constructor with same arguments as at initial call.

	public static native byte[] allocString(String str);

	public static native byte[] createArray(byte[][] pointers);

	public static native int Array_size(byte[] ptr);

	public static native byte[] Array_get(byte[] ptr, int index);

	public static native void delete(byte[] pointer);

	public static native void resetLastErrorCode();

	public static native int getLastErrorCode();// TODO:Implement threadsafe.

	public static native String getLastErrorString();

	public static String getErrorStringFromCode(GlslangError code) {
		return getErrorStringFromCode(code.getConstant());
	}

	public static native String getErrorStringFromCode(int code);

	public static void setErrorMode(GlslangErrorMode mode) {
		setErrorMode(mode.getConstant());
	}

	public static native void setErrorMode(int mode);

	public static native void setCatchCExceptions(boolean v);

	@FunctionalInterface
	public static interface Void_IntIntBooleanIntString {
		void op(int i0, int i1, boolean b0, int i2, String s0);
	}

	@FunctionalInterface
	public static interface Void_IntStringString {
		void op(int i0, String s0, String s1);
	}

	@FunctionalInterface
	public static interface Void_IntIntString {
		void op(int i0, int i1, String s0);
	}

	@FunctionalInterface
	public static interface Void_IntStringarray {
		void op(int i0, String[] sa0);
	}

	@FunctionalInterface
	public static interface Void_IntString {
		void op(int i0, String s0);
	}

	@FunctionalInterface
	public static interface Void_String {
		void op(String s0);
	}

	@FunctionalInterface
	public static interface String_Int {
		String op(int i0);
	}
	
	public static class CString_Int extends PointerBoundObject implements String_Int{
		private final int constructorIndex;

		protected CString_Int(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected CString_Int(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
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
						Main.delete(ptr);
						ptr = null;
						break;
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}
		
		public String op(int i0){
			return Main.CString_Int_op(ptr, i0);
		}
	}

	@FunctionalInterface
	public static interface Void_BytearrayIntBytearray {
		void op(byte[] ba0, int i0, byte[] ba1);
	}

	@FunctionalInterface
	public static interface Void_BytearrayReachReasonBytearray {
		void op(byte[] ba0, ReachReason i0, byte[] ba1);
	}

}
