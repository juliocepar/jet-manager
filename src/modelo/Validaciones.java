/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.KeyEvent;

/**
 *
 * @author Vicky
 */
public class Validaciones {
        public void soloNumeros(KeyEvent e){
        
        char tecla= e.getKeyChar();
        
        if (Character.isLetter(tecla)){
            e.consume();  }
       
    }
        public void soloLetras(KeyEvent e){
            char tecla= e.getKeyChar();
            if(Character.isDigit(tecla)){
                e.consume();
                
            }
        }
}
