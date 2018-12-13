
public class Boat extends Vehicle {
	private int numPropellers;
	private int numRudders;

	public Boat(int numPropellers, int numRudders, int size, int weight, String colour) {
		super(size, weight, colour);
		this.numPropellers = numPropellers;
		this.numRudders = numRudders;

	}

	@Override
	public String toString() {
		return "Boat [size=" + getSize() + ", weight=" + getWeight() + ", colour=" + getColour() + ", numPropellers=" + numPropellers + ", numRudders=" + numRudders + "]";
	}

	public int getNumPropellers() {
		return numPropellers;
	}

	public void setNumPropellers(int numPropellers) {
		this.numPropellers = numPropellers;
	}

	public int getNumRudders() {
		return numRudders;
	}

	public void setNumRudders(int numRudders) {
		this.numRudders = numRudders;
	}
}
