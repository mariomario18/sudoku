/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author youma
 */
public class Jeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Case[][] tab = new Case[9][9];
        int k = 1;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                k = (int) (Math.random() * 9 + 1);
                tab[i][j] = new Case(k, true);
            }
        }
        Grille grille = new Grille(tab);
        grille.displayGrille();*/
        
        Path file = FileSystems.getDefault().getPath("grid", "grid.txt");
        Charset charset = Charset.forName("UTF-8");
        
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            
            Case[][] tab = new Case[9][9];
                
            int k = 0;
            int i = 0;
            
            while ((line = reader.readLine()) != null) {
                k = 0;
                String[] split = line.split(",");
                for (int j = 0; j < 9; j++) {
                    int nb = Integer.parseInt(split[k]);
                    if (nb != 0)
                        tab[i][j] = new Case(nb, true);
                    else
                        tab[i][j] = new Case(nb);
                    k++;
                }
                i++;      
            }
            
            Grille grille = new Grille(tab);
            Fenetre fen = new Fenetre(grille);
            grille.displayGrille();
            
            /*if (grille.estValide(0)){
                System.out.println("Voila la solution : ");
                grille.displayGrille();
                file = FileSystems.getDefault().getPath("grid", "solution.txt");
                
                try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
                    for (i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++){                 
                            writer.write(grille.grille[i][j].toString(), 0, grille.grille[i][j].toString().length());
                            writer.write(",", 0, 1);
                        }
                        writer.write("\n", 0, 1);
                    }
                } catch (IOException x) {
                    System.err.format("Une erreur s'est produite lors de l'écriture du fichier...", x);
                }
            }
            else
                System.out.println("La grille n'est pas valide...");*/
        }
        catch (IOException x) {
            System.err.format("Le fichier de la grille n'a pas pu être ouvert...", x);
        }
    }
    
}
