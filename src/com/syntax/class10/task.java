package com.syntax.class10;

public class task {
	
	
	int[] array = {5, 28, 36, 1, 14, 56, 48, 17};
	int max = array[0];
	for (int i= 1; i<array.length; i++) {
		if (array[i]>max) {
			max=array[i];
		}
	}
	System.out.println("The largest elements is "+max);
}
}