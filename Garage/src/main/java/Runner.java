
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		Vehicle c1 = new Car(4, true, 50, 1000, "Green");
		Vehicle c2 = new Car(6, true, 200, 5500, "Red");
		Vehicle c3 = new Car(2, false, 20, 400, "Lilac");
		Vehicle c4 = new Car(4, true, 80, 2300, "Black");
		Vehicle m1 = new Motorcycle(true, 20, 150, "Black");
		Vehicle m2 = new Motorcycle(true, 30, 220, "Pink");
		Vehicle m3 = new Motorcycle(true, 10, 100, "Orange");
		Vehicle b1 = new Boat(1 , 1, 200, 5000, "White");
		Vehicle b2 = new Boat(4, 2, 500, 8000, "Yellow");
		garage.addToGarage(c1);
		garage.addToGarage(c2);
		garage.addToGarage(c3);
		garage.addToGarage(c4);
		garage.addToGarage(m1);
		garage.addToGarage(m2);
		garage.addToGarage(m3);
		garage.addToGarage(b1);
		garage.addToGarage(b2);
		garage.garageList();
		garage.garageBill();
		garage.removeFromGarage(c3);
		garage.garageList();
		garage.emptyGarage();
		garage.garageList();

	}

}
