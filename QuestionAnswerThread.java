/*
 *  Thread1 - Hi;How are you; I am also good, ttl;
 *  Thread2 - Hi; I am good, How about you; Great, ttl
 * 
 * 
 */

package com.vimal.Test;

public class QuestionAnswerThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat m = new Chat();
		new AThread(m);
		new QThread(m);
		
		
		
	}

}

class Chat{
	
	boolean flag=false;
	
	public synchronized void Questions(String str){
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(str);
		flag=true;
		notify();
	}
	public synchronized void Answers(String str){
		if(!flag){
			try{
				wait();
			}catch (InterruptedException e){}
		}
		System.out.println(str);
		flag=false;
		notify();
			
	}
}

class  QThread implements Runnable{
	Chat m;
	String[] s1 = {"Hi Vimal", "How are you Vimal", "I am also good", "ttl"};

	public QThread(Chat m1){
		this.m=m1;
		new Thread(this, "Question").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0;i<s1.length;++i){
			m.Questions(s1[i]);
		}
		
	}
}

class AThread implements Runnable{
	Chat m;
	String[] s2= {"Hi Sunil", "I am good Sunil, How about you","Great, ttl"};
	public AThread(Chat m1){
		m=m1;
		new Thread(this, "Answers").start();
	}
	
	@Override
	public void run(){
		for (int i = 0;i<s2.length;++i){
			m.Answers(s2[i]);
		}
	}
}



