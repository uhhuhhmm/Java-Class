package com.thread;

public class Thread12_1 extends Thread {

	@Override
	public void run() {
		
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		//마지막에 종료
//		try {
//			Thread.sleep(3000);
//		}catch(InterruptedException e) {
//			
//		}
		
		System.out.println("th1 Thread 종료");
	}

}
