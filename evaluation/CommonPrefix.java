package com.evaluation;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Arr ={"apple", "ape", "april"};
		
		
		System.out.println(LongestCommonPrefix(Arr));
		

	}
	public static String LongestCommonPrefix(String[] str) {
		
		int i =0;
		while(true) {
			boolean flag = true;
			for(int j=1; j<str.length; j++) {
				if(str[j].length() <= i || str[j-1].length() <= i || str[j].charAt(i) != str[j-1].charAt(i)) {
				   
					flag = false;
					break;					
				}
			}
			if(flag) {
				i++;
			}
			else {
				break;
			}
		}
		
		return str[0].substring(0,i);
	}
}
