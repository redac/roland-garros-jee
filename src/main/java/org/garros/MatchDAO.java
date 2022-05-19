package org.garros;

import java.util.List;

public interface MatchDAO {

	List<Match> findByAll();

	List<Match> findByQuery(String query);

}
