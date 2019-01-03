package tests.dim2d.shapes;
import org.junit.Test;

import base.Angle;
import dim2d.shapes.Sector;

import static org.junit.Assert.assertEquals;

public class SectorTest {
	
	private static final double EPSILON = 1e-10;
	
	@Test
	public void getArea() {
		Sector s = new Sector(10, Angle.fromDegrees(30));
		assertEquals(26.17993877991494, s.getArea(), EPSILON);
	}
	
	@Test
	public void getPerimeter() {
		Sector s = new Sector(10, Angle.fromRadians(Math.PI / 6));
		assertEquals(25.23598775598299, s.getPerimeter(), EPSILON);
	}
}
