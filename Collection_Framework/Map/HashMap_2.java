package Collection_Framework.Map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap_2 {

	public static void main(String[] args) {
		HashSet<Integer> ids = new HashSet<Integer>();
		System.out.println(ids);
		ids.add(101);
		
		HashMap<String, String> emp = new HashMap<String, String>();
		emp.put("Ids","101");
		emp.put("Name","Viswanadh");
		emp.put("Salary","45000");
		emp.put("Email","viswanadh@gmail.com");
		emp.put("Location","Nellore");
		
		System.out.println(emp);
	}

}
