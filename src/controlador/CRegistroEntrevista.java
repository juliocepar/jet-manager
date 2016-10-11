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

import vista.VRegistroEntrevista;

/**
 *
 * @author Vicky
 */
public class CRegistroEntrevista implements ActionListener, KeyListener {

    private  static VRegistroEntrevista vre;
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource().equals(vre.getBtnSalir())){
            vre.dispose();
        }
        if(e.getSource().equals(vre.getBtnCancelar())){
            this.Limpiar();
        }
    }
    
    public CRegistroEntrevista(){
        vre= new VRegistroEntrevista();
        vre.setLocationRelativeTo(null);
        vre.setVisible(true);	
        vre.agregarListener(this);
   //Limpar los campos del formulario
   
        
  //Agregar listener al cuadro de texto del rif
  
    vre.getTxtIDCandidato().addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
                soloNumeros(e);
            }
    });
    vre.getTxtSalOfer().addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e) {
                soloNumeros(e);
            }
    });
    
        vre.getTxtSalPret().addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e) {
                soloNumeros(e);
            }
    });
      
    }
    public void Limpiar(){
       vre.getTxtIDCandidato().setEditable(true);
       vre.getTxtIDCandidato().setText("");
       vre.getTxtNomCandidato().setText("");
       vre.getBtnBuscar().setEnabled(true);
       vre.getCmbTitProy().setSelectedItem("...");
       vre.getCmbCargoAsp().setSelectedIndex(0);
       vre.getTxtSalPret().setText("");
       vre.getTxtSalOfer().setText("");
       vre.getDTPFechaEntrevista().setCalendar(null);
       vre.getCmbTipo().setSelectedIndex(0);
       vre.getTxtEntrevistador().setText("");
       vre.getTxtObservaciones().setText("");
       
   }
    public void soloNumeros(KeyEvent e){
        
        char tecla= e.getKeyChar();
        
        if (Character.isLetter(tecla)){
            e.consume();  }
       
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
