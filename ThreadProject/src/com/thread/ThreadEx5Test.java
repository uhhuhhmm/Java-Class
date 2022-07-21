package com.thread;

public class ThreadEx5Test implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		//MAIN THREAD
		Runnable r = new ThreadEx5Test();
		Thread t = new Thread(r);
		//Demon Thread 현재 t는 Demon Thread가 되겠다~
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
				//Thread를 3초에 한번씩 돌려라 1000 = 1초
				Thread.sleep(3000);
			}catch(Exception e) {
				
			}
			
			if(autoSave == true) {
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("파일이 자동 저장 됨");
	}

}

//자체가 Thread
