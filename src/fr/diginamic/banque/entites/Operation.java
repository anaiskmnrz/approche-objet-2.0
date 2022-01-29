package fr.diginamic.banque.entites;

public abstract class Operation {
	
	public String date;
	public int montant;
	
	public Operation(String date, int montant) {
		this.date = date;
		this.montant = montant;
	}
	
	public String toString() {
		return "date : " + date + "\nmontant : " + montant + "\noperation : " + getType();
	}

	abstract String getType();
}
