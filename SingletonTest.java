package com.vimal.Test;

public class SingletonTest {
	
	private static SingletonTest myObject;
	
	private SingletonTest(){}
	
	public static SingletonTest getInstance(){
		
		synchronized(SingletonTest.class){
			if (myObject == null)
				myObject = new SingletonTest();
		}
		return myObject;
		
	}

}
