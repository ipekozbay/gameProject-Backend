package gameBackend.Concrete;

import gameBackend.Abstarct.GameService;
import gameBackend.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
			System.out.println(game.getName()+" game added.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() +" game updated");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" game deleted.");
		
	}

	
}
