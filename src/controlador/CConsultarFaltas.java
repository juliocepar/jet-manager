/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import vista.VConsultarFaltas;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.MFaltas;
import dao.DaoRegFaltas;
import javax.swing.JTextField;
/**
 *
 * @author jesus
 */
public class CConsultarFaltas implements ActionListener{
    VConsultarFaltas vfalta = new VConsultarFaltas();
    MFaltas mfalta = new MFaltas();
    DaoRegFaltas daofalta= new DaoRegFaltas();
    
    
    public CConsultarFaltas(){
        this.mfalta = new MFaltas();
        this.vfalta = new VConsultarFaltas();
        this.daofalta = new DaoRegFaltas();
        vfalta.setVisible(true);
        this.vfalta.btnconsultar.addActionListener(this);
        this.vfalta.btncancelar.addActionListener(this);
        this.vfalta.btnsalir.addActionListener(this);  
        vfalta.jtcedula.setVisible(false);
        vfalta.jdfefi.setVisible(false);
        vfalta.jdfeini.setVisible(false);
        
    }
    public void inicializar(){
         ((JTextField)vfalta.getJdfefi().getDateEditor()).setText("");
         ((JTextField)vfalta.getJdfeini().getDateEditor()).setText("");
         vfalta.getJtcedula().setText("");
         DefaultTableModel tablaini = (DefaultTableModel) vfalta.getjTable1().getModel();
         tablaini.setNumRows(0);
         
         
     }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(e.getSource().equals(vfalta.getJrce())){
            vfalta.getJlce().setVisible(true);
            vfalta.getJtcedula().setVisible(true);
            
        }
        if(e.getSource().equals(vfalta.getJrfe())){
            vfalta.getJlfe().setVisible(true);
            vfalta.getJdfeini().setVisible(true);
            vfalta.getJdfefi().setVisible(true);
        }
        
        
    }
    
}
