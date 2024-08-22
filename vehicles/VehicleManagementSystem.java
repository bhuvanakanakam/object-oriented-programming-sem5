/* 

Bhuvana Kanakam - SE21UCSE035
Object Oriented Programming Lab

assignment : java vehicle management system
1. you are tasked with designing a simple vehicle management system in java. you need to create an abstract class vehicle with 
two subclasses: car and motorcycle. each vehicle should have common attributes and specific behaviour.
2. perform same task using interface

*/


abstract class Vehicle {
	private String model	;
	private String make	;
	private int year 	;

	public Vehicle (String model, String make, int year) {
		this.model = model	; // assigns the value of the model parameter to the model attribute of the current Vehicle object.
		this.make = make	; // assigns the value of the make parameter to the make attribute of the current Vehicle object.
		this.year = year 	; // assigns the value of the year parameter to the year attribute of the current Vehicle object.
	}

	abstract void displayInfo();

	public String getModel() {
        	return model		;
    	}

	public void setModel(String model) {
        	this.model = model	;
    	}

	public String getMake() {
		return make		;
	}

	public void setMake(String make) {
		this.make = make	;
	}

	public int getYear() {
		return year		;
	}

	public void setYear(int year) {
		this.year = year	;
	}

}

class Car extends Vehicle {
	private int numberOfDoors	;
	private int trunkCapacity	;
	private int engineSize		;
	private String fuelType		;
	private String transmission	;
	private int horsepower		;

	public Car ( String model, String make, int year, int numberOfDoors, int trunkCapacity, int engineSize, String fuelType, String transmission, int horsepower ) {
		super (model, make, year)		;
		this.numberOfDoors = numberOfDoors	;
		this.trunkCapacity = trunkCapacity	;
		this.engineSize = engineSize		;
		this.fuelType = fuelType		;
		this.transmission = transmission	;
		this.horsepower = horsepower		;
	}

	void displayInfo () {
		System.out.println ("Car Model: " + getModel() + 
				", Make: " + getMake() + 
				", Year: " + getYear() + 
				", Number of Doors: " + numberOfDoors + 
				", Trunk Capacity: " + trunkCapacity + 
				", Engine Size: " + engineSize + 
				", Transmission: " + transmission + 
				", Horsepower: " + horsepower ) ;
	}
	
}

class Motorcycle extends Vehicle {
	private int engineSize	;
	private int topSpeed	;
	private String type	;
	private int weight	;
	private int fuelCapacity;
	private int seatHeight	;
	private int wheelbase	;

	public Motorcycle(String model, String make, int year, int engineSize, int topSpeed, String type, int weight, int fuelCapacity, int seatHeight, int wheelbase) {
		super(model, make, year)	;
		this.engineSize = engineSize	;
		this.topSpeed = topSpeed	;
		this.type = type		;
		this.weight = weight		;
		this.fuelCapacity = fuelCapacity;
		this.seatHeight = seatHeight	;
		this.wheelbase = wheelbase	;
	}
	
	void displayInfo() {
        System.out.println("Motorcycle Model: " + getModel() + 
		", Make: " + getMake() + 
		", Year: " + getYear() + 
		", Engine Size: " + engineSize + 
		", Top Speed: " + topSpeed + 
		", Type: " + type +
                ", Weight: " + weight + 
		", Fuel Capacity: " + fuelCapacity + 
		", Seat Height: " + seatHeight + 
		", Wheelbase: " + wheelbase); 
	}
}

public class VehicleManagementSystem {
	public static void main(String[] args) {
		Car car = new Car( "Civic", "Honda",  2022, 4, 500, 2000, "Petrol", "Automatic", 150);
		Motorcycle motorcycle = new Motorcycle("Ninja", "Kawasaki", 2021, 1000, 300, "Sports", 300, 20, 30, 50);
		car.displayInfo();
		motorcycle.displayInfo();
    }
}



/* concepts used in this code

- Abstraction : abstract class Vehicle provides a blueprint for the subclasses car and motorcycles
	An abstract class in Java is a class that cannot be instantiated on its own but can be used as a superclass for other classes. 
- Encapsulation : binds the data with the methods that manipulate the data
	Getter and Setter methods : used to retrieve and modify the values of private attributes
	the attributes model, make, and year are private, which means they can only be accessed within the Vehicle class.
- this keyword is used in the setter methods to refer to the current instance of the class. 
*/
