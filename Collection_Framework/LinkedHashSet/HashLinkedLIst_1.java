package Collection_Framework.LinkedHashSet;

import java.util.LinkedHashSet;

public class HashLinkedLIst_1 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(101);
		lhs.add(101);
		lhs.add("Rahul");
		lhs.add(true);
		lhs.add(null);
		
		System.out.println(lhs);
	}

}
