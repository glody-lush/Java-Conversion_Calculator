/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lushombo
 */

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MainGui gui = new MainGui();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(603,500);
        gui.setLocationRelativeTo(null);
        
               
    }
   
    
}
