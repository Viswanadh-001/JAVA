package Arrays;

public class A_4 {

	public static void main(String[] args) {
		int arr[] = {2,5,1,9,6};
		
		int maxValue = Integer.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("value- " + maxValue + " Index- " + maxIndex);
	}

}
