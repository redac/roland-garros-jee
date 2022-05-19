package org.garros;

import java.util.List;

public interface UserService {
	List<User> getAllUsers();

	List<User> getUserByUsername(String searchText);

	List<User> getUserByQuery(String query);

	User getUserByLogin(String usr, String pwd);

}
