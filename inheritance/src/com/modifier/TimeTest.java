package com.modifier;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 50;
		t.setHour(12);
		t.setMinute(54);
		t.setSecond(43);
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
	}

}
