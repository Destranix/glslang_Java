package Java;

public class TType extends PointerBoundObject {

	private byte[] userDefPtr;

	private final TBasicType basicType;
	private final TStorageQualifier storageQualifier;
	private final int vs;
	private final int mc;
	private final int mr;
	private final boolean isVector;
	private final TPrecisionQualifier precisionQualifier;
	private final TPublicType publicType;
	private final TSampler sampler;
	private final TArraySizes arraySizes;
	private final TType type;
	private final int derefIndex;
	private final boolean rowMajor;
	private final TTypeLoc[] userDef;
	private final String n;
	private final TQualifier qualifier;
	private final int constructorIndex;

	public TType() {
		this.basicType = TBasicType.EbtVoid;
		this.storageQualifier = TStorageQualifier.EvqTemporary;
		this.vs = 1;
		this.mc = 0;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t) {
		this.basicType = t;
		this.storageQualifier = TStorageQualifier.EvqTemporary;
		this.vs = 1;
		this.mc = 0;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q) {
		this.basicType = t;
		this.storageQualifier = TStorageQualifier.EvqTemporary;
		this.vs = 1;
		this.mc = 0;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, int vs) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = 0;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, int vs, int mc) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = mc;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, int vs, int mc, int mr) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = mc;
		this.mr = mr;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, int vs, int mc, int mr, boolean isVector) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = mc;
		this.mr = mr;
		this.isVector = isVector;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 0;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = 1;
		this.mc = 0;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = p;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 1;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = 0;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = p;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 1;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs, int mc) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = mc;
		this.mr = 0;
		this.isVector = false;
		this.precisionQualifier = p;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 1;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs, int mc, int mr) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = mc;
		this.mr = mr;
		this.isVector = false;
		this.precisionQualifier = p;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 1;
		load();
	}

	public TType(TBasicType t, TStorageQualifier q, TPrecisionQualifier p, int vs, int mc, int mr, boolean isVector) {
		this.basicType = t;
		this.storageQualifier = q;
		this.vs = vs;
		this.mc = mc;
		this.mr = mr;
		this.isVector = isVector;
		this.precisionQualifier = p;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 1;
		load();
	}

	public TType(TPublicType p) {
		this.basicType = null;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = p;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 2;
		load();
	}

	public TType(TSampler sampler) {
		this.basicType = null;
		this.storageQualifier = TStorageQualifier.EvqUniform;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = sampler;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 3;
		load();
	}

	public TType(TSampler sampler, TStorageQualifier q) {
		this.basicType = null;
		this.storageQualifier = q;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = sampler;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 3;
		load();
	}

	public TType(TSampler sampler, TStorageQualifier q, TArraySizes as) {
		this.basicType = null;
		this.storageQualifier = q;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = sampler;
		this.arraySizes = as;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 3;
		load();
	}

	public TType(TType type, int derefIndex) {
		this.basicType = null;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = type;
		this.derefIndex = derefIndex;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 4;
		load();
	}

	public TType(TType type, int derefIndex, boolean rowMajor) {
		this.basicType = null;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = type;
		this.derefIndex = derefIndex;
		this.rowMajor = rowMajor;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = 4;
		load();
	}

	public TType(TTypeLoc[] userDef, String n) {
		this.basicType = null;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = userDef;
		this.n = n;
		this.qualifier = null;
		this.constructorIndex = 5;
		load();
	}

	public TType(TTypeLoc[] userDef, String n, TQualifier q) {
		this.basicType = null;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = userDef;
		this.n = n;
		this.qualifier = q;
		this.constructorIndex = 6;
		load();
	}

	public TType(TBasicType t, TType p, String n) {
		this.basicType = t;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = p;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = n;
		this.qualifier = null;
		this.constructorIndex = 7;
		load();
	}

	protected TType(byte[] ptr) {
		this.ptr = ptr;
		this.basicType = null;
		this.storageQualifier = null;
		this.vs = -1;
		this.mc = -1;
		this.mr = -1;
		this.isVector = false;
		this.precisionQualifier = null;
		this.publicType = null;
		this.sampler = null;
		this.arraySizes = null;
		this.type = null;
		this.derefIndex = -1;
		this.rowMajor = false;
		this.userDef = null;
		this.n = null;
		this.qualifier = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			byte[][] userDefPtrArray;
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TType(basicType, storageQualifier, vs, mc, mr, isVector);
					break;
				case 1:
					ptr = Main.TType(basicType, storageQualifier, precisionQualifier, vs, mc, mr, isVector);
					break;
				case 2:
					ptr = Main.TType(publicType.getPtr());
					break;
				case 3:
					ptr = Main.TType(sampler.getPtr(), storageQualifier, arraySizes.getPtr());
					break;
				case 4:
					ptr = Main.TType(type.getPtr(), derefIndex, rowMajor);
					break;
				case 5:
					userDefPtrArray = new byte[userDef.length][];
					for (int i = 0; i < userDef.length; ++i) {
						userDefPtrArray[i] = userDef[i].getPtr();
					}
					this.userDefPtr = Main.createArray(userDefPtrArray);
					ptr = Main.TType(userDefPtr, n);
					break;
				case 6:
					userDefPtrArray = new byte[userDef.length][];
					for (int i = 0; i < userDef.length; ++i) {
						userDefPtrArray[i] = userDef[i].getPtr();
					}
					this.userDefPtr = Main.createArray(userDefPtrArray);
					ptr = Main.TType(userDefPtr, n, qualifier.getPtr());
					break;
				case 7:
					ptr = Main.TType(basicType, type.getPtr(), n);
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
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
					if (userDefPtr != null) {
						Main.delete(userDefPtr);
					}
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void shallowCopy(TType copyOf) {
		Main.TType_shallowCopy(ptr, copyOf.getPtr());
	}

	public void deepCopy(TType copyOf) {
		Main.TType_deepCopy(ptr, copyOf.getPtr());
	}

	public void makeTemporary() {
		Main.TType_makeTemporary(ptr);
	}

	@Override
	public TType clone() {
		return fromPtr(Main.TType_clone(ptr), TType.class);
	}

	public void makeVector() {
		Main.TType_makeVector(ptr);
	}

	public void hideMember() {
		Main.TType_hideMember(ptr);
	}

	public boolean hiddenMember() {
		return Main.TType_hiddenMember(ptr);
	}

	public void setFieldName(String n) {
		Main.TType_setFieldName(ptr, n);
	}

	public String getFieldName() {
		return Main.TType_getFieldName(ptr);
	}

	public TShaderInterface getShaderInterface() {
		return TShaderInterface.valueByConstant(Main.TType_getShaderInterface(ptr));
	}

	public TBasicType getBasicType() {
		return TBasicType.valueByConstant(Main.TType_getBasicType(ptr));
	}

	public TSampler getSampler() {
		return fromPtr(Main.TType_getSampler(ptr), TSampler.class);
	}

	public TQualifier getQualifier() {
		return fromPtr(Main.TType_getQualifier(ptr), TQualifier.class);
	}

	public int getVectorSize() {
		return Main.TType_getVectorSize(ptr);
	}

	public int getMatrixCols() {
		return Main.TType_getMatrixCols(ptr);
	}

	public int getMatrixRows() {
		return Main.TType_getMatrixRows(ptr);
	}

	public int getOuterArraySize() {
		return Main.TType_getOuterArraySize(ptr);
	}

	public TIntermTyped getOuterArrayNode() {
		return fromPtr(Main.TType_getOuterArrayNode(ptr), TIntermTyped.class);
	}

	public int getCumulativeArraySize() {
		return Main.TType_getCumulativeArraySize(ptr);
	}

	public boolean isArrayOfArrays() {
		return Main.TType_isArrayOfArrays(ptr);
	}

	public int getImplicitArraySize() {
		return Main.TType_getImplicitArraySize(ptr);
	}

	public TArraySizes getArraySizes() {
		return fromPtr(Main.TType_getArraySizes(ptr), TArraySizes.class);
	}

	public TType getReferentType() {
		return fromPtr(Main.TType_getReferentType(ptr), TType.class);
	}

	public TArraySizes getTypeParameters() {
		return fromPtr(Main.TType_getTypeParameters(ptr), TArraySizes.class);
	}

	public boolean isScalar() {
		return Main.TType_isScalar(ptr);
	}

	public boolean isScalarOrVec1() {
		return Main.TType_isScalarOrVec1(ptr);
	}

	public boolean isVector() {
		return Main.TType_isVector(ptr);
	}

	public boolean isMatrix() {
		return Main.TType_isMatrix(ptr);
	}

	public boolean isArray() {
		return Main.TType_isArray(ptr);
	}

	public boolean isSizedArray() {
		return Main.TType_isSizedArray(ptr);
	}

	public boolean isUnsizedArray() {
		return Main.TType_isUnsizedArray(ptr);
	}

	public boolean isArrayVariablyIndexed() {
		return Main.TType_isArrayVariablyIndexed(ptr);
	}

	public void setArrayVariablyIndexed() {
		Main.TType_setArrayVariablyIndexed(ptr);
	}

	public void updateImplicitArraySize(int size) {
		Main.TType_updateImplicitArraySize(ptr, size);
	}

	public boolean isStruct() {
		return Main.TType_isStruct(ptr);
	}

	public boolean isFloatingDomain() {
		return Main.TType_isFloatingDomain(ptr);
	}

	public boolean isIntegerDomain() {
		return Main.TType_isIntegerDomain(ptr);
	}

	public boolean isOpaque() {
		return Main.TType_isOpaque(ptr);
	}

	public boolean isBuiltIn() {
		return Main.TType_isBuiltIn(ptr);
	}

	public boolean isImage() {
		return Main.TType_isImage(ptr);
	}

	public boolean isSubpass() {
		return Main.TType_isSubpass(ptr);
	}

	public boolean isTexture() {
		return Main.TType_isTexture(ptr);
	}

	public boolean isUnusableName() {
		return Main.TType_isUnusableName(ptr);
	}

	public boolean isParameterized() {
		return Main.TType_isParameterized(ptr);
	}

	public boolean isAtomic() {
		return Main.TType_isAtomic(ptr);
	}

	public boolean isCoopMat() {
		return Main.TType_isCoopMat(ptr);
	}

	public boolean isReference() {
		return Main.TType_isReference(ptr);
	}

	public boolean contains(PointerBoundObject predicate) {
		return Main.TType_contains(ptr, predicate.getPtr());
	}

	public boolean containsBasicType(TBasicType checkType) {
		return Main.TType_containsBasicType(ptr, checkType);
	}

	public boolean containsArray() {
		return Main.TType_containsArray(ptr);
	}

	public boolean containsStructure() {
		return Main.TType_containsStructure(ptr);
	}

	public boolean containsUnsizedArray() {
		return Main.TType_containsUnsizedArray(ptr);
	}

	public boolean containsOpaque() {
		return Main.TType_containsOpaque(ptr);
	}

	public boolean containsBuiltIn() {
		return Main.TType_containsBuiltIn(ptr);
	}

	public boolean containsNonOpaque() {
		return Main.TType_containsNonOpaque(ptr);
	}

	public boolean containsSpecializationSize() {
		return Main.TType_containsSpecializationSize(ptr);
	}

	public boolean containsDouble() {
		return Main.TType_containsDouble(ptr);
	}

	public boolean contains16BitFloat() {
		return Main.TType_contains16BitFloat(ptr);
	}

	public boolean contains64BitInt() {
		return Main.TType_contains64BitInt(ptr);
	}

	public boolean contains16BitInt() {
		return Main.TType_contains16BitInt(ptr);
	}

	public boolean contains8BitInt() {
		return Main.TType_contains8BitInt(ptr);
	}

	public boolean containsCoopMat() {
		return Main.TType_containsCoopMat(ptr);
	}

	public boolean containsReference() {
		return Main.TType_containsReference(ptr);
	}

	public void updateArraySizes(TType type) {
		Main.TType_updateArraySizes(ptr, type.getPtr());
	}

	public void copyArraySizes(TArraySizes s) {
		Main.TType_copyArraySizes(ptr, s.getPtr());
	}

	public void transferArraySizes(TArraySizes s) {
		Main.TType_transferArraySizes(ptr, s.getPtr());
	}

	public void clearArraySizes() {
		Main.TType_clearArraySizes(ptr);
	}

	public void copyArrayInnerSizes(TArraySizes s) {
		Main.TType_copyArrayInnerSizes(ptr, s.getPtr());
	}

	public void changeOuterArraySize(int s) {
		Main.TType_changeOuterArraySize(ptr, s);
	}

	public void adoptImplicitArraySizes(boolean skipNonvariablyIndexed) {
		Main.TType_adoptImplicitArraySizes(ptr, skipNonvariablyIndexed);
	}

	public void updateTypeParameters(TType type) {
		Main.TType_updateTypeParameters(ptr, type.getPtr());
	}

	public void copyTypeParameters(TArraySizes s) {
		Main.TType_copyTypeParameters(ptr, s.getPtr());
	}

	public void transferTypeParameters(TArraySizes s) {
		Main.TType_transferTypeParameters(ptr, s.getPtr());
	}

	public void clearTypeParameters() {
		Main.TType_clearTypeParameters(ptr);
	}

	public void copyTypeParametersInnerSizes(TArraySizes s) {
		Main.TType_copyTypeParametersInnerSizes(ptr, s.getPtr());
	}

	public String getBasicString() {
		return Main.TType_getBasicString(ptr);
	}

	public String getBasicTypeString() {
		return Main.TType_getBasicTypeString(ptr);
	}

	public String getStorageQualifierString() {
		return Main.TType_getStorageQualifierString(ptr);
	}

	public String getBuiltInVariableString() {
		return Main.TType_getBuiltInVariableString(ptr);
	}

	public String getPrecisionQualifierString() {
		return Main.TType_getPrecisionQualifierString(ptr);
	}

	public TVector<TTypeLoc> getStruct() {
		@SuppressWarnings("unchecked") // Is checked
		TVector<TTypeLoc> tmp = (TVector<TTypeLoc>) fromPtr(Main.TType_getStruct(ptr), TVector.class);
		return tmp;
	}

	public void setStruct(TVector<TTypeLoc> s) {
		Main.TType_setStruct(ptr, s.getPtr());
	}

	public TVector<TTypeLoc> getWritableStruct() {
		@SuppressWarnings("unchecked") // Is checked
		TVector<TTypeLoc> tmp = (TVector<TTypeLoc>) fromPtr(Main.TType_getWritableStruct(ptr), TVector.class);
		return tmp;
	}

	public void setBasicType(TBasicType t) {
		Main.TType_setBasicType(ptr, t);
	}

	public int computeNumComponents() {
		return Main.TType_computeNumComponents(ptr);
	}

	public void appendMangledName(String name) {
		Main.TType_appendMangledName(ptr, name);
	}

	public boolean sameStructType(TType right) {
		return Main.TType_sameStructType(ptr, right.getPtr());
	}

	public boolean sameReferenceType(TType right) {
		return Main.TType_sameReferenceType(ptr, right.getPtr());
	}

	public boolean sameElementType(TType right) {
		return Main.TType_sameElementType(ptr, right.getPtr());
	}

	public boolean sameArrayness(TType right) {
		return Main.TType_sameArrayness(ptr, right.getPtr());
	}

	public boolean sameInnerArrayness(TType right) {
		return Main.TType_sameInnerArrayness(ptr, right.getPtr());
	}

	public boolean sameTypeParameters(TType right) {
		return Main.TType_sameTypeParameters(ptr, right.getPtr());
	}

	public boolean sameElementShape(TType right) {
		return Main.TType_sameElementShape(ptr, right.getPtr());
	}

	public boolean coopMatParameterOK(TType right) {
		return Main.TType_coopMatParameterOK(ptr, right.getPtr());
	}

	public boolean sameCoopMatBaseType(TType right) {
		return Main.TType_sameCoopMatBaseType(ptr, right.getPtr());
	}

	public long getBufferReferenceAlignment() {
		return Main.TType_getBufferReferenceAlignment(ptr);
	}

	public static String getBasicString(TBasicType t) {
		return Main.TType_getBasicString(t);
	}

	public boolean operatorEqual(TType right) {
		return Main.TType_operatorEqual(ptr, right.getPtr());
	}

	public boolean operatorNotEqual(TType right) {
		return Main.TType_operatorNotEqual(ptr, right.getPtr());
	}

}
