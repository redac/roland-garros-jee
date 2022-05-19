package org.garros;

import java.util.List;

public interface ScoreDAO {

	List<Score> findByAll();

	List<Score> findByMatchAndSet(int match_num, int set_number);

	List<Score> findByQuery(String query);

}
