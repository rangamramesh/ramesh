package com.quadratic;

public class Pair {
	private double x1, x2;

	public Pair() {
		x1 = Double.NaN;
		x2 = Double.NaN;
	}

	public Pair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
		setPair(x1, x2);
	}

	public void setPair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
	}

	public double getX() {
		return x1;
	}

	public double getY() {
		return x2;
	}
}