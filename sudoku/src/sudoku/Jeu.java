/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author youma
 */
public class Jeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Path file = FileSystems.getDefault().getPath("grid", "grid.txt");
        Charset charset = Charset.forName("UTF-8");
        
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            
            Case[][] tab = new Case[9][9];
                
            int k = 0;
            int i = 0;
            int position;
            
            while ((line = reader.readLine()) != null) {
                k = 0;
                String[] split = line.split(",");
                for (int j = 0; j < 9; j++) {
                    int nb = Integer.parseInt(split[k]);
                    position = (i*9) + j;
                    if (nb != 0)
                        tab[i][j] = new Case(nb, true, position);
                    else
                        tab[i][j] = new Case(nb, position);
                    k++;
                }
                i++;      
            }
            
            Grille grille = new Grille(tab);
            Fenetre fen = new Fenetre(grille);
            grille.displayGrille();       
        }catch (IOException x) {
            System.err.format("Le fichier de la grille n'a pas pu être ouvert...", x);
        }
    }
    
}
