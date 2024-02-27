package Patterns;

public class ex_1 {

	public static void main(String[] args) {
		int l = 1;
		int n = 5;
		
		while(l<=n) {
			int k = 1;
			while(k<=l) {
				if(k%2==0) {
					System.out.print("rrr ");
				}else {
					System.out.print("kgf ");
				}
			     k++;
			}
			System.out.println();
			l++;
		}
	}

}
