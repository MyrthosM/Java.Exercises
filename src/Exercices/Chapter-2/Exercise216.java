// Prentice Hall Java 10 book excercise 2.16
/* Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number.
Followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal".*/

import java.util.Scanner; // Importing the library for obtaining user input

public class Exercise216 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
			// Declaration and initzialization
			int a = 0;
			int b = 0;
			
			System.out.print("Enter the first whole Number: ");
			a = input.nextInt();
			System.out.print("Enter the second whole Number: ");
			b = input.nextInt();
			
			if (a > b) {
				System.out.printf("The First number %d is larger.", a);
			}
			else if (b > a){
				System.out.printf("The First number %d is larger.", b);
			}
			else {
				System.out.printf("The two numbers are equal.");
			}
	}
}