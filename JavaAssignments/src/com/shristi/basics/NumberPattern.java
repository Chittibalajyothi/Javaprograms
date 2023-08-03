package com.shristi.basics;

public class NumberPattern {

	public static void main(String[] args) {
		//pattern 1 23 456 789
		
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}

	}

}
