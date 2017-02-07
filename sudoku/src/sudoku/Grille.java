/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Color;
import java.util.Arrays;

/**
 *
 * @author youma
 */
public class Grille {
    public Case[][] grille = new Case[9][9];
    
    public Grille(Case[][] grille){
        this.grille = grille;
    }
    
    public void displayGrille(){
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(grille[i]));
        }
    }
    
    public void setGrille(Case[][] grille){
        this.grille = grille;
    }
    
    public boolean absentSurLigne(int k, int i){
        for (int j = 0; j < 9; j++){
            if (grille[i][j].getNb() == k)
                return false;
        }
        return true;
    }
    
    public boolean absentSurColonne(int k, int j){
        for (int i = 0; i < 9; i++){
            if (grille[i][j].getNb() == k)
                return false;
        }
        return true;
    }

    public boolean absentSurBloc(int k, int i, int j){
        int x = i - (i%3);
        int y = j -( j%3);

        for (i = x; i < x + 3; i++){
            for (j = y; j < y + 3; j++){
                if (grille[i][j].getNb() == k)
                    return false;
            }
        }
        return true;
    }
      
    public boolean estValide(int position){

        if (position == 9*9)
            return true;

        int i = position/9;
        int j = position%9;

        if (grille[i][j].getNb() != 0)
            return estValide(position+1);

        for (int k=1; k <= 9; k++){
            if (absentSurLigne(k,i) && absentSurColonne(k,j) && absentSurBloc(k,i,j)){
                grille[i][j].setNb(k);

                if (estValide(position+1))
                    return true;
            }
        }

        grille[i][j].setNb(0);
        
        return false;
    }
    
    public boolean ligneValide(int k, int i, int position){
        for (int j = 0; j < 9; j++){
            if(grille[i][j].getNb() == k && grille[i][j].getPosition() != position){
                if(!grille[i][j].getFixe())
                    grille[i][j].bouton.setForeground(Color.red);
                
                return false;
            }
        }
        return true;
    }
    
    public boolean colValide(int k, int j, int position){
        for (int i = 0; i < 9; i++){
            if(grille[i][j].getNb() == k && grille[i][j].getPosition() != position){
                if(!grille[i][j].getFixe())
                    grille[i][j].bouton.setForeground(Color.red);
                
                return false;
            }
        }
        return true;
    }
    
    public boolean valideSurBloc(int k, int i, int j, int position){
        int x = i - (i%3);
        int y = j -( j%3);

        for (i = x; i < x + 3; i++){
            for (j = y; j < y + 3; j++){
                if (grille[i][j].getNb() == k && grille[i][j].getPosition() != position){
                    if(!grille[i][j].getFixe())
                        grille[i][j].bouton.setForeground(Color.red);
                
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean caseValide(int position){
        int x = position/9;
        int y = position%9;
        int k = grille[x][y].getNb();
        System.out.println(k);
        return colValide(k, y, position) && ligneValide(k, x, position) && valideSurBloc(k, x, y, position);
    }
}
