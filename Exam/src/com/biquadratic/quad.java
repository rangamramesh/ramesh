package com.biquadratic;

public class quad {
	private double x1, x2, x3, x4;

	public quad() {
		x1 = Double.NaN;
		x2 = Double.NaN;
		x3 = Double.NaN;
		x4 = Double.NaN;
	}

	public quad(double newX1, double newX2, double newX3, double newX4) {
		x1 = newX1;
		x2 = newX2;
		x3 = newX3;
		x4 = newX4;
	}

	public void setQuad(double newX1, double newX2, double newX3, double newX4) {
		x1 = newX1;
		x2 = newX2;
		x3 = newX3;
		x4 = newX4;
	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}

	public double getX3() {
		return x3;
	}

	public double getX4() {
		return x4;
	}
}
