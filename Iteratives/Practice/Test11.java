package Iteratives.Practice;

public class Test11 {

	public static void main(String[] args) {
	  int a=0,b=0;
	  
	  for(int i=1;i<=100;i++) {
		  if(i%2==0) {
			  a++;
		  }
	  }
	  System.out.println(a);
	  
	  for(int j=1;j<=100;j++) {
		  if(j%2!=0) {
			  b++;
		  }
	  }
	  System.out.println(b);
	}

}
