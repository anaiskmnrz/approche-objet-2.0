package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
	
		Cercle cercle1 = new Cercle(2);
		Cercle cercle2 = new Cercle(3);
		
		System.out.println(cercle1);
		System.out.println(cercle2);
		
		
		Cercle cercle3 = CercleFactory.cercleFactory(5);
		System.out.println(cercle3);
	}

}
