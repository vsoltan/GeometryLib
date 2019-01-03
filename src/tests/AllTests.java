package tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.dim2d.PointTest;
import tests.dim2d.SizeTest;
import tests.dim2d.VectorTest;
import tests.dim2d.shapes.CircleTest;
import tests.dim2d.shapes.RectangleTest;
import tests.dim2d.shapes.SectorTest;
import tests.dim2d.shapes.ShapeTest;
import tests.dim2d.util.VennDiagramTest;
import tests.dim3d.Point3DTest;


@RunWith(Suite.class)
@SuiteClasses({
	CircleTest.class,
	PointTest.class,
	Point3DTest.class,
	RectangleTest.class,
	SectorTest.class,
	ShapeTest.class,
	SizeTest.class,
	VectorTest.class,
	VennDiagramTest.class

})

public class AllTests {
}
