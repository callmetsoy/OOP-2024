package Practice4;

public class Circle extends Shape{
	private double radius;
	
	public Circle(int p, Color c, double r) {
		super(p, c);
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int r) {
		this.radius = r;
	}
	@Override
    public void draw() {
        super.draw();
        if (color == Color.BLACK) {
            System.out.println("●");
        }
        if(color == Color.RED) { 
        	System.out.println("◌");
        	}
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "], " + super.toString();
    }
	
}
