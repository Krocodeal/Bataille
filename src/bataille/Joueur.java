package bataille;

import java.util.ArrayList;

public class Joueur {


	private ArrayList<Carte> jeu;
	private int points;
	
	public Joueur(){
		
		final ArrayList<Carte> defaut = new ArrayList<>();
		final Carte carte = new Carte();
		defaut.add(carte);
		
		this.setJeu(defaut);
		this.setPoints(0);
		System.out.println("Joueur crée.");
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void addPoints(int points) {
		this.points += points;
	}

	public String quiGagne(Joueur joueur) {
		System.out.println(this.getPoints());
		System.out.println(joueur.getPoints());
		String gagnant = new String();
		if (this.points > joueur.getPoints()){
			gagnant = "Joueur 1 a gagné !";
		}else {
			gagnant = "Joueur 2 a gagné !";
		}
		return gagnant;
	}


	public ArrayList<Carte> getJeu() {
		return this.jeu;
	}


	public void setJeu(ArrayList<Carte> jeu){
		this.jeu = jeu;
	}
	
	public void createDeck(int nbCartes){
		ArrayList<Carte> deck = new ArrayList<>();
		for (int i=0; i<nbCartes; i++){
			Carte carte = new Carte((int)(Math.random() * (4-1) + 1), (int)(Math.random() * (14-2) + 2));
			System.out.println(carte.toString());
			deck.add(carte);
			System.out.println("");
		}
		this.jeu = deck;
	}

}
