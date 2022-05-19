package org.garros;

import java.util.List;

public class ScoreServiceImpl implements ScoreService {

	private ScoreDAO scoreDAO = new ScoreDAOImpl();

	@Override
	public List<Score> getAllScore() {

		return scoreDAO.findByAll();
	}

	public List<Score> getScoreByQuery(String query) {
		return scoreDAO.findByQuery(query);
	}

	public List<Score> getScoreByMatchAndSet(int match_num, int set_number) {
		return scoreDAO.findByMatchAndSet(match_num, set_number);
	}

}
