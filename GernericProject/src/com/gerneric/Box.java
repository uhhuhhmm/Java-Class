package com.gerneric;

import java.util.ArrayList;

public class Box<T> {
	//T �ڸ��� ������Ÿ���� ��
	//Ÿ���� ������
	//<> �ȿ� ��������
	//1ex
//	T item;
//
//	T getItem() {
//		return item;
//	}
//	
//	void setItem(T item) {
//		this.item = item;
//	}
	
	//2ex
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	public String toString() {
		return list.toString();
	}
	
	
}


//�������
//Box<String> box1 = new Box<String>();
//Box<Integer> box2 = new Box<Integer>();

//���� Collection���� Gerneric ���� ����
//ArrayList<String> list = new ArrayList<String>();
