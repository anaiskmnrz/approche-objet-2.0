package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		//Operation[] operations = new Operation[4];
		
		Operation[] operations = {new Debit("11-05-2005", 250), new Debit("17-11-2005",587), new Credit("19-06-2005",899), new Credit("25-10-2005", 30)};

		int total = 0;
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i] + "\n");
			if (operations[i].getType() == "DEBIT") {
				total -= operations[i].montant;
			}
			if (operations[i].getType() == "CREDIT") {
				total 
				+= operations[i].montant;
			}
		}
		
		System.out.println(total);
	}

}
