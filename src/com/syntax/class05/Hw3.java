package com.syntax.class05;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years");
		int years = input.nextInt();
		if (years >= 5) {
		System.out.println("You are eligible for the bonus");
		System.out.println("Enter annual salary");
		int salary = input.nextInt();
		if (salary >=50000) {
		System.out.println("You are eligible for 5000 bonus");
		} else {
		System.out.println("You are eligible for 3000 bonus");
		}
		} else {
		System.out.println("Sorry you are not eligible for bonus");
		}
	}

}
