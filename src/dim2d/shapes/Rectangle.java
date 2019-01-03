package dim2d.shapes;

import dim2d.Point;
import dim2d.Size;
import dim2d.Vector;

public class Rectangle extends Shape {
	private final Size size;

	public double getLeft() {
		return getOrigin().getX();
	}

	public double getTop() {
		return getOrigin().getY();
	}

	public double getWidth() {
		return getSize().getWidth();
	}

	public double getHeight() {
		return getSize().getHeight();
	}

	public double getRight() {
		return getLeft() + getWidth();
	}

	public double getBottom() {
		return getTop() + getHeight();

	}

	public Rectangle() {
		this(new Point(), new Size());
	}

	public Rectangle(Point origin, Size size) {
		super(origin);
		this.size = size;
	}

	public Rectangle(int x, int y, int width, int height) {
		this(x * 1.0, y * 1.0, width * 1.0, height * 1.0);
	}

	public Rectangle(double x, double y, double width, double height) {
		this(new Point(x, y), new Size(width, height));
	}

	@Override
	public String toString() {
		return "Rectangle(x=" + getLeft() + ",y=" + getTop() + ",w=" + getWidth() + ",h=" + getHeight() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return super.equals(r) && getSize().equals(r.getSize());
		}
		return false;
	}

	public Rectangle Intersect(Rectangle other) {
		double x, y, w, h;
		x = Math.max(this.getLeft(), other.getLeft());
		w = Math.min(this.getRight(), other.getRight()) - x;
		y = Math.max(this.getTop(), other.getTop());
		h = Math.min(this.getBottom(), other.getBottom()) - y;
		if (w <= 0 || h <= 0) {
			return new Rectangle(new Point(), new Size());
		}
		return new Rectangle(new Point(x, y), new Size(w, h));
	}

	public static void main(String[] args) {
		// Make first rect.
		Rectangle r1 = new Rectangle(new Point(), new Size(100, 200));
		System.out.println("r1: " + r1.toString());
		// Make second rect.
		Rectangle r2 = new Rectangle(new Point(10, 10), new Size(200, 300));
		System.out.println("r2: " + r2.toString());
		// Compute intersection.
		Rectangle intersection = r1.Intersect(r2);
		System.out.println("interesection: " + intersection.toString());
		// Venn diagram outside area.
		System.out.println("Outside area of Venn diagram: " + (r1.getArea() + r2.getArea() - intersection.getArea()));
	}

	public double getArea() {
		return getWidth() * getHeight();
	}

	public double getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

	public Rectangle move(Vector v) {
		return new Rectangle(getOrigin().move(v), getSize());
	}

	public Size getSize() {
		return size;
	}

}
