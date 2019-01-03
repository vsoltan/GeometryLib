package tests.dim2d;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dim2d.Point;
import dim2d.Vector;
import tests.MathConstants;

public class VectorTest {

	@Test
	public void testVectorDefaultCtor() {
		Vector r = new Vector();
		assertEquals(new Point(), r.getComponents());
	}

	@Test
	public void testVectorCtor() {
		Vector r = new Vector(100, 200);
		assertEquals(new Point(100, 200), r.getComponents());
	}

	@Test
	public void testGetComponents() {
		Vector r = new Vector(100, 200);
		assertEquals(new Point(100, 200), r.getComponents());
	}

	@Test
	public void testGetXComponent() {
		Vector r = new Vector(100, 200);
		assertEquals(100, r.getXComponent(), MathConstants.EPSILON);
	}

	@Test
	public void testGetYComponent() {
		Vector r = new Vector(100, 200);
		assertEquals(200, r.getYComponent(), MathConstants.EPSILON);
	}

	@Test
	public void testToString() {
		Vector v = new Vector(100, 200);
		assertEquals("Vector(x_comp=100.0,y_comp=200.0)", v.toString());
	}

	@Test
	public void testEquiality() {
		Vector v = new Vector(100, 200);
		assertEquals(new Vector(100, 200), v);
	}

	@Test
	public void testAddition() {
		Vector v1 = new Vector(100, 200);
		Vector v2 = new Vector(-30, 20);
		assertEquals(new Vector(70, 220), v1.add(v2));
	}

	@Test
	public void testScaling() {
		Vector v1 = new Vector(100, 200);
		assertEquals(new Vector(200, 400), v1.scale(2));
	}

}
