package TryCatchFinalException;

public class TryCatch {

	public static void main(String[] args) {
		
		try		// try main aggar condition galat ho toh catch use karte hai 
		{
			//ArithmeticException Error
			int result = 100/0;
		//int result = 100/1;
		//System.out.println(result);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("Hello Java");
	}

}
