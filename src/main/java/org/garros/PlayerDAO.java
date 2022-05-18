package org.garros;

import java.util.List;

public interface PlayerDAO {

	List<Player> findByAll();

	List<Player> findByName(String searchText);

	List<Player> findByWin(String category);

	List<Player> findByTime(String category);

	List<Player> findById(int id);

	List<Player> findByQuery(String query);

}
