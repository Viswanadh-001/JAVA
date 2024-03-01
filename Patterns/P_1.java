package Patterns;

public class P_1 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1;i<=n ;i++) {
			for(int c = 1;c<=i;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
