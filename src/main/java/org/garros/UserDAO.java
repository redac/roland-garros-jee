package org.garros;

import java.util.List;

public interface UserDAO {

	List<User> findByAll();

	List<User> findByUsername(String searchText);

	List<User> findByQuery(String query);

	User findByLogin(String username, String password);
}
