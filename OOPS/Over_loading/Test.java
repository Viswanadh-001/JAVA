package OOPS.Over_loading;


public class Test {
//A method having same name and having different arguments is called overloading.
	//those methods are known as overloaded methods
	public void m1() {
		System.out.println("m1() method - zero arguments");
	}
	public void m1(int i) { // method signature
		System.out.println("m1() method  - int argument Type");
	}
	
	public int m1(float f) {
		System.out.println("m1() method  - float argument Type");
		return 10;
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.5f);
	}

	

}
