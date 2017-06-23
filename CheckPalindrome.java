package com.vimal.test;

public class CheckPalindrome {

	public boolean getPalindrome(String myString) {
		// TODO Auto-generated method stub
		
		StringBuffer strBf = new StringBuffer(myString);
		strBf.reverse();
		return (strBf.toString().equalsIgnoreCase(myString));
		
	}

	public String getReverseString(String MyString) {
		// TODO Auto-generated method stub
		StringBuffer strBf = new StringBuffer(MyString);
		return strBf.reverse().toString();
	}
	
	

}
