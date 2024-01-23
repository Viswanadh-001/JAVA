package Iteratives.Practice;

class Testf {
	 public static void main(String[] args) {
	    String name="malayalam",reverse="";

	    for(int i=0;i<name.length();i++){
	        char ch=name.charAt(i);
	        reverse=ch+reverse;
	    }
	    System.out.println(reverse);
	    if (name==reverse) {
	        System.out.println("it is palindrome");
	    }
	    else{
	               System.out.println("it is not palindrome");
	    }

	 }
	}