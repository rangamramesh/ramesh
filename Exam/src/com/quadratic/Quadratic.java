package com.quadratic;

public class Quadratic {
	public Pair solveQuadratic(double a, double b, double c) {

		double discriminant = b * b - 4 * a * c;
		if (discriminant < 0)
			return new Pair();
		else
			return new Pair((-b + Math.sqrt(discriminant)) / (2 * a), (-b - Math.sqrt(discriminant)) / (2 * a));
	}

}
