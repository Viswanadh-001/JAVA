package Collection_Framework.HashSet;

import java.util.HashSet;

public class HashSet_3 {

	public static void main(String[] args) {
		HashSet set1 = new HashSet ();
		HashSet set2 = new HashSet ();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);

		set2.add(30);
		set2.add(40);
		set2.add(50);
		set2.add(60);
		
		set1.addAll(set2);
		System.out.println(set1);
		//System.out.println();

	}

}
