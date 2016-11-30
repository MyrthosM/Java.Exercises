// Prentice Hall Java 10 book excercise 2.24
/*  Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter.*/

import java.util.Scanner; // Importing the library for obtaining user input

public class Exercise224 {
	public static void main (String [] args) {
		//Declaration and initzialization of the program variables.
		Scanner input = new Scanner(System.in);
		int a, b, c, d, e;
		// Get user inputs;
		System.out.print("Enter a number for comparison : ");
		a = input.nextInt();
		System.out.print("Enter a number for comparison : ");
		b = input.nextInt();
		System.out.print("Enter a number for comparison : ");		
		c = input.nextInt();
		System.out.print("Enter a number for comparison : ");
		d = input.nextInt();
		System.out.print("Enter a number for comparison : ");
		e = input.nextInt();
		
		// Check the numbers inputed by the user;
		
		//Check for the LargestNumber;
		
		// Check if a is the largest number;	
		if(a>b){
			if(a>c){
				if(a>d){
					if(a>e){
						System.out.printf("The largest number is a :%d%n ", a);
					}
				}
			}
		}
		// Check if b is the largest number;
		if(b>a){
			if(b>c){
				if(b>d){
					if(b>e){
						System.out.printf("The largest number is b :%d%n ", b);
					}
				}
			}
		}
		// Check if c is the largest number;
		if(c>a){
			if(c>b){
				if(c>d){
					if(c>e){
						System.out.printf("The largest number is c :%d%n ", c);
					}
				}
			}
		}
		// Check if d is the largest number;
		if(d>a){
			if(d>b){
				if(d>c){
					if(d>e){
						System.out.printf("The largest number is d : %d%n ", d);
					}
				}
			}
		}
		// Check if e is the largest number;
		if(e>a){
			if(e>b){
				if(e>c){
					if(e>d){
						System.out.printf("The largest number is e : %d%n ", e);
					}
				}
			}
		}
		
		// Check for the SmallestNumber;
		
		// Check if a is the smallest number;	
		if(a<b){
			if(a<c){
				if(a<d){
					if(a<e){
						System.out.printf("The smallest number is a :%d%n ", a);
					}
				}
			}
		}
		// Check if b is the smallest number;
		if(b<a){
			if(b<c){
				if(b<d){
					if(b<e){
						System.out.printf("The smallest number is b :%d%n ", b);
					}
				}
			}
		}
		// Check if c is the smallest number;
		if(c<a){
			if(c<b){
				if(c<d){
					if(c<e){
						System.out.printf("The smallest number is c :%d%n ", c);
					}
				}
			}
		}
		// Check if d is the smallest number;
		if(d<a){
			if(d<b){
				if(d<c){
					if(d<e){
						System.out.printf("The smallest number is d : %d%n ", d);
					}
				}
			}
		}
		// Check if e is the smallest number;
		if(e<a){
			if(e<b){
				if(e<c){
					if(e<d){
						System.out.printf("The smallest number is e : %d%n ", e);
					}
				}
			}
		}
		
		
	}
}