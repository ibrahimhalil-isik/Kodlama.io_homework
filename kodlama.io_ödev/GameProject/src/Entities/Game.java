package Entities;
 
public class Game {
	 
	private int gameId;
	private String gameName;
	private int price;

	public Game() {
		
	}
	
	public Game(int gamerId, String gameName, int price) {
		this.gameId = gamerId;
		this.gameName = gameName;
		this.price = price;
	}


	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	

}
