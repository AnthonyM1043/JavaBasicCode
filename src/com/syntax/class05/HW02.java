package com.syntax.class05;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("What is your city?");
		String city=input.nextLine();
		System.out.println("What is the temperature in your city?");
		float temp=input.nextFloat();
		System.out.println("The temperature in "+city+" is "+temp+"F, "+((temp-32)*5/9)+"C. ");
	}

}
