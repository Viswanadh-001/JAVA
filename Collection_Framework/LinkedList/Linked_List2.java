package Collection_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List2 {
	
	public static void main(String[] args) {
		LinkedList<String> emp = new LinkedList<>();
		emp.add("Sai");
		emp.add("Viswanadh");
		emp.add("Charan");
		emp.add("Kuppachi");
		
		emp.remove(3);
		System.out.println(emp);
		
		System.out.println(" ");	

		System.out.println("Using for Loop :");	
		
		for(int i=0;i<=emp.size()-1;i++) {
			System.out.println(emp.get(i));
		}
		
		System.out.println(" ");	

		System.out.println("Using for each Loop :");	
		
		for(String emps:emp) {
			System.out.println(emps);
		}
		System.out.println(" ");	
		
		System.out.println("Using Iterator :");
		
		Iterator<String> itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
