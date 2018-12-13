
public abstract class Vehicle {

	private int size;
	private int weight;
	private String colour;

	public Vehicle(int size, int weight, String colour) {
		this.size = size;
		this.weight = weight;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [size=" + size + ", weight=" + weight + ", colour=" + colour + "]";
	}

	public int getSize() {
		return size;

	}

	public void setSize(int size) {
		this.size = size;
	}

	
	

	public int getWeight() {
		return weight;

	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;

	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
