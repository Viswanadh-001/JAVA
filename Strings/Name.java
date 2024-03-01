package Strings;

import java.util.Scanner;

public class Name {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int count = 0;

	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter a name: ");
	            String userInput = scanner.nextLine();

	            if (userInput.equalsIgnoreCase("sai")) {
	                count++;
	            }
	        }

	        System.out.println("The count of 'sai' occurrences is: " + count);

	        scanner.close();
	    }
	}
