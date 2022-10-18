package com.ThreadsLec;

public class ThreadDemo2 extends Thread{
	
	ThreadDemo2(String name){
		super(name);
		System.out.println(this.getName()+ " created.");
		start();
	}
	
	public void run() {
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child Thread interrupted.");
		}
		System.out.println("Child Thread finished.");
	}
}
