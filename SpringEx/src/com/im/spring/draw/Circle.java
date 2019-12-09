package com.im.spring.draw;

public class Circle implements Shape {
	private double radius;
	private Point center;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		System.out.println("Calling Constructor"+ radius);
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
}
