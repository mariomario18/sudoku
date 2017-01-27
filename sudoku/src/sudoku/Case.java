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
    public int n;
    public boolean fixe;

    public Case(int n) {
        this.n = n;
        this.fixe = true;
    }
    
    public Case() {
        this.n = 0;
        this.fixe = false;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(n);
        return str.toString();
    }
    
    
    
}
