package Problem2;

public class Knight extends Piece{
	public Knight(Position a) {
		super(a);
	}
	//конь 
	@Override
	public boolean isLegalMove(Position b) {
		return Math.abs((a.getX() - b.getX()) * (a.getY() - b.getY())) == 2;
	}
	public String toString() {
		return "[Knight] " + super.toString();
	}
}
