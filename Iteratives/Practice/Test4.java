package Iteratives.Practice;

public class Test4 {
	
     public static void main(String[] args) {
		int n = 7,a=0,b=1,c;
		
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
