package Abstraction_Interfaces;

public class BikeClassImplementation  {

	public static void main(String[] args) {
		BikeClass obj=new TVS();
		obj.start(); //non-abstract method
		obj.run();   //abstract method
		BikeClass.stop();	 //static method
		
		obj=new Yamaha();
		obj.start(); //non-abstract method
		obj.run();   //abstract method
		BikeClass.stop();	 //static method
		
		obj=new Honda();
		obj.start(); //non-abstract method
		obj.run();   //abstract method
		BikeClass.stop();	 //static method
	}

	

}
