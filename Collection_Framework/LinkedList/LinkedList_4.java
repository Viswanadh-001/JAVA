package Collection_Framework.LinkedList;

import java.util.LinkedList;

public class LinkedList_4 {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Sai");
		names.add("Viswanadh");
		
		System.out.println(names);
		
		names.addFirst("Kuppachi");
		names.addLast("Charan");
		
		System.out.println(names);
	}

}
