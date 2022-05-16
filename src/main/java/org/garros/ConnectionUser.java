package org.garros;

/***
 * 
 * Classe java qui gère une connection utilisateur
 * obj : n'avoir qu'une instance et utiliser ConnectionUser.getConnection
 *
 */
public class ConnectionUser {
	private User user; 		//utilsateur connecté
	private String etat;	//connected/disconnected
	
	public ConnectionUser(User u) {
		this.user = u;
		this.etat = "connected";
	}
	
	
}
