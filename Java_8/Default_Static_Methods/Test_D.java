package Java_8.Default_Static_Methods;

public interface Test_D {
	default void m1() {
		System.out.println("Default method  - Interface");
	}
}
class TestDefault implements Test_D{
	public void m1() {
		System.out.println("if we are not satisfied with inteface default method we can override."); 
		System.out.println("Class level overriding version of default Method");
	}
	public static void main(String[] args) {
		TestDefault t = new TestDefault();
		t.m1();
	}
}