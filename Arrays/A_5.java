package Arrays;

public class A_5 {

	public static void main(String[] args) {
		String arr[] = {"Coffee","water","Chai","diet coke"};
		String minLength = arr[0];
               int minIndex = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length() < minLength.length()) {
				minLength = arr[i];
				minIndex = i;
			}
	}
		System.out.println("value- " + minLength + " Index- " + minIndex);
	}
}
