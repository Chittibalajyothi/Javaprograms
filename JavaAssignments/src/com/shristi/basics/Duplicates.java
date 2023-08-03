package com.shristi.basics;

public class Duplicates {

	public static void main(String[] args) {
		int i=0,j,count=0;
		int[] array = new int[]{1,2,3,4,2,7,8,8,3};
		System.out.println("Duplicate elements in an array:");
		while(i<array.length) {
			j=i+1;
			while(j<array.length) {
				if(array[i] == array[j]) {
					count++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("Number of duplicates:" +count);
	}
}
