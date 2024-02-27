package Strings;

public class Test {

	public static void main(String[] args) {
		System.out.println("String is im mutable");
		String s = new String("Sai");
		s.concat("Viswanadh");
		System.out.println(s);
		
		System.out.println(" ");
		
		System.out.println ("StringBuffer is mutable :");
	 	StringBuffer a = new StringBuffer("Sai");
		a.append(" Viswanadh");
		System.out.println(a);
	}
}
