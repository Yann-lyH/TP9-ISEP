
public class ArbreBinaire {
	String NomSommet;
	ArbreBinaire NomFilsD;
	ArbreBinaire NomFilsG;

	public ArbreBinaire(String NomSom) {
		this.NomSommet = NomSom;
	}

	public ArbreBinaire(String NomSom, ArbreBinaire NomFD, ArbreBinaire NomFG) {
		this.NomSommet = NomSom;
		this.NomFilsD = NomFD;
		this.NomFilsG = NomFG;
	}

	public static void parcourirPrefixe(ArbreBinaire arbre) {
		System.out.println(arbre.NomSommet);
		if (arbre.NomFilsG != null) {
			parcourirPrefixe(arbre.NomFilsG);
		}
		if (arbre.NomFilsD != null) {
			parcourirPrefixe(arbre.NomFilsD);
		}
	}

	public static int hauteur(ArbreBinaire arbre) {
		int a;
		if (arbre == null) {
			return 0;
		} else {
			a = 1 + Math.max(hauteur(arbre.NomFilsG), hauteur(arbre.NomFilsD));
			return a;
		}

	}
	public static void parcourirLargeur(ArbreBinaire arbre) {
		
	}

	public static void main(String[] args) {
		ArbreBinaire arbreFD3 = new ArbreBinaire("E");
		ArbreBinaire arbreFG3 = new ArbreBinaire("D");
		ArbreBinaire arbreFD2 = new ArbreBinaire("G");
		ArbreBinaire arbreFG2 = new ArbreBinaire("F");
		ArbreBinaire arbreFD1 = new ArbreBinaire("C", arbreFD2, arbreFG2 );
		ArbreBinaire arbreFG1 = new ArbreBinaire("B", arbreFD3, arbreFG3);
		ArbreBinaire arbreFinal = new ArbreBinaire("A", arbreFD1, arbreFG1);

		parcourirPrefixe(arbreFinal);
		System.out.println("hauteur vaut: " + hauteur(arbreFinal));
	}

}
