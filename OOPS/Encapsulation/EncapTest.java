package OOPS.Encapsulation;
class Student{
	private int sid;
	private String sname;
	private char Sec;
	
	public char getSec() {
		return Sec;
	}
	public void setSec(char sec) {
		Sec = sec;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
public class EncapTest {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();

		s.setSid(546);
		s.setSec('A');
		s.setSname("Sai Viswanadh");
		s1.setSid(526);
		s1.setSec('B');
		s1.setSname("Charan ");

		System.out.println("Roll no : " + s.getSid());
		System.out.println("Section : " + s.getSec());
		System.out.println("Name : " + s.getSname());
		System.out.println(" ");
		System.out.println("Roll no : " + s1.getSid());
		System.out.println("Section : " + s1.getSec());
		System.out.println("Name : " + s1.getSname());
	}

}
