package main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import piece.Piece;
import piece.Pawn;
import piece.Bishop;
import piece.King;
import piece.Queen;
import piece.Knight;
import piece.Rook;

public class GamePanel extends JPanel implements Runnable{
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	Board board = new Board();
	Mouse mouse = new Mouse();
	final int FPS = 60;
	Thread gameThread;
	
	//PIECES
	public static ArrayList <Piece> pieces = new ArrayList<>();
	public static ArrayList <Piece> simPieces = new ArrayList<>();
	Piece activeP;
	
	
	//COLOR
	public static final int WHITE = 0;
	public static final int BLACK = 1;
	int currentColor = BLACK;
	
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		addMouseMotionListener(mouse);
		addMouseListener(mouse);
		
		setPieces();
		copyPieces(pieces, simPieces);
	}
	
	public void launchGame() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	public void setPieces() {
		// WHITE TEAM
		pieces.add(new Pawn(WHITE,0,6));
		pieces.add(new Pawn(WHITE,1,6));
		pieces.add(new Pawn(WHITE,2,6));
		pieces.add(new Pawn(WHITE,3,6));
		pieces.add(new Pawn(WHITE,4,6));
		pieces.add(new Pawn(WHITE,5,6));
		pieces.add(new Pawn(WHITE,6,6));
		pieces.add(new Pawn(WHITE,7,6));
		pieces.add(new Rook(WHITE,0,7));
		pieces.add(new Rook(WHITE,7,7));
		pieces.add(new Knight(WHITE,1,7));
		pieces.add(new Knight(WHITE,6,7));
		pieces.add(new Bishop(WHITE,2,7));
		pieces.add(new Bishop(WHITE,5,7));
		pieces.add(new Queen(WHITE,3,7));
		pieces.add(new King(WHITE,4,7));
		
		//BLACK TEAM
		pieces.add(new Pawn(BLACK,0,1));
		pieces.add(new Pawn(BLACK,1,1));
		pieces.add(new Pawn(BLACK,2,1));
		pieces.add(new Pawn(BLACK,3,1));
		pieces.add(new Pawn(BLACK,4,1));
		pieces.add(new Pawn(BLACK,5,1));
		pieces.add(new Pawn(BLACK,6,1));
		pieces.add(new Pawn(BLACK,7,1));
		pieces.add(new Rook(BLACK,0,0));
		pieces.add(new Rook(BLACK,7,0));
		pieces.add(new Knight(BLACK,1,0));
		pieces.add(new Knight(BLACK,6,0));
		pieces.add(new Bishop(BLACK,2,0));
		pieces.add(new Bishop(BLACK,5,0));
		pieces.add(new Queen(BLACK,3,0));
		pieces.add(new King(BLACK,4,0));
	}
	
	 
	private void update() {
		if(mouse.pressed) {
			if(activeP == null) {
				
				for(Piece piece : simPieces) {
					if(piece.color == currentColor && 
							piece.col == mouse.x/Board.SQUARE_SIZE && 
							piece.row == mouse.y/Board.SQUARE_SIZE) {
					activeP = piece;
				}
			}
		}
			else {
				simulate();
			}
	}
}

	private void simulate() {
		activeP.x = mouse.x;
		activeP.y = mouse.y;
		activeP.col = activeP.getCol(activeP.x);
		activeP.row = activeP.getRow(activeP.y); 
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		//BOARD
		board.draw(g2);
		//PIECES
		for(Piece p : simPieces) {
			p.draw(g2);
		}
		if(activeP != null) {
			g2.setColor(Color.white);
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));
			g2.fillRect(activeP.col * Board.SQUARE_SIZE, activeP.row* Board.SQUARE_SIZE, Board.SQUARE_SIZE, Board.HALF_SQUARE_SIZE);
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
			
			activeP.draw(g2);
		}
		
		
	}
	
	private void copyPieces(ArrayList<Piece> source, ArrayList<Piece> target) {
		target.clear();
		for(int i = 0; i < source.size(); i++) {
			target.add(source.get(i));
		}
	}
	@Override
	public void run() {
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			
			delta += (currentTime - lastTime)/drawInterval;
			lastTime = currentTime;
			
			if(delta >= 1) {
				update();
				repaint();
				delta--;
			}
			
		}
	}
	
	
}
