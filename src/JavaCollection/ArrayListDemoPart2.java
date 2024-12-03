package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemoPart2 {

	public static void main(String[] args) {
//Declare arrayList
			List<String> Al = new ArrayList<String>();
// add data to arraylist
				Al.add("S");  		//index =0
				Al.add("X");		//index =1
				Al.add("G");        //index =2
				Al.add("T");       //index =3
				Al.add("Y"); 	   //index =4
				Al.add("T");       //index =5
				Al.add("U");       //index =6
				Al.add("H");       //index =7
				
				
//				System.out.println(Al.size());
//				ArrayList<String> Al2 = new ArrayList<String>();
//				System.out.println("Before adding:" + Al2);
//				Al2.addAll(Al);
//				System.out.println("After adding:" + Al2);
//Remove all
//				Al2.removeAll(Al);
//				System.out.println(Al2);
				
				
//Loop through elements of array list
//1. For Loop
				
			//	for(int i=0;i<Al.size();i++)
				//	{
				//		System.out.println(Al.get(i));
				//	}
//2. For each Loop
				//	for(String i:Al)
				//	{
				//	System.out.println(i);
				//	}
				
//3. Iterator:- Interface ek universal iterator hai java collection framework main jo hum kisi bhi collection object pe apply kar sakte hai aggar hume 
				// forward direction main move/traverse karna hai element ko access karna hai forward direction main toh hum iterator interface ko use karke hum
				//iterate kar sakte hai traverse kar sakte hai collection object ko.
				
				//	Iterator it = Al.iterator();
				//	while(it.hasNext())
				//	{
				//	System.out.println(it.next());
				//       }
				
//Sort arraylist in assending order
				System.out.println("Before sorting:" + Al);
				Collections.sort(Al);
				System.out.println("After sorting in assending order:" + Al);
				
//Sort arraylist in Desending order
				System.out.println("Before sorting:" + Al);
				Collections.sort(Al,Collections.reverseOrder());
				System.out.println("After sorting in Desending order:" + Al);
				
				
//shuffle arraylist 
				Collections.shuffle(Al);
				System.out.println("After shuffling:" + Al);
				
//Create String array 
				String[] cars= {"Volvo", "Bwm", "Ford"};
				
//Create arraylist then convert String into ArrayList
				
				ArrayList al=new ArrayList(Arrays.asList(cars));
				System.out.println(al);
				
				
	}

}
