package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums= {
				{1, 2, 3, 4, 5,},
				{199, 300, 588, 700},
				{1900, 4578, 98787}
				
		};
		
		System.out.println("All values using enhanced for loop");
		
		for(int [] num:nums) {
			
			for(int n:num) {
				System.out.println(n+" ");
			}
			System.out.println();
		}
			}
		
	}


