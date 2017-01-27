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
public class Zone extends ArrayList<Case>{
    
    public ArrayList<Case> z;
    
    public Zone(ArrayList<Case> z){
        this.z = z;     
    }
    
    public String ToString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            str.append(z.get(i));   
        }
        return str.toString();        
    }
}
