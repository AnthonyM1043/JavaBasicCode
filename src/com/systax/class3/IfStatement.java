package com.systax.class3;

public class IfStatement {

	public static void main(String[] args) {
	
		/*
		 * declare a variable rate
		 * if the rate is more than 5-->i am not buying the house 
		 */
		
		double morgageRate=4.5;
		
		if (morgageRate>5) {
			
			System.out.println("i am not buying a house");
			
		}
		/*
		 * declare 2 variables and checkif num1 is bigger than num2
		 */
		int num1=99;
		int num2=10;
		
		if(num1>num2) {
			
			System.out.println(num1+" is bigger than "+num2);
		}
		
		/*
		 * declare temperature
		 * if temp is higher than 75-> i will walk
		 */
		int temp=68;
		
		if (temp>75) {
			
			System.out.println("i will go on a walk");
		} else {//otherwise. code comes to else
			//when condition is false
			System.out.println("i am going to study java");
		}
		
		System.out.println("---------------");
		char gender='m';
		if(gender=='f') {
			System.out.println("you like shopping");
			
		}else {
			System.out.println("you like watching sports");
			
		}
System.out.println("------------------");
		String browser="chrome";
		if (browser.equals("chrome")) {
System.out.println("all test cases will be executed on chrome");
		
			
	}else {
		System.out.println("i am not executing any test cases");
		}
		
		
	}

}
