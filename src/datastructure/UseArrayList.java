package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list = new ArrayList<String>();

		list.add("Chapman");
		list.add("Larry");
		list.add("Curly");
		list.add("Moe");
		list.remove(2);

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for (String X : list) {
			System.out.println("listed Names are -:" + X);
		}
	}
}
