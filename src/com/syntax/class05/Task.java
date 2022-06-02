package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		if(age>=18) {
		System.out.println("We will issue your driver license ");
		}else {
			System.out.println();
		}
		
		
		
	}

}
