package JavaCollection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
//Declare Linked List		
	//Collection 1	  
		LinkedList<String> ll=new LinkedList<String>(); 
		ll.add("Tayyab"); //index=0
		ll.add("Asir");   //index=1
		ll.add("Zaid");   //index=2
		ll.add("Zabi");   //index=3 
		System.out.println("After adding elements:" + ll);
		ll.add(1, "Yahyah");
		System.out.println("After adding Yahyah:" + ll);
		
	//Collection 2
		LinkedList<String> lm=new LinkedList<String>(); 
		lm.add("mohammad"); //index=0
		lm.add("ayesha");   //index=1
		lm.add("Zainab");   //index=2
		
		ll.addAll(lm);
//Add Collection2 LM to the end of Collection1 ll
		System.out.println("After adding Collection2 to Collection1:" + ll);
		
// Remove methods 
		ll.remove("Tayyab");
		System.out.println("After removing tayyab from Collection1:" + ll);
		ll.remove(0);
		System.out.println("After removing 2nd element from Collection1:" + ll);
		ll.removeAll(lm);
		System.out.println("After removing Collection2  from Collection1:" + ll);
		
// Get & Print element of position 1st
		System.out.println("Element at 1st position at is:" +ll.get(1));//Zaid
		
// Replace Zaid at 1st position by "farhan"
		ll.set(1, "farhan");
		System.out.println("after replacing Zaid by Farhan:" +ll);//Zaid
		
// Contains method:- check if farhan exist in the collection1
		System.out.println(ll.contains("farhan"));

// Remove all the element from the collection1
		ll.clear();
		System.out.println("after removing all the element from collection1:"+ll);
		
		
		
		
		
		
		
		
		
		
	}

}
