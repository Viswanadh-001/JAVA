package OOPS.Over_Riding;

public class Test {
	public void Sai() {
		System.out.println("Sai");
	}
	
	public void Charan () {
		System.out.println("Viswanadh");
	}
}
class Child extends Test{	
		public void Charan () {
			System.out.println("Charan");
		}
	}


