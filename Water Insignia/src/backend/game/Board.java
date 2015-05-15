package backend.game;

import backend.piece.Piece;

public class Board {

	private int width;
	private int height;
	private Tile[][] board;
	
	/**
	 * Crea el tablero de forma iterativa
	 * @param width Ancho del Tablero
	 * @param height Altura del Tablero
	 */
	public Board(int width, int height){
		this.width = width;
		this.height = height;
		board =  new Tile[height][width];
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				board[i][j]=new Tile(i,j);
				
			}
		}
		
	}

	public int getHeight(){
		return this.height;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public Tile[][] getBoard(){
		return this.board;
	}
	/**
	 * La posicion (0,0) se encuentra arriba de todo a la izquierda
	 * @param positionX
	 * @param positionY
	 * @return El casillero en la posicion (x,y) del tablero
	 */
	public Tile getTile(int positionX, int positionY){
		return (this.board[positionX][positionY]);
	}
	
}
