/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Dimension;
import static java.awt.FlowLayout.CENTER;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Clément
 */
public class Win extends JFrame {
    public Win() {
        JFrame f = new JFrame("YOUHOU !");
        f.setSize(300,300);
        ImageIcon ii = new ImageIcon("aide/homer.png");
        JLabel lab = new JLabel(ii);
        f.add(lab);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setMinimumSize(new Dimension(300, 250));
        f.setMaximumSize(new Dimension(300, 250));
        f.setLocationRelativeTo(null);
        f.setVisible(true);
}
}
