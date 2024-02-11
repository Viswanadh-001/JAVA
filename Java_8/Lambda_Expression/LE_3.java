package Java_8.Lambda_Expression;

public interface LE_3 {
	public void methodOne();
}
 class Test_1 implements LE_3{

	public void methodOne() {
		System.out.println("Method");
	}
	public static void main(String[] args) {
		LE_3 i = new Test_1();
		i.methodOne();
	}
}