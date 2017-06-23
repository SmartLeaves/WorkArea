package com.vimal.Test;
/*
 * 
A queue is an abstract data type that maintains the order in which elements were added to it, 
allowing the oldest elements to be removed from the front and new elements to be added to the rear. 
This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue
 (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process  queries, 
where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.	
 
 * 
 */




import java.util.Scanner;
import java.util.Stack;

public class QueueUsing2Stack {

	    public static void main(String[] args) {
	        MyQueue queue = new MyQueue();

	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        for (int i = 0; i < n; i++) {
	            int operation = scan.nextInt();
	            if (operation == 1) { // enqueue
	              queue.enqueue(scan.nextInt());
	            } else if (operation == 2) { // dequeue
	              queue.dequeue();
	            } else if (operation == 3) { // print/peek
	              System.out.println(queue.peek());
	            }
	        }
	        scan.close();
	    }
	    
	    static class MyQueue{
	        Stack<Integer> pushStack;
	        Stack<Integer> popStack;
	        public MyQueue(){
	            
	            pushStack = new Stack<>();
	            popStack = new Stack<>();
	         }
	        
	        public void enqueue(int num){
	            pushStack.push(num);
	   
	        }
	        public int dequeue(){
	            copyStack();
	            return popStack.pop();
	                
	        }
	        
	        public int peek(){
	            copyStack();
	            return popStack.peek();
	        }
	        
	        public void copyStack(){
	            if (popStack.empty())
	                while(!pushStack.empty())
	                    popStack.push(pushStack.pop());
	        }
	    }
	}
