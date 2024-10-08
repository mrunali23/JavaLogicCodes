package com.string.practice;

public class StringProgram {

	public static void main(String[] args) {
		//using charAt
		/*
		String name="Mrunali";
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(name.length()-i-1));
		}
		
		*/
		
		//using Recurssion
		
		//System.out.println(revesestring("mrunali"));
		
		//String Reversal
		StringReversal("Mr@#$%un%ali#Dan$dga@vhal");
	}
/*
	private static String revesestring(String string) {
		
		if(string.isEmpty()) {
			return string;
		}
		
			return revesestring(string.substring(1))+string.charAt(0);
		
		
		
	}
	*/

	private static void StringReversal(String string) {
		char[] name=string.toCharArray();
		
		int left=0;
		int right=name.length-1;
		
		while(left<right) {
		
			while(!Character.isLetterOrDigit(string.charAt(left))) {
				//System.out.println(string.charAt(left));
				left++;
			}
			while(!Character.isLetterOrDigit(string.charAt(right))) {
				//System.out.println(string.charAt(right));
				right--;
			}
			
			char temp= name[left];
			name[left]=name[right];
			name[right]=temp;
			left++;
			right--;
			
		}
		for(char ch:name) {
			System.out.print(ch);
		}
		
	}
}
