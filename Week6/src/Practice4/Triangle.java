package Practice4;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
    }

    public Triangle(int p, Color c, double base, double height) {
        super(p, c);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        if (color == Color.BLACK) {
            System.out.println("▲");
        } 
        if (color == Color.RED) {
        	System.out.println("△");
        }
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "], " + super.toString();
    }
}