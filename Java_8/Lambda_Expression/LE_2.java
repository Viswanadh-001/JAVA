package Java_8.Lambda_Expression;

public interface LE_2 {
	public abstract int sum(int a, int b);
	}
	class T {
	 
	    public static void main(String[] args){ 
	        LE_2 cal = (a,b)->a+b;    
	        System.out.println(cal.sum(10,20));
	    }
}
