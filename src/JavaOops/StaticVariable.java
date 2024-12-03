package JavaOops;

public class StaticVariable {

	
		// class variables
		int roll; //non-static variable, unqiue for each student 
		String studentName; //non-static variable, unqiue for each student 
		static String collegeName = "Bharti college"; //static variable, memory allocated only once during class loading

StaticVariable(int rollNo, String name) //parameterized constructor
{
roll= rollNo;
studentName= name;
}
void display()
{
System.out.println(studentName +"'" + roll +"'" + collegeName);
}
static void changeValue()
{
collegeName="shyamlal college";
}

// Static block
static
{
	System.out.println("This is static block");
}

public static void main (String args[])
{
	StaticVariable obj1 = new StaticVariable(101, "Radha");
	StaticVariable obj2 = new StaticVariable(102, "Rahul");
obj1.display();
obj2.display();
changeValue();

System.out.println("After college name change");
obj1.display();
obj2.display();
System.out.println("This is main block");
}

}


	