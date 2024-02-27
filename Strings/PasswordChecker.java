package Strings;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Password: ");
		String password = scanner.nextLine();
		
		if(isPasswordValid(password)) {
			System.out.println("Yes the password is valid.");
		}else {
			System.out.println("No the password is not valid.");
		}
		
		scanner.close();
	}

	private static boolean isPasswordValid(String password) {
		if(password.length()<6) {
			return false;
		}
		
		if(!password.matches(".*\\d.*")) {
			return false;
		}
		if(!password.matches(".*[a-z].*")) {
			return false;
		}
		if(!password.matches(".*[A-Z].*")) {
			return false;
		}
		if(!password.matches(".*[!@#$%^&*()-+].*")) {
			return false;
		}
		return true;	
	}

}
