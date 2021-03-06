/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCandidato;
import dao.DaoEmpleado;
import dao.DaoProyecto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Mensajes;
import vista.VConsultaRecordPago;


/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class CConsultaRecordPago implements ActionListener {

    private final VConsultaRecordPago vrecpag;
    

    public CConsultaRecordPago() throws SQLException {
        vrecpag = new VConsultaRecordPago();
        vrecpag.setVisible(true);
        vrecpag.Agregar_Listener(this);
        
        CargarProyectos();
        CargarEmpleados();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vrecpag.getRadiobtnProyecto())) {

            vrecpag.getCmbboxProyectoConsultar().setVisible(true);
            vrecpag.getBtnConsultarProyecto().setVisible(true);
            vrecpag.getLblNombreProyectoConsultar().setVisible(true);

            vrecpag.getCmbboxEmpleadoConsultar().setSelectedIndex(0);
            vrecpag.getLblNombreEmpleadoConsultar().setVisible(false);
            vrecpag.getCmbboxEmpleadoConsultar().setVisible(false);
            vrecpag.getBtnConsultarEmpleado().setVisible(false);
            vrecpag.getScrollpanReporteEmpleado().setVisible(false);
            vrecpag.getTxtSalario().setVisible(false);
            vrecpag.getTxtTipoDePago().setVisible(false);
            vrecpag.getTxtTipoDeMoneda().setVisible(false);
            vrecpag.getLblSalario().setVisible(false);
            vrecpag.getLblTipoDePago().setVisible(false);
            vrecpag.getLblTipoDeMoneda().setVisible(false);

            vrecpag.getCmbboxMesConsultar().setSelectedIndex(0);
            vrecpag.getLblMesConsultar().setVisible(false);
            vrecpag.getCmbboxMesConsultar().setVisible(false);
            vrecpag.getBtnConsultarMes().setVisible(false);
            vrecpag.getLblHorasLaborables().setVisible(false);
            vrecpag.getTxtHorasLaborables().setVisible(false);
            vrecpag.getScrollpaneReporteMes().setVisible(false);
        }

        if (e.getSource().equals(vrecpag.getBtnConsultarProyecto())) {

            if (vrecpag.getCmbboxProyectoConsultar().getSelectedItem().equals("...")) {

                Mensajes.Aviso("Debe seleccionar un proyecto a consultar", "Aviso");
                vrecpag.getScrollpanReporteProyecto().setVisible(false);
           
            } else {
               
                vrecpag.getScrollpanReporteProyecto().setVisible(true);    
            }

        }
        
        
        

        if (e.getSource().equals(vrecpag.getRadiobtnEmpleado())) {

            vrecpag.getCmbboxProyectoConsultar().setSelectedIndex(0);
            vrecpag.getCmbboxProyectoConsultar().setVisible(false);

            vrecpag.getBtnConsultarProyecto().setVisible(false);
            vrecpag.getLblNombreProyectoConsultar().setVisible(false);
            vrecpag.getScrollpanReporteProyecto().setVisible(false);

            vrecpag.getLblNombreEmpleadoConsultar().setVisible(true);
            vrecpag.getCmbboxEmpleadoConsultar().setVisible(true);
            vrecpag.getBtnConsultarEmpleado().setVisible(true);

            vrecpag.getCmbboxMesConsultar().setSelectedIndex(0);
            vrecpag.getLblMesConsultar().setVisible(false);
            vrecpag.getCmbboxMesConsultar().setVisible(false);
            vrecpag.getBtnConsultarMes().setVisible(false);
            vrecpag.getLblHorasLaborables().setVisible(false);
            vrecpag.getTxtHorasLaborables().setVisible(false);
            vrecpag.getScrollpaneReporteMes().setVisible(false);
        }

        if (e.getSource().equals(vrecpag.getBtnConsultarEmpleado())) {

            if (vrecpag.getCmbboxEmpleadoConsultar().getSelectedItem().equals("...")) {

                Mensajes.Aviso("Debe seleccionar un empleado a consultar", "Aviso");
                vrecpag.getScrollpanReporteEmpleado().setVisible(false);
                vrecpag.getScrollpanReporteEmpleado().setVisible(false);
                vrecpag.getTxtSalario().setVisible(false);
                vrecpag.getTxtTipoDePago().setVisible(false);
                vrecpag.getTxtTipoDeMoneda().setVisible(false);
                vrecpag.getLblSalario().setVisible(false);
                vrecpag.getLblTipoDePago().setVisible(false);
                vrecpag.getLblTipoDeMoneda().setVisible(false);

            } else {

                vrecpag.getScrollpanReporteEmpleado().setVisible(false);
                vrecpag.getTxtSalario().setVisible(true);
                vrecpag.getTxtTipoDePago().setVisible(true);
                vrecpag.getTxtTipoDeMoneda().setVisible(true);
                vrecpag.getLblSalario().setVisible(true);
                vrecpag.getLblTipoDePago().setVisible(true);
                vrecpag.getLblTipoDeMoneda().setVisible(true);
                vrecpag.getScrollpanReporteEmpleado().setVisible(true);
            }

        }

        if (e.getSource().equals(vrecpag.getRadiobtnMes())) {

            vrecpag.getCmbboxProyectoConsultar().setSelectedIndex(0);
            vrecpag.getCmbboxProyectoConsultar().setVisible(false);
            vrecpag.getBtnConsultarProyecto().setVisible(false);
            vrecpag.getLblNombreProyectoConsultar().setVisible(false);
            vrecpag.getScrollpanReporteProyecto().setVisible(false);

            vrecpag.getCmbboxEmpleadoConsultar().setSelectedIndex(0);
            vrecpag.getLblNombreEmpleadoConsultar().setVisible(false);
            vrecpag.getCmbboxEmpleadoConsultar().setVisible(false);
            vrecpag.getBtnConsultarEmpleado().setVisible(false);
            vrecpag.getScrollpanReporteEmpleado().setVisible(false);
            vrecpag.getTxtSalario().setVisible(false);
            vrecpag.getTxtTipoDePago().setVisible(false);
            vrecpag.getTxtTipoDeMoneda().setVisible(false);
            vrecpag.getLblSalario().setVisible(false);
            vrecpag.getLblTipoDePago().setVisible(false);
            vrecpag.getLblTipoDeMoneda().setVisible(false);

            vrecpag.getLblMesConsultar().setVisible(true);
            vrecpag.getCmbboxMesConsultar().setVisible(true);
            vrecpag.getBtnConsultarMes().setVisible(true);

        }
        
       if (e.getSource().equals(vrecpag.getBtnConsultarMes())) {

            if (vrecpag.getCmbboxMesConsultar().getSelectedItem().equals("...")) {

                Mensajes.Aviso("Debe seleccionar un mes a consultar", "Aviso");
                vrecpag.getScrollpaneReporteMes().setVisible(false);
                
                vrecpag.getLblHorasLaborables().setVisible(false);
                vrecpag.getTxtHorasLaborables().setVisible(false);

            } else {
                vrecpag.getLblHorasLaborables().setVisible(true);
                vrecpag.getTxtHorasLaborables().setVisible(true);

                vrecpag.getScrollpaneReporteMes().setVisible(true);
               
            }

        }

        throw new UnsupportedOperationException("Opcion no valida"); //To change body of generated methods, choose Tools | Templates.
    }

    private void CargarProyectos() throws SQLException {
        
        String nom;
        DaoProyecto daoTipo = new DaoProyecto();
        ResultSet RegistroProy;
        RegistroProy = daoTipo.ConsultarProyectos();

        while (RegistroProy.next()) {
            String estatus = "A";
            if (RegistroProy.getString("ProyEstatus").equals(estatus)) {
                nom = RegistroProy.getString("ProyTitulo");
                vrecpag.getCmbboxProyectoConsultar().addItem(nom);
            }

        }

    }

    private void CargarEmpleados() throws SQLException {
         String nom;
        DaoCandidato daoTipo = new DaoCandidato();
        ResultSet RegistroEmp;
        RegistroEmp = daoTipo.ConsultarCandidatos();

        while (RegistroEmp.next()) {
            String estatus = "A";
            if (RegistroEmp.getString("CanEstatus").equals(estatus)) {
                nom = RegistroEmp.getString("CanNombres");
                vrecpag.getCmbboxEmpleadoConsultar().addItem(nom);
            }
    }
}
}