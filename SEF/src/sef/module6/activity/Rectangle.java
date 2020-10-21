
package sef.module6.activity;


public class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	
	public Rectangle() {		
	}
	
	public Rectangle(double length, double breadth, String color) {
		this.length = length;
		this.breadth = breadth;
		this.color = color;
	}
	
	@Override
	public double calculateArea() {
		double area = length * breadth;
		return area;
	}
	
	@Override
	public double calculatePerimeter() {
		double perimeter = 2* calculateArea();
		return perimeter;
	}
	
}
	
	
	
