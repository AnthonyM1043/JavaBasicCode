package com.syntax.class08;

public class BreakKeyborad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;

		for(int i1=1; i1<=5; i1++) {
			System.out.println("hello");
			if(i1==2) {
				break;
			}
		}
		boolean summer =true;
		int temp=95;
		
		while(summer ) {
			System.out.println("its hot");
			
			if (temp<70 ) {
				System.out.println("its not hot anymore");
				break;
			}
			
			temp-=10;
		}
	}

}
