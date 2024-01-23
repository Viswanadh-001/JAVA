package OOPS.Over_loading;

public class Test2 {
	void wish(String s) {
		System.out.println("Viswanadh");
	}
	
	void wish(StringBuffer sb) {
		System.out.println("Charan");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.wish("Hello");
		t.wish(new StringBuffer ("Well"));
	}

}
