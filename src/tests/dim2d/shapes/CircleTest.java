package tests.dim2d.shapes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dim2d.Point;
import dim2d.shapes.Circle;

public class CircleTest {

	private static final double EPSILON = 1e-10;

	@Test
	public void getRadius() {
		Circle c = new Circle(10);
		assertEquals(10, c.getRadius(), EPSILON);
	}

	@Test
	public void getOriginX() {
		Circle c = new Circle(new Point(1, 2), 10);
		assertEquals(1, c.getOrigin().getX(), EPSILON);
	}

	@Test
	public void getOriginY() {
		Circle c = new Circle(new Point(1, 2), 10);
		assertEquals(2, c.getOrigin().getY(), EPSILON);
	}

	@Test
	public void getArea() {
		Circle c = new Circle(10);
		assertEquals(314.1592653589793, c.getArea(), EPSILON);
	}

	@Test
	public void getDiameter() {
		Circle c = new Circle(10);
		assertEquals(20, c.getDiameter(), EPSILON);
	}

	@Test
	public void getCircumference() {
		Circle c = new Circle(10);
		assertEquals(62.83185307179586, c.getCircumference(), EPSILON);
	}

	@Test
	public void toStringText() {
		Circle c = new Circle(new Point(1, 2), 10);
		assertEquals("Circle(x=1.0,y=2.0,r=10.0)", c.toString());
	}

	@Test
	public void debugStringText() {
		Circle c = new Circle(new Point(1, 2), 10);
		assertEquals("Circle(x=1.0,y=2.0,r=10.0)[area=314.1592653589793,circ=62.83185307179586]", c.debugString());
	}

}
