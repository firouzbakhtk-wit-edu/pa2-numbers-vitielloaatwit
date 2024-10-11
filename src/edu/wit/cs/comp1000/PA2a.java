package edu.wit.cs.comp1000;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/*
 * This code asks the user for 5 numbers, then seperates them into positive and negative
 * then find the sum of the positives, negatives, and all of the numbers,
 * then finds the average of the positive, negative, and all the numbers
 */

public class PA2a {
	
	
	/*
	 * The code ask's for a user to input 5 numbers that belong to a, b, c, d, and e
	 * if a number is positive, it gets added to the sum of the positive numbers, and the total positive numbers increase
	 * if a number is negative, it gets added to the sum of the negative numbers, and the total negative numbers increase
	 * the program then finds the total sum by combining the totals of the positive and negative numbers
	 * using the total sum, the program finds the total average by dividing the total sum by 5
	 * In the case of either no positive numbers, or no negative numbers, then the program makes the average of the positive/negative 0
	 * if there are positive/negative numbers, then the program finds the average by dividing the positive/negative sum by the total amount of positive/negative numbers
	 * the program then outputs 1 of 3 different possibilities based on if there's only 1 positive or negative number, or if neither is the case
	 * the differences are either adding or removing an s to fit only have one of a certain type of number
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, d, e;
		double total_pos = 0.0;
		double total_neg = 0.0;
		double sum_pos = 0;
		double sum_neg = 0;
		double total_sum = 0;
		double avg_pos = 0;
		double avg_neg = 0;
		double total_avg = 0;
				
				
		System.out.printf("Enter five whole numbers: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		
		if (a > 0) {
			sum_pos = sum_pos + a;
			total_pos = total_pos + 1;
			
		}else {
			sum_neg = sum_neg + a;
			total_neg = total_neg + 1;
			
		}if (b > 0) {
			sum_pos = sum_pos + b;	
			total_pos = total_pos + 1;
			
		}else {
			sum_neg = sum_neg + b;
			total_neg = total_neg + 1;
			
		}if (c > 0) {
			sum_pos = sum_pos + c;	
			total_pos = total_pos + 1;
			
		}else {
			sum_neg = sum_neg + c;
			total_neg = total_neg + 1;
	
		}if (d > 0) {
			sum_pos = sum_pos + d;	
			total_pos = total_pos + 1;
			
		}else {
			sum_neg = sum_neg + d;
			total_neg = total_neg + 1;
			
		}if (e > 0) {
			sum_pos = sum_pos + e;	
			total_pos = total_pos + 1;
			
		}else {
			sum_neg = sum_neg + e;
			total_neg = total_neg + 1;
	
		}	
		
		total_sum = sum_pos + sum_neg;
		total_avg = total_sum / 5;
		
		if (total_pos == 0) {
			avg_pos = 0;
		}else {
			avg_pos = sum_pos / total_pos;
			
		}if (total_neg == 0) {
			avg_neg = 0;
		}else {
			avg_neg = sum_neg / total_neg;
		}
		
		
		if (total_pos == 1) {
			
			System.out.printf("The sum of the %.0f positive number: %.0f%n", total_pos, sum_pos);
			System.out.printf("The sum of the %.0f non-positive numbers: %.0f%n", total_neg, sum_neg);
			System.out.printf("The sum of the 5 numbers: %.0f%n", total_sum);
			System.out.printf("The average of the %.0f positive number: %.2f%n", total_pos, avg_pos);
			System.out.printf("The average of the %.0f non-positive numbers: %.2f%n", total_neg, avg_neg);
			System.out.printf("The average of the 5 numbers: %.2f%n", total_avg);
			
			
		}else if (total_neg == 1) {
			
			System.out.printf("The sum of the %.0f positive numbers: %.0f%n", total_pos, sum_pos);
			System.out.printf("The sum of the %.0f non-positive number: %.0f%n", total_neg, sum_neg);
			System.out.printf("The sum of the 5 numbers: %.0f%n", total_sum);
			System.out.printf("The average of the %.0f positive numbers: %.2f%n", total_pos, avg_pos);
			System.out.printf("The average of the %.0f non-positive number: %.2f%n", total_neg, avg_neg);
			System.out.printf("The average of the 5 numbers: %.2f%n", total_avg);
			
			
		}else {
			
			System.out.printf("The sum of the %.0f positive numbers: %.0f%n", total_pos, sum_pos);
			System.out.printf("The sum of the %.0f non-positive numbers: %.0f%n", total_neg, sum_neg);
			System.out.printf("The sum of the 5 numbers: %.0f%n", total_sum);
			System.out.printf("The average of the %.0f positive numbers: %.2f%n", total_pos, avg_pos);
			System.out.printf("The average of the %.0f non-positive numbers: %.2f%n", total_neg, avg_neg);
			System.out.printf("The average of the 5 numbers: %.2f%n", total_avg);
			
			
		}
		
	
		
	}

}
