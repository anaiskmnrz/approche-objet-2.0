package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compte = new Compte(105879,250);
		
		// affichage incompréhensible
		System.out.println(compte);
		
		Compte[] comptes = new Compte[2];
		
		comptes[0] = new Compte(126695645,556);
		comptes[1] = new CompteTaux(12456568, 847, 1);
		
		for (int i = 0; i < 2; i++) {
			System.out.println(comptes[i] + "\n");
			
		}
	}

}
