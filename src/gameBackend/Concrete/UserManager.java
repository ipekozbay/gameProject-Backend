package gameBackend.Concrete;

import gameBackend.Abstarct.UserCheckService;
import gameBackend.Abstarct.UserService;
import gameBackend.Entities.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	public void add(User user) {

		if (userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getName() + " user added.");
			this.userCheckService.CheckIfRealPerson(user);
		} else {
			System.out.println("user don't add because the information is not correct");
		}

	}

	public void update(User user) {
		System.out.println(user.getName() + " user updated.");
	}

	public void delete(User user) {
		System.out.println(user.getName() + " user dleted.");
	}

}
