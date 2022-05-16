package org.garros;

import java.util.List;

public interface PlayerService {
	List<Player> getAllPlayers();

	List<Player> getPlayerByName(String searchText);
	
	List<Player> getPlayerByWin();
	
	List<Player> getPlayerByTime();
}
