package Collection_Framework.LinkedList;

import java.util.LinkedList;

public class LinkedList_1 {

	public static void main (String[] args) {
		LinkedList<Integer> ids = new LinkedList<>();
		
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		
		ids.remove(2);//indexing
		ids.remove(Integer.valueOf(104));//element
		
		System.out.println(ids);
	}
}