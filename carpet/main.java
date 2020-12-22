package com.carpet;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Enter the room length, width and the cost of the carpet per Square feet : ");
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double cost = sc.nextDouble();
		roomCarpet rc = new roomCarpet(length, width, cost);
		System.out.println("Total cost is : " + rc.totalCost());

	}

}
