package com.vimal.Test;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, find two numbers such that they add up to a specific target number.

//Example - Input: numbers={5, 2, 6, 7, 11, 15}, target=9
//Output: index1=1, index2=3

public class SumInArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int input[] = {5, 2, 6, 7, 11, 15,-2};
		
		//int input[] = null; // {1};
		checkSum(input, 9);

	}


	public static void checkSum(int[] input, int target){
	
		//TODO : Check for empty/NULL input Array
		if(input==null || input.length < 2  ){
			System.out.println("No pair possible - Either empty or less than 2");
			return;
		}
		Map<Integer, Integer> map = new HashMap<>();
	
		for (int i = 0;i<input.length;++i){
			 if (map.containsKey(input[i])){
			     System.out.println("Found pair at ("+map.get(input[i]) +", "+ i+")");
			 }
			 else{
			     map.put((target-input[i]), i);
			 }
		
		}
	}
	
	

}

