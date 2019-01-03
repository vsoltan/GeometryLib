package tests.dim3d;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import dim3d.Point3D;
import tests.MathConstants;

public class Point3DTest {

	@Test
	public void testPoint3DDefaultCtor() {
		Point3D pt = new Point3D();
		assertEquals(0, pt.getX(), MathConstants.EPSILON);
		assertEquals(0, pt.getY(), MathConstants.EPSILON);
		assertEquals(0, pt.getZ(), MathConstants.EPSILON);
	}

	@Test
	public void testPoint3DCtor() {
		Point3D pt = new Point3D(100, 200, 300);
		assertEquals(100, pt.getX(), MathConstants.EPSILON);
		assertEquals(200, pt.getY(), MathConstants.EPSILON);
		assertEquals(300, pt.getZ(), MathConstants.EPSILON);
	}

	@Test
	public void testGetZ() {
		Point3D pt = new Point3D(100, 200, 300);
		assertEquals(300, pt.getZ(), MathConstants.EPSILON);
	}

	@Test
	public void testToString() {
		Point3D pt = new Point3D(100, 200, 300);
		assertEquals("Point3D(x=100.0,y=200.0,z=300.0)", pt.toString());
	}

	@Test
	public void testEquiality() {
		Point3D pt = new Point3D(100, 200, 300);
		assertEquals(new Point3D(100, 200, 300), pt);
	}

	@Test
	public void testInequiality() {
		Point3D pt = new Point3D(100, 200, 400);
		assertNotEquals(new Point3D(100, 200, 300), pt);
	}

}
