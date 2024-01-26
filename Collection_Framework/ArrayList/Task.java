package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String> ();
		al.add("Viswanadh");
		al.add("Sai");
		al.add("Charan");
		al.add("Pawan kalyan");
		
		System.out.println(al);
		
		for(String name:al) {
			System.out.println(name);
		}
		
		Collections.sort(al);
		System.out.println(al);
	}

}
