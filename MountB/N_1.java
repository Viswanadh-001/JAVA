package MountB;

public class N_1 {

	public static void main(String[] args) {
		int n = 5; 

        for (int i = 0; i < n; i++) {
            char cChar = 'A';

            for (int j = 0; j <= i; j++) {
                System.out.print(cChar);
                cChar++;
            }

            for (int k = i - 1; k >= 0; k--) {
                System.out.print((char) ('A' + k));
            }
            System.out.println(); 
        }
        
	}

}
