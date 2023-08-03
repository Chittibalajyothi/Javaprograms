package com.shristi.basics;

public class Pattern {

	public static void main(String[] args) {
		
		// pyramid with stars * ** *** **** *****
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
	}

}
