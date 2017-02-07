/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Clément
 */

public class Bouton extends JButton implements ActionListener {
    
    Case carre;
    Grille grid;
    
    public Bouton(Grille grid, Case carre){
        this.carre = carre;
        this.grid = grid;
        addActionListener(this);

        if (carre.getFixe())
            setBackground(Color.WHITE);
        
        if (carre.getNb() == 0)
            setText(" ");
        else
            setText(carre.toString());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!carre.getFixe()){
            int value = carre.getNb();
            if (value == 9){
                setText(" ");
                carre.setNb(0);
            }
            else{
                value++;
                carre.setNb(value);
                setText(carre.toString());
            }
            if (grid.grilleValide()){
                Win win = new Win();
            }
        }
    }
    
    
}
