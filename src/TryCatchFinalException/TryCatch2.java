package TryCatchFinalException;

public class TryCatch2 {

	public static void main(String[] args) {

		try		// try main aggar condition galat ho toh catch use karte hai 
		{
			//NullPointer Exception Error
		String a= null;
		System.out.println(a.length());
		}
		catch (NullPointerException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("Hello Java");

	}

}
