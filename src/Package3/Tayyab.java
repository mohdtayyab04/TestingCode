package Package3;

public class Tayyab  extends Farhan {
	
	@Override
	public void method1()
	{
		System.out.println("I am method1 from Tayyab");
	}
	
	Tayyab()
	{
		System.out.println("I am Constructor from Farhan");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Farhan obj1 = new Farhan();
		Tayyab obj2 = new Tayyab();
		
	//	Farhan obj = new Tayyab();    //Dynamic Dispatch
	
		
	
		
		obj1.method1();
		obj2.method1();
		//obj.method1();
		
		
		

	}

}
