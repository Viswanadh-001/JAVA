package OOPS.Over_loading;

public class Test3 {
	public void Sai(Object a) {
		System.out.println("Sai");
	}
	
	public void Sai(String s) {           
		System.out.println("Viswanadh");
	}                                 //            char convert to int
	                                 //               |
	public void sai(int a) {        //  byte->short->int->long->float->double
		System.out.println("Nellore");
	}
	
	public void Sai(StringBuffer sb) {
		System.out.println("Kuppachi");
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.Sai(new Object());
		t.Sai("Hello");
		t.Sai(new StringBuffer ("Hii"));
		t.sai('c');//int a method
	}

}
