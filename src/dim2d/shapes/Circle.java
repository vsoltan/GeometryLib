package dim2d.shapes;

import dim2d.Point;

public class Circle extends Shape {

	private final double radius;

	public Circle(double radius) {
		this(new Point(), radius);
	}

	public Circle(Point origin, double radius) {
		super(origin);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getDiameter() {
		return radius * 2;
	}

	public double getPerimeter() {
		return getCircumference();
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "Circle(x=" + getOrigin().getX() + ",y=" + getOrigin().getY() + ",r=" + getRadius() + ")";
	}

	public String debugString() {
		return toString() + "[area=" + getArea() + ",circ=" + getCircumference() + "]";
	}

}