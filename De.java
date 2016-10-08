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
public class De {
    private int face;
    public int lancerDe(){
        face=(int)(Math.random()*6+1);
        return face;
    }
}
