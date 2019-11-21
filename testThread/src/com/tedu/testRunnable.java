package com.tedu;

public class testRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		 Runnable runne = new testRunnable();
		 for(int i = 0;i<10;i++){
			 new Thread(runne).start();
		 }
	}
}
