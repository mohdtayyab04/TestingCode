package PractiseProgramming;

public class Duplicate_String {

	public static void main(String[] args) {
		String D="Tayyab";
		for(int i=0;i<D.length();i++) 
		{
		for(int j=i+1;j<D.length();j++) 
		{
			if(D.charAt(i)==D.charAt(j)) 
			{
				System.out.println(D.charAt(i));
			}
		}
		}
	}

}
