package package1;

import java.util.ArrayList;

public class RemoveTheElement {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("TVM");
		arrayList.add("Kollam");
		arrayList.add("Pathanamthitta");
		arrayList.add("Aappuzha");
		System.out.println(arrayList);
		
		//remove
		arrayList.remove(2);
		System.out.println("After removing the third element from the Arraylist:\n"+arrayList);
	 }
}
		
		
		
	
