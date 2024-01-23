package Interface;

public class User {

	public static void main(String[] args) {
		Lenovo obj = new Lenovo();
		obj.copy();
		obj.paste();
		obj.cut();
		obj.keyboard();
		System.out.println();
		
		HP obj2 = new HP();
		obj2.capture();
	}

}
