/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import vista.Mensajes;
import vista.VConsultarRecordUtilidad;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class ControladorVConsultarRecordUtilidad implements ActionListener{
    
      private final VConsultarRecordUtilidad vrecuti;

    public ControladorVConsultarRecordUtilidad() throws SQLException {
        
        vrecuti = new VConsultarRecordUtilidad();
        vrecuti.setVisible(true);
        vrecuti.Agregar_Listener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(vrecuti.getRadiobtnProyecto())) {

             vrecuti.getCmbboxProyectoConsultar().setVisible(true);
             vrecuti.getBtnConsultarProyecto().setVisible(true);
             vrecuti.getLblNombreProyectoConsultar().setVisible(true);

             vrecuti.getCmbboxMesConsultar().setSelectedIndex(0);
             vrecuti.getLblMesConsultar().setVisible(false);
             vrecuti.getCmbboxMesConsultar().setVisible(false);
             vrecuti.getBtnConsultarMes().setVisible(false);
             vrecuti.getLblHorasLaborables().setVisible(false);
             vrecuti.getTxtHorasLaborables().setVisible(false);
             vrecuti.getScrollpaneReporteMes().setVisible(false);
        }
        
        if (e.getSource().equals(vrecuti.getBtnConsultarProyecto())) {

            if (vrecuti.getCmbboxProyectoConsultar().getSelectedItem()
                    .equals("...")) {

                Mensajes.Aviso("Debe seleccionar un proyecto a consultar", 
                        "Aviso");
                
                vrecuti.getScrollpanReporteProyecto().setVisible(false);

            } else {

                vrecuti.getScrollpanReporteProyecto().setVisible(true);
            }

        }
        
         if (e.getSource().equals(vrecuti.getRadiobtnMes())) {

            vrecuti.getCmbboxProyectoConsultar().setSelectedIndex(0);
            vrecuti.getCmbboxProyectoConsultar().setVisible(false);
            vrecuti.getBtnConsultarProyecto().setVisible(false);
            vrecuti.getLblNombreProyectoConsultar().setVisible(false);
            vrecuti.getScrollpanReporteProyecto().setVisible(false);

            vrecuti.getLblMesConsultar().setVisible(true);
            vrecuti.getCmbboxMesConsultar().setVisible(true);
            vrecuti.getBtnConsultarMes().setVisible(true);

        }
        
       if (e.getSource().equals(vrecuti.getBtnConsultarMes())) {

            if (vrecuti.getCmbboxMesConsultar().getSelectedItem()
                    .equals("...")) {

                Mensajes.Aviso("Debe seleccionar un mes a consultar", "Aviso");
                vrecuti.getScrollpaneReporteMes().setVisible(false);
                
                vrecuti.getLblHorasLaborables().setVisible(false);
                vrecuti.getTxtHorasLaborables().setVisible(false);

            } else {
                vrecuti.getLblHorasLaborables().setVisible(true);
                vrecuti.getTxtHorasLaborables().setVisible(true);

                vrecuti.getScrollpaneReporteMes().setVisible(true);
               
            }

        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
