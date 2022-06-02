package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		// variable and matching cases MUST be of same type
		// switch does not allow to have duplicated cases

		char choice = 'Y';
		String meaning;
		switch (choice) {
		case 'Y':
			meaning = "Yes";
			break;
		case 'M':
			meaning = "Maybe";
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "Unknown";

		}
		System.out.println(meaning);
	}

}
