package Practice4;

public abstract class Shape {
	private int position;
	Color color;
	public Shape(int p, Color c) {
		this.position = p;
		this.color = c;
	}
	public Shape() {
		
	}
	public int getPos() {
		return position;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color c) {
		this.color = c;
	}
	public void setPos(int p) {
		this.position = p;
	}
	public void draw() {
		System.out.print(" ".repeat(position));
	}
	
	public String toString() {
		return "Position: " + position + " Color: " + color;
	}
}
