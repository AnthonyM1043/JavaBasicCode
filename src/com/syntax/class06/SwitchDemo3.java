package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		/*
		 * lets ask a user where is he from based on the country we will define favorite
		 * food
		 */
		Scanner scan = new Scanner(System.in);
		String country, favoriteFood;

		System.out.println("Please tell me where are you from");
		country = scan.nextLine();
		switch (country.toLowerCase()) {

		case "mexico":
			favoriteFood = "tacos";
			break;
		case "canada":
			favoriteFood = "poutine";
			break;
		case "turkey":
			favoriteFood = "lahmacun";
			break;
		case "pakistan":
			favoriteFood = "pati chai";
			break;
		case "usa":
			favoriteFood = "burgers";
			break;
		default:
			favoriteFood = "unknown";

		}
		System.out.println("You are from " + country + " and your favorite food is " + favoriteFood);
	}

}
