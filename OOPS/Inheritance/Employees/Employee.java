package OOPS.Inheritance.Employees;

public class Employee {
	private int enumber;
	private String ename;
	private double grossSalary;
	
	public int getEnumber() {
		System.out.println(101);
		return enumber;
	}
	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}
	public String getEname() {
		System.out.println("SAI");
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
}
