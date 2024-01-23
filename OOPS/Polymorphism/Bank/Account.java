package OOPS.Polymorphism.Bank;

public class Account {
 	
	private int acc_Id;
	private String acc_Name;
	private double acc_balance;
	
	public int getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_Name() {
		return acc_Name;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	public double getAcc_balance() {   
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	public void Cal_Bal() {}
}
