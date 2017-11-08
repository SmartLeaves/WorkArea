package com.vimal.Test;

public class StairCaseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		for (int i=0;i<num;++i){
			for (int j=1;j<=num;++j){
				System.out.print(j<num-i?" ":"#");
			}
			System.out.println("");
			
		}
	}
	
	

}
