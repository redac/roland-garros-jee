package org.garros;

import java.util.List;

public interface PlayerDAO {
	
	List<Player> findByAll();

	List<Player> findByName(String searchText);
	
	List<Player> findByWin();
	
	List<Player> findByTime();
}
