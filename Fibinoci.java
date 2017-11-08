package com.vimal.Test;

import java.util.Scanner;

/*
 * This class is to print the fibinoci series till given number n
 * eg: if N = 5, it will print 1 1 2 3 5
 * 
 * 
 * */

public class Fibinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please give the Number till Fibinoci is needed -> ");
		int num = in.nextInt();
		displayFibinoci(num);

	}
	
	
	//Method to print the fibinoci. 
	public static void displayFibinoci(int n){
		if (n<= 0){
			System.out.print("Invalid Number");
			return;
		}
		
		int[] fib = new int[n];
		if (n > 1)
			{fib[0]=1;fib[1]=1;}
		else if (n>0)
			{fib[0]=1;}
		
		
		for (int i = 2;i<n;++i){
			fib[i]=fib[i-1]+fib[i-2];
		}
		for (int j=0;j<fib.length;++j)
			System.out.print(fib[j]+ " ");
	}

}
