package com.shristi.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] usernames = {"john","peter","harry"};
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println("name is "+name);
		int count=1;
		for(int i=0;i<usernames.length;i++) {
			if(usernames[i].equals(name)) {
				System.out.println("You are logged in successfully");
				count=0;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Invalid username");
		}
		scanner.close();

	}

}
