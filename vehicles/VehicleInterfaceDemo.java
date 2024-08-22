interface Vehicle {
	String getModel();
	void setModel(String model);
	
	String getMake();
	void setMake(String make);

	int getYear();
	void setYear(int year);
}

class Car implements Vehicle {
	private String model;
	private String make;
	private int year;
	private int numberOfDoors;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

class Motorcycle implements Vehicle {
	private String model;
	private String make;
	private int year;
	private boolean hasSideCar;


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
	
public class VehicleInterfaceDemo {
	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("Civic");
		car.setMake("Honda");
		car.setYear(2022);
		System.out.println("Car Information:");
        	System.out.println("Model: " + car.getModel());
        	System.out.println("Make: " + car.getMake());
        	System.out.println("Year: " + car.getYear());

	Motorcycle motorcycle = new Motorcycle();
		motorcycle.setModel("Ninja");
		motorcycle.setMake("Kawasaki");
		motorcycle.setYear(2021);
		System.out.println("\nMotorcycle Information:");
        	System.out.println("Model: " + motorcycle.getModel());
        	System.out.println("Make: " + motorcycle.getMake());
        	System.out.println("Year: " + motorcycle.getYear());
    }
}
