package com.shristi.quest1;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator addition = (x,y) -> System.out.println(x+y);
        Calculator subtraction = (x,y) -> System.out.println(x-y);
        Calculator multiplication = (x,y) -> System.out.println(x*y);    
        Calculator divide = (x,y) -> System.out.println(x/y);    

        addition.calculate(5,8);
        subtraction.calculate(15,8);
        multiplication.calculate(8,3);
        divide.calculate(5,3);

	}

}
