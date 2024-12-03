package JavaOops;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		System.out.println("Enter Your Name:, age & salary");
		
		//create object of scanner class
		Scanner obj = new Scanner(System.in);
		
		//String input
		String name=obj.nextLine();
				
		//int input for age
		int age=obj.nextInt();
		
		//double input for salary
		double salary = obj.nextDouble();
		
		System.out.println("name is:" + name);
		System.out.println("age is:" + age);
		System.out.println("salary is:" + salary);
		
		
		

	}

}
