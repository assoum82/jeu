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
public class Joueur {

    private String pseudo;
    private int score;
    private static int scoreMax;//il faut déclarer scoreMax pour que ça marche 

    public Joueur(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getScore() {
        return score;
    }

    public int getScoreMax() {
        return scoreMax;
    }

    public int calcul_score(int points) {
        score = score + points;
        if (score > scoreMax) {
            scoreMax = score;
        }
        return score;
    }

    public boolean gagnant() {
        if (score == scoreMax) {
            return true;
        } else {
            return false;
        }
    }
}
