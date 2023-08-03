package com.shristi.basics;

public class SecondLargest {

	public static void main(String[] args) {
		int temp;
		int[] largest =new int[]{4,3,8,7,6,9};
		
		for(int i=0;i<largest.length;i++) {
			for(int j=i+1;j<largest.length;j++) {
				if(largest[i]>largest[j]) {
					
					temp=largest[i];
					largest[i]=largest[j];
					largest[j]=temp;
				}
			}
		}
		System.out.println("second largest number: "+largest[largest.length-2]);
	}

}