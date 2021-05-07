package Business;

import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya sisteme eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya sistemden silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya güncellendi.");
		
	}

	@Override
	public void getAll(Campaign[] campaign) {
		System.out.println(" Tum Kampanyalar ");
		
		for (Campaign _campaign : campaign) {
			System.out.println(_campaign.getCampaignName());
			System.out.println("%"+_campaign.getDiscount()+" indirim");
		}
		
	}

}
