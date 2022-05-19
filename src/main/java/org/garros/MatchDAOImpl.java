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

	public void doQuery(String query) {
		Connection connection = DBManager.getInstance().getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Match> findByAll() {

		return findByQuery("SELECT match_num, date, player1_id, player2_id, winner_id, looser_id FROM matches ;");
	}

	@Override
	public void createMatch(int date, int id1, int id2, int idWin, int idLose) {
		doQuery("INSERT into matches (date, player1_id, player2_id, winner_id, looser_id) VALUES (" + date + "," + id1
				+ "," + id2 + "," + idWin + "," + idLose + ")");
	}

	@Override
	public void createScore(int idMatch, int numSet, int score1, int score2) {
		doQuery("INSERT into matches_score (matches_id, set_number, player1_score, player2_score) VALUES (" + idMatch
				+ "," + numSet + "," + score1 + "," + score2 + ")");
	}

	@Override
	public void modifyScore(int idMatchScore, int idMatch, int numSet, int score1, int score2) {
		doQuery("UPDATE matches_score" + "set matches_id=" + idMatch + "set set_number=" + numSet + "set player1_score"
				+ score1 + "set player2_score" + score2 + "WHERE idmatches_score=" + idMatchScore);
	}

	@Override
	public void modifyMatch(int idMatch, int date, int id1, int id2, int idWin, int idLose) {
		doQuery("UPDATE matches" + "set date=" + date + "set player1_id=" + id1 + "set player2_id=" + id2
				+ "set winner_id=" + idWin + "set looser_id=" + idLose + "WHERE match_num=" + idMatch);
	}

}