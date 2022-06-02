package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("calculator");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		char cal = input.next().charAt(0);

		int nums = 240;

		if (cal == '/') {
			nums = (num1 / num2);
		} else if (cal == '*') {
			nums = (num1 * num2);
		} else if (cal == '+') {
			nums = (num1 + num2);
		} else if (cal == '-') {
			nums = (num1 - num2);
		}
		System.out.println("The result is " + nums);
    
		System.out.println("-------------------");
	switch (cal) {
	
	case '/':
		nums=(num1/num2);
		break;
	case '+':
		nums=(num1+num2);
		break;
	case '-':
		nums=(num1-num2);
		break;
	}
	System.out.println("the final result is "+nums);
	}

}
