package org.garros;

/***
 * 
 * Classe java qui g�re une connection utilisateur Singleton
 *
 */
public class ConnectionUser {

	private static ConnectionUser instance = null; // instance de la classe
	private User user; // utilsateur connect�
	private String etat = "disconnected"; // connected/disconnected

	
	private ConnectionUser() {

	}

	// Donne acc�s � notre instance
	public static ConnectionUser getInstance() {
		// Si non instanci�, on l'instancie
		if (instance == null) {
			instance = new ConnectionUser();
		}
		return instance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

}
