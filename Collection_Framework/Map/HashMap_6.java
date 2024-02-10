package Collection_Framework.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_6 {

	public static void main(String[] args) {
		HashMap <String,String> emp = new HashMap<String,String>();
		emp.put("Id","546");
		emp.put("Name","Sai");
		emp.putIfAbsent("Name"," Sai");
		emp.putIfAbsent("name","Charan");
		emp.put("Salary","45000");
		
		System.out.println(emp);
		 
		Set<String> keys = emp.keySet();
		
		for(String key:keys) {
			System.out.println(key);
		}
		
		Collection<String> values = emp.values();
		for(String value : values) {
			System.out.println(value);
		}
		}

}
