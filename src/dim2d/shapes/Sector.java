package dim2d.shapes;

import base.Angle;
import dim2d.Point;

public class Sector extends Shape {

	private final double radius;
	private final Angle theta;

	public Sector(double radius, Angle theta) {
		this(new Point(), radius, theta);
	}

	public Sector(Point origin, double radius, Angle theta) {
		super(origin);
		this.radius = radius;
		this.theta = theta;
	}

	public double getRadius() {
		return radius;
	}

	public Angle getTheta() {
		return theta;
	}

	public double getArea() {
		Circle c = new Circle(getOrigin(), getRadius());
		return c.getArea() * getTheta().degrees() / 360;
	}

	public double getPerimeter() {
		Circle c = new Circle(getOrigin(), getRadius());
		return c.getPerimeter() * getTheta().degrees() / 360 + 2 * getRadius();
	}

	public String toString() {
		return "Sector(x=" + getOrigin().getX() + ",y=" + getOrigin().getY() + ",r=" + getRadius() + ",theta="
				+ getTheta() + ")";
	}

	public String debugString() {
		return toString() + "[area=" + getArea() + ",perimeter=" + getPerimeter() + "]";
	}

}
