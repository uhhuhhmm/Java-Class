package com.thread.synchron;

public class ThreadWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		Table table = new Table();
		
		//Thread 생성, 이름 정하기
		new Thread(new Cook(table),"COOK1").start();
		new Thread(new Customer(table,"donut"),"CUST1").start();
		new Thread(new Customer(table,"burger"),"CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
		
	}

}
