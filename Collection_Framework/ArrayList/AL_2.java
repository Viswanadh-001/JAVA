package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class AL_2 {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	ArrayList<Integer> ids=new ArrayList<Integer>();
	ArrayList<String> enames=new ArrayList<String>();
	
	 al.add(100);
	al.add("pspk");
	
	ids.add(101);
	ids.add(102);
	
	enames.add("Sai");
	enames.add("Viswanadh");
	enames.add("Charan");
	enames.add(null);
	enames.add(null);
	
	System.out.println(al);
	System.out.println(ids);
	System.out.println(enames);
}
}
