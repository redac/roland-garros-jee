package org.garros;

import java.util.List;

public interface UserDAO {

	List<User> findByAll();

	List<User> findByUsername(String searchText);
}
