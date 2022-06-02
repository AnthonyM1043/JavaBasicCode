package com.syntax.class05;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what month were you born?");
		String month = input.next();
		if (month.equals("mar") || month.equals("apr") || month.equals("may")) {
			System.out.println("you were born in Spring.");
		} else if (month.equals("june") || month.equals("july") || month.equals("aug")) {
			System.out.println("you were born in the summer. ");
		} else if (month.equals("september") || month.equals("oct") || month.equals("nov")) {
			System.out.println("you were born in fall. ");
		} else if (month.equals("dec") || month.equals("jan") || month.equals("feb")) {
			System.out.println("You were born on winter. ");
		} else {
			System.out.println(" write a valid month name with correct spelling.");
		}

	}

}
