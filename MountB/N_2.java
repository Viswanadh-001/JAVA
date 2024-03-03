package MountB;

public class N_2 {

	public static void main(String[] args) {
		int bill[]= {3,10,2,9};
		int k = 1;
		
		int totalB = 0;
		
		for(int i = 0; i< bill.length;i++) {
			if(i!= k) {
				totalB += bill[i];
			}
		}
		
		int actualB = totalB / 2;
		
		if(bill[k] == actualB) {
			System.out.println("Bon Appetit");
		}else {
			System.out.println(bill[k] - actualB);
		}
		
	}

}
