package com.vimal.Test;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddThread {

	public static Queue<Integer> myQueue = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNumberThread addt= new AddNumberThread(myQueue, 1);
		addt.start();
		EvenThread ev=new EvenThread(myQueue);
		ev.start();
		

	}

	
}

class EvenThread implements Runnable{
	Thread T;
	String name="Even Thread : ";
	int num;
	Queue<Integer> myQueue;
	public void start(){
		if (T==null){
			T=new Thread(this, name);
			T.start();
		}
	}
	public EvenThread(Queue<Integer>myQueue){
		this.myQueue=myQueue;
	}
	public void run(){
		
		synchronized(EvenThread.class){
			int nu= myQueue.remove();
			if(nu%2==0)
				System.out.println("Even "+nu);
			else
				myQueue.add(nu);
		}
	}
}

class OddThread implements Runnable{
	
	public void run(){
		
	}
}
class AddNumberThread implements Runnable{
	Thread T;
	String name="ADD Thread";
	int num;
	Queue<Integer> myQueue;
	
	public AddNumberThread(Queue<Integer> myQueue, int num){
		this.num=num;
		this.myQueue=myQueue;
	}
	
	public void start(){
		if (T==null){
			T= new Thread(this, name);
			T.start();
		}
		System.out.println("Thread Started "+name);
	}
	
	@Override
	public void run(){
		
		synchronized(AddNumberThread.class){
			myQueue.add(num);
			
		}
	}
}