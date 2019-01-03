package dim2d;

public class Point {

	private final double x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this(x * 1.0, y * 1.0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pt = (Point) obj;
			return getX() == pt.getX() && getY() == pt.getY();
		}
		return false;
	}

	@Override
	public String toString() {
		return "Point(x=" + getX() + ",y=" + getY() + ")";
	}

	public Point move(Vector v) {
		return new Point(getX() + v.getXComponent(), getY() + v.getYComponent());
	}
}
