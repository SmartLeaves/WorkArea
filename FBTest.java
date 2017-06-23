package com.vimal.Test;

//Program to find the max profit from a group days of shares
//eg:  10,20,30,40,50 should give 40
//1,8, 100, 2, 100, should give 99 as the max profit

public class FBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days[] = {10,20,30,40,50};
		System.out.println("Profit is " +getProfite(days));
	}
	
public static int getProfite(int days[]){
		
		int max = 0;
		int profit = 0;
		
		for (int i = days.length-1;i >= 0;--i){
			if (max <= days[i])
				max=days[i];
			if (profit < max-days[i])
				profit = max-days[i];
		}
		return profit;
	}

}
