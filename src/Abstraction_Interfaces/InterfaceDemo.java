package Abstraction_Interfaces;

interface showName
{
	void showName(String name);//methods are abstract. By default methods are public
	
}

interface showAge extends showName // an interface can extends another interface
{
	void showAge(int age);//methods are abstract. By default methods are public
	
}
public class InterfaceDemo implements showAge {
	
	 public void showName(String name)
	 {
		 System.out.println("name is: " + name);
	 }
	 public void showAge(int age)
	 {
		 System.out.println("age is: " + age);
	 }

	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.showName("Tayyab");
		obj.showAge(25);

	}

}
