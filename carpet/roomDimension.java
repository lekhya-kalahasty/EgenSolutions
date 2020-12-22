package com.carpet;

public class roomDimension {
	double length;
	double width;
	public roomDimension(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double totalArea() {
		return (length * width);
	}
}
