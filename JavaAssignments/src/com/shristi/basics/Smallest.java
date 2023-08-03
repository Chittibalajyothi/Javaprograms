package com.shristi.basics;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] smallest = new int[]{3,4,2,5};
		int min=smallest[0];
		for(int i=0;i<smallest.length;i++) {
			if(smallest[i]<min)
				min=smallest[i];
		}
		System.out.println("Smallest number: " +min);
	}

}
