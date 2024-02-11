package Java_8.Lambda_Expression;

public interface LE_3Wo {
	public void methodOne();
}
class Teest {
	public static void main(String[] args) {
		LE_3Wo i = ()->{
			System.out.println("Method1");
		};
		i.methodOne();
	}
}
