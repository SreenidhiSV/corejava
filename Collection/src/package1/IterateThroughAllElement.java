package package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IterateThroughAllElement {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		//create arraylist
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cat");
		arrayList.add("Duck");
		//iterate through all element
		Iterator it = arrayList.iterator();
		
		//using whileloop method1
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//using for loop in second method 
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(6);
		arrayList1.add(7);
		
		for(Integer i : arrayList1) {
			System.out.println(i);
		}
	}
}
