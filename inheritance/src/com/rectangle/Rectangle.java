package com.rectangle;

public class Rectangle {
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
}
