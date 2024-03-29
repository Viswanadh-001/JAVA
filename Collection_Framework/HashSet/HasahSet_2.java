package Collection_Framework.HashSet;

//import java.util.Collections;
import java.util.HashSet;

public class HasahSet_2 {

	public static void main(String[] args) {
		HashSet<Integer> ids = new HashSet<Integer> ();
		ids.add(107);
		ids.add(103);
		ids.add(10);
		ids.add(30);
		
		System.out.println("IDS:");
		System.out.println(ids);
		//Collections.sort(ids); sorting is not applicable in Hashset
		
		for(Integer id : ids) {
			System.out.println(id);
		}
		System.out.println(" ");
	
		HashSet<String> names = new HashSet<String>();
		names.add("Pspk");
		names.add("Thala");
		names.add("NTR");
		names.add("NBK");
		System.out.println("Names :");
		System.out.println(names);
		
		for (String name:names) {
			System.out.println(name);
		}
	 }
	}


