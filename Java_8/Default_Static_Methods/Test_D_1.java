package Java_8.Default_Static_Methods;

interface Top {
	default void m1() {}
}
interface bottom{
	default void m1() {}
}
class Demo implements Top,bottom{ 
	public void m1() {
		System.out.println("Duplicate default method named m1 are inherited from top to bottom classes");
		System.out.println("Test class m1 method");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}
}
