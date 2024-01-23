package OOPS.Method_Signature;
// method signature is name of method and arguments list
public class Test {
	public void m1(int i) { // method signature
		System.out.println("m1() method  - int argument Type");
	}
	
	public int m1(float f) {
		System.out.println("m1() method  - float argument Type");
		return 10;
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1(10);
		t.m1(10.5f);
	}
}
