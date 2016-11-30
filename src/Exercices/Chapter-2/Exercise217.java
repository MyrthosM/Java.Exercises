// Prentice Hall Java 10 book excercise 2.17
/* Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15 From the Book. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333].*/

import java.util.Scanner; // Importing the library for obtaining user input

public class Exercise217{
	public static void main (String [] args) {
		//Declaration and initzialization of the program variables.
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;
		
		Scanner input = new Scanner(System.in);
                
                System.out.print("Enter the first number: ");
                x = input.nextInt();
                System.out.print("Enter the second number: ");
                y = input.nextInt();
                System.out.print("Enter the third number: ");
                z = input.nextInt();
				
				result = x + y + z;
                System.out.printf("The sum of the numbers is %d%n", result);
				result = (x + y + z)/3;
                System.out.printf("The average of the numbers is %d%n", result);
				result = x * y * z;
                System.out.printf("The product of the numbers is %d%n", result);	
				if (x > y){
					if(x > z){
						System.out.printf("The largest number is %d%n", x);
					}
                }
				else if (y > x){
					if (y > z){
						System.out.printf("The largest number is %d%n", y);
					}
				}
				else if (z > x){
					if (z > y){
						System.out.printf("The largest number is %d%n", z);
					}
				}
				
				
				
				
				
				
				if (y > x){
					if (z > x){
						System.out.printf("The smallest number is %d%n", x);
					}
				}
				else if (x > z){
					if (y > z){
						System.out.printf("The smallest number is %d%n", z);
					}
				} 
				else if (x > y){
					if (z > y){
						System.out.printf("The smallest number is %d%n", y);
					}
				}
                                
		
	}
}