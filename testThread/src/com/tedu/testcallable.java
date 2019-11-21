package com.tedu;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class testcallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		String mag = Thread.currentThread().hashCode()+"执行成功";
		return mag;
	}
	
	public static void main(String[] args) throws Exception{
		Callable callable = new testcallable();
		for(int i=0;i<10;i++){
			FutureTask<String> tasks = new FutureTask<>(callable);
			new Thread().start();
			String msg= tasks.get();
			System.out.println("返回值"+msg);
		}
	}

}
