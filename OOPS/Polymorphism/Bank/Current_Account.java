package OOPS.Polymorphism.Bank;

public class Current_Account extends Account {
private double min_Bal;

public double getMin_Bal() {
	return min_Bal;
}

public void setMin_Bal(double min_Bal) {
	this.min_Bal = min_Bal;
}
public void Cal_Bal() {
	double bal = getAcc_balance();
	
	double min_Bal = getMin_Bal();
	bal = bal - min_Bal;
	System.out.println("Current Account : "+bal);
}

}
