package com.shristi.quest2;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Basic calcBasic = new Basic();
		calcBasic.add(35,28);
        calcBasic.difference(58,37);
        calcBasic.product(10,35);
        calcBasic.divide(46,28);
        
        Scientific scientific = new Scientific();
        scientific.square(35);
        scientific.cube(28);

        
		
	}

}
