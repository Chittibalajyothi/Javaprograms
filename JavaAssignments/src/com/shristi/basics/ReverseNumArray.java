package com.shristi.basics;

public class ReverseNumArray {

	public static void main(String[] args) {
		
		int[] number = new int[]{1,2,3,4,5};
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]+" ");
		}
		System.out.println("Array in reverse order:");
		for(int i=number.length-1;i>=0;i--) {
			System.out.println(number[i]+" ");
		}

	}

}
