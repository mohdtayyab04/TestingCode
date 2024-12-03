package JavaOops;

public class StaticVariables {
	// class variables
			int roll; //non-static variable, unqiue for each student 
			String studeName; //non-static variable, unqiue for each student 
			static String collegeName = "Bharti Public School"; //static variable, memory allocated only once during class loading
			//int count =0; // non-static variable, will get memory every time object of the class is created 
			static int count =0;// memory will be alloceted only once 
			
			StaticVariables() // constructor
			{
				count++; //increament by 1. retain its value
				System.out.println(count); // count =1, 2, 3
			}

	public static void main(String[] args) {
		StaticVariables Student1 = new StaticVariables();
		Student1.roll=101;
		Student1.studeName = "Rahul";
		System.out.println(Student1.roll + " " + Student1.studeName +" " + Student1.collegeName);
		
		StaticVariables Student2 = new StaticVariables();
		Student2.roll=102;
		Student2.studeName = "Amit";
		System.out.println(Student2.roll + " " + Student2.studeName +" " + Student2.collegeName);
		
		StaticVariables Student3 = new StaticVariables();
	}

}
