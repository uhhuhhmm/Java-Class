package com.thread.synchron;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	
	private JLabel timerLabel;
	
	//생성자
	public TimerThread(JLabel timerLabel) {
		super();
		this.timerLabel = timerLabel;
	}
	
	
	@Override
	public void run() {
		int n = 0; 				//숫자를 카운트해주는
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
	
	
}
