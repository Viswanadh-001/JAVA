package Arrays;

public class A_1 {

	public static void main(String[] args) {
		int sum = 0;
		int arr[] = {2,5,1,9,6};
		
		for(int i = 0; i <= arr.length-1; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
