package OOPS.Polymorphism.Bank;

public class PolyDemo {

	public static void main(String[] args) {
		Savings_Account a1 = new Savings_Account();
		a1.setAcc_Id(101);
	    a1.setAcc_Name("Sai Viswanadh");
		a1.setAcc_balance(100000);
		a1.setMin_Bal(500);
		
		System.out.println("Id : " + a1.getAcc_Id() + ", Name : " + a1.getAcc_Name() + ", Account Balance : " + a1.getAcc_balance() + ", Minimum Balance : " + a1.getMin_Bal());
		System.out.println(" ");
		
		Current_Account a2 = new Current_Account();
		a2.setAcc_Id(901);
		a2.setAcc_Name("Charan");
		a2.setAcc_balance(25000);
		a2.setMin_Bal(1000);
		
		System.out.println("Id : " + a2.getAcc_Id() + ", Name : " + a2.getAcc_Name() + ", Account Balance : " + a2.getAcc_balance() + ", Minumum Balance : " + a2.getMin_Bal());
		
		//a1.Cal_Bal();
		//a2.Cal_Bal();
		AccountService.showDetails(a1);
		AccountService.showDetails(a2);
	}

}
