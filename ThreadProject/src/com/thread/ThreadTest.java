package com.thread;

public class ThreadTest {

	public static void main(String[] args) {
		//������ Ŭ���� �����ϱ�
		//1. ThreadŬ���� ����ϱ�
		//2. Runnable�������̽� ����ϱ�
		
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		
		//�������̽��� �޾Ƽ� �����ϴ� �����ڴ� 2�ܰ踦 ��ģ��
		Runnable r = new ThreadEx2();
		Thread th2 = new Thread(r);
		
		th2.start();
				
		
		
	}

}
