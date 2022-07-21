package com.thread.synchron;

public class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}
	//wait�� synchronized �޼ҵ� �ȿ����� ��� ����
	//notify()�� wait()�� �����¿� �ִ� Thread�� �����Ų��
	//�������� wait()�� �ܿ� notify()�� �����Ű�� �����ϰ� 1���� �����⿭�� ���´�(Ư���Ұ� ����)
	
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
