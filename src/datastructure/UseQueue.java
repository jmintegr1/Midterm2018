package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> newQ = new LinkedList<Integer>();
		newQ.add(600);
		newQ.add(800);
		newQ.add(720);
		newQ.add(3025);
		newQ.add(255);
		System.out.println(newQ.peek());
		System.out.println(newQ.poll());
		System.out.println(newQ.peek());
		System.out.println(newQ.remove());
		System.out.println(newQ.peek());


		System.out.println("For loop result set of data: ");
		for (Integer in : newQ) {
			System.out.println(in);
		}

		System.out.println("While loop result set of data: ");
		Iterator itr = newQ.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}

	}

}
