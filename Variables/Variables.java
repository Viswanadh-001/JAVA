package Variables;
class Variables {
	int x=100;//instant variable
	
	
	static int b = 10; //static variable
	
	
	public static void main(String[] args) {
		Variables v1 = new Variables();//for instance variable using only object
		System.out.println(v1.x);
		
		
		
		System.out.println(b);//for static variable accessing directly
		System.out.println(Variables.b);//for static variable accessing by class name
//		Variables v = new Variables();//for static variable accessing by object
//		System.out.println(v.b);
		
		
	}
}
