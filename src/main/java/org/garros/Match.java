package org.garros;

import java.util.Date;

public class Match {
	private int match_num;
	private Date date;
	private int player1_id;
	private int player2_id;
	private int winner_id;
	private int looser_id;
	
	public int getMatchNum() {
		return match_num;
	}

	public void setMatchNum(int match_num) {
		this.match_num=match_num;
	}
	
	public int getPlayer1Id() {
		return player1_id;
	}
	
	public void setPlayer1Id(int player1_id) {
		this.player1_id = player1_id;
	}
	
	public int getPlayer2Id() {
		return player2_id;
	}
	
	public void setPlayer2Id(int player2_id) {
		this.player2_id = player2_id;
	}
	
	public int getWinnerId() {
		return winner_id;
	}
	
	public void setWinnerId(int winner_id) {
		this.winner_id = winner_id;
	}
	
	public int getLooserId() {
		return looser_id;
	}
	
	public void setLooserId(int looser_id) {
		this.looser_id = looser_id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Match(int match_num, Date date, int player1_id, int player2_id, int winner_id, int looser_id) {
		this.match_num = match_num;
		this.date = date ;
		this.player1_id = player1_id;
		this.player2_id = player2_id;
		this.winner_id = winner_id;
		this.looser_id = looser_id;
	}
	public Match() {
		// TODO Auto-generated constructor stub
	}

}