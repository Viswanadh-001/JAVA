package Collection_Framework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_3 {

	public static void main(String[] args) {
		LinkedList<Integer> ids=new LinkedList<Integer>();
		
		ids.add(103);
		ids.add(109);
		ids.add(102);
		ids.add(105);
		
		Collections.sort(ids);
		
		System.out.println(ids);
		
		Collections.sort(ids,Collections.reverseOrder());
		
		System.out.println(ids);
	}
}