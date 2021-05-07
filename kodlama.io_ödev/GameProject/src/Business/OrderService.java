package Business;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public interface OrderService {
	
	void getAll(Order[] order);
	
	void buy(Order order, Campaign campaign ,Gamer gamer, Game game);
	
	void restitute(Order order, Campaign campaign ,Gamer gamer, Game game);	
}
