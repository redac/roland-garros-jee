package org.garros;

import java.util.List;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public List<User> getAllUsers() {

		return userDAO.findByAll();
	}

	@Override
	public List<User> getUserByUsername(String searchText) {
		return userDAO.findByUsername(searchText);
	}

	public List<User> getUserByQuery(String query) {
		return userDAO.findByQuery(query);
	}

	public User getUserByLogin(String usr, String pwd) {
		return userDAO.findByLogin(usr, pwd);
	}

}
