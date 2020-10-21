package sef.module6.activity;

public class Circle extends Shape {
	private double radius;
	
	public void setLength(double radius) {
		this.radius = radius;
	}
	public double getLength() {
		return radius;
	}
	
	public Circle() {		
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public double calculateArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	@Override
	public double calculatePerimeter() {
		double perimeter = 2* Math.PI * radius;
		return perimeter;
	}
	
}
