package Problem2;

public class Bishop extends Piece{
	public Bishop(Position a) {
		super(a);
	}
	// слон
	public boolean isLegalMove(Position b) {	
	return (a.getX() + a.getY() == b.getX() + b.getY()) || (a.getX() - a.getY() == b.getX() - b.getY());
	}
	public String toString() {
		return "[Bishop] " + super.toString();
	}
}
