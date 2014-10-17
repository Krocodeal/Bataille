package bataille;

import java.util.ArrayList;

public class Bataille {
	
	public static void bataille(Joueur j1, Joueur j2){
		ArrayList<Carte> jeu1 = j1.getJeu();
		ArrayList<Carte> jeu2 = j2.getJeu();
		char result;
		
		int i =0;
		while ((jeu1.size() > i) && (jeu2.size() > i)) {
				result = jeu1.get(i).compareCarte(jeu2.get(i));
				System.out.println(jeu1.get(i).toString());
				System.out.println(jeu2.get(i).toString());
				switch(result){
					case '=':
						System.out.println("Egalité !");
						break;
					case '+':
						System.out.println("Joueur 1 l'emporte !");
						j1.addPoints(1);
						jeu1.add(jeu2.get(i));
						jeu1.add(jeu1.get(i));
						break;
					case '-':
						System.out.println("Joueur 2 l'emporte !");
						j2.addPoints(1);
						jeu2.add(jeu1.get(i));
						jeu2.add(jeu2.get(i));
						break;
				}
				i++;
				System.out.println("");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		System.out.println("");
		
		joueur1.createDeck(52);
		joueur2.createDeck(52);

		bataille(joueur1,joueur2);
		System.out.println(joueur1.quiGagne(joueur2));
		
		
		System.out.println("");
		System.out.println("Partie terminée !");
	}

}
