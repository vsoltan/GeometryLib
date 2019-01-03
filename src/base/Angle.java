package base;
public class Angle{

	public enum Type {
		DEGREE, RADIANS
	}

	private double value;
	private Type type;

	public Angle(double value, Type type) {
		this.value = value;
		this.type = type;
	}
	
	public static Angle fromDegrees(double degrees) {
		return new Angle(degrees, Type.DEGREE);
	}

	public static Angle fromRadians(double radians) {
		return new Angle(radians, Type.RADIANS);
	}

	public double radians() {
		return type == Type.RADIANS ? value : degreesToRadians(value);
	}

	public double degrees() {
		return type == Type.RADIANS ? radiansToDegrees(value) : value;
	}

	public static double radiansToDegrees(double radians) {
		return radians * 180 / Math.PI;
	}

	public static double degreesToRadians(double degrees) {
		return degrees * Math.PI / 180;
	}
	
	@Override
	public String toString() {
		return "Angle(rad=" + radians() +",deg=" + degrees() + ")";
	}

	public double getValue() {
		return value;
	}
	
	public Type getType() {
		return type;
	}

}
