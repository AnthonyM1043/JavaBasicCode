package com.syntax.class05;

import java.util.Scanner;

public class Hw06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("It's time to grade the students. insert Quiz's score: ");
		double quiz = input.nextDouble();
		System.out.println("Insert the mid term score: ");
		double midterm = input.nextDouble();
		System.out.println("Insert the final score: ");
		double finalScore = input.nextDouble();
		double sum = (quiz + midterm + finalScore);
		if (sum >= 90) {
			System.out.println("grade: A");
		} else if (sum >= 70 && sum <= 90) {
			System.out.println("grade: B");
		} else if (sum >= 50 && sum <= 70) {
			System.out.println(" grade: C");
		} else if (sum < 50) {
			System.out.println("grade: F");
		}

	}

}
