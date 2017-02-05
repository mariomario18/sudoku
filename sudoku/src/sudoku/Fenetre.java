package sudoku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Clément
 */
public class Fenetre extends JFrame{
    
    public Fenetre(Grille grille){
        
        this.setTitle("Sudoku de folie");
        this.setSize(616, 639);
        this.setMinimumSize(new Dimension(616, 639));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JPanel cell1 = new JPanel();
        cell1.setLayout(new GridLayout(3, 3));
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                cell1.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell1.setBackground(Color.GRAY);
        cell1.setPreferredSize(new Dimension(200, 200));      

        JPanel cell2 = new JPanel();
        cell2.setLayout(new GridLayout(3, 3));
        for(int i=0;i<3;i++){
            for (int j = 3; j < 6; j++) {
                cell2.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell2.setBackground(Color.LIGHT_GRAY);
        cell2.setPreferredSize(new Dimension(200, 200));

        JPanel cell3 = new JPanel();
        cell3.setLayout(new GridLayout(3, 3));        
        for(int i=0;i<3;i++){
            for (int j = 6; j < 9; j++) {
                cell3.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell3.setBackground(Color.GRAY);
        cell3.setPreferredSize(new Dimension(200, 200));

        JPanel cell4 = new JPanel();
        cell4.setLayout(new GridLayout(3, 3));     
        for(int i=3;i<6;i++){
            for (int j = 0; j < 3; j++) {
                cell4.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell4.setBackground(Color.LIGHT_GRAY);
        cell4.setPreferredSize(new Dimension(200, 200));

        JPanel cell5 = new JPanel();
        cell5.setLayout(new GridLayout(3, 3));
        for(int i=3;i<6;i++){
            for (int j = 3; j < 6; j++) {
                cell5.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell5.setBackground(Color.GRAY);
        cell5.setPreferredSize(new Dimension(200, 200));

        JPanel cell6 = new JPanel();
        cell6.setLayout(new GridLayout(3, 3));
        for(int i=3;i<6;i++){
            for (int j = 6; j < 9; j++) {
                cell6.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell6.setBackground(Color.LIGHT_GRAY);
        cell6.setPreferredSize(new Dimension(200, 200));

        JPanel cell7 = new JPanel();
        cell7.setLayout(new GridLayout(3, 3));
        for(int i=6;i<9;i++){
            for (int j = 0; j < 3; j++) {
                cell7.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell7.setBackground(Color.GRAY);
        cell7.setPreferredSize(new Dimension(200, 200));

        JPanel cell8 = new JPanel();
        cell8.setLayout(new GridLayout(3, 3));
        for(int i=6;i<9;i++){
            for (int j = 3; j < 6; j++) {
                cell8.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell8.setBackground(Color.LIGHT_GRAY);
        cell8.setPreferredSize(new Dimension(200, 200));

        JPanel cell9 = new JPanel();
        cell9.setLayout(new GridLayout(3, 3));
        for(int i=6;i<9;i++){
            for (int j = 6; j < 9; j++) {
                cell9.add(new Bouton(grille.grille[i][j]));
            }
        }
        cell9.setBackground(Color.GRAY);
        cell9.setPreferredSize(new Dimension(200,200));



        //Le conteneur principal

        JPanel content = new JPanel();

        //content.setPreferredSize(new Dimension(600, 600));

        content.setBackground(Color.WHITE);

        //On définit le layout manager

        content.setLayout(new GridBagLayout());



        //L'objet servant à positionner les composants

        GridBagConstraints gbc = new GridBagConstraints();



        //On positionne la case de départ du composant

        gbc.gridx = 0;

        gbc.gridy = 0;

        //La taille en hauteur et en largeur

        gbc.gridheight = 1;

        gbc.gridwidth = 1;

        content.add(cell1, gbc);

        //---------------------------------------------

        gbc.gridx = 1;

        gbc.gridy = 0;

        content.add(cell2, gbc);

        //---------------------------------------------

        gbc.gridx = 2;

        gbc.gridy = 0;

        content.add(cell3, gbc);        

        //---------------------------------------------

        //Cette instruction informe le layout que c'est une fin de ligne

        //gbc.gridwidth = GridBagConstraints.REMAINDER;

        gbc.gridx = 0; 

        gbc.gridy = 1;

        content.add(cell4, gbc);

        //---------------------------------------------

        gbc.gridx = 1;

        gbc.gridy = 1;

        gbc.gridwidth = 1;

        gbc.gridheight = 1;

        //Celle-ci indique que la cellule se réplique de façon verticale

        //gbc.fill = GridBagConstraints.VERTICAL;

        content.add(cell5, gbc);

        //---------------------------------------------

        gbc.gridx = 2;

        gbc.gridheight = 1;

        //Celle-ci indique que la cellule se réplique de façon horizontale

        //gbc.fill = GridBagConstraints.HORIZONTAL;

        //gbc.gridwidth = GridBagConstraints.REMAINDER;

        content.add(cell6, gbc);

        //---------------------------------------------

        gbc.gridx = 0;

        gbc.gridy = 2;

        //gbc.gridwidth = 1;

        content.add(cell7, gbc);

        //---------------------------------------------

        gbc.gridx = 1;

        gbc.gridy = 2;

        //gbc.gridwidth = GridBagConstraints.REMAINDER;

        content.add(cell8, gbc);

        //---------------------------------------------
        gbc.gridx = 2;

        gbc.gridy = 2;

        content.add(cell9, gbc);
        //On ajoute le conteneur

        this.setContentPane(content);

        this.setVisible(true);      
    
    }
    
    
    
}
