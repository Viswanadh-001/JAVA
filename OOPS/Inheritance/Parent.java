package OOPS.Inheritance;
//Advantage of inheritance is code reusability
// reuse the existing function and add new functionality
public class Parent {
	public void m1() {
		System.out.println("Parent class m1 method");
	}
}

class Child extends Parent{ // Class can extends only once at time
	public void m2() {
		System.out.println("Child class m2 method");
	}
}

