package com.thread.synchron;

public class ThreadEx20Teat {

	public static void main(String[] args) {
		Runnable r = new AccountHolder();
		
		//r을 사용하면 여러 Thread 생성 가능
		Thread ah1 = new Thread(r);
		Thread ah2 = new Thread(r);
		//동기화 규칙성 처리 방식, 비동기화 규칙성이 없는 처리 방식
		
		ah1.start();
		ah2.start();
		
	}

}
