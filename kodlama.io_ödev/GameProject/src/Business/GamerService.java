package Business;

import Entities.Gamer;

public interface GamerService {

	void getAll(Gamer[] gamer);
	
	void add( Gamer gamer );
	
	void delete( Gamer gamer );
	
	void update ( Gamer gamer );
}
