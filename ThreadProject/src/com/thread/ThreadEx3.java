package com.thread;

import javax.swing.JOptionPane;

public class ThreadEx3 {

	public static void main(String[] args) {
		//기본 사용 방식
		ThreadCnt th1 = new ThreadCnt();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력해~");
		System.out.println("입력값 출력 : " + input);
		//입력하고 나면 대기 상태 (호출한 Thread가 끝날때까지)
		
		
	}

}
