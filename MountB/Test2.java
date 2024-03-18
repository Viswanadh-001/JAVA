package MountB;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Capacity: " + sb.capacity());
		
		for(int i = 1; i<=100;i++) {
		sb.append("A");
		System.out.println("Capacity "+ i +":"+ sb.capacity());
		}
	}

}
