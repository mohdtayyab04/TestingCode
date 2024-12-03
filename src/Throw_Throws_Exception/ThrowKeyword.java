//Throw keyword hum kisi bhi method k andar use karte hai custome message create karne k liye ya phir custome exception message create karne k liye,
// Throw keyword hum explicitly Exception ko generate karne k liye use karte hai
//like implicit wait in selenium
//Throw keyword hum method k andar use karte hai 
//Single exception throw kar sakta hai customize message k saath
package Throw_Throws_Exception;

public class ThrowKeyword {
	
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access Denied- Age must be atleast 18 yaers"); //ArithmeticException is a claass name....This is the syntax
			}
		else
		{
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		try
		{
		checkAge(17);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("Rest of the code....");
}}

