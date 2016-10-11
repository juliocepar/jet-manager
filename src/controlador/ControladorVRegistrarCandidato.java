/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import vista.VRegistrarCandidato;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class ControladorVRegistrarCandidato implements ActionListener, KeyListener {

   private VRegistrarCandidato vregcan;

    public ControladorVRegistrarCandidato() {
        this.vregcan = new VRegistrarCandidato();
        vregcan.agregarListener((ActionListener) this);
        vregcan.setVisible(true);
        
        vregcan.getTxtRif().addKeyListener(new KeyAdapter() {
                    public void KeyTyped(KeyEvent e) {
                        if(vregcan.getTxtRif().getText().length() >= 9) {
                            e.consume();
                        }

                        char c = e.getKeyChar();
                        if(!Character.isDigit(c)) {
                            e.consume();
                        }
                    }
                });
    }
   
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(vregcan.getBtnCancelar())) {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
