package com.vimal.Test;

public class FileThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("testFile");
		Thread t1 = new Thread(new fileReader(file), "Read 1 ");
		Thread t2 = new Thread(new fileReader(file), "Read 2 ");
		
		t1.start();
		t2.start();
		Thread t3 = new Thread(new fileWriter(file), "Thread 3 ");
		t3.start();
	}

}

class File{
	String filename;
	public File(String fileN){
		this.filename=fileN;
	}
	
}

class fileReader implements Runnable{
	File file;
	
	public fileReader(File file){
		this.file=file;
		
	}
	
	public void run(){
		synchronized(file){
			try{
				System.out.println(Thread.currentThread().getName() + " is waiting for the file to be completed ");
				file.wait();
			}
			catch(InterruptedException e){
				
			}
			System.out.println(Thread.currentThread().getName() + " is completed ");
		}
	}

	}

class fileWriter implements Runnable{
	
	File file;
	public fileWriter(File f){
		this.file=f;
	}
	public void run(){
		synchronized(file){
			try{
				System.out.println(Thread.currentThread().getName() + "is going to write the file");
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
			file.notifyAll();
			System.out.println(Thread.currentThread().getName() + "is completed");
		}
	}
	
	
}
