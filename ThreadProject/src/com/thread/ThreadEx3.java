package com.thread;

import javax.swing.JOptionPane;

public class ThreadEx3 {

	public static void main(String[] args) {
		//�⺻ ��� ���
		ThreadCnt th1 = new ThreadCnt();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է���~");
		System.out.println("�Է°� ��� : " + input);
		//�Է��ϰ� ���� ��� ���� (ȣ���� Thread�� ����������)
		
		
	}

}
