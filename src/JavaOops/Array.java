package JavaOops;

public class Array {

	public static void main(String[] args) {
		//int roll[] = new int[5];
		//roll[0]=10;
		//roll[1]=20;
		//roll[2]=30;
		//roll[3]=40;
		//roll[4]=50;
int roll[]= {10,20,30,40,50};		
System.out.println("size of array:" +roll.length);
System.out.println("value of 4th index: " + roll[3]);
for(int i =0; i<roll.length; i++)
{
	/*
	 * if(i==4) break;
	 */
	System.out.println(roll[i]);
}
	//for each loop (Arrays k liye specially use karte hai Arrays ki value print karane k liye)= enhanced loop	
for(int i:roll)
{
	System.out.println(i);
}
	}

}
