package com.vimal.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FindDuplicate();
		//findSum();
		//bumbyNumber();
		String test="This is My test String";
		//System.out.println(replaceString(test.trim()," ","9999"));
		
		System.out.println(replaceStringUsingCharArray(test.toCharArray(),test.length()));
		
	}
	
	
	public static void FindDuplicate(){
	
		String[] strArray = {"Test", "Test1", "Vimal", "Test","Vimal"};
		
		HashSet<String> dupSet = new HashSet<>();
		
		for (String strElement:strArray){
			if(!dupSet.add(strElement)){
				System.out.println("Duplicate is ->"+strElement);
			}
		}
		
	}
	
	public static void bumbyNumber(){
		
		int [] intNum = {1,2,3,2,5,6,7,8,9};
		if(intNum == null || intNum.length < 2){
			System.out.println("Array is empty or length less than 2");
			return;
		}
		
		for (int i= 0;i<intNum.length-1 ;++i){
			
			if(intNum[i+1]-intNum[i]>1)
				System.out.println("Not Bumby");
		}
		
	}
	
	public static void chkUniqueString(){
		String myString = "testing";
		
		boolean [] checkBool = new boolean[128];
		Hashtable<Integer, Integer> ht= new Hashtable<>();
		ht.get(0);
		for (int a:ht.keySet() ){
			
		}
		
		
		
	}
	public static String replaceString(String orginalString,String replacedString,  
																	String replacementString){
		
		String[] charArray = orginalString.split(replacedString);
		StringBuffer strB= new StringBuffer("");
		for (String str:charArray){
			strB.append(str);
			strB.append(replacementString);
		}
		return strB.toString();
	}
	
	//using char array
	
	public static char[] replaceStringUsingCharArray(char[] str, int trueLength){
		
		char[] replacementString = {'%','2','0'};
		
		int index, charCount =0;
		for (int i=0;i<trueLength;++i){
			if(str[i]==' ')
				charCount++;
		}
		
		index = trueLength+charCount * 3;
		char newStr[] = new char[index];
		
		if (trueLength < str.length)
			str[trueLength]='\0';
		
		for (int i = trueLength-1; i >=0;i--){
			if (str[i]==' '){
				newStr[index-1]='0';
				newStr[index-2]='2';
				newStr[index-3]='%';
				index = index-3;
			}else{
			
				newStr[index]=str[i];
				index--;
			}
			
		}
		
		System.out.println(newStr);
		
		return str;
	}
	
	

}
