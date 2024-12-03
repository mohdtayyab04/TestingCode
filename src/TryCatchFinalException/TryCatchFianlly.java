package TryCatchFinalException;

public class TryCatchFianlly {

	public static void main(String[] args) {
		System.out.println("Hello java");
		try  // Number Format Exception
		{
	//String  s= "abc";
	String  s= "123";
	int i =Integer.parseInt(s);
	System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Catch block");
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Finally block executed");	
		}

	}

}
