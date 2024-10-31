package package1;
import java.util.ArrayList;

public class SearchAnElement {

	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("TVM");
		arraylist.add("Kollam");
		arraylist.add("Pathanamthitta");
		arraylist.add("Alappuzha");
		System.out.println(arraylist);
		
		    if (arraylist.contains("kannur")) {
		    	
		    System.out.println("Found the element");}
		    else
		    {
		    System.out.println("There is no such element");
		    }
	}
}
