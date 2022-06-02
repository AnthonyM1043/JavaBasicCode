package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		/*we need to check if repl was completed
		 * if you did 15 and more ----> great job
		 * if you did more than--->did good
		 * if less than 10->try to complete all assignments
		 */

		
		boolean didRepl=true;
		int assignments;
		
		if (didRepl) {
			
			System.out.println("how many assignments have you done");
		    assignments=14;
		if (assignments>15) {
			System.out.println("you did a great job");	
		}else if (assignments>10) {
			System.out.println("you did good job");
		}else {
			System.out.println("please complete all repl assignments");
		 }
		}else { 
			System.out.println("you should complete you repl HW");
		
	 }
	}
}
