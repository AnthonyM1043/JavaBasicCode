package com.syntax.class07;

public class WhileloopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;

		while (num <= 10) {
			num++;
			System.out.print(num + " ");
			num++;
		}
		int num1 = 1;
		while (num1 <= 10) {
			num1++;
			System.out.print(num1 + " ");
			num1++;
		}
		System.out.println();
		// 1 way
		int e = 2;

		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;
		}
		// 2 way
		System.out.println();
		int f = 1;
		while (f <= 20) {
			if (f % 2 == 0) {
				System.out.print(f + " ");
				f++;
			}

		}
	}

}
