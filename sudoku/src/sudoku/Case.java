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
    
    public Case(){
        this.nb = 0;
        this.fixe = false;
    }
    
    public Case(int nb){
        this.nb = nb;
        this.fixe = false;
    }
    
    public Case(int nb, boolean fixe){
        this.nb = nb;
        this.fixe = fixe;
    }
    
    public int getNb(){
        return this.nb;
    }
    
    public void setNb(int nb){
        this.nb = nb;
    }
    
    public boolean getFixe(){
        return this.fixe;
    }
    
    @Override
    public String toString(){
        return Integer.toString(nb);
    }
}
