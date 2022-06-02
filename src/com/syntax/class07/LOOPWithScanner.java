package com.syntax.class07;

import java.util.Scanner;

public class LOOPWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * we are going to ask you if you got a job 
 * we will coninuosly asking if you get a job until u say yhes!
 * 
 * once you say yes --> congratulations!
 */
		
		
		Scanner scan=new Scanner(System.in);
		String job;
		do {
			System.out.println("did you get a job");
			job=scan.nextLine();
		}while (!job.equalsIgnoreCase("yes"));
		System.out.println("congratulations");
		
		System.out.println(" --------------------- ");
		
		Scanner input=new Scanner(System.in);
		String offer;
		
		System.out.println("did you get a job");
		offer=input.nextLine();
		
	System.out.println("congratulations");
	
}
	

}
