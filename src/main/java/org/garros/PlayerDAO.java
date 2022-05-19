package org.garros;

import java.util.List;

public interface PlayerDAO {

	List<Player> findByAll();

	List<Player> findByName(String searchText);

	List<Player> findByWin(String category);

	List<Player> findByTime(String category);

	List<Player> findById(int id);

	List<Player> findByQuery(String query);

	void modifyPlayer(int id, int age, String category, String country, String firstname, String hand, String lastname);

	void createPlayer(int age, String category, String country, String firstname, String hand, String lastname,
			int timePlayed, int nbWin, int ranking);

	void createPlayer2(String firstname, String lastname, String hand, String category, String country);

}
