package com.shristi.objbasics;

public class StudentMain {

	public static void main(String[] args) {
			
		Student student = new Student("john","CSE");
		student.printDetails();
		student.getGrades(34,56,89,45);
		
		Student student1 = new Student("kathy","ECE");
		student1.printDetails();
		student1.getGrades(78,89,45,67);
		
	}

}
