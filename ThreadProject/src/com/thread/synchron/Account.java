package com.thread.synchron;

public class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}
	//wait는 synchronized 메소드 안에서만 사용 가능
	//notify()는 wait()로 대기상태에 있는 Thread를 실행시킨다
	//여러개가 wait()일 겨우 notify()를 실행시키면 랜덤하게 1개가 실행대기열로 나온다(특정불가 문제)
	
	public /*synchronized*/ void withdraw(int money) {
		synchronized(this) {
			if(balance >= money) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					
				}
				balance -= money;
				
			}
		}
	}
}
