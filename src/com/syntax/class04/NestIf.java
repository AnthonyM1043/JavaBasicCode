package com.syntax.class04;

public class NestIf {

	public static void main(String[] args) {
		// you will not be able to keep going if the output is not
		//correct (true or false)
boolean vaccine=true;
int dose=1;

if(vaccine) {
	
	System.out.println("let me check how many doses you have");
	if (dose==1) {
		System.out.println("You need 1 more shot");
	  }else {
		  System.out.println("you are fully vacinated");
	  }
	
	
	
	  }
System.out.println("--------------------------");
String month="june";
int day=19;
//you would have to give the right conditions for it to run
if (month.equals("May")) {
	System.out.println("Let me check what todays date is");
    
	if(day==8) {
		System.out.println("today is mothers day");
	}
    }else if (month.equals("june")) {
    	System.out.println("Let me check what todays date is");
    	
    	if (day==19) {
    		System.out.println("today is fathers day");
    	}
    }
  }
}
