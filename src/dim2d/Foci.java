package dim2d;

public class Foci {
	double focus1, focus2;
	public double x1, x2, y1, y2;

	public Foci() {
		this(0,0,0,0);
	}

	public Foci(int x1, int y1, int x2, int y2) {
		this.focus1 = Point(x1, y1);
		this.focus2 = Point(x2, y2);
	}

	private int Point(double x, double y) {
		return Point(x*1.0, y*1.0);
	}

	public Object getFocus1(int x1, int y1, int x2, int y2) {
		return Point(x1,y1);
	}
    
	
}
