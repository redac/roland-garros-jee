package org.garros;

import java.util.List;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO = new UserDAOImpl();
	@Override
	public List<User> getAllUsers() {
		
		return userDAO.findByAll();
	}
	@Override
	public List<User> getPlayerByUsername(String searchText) {
		return userDAO.findByUsername(searchText);
	}

}
