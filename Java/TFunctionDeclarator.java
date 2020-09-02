package Java;

public class TFunctionDeclarator extends PointerBoundObject {

	private final int constructorIndex;

	public TFunctionDeclarator() {
		this.constructorIndex = 0;
		load();
	}

	protected TFunctionDeclarator(byte[] ptr) {
		this.ptr = ptr;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TFunctionDeclarator();
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
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void setLoc(TSourceLoc loc) {
		Main.TFunctionDeclarator_setLoc(ptr, loc.getPtr());
	}

	public void setFunction(TFunction function) {
		Main.TFunctionDeclarator_setFunction(ptr, function.getPtr());
	}

	public void setAttributes(TList<TAttributeArgs> attributes) {
		Main.TFunctionDeclarator_setAttributes(ptr, attributes.getPtr());
	}

	public void setBody(TVector<HlslToken> body) {
		Main.TFunctionDeclarator_setBody(ptr, body.getPtr());
	}

	public TSourceLoc getLoc() {
		return fromPtr(Main.TFunctionDeclarator_getLoc(ptr), TSourceLoc.class);
	}

	public TFunction getFunction() {
		return fromPtr(Main.TFunctionDeclarator_getFunction(ptr), TFunction.class);
	}

	public TList<TAttributeArgs> getAttributes() {
		@SuppressWarnings("unchecked") // Is checked
		TList<TAttributeArgs> tmp = (TList<TAttributeArgs>) fromPtr(Main.TFunctionDeclarator_getAttributes(ptr),
				TList.class);
		return tmp;
	}

	public TVector<HlslToken> getBody() {
		@SuppressWarnings("unchecked") // Is checked
		TVector<HlslToken> tmp = (TVector<HlslToken>) fromPtr(Main.TFunctionDeclarator_getBody(ptr), TVector.class);
		return tmp;
	}

}
