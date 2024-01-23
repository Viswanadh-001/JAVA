package OOPS.Constructor;

public class product {
	int id;
	String product_name;
	product (int id,String product_name){
		this.id = id;
		this.product_name = product_name;
	}
	public static void main(String[] args) {
		product p1 = new product(101,"Iphone 14s");

		System.out.println(p1.id);
		System.out.println(p1.product_name);
	}
	//product p1 = new product(101,"Iphone 14s");
}
