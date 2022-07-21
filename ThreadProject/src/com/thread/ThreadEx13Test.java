package com.thread;

public class ThreadEx13Test {

	public static void main(String[] args) {
		Thread12_1 th1 = new Thread12_1();
		Thread12_2 th2 = new Thread12_2();
		
		th1.start();
		th2.start();
		
		
		try {
			// 현재 Thread의 join()를 호출한 main Thread가 일시정지상태로 바뀌고 해당 Thread가 완료 되면 다시 실행된다 
			th1.join(1000);
			th2.join();
			// 일시정지 상태로 만드는 용도, 다른 쓰레드가 다 작동 된 후 실행, wait
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("Main Thread 종료");
		
	}

}
