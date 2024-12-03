package PractiseProgramming;

public class reverseNumber {

	public static void main(String[] args) {
		int number =987654, reverse =0;
		while(number!=0)

		{
			int r = number%10;
			reverse=reverse*10+r;
			number=number/10;
			
		}
		System.out.println("rever numbers are: " + reverse);
	}

}
