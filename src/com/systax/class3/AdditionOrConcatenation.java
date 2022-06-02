package com.systax.class3;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;

String c="hello";
String d="Hi";
System.out.println(a+b+c+d); //30hellohi
System.out.println(a+c+b+d);//10hello20hi
System.out.println(c+d+a+b); //HELLohi1020
System.out.println(c+d+(a+b)); //helloHi30		
		
		
		
		
	}

}
