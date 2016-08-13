
public class Size {
	private final double width, height;

	public Size() {
		this(0, 0);
	}

	public Size(int width, int height) {
		this(width * 1.0, height * 1.0);
	}

	public Size(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Size) {
			Size s = (Size) obj;
			return getWidth() == s.getWidth() && getHeight() == s.getHeight();
		}
		return false;
	}
}
