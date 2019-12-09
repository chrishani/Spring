package com.im.spring.draw;

public class Triangle implements Shape{
	private double height;
	private double width;
	
	public double getArea() {
		return 0.5 *( height * width);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
}
