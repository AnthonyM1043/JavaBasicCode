package com.syntax.class05;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		
		boolean checkboxSelected = false;
		if (!checkboxSelected) {
		System.out.println("Click on checkbox");
		}
		
		System.out.println(" --------------------------------------  ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the time in your area?");
		int time = input.nextInt();
		if (time >= 1 && time < 11) {
			System.out.println("morning");
		} else if (time >= 12 && time <= 15) {
			System.out.println("afternoon");
		} else if (time >= 21 && time <= 24)
			;
		System.out.println("night");
		if (time > 25) {
			System.out.println("wrong input number, the numbers must be from 1-24 hours.");
		}
	}

}
