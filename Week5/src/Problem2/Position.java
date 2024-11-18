package Problem2;


public class Position {
	private int x;
	private char y;
	
	public Position(char y, int x) {
		if(x >= 1 && x <= 8) {
			if(y >= 'A' && y <= 'H') {
				this.x = x;
			    this.y = y;
		}
			}
		else {
			System.out.println("Error: check input please");
		}
	}
	public int getX(){
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(char y) {
		this.y = y;
	}
	public String toString() {
		return y + ":" + x;
	}
}
