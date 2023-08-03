package com.shristi.basics;

public class NumberContinue {

	public static void main(String[] args) {
		
//		pattern 1 22 333 4444
		
		int rows=4;
		for (int i=1;i<=rows; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}