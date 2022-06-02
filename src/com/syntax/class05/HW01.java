package com.syntax.class05;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner loan = new Scanner(System.in);
		System.out.println("how much do you need as a loan?");
		double amount = loan.nextDouble();

		if (amount <= 200000) {
			System.out.println("Your loan has been aproved");
		} else {
			System.out.println("Your loan request has been rejected! ");
		}
	}

}
