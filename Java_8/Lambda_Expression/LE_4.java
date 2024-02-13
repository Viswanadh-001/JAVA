package Java_8.Lambda_Expression;

public interface LE_4 {
	public int sqrt(int a);
}
class Test_2{
	public static void main(String[] args) {
		LE_4 i = a->a*a;
		System.out.println("SQRT of 10 is : " + i.sqrt(10));
	}
}
