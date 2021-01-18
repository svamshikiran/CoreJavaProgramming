package com.java.basic;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		
		sum = sum + 1;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 2;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 3;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 4;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 5;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 6;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 7;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 8;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 9;
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		sum = sum + 10;
		
		System.out.println("SUM OF 10 NUMBERS: "+sum);
		
		System.out.println("BELOW IS THE RESULT OF FOR LOOP");
		sum = 0;
		/* for (initialization; condition ; increment/decrement)
		{
			LOOP BLOCK
		}*/
		for (int number=1; number <= 1000; number++)
		{	
			sum = sum + number;
		}
		System.out.println("SUM : "+ sum);

	}

}
