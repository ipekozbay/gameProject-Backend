package gameBackend;

import gameBackend.Concrete.CampaignManager;
import gameBackend.Concrete.GameManager;
import gameBackend.Concrete.UserCheckManager;
import gameBackend.Concrete.UserManager;
import gameBackend.Entities.Campaign;
import gameBackend.Entities.Game;
import gameBackend.Entities.User;

public class Main {

	public static void main(String[] args) {

		User ipek = new User();
		ipek.setId(1);
		ipek.setName("ipek");
		ipek.setMail("ipek@gmail.com");
		ipek.setNationalityId("12345678999");
		ipek.setPassword("123456");

		UserManager userManager = new UserManager(new UserCheckManager());
		userManager.add(ipek);
		userManager.delete(ipek);
		userManager.update(ipek);

		Game snake = new Game(1, "snake", "blabla", 124);
		GameManager gameManager = new GameManager();
		
		gameManager.add(snake);
	//	gameManager.delete(snake);
	//	gameManager.update(snake);
		
		Campaign flashCampaign = new Campaign(1, "flashCampaign", "1414", 40, "details");
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(flashCampaign);
		campaignManager.delete(flashCampaign);
		
	}

}
