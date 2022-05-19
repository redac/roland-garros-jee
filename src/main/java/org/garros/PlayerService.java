package org.garros;

import java.util.List;

public interface PlayerService {
	List<Player> getAllPlayers();

	List<Player> getPlayerByName(String searchText);
	
	List<Player> getPlayerByWin(String category);

	List<Player> getPlayerById(int id);
	
	List<Player> getPlayerByTime(String category);
	
	void putPlayer(int id, int age, String category, String country, String firstname, String hand, String lastname);

	void createPlayer2(String firstname, String lastname, String hand, String category, String country);

}
