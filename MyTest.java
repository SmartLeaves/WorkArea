package com.vimal.test;

/*
 * Java program to find the largerest sum of contiguous subarry.
 */

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] ={-2,-3,4,-1,-2,1,5,-3};
		//System.out.println("result "+ intMaxSubArry(a));
		showFibonoci(5);
		
	}
	// Find largest sum of continous sub  array.
	public static int intMaxSubArry(int a[]){
		
		int size = a.length;
		int max_so_far = 0;
		int max_ending_here =0;
		
		for (int i=0;i<size;++i){	
			max_ending_here = max_ending_here+a[i];
			if (max_so_far < max_ending_here)
				max_so_far=max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
	
	//1 1 3 5 
	public static void showFibonoci( int size){
		int [] fb = new int[size];
		
		fb[0]=1;
		fb[1]=1;
		
		for (int i=2;i<size;++i){
			fb[i]=fb[i-1]+fb[i-2];
			
		}
		for (int i=0;i<size;++i){
			System.out.print(" "+fb[i]);
		}

	}
	

}



