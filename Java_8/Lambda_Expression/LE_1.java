//package Java_8.Lambda_Expression;
//
//interface LE_1 {
//	  void m1();
//}
//class Test implements LE_1 {
//	 public void m1() {
//		 System.out.println("Test class m1");
//	 }
//	public static void main(String[] args) {
//		LE_1 obj = new Test();
//		obj.m1();
//	 }
//}

package Java_8.Lambda_Expression;

interface LE_1 {
	  void m1();
}
class Test  {
	public static void main(String[] args) {
		LE_1 i = ()->{
			System.out.println("Test");
		};
		i.m1();
	 }
}

  