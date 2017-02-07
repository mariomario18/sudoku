/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author youma
 */
public class Case {
    public int nb;
    public boolean fixe;
    public int position;
    public Bouton bouton;
    
    public Case(int position){
        this.nb = 0;
        this.fixe = false;
        this.position = position;
    }
    
    public Case(int nb, int position){
        this.nb = nb;
        this.fixe = false;
        this.position = position;
    }
    
    
    public Case(int nb, boolean fixe, int position){
        this.nb = nb;
        this.fixe = fixe;
        this.position = position;
    }
    
    public int getNb(){
        return nb;
    }
    
    public void setNb(int nb){
        this.nb = nb;
    }
    
    public boolean getFixe(){
        return fixe;
    }

    public int getPosition(){
        return position;
    }
    
    public void setBouton(Bouton bouton){
        this.bouton = bouton;
    }
    
    
    
    @Override
    public String toString(){
        return Integer.toString(nb);
    }
}
