import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VennDiagramTest {

	@Test
	public void test() {
		Rectangle r1 = new Rectangle(new Point(10, 20), new Size(100, 200));
		Rectangle r2 = new Rectangle(new Point(80, 200), new Size(50, 50));
		assertEquals(21900, VennDiagram.outsideArea(r1, r2), MathConstants.EPSILON);
	}

}
