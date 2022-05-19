package org.garros;

import java.util.List;

public interface MatchService {

	List<Match> getAllMatch();

	List<Match> getMatchByQuery(String query);

	List<Match> getMatchByNum(int match_num);

}
