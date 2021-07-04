package gameBackend.Concrete;

import gameBackend.Abstarct.UserCheckService;
import gameBackend.Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		return true;
	}

}
