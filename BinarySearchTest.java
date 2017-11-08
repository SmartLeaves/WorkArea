package com.vimal.Test;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTest bs = new BinarySearchTest();
		int[] ar= {1,5,7,10,16,23,56,79,100};
		bs.binarySearch(ar,719);
	}
	
	public void binarySearch(int ar[], int key){
		
		int start = 0;
		int end = ar.length-1;
		
		while(start < end){
			int mid = (start+ end)/2;
			if(ar[mid]==key){
				System.out.println("Found at "+mid);
				return;
			}
			if(key < ar[mid]){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		System.out.println("Not FOUND");
		
		
	}

}
