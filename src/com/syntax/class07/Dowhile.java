package com.syntax.class07;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // while loop first check condition
		// and only then executes block of code
		int num = 10;

		while (num <= 3) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println("     ----------      ");
// do while firdt executes the code
// and only then checks the condition
		int num1 = 10;
		do {
			System.out.print(num1 + " ");
			num1++;
		} while (num1 <= 3);

//print 1 to 30 using while

		int s=1;
		do {
			
			System.out.println(s+" ");
			s++;
			
		}while(s<=30);
		
		System.out.println("    ---------    ");
		
		// print even numbers from 70 to 30
		
		int num3=70;
		
		do { 
			System.out.print(num3+" ");
			num3-=2;
		}while (num3>=30); 
	
	}
}
