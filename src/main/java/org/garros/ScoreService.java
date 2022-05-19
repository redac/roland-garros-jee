package org.garros;

import java.util.List;

public interface ScoreService {

	List<Score> getAllScore();

	List<Score> getScoreByQuery(String query);

	List<Score> getScoreByMatchAndSet(int match_num, int set_number);

}
