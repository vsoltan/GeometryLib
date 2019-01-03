package dim3d;
import dim2d.Point;

public class Point3D extends Point {

	private final double z;

	public Point3D() {
		this(0, 0, 0);
	}

	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "Point3D(x=" + getX() + ",y=" + getY() + ",z=" + getZ() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point3D) {
			Point3D pt = (Point3D) obj;
			return super.equals(pt) && getZ() == pt.getZ();
		}
		return false;
	}

}
