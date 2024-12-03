package JavaOops;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// declaration and initantiate array
		
		//int [][] a= new int [3] [2]; // 3 rows and 2 columns
		
		//insert values in array
		//a[row] [column]
		/*
		 * a[0][0] = 11; // row=0, column =0; a[0][1] = 12; // row =0, column =1;
		 * a[1][0] = 13; // row=1, column =0; a[1][1] = 14; // row =1, column =1;
		 * a[2][0] = 15; // row=2, column =0; a[2][1] = 16; // row =2, column =1;
		 */
int a[][] = {{11,12,13,14,15,13}};

		////////print size of row and column.

		int b[][]= {{11,12},{13,14},{15,16},{17,18}};
		
		////Changing the Value of array number
		b [1][0]=25;
		System.out.println("no. of row:" + b.length); // no. of row.
		System.out.println("no. of column:" + b[0].length); //no. of column.
		//System.out.println(b[0] [1]);
		
		//////////Read Value from array.	
		
		/*for(int i =0; i<b.length; i++) // i=0 i=1 i=2 			i=3(loop exit) 
		{
			for(int j =0; j<b[0].length; j++) // j=0 j=1        j=2(loop exit)
				
		{*/
			/*
			 * if(i==4) break;
			 */
		//enhanced for loop
	for(int []row:b) //{11,12} {13,14} {15,16}
	{
		for(int columnValue:row) // row=11,12, row=13,14 row=15,16  
		{
			System.out.println(columnValue);
			//System.out.println(b[i][j]); // 11 12 13 14 15 16 
		}
	}

}}
