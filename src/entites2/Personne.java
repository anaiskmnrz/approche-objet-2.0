package entites2;

import entites.AdressePostale;

public class Personne {
	
	
	// On met en public pour que les attributs de personne soient visibles dans d'autres packages
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(){};
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}

}
