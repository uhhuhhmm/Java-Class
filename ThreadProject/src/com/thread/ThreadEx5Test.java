package com.thread;

public class ThreadEx5Test implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		//MAIN THREAD
		Runnable r = new ThreadEx5Test();
		Thread t = new Thread(r);
		//Demon Thread ���� t�� Demon Thread�� �ǰڴ�~
		t.setDaemon(true);
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			
			System.out.println(i);
			
			if(i == 5) {
				autoSave = true;
			}
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				//Thread�� 3�ʿ� �ѹ��� ������ 1000 = 1��
				Thread.sleep(3000);
			}catch(Exception e) {
				
			}
			
			if(autoSave == true) {
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("������ �ڵ� ���� ��");
	}

}

//��ü�� Thread
