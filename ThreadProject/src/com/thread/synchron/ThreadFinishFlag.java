package com.thread.synchron;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ThreadFinishFlag extends JFrame {

	private RandomThread th;
		
	public ThreadFinishFlag() {
		setTitle("Thread Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // c°¡ ContentPane
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
			
		});
		
		setSize(300, 200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
		
	}
	
	
	
	
	
	
	
}
