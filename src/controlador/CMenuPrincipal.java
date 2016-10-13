/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.VMenuPrincipal;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class CMenuPrincipal implements ActionListener {
    
    private final VMenuPrincipal vmenprin;
  
    
    public CMenuPrincipal() throws SQLException {
        vmenprin = new VMenuPrincipal();
        vmenprin.setVisible(true);
        vmenprin.agregarListener(this);
        
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(vmenprin.getJmenRecordUtilidad())){
            try {
                new CConsultaRecordUtilidad();
            } catch (SQLException ex) {
                Logger.getLogger(CMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
         if (e.getSource().equals(vmenprin.getJmenRecordPagos())){
            try {
                new CConsultaRecordPago();
            } catch (SQLException ex) {
                Logger.getLogger(CMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    
    }
        
        
        
        
       
         if (e.getSource().equals(vmenprin.getBtnConsultarCliente())){
          
             
             //  new CConsultaCliente();  No esta implementado el constructor 
             // de este controlador
             
             
           
        
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnConsultarEntrevista())){
          //  new CConsultaEntrevista();
          
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnConsultarFaltas())){
            // new CConsultaFaltas();
           
         }
        
        if (e.getSource().equals(vmenprin.getBtnConsultarRecordPagos())){
             try {
                 new CConsultaRecordPago();
             } catch (SQLException ex) {
                 Logger.getLogger(CMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
             }
              
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnConsultarRecordUtilidad())){
            try {
                 new CConsultaRecordUtilidad();
             } catch (SQLException ex) {
                 Logger.getLogger(CMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
             }
              
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnRegistrarCandidato())){
            new CRegistroCandidato();
            
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnRegistrarCliente())){
             new CRegistroCliente();
            
         }
        
        if (e.getSource().equals(vmenprin.getBtnRegistrarEntrevista())){
            new CRegistroEntrevista();
            
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnRegistrarFaltas())){
         //   new CRegistroFaltas();
         
             
         }
        
        if (e.getSource().equals(vmenprin.getBtnSalir())){
             vmenprin.dispose();
         }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
