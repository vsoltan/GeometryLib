package tests.base;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import base.Angle;

public class AngleTest {

	private static final double EPSILON = 1e-10;

	@Test
	public void angleValue() {
		Angle theta = new Angle(Math.PI, Angle.Type.RADIANS);
		assertEquals(Math.PI, theta.getValue(), EPSILON);
	}

	@Test
	public void fromRadians() {
		Angle theta = Angle.fromRadians(Math.PI);
		assertEquals(Math.PI, theta.getValue(), EPSILON);
		assertEquals(Angle.Type.RADIANS, theta.getType());
	}

	@Test
	public void fromDegrees() {
		Angle theta = Angle.fromDegrees(30);
		assertEquals(30, theta.getValue(), EPSILON);
		assertEquals(Angle.Type.DEGREE, theta.getType());
	}

	@Test
	public void angleType() {
		Angle theta = new Angle(Math.PI, Angle.Type.RADIANS);
		assertEquals(Angle.Type.RADIANS, theta.getType());
	}

	@Test
	public void radians() {
		Angle theta = Angle.fromDegrees(45);
		assertEquals(Math.PI / 4, theta.radians(), EPSILON);
	}

	@Test
	public void degrees() {
		Angle theta = Angle.fromRadians(Math.PI / 6);
		assertEquals(30.0, theta.degrees(), EPSILON);
	}

	@Test
	public void radiansToDegrees() {
		assertEquals(36.0, Angle.radiansToDegrees(Math.PI / 5), EPSILON);
	}

	@Test
	public void degreesToRadians() {
		assertEquals(Math.PI / 8, Angle.degreesToRadians(22.5), EPSILON);
	}

	@Test
	public void toStringText() {
		Angle theta = Angle.fromDegrees(45);
		assertEquals("Angle(rad=0.7853981633974483,deg=45.0)", theta.toString());
	}

}
