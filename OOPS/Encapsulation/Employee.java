package OOPS.Encapsulation;

public class Employee {
	private int enumber;
	private String ename;
	
	public int getEnumber() {
		return enumber;
	}
	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		e.setEnumber(101);
		e.setEname("Sai Viswanadh");
		e1.setEnumber(102);
		e1.setEname("Charan");

		System.out.println(e.getEnumber());
		System.out.println(e.getEname());
		System.out.println(e1.getEnumber());
		System.out.println(e1.getEname());
	}	
}
