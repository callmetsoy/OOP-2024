package Problem2;

public class King extends Piece{
	public King(Position a) {
		super(a);
	}
	// король
	@Override
	public boolean isLegalMove(Position b) {
		return Math.abs(a.getX() - b.getX()) <= 1 && Math.abs(a.getY() - b.getY()) <= 1;
 	}
	public String toString() {
		return "[KING] " + super.toString();
	}
}	
