
public class Vector implements MathConstants {

	private final Point components;

	public Vector() {
		this(0, 0);
	}

	public Vector(int x, int y) {
		this(x * 1.0, y * 1.0);
	}

	public Vector(double x, double y) {
		this.components = new Point(x, y);
	}

	public Point getComponents() {
		return components;
	}

	public double getXComponent() {
		return getComponents().getX();
	}

	public double getYComponent() {
		return getComponents().getY();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vector) {
			Vector v = (Vector) obj;
			return getComponents().equals(v.getComponents());
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vector(x_comp=" + getXComponent() + ",y_comp=" + getYComponent() + ")";
	}

	public Vector add(Vector v) {
		return new Vector(getXComponent() + v.getXComponent(), getYComponent() + v.getYComponent());
	}

	public Vector scale(double scalar) {
		return new Vector(getXComponent() * scalar, getYComponent() * scalar);
	}
}
