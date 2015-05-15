package backend.game;

import backend.piece.Piece;

public class Tile {
	
	private int positionX;
	private int positionY;
	private Piece piece;
	
	public Tile(int positionX, int positionY){
		this.positionX=positionX;
		this.positionY=positionY;
		this.piece=null;
	}
	
	public int getPositionX(){
		return this.positionX;
	}
	
	public int getPositionY(){
		return this.positionY;
	}
	
	public Piece getPiece(){
		return this.piece;
	}
	
	private void setPiece(Piece piece){
		this.piece=piece;
	}
	/**
	 * @return coordenadas del casillero (arranca en (0,0))
	 */
	public String toString(){
		StringBuffer string = new StringBuffer();
		string.append("(" + positionX + ";" + positionY + ")");
		if(this.piece!=null){
			string.append(this.piece);
		}
		return string.toString();
	}
	
	public void putPiece(Piece piece){
		setPiece(piece);
		if(piece!=null){
			piece.setPosition(this);
		}
	}
	


}
