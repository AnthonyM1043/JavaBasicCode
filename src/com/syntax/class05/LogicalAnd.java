package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean job=true;
		double salary=10000000;
		
		if(job && salary>=100000){	
			System.out.println("i am super duper happy");
		}
		System.out.println("--------------------------");
		boolean study=false;
		boolean homework=true;
		boolean practice=true;
		
		if (study && homework && practice) {
			System.out.println("you will succeed in the course");
		}else {
			System.out.println("you will struggle");
		}
				System.out.println("---------------");
				
				int num1 = 20;
				int num2 = 10;
				int num3 = 22;
					
				if (num1>num2 && num1>num3) {
					System.out.println(" the largest number is "+num1);
					
				} else if (num3 > num1 && num3 > num2) {
					System.out.println("the largest number is "+ num3);
					
				}else if (num2 > num1 && num2 > num3) {
					System.out.println("the largest number is "+ num2);
				}
						
				
	}

}
