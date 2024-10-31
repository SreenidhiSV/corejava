package package1;

import java.util.ArrayList;

public class RetrieveAnElement {

	public static void main(String[] args) {
		/*ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		System.out.println(arrayList);*/
		
		ArrayList<Integer>arraylist=new ArrayList<Integer>();
		arraylist.add(1);//0
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		System.out.println(arraylist);
		//retrieve an element
		
		Integer integer = arraylist.get(1);
		  System.out.println("Second Element: "+integer);
		
	}
}


