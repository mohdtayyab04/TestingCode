package PractiseProgramming;

public class Swap_2_Numbers_Without_Using_3rd_Variable {

	public static void main(String[] args) {
		int num1=10;  //20
		int num2=20;  //10
		
		System.out.println("before swap");
		System.out.println("number1: " + num1);
		System.out.println("number1: " + num2);
		
		num1=num1+num2;  //10+20=30
		num2=num1-num2;  //30-20=10
		num1=num1-num2;  //30-10=20
		
		System.out.println("After swap");
		System.out.println("number1: " + num1);
		System.out.println("number1: " + num2);

	}

}
