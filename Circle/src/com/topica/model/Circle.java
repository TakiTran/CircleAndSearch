package com.topica.model;

import java.util.Random;

public class Circle implements Comparable<Circle>{
	private int radius;

	public Circle() {
		Random random = new Random();
		this.radius = 0;
		while(radius == 0) {
			this.radius = random.nextInt(100);
		}
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public int compareTo(Circle circle) {
		return (this.radius - circle.radius);
	}
	
}
