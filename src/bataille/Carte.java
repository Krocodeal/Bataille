package bataille;

public class Carte {
	
	private int valeur;
	private int couleur;
	
	public Carte(){
		this.setValeur(1);
		this.setCouleur(0);
		System.out.println("Carte cr�e.");
	}
	
	public Carte(int couleur, int valeur){
		this.setCouleur(couleur);
		this.setValeur(valeur);
		System.out.println("Carte cr�e avec sa configuration.");
	}

	public int getValeur() {
		return this.valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public int getCouleur() {
		return this.couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
	
	public char compareCarte(Carte carte){
			
		if (this.valeur > carte.getValeur()){
			return '+';
		}else if (this.valeur < carte.getValeur()){
			return '-';
		}else {
			return '=';
		}
	}
	
	public String toString(){
		final String valeur;
		final String couleur;
		switch(this.valeur){
			case 14:
				valeur = "as";
				break;
			case 13:
				valeur = "roi";
				break;
			case 12:
				valeur = "dame";
				break;
			case 11:
				valeur = "valet";
				break;
			case 0:
				valeur = "non d�finie";
				break;
			default:
				valeur = Integer.toString(this.valeur);
				break;
		}
		switch(this.couleur){
		case 4:
			couleur = "coeur";
			break;
		case 3:
			couleur = "tr�fle";
			break;
		case 2:
			couleur = "carreau";
			break;
		case 1:
			couleur = "pique";
			break;
		default:
			couleur = "non d�finie";
			break;
		}
		return "La carte est " + valeur + " de " + couleur;
	}

}
