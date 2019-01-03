package dim2d.util;

import dim2d.shapes.Rectangle;

public class VennDiagram {

	public static double outsideArea(Rectangle r1, Rectangle r2) {
		Rectangle intersection = r1.Intersect(r2);
		return r1.getArea() + r2.getArea() - intersection.getArea();
	}

}
