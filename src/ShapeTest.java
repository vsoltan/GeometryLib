import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void testDefaultShapeCtor() {
		Shape shape = new Shape();
		assertEquals(new Point(), shape.getOrigin());
	}

	@Test
	public void testShapeCtor() {
		Shape shape = new Shape(new Point(10, 20));
		assertEquals(new Point(10, 20), shape.getOrigin());
	}

	@Test
	public void testGetOrigin() {
		Shape shape = new Shape(new Point(10, 20));
		assertEquals(new Point(10, 20), shape.getOrigin());
	}

	@Test
	public void testToString() {
		Shape shape = new Shape(new Point(10, 20));
		assertEquals("Shape(x=10.0,y=20.0)", shape.toString());
	}

	@Test
	public void testEquiality() {
		Shape shape = new Shape(new Point(10, 20));
		assertEquals(new Shape(10, 20), shape);
	}

}
