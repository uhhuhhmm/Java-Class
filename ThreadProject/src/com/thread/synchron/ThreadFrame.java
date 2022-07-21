package com.thread.synchron;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadFrame extends JFrame {

	public ThreadFrame() {
		setTitle("Thread�� ��� ���� Ÿ�̸�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC,80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		
		JButton btn = new JButton("stop timer");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				btn.setEnabled(false);
			}
						
		});
		
		c.add(btn);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
		
		
	
	
	
	}
	
	
	
	
	
	
	
}
