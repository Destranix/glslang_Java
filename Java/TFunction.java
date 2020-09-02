package Java;

public class TFunction extends TSymbol {

	private final TOperator o;
	private final String name;
	private final TType retType;
	private final int constructorIndex;

	public TFunction(TOperator o) {
		super(PoisonClass.singleton);
		this.o = o;
		this.name = null;
		this.retType = null;
		this.constructorIndex = 0;
		load();
	}

	public TFunction(String name, TType retType) {
		super(PoisonClass.singleton);
		this.o = TOperator.EOpNull;
		this.name = name;
		this.retType = retType;
		this.constructorIndex = 1;
		load();
	}

	public TFunction(String name, TType retType, TOperator tOp) {
		super(PoisonClass.singleton);
		this.o = tOp;
		this.name = name;
		this.retType = retType;
		this.constructorIndex = 1;
		load();
	}

	protected TFunction(byte[] ptr) {
		super(ptr);
		this.o = null;
		this.name = null;
		this.retType = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TFunction(o);
					break;
				case 1:
					ptr = Main.TFunction(name, retType.getPtr(), o);
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

	@Override
	public TFunction clone() {
		return fromPtr(Main.TFunction_clone(ptr), TFunction.class);
	}

	@Override
	public TFunction getAsFunction() {
		return fromPtr(Main.TFunction_getAsFunction(ptr), TFunction.class);
	}

	public void addParameter(TParameter p) {
		Main.TFunction_addParameter(ptr, p.getPtr());
	}

	public void addThisParameter(TType type, String name) {
		Main.TFunction_addThisParameter(ptr, type.getPtr(), name);
	}

	@Override
	public void addPrefix(String prefix) {
		Main.TFunction_addPrefix(ptr, prefix);
	}

	public void removePrefix(String prefix) {
		Main.TFunction_removePrefix(ptr, prefix);
	}

	@Override
	public String getMangledName() {
		return Main.TFunction_getMangledName(ptr);
	}

	@Override
	public TType getType() {
		return fromPtr(Main.TFunction_getType(ptr), TType.class);
	}

	public TBuiltInVariable getDeclaredBuiltInType() {
		return TBuiltInVariable.valueByConstant(Main.TFunction_getDeclaredBuiltInType(ptr));
	}

	@Override
	public TType getWritableType() {
		return fromPtr(Main.TFunction_getWritableType(ptr), TType.class);
	}

	public void relateToOperator(TOperator o) {
		Main.TFunction_relateToOperator(ptr, o);
	}

	public TOperator getBuiltInOp() {
		return TOperator.valueByConstant(Main.TFunction_getBuiltInOp(ptr));
	}

	public void setDefined() {
		Main.TFunction_setDefined(ptr);
	}

	public boolean isDefined() {
		return Main.TFunction_isDefined(ptr);
	}

	public void setPrototyped() {
		Main.TFunction_setPrototyped(ptr);
	}

	public boolean isPrototyped() {
		return Main.TFunction_isPrototyped(ptr);
	}

	public void setImplicitThis() {
		Main.TFunction_setImplicitThis(ptr);
	}

	public boolean hasImplicitThis() {
		return Main.TFunction_hasImplicitThis(ptr);
	}

	public void setIllegalImplicitThis() {
		Main.TFunction_setIllegalImplicitThis(ptr);
	}

	public boolean hasIllegalImplicitThis() {
		return Main.TFunction_hasIllegalImplicitThis(ptr);
	}

	public int getParamCount() {
		return Main.TFunction_getParamCount(ptr);
	}

	public int getDefaultParamCount() {
		return Main.TFunction_getDefaultParamCount(ptr);
	}

	public int getFixedParamCount() {
		return Main.TFunction_getFixedParamCount(ptr);
	}

	@Override
	public void dump(TInfoSink infoSink) {
		Main.TFunction_dump(ptr, infoSink.getPtr());
	}

	@Override
	public void dump(TInfoSink infoSink, boolean complete) {
		Main.TFunction_dump(ptr, infoSink.getPtr(), complete);
	}

	public TParameter operatorAt(int i) {
		return fromPtr(Main.TFunction_operatorAt(ptr, i), TParameter.class);
	}

}
