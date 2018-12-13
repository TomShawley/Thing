
public class Car extends Vehicle {
	private int doors;
	private Boolean hasFourWheels;

	public Car(int doors, Boolean hasFourWheels, int size, int weight, String colour) {
		super(size, weight, colour);
		this.doors = doors;
		this.hasFourWheels = hasFourWheels;
	}

	@Override
	public String toString() {
		return "Car [size=" + getSize() + ", weight=" + getWeight() + ", colour=" + getColour() +", doors=" + doors + ", hasFourWheels=" + hasFourWheels + "]";
	}

	public int getDoors() {
		return doors;

	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	public Boolean getHasFourWheels() {
		return hasFourWheels;

	}

	public void setHasFourWheels(Boolean hasFourWheels) {
		this.hasFourWheels = hasFourWheels;
	}
}
