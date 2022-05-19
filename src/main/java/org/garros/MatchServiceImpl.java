package org.garros;

import java.util.List;

public class MatchServiceImpl implements MatchService {

	private MatchDAO matchDAO = new MatchDAOImpl();
	@Override
	public List<Match> getAllMatch() {
		
		return matchDAO.findByAll();
	}
	
	public List<Match> getMatchByQuery(String query) {
		return matchDAO.findByQuery(query);
	}
	
	public List<Match> getMatchByNum(int match_num) {
		return matchDAO.findByNum(match_num);
	}

}
