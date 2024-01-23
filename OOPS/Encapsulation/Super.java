package OOPS.Encapsulation;
class A{
	int a = 100;
	public void display() {
		System.out.println("Class - A  Display method");
	}
}

class B extends A{
	//int a = 200;
	int a = super.a;
	public void display() {
		super.display();
		System.out.println("Class - B  Display method");
	}
}
public class Super {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		b.display();
	}

}
