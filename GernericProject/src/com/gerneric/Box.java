package com.gerneric;

import java.util.ArrayList;

public class Box<T> {
	//T 자리에 데이터타입이 들어감
	//타입의 안정성
	//<> 안에 참조형만
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


//생성방법
//Box<String> box1 = new Box<String>();
//Box<Integer> box2 = new Box<Integer>();

//기존 Collection에도 Gerneric 적용 가능
//ArrayList<String> list = new ArrayList<String>();
