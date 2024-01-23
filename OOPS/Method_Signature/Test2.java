package OOPS.Method_Signature;

public class Test2 {
	void method1(int a) {
		System.out.println("10");
	}
	
	void method1(String name) {
		System.out.println("Sai Viswanadh");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.method1(1);
		t.method1("Charan");
	}

}
