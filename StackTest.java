package com.vimal.Test;

public class StackTest {

	public int top;
	public int max_size;
	public int arry[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackTest stack = new StackTest(3);
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.printStack();
		stack.pop();
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.printStack();

	}
	public StackTest(int size){
		top =-1;
		max_size = size;
		arry=new int[max_size];
	}
	public boolean full(){
		if (top==max_size-1){
			System.out.println("FULL");
			return true;
		}
		return false;
	}
	public boolean isEmpty(){
		if (top ==-1){
			System.out.println("EMPTY");
			return true;
		
		}
		else return false;
	}
	
	public void push(int data){
 		if(!full()){
			arry[++top]=data;
		}
	}
	public void pop(){
		if(!isEmpty()){
			System.out.println("");
			System.out.println("POP element "+arry[top--]);
		}
	}
	public void printStack(){
		for (int i=0;i<=top;++i){
			System.out.print(arry[i] + "->");
		}
	}
	
}


