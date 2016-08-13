
public class Shape {

	private final Point origin;

	public Shape() {
		this(new Point());
	}

	public Shape(double x, double y) {
		this(new Point(x, y));
	}

	public Shape(Point origin) {
		this.origin = origin;
	}

	public Point getOrigin() {
		return origin;
	}

	@Override
	public String toString() {
		return "Shape(x=" + getOrigin().getX() + ",y=" + getOrigin().getY() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Shape) {
			Shape shape = (Shape) obj;
			return getOrigin().equals(shape.getOrigin());
		}
		return false;
	}

}
