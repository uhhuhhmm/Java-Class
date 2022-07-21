package com.thread.synchron;

import java.util.ArrayList;

public class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6; //���̺� ���� �� �ִ� ���� �ִ� ����
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	//�丮��
	public synchronized void add(String dish) {
		// ���̺� ������ ����á����, ���̺� ������ �߰����� �ʴ´�.
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "�� �����");
			
			try {
				wait();
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
		dishes.add(dish);
		
		notify();
		System.out.println("Dishes : " + dishes.toString());
	}
	//��
	public void remove(String dishName) {
		// ������ �丮�� ��ġ�ϴ� �丮�� ���̺��� �����Ѵ�
		synchronized (this) {
			String name  = Thread.currentThread().getName();
			while(dishes.size() == 0) {
				System.out.println(name + "���� ��ٸ��� �־�");
				try {
					wait();
					Thread.sleep(500);
				}catch(InterruptedException e) {
					
				}
			}
		
			while(true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}
				}
				
				try {
					System.out.println(name + "���� �����");
					wait();
					Thread.sleep(500);
				}catch(InterruptedException e) {
					
				}
			}
		}
	}
	
	public int disNum() {
		return dishNames.length;
	}


}
