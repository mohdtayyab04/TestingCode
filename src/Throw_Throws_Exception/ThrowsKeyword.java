//Throws keyword basically batane k liye hota hai jo method hai usme exception occur hosakta hai. yeh method exception throw karsakta hai
//method k baad throws keyword use karke hum one or mutiple exception ko handle kar sakte hai coma laga kar. jo known exception hai unke liye
//like explicit wait in selenium
////Throws keyword hum method k naam k saath use karte hai yeh batane k liye yeh method kis kis tarah k exception generate kar sakta hai
//Multiple exception throw kar sakta hai
package Throw_Throws_Exception;

import java.io.IOException;

public class ThrowsKeyword {
	static void checkAge(int age) throws ArithmeticException,IOException
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
	}

}
