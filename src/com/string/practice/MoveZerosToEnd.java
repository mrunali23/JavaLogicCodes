package com.string.practice;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr= {1,0,0,3,0,4,0,5,6,7,1};
		//System.out.println(arr);
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		int pointer=0;
		
		for(int right=0;right<arr.length;right++) {
			if(arr[right]!=0) {
				arr[pointer]=arr[right];
				pointer++;
			}
		}
		while(pointer<arr.length) {
			arr[pointer++]=0;
		}
		System.out.println("Hello");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
	}
}
