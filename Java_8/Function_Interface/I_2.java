package Java_8.Function_Interface;

public interface I_2 {
	int sqrt(int a);
}

class sq_2{
	public static void main(String[] args) {
		I_2 i = a->a*a;
		System.out.println("SQRT : "+ i.sqrt(10));
	}
}
 