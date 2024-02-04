package Collection_Framework.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet_1 {

	public static void main(String[] args) {
		HashSet hs =new HashSet ();
		hs.add(10);
		hs.add(10);//Duplicates can't be executed
		//hs.add("sai");
		hs.add(true);
		hs.add(null);
		hs.add("sai");
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
