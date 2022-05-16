package org.garros;

/***
 * 
 * Classe java qui gère une connection utilisateur
 * Singleton
 *
 */
public class ConnectionUser {
	
	private static ConnectionUser instance = null;			// instance de la classe
	private User user; 										// utilsateur connecté
	private String etat = "disconnected";					// connected/disconnected
	  
    //constructeur 
    private ConnectionUser() { 
    	
    } 
    
    // Donne accès à notre instance
    public static ConnectionUser getInstance() {
    	//Si non instancié, on l'instancie
    	if(instance==null) {
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
