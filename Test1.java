package com.vimal.Test;


import java.util.HashMap;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getSumPair();
		showPermutations();

	}
	
	public static void getSumPair(){
		
		//9
		//[6,4,1,3,5]
		int getNum[]={6,4,1,3,5,0,9,-1,10,-8,-1};//3,5,8,6
		int target = 9;
		
		String strResult="" ;
		HashMap<Integer,Integer> hMap = new HashMap<>();
		
		
		for (int i=0;i<getNum.length; ++i){
			
			if (hMap.containsKey(Math.abs(getNum[i]))){
				strResult+= "("+ hMap.get(getNum[i])+ "," +i+") ";
			}
			else{
				hMap.put(Math.abs(target-getNum[i]), i);
			}
		}
		
		System.out.println(strResult);
		
		//return strResult;
		
	}
	
	public static void showPermutations(){
		
		String str1="Vimal";
		String str2="Vmlia";
		
		char[] strChar1 = str1.toCharArray();
		java.util.Arrays.sort(strChar1);
		
		char[] strChar2 = str2.toCharArray();
		java.util.Arrays.sort(strChar2);
		
		if (str1.length()!=str2.length())
			System.out.println("No permutation");
		if (strChar1.equals(strChar2))
			System.out.println("permutation");
		
	
	}
	
	public static void sortString(char[] str){
		
		java.util.Arrays.sort(str);
	}

}
