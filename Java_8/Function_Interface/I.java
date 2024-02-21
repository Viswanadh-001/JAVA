package Java_8.Function_Interface;

interface I {
	 int sqrt(int a);
}
class Sq implements I{
      public int sqrt(int a){
		System.out.println("SQRT : " + a*a);
		return a;
	}
      public static void main(String[] args) {
		I i = new Sq();
		i.sqrt(10);
	}
}