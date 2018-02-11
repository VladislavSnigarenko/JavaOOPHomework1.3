package Task_3;

public class Vector3D {

	private double a; 
	private double b; 
	private double c;
	
	public Vector3D(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Vector3D() {
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public Vector3D add(Vector3D vectorSecond) {
		return new Vector3D(a + vectorSecond.a, b + vectorSecond.b,
				c + vectorSecond.c);
	}

	public double compositionScalar(Vector3D vectorSecond) {
		return a * vectorSecond.a + b * vectorSecond.b + c * vectorSecond.c;
	}

	public Vector3D compositionVector(Vector3D vectorSecond) {
		return new Vector3D(
				b * vectorSecond.c - vectorSecond.b * c,
				a * vectorSecond.c - vectorSecond.a * c,
				a * vectorSecond.b - vectorSecond.a * b);
	}

	@Override
	public String toString() {
		return "Vector3D [a = " + a + ", b = " + b + ", c = " + c + "]";
	}

}
