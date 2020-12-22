package com.carpet;

public class roomCarpet extends roomDimension {
	double cost;

	public roomCarpet(double length, double width, double cost) {
		super(length, width);
		this.cost = cost;
	}
	public double totalCost() {
		double area = this.totalArea();
		return (area * cost);
	}
}
