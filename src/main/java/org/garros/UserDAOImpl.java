package org.garros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

	public List<User> findByQuery(String query) {
		Connection connection = DBManager.getInstance().getConnection();
		List<User> users = new ArrayList<User>();
		Statement statement;
		ResultSet rs;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				int uid = rs.getInt("uid");
				String username = rs.getString("username");
				String account_type = rs.getString("account_type");
				String password = rs.getString("pwd");
				/**
				 * Create a user object from the SQL result set
				 */
				User user = new User(uid, username, account_type, password);
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}

	@Override
	public List<User> findByUsername(String searchText) {

		return findByQuery("SELECT uid, username, account_type, pwd hand FROM users WHERE username like'%"
				+ searchText + "';");
	}

	@Override
	public List<User> findByAll() {

		return findByQuery("SELECT uid, username, account_type, pwd hand FROM users;");
	}

}
