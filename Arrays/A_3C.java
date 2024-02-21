package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class A_3C {

	public static void main(String[] args) {
		String a[] = {"Chai","Coffee"};
		String b[] = {"Milk","Water","Coke"};
		
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(a));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(b));
		
		list1.addAll(list2);
		
		String[] mergedArray = list1.toArray(new String[0]);
		
		System.out.println(Arrays.toString(mergedArray));

		}
}
