package com.shristi.basics;

public class SecondSmallest {

	public static void main(String[] args) {
		int temp;
		int[] smallest ={7,8,4,3,6};
		
		for(int i=0;i<smallest.length;i++) {
			for(int j=i+1;j<smallest.length;j++) {
				if(smallest[i]>smallest[j]) {
					
					temp=smallest[i];
					smallest[i]=smallest[j];
					smallest[j]=temp;
				}
			}
		}
		System.out.println("second smallest number: "+smallest[0]);
	}

}
