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
				int id = rs.getInt("player_id");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String category = rs.getString("category");
				String country = rs.getString("country");
				int ranking = rs.getInt("ranking");
				String hand = rs.getString("hand");
				int nb_win = rs.getInt("nb_win");
				int nb_timePlayed = rs.getInt("nb_timePlayed");
				/**
				 * Create the a player object from the SQL result set
				 */
				Player player = new Player(id, firstname, lastname, age, category, country, ranking, hand, nb_win,
						nb_timePlayed);
				players.add(player);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return players;
	}

	public void doQuery(String query) {
		Connection connection = DBManager.getInstance().getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Player> findByName(String searchText) {

		return findByQuery(
				"SELECT player_id, firstname, lastname, age, category, country, ranking, nb_win, nb_timePlayed hand FROM players WHERE firstname like'%"
						+ searchText + "' OR lastname like'%" + searchText + "';");
	}

	@Override
	public List<Player> findByAll() {

		return findByQuery(
				"SELECT player_id, firstname, lastname, age, category, country, ranking, hand, nb_win, nb_timePlayed FROM players;");
	}

	@Override
	public List<Player> findByWin() {

		return findByQuery(
				"SELECT player_id, firstname, lastname, age,country,category,ranking, hand, nb_win, nb_timePlayed FROM players ORDER BY nb_win DESC;");
	}

	@Override
	public List<Player> findById(int id) {

		return findByQuery("SELECT * FROM players WHERE player_id='" + id + "';");
	}

	@Override
	public List<Player> findByTime() {

		return findByQuery(
				"SELECT player_id, firstname, lastname, age, category, country, ranking, hand, nb_win, nb_timePlayed FROM players ORDER BY nb_timePlayed DESC;");
	}

	@Override
	public void modifyPlayer(int id, int age, String category, String country, String firstname, String hand, String lastname) {
		doQuery("UPDATE players "
				+ "SET firstname='" + firstname + 
				"' , age=" + age +
				" , category='" + category +
				"' , country='" + country +
				"' , hand='" + hand +
				"' , lastname='" + lastname +
				"' where player_id=" + id);
	}

	@Override
	public void createPlayer(int age, String category, String country, String firstname, String hand, String lastname,int timePlayed, int nbWin, int ranking) {
		doQuery("INSERT INTO players (age,category,country,firstname,hand,lastname,nb_timePlayed,nb_win,ranking)"
				+ "VALUES (" + age + ",'" + category + "','" + country + "','" + firstname + "','" + hand + "','"
				+ lastname + "," + timePlayed + "," + nbWin + "," + ranking + ")");
	}
	
	@Override 
	public void createPlayer2(String firstname, String lastname, String hand, String category, String country) {
		doQuery("INSERT INTO players (age,category,country,firstname,hand,lastname,nb_timePlayed,nb_win,ranking)"
				+ "VALUES ( 12, '"+ category + "','" + country + "','" + firstname + "','" + hand + "','"
				+ lastname + "', 100 , 3, 98)");
	}
	
	@Override
	public void deletePlayer(int id) {
		doQuery("DELETE FROM players WHERE player_id=" + id);
	}
}
