package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=3; i++) { //outer loops
			
			System.out.println("hello");
			
			for(int y=1; y<=2; y++) { //nested loop
				System.out.println("Bye");
			}
		}
		System.out.println("   ------------------- ");
		for(int i=1; i<=3; i++) {
			System.out.println(i);
			for(int y=1; y<=2; y++) {
				System.out.println(y);
			}
		}
		System.out.println("  --------------------  ");
		
		for(int y=1; y<=3; y++); {
			System.out.println(i+" "+y);
			
		}	
		}
	
	}
	

}
