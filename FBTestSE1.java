package com.vimal.Test;

public class FBTestSE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//854329
//854239
	
	
// 34786789
// 34768987
	
	
	//192345
	
//756
	
//8524	

//Given an integer n, find the greatest integer less than n and has the same digits
public int[] getNextLess(int[] num){
	
	for (int i = num.length-1;i>0;--i){
		
		if (num[i]> num[i-1]){
			continue;
		}
		else{
			
			int j = getMaxIndex(num, i, num.length);
			int t=num[i];
			num[i]=num[j];
			num[j]=t;
			
			
		}
		
		
		
	}
	
	
	return num;
}

public int getMaxIndex(int [] num, int startIndex, int endIndex){
	int min=0;
	for (int i=startIndex;i<endIndex;++i ){
		if (num[i] < min)
			min=num[i];
	}
	
	return min;
}	




}  
  
  