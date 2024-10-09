package com.practice.array;

import java.util.stream.IntStream;

public class CountEvenOdd {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,12,32,22,31,45};
	IntStream intstream= IntStream.of(arr);
	System.out.println("Even Element:");
	intstream.filter(x->x%2==0).forEach(System.out :: println);
	
	System.out.println("Odd Element:");
	intstream.filter(x->x%2!=0).forEach(System.out :: println);
	}

}
