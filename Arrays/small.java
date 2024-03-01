package Arrays;

public class small {

	public static void main(String[] args) {
		int a[]= {10,2,4,7,8,9};
		int b[]= {10,6,4,7,8,9};
		int min  = a[0];
		int min1 = b[0];
		for(int i = 0; i<a.length-1;i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		for(int j = 0;j<b.length-1;j++) {
			if(min1<a[j]) {
				min1 = b[j];
			}
		}
		System.out.println("Minimum value in array1 is: " + min);
		System.out.println("Maximum value in array2 is: " + min1);

		}

}
