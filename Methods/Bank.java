 package Methods;

public class Bank {
	static int CurrentBalance = 1000;
	
	public static void greetcustomer() {
		 System.out.println("Hello,Welcome to banking application");
	} 
	
	public void deposit(int amount) {
		CurrentBalance = CurrentBalance + amount;
		System.out.println("Amount deposited successfully");
	}
	
	public static void withdrawal(int amount) {
		CurrentBalance = CurrentBalance - amount;
		System.out.println("Amount withdrawn successfully");
	}
	
	public int getBalance() {
		return CurrentBalance;
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetcustomer();
		System.out.println("Current Balance is : "+bank.getBalance());
		bank.deposit(500);
		System.out.println("Current Balance is : "+bank.getBalance());
		withdrawal(300);   // Declared method as a static so we can access without creating an object.
		System.out.println("Current Balance is : "+bank.getBalance());
	}
}
