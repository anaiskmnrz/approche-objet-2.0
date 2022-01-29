package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	public int tauxRemuneration;
	
	public CompteTaux(int numero, int solde, int tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	public String toString() {
		return super.toString() + "\ntaux de rémunération: " + tauxRemuneration;
	}
}
