package gameBackend.Concrete;

import gameBackend.Abstarct.CampaignService;
import gameBackend.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + "campaign added.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + "campaign updated.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "campaign deleted.");

	}

}
