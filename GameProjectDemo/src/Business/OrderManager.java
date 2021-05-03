package Business;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void getAll(Order[] order) {
		System.out.println(" Tum siparisler ");
		
		for (Order _order : order) {
			System.out.println(_order.getOrderId());
		}
		
	}

	@Override
	public void buy(Order order, Campaign campaign, Gamer gamer, Game game) {
		double priceAfterDiscount = game.getPrice()-(game.getPrice()*campaign.getDiscount() / 100);
		
		System.out.println(" Siparisiniz alinmistir. Oyun hesabiniza tanimlaniyor.");
		
		System.out.println("indirimden onceki fiyat : "+game.getPrice()+"TL");
		
		System.out.println("Kampanya ismi : "+campaign.getCampaignName());
		
		System.out.println("indirim oraný : %"+campaign.getDiscount());
		
		System.out.println("Odenecek tutar : " +priceAfterDiscount+"TL");
		
		System.out.println(gamer.getFirstName()+" isimli kullanici "
				+game.getGameName()+" isimli oyunu satin aldi.\n");
	}
	
	@Override
	public void restitute(Order order, Campaign campaign, Gamer gamer, Game game) {
		double priceAfterDiscount = game.getPrice()-(game.getPrice()*campaign.getDiscount() / 100);
		
		System.out.println("iade talebiniz alinmistir. Para iadesi gerçekleþiyor.");
		
		System.out.println("iade edilecek tutar : " +priceAfterDiscount);
		
		System.out.println(gamer.getFirstName()+" isimli kullanici "
				+game.getGameName()+" isimli oyunu iade etti.\n");
	}

}

