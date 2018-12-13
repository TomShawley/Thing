import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> inGarage = new ArrayList<>();

	public void garageList() {
		inGarage.stream().forEach(System.out::println);
	}

	public void addToGarage(Vehicle vehicle) {
		inGarage.add(vehicle);
	}

	public void garageBill() {
		int bill;

		for (Vehicle v : inGarage) {
			if (v instanceof Car) {
				int size;
				int weight;
				int doors;
				Boolean hasFourWheels;
				String colour;
				int colourValue = 0;
				doors = ((Car) v).getDoors();
				size = ((Car) v).getSize();
				weight = ((Car) v).getWeight();
				hasFourWheels = ((Car) v).getHasFourWheels();
				colour = ((Car) v).getColour();
				if (colour == "Red") {
					colourValue = 50;
				} else {
					colourValue = 100;
				}
				bill = size + weight + (doors * 20) + colourValue;
				System.out.println(bill);
			}
			if (v instanceof Motorcycle) {
				int size;
				int weight;
				Boolean hasTwoWheels;
				String colour;
				size = ((Motorcycle) v).getSize();
				weight = ((Motorcycle) v).getWeight();
				hasTwoWheels = ((Motorcycle) v).getHasTwoWheels();
				colour = ((Motorcycle) v).getColour();
				bill = size + weight;
				System.out.println(bill);
			}
			if (v instanceof Boat) {
				int size;
				int weight;
				int numPropellers;
				int numRudders;
				String colour;
				size = ((Boat) v).getSize();
				weight = ((Boat) v).getWeight();
				colour = ((Boat) v).getColour();
				numPropellers = ((Boat) v).getNumPropellers();
				numRudders = ((Boat) v).getNumRudders();
				bill = size + weight + (numPropellers * 200) + (numRudders * 50);
				System.out.println(bill);
			}

		}

	}

	public void removeFromGarage(Vehicle vehicle) {
		inGarage.remove(vehicle);
	}

	public void emptyGarage() {
		inGarage.clear();
		System.out.println("garage has been cleared");

	}

}
