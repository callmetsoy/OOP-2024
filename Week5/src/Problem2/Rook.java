package Problem2;

public class Rook extends Piece {
	public Rook(Position a) {
		super(a);
	}
	// ладья
	@Override
	public boolean isLegalMove(Position b) {
		return a.getX() == b.getX() || a.getY() == b.getY();
	}
	public String toString() {
		return "[Rook] " + super.toString();
	}
}
