package com.vimal.Test;

import java.util.ArrayList;
import java.util.Collections;

public class NegativeSortArray {
	/*
	- sort array while keeping positive and negative placeholders
	e.g. For input = [-21, 15, 19, 17, -25, -20, 16, 18],
	     make output = [-20, 15, 16, 17, -21, -25, 18, 19]
	*/
	
	public static void main(String args[]){
		
		
		int input[] = {-21, 15, 19, 17, -25, -20, 16, 18};
		
		ArrayList<Integer> positive1 = new ArrayList<>();
		ArrayList<Integer> negative1 = new ArrayList<>();
		int output[] = new int[input.length];
		
		System.out.print("\n Input->");
		for (int i = 0;i<input.length;++i){
			System.out.print(" "+input[i]);
		}
		
		for (int i = 0;i<input.length;++i){
			if( input[i]>=0)
				positive1.add(input[i]);
			else
				negative1.add(input[i]);
		}
		Collections.sort(positive1);
		Collections.sort(negative1,Collections.reverseOrder());
		int posIndex=0, negIndex = 0;
		
		for (int i = 0;i<input.length;++i){
			output[i] = input[i]>0 ? 
						positive1.get(posIndex++): negative1.get(negIndex++);
		}
		
		System.out.print("\n Output->");
		for (int i = 0;i<output.length;++i)
			System.out.print(" "+output[i]);
				
	}
	
}
