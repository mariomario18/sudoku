/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;

/**
 *
 * @author youma
 */
public class Zone{
    
    public ArrayList<Case> z;
    
    /*public Zone(){
        this.z = z;
    }*/
    
    public void setZ(){
        int k = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    z.add();
                    System.out.println(z);
                    k++;
                }
                k++;
            }
    }
    
    
    public String ToString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.z.size(); i++) {
            str.append(this.z.get(i));
            System.out.println(this);
        }
        return str.toString();        
    }
}
