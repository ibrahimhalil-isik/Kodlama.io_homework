package Business;

import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void getAll(Game[] game) {
		System.out.println(" Tum Oyunlar ");
		
		for (Game _game : game) {
			System.out.println(_game.getGameName());
			System.out.println("Oyunun Fiyati : "+_game .getPrice()+"TL");		
		}
		
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" güncellendi");
		
	}

}
