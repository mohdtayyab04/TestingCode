package JavaOops;

public class Constructor {
	
	int x; // attribute of class
	String car;
	int year;
	
	Constructor() // Method name of constructor 
	{
		// initialize object
		x=10; // initialize value to the attribute
	}

	public Constructor(String carName, int yr) //constructor with parameter or parameterized constructor.
	{
		car = carName;
		year = yr; // initialize value to the attribute
		
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor();  // this will call constuctor
		Constructor obj1 = new Constructor("Alto", 2009); // create class object, this will call constructor of class.
		System.out.println(obj.x);  // print value of x
		System.out.println(obj1.car +" " + obj1.year);
	}

}
