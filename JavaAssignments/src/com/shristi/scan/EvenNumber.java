package com.shristi.scan;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// even numbers from 1-20
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=scanner.nextInt();
		System.out.println("Even Numbers");
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}

}
