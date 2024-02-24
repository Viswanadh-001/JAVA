package Strings;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hello";
		
		char[] chArr = str.toCharArray();
		for(int i = chArr.length - 1;i>=0;i--) {
			System.out.print(chArr[i]);
		}
		
		System.out.println("");
		
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");

		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
//	    StringBuilder sbu = new StringBuilder(str);
//	     System.out.println(sbu.reverse());

}
