 package Access_modifiers.practice;

public class Private {
	
		private int a = 10;//private variables and methods can be accessed within the class
		
		private void method() {
		System.out.println("Hello");
		}
		public static void main(String[] args) {      
			Private obj = new Private();
			System.out.println(obj.a);
			obj.method();
		}
}

//class Pri2 extends Private{
//	public static void main(String[] args) {
//		Pri2 obj = new Pri2();
//		System.out.println(obj.a);// can't access because a is declared as private
//		obj.method();//can't access because method is declared as private
//	}
//}
