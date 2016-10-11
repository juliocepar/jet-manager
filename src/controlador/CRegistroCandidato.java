/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
import vista.VRegistroCandidato;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class CRegistroCandidato implements ActionListener, KeyListener, ItemListener {

   private VRegistroCandidato vregcan;

    public CRegistroCandidato() {
        this.vregcan = new VRegistroCandidato();
        vregcan.agregarListener((ActionListener) this);
        vregcan.agregarItemListener((ItemListener) this);
        vregcan.setVisible(true);
        
        vregcan.getTxtRif().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxtRif().getText().length() >= 9) {
                            e.consume();
                        }

                        char c = e.getKeyChar();
                        if(!Character.isDigit(c)) {
                            e.consume();
                        }
                    }
                });
        
        vregcan.getTxtNombres().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxtNombres().getText().length() >= 25) {
                            e.consume();
                        }

                        char c = e.getKeyChar();
                        if(!Character.isLetter(c)) {
                            e.consume();
                        }
                    }
                });
        
        vregcan.getTxtApellidos().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxtApellidos().getText().length() >= 25) {
                            e.consume();
                        }

                        char c = e.getKeyChar();
                        if(!Character.isLetter(c)) {
                            e.consume();
                        }
                    }
                });
        
        vregcan.getTxaDireccion().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxaDireccion().getText().length() >= 80) {
                            e.consume();
                        }
                    }
                });
        
        vregcan.getTxtCiudad().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxtCiudad().getText().length() >= 30) {
                            e.consume();
                        }
                        
                        char c = e.getKeyChar();
                        if(!Character.isLetter(c)) {
                            e.consume();
                        }
                    }
                });
        
        vregcan.getTxtCorreo().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxtCorreo().getText().length() >= 30) {
                            e.consume();
                        }
                        
                        char c = e.getKeyChar();
                        if(Character.isWhitespace(c)) {
                            e.consume();
                        }
                    }
                });
     
        vregcan.getTxtTelefono().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        if(vregcan.getTxtCorreo().getText().length() >= 11) {
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

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource().equals(vregcan.getCmbPais())) {
            if(vregcan.getCmbPais().getItemAt(186).equals(vregcan.getCmbPais().getSelectedItem())) {
                vregcan.getLblCodTelefono().setText("+58");
            }
        }
        //NO QUITAR el comentario de la siguiente línea:
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
