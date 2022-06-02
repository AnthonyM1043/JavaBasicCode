package com.syntax.class10;

public class AnotherWayOf2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] usa= {
				{"new york", "albany", "buffalo"},
				{"Los Angeles", "San Fan", "San Jose", "san diego"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
		};
		
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col < usa[row].length; col++) {
				System.out.println(usa[row][col]+" ");
			}
			System.out.println();
		}
	}

}
