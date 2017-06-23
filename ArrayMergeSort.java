/**
 * 
 */
package com.vimal.test;

/**
 * @author Vimal Balakrishnan
 *
 */
public class ArrayMergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {2,4,5,6,7,8,9};
		int B[]	= {4,6,7,8,10,32,45,67};
		
		//int C[] = mergeArrays(A,B);
		int C[] = merge(A,B);
		
		for (int i=0;i<C.length;++i)
			System.out.print(" "+C[i]);

	}

	public static int [] mergeArrays(int A[], int B[]){
		int result[]=new int [A.length+B.length];
		
		int i=0,j=0,k=0;
		while (i<A.length && j < B.length){
			result[k++]= (A[i] < B[j])?A[i++]:B[j++];
				
		}
		while (i<A.length)
			result[k++] = A[i++];
		while (j<B.length)
			result[k++] = B[j++];
		
		return result;
		
	}
	
	public static int[] merge(int[] A, int[] B) {
	    int[] answer = new int[A.length + B.length];
	    int i = A.length - 1, j = B.length - 1, k = answer.length;

	    while (k > 0)
	        answer[--k] = 
	            (j < 0 || (i >= 0 && A[i] >= B[j])) ? A[i--] : B[j--];
	            
	     
	return answer;
	}
	
}

