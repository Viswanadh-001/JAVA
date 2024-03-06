package MountB;

import java.util.HashSet;

public class Q_1 {//Sales by Match

	public static void main(String[] args) {
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		
		int count = 0;
		HashSet<Integer> a = new HashSet<>();
		for(int i = 0; i<n;i++) {
			int num = ar[i];
			if(!a.contains(num)) {
				a.add(num);
			}else {
				count++;
				a.remove(num);
			}
		}System.out.println(count);
	}

}
