package JavaCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {
		
// Create LinkedList for String
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println("Before addfirst method:" +cars);//[Volvo, BMW, Ford]
		cars.addFirst("Mazda");
		System.out.println("after addfirst method:" +cars);//[Mazda, Volvo, BMW, Ford]
		cars.addLast("maruti");
		System.out.println("after addLast method:" +cars);//[Mazda, Volvo, BMW, Ford, maruti]
		cars.removeFirst();
		System.out.println("after removeFirst method:" +cars);//[Volvo, BMW, Ford, maruti]
		cars.removeLast();
		System.out.println("after removeLast method:" +cars);//[Volvo, BMW, Ford]
		
		System.out.println("GetFirst() method:" +cars.getFirst());
		System.out.println("GetLast() method:" +cars.getLast());
		
//Push operation: stack k liye hota hai
		
		System.out.println("before push method:" +cars);//[Volvo, BMW, Ford]
		cars.push("new");
		System.out.println("before push method:" +cars);//[new, Volvo, BMW, Ford]
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
