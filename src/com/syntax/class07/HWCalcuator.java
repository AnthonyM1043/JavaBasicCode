package com.syntax.class07;

import java.util.Scanner;

public class HWCalcuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextInt();
		double y = scan.nextInt();

		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		double result = 0;
		String operator = null;
		switch (op) {
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		default:
			System.out.println("invalid operator");
			operator = "invalid";
		}

		if (result != 0 || operator == null) {
			System.out.println(x + " " + op + " " + y + " = " + result);
		}
		scan.close();
	}

}
