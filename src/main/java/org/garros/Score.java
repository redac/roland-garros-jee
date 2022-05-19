package org.garros;



public class Score {
	private int matches_id;
	private int set_number;
	private int player1_score;
	private int player2_score;
	
	public int getMatchId() {
		return matches_id;
	}

	public void setMatchesId(int matches_id) {
		this.matches_id=matches_id;
	}
	
	public int getPlayer1Score() {
		return player1_score;
	}
	
	public void setPlayer1Score(int player1_score) {
		this.player1_score = player1_score;
	}
	
	public int getPlayer2Score() {
		return player2_score;
	}
	
	public void setPlayer2Score(int player2_score) {
		this.player2_score = player2_score;
	}
	
	public int getSetNumber() {
		return set_number;
	}
	
	public void setSetNumber(int set_number) {
		this.set_number = set_number;
	}
	
	public Score(int matches_id, int set_number, int player1_score, int player2_score) {
		this.matches_id = matches_id;
		this.set_number = set_number;
		this.player1_score = player1_score;
		this.player2_score = player2_score;
	}

}