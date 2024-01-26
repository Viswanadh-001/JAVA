package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class AL_3 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Venkat");
		names.add("Subramani");
		names.add("Sai");
		names.add("Viswanadh");
		names.add("Charan");
		
		System.out.println(names);
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
	}

}
