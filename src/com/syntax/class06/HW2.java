package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char grade;
		String ex;
		
		System.out.println("what is your grade");
		grade=input.next().charAt(0);
		
		switch (grade) {
		case 'A':
			ex="excellent";
			break;
		case'B':
		ex="good";
		break;
		case 'C':
		ex="average";
		break;
		default:
			ex="NOT acceptable!";
			
		}
System.out.println("Your garde is "+grade+" "+ex);
	}

}
