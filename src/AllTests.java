import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	PointTest.class,
	Point3DTest.class,
	RectangleTest.class,
	ShapeTest.class,
	SizeTest.class,
	VectorTest.class,
	VennDiagramTest.class
})
public class AllTests {

}
