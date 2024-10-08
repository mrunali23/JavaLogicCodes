package com.string.practice;

public class StringNumber {
	public static void main(String[] args) {
		String duplicatecount ="aaabddeeeeef";
		String newstring="";
		int i=0;
		int count=0;
		while(i< duplicatecount.length()) {
			char currentchar =duplicatecount.charAt(i);
			while(i+1<duplicatecount.length() && duplicatecount.charAt(i+1)==currentchar) {
		//	while(duplicatecount.charAt(i+1)==currentchar && i+1<duplicatecount.length()) {
				i++;
				count++;
			}
			newstring = newstring+currentchar;
			if(count!=0) {
				newstring = newstring+count;
				count =0;
			}
			i++;
		}
		System.out.println("New String: "+ newstring);
	}
}
