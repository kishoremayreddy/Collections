package com.kishore;

public class ExceptionHandlingExampe {

	public static void main(String[] args) {
		
		try {
			int y=Example(5);
			if(y==0) {
				System.out.println("");
			} else {
			System.out.println(y);
			}
		}
		
			catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
	}

	public static int Example(int a)   {
		
		ExceptionArthemetic ea= new ExceptionArthemetic();
	
		
			int x = ea.division(10, 0);
		
			
		
		
		return x;
	}
	
}
