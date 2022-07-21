package com.thread;

public class ThreadTest {

	public static void main(String[] args) {
		//쓰레드 클래스 정의하기
		//1. Thread클래스 사용하기
		//2. Runnable인터페이스 사용하기
		
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		
		//인터페이스를 받아서 생성하는 생성자는 2단계를 거친다
		Runnable r = new ThreadEx2();
		Thread th2 = new Thread(r);
		
		th2.start();
				
		
		
	}

}
