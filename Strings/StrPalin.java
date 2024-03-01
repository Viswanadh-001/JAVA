package Strings;

public class StrPalin {

	public static void main(String[] args) {
		String a = "radar";
		boolean isPalindrome = isPalindrome(a);
		System.out.println(a + " is a palindrome: " + isPalindrome);
	}

	private static boolean isPalindrome(String a) {
		StringBuffer reversed = new StringBuffer(a).reverse();
		return a.equals(reversed.toString());
	}

}
