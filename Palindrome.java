package com.vimal.Test;

public class Palindrome {
	
	
	public static void main(String args[]){

		//displayFibinoci(10);
		//desplayPalindrome(10000);
		//reverseString("Vimal");
		//reverseStringNew("Vimal");
		//System.out.println(recRevString("Vimal"));
		reverseWordsOfString();
		
	}
	
	
	public static boolean isPalindrome(int num){
		
		int gNum = num;
		int revNum =0;
			
		for (; gNum>0; gNum=gNum/10){
		
			revNum=revNum*10+gNum%10;
			
		}
		if (num == revNum)
			return true;
		else
			return false;
		
		
		}
	
	public static void desplayPalindrome(int n){
		for (int i=1000;i<n;++i)
			if(isPalindrome(i))
				System.out.println(i +" is Palindrom ");
	}
	
	public static void displayFibinoci(int n){
		//1 1 2 3 5 8 13 22
		//n = 2;
		int[] fib = new int[n];
		if (n > 1)
			{fib[0]=1;fib[1]=1;}
		else if (n>0)
			{fib[0]=1;}
		for (int i = 2;i<n;++i){
			fib[i]=fib[i-1]+fib[i-2];
		}
		for (int j=0;j<fib.length;++j)
			System.out.print(fib[j]+ " ");
	}
	
	public static void reverseString(String str){
		
		if (str ==null|| str.length() <1 ){
			System.out.println("String is empty");
			return;
		}
		
		int len = str.length();
		char strnew[] = new char[len];
		
		for (int i = 0;i<= len/2;++i){
			strnew[i]= str.charAt(len-i-1);
			strnew[len-i-1]=str.charAt(i);
		}
		System.out.println("Given String -> "+str);
		System.out.print("Reverse String -> ");
		
		for (int i=0;i<strnew.length;++i)
			System.out.print(strnew[i]);
		
	}
	
public static void reverseStringNew(String str){
		
		System.out.println("Given String -> "+str);
		System.out.print("Reverse String -> ");
		
		for (int i = str.length()-1;i>=0;--i){
			System.out.print(""+str.charAt(i));
		}
		
	}

public static String recRevString(String str){
	if (str==null || str.length() <=1)
		return str;

	return (recRevString(str.substring(1)) + str.charAt(0));
	
}

public static void reverseWordsOfString(){
	
	String givenWords = " This is my test sentence";
	
	String words[] = givenWords.split(" ");
	
	String revString = "";
	for (int i = 0; i< words.length;++i){
		revString+= recRevString(words[i])+ " ";
		
	}
	System.out.println(revString);
	
}
	
	
}
