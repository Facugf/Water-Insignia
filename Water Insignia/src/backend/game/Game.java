package backend.game;

import java.util.HashMap;
import java.util.Map;

import backend.piece.*;



public class Game {
		private static Game instanceGame = null;
		private Board board;
		
		/**
		 * Crea un tablero con las dimensiones dadas y luego marca
		 * que casilleros estan vacios y cual llenos atravez de un mapa
		 * 
		 * @param width Ancho del Tablero del Juego
		 * @param height Alto del Tablero del Juego
		 */
		private Game(int width, int height){
			
			board = new Board(width, height);
		
		}
		
		public static void createGame(int width,int height){
			if(instanceGame==null){
				instanceGame = new Game(width,height);
			}
		}
		
		public static Game getInstance(){
			return instanceGame;
		}
		
		public Board getBoard(){
			return board;
		}
		/**
		 * 
		 * @READ Board.getTile
		 */
		public Tile getTile(int positionX, int positionY){
			return board.getTile(positionX, positionY);
		}
		
		
		public String toString(){
			String string="";
			for(int i = 0; i < this.getHeight(); i++){
				for(int j = 0; j < this.getWidth(); j++){
					string+=this.getTile(i, j);
					if(this.getPiece(this.getTile(i, j))!=null){
						string+=this.getPiece(this.getTile(i, j)).getName() + " ";
					}
					else{
						string+="   ";
					}
				}
				string+= "\r\n";
			}
			
			return string;
		}
		/**
		 * Remueve una pieza del tablero
		 * @param tile El casillero donde se encuentra la pieza a remover
		 * @return La pieza removida
		 */
		public Piece removePiece(Piece piece){
			Piece removedPiece = piece;
			if(piece!=null){
				piece.getPosition().putPiece(null);
			}
			return removedPiece;
		}
		/**
		 * Coloca una pieza en el tablero
		 * @param piece La pieza a poner
		 * @param tileSelected El casillero donde se pondra la pieza
		 * @return Falso si el casillero se encuentra previamente ocupado
		 * 			Verdadero si se pudo colocar la pieza
		 */
		public boolean putPiece(Piece piece, Tile tileSelected){
			if(tileSelected.getPiece()!=null){
				return false;
			}
			tileSelected.putPiece(piece);
			return true;
		}
		
		

		/**
		 * Obtiene la pieza en una tile determinada
		 * @param tileStarting Casillero donde se encuentra la pieza a mover
		 * @param tileEnding Casillero a donde se busca mover la pieza
		 * @return falso si no se puedo mover
		 * 			verdadero si se concreto el movimiento
		 */
		public Piece getPiece (Tile tilePiece){
			return tilePiece.getPiece();
		}
		
		/**
		 * Obtiene la distancia entre dos tiles
		 * @param StartingTile Casillero Inicial
		 * @param EndingTile Casillero final
		 * @return La distancia entre Casillero Inicial y Casillero final
		 */
		public int getDistance(Tile StartingTile, Tile EndingTile){
			int distanceX = Math.abs(StartingTile.getPositionX() - EndingTile.getPositionX());
			int distanceY = Math.abs(StartingTile.getPositionY() - EndingTile.getPositionY());
			return distanceX + distanceY;
		}
		
		//raro
		public boolean useSkill(Tile startingTile, Tile targetTile, int skillIndex){
			if(this.getPiece(startingTile)==null){
				return false;
			}
			return this.getPiece(startingTile).tryToSkill(startingTile, targetTile, skillIndex);
			
		}
		
		
		public int getWidth(){
			return board.getWidth();
		}
		
		public int getHeight(){
			return board.getHeight();
		}
		
		
}

