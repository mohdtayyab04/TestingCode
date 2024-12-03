package PractiseProgramming;

public class Swap_2_Numbers_using_3rd_Variable {

	public static void main(String[] args) {
		int first = 10; // 20
		int second = 20; // 10
		int temp; // 10

		System.out.println("before swap");
		System.out.println("first number: " + first);
		System.out.println("second number: " + second);

		temp = first; // 10
		first = second; // 20
		second = temp; // 10

		System.out.println("After swap");
		System.out.println("first number: " + first);
		System.out.println("second number: " + second);
	}
}
