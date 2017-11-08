package com.vimal.Test;

public class TreadRunnable{
	
	public static void main(String args[]){
		RunnableDemo T1 = new RunnableDemo(" Thread -1 ");
		T1.start();
		
		RunnableDemo T2 = new RunnableDemo(" Thread -2 ");
		T2.start();
		
	}
	
}

class RunnableDemo implements Runnable{
	
	Thread T;
	String TreadName;
	
	public RunnableDemo(String name){
		TreadName = name;
		System.out.println("Thread Created -> "+ name);
	}
	
	@Override
	public void run(){
		
		try{
		for (int i = 0 ; i<5;++i){
			System.out.println("Thread Running ->"+i);
			Thread.sleep(500);
		}
		}catch (InterruptedException e){
			System.out.println("Thread Interupted -> "+ TreadName);
		}
		System.out.println("Thread Finished -> "+ TreadName);
	}
	
	public void start(){
		System.out.println("Thread Started -> "+ TreadName);
		if (T==null){
			T= new Thread(this, TreadName);
			T.start();
		}
		
	}
	
}