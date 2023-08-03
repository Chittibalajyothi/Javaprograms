package com.shristi.basics;

public class SumandAvg {

	public static void main(String[] args) {
		int[] digit = new int[] {3,6,8};
		int sum=0;
		int n=3;
		for(int mark:digit)
			sum+=mark;
		System.out.println("sum of numbers "+sum);
		System.out.println("Average of numbers "+(sum/(float)n));
	}

}
