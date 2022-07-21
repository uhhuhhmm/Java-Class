package com.thread.synchron;

import java.util.ArrayList;

public class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6; //테이블 놓을 수 있는 음식 최대 개수
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	//요리사
	public synchronized void add(String dish) {
		// 테이블에 음식이 가득찼으면, 테이블에 음식을 추가하지 않는다.
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "님 대기중");
			
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
	//고객
	public void remove(String dishName) {
		// 지정된 요리와 일치하는 요리를 테이블에서 제거한다
		synchronized (this) {
			String name  = Thread.currentThread().getName();
			while(dishes.size() == 0) {
				System.out.println(name + "님이 기다리고 있어");
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
					System.out.println(name + "님이 대기중");
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
