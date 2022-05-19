package org.garros;

import java.util.List;

public interface MatchService {

	List<Match> getAllMatch();

	List<Match> getMatchByQuery(String query);
	
	List<Match> getMatchByNum(int match_num);

	void modifyMatch(int idMatch, int date, int id1, int id2, int idWin, int idLose);
	
	void deleteMatch(int idMatch);

}
