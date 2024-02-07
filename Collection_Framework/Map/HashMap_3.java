package Collection_Framework.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_3 {

	public static void main(String[] args) {
		
		HashMap<String, String> emp = new HashMap<String, String>();
		emp.put("Ids","101");
		emp.put("Name","Viswanadh");
		emp.put("Salary","45000");
		emp.put("Email","viswanadh@gmail.com");
		emp.put("Location","Nellore");
		
		System.out.println(emp);
		
		Collection <String> values = emp.values();
		Set<String> keys = emp.keySet();
		
		System.out.println(values);
		System.out.println(keys);
		
		for(String value:values) {
			System.out.println(value);
		}
	}

}
