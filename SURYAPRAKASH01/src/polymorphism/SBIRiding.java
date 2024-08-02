package polymorphism;

public class SBIRiding extends RBIRiding{
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBIRiding getObject() {
		return this;
	}

}
