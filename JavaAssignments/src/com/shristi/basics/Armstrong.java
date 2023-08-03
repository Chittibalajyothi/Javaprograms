package com.shristi.basics;

public class Armstrong {

	public static void main(String[] args) {
		int x=0,a,temp;
		int n=153;
		temp=n;
		while(n>0) {
			a = n % 10;
			n = n/10;
			x=x+(a*a*a);
		}
		if(temp == x) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an Armstrong number ");
		}
	}

}
