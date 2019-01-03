package tests.dim2d;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dim2d.Point;
import dim2d.Vector;
import tests.MathConstants;

public class PointTest {
	
	@Test
	public void testPointDefaultCtor() {
		Point pt = new Point();
		assertEquals(0, pt.getX(), MathConstants.EPSILON);
		assertEquals(0, pt.getY(), MathConstants.EPSILON);
	}

	@Test
	public void testPointCtor() {
		Point pt = new Point(100, 200);
		assertEquals(100, pt.getX(), MathConstants.EPSILON);
		assertEquals(200, pt.getY(), MathConstants.EPSILON);
	}

	@Test
	public void testGetX() {
		Point pt = new Point(100, 200);
		assertEquals(100, pt.getX(), MathConstants.EPSILON);
	}

	@Test
	public void testGetY() {
		Point pt = new Point(100, 200);
		assertEquals(200, pt.getY(), MathConstants.EPSILON);
	}

	@Test
	public void testEquiality() {
		Point pt = new Point(100, 200);
		assertEquals(new Point(100, 200), pt);
	}

	@Test
	public void testToString() {
		Point pt = new Point(100, 200);
		assertEquals("Point(x=100.0,y=200.0)", pt.toString());
	}

	@Test
	public void testMove() {
		Point pt = new Point(100, 200);
		assertEquals(new Point(120, 230), pt.move(new Vector(20, 30)));
	}

}
