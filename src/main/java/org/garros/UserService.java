package org.garros;

import java.util.List;

public interface UserService {
	List<User> getAllUsers();

	List<User> getPlayerByUsername(String searchText);
}
