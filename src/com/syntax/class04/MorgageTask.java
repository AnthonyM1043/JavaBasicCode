package com.syntax.class04;

public class MorgageTask {

	public static void main(String[] args) {
		
		double morgageRate=5.0;
		int morgagePrice=60500;
		
		if (morgageRate<4.5) {
			System.out.println("i will not buy a house");
		} else {
			System.out.println("i will consider buying a house");
			if(morgagePrice<50000) { 
				System.out.println("i will take out a loan");
			}else {
				System.out.println("i will pay cash");
			}
				
		
		}
	    }

}
