package com.syntax.class08;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare a secret number;
		 * you want to ask user guess your secret number
		 * you code should keep asking to guess until user gets your secret number
		 * once user gets the secret numbers-> you got it!
		 * 
		 */
			int secretNum = 25;
			int guessedNum;
			Scanner scan=new Scanner (System.in);
			do {
			System.out.println("Guess my number");
			guessedNum=scan.nextInt();
	}while (guessedNum != secretNum);
		System.out.println("you got it");
	}
}
