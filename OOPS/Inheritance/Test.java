package OOPS.Inheritance;

public class Test{
	public static void main(String[] args) {
	      Child c = new Child();
		c.m1();
		c.m2();
		Parent p = new Child(); //parent can hold Child 
		p.m1();   
		//p.m2(); compile time error
		Parent p1 = new Parent();
		p1.m1();
		//p2.m2(); compile time error
	}
}
