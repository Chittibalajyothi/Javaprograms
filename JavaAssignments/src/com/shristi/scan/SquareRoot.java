package com.shristi.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		number=scanner.nextInt();
		int[] array=new int[number];
		System.out.println("Enter the elements");
		for(int i=0;i<array.length;i++) {
			array[i]= (int)Math.sqrt(array[i]);
			System.out.println("Square root of number ");
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"values of array");
		}
		scanner.close();
	}

}
