package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("It's time to grade the students. insert Quiz's score: ");
		double quiz = input.nextDouble();
		System.out.println("Insert the mid term score: ");
		double midterm = input.nextDouble();
		System.out.println("Insert the final score: ");
		double finalScore = input.nextDouble();
		double sum = (quiz + midterm + finalScore) / 3;
		System.out.println("your avergae score is" + sum);
		char grade;
		if (sum >= 90) {
			grade = 'A';
		} else if (sum >= 70 && sum <= 90) {
			grade = 'B';
		} else if (sum >= 50 && sum <= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("You are a " + grade + " student");
		// if you are a or b student->you are doing great
		// otherwise --> Please study more.
		if (grade == 'A' || grade == 'B') {
			System.out.println(" you are doing great");
		} else {
			System.out.println("Please study more!");
		}
	}

}
