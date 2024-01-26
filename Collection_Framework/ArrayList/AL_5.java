package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class AL_5 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Hemchand");
		names.add("Suyeesh");
		names.add("Viswanadh");
		
		names.add("Balaji");
		names.add("Suresh");
		names.add("Vinay");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Charan"));
		System.out.println(names.size());
	}

}
