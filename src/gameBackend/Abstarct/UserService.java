package gameBackend.Abstarct;

import gameBackend.Entities.User;

public interface UserService {
	void add(User user);

	void update(User user);

	void delete(User user);

}
