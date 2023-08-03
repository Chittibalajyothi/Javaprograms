package com.shristi.basics;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=28,sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i == 0)
				sum = sum+i;
		}
		if(sum==n) {
			System.out.println(n + " is a perfect pumber");
		}
		else
			System.out.println(n + " Not a perfect number");
	}

}
