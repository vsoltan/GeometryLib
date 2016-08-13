import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SizeTest {

	@Test
	public void testSizeDefaultCtor() {
		Size s = new Size();
		assertEquals(0, s.getWidth(), MathConstants.EPSILON);
		assertEquals(0, s.getHeight(), MathConstants.EPSILON);
	}

	@Test
	public void testSizeCtor() {
		Size s = new Size(100, 200);
		assertEquals(100, s.getWidth(), MathConstants.EPSILON);
		assertEquals(200, s.getHeight(), MathConstants.EPSILON);
	}

	@Test
	public void testGetWidth() {
		Size s = new Size(100, 200);
		assertEquals(100, s.getWidth(), MathConstants.EPSILON);
	}

	@Test
	public void testGetHeight() {
		Size s = new Size(100, 200);
		assertEquals(200, s.getHeight(), MathConstants.EPSILON);
	}

	@Test
	public void testEquiality() {
		Size s = new Size(100, 200);
		assertEquals(new Size(100, 200), s);
	}

}
