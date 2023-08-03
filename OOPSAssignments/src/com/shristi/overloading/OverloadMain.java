package com.shristi.overloading;
public class OverloadMain {

	public static void main(String[] args) {
		Employee programmer = new Employee("jyothi","QA");
		Employee manager = new Employee("Deepika", "Data Analyst");
		Employee director = new Employee("pooja", "Developer");
		
		System.out.println("Designation is Programmer "+programmer.calcBonus(7890000));
		System.out.println("Designation is Manager "+manager.calcBonus(6789990, 678850));
		System.out.println("Designation is Director "+director.calcBonus(345670, 450000, 999990));
	}
}


