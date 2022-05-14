package org.garros;

public class Player {
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String category;
	private String country;
	private int ranking;
	private String hand;
	private int nb_timePlayed;
	private int nb_win;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public int getNbWin() {
		return nb_win;
	}
	
	public void setNbWin(int nb_win) {
		this.nb_win = nb_win;
	}
	
	public int getNbTimePlayed() {
		return nb_timePlayed;
	}
	
	public void setNbTimePlayed(int nb_timePlayed) {
		this.nb_timePlayed = nb_timePlayed;
	}


	/**
	 * Player object constructor
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param category
	 * @param country
	 * @param ranking
	 * @param hand
	 */
	public Player(int id, String firstname, String lastname, int age, String category, String country, int ranking,
			String hand, int nb_win, int nb_timePlayed) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.category = category;
		this.country = country;
		this.ranking = ranking;
		this.hand = hand;
		this.nb_win = nb_win;
		this.nb_timePlayed = nb_timePlayed;
	}

}
