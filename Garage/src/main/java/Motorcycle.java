
public class Motorcycle extends Vehicle {
	private Boolean hasTwoWheels;

	public Motorcycle(Boolean hasTwoWheels, int size, int weight, String colour) {
		super(size, weight, colour);
		this.hasTwoWheels = hasTwoWheels;
	}

	public Boolean getHasTwoWheels() {
		return hasTwoWheels;

	}

	public void setHasTwoWheels(Boolean hasTwoWheels) {
		this.hasTwoWheels = hasTwoWheels;
	}

	@Override
	public String toString() {
		return "Motorcycle [size=" + getSize() + ", weight=" + getWeight() + ", colour=" + getColour() +", hasTwoWheels=" + hasTwoWheels + "]";
	}

}
