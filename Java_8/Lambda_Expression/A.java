package Java_8.Lambda_Expression;
@FunctionalInterface
interface A
{
	void show();
}

class Demo{
	public static void main(String[] args) 
	{
//		A obj = new A() 
//		{
//			public void show()
//			{  
//				System.out.println("in show");
//			}
//		 };
//		obj.show();
		
		A obj = ()->System.out.println("in show");
		obj.show();
	}
}