package OOPS.Constructor;

public class Car {
	private String make;
	private String model;
	private int year;
	
	public Car(String make,String model,int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	 public void displayInfo() {
	        System.out.println("Car Make: " + make);
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	 }
	 
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", "Corolla", 2022);
		
		myCar.displayInfo();
	}

}
