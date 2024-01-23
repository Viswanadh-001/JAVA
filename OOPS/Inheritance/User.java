package OOPS.Inheritance;

import Inheritance.Admin;
import Inheritance.Developer;
import Inheritance.Guest;

public class User {

	public static void main(String[] args) {
		Guest guest = new Guest();
		guest.read();
		System.out.println("\r\n");
		
		Developer dev = new Developer();
		dev.read();
		dev.write();
		System.out.println("\r\n");
		
		
		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();
	}

}