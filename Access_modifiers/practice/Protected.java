package Access_modifiers.practice;

public class Protected {
	protected int a = 100;
	protected void method () {
		System.out.println("Protected method can be accessed within/out the package");
	}
	public static void main(String[] args) {
		//System.out.println(a);
		Protected obj = new Protected();
		System.out.println(obj.a);
		obj.method();
	}
}

