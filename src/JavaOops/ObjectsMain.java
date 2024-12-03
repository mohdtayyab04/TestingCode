package JavaOops;

public class ObjectsMain {

	public static void main(String[] args) {
		
		// create object
		
		ObjectswithInstanceVariable student1=new ObjectswithInstanceVariable();
		ObjectswithInstanceVariable student2=new ObjectswithInstanceVariable();
		
		//initialise object/store data to the object student1 & student2
		student1.insertRecord("Priya", 101);
		student2.insertRecord("Rahul", 102);
		
		// print information of student 1 and student 2
		student1.displayinformation();
		student2.displayinformation();

	}

}
