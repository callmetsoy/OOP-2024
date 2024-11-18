package Problem2;

public class Test {
    public static void main(String[] args) {
        // Test Position
        Position startPosition = new Position('A', 1);
        Position targetPosition1 = new Position('A', 3);
        Position targetPosition2 = new Position('C', 1);
        Position targetPosition3 = new Position('B', 2);

        // Test Rook
        Rook rook = new Rook(startPosition);
        System.out.println(rook);
        System.out.println("Rook move to (A,3): " + rook.isLegalMove(targetPosition1)); 
        System.out.println("Rook move to (C,1): " + rook.isLegalMove(targetPosition2)); 
        System.out.println("Rook move to (B,2): " + rook.isLegalMove(targetPosition3)); 

        // Test King
        King king = new King(new Position('D', 4));
        System.out.println(king);
        System.out.println("King move to (C,3): " + king.isLegalMove(new Position('C', 3))); 
        System.out.println("King move to (E,5): " + king.isLegalMove(new Position('E', 5))); 
        System.out.println("King move to (F,6): " + king.isLegalMove(new Position('F', 6))); 

        // Test Queen
        Queen queen = new Queen(new Position('D', 4));
        System.out.println(queen);
        System.out.println("Queen move to (D,6): " + queen.isLegalMove(new Position('D', 6))); 
        System.out.println("Queen move to (F,6): " + queen.isLegalMove(new Position('F', 6)));  
        System.out.println("Queen move to (A,1): " + queen.isLegalMove(new Position('A', 1))); 
        // Test Bishop
        Bishop bishop = new Bishop(new Position('D', 4));
        System.out.println(bishop);
        System.out.println("Bishop move to (F,6): " + bishop.isLegalMove(new Position('F', 6))); 
        System.out.println("Bishop move to (E,5): " + bishop.isLegalMove(new Position('E', 5))); 
        System.out.println("Bishop move to (E,4): " + bishop.isLegalMove(new Position('E', 4))); 

        // Test Knight
        Knight knight = new Knight(new Position('D', 4));
        System.out.println(knight);
        System.out.println("Knight move to (F,5): " + knight.isLegalMove(new Position('F', 5))); 
        System.out.println("Knight move to (E,6): " + knight.isLegalMove(new Position('E', 6))); 
        System.out.println("Knight move to (D,6): " + knight.isLegalMove(new Position('D', 6))); 

        // Test Pawn
        Pawn pawn = new Pawn(new Position('D', 2));
        System.out.println(pawn);
        System.out.println("Pawn move to (E,3): " + pawn.isLegalMove(new Position('E', 2))); 
        System.out.println("Pawn move to (D,4): " + pawn.isLegalMove(new Position('D', 4))); 
        System.out.println("Pawn move to (E,3): " + pawn.isLegalMove(new Position('E', 3))); 
    }
}
