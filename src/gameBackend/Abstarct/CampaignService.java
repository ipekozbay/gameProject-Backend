package gameBackend.Abstarct;

import gameBackend.Entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);
}
