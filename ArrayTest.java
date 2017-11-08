package com.vimal.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FindDuplicate();
		//findSum();
		//bumbyNumber();
		String test="This is My test String";
		//System.out.println(replaceString(test.trim()," ","9999"));
		
		//System.out.println(replaceStringUsingCharArray(test.toCharArray(),test.length()));
		//chkUniqueString();
		fib(2);
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
		String myString = "AABBCCDDEE";
		
		//int [] checkBool = new int[128];
		
		//int[] checkSum = new int[128]
		/*Hashtable<Integer, Integer> ht= new Hashtable<>();
		ht.get(0);
		for (int a:ht.keySet() ){
			
		}*/
		
		Map<Character, Integer> dMap = new HashMap<>();
		
		for(int i=0;i<myString.length();++i){
		


			if (dMap.get(myString.charAt(i))!=null){ // 
				dMap.put(myString.charAt(i), dMap.get(myString.charAt(i))+1);
			}
			else{
				dMap.put(myString.charAt(i), 1);
			}
		}
		System.out.println("Given String "+myString);
		for(int i=0;i<myString.length();++i){		
			if (dMap.get(myString.charAt(i))==1){
				System.out.println("Non repatative  -> "+myString.charAt(i));
				break;
			}
		}
			
		return;		
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
	//1 1 2 3 5 8 13
	public static void fib(int n){
		
		if (n < 1){
			System.out.println("NO");
			return;
		}
		if (n == 1){
			System.out.println("1");
			return;
		}
		
		int feb[] = new int[n];
		feb[0]=1;
		feb[1]=1;
		for (int i=2;i<n;++i){
			feb[i]=feb[i-1]+feb[i-2];
		}
		for (int i=0;i<n;++i){
			System.out.println(feb[i]);
		}
	}

}
