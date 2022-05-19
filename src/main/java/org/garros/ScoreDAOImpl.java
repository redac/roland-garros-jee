package org.garros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOImpl implements ScoreDAO {

	public List<Score> findByQuery(String query) {
		Connection connection = DBManager.getInstance().getConnection();
		List<Score> scores = new ArrayList<Score>();
		Statement statement;
		ResultSet rs;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				int matches_id = rs.getInt("matches_id");
				int set_number = rs.getInt("set_number");
				int player1_score = rs.getInt("player1_score");
				int player2_score = rs.getInt("player2_score");
				/**
				 * Create a player object from the SQL result set
				 */
				
				Score score = new Score(matches_id, set_number, player1_score, player2_score);
				scores.add(score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return scores;
	}

	@Override
	public List<Score> findByAll() {

		return findByQuery(
				"SELECT matches_id, set_number, player1_score, player2_score FROM matches_score ;");
	}
	
	@Override
	public List<Score> findByMatchAndSet(int match_num, int set_number) {

		return findByQuery(
				"SELECT matches_id, set_number, player1_score, player2_score FROM matches_score WHERE matches_id ='"+ match_num +"' AND set_number='"+ set_number +"';");
	}

}