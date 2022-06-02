package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Monday";
		
		if(day.equals("Monday")||day.equals("friday")) {
		    System.out.println("I have no class");
		    
		}else if (day.equals("Tuesday")|| day.equals("Wednesday")) {
		    System.out.println("i have manual testing class"); 
		    
		} else if (day.equals("Thursday")) {
			
			System.out.println("i have a review class");
		}else if (day.equals("satturday")|| day.equals("sunday")) {
		    System.out.println("i have java class");
		}
	}
}
