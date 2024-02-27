package Patterns;

public class ex_2 {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			
			for(int k = 0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				if(j %2 == 0) {
					System.out.print("rrr ");
				}else {
					System.out.print("kgf ");
				}
			}
			System.out.println();
		}
	}

}
