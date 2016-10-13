/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author jesus
 */
import vista.VRegistrarFaltas;
import java.awt.event.*;
import dao.DaoRegFaltas;
import javax.swing.JTextField;
import modelo.MFaltas;


public class CRegistrarFaltas implements ActionListener{
    VRegistrarFaltas vregistrar = new VRegistrarFaltas();
    DaoRegFaltas confalta= new DaoRegFaltas();
    MFaltas mregfalta = new MFaltas();
    

    public CRegistrarFaltas() {
        this.vregistrar = new VRegistrarFaltas();
        this.confalta = new DaoRegFaltas();
        this.mregfalta = new MFaltas();
        this.vregistrar.btnregistrar.addActionListener(this);
        this.vregistrar.btncancelar.addActionListener(this);
        this.vregistrar.btnsalir.addActionListener(this);
        
        vregistrar.setVisible(true);
               
    }
     public void inicializar(){
         vregistrar.getJctipo().setSelectedIndex(0);
         ((JTextField)vregistrar.getJdatefecha().getDateEditor()).setText("");
         vregistrar.getJtcedula().setText("");
         vregistrar.getJtdescrip().setText("");
         
     }    

    public void Registrardatos(){
        mregfalta.setCedula(vregistrar.jtcedula.getText());
        mregfalta.setFecha(vregistrar.jdatefecha.getDate());
        mregfalta.setTipo((String) vregistrar.jctipo.getSelectedItem());
        mregfalta.setDescripcion(vregistrar.jtdescrip.getText());
        confalta.Registrarfal(mregfalta);
                
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vregistrar.getBtnregistrar())) {
            Registrardatos();
            inicializar();
            }
        if(e.getSource().equals(vregistrar.getBtnsalir())) {
            vregistrar.dispose();
            return;
            
            }
         if (e.getSource().equals(vregistrar.getBtncancelar())) {
            inicializar();
            return;
            
        }

}
}