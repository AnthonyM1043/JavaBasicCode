package com.syntax.class07;

public class Incements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;

		x = x + 1;

		x += 1;

		System.out.println(x); // 12

		x++; // increments value of a variable by 1
		System.out.println(x); // 13

		x--; // decrements value of a variable by 1
		System.out.println(x); // 12

		// increment and decrement operators work only with variables

		// 10++; CE: Invalid argument to operation ++/--

		int num = 100;
		num++;
		System.out.println(num);
	}

}
