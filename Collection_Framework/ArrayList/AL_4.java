package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class AL_4 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Sai");
		name.add("Viswanadh");
		name.add("Charan");
		name.add("Pawan Kalyan");
		
		System.out.println(name);
		
		for(String names:name) {
			System.out.println(names);
		}
	}
}
