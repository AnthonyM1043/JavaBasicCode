package com.syntax.class08;

import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<6;i++) {
			
		
        System.out.println(sum+" ");
        sum+=i;
	}
		System.out.println("Value of sum =");
		System.out.println(sum);
		/*
		 * write a program to find sum of all even and all odd numbers
		 * from 1-70
		 */
		// Find sum of all even and all odd numbers from 1 to 70	
				int sum6=0;
				for(int i=1; i<=70; i++) {
					if(i%2==0) {
						sum6+=i;
					}
				}		System.out.println(sum6);
				int sum1=0;
				for(int i=1; i<=70; i++) {
					if(i%2!=0) {
						sum1+=i;
					}
				}		System.out.println(sum1);
				
				// WITHOUT IF CONDITION
					
				int sum3=0;
				for(int i=2; i<=70; i+=2) {
						sum3+=i;
				}		System.out.println(sum3);
				
				
				int sum4=0;
				for(int i=1; i<=70; i++) {
					if(i%2!=0) {
						sum4+=i;
					}
				}		System.out.println(sum4);
		
				int sumEven=0;
				int sumOdd=0;

				for (int i = 1; i <= 70; i++) {

				if (i % 2 == 0) {
				sumEven+=i;
				}else {
				sumOdd+=i;
				}
				}

				System.out.println("Sum even numbers is "+sumEven);
				System.out.println("Sum odd numbers is "+sumOdd);

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
	System.out.println("Guess my number");
	guessedNum=scan.nextInt();
	}
	}

