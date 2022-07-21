package com.thread;

public class ThreadEx12Test {

	public static void main(String[] args) {
		Thread12_1 th1 = new Thread12_1();
		Thread12_2 th2 = new Thread12_2();
		
		//Thread 총 3개 Main 포함
		th1.start();
		th2.start();
		
		//Sleep 이클립스 자체 내 Thread를 사용 
//		try {
//			Thread.sleep(2000); 
//			//현재 호출된 Thread가 sleep 걸림, 여기선 Main Thread sleep
//		}catch(InterruptedException e) {
//			
//		}
		
		System.out.println("main Thread 종료");
		
	}

}
