package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class AL_1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100); //0
		al.add(100); //1
		al.add("pspk");//2
		al.add(true);
		al.add(45000.00);
		al.add(null);
		System.out.println(al);
		
		System.out.println(al.get(2));
		al.set(2, "Viswanadh");
		System.out.println(al);
	}

}
