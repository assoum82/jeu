/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

/**
 *
 * @author pro
 */
public class Jeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Joueur Partie[] = new Joueur[3];
        De d = new De();
        for (int i = 0; i < 3; i++) {
            Partie[i] = new Joueur("joueur" + (i + 1));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("tour n° " + (i + 1));
            for (int j = 0; j < 3; j++) {
                Partie[j].calcul_score(d.lancerDe());
                System.out.println(Partie[j].getPseudo() + "score= "
                        + Partie[j].getScore());
            }
        }
        for (int i = 0; i < 3; i++) {
            if (Partie[i].gagnant()) {
                System.out.println(Partie[i].getPseudo() + " score"
                        + "= " + Partie[i].getScore() + " gagnant");
            }
        }

    }
}
