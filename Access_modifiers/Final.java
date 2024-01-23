package Access_modifiers;
class Final {
  //void m1() {}
	 public static void main(String[] args) {
		 
	// int x = 100; we can modify it
		 final int x;
	 x = 200;
	// x = 300;  we can't modify value because x is declared as "final"
		 System.out.println(x);
	}

}
