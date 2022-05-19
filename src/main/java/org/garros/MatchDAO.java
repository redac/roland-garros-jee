package org.garros;

import java.util.List;

public interface MatchDAO {

	List<Match> findByAll();

	List<Match> findByQuery(String query);

	void createMatch(int date, int id1, int id2, int idWin, int idLose);
	
	void createScore(int idMatch, int numSet, int score1, int score2);

	void modifyScore(int idMatchScore, int idMatch, int numSet, int score1, int score2);

	void modifyMatch(int idMatch, int date, int id1, int id2, int idWin, int idLose);

}
