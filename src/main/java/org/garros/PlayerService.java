package org.garros;

import java.util.List;

public interface PlayerService {
	List<Player> getAllPlayers();

	List<Player> getPlayerByName(String searchText);
	
	List<Player> getPlayerByWin(String category);

	List<Player> getPlayerById(int id);
	
	List<Player> getPlayerByTime(String category);
}
