package com.vimal.Test;

import java.util.Arrays;
import java.util.Collection;

public class FBTestSE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] ={5,4,1,3,2};
		
		FBTestSE1 fb = new FBTestSE1();
		fb.getNextLess(a);
		for ( int i=0;i< a.length;++i)
			System.out.print(a[i]);

	}
//854329
//854239
	
	
// 34786789
// 34768987
	
	
	//192345
	
//756
	
//8524	

//Given an integer n, find the greatest integer less than n and has the same digits
public void getNextLess(int[] num){
	
	for (int i = num.length-1;i>0;--i){
		
		if (num[i]> num[i-1]){
			continue;
		}
		else{
			
			int j = getMaxIndex(num, i, num.length);
			int t=num[i];
			num[i]=num[j];
			num[j]=t;
			
			sortSecondHalf(num,i, num.length);
			
		}
		
		
		
	}
	
}

public int getMaxIndex(int [] num, int startIndex, int endIndex){
	int min=0,index=0;
	for (int i=startIndex;i<endIndex;++i ){
		if (num[i] < min){
			min=num[i];
			index=i;
		}
	}
	
	return min;
}

public void sortSecondHalf(int[]num, int startIndex, int endIndex){
	
	Arrays.sort(num, startIndex, endIndex);
	
}




}  
  
  