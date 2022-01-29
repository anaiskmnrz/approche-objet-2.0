
public class Rectangle implements ObjetGeometrique {

	public double longueur;
	public double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double perimetre() {
		return (longueur + largeur)*2;
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	public String toString() {
		return "rectangle de longueur " + longueur + " et de largeur " + largeur + "\n";
	}
}
