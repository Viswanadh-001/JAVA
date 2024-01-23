package OOPS.method_Hiding;

class Parent {
	public static void m1() {
		System.out.println("Parent Class m1 method");
	}
}
class Child extends Parent{
	public static void m1() {
		System.out.println("Child class m1 method");
	}
}
	
