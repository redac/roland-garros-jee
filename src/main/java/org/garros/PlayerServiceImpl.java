package org.garros;

import java.util.List;

public class PlayerServiceImpl implements PlayerService {

	private PlayerDAO playerDAO = new PlayerDAOImpl();
	@Override
	public List<Player> getAllPlayers() {
		
		return playerDAO.findByAll();
	}
	@Override
	public List<Player> getPlayerByName(String searchText) {
		return playerDAO.findByName(searchText);
	}

	@Override
	public List<Player> getPlayerByWin() {
		return playerDAO.findByWin();
	}
	
	@Override
	public List<Player> getPlayerById(int id) {
		return playerDAO.findById(id);
	}

	@Override
	public List<Player> getPlayerByTime() {
		return playerDAO.findByTime();
	}
	
	@Override
	public void putPlayer(int id, int age, String category, String country, String firstname, String hand, String lastname) {
		playerDAO.modifyPlayer(id, age, category, country, firstname, hand, lastname);
	}

}
