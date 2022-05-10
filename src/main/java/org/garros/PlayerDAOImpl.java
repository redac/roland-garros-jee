package org.garros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
	
	public List<Player> findByQuery(String query) {
		Connection connection = DBManager.getInstance().getConnection();
		List<Player> players = new ArrayList<Player>();
		Statement statement;
		ResultSet rs;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String category = rs.getString("category");
				String country = rs.getString("country");
				int ranking = rs.getInt("ranking");
				String hand = rs.getString("hand");
				/**
				 * Create the a player object from the SQL result set
				 */
				Player player = new Player(id, firstname, lastname, age, category, country, ranking, hand);
				players.add(player);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return players;
	}
	
	@Override
	public List<Player> findByName(String searchText) {
		
		return findByQuery("SELECT player_id, firstname, lastname, age, category, country, ranking, hand FROM players WHERE firstname like'%"+searchText+"' OR lastname like'%"+searchText+"';");
	}
	
	@Override
	public List<Player> findByAll() {
		
		return findByQuery("SELECT player_id, firstname, lastname, age, category, country, ranking, hand FROM players;");
	}

}
