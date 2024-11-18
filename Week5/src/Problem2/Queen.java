package Problem2;

public class Queen extends Piece{
	public Queen(Position a) {
		super(a);
	}
	// королева
	@Override
	public boolean isLegalMove(Position b) {
		Bishop s = new Bishop(a);
		Rook r = new Rook(a);
		return s.isLegalMove(b) ||  r.isLegalMove(b);
//		return (a.getX() == b.getX() || a.getY() == b.getY()) || 
//				((a.getX() + a.getY() == b.getX() + b.getY()) || (a.getX() - a.getY() == b.getX() - b.getY()) );
//	
	}
	public String toString() {
		return "[Queen] " + super.toString();
	}
}
