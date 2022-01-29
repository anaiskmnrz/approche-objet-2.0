package fr.diginamic.entites;

public class Cercle {
	
	public double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return rayon * Math.PI * 2;
	}

	public double surface() {
		return Math.PI * Math.pow(rayon,2);
	}
	
	public String toString() {
		return "Cercle de " + rayon + "\n périmètre : " + perimetre() + "\n surface : " + surface() + "\n";
	}

}
