package Patterns;

public class P_5 {

	public static void main(String[] args) {
		int n = 5;
		for(int r = 1;r<2*n;r++) {
			int co = r>n ? 2* n - r: r;
			for(int c = 0; c< co ;c++) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
