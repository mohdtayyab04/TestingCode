package JavaOops;

public class Objects {
	
	// instance variables
	
	String name;
	int rollno;
	
	//methods
	
	void displayinformation()
	{
		//code tobe executed
		System.out.println("Name:" + name);
		System.out.println("Rollno:" + rollno);
	}

	public static void main(String[] args) {
		Objects student1 = new Objects();
		Objects student2 = new Objects();
		//initialise object/store data to the object student1 & student2
		student1.name = "Priya";
		student1.rollno=101;
		
		student2.name = "Rahul";
		student2.rollno=102;
		
		// print information of student 1 and student 2
		
		student1.displayinformation();
		student2.displayinformation();

	}

}








//30:18