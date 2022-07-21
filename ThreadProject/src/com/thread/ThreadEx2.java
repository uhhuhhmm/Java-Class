package com.thread;

public class ThreadEx2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}					//currentThread()를 사용해서 getName()을 불러올 수 있다
	}

}
