package com.syntax.class05;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("do you have a credit card? yes or no");
		String answer=input.next();
		
		if(answer.equals("no")) {
			System.out.println("we will offer you a credit card");
		} else {
			System.out.println("what is the balance on the card");
			int balance =input.nextInt();
			
			if (balance > 1000) { 
				System.out.println("pay it off immmediately");
			}else { 
				System.out.println("You can spend more");
			}
		}
   
		
		
	}

}
