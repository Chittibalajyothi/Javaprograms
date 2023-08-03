package com.shristi.scan;

import java.util.Scanner;

public class OneDArraySumAvg {

	public static void main(String[] args) {
		int number;
		int sum=0;
		int average;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		number=scanner.nextInt();
		int[] array=new int[number];
		System.out.println("Enter the elements");
		
		for(int num :array) {
			num=scanner.nextInt();
			sum+=num;
		}
		System.out.println("Sum of numbers "+sum);
		average=sum/number;
		System.out.println("Average of numbers "+average);
		scanner.close();
	}

}
