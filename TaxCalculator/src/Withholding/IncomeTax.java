package Withholding;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter weekly earnings: ");
		double income = scanner.nextDouble();
		double taxRate = 0.0;
		
		
		if (income < 500) {
			taxRate = 0.10;
		} else if (income >= 500 && income < 1500) {
			taxRate = 0.15;
		} else if (income >=1500 && income < 2500) {
			taxRate = 0.20;
		} else if (income >= 2500) {
			taxRate = 0.30;
		} else {
			System.out.println("Invalid user input.");
			scanner.close();
			return;
		}
		
		double taxAmount = income * taxRate;
		double incomeAfterTax = income - taxAmount;
		
		System.out.println((float)incomeAfterTax + " income after tax withholding");
		
		scanner.close();
	}
}


