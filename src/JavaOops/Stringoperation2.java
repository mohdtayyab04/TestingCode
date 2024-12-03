package JavaOops;

public class Stringoperation2 {

	public static void main(String[] args) {
		String s = "Welcome"; //Strat Index (W=0, E=1, l=2, c=3, o=4, m=5, e=6)
							  //End Index (W=1, E=2, l=3, c=4, o=5, m=6, e=7)
		
		//Substring = "Come"
		System.out.println(s.substring(3, 7));
		System.out.println(s.contains("come"));
		
		//End With
		String a ="Do you know";
		System.out.println(a.endsWith("know"));
		
		String s1 ="Welcome";
		String s2="welcome";
		String s3=" Home";
		System.out.println("Is s1 equals to s2:" + s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s3));
		System.out.println(s1.concat(" Home"));
	}

}
