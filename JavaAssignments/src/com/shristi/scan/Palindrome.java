package com.shristi.scan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		 System.out.println("Enter the number:");
	     Scanner scanner = new Scanner(System.in);
	     int number=scanner.nextInt();
	     int count=0;
	     int num=number;
	     while(num>0) {
	    	 int temp=num%10;
	    	 count=count*10+temp;
	    	 num=num/10;
	     }
	     if(number==count) {
	    	 System.out.println("palindrome");
	     }else {
	    	 System.out.println("Not a palindrome");
	     }
	      scanner.close();
	}

}
