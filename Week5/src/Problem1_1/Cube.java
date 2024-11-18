package Problem1_1;

public class Cube extends Shape3D {
	private double edge;
	public Cube(double e) {
		this.edge = e;
	}
	@Override
	public double volume() {
		return edge * edge * edge;
	}
	@Override
	public double surfaceArea() {
		return 6 * edge * edge; 
	}
}
