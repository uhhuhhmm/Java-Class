package com.thread;

public class ThreadEx12Test {

	public static void main(String[] args) {
		Thread12_1 th1 = new Thread12_1();
		Thread12_2 th2 = new Thread12_2();
		
		//Thread �� 3�� Main ����
		th1.start();
		th2.start();
		
		//Sleep ��Ŭ���� ��ü �� Thread�� ��� 
//		try {
//			Thread.sleep(2000); 
//			//���� ȣ��� Thread�� sleep �ɸ�, ���⼱ Main Thread sleep
//		}catch(InterruptedException e) {
//			
//		}
		
		System.out.println("main Thread ����");
		
	}

}
