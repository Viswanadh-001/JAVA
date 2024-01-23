 package OOPS.Constructor;

public class Test2 {
	Test2(){
		this(10);
		System.out.println("Constructor - one");
	}
	Test2(int i){
		super();
		System.out.println("Constructor - 123"); 
	}
	public static void main(String[] args) {
		new Test2();
			}
}
