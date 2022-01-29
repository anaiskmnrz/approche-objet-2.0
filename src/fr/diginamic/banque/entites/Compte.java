package fr.diginamic.banque.entites;

public class Compte {
	
	public int numero;
	public int solde;
	
	public Compte(int numero, int solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public String toString() {
		return "numero : " + numero + "\nsolde: " + solde;
	}

}
