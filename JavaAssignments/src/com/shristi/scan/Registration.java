package com.shristi.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] usernames = {"john","peter","wild"};
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println("name is "+name);
		int count=1;
		for(int i=0;i<usernames.length;i++) {
			if(usernames[i].equals(name)) {
				System.out.println("Name is not Unique");
				count=0;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("You are registered");
		}
		scanner.close();
	}

}
