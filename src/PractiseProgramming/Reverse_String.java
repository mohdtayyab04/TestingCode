package PractiseProgramming;

public class Reverse_String {

	public static void main(String[] args) {
		String org= "abcd";
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
			
		}
		System.out.println("orignal String "+ org);
		System.out.println("reverse String "+ rev);
	}

}
