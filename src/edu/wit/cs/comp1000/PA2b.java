package edu.wit.cs.comp1000;

import java.util.Scanner;

/*
 * This program asks for 3 numbers from the user
 * then using the quadratic formula, the code will output either that the numbers imaginary, has 1 root, or 2 root
 * the code will display what the roots are if there are any
 */
public class PA2b {

	/*
	 * The program ask's for an a, b, and c value from the user
	 * the program will then calculate the discriminant of the 3 values given
	 * if the discriminant is negative, then the program will output that the roots are imaginary
	 * if the discriminant is 0, then it will calculate the root using the rest of the quadratic formula
	 * if the discriminant is non of the above, then it finds the 2 roots by completing 2 seperate equations, one with addition, and one with subtraction
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		System.out.printf("Enter a b c: ");
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
		
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
			
		}else if (discriminant == 0) {
			double root = ((-1 * b) / (2.0 * a));
			System.out.printf("Root: %.2f%n", root);
			
		}else {
			double root_1 = ((-1 * b - Math.sqrt(discriminant)) / (2.0 * a));
			double root_2 = ((-1 * b + Math.sqrt(discriminant)) / (2.0 * a));
			
			System.out.printf("Roots: %.2f, %.2f%n", root_1, root_2);
		}
		
	}

}
