package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String country, language;

		System.out.println("Which language user speaks:");
		language = input.next();

		switch (language) {

		case "spanish ":
			country = "mexico";
			break;
		case "Chinese":
			country = "china";
			break;
		case "english":
			country = "usa";
			break;
		default:
			country = "no country";
		}
			System.out.println("The user speaks " + language);
		}

	
	
}
