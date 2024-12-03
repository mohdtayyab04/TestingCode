package PractiseProgramming;

public class Duplicate_values {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,3,2};
		for(int i=0;i<a.length;i++) //outer loop
		{
			for(int j=i+1;j<a.length;j++) //inner loop 
			{
				if(a[i]==a[j]) {  //pata lag jayega duplicate value hai
					System.out.println(a[i]);
				}
			}
		}

	}

}
