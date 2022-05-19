package org.garros;

import java.util.List;

public interface PlayerService {
	List<Player> getAllPlayers();

	List<Player> getPlayerByName(String searchText);
	
	List<Player> getPlayerByWin();

	List<Player> getPlayerById(int id);
	
	List<Player> getPlayerByTime();
	
	void putPlayer(int id, int age, String category, String country, String firstname, String hand, String lastname);
}
