package com.thread.synchron;

public class AccountHolder implements Runnable {
	
	Account acc = new Account();
	
	
	@Override
	public void run() {
		//Thread�� ���ѹݺ� ��ų �� ����
		while(acc.getBalance() > 0) {
			// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100; //100~300
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}

	}

}
