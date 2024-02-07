package Collection_Framework.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_4 {

	public static void main(String[] args) {
		HashMap<String, String> emp = new HashMap<String,String>();
		emp.put("id","101");
		emp.put("id","102");
		emp.putIfAbsent("name","Viswanadh");
		emp.put("Salary","45000");
		
		Set<String> keys = emp.keySet();
		Collection<String> values = emp.values();
		Set<Entry<String,String>> entries = emp.entrySet();	
		
		System.out.println(keys);
		System.out.println(values);
		System.out.println(entries);
	}

}
