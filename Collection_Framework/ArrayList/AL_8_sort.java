package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AL_8_sort {

	public static void main(String[] args) {
		
      ArrayList<String> name = new ArrayList<String>();
		
		name.add("Shahrukh");
		name.add("Pawan Kalyan");
		name.add("Rajini");
		name.add("Mohan");
		name.add("Puneeth");
		name.add("Salman");
		
		System.out.println(name);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.shuffle(name);
		System.out.println(name);
	}

}
