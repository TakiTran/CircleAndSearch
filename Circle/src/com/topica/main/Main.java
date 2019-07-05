package com.topica.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.topica.model.Circle;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<Circle> circles = new ArrayList<Circle>();
		for (int i = 0; i < 100; i++) {
			Circle circle = new Circle();
			circles.add(circle);
		}
		Collections.sort(circles);
		for (Circle circle : circles) {
			System.out.println(circle.getRadius());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("=========> Area: ");
		double area = 0;
		boolean check = false;
		while (!check) {
			try {
				area = scanner.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.print("Error: input not is number.");
				System.out.print("\n=========> Area: ");
				scanner.nextLine();
			}
		}

		double radius = Math.sqrt(area / Math.PI);
		double min = Math.abs(circles.get(0).getRadius() - radius);
		int index = 0;
		String stringIndex = index + " ";
		for (int i = 1; i < circles.size(); i++) {
			if (min > Math.abs(circles.get(i).getRadius() - radius)) {
				min = Math.abs(circles.get(i).getRadius() - radius);
				index = i;
				stringIndex = index + " ";
			} else if (min == Math.abs(circles.get(i).getRadius() - radius)) {
				stringIndex += i + " ";
			}
		}
		System.out.println("index = " + stringIndex);

	}

}
