package JavaCollection;

import java.util.ArrayList;

public class ArrayListDemoPart1 {

	public static void main(String[] args) {
//Declare ArrayList
		ArrayList Al = new ArrayList(); //for hetrogenous data
// add data to arraylist
		Al.add("Java");  //index =0
		Al.add(66);		//index =1
		Al.add('g');        //index =2
		Al.add(true);       //index =3
		Al.add(12.2);      //index =4

//size method
		System.out.println(Al.size()); 

//print array List
		System.out.println(Al);

//Remove Elements

		Al.remove(1); //remove index =1 i;e 66

//print array List
		System.out.println(Al);
		
//Get method - to access values/element from arrayList
		Al.get(0);
		System.out.println(Al);
		
//set method - used to replace/change element from arrayList
		Al.set(2, "tayyab");
		System.out.println(Al);
		
//size- to find how many elements array list have
		//size method
				System.out.println(Al.size());
				
//insert element in arraylist by using index
				Al.add(4, 66);
				System.out.println(Al);
				
//size method
				System.out.println(Al.size());
				
//contains- to search element in arrayList
				System.out.println(Al.contains(66));//True 
				System.out.println("Is arrayList empty:"+ Al.isEmpty());//false 
				
//clear method = removes all the elements from the lists
				Al.clear();
				System.out.println("After clear method: "+ Al);
				
				
	}

}
