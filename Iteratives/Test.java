package Iteratives;

public class Test {

	public static void main(String[] args) {
		String name = "Hello";
				for(int i=0;i<=5;i++) {
					System.out.println(name);
				}
				String name1 = "Good Morning";
				int j= 0;
				
				while(j<=5) {
					System.out.println(name1);
					j++;
				}
				String name2 = "Evening";
				int k = 0;
				do {
					System.out.println(name2);
					k++;
				}while(k<=5);
				
		int[] a= {10,20,30,40,50};
		
		for(int i=0;i<a.length;i++) {      // using for loop
			System.out.println(a[i]);
		}
		
		for(int Size:a) {                 //using for each
			System.out.println(Size);
		}
	}

}
