
public class TestObjetGeometrique {
	
	public static void main(String[] args) {
	
		ObjetGeometrique[] objets = new ObjetGeometrique[2];
	
		objets[0] = new Cercle(2.5);
		objets[1] = new Rectangle(5,8);
		
		for (int i = 0; i < 2 ; i++) {
			System.out.println(objets[i]);
			System.out.println("périmètre : " + objets[i].perimetre());
			System.out.println("surface : " + objets[i].surface() + "\n\n");
		}
	
	}
}
