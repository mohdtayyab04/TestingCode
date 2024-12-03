package JavaOops;

public class Constructor_Farhan {
	
	int a;
	int b;
	
	
	
	//Default Constructed
	Constructor_Farhan()
	{
	
	System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	Constructor_Farhan(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
		System.out.println("PC");
	
	}
	
	
	//Method
	public void method1()
	{
		System.out.println("Method1");
	}
	
	//Method2
	public void method2(int a, int b)
	{   
		this.a= a;
		this.b =b;
		System.out.println(a+b);
		System.out.println("PM");
			
	}
	
	//Method3
	public String method3(String name)
	{
		System.out.println("Parameterized method with String return type");
		return name;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class   //Reference     //Object
		//Farhan       obj1 =        new Farhan();
		Constructor_Farhan       obj2 =        new Constructor_Farhan(2, 3);
		obj2.method2(2, 5);
		
		
		
		
		

	}

}
