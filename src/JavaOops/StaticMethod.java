package JavaOops;

public class StaticMethod {
	
	//method (Aggar method static hai toh uske liye object create karne ki zaroorat nahi hai print karane k liye method ka name kaafi hai main method 
			  //main aggar method name static nahi hai then uske liye object banana hoga then print karane k liye object name . method name)
			static void printMessage()
			{
	//method body
				System.out.println("Welcome Java");
			}
			
			//method
			void DisplayMessage() /// Non-Static Method
			{
	//method body
				System.out.println("Hello Java");
			}
			
			// method to sum two number
			//static void Sum(int a, int b) // yaha par int a , int b (parameter) hai
			static int Sum(int a, int b)
			{
				//System.out.println("sum of a & b:" +(a+b));
				return (a+b); //method exist ya to } curle braket pe method exit hoga ya retun keyword pe
			}
		static int minimum(int a, int b)	
		{
			if (a<b)
				return a;
			else
			return b;
		}
			
	public static void main(String[] args) {
		// object create for non-Static method (DisplayMessage) using class object
		StaticMethod S = new StaticMethod();
		S.DisplayMessage();
		printMessage();
		int result=Sum(10,5); // yaha par int a , int b (arguments) hai
		System.out.println("sum of a & b is:" + result);
		System.out.println(minimum(10,8));
	}

}
