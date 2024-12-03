package TryCatchFinalException;

public class TryCatchFinally {

	public static void main(String[] args) {
		try  // Array Index of bound Exception
		{
	int a[]=new  int[5];
	a[5]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{											// Finally dono condition main execute hoga chahe try condition/block theek ho toh uske baad
													//	Warna try condition galat ho pehle try condition execute hogi the finally block execute hoga
			System.out.println("Catch block: "+e.toString());
		}
		finally {
			System.out.println("Finally block executed");
		}

	}

}