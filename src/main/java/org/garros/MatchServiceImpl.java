package org.garros;

import java.util.List;

public class MatchServiceImpl implements MatchService {

	private MatchDAO matchDAO = new MatchDAOImpl();
	
	@Override
	public List<Match> getAllMatch() {
		
		return matchDAO.findByAll();
	}
	
	@Override
	public List<Match> getMatchByQuery(String query) {
		return matchDAO.findByQuery(query);
	}
	
	@Override
	public List<Match> getMatchByNum(int match_num) {
		return matchDAO.findByNum(match_num);
	}
	
	@Override
	public void modifyMatch(int idMatch, int date, int id1, int id2, int idWin, int idLose) {
		matchDAO.modifyMatch(idMatch, date, id1, id2, idWin, idLose);
	}

	@Override
	public void deleteMatch(int idMatch) {
		matchDAO.deleteMatch(idMatch);
	}
}
