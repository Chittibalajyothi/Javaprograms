package com.shristi.quest2;

public class Basic implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Add "+(x+y));
		
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("Add "+(x-y));
		
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Add "+(x*y));
		
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Add "+(x/y));
		
	}

}
