package Java;

//Used for creating superclass constructor that invalidate its methods
final class PoisonClass {

	protected static final PoisonClass singleton = new PoisonClass();

}
