package org.garros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchDAOImpl implements MatchDAO {

	public List<Match> findByQuery(String query) {
		Connection connection = DBManager.getInstance().getConnection();
		List<Match> matchs = new ArrayList<Match>();
		Statement statement;
		ResultSet rs;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				int match_num = rs.getInt("match_num");
				Date date = rs.getDate("date");
				int player1_id = rs.getInt("player1_id");
				int player2_id = rs.getInt("player2_id");
				int winner_id = rs.getInt("winner_id");
				int looser_id = rs.getInt("looser_id");
				/**
				 * Create a player object from the SQL result set
				 */
				Match match = new Match(match_num, date, player1_id, player2_id, winner_id, looser_id);
				matchs.add(match);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return matchs;
	}

	@Override
	public List<Match> findByAll() {

		return findByQuery(
				"SELECT match_num, date, player1_id, player2_id, winner_id, looser_id FROM matches ;");
	}

}