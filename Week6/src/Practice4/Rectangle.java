package Practice4;

public class Rectangle extends Shape {
	private double width;
	private double height;
	public Rectangle(int p, Color c, int w, int h) {
		super(p, c);
		this.width = w;
		this.height = h;
	}
	public double getWidth() {
	        return width;
	}

	public void setWidth(double width) {
	        this.width = width;
	}

	public double getHeight() {
	        return height;
	}

	public void setHeight(double h) {
	        this.height = h;
	}
	 @Override
	    public void draw() {
	        super.draw();
	        if (color == Color.BLACK) {
	            System.out.println("▬");
	        }else if (color == Color.RED) {
	        	System.out.println("▭");
	        }
	    }

	 @Override
	    public String toString() {
	        return "Rectangle [width=" + width + ", height=" + height + "], " + super.toString();
	    }
	
}
