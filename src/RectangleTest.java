import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testDefaultRectangleCtor() {
		Rectangle r = new Rectangle();
		assertEquals(new Point(), r.getOrigin());
		assertEquals(new Size(), r.getSize());
	}

	@Test
	public void testRectangleCtor() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(10, r.getLeft(), MathConstants.EPSILON);
		assertEquals(20, r.getTop(), MathConstants.EPSILON);
		assertEquals(100, r.getWidth(), MathConstants.EPSILON);
		assertEquals(200, r.getHeight(), MathConstants.EPSILON);
	}

	@Test
	public void testGetOrigin() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Point(10, 20), r.getOrigin());
	}

	@Test
	public void testGetSize() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Size(100, 200), r.getSize());
	}

	@Test
	public void testToString() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals("Rectangle(x=10.0,y=20.0,w=100.0,h=200.0)", r.toString());
	}

	@Test
	public void testGetR() {
		Rectangle r = new Rectangle(new Point(-10, 20), new Size(100, 200));
		assertEquals(90, r.getRight(), MathConstants.EPSILON);
	}

	@Test
	public void testGetB() {
		Rectangle r = new Rectangle(new Point(10, -20), new Size(100, 200));
		assertEquals(180, r.getBottom(), MathConstants.EPSILON);
	}

	@Test
	public void testIntersectTopRight() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(90, 20, 20, 40), r.Intersect(new Rectangle(90, 0, 70, 60)));
	}

	@Test
	public void testIntersectTopLeft() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(10, 20, 20, 40), r.Intersect(new Rectangle(0, 0, 30, 60)));
	}

	@Test
	public void testIntersectBottomLeft() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(10, 200, 20, 20), r.Intersect(new Rectangle(0, 200, 30, 50)));
	}

	@Test
	public void testIntersectBottomRight() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(80, 200, 30, 20), r.Intersect(new Rectangle(80, 200, 50, 50)));
	}

	@Test
	public void testIntersectSecondInsideFirst() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(20, 30, 50, 60), r.Intersect(new Rectangle(20, 30, 50, 60)));
	}

	@Test
	public void testIntersectFirstInsideSecond() {
		Rectangle r = new Rectangle(new Point(20, 30), new Size(50, 60));
		assertEquals(new Rectangle(20, 30, 50, 60), r.Intersect(new Rectangle(10, 20, 100, 200)));
	}

	@Test
	public void testDoesNotIntersectTopRight() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(), r.Intersect(new Rectangle(120, 0, 10, 10)));
	}

	@Test
	public void testDoesNotIntersectPartialTopRight() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(), r.Intersect(new Rectangle(105, 0, 10, 10)));
	}

	@Test
	public void testEquiality() {
		Rectangle r = new Rectangle(10, 20, 100, 200);
		assertEquals(new Rectangle(10, 20, 100, 200), r);
	}

	@Test
	public void testDoesNotIntersectTop() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(), r.Intersect(new Rectangle(50, 0, 10, 10)));
	}

	@Test
	public void testDoesNotIntersectTopLeft() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(new Rectangle(), r.Intersect(new Rectangle(0, 0, 7, 7)));
	}

	@Test
	public void testDoesNotIntersectPartialTopLeft() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		Rectangle t = new Rectangle(new Point(5, 0), new Size(10, 10));
		assertEquals(new Rectangle(), r.Intersect(t));
	}

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(20000, r.getArea(), MathConstants.EPSILON);
	}

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		assertEquals(600, r.getPerimeter(), MathConstants.EPSILON);
	}

	@Test
	public void testMoving() {
		Rectangle r = new Rectangle(new Point(10, 20), new Size(100, 200));
		Vector v = new Vector(10, 20);
		assertEquals(new Rectangle(20, 40, 100, 200), r.move(v));
	}
}
