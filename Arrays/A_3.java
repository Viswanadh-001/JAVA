package Arrays;

public class A_3 {

	public static void main(String[] args) {
		String a[]= {"Chai","Coffee"};
		String b[]= {"Milk","Water","Coke"};
		
		int len1=a.length;
		int len2=b.length;
		int mergedLen= len1 + len2;
		
		String[] mergedArr = new String[mergedLen];
		for (int i = 0; i < len1; i++) {
            mergedArr[i] = a[i];
        }

        for (int i = 0; i < len2; i++) {
            mergedArr[len1 + i] = b[i];
        }

        for (int i = 0; i < mergedLen; i++) {
            System.out.print(mergedArr[i] +" ");		}
	}
}
