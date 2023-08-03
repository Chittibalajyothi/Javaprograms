package com.shristi.scan;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// Find the greatest of three numbers using ternary operator 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int a2 = scanner.nextInt();
		
		System.out.println("Enter third number: ");
		int a3 = scanner.nextInt();
		
		int greatestNumber = (a1>a2)? (a1>a3?a1:a3) :( a2>a3?a2:a3);
		System.out.println("Greatest of three numbers: " +greatestNumber);
		scanner.close();
	}

}
