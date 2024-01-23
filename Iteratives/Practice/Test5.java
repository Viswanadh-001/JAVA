package Iteratives.Practice;

public class Test5 {

	public static void main(String[] args) {
		int  n = 345,rev=0,rem;
		
		while(n!=0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println(rev);
	}

}
