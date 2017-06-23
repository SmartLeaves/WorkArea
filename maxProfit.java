 package com.vimal.Test;

public class maxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days[] = {1,100};
		System.out.println("Profit is " +getProfite(days));

	}
	
	
	public static int getProfite(int days[]){
		
		int trading[] = new int[days.length];
		int max = 0;
		int profit = 0;
		
		for (int i = days.length-1;i >= 0;--i){
			if (days[i] >= max){
				trading[i]=0; //Sel
				max = days[i];
				
			}
			else{
				trading[i]=1;
				
			}
			profit = profit+ (max-days[i]);
			
		}
		for (int i = 0;i<trading.length;++i){
			System.out.print(trading[i]+",");
		}
		System.out.println();
		
		
		
		return profit;
	}
	
	

}