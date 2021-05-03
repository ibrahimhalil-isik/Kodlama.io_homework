package ConsoleUI;

import Business.CampaignManager;
import Business.GameManager;
import Business.GamerManager;
import Business.OrderManager;
import Business.UserValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class Main {
public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,123456789,"Ýbrahim Halil","IÞIK",2000);
		Gamer gamer2 = new Gamer(2,123456789,"Tunahan Alparslan","ARIÇ",2000);
		
		Game game1 = new Game(1, "League of Legends", 50);	
		Game game2 = new Game(2, "GTA V", 200);	
		
		Campaign campaign1 = new Campaign(2," Efsane indirim !!!",25);
		Campaign campaign2 = new Campaign(2," Buyuk Cuma indirimi !!!",20);
		
		Order order1 = new Order(1);
		
		System.out.println("\n ----- Oyuncu ekle-sil-güncelle ----- \n");
		
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		
		System.out.println("\n ----- Oyun ekle-sil-güncelle ----- \n");
		
		GameManager gameManager = new GameManager();
		
		gameManager.add(game1);
		gameManager.add(game2);
		
		gameManager.delete(game1);
		gameManager.update(game2);
		
		
		System.out.println("\n ----- Kampanya ekle-sil-güncelle ----- \n");
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		campaignManager.update(campaign2);
		campaignManager.delete(campaign1);
		
		
		System.out.println("\n ----- Oyun sat-iade et ----- \n");
		OrderManager orderManager = new OrderManager();
		
		orderManager.buy(order1, campaign1, gamer1, game1);
		orderManager.buy(order1, campaign2, gamer1, game2);
		
		orderManager.restitute(order1, campaign1, gamer1, game1);
		
		System.out.println("\n ----- Oyunlar-Oyuncular ve Kampanyalarý Listele ----- \n");
		Game[] games = {game1,game2};		
		gameManager.getAll(games);
		
		System.out.println();
		
		Gamer[] gamers = {gamer1};		
		gamerManager.getAll(gamers);
		
		System.out.println();
		
		Campaign[] campaigns = {campaign1,campaign2};		
		campaignManager.getAll(campaigns);

	}

}
