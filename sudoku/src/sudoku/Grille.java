/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
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
    
    public boolean absentSurLigne (int k, int i){
        for (int j=0; j < 9; j++){
            if (grille[i][j].getNb() == k)
                return false;
        }
        return true;

    }


    public boolean absentSurColonne (int k, int j){
        for (int i=0; i < 9; i++){
            if (grille[i][j].getNb() == k)
                return false;
        }
        return true;

    }


    public boolean absentSurBloc (int k, int i, int j){
        int x = i-(i%3);
        int y = j-(j%3);

        for (i = x; i < x + 3; i++)
        {
            for (j = y; j < y + 3; j++)
            {
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

    for (int k=1; k <= 9; k++)
    {
        if (absentSurLigne(k,i) && absentSurColonne(k,j) && absentSurBloc(k,i,j)){

            grille[i][j].setNb(k);

            if ( estValide (position+1) )
                return true;
        }

    }

    grille[i][j].setNb(0);
    return false;

}
}
