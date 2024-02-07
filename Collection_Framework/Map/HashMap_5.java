package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_5 {

	public static void main(String[] args) {
		HashMap<String,String> emp = new  HashMap<String,String>();
		emp.put("Ids", "546");
		emp.put("Name","Viswanadh");
		emp.put("Salary","45000");	
		
	Set<Entry<String,String>> entries = emp.entrySet();
	
	System.out.println(entries);
	
	Iterator<Entry<String, String>> itr = entries.iterator();
	while(itr.hasNext()) {
		Map.Entry<String, String> entry = itr.next();
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	}

}
