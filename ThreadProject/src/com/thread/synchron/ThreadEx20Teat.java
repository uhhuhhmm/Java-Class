package com.thread.synchron;

public class ThreadEx20Teat {

	public static void main(String[] args) {
		Runnable r = new AccountHolder();
		
		//r�� ����ϸ� ���� Thread ���� ����
		Thread ah1 = new Thread(r);
		Thread ah2 = new Thread(r);
		//����ȭ ��Ģ�� ó�� ���, �񵿱�ȭ ��Ģ���� ���� ó�� ���
		
		ah1.start();
		ah2.start();
		
	}

}
