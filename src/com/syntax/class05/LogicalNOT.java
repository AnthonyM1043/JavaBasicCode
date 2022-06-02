package com.syntax.class05;

public class LogicalNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         boolean boo1=!false;
         System.out.println(boo1);
		/* if there is no traffic --> i will reach work on time*/
		boolean traffic=false;
		
		if (!traffic) { 
			System.out.println("i will reach work on time");
		}
		String name="Reza";
		
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}
	}

}
