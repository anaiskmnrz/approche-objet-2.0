package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();
		
		personne1.nom = "Dupont";
		personne1.prenom = "Jean";
		
		personne2.nom = "Thiebault";
		personne2.prenom = "Jeanne";
		
		adresse1.numeroRue = 1;
		adresse1.libelleRue = "rue des jonquilles";
		adresse1.codePostal = 59000;
		adresse1.ville = "Lille";
		
		adresse2.numeroRue = 2;
		adresse2.libelleRue = "rue des jonquilles";
		adresse2.codePostal = 59000;
		adresse2.ville = "Lille";

		personne1.adressePostale = adresse1;
		personne2.adressePostale = adresse2;
		
		
		Personne personne3 = new Personne("fekok","rachel");
		Personne personne4 = new Personne("hiort","ludovic", adresse1);
		
		String test = personne3.prenom();
		System.out.println(test);
		
		
	}

}
