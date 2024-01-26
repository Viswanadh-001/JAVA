package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class AL_7_All {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Shahrukh");
		name.add("Pawan Kalyan");
		name.add("Rajinikanth");
		
		System.out.println(name);
		
		ArrayList<String> names_1=new ArrayList<String>();
		
		names_1.add("Mohan Lal");
		names_1.add("Puneeth Rajkumar");
		
		name.addAll(names_1);
		System.out.println(name);
		
		ArrayList<String> names_2=new ArrayList<String>();
		
		names_2.add("Vijay");
		names_2.add("Ajith");
		
		name.addAll(names_2);
		System.out.println(name);
		
		name.removeAll(names_2);
		System.out.println(name);
	}

}
