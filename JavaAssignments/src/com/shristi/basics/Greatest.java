package com.shristi.basics;

public class Greatest {

	public static void main(String[] args) {
		//1.  Greatest in an array
		
		int[] greatestnumber = new int[]{2,6,7,8,5};
		int max=0;
		for(int i=0;i<greatestnumber.length;i++) {
			if(greatestnumber[i]>max)
				max=greatestnumber[i];
		}
		System.out.println("greatest number: "+ max);

	}

}
