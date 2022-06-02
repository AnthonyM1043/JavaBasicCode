package com.syntax.class08;

public class FoorLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//i need to print numbers from 1-90
		
		for (int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		/*start point
		 * end point
		 * increment /decrement
		 */
		
		//i need numbers from 60 to 10
		System.out.println();
		for (int i=60; i>=10; i--) {
			System.out.print(i+ " ");
			
			
		}
		System.out.println();
		for (int i=5; i<=40; i+=5) {
			System.out.print(i+ " ");
		}
		System.out.println(" ---- 2 way ---- ");
		for (int i=20; i<50; i++) {
			if(i % 2 !=0) {
				System.out.print(i+ " ");
				
			}
		}
			
			
	}
}

