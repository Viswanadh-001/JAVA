package Strings;

public class Test_1 {

	public static void main(String[] args) {
		StringBuffer a1 = new StringBuffer("Sai");
		StringBuffer a2 = new StringBuffer("Sai");
		
		String s1 = new String("Sai");
		String s2 = new String ("Sai");
		
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));//Reference Comparison.
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));//content comparison.
	}
}
