package Abstraction_Interfaces;

public abstract class BikeClass {
	//constructor
	BikeClass()
	{
		System.out.println("Bike class created..");
	}
	//create abstract method
	abstract void run(); //abstract method doesn't have the body.
	
	//create non-abstract methods
	void start()
	{
		System.out.println("Bike started...");
	}
	
	//create static method
	
	static void stop()
	{
		System.out.println("Bike stopped...");
	}

}
