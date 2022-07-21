package com.circle;

public class Circle {
	public int r;
	public final double PI = 3.14;
	
	public Circle(int r){
		this.r = r;
	}
	public double getArea() {
		return r * r * PI;
	}
}
