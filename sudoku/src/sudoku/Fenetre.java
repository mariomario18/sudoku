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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Clément
 */
public class Fenetre extends JFrame implements ActionListener{
    Grille grille;
    public void actionPerformed(ActionEvent e){
        System.out.print("lol");
        
        JMenuItem source = (JMenuItem)(e.getSource());
        String nom = source.getText();
        System.out.println(nom);
        
        if(nom == "Ouvrir"){
            ouvrir();
        }
       
        if(nom == "Fermer"){
            System.exit(0);
        }
        
        if(nom == "Enregistrer"){
           enregistrer(grille);
        }
        
        
        if(nom == "Enregistrer sous"){
           enregistrerSous(grille); 
        }
        
        if(nom == "Résoudre le sudoku"){
            
        }
        
        if(nom == "Règles"){
            Aide aide = new Aide();
        }
    
    }
    public Fenetre(Grille grille){
        this.grille=grille;
        this.setTitle("Sudoku de folie");
        this.setSize(700, 700);
        this.setMinimumSize(new Dimension(700, 700));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Fichier");
        JMenu menu1 = new JMenu("Aide");
        JMenuItem menuItem = new JMenuItem("Ouvrir");
        menuItem.addActionListener(this);
        JMenuItem menuItem1 = new JMenuItem("Fermer");
        menuItem1.addActionListener(this);
        JMenuItem menuItem2 = new JMenuItem("Enregistrer");
        menuItem2.addActionListener(this);
        JMenuItem menuItem3 = new JMenuItem("Enregistrer sous");
        menuItem3.addActionListener(this);
        JMenuItem menuItem4 = new JMenuItem("Résoudre le sudoku");
        menuItem4.addActionListener(this);
        JMenuItem menuItem5 = new JMenuItem("Règles");
        menuItem5.addActionListener(this);
        menu.add(menuItem);
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menu1.add(menuItem5);
        menuBar.add(menu);
        menuBar.add(menu1);
        setJMenuBar(menuBar);
        

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

        JPanel content = new JPanel();

        content.setBackground(Color.WHITE);

        content.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        content.add(cell1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        content.add(cell2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        content.add(cell3, gbc);        

        gbc.gridx = 0; 
        gbc.gridy = 1;
        content.add(cell4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        content.add(cell5, gbc);

        gbc.gridx = 2;
        gbc.gridheight = 1;
        content.add(cell6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        content.add(cell7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        content.add(cell8, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        content.add(cell9, gbc);
        //On ajoute le conteneur

        this.setContentPane(content);

        this.setVisible(true);      
    
    }
    
    public boolean enregistrer(Grille grille){
       Path file = FileSystems.getDefault().getPath("grid", "solution.txt");
          Charset charset = Charset.forName("UTF-8");
                try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++){                 
                            writer.write(grille.grille[i][j].toString(), 0, grille.grille[i][j].toString().length());
                            writer.write(",", 0, 1);
                        }
                        writer.write("\n", 0, 1);
                    }
                    return true;
                } catch (IOException x) {
                    System.err.format("Une erreur s'est produite lors de l'écriture du fichier...", x);
                }
           
                return false;
    }
    
    public void enregistrerSous (Grille grille){
        
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt file","txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showSaveDialog(this);
            
            if(returnVal==JFileChooser.APPROVE_OPTION){
                File file = chooser.getSelectedFile();
 
                try (FileWriter writer = new FileWriter(file+".txt")) {
                    for (int i = 0; i < 9; i++) {
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
    }
    
    public void ouvrir(){
        JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt file","txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            
            if(returnVal==JFileChooser.APPROVE_OPTION){
                File file = chooser.getSelectedFile();
                Path path = file.toPath();
                Charset charset = Charset.forName("UTF-8");
                try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
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
                    grille.setGrille(tab);
                    grille.displayGrille();
                }
                catch (IOException x) {
                    System.err.format("Le fichier de la grille n'a pas pu être ouvert...", x);
        }
    }
    
    } 
    
}
