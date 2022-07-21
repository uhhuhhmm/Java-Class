package com.thread;

public class ThreadEx13Test {

	public static void main(String[] args) {
		Thread12_1 th1 = new Thread12_1();
		Thread12_2 th2 = new Thread12_2();
		
		th1.start();
		th2.start();
		
		
		try {
			// ���� Thread�� join()�� ȣ���� main Thread�� �Ͻ��������·� �ٲ�� �ش� Thread�� �Ϸ� �Ǹ� �ٽ� ����ȴ� 
			th1.join(1000);
			th2.join();
			// �Ͻ����� ���·� ����� �뵵, �ٸ� �����尡 �� �۵� �� �� ����, wait
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("Main Thread ����");
		
	}

}
