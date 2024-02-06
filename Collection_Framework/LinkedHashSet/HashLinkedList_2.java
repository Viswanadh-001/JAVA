package Collection_Framework.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashLinkedList_2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> ids = new LinkedHashSet<Integer>();
		
		ids.add(10);
		ids.add(900);
		ids.add(500);
		ids.add(60);
		ids.add(10);
		
		System.out.println(ids);
		
		System.out.println(" ");
		System.out.println("Using For Each : ");
		
		for(Object elms:ids) {
			System.out.println(elms);
		}
		System.out.println(" ");
		System.out.println("Using Iterator");
		
		Iterator<Integer> itr = ids.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
