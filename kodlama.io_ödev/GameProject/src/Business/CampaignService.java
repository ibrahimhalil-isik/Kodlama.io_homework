package Business;

import Entities.Campaign;

public interface CampaignService {

	void getAll( Campaign[] campaign );
	
	void add( Campaign campaign );
	
	void delete( Campaign campaign );
	
	void update( Campaign campaign );

}
