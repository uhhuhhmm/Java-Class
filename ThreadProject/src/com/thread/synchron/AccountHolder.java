package com.thread.synchron;

public class AccountHolder implements Runnable {
	
	Account acc = new Account();
	
	
	@Override
	public void run() {
		//Thread는 무한반복 시킬 수 있음
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100; //100~300
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}

	}

}
