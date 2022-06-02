package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		boolean yes = true;
		System.out.println("Apply for a credit card");
		boolean answer=scan.nextBoolean();
		while (answer!=yes) {
			System.out.println("Think again");
			answer=scan.nextBoolean();
			
			
		}
		System.out.println("Here you go");
		scan.close();
	

	}

}
