package Collection_Framework.ArrayList;

import java.util.ArrayList;
//import java.util.Collections;

public class AL_6 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Vinay");
		name.add("Viswanadh");
		name.add("Hemchand");
		
		name.add("Suresh");
		name.add("Suyeesh");
		name.add("Balaji");
		
		System.out.println(name);
		
		name.remove(0);
		name.remove("Suresh");
		
		System.out.println(name);
		
	}

}
