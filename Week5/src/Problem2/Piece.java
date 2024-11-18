package Problem2;

public abstract class Piece {
	Position a;
	
	public Piece(Position a) {
		this.a = a;
	}
	public abstract boolean isLegalMove(Position b);
	
	public Position getPosition() {
		return a;
	}
	public String toString() {
		return "Piece[" + "Position: " + a + "]";
	}
}
