/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class VMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VMenuPrincipal
     */
    public VMenuPrincipal() {
        initComponents();
    }

    public JButton getBtnAsignarCandidato() {
        return btnAsignarCandidato;
    }

    public JButton getBtnConsultarCandidatos() {
        return btnConsultarCandidatos;
    }

    public JButton getBtnConsultarCliente() {
        return btnConsultarCliente;
    }

    public JButton getBtnConsultarEntrevista() {
        return btnConsultarEntrevista;
    }

    public JButton getBtnConsultarFaltas() {
        return btnConsultarFaltas;
    }

    public JButton getBtnConsultarRecordPagos() {
        return btnConsultarRecordPagos;
    }

    public JButton getBtnConsultarRecordUtilidad() {
        return btnConsultarRecordUtilidad;
    }

    public JButton getBtnRegistrarCandidato() {
        return btnRegistrarCandidato;
    }

    public JButton getBtnRegistrarCliente() {
        return btnRegistrarCliente;
    }

    public JButton getBtnRegistrarEntrevista() {
        return btnRegistrarEntrevista;
    }

    public JButton getBtnRegistrarFaltas() {
        return btnRegistrarFaltas;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
// Empieza el menu
    public JMenuItem getJmenAsignarCandidato() {
        return jmenAsignarCandidato;
    }

    public JMenu getJmenBalances() {
        return jmenBalances;
    }

    public JMenuItem getJmenConsultarEntrevistas() {
        return jmenConsultarEntrevistas;
    }

    public JMenuItem getJmenConsultarFaltas() {
        return jmenConsultarFaltas;
    }

    public JMenuItem getJmenConsultarHorasLaboradas() {
        return jmenConsultarHorasLaboradas;
    }

    public JMenuItem getJmenDiasFeriados() {
        return jmenDiasFeriados;
    }

    public JMenu getJmenGeneral() {
        return jmenGeneral;
    }

    public JMenu getJmenGestionarCandidato() {
        return jmenGestionarCandidato;
    }

    public JMenu getJmenNomina() {
        return jmenNomina;
    }

    public JMenuItem getJmenPagoNomina() {
        return jmenPagoNomina;
    }

    public JMenuItem getJmenRecordPagos() {
        return jmenRecordPagos;
    }

    public JMenuItem getJmenRecordUtilidad() {
        return jmenRecordUtilidad;
    }

    public JMenuItem getJmenRegistrarCandidato() {
        return jmenRegistrarCandidato;
    }

    public JMenuItem getJmenRegistrarEntrevistas() {
        return jmenRegistrarEntrevistas;
    }

    public JMenuItem getJmenRegistrarFaltas() {
        return jmenRegistrarFaltas;
    }

    
    
    
    
    public void agregarListener(ActionListener accion){
    this.btnConsultarCliente.addActionListener(accion);
    this.btnConsultarEntrevista.addActionListener(accion);
    this.btnConsultarFaltas.addActionListener(accion);
    this.btnConsultarRecordPagos.addActionListener(accion);
    this.btnConsultarRecordUtilidad.addActionListener(accion);
    this.btnSalir.addActionListener(accion);
    this.btnRegistrarCandidato.addActionListener(accion);
    this.btnRegistrarCliente.addActionListener(accion);
    this.btnRegistrarEntrevista.addActionListener(accion);
    this.btnRegistrarFaltas.addActionListener(accion);
    this.btnSalir.addActionListener(accion);
    this.jmenAsignarCandidato.addActionListener(accion);
    this.jmenConsultarEntrevistas.addActionListener(accion);
    this.jmenConsultarFaltas.addActionListener(accion);
    this.jmenConsultarHorasLaboradas.addActionListener(accion);
    this.jmenDiasFeriados.addActionListener(accion);
    this.jmenGestionarCandidato.addActionListener(accion);
    this.jmenPagoNomina.addActionListener(accion);
    this.jmenRecordPagos.addActionListener(accion);
    this.jmenRecordUtilidad.addActionListener(accion);
    this.jmenRegistrarCandidato.addActionListener(accion);
    this.jmenRegistrarEntrevistas.addActionListener(accion);
    this.jmenRegistrarFaltas.addActionListener(accion);
    this.btnConsultarCandidatos.addActionListener(accion);
    this.btnAsignarCandidato.addActionListener(accion);
    
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnRegistrarFaltas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistrarCandidato = new javax.swing.JButton();
        btnRegistrarEntrevista = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnConsultarEntrevista = new javax.swing.JButton();
        btnConsultarFaltas = new javax.swing.JButton();
        btnConsultarRecordPagos = new javax.swing.JButton();
        btnConsultarRecordUtilidad = new javax.swing.JButton();
        btnConsultarCandidatos = new javax.swing.JButton();
        btnAsignarCandidato = new javax.swing.JButton();
        jpanEncabezado = new javax.swing.JPanel();
        lblRegistrarCandidato = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenGeneral = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jmenDiasFeriados = new javax.swing.JMenuItem();
        jmenRecursoHumano = new javax.swing.JMenu();
        jmenGestionarCandidato = new javax.swing.JMenu();
        jmenRegistrarCandidato = new javax.swing.JMenuItem();
        jmenAsignarCandidato = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmenRegistrarEntrevistas = new javax.swing.JMenuItem();
        jmenConsultarEntrevistas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmenRegistrarFaltas = new javax.swing.JMenuItem();
        jmenConsultarFaltas = new javax.swing.JMenuItem();
        jmenConsultarHorasLaboradas = new javax.swing.JMenuItem();
        jmenNomina = new javax.swing.JMenu();
        jmenPagoNomina = new javax.swing.JMenuItem();
        jmenBalances = new javax.swing.JMenu();
        jmenRecordPagos = new javax.swing.JMenuItem();
        jmenRecordUtilidad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panMenu.setBackground(new java.awt.Color(51, 51, 51));
        panMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panMenu.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 150));

        btnRegistrarFaltas.setBackground(new java.awt.Color(255, 153, 51));
        btnRegistrarFaltas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRegistrarFaltas.setText("Registrar Faltas");
        btnRegistrarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFaltasActionPerformed(evt);
            }
        });
        panMenu.add(btnRegistrarFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, -1));

        btnSalir.setBackground(new java.awt.Color(255, 153, 51));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panMenu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        btnRegistrarCandidato.setBackground(new java.awt.Color(255, 153, 51));
        btnRegistrarCandidato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRegistrarCandidato.setText("Gestionar Candidato");
        btnRegistrarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCandidatoActionPerformed(evt);
            }
        });
        panMenu.add(btnRegistrarCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, -1));

        btnRegistrarEntrevista.setBackground(new java.awt.Color(255, 153, 51));
        btnRegistrarEntrevista.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRegistrarEntrevista.setText("Registrar Entrevista");
        btnRegistrarEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntrevistaActionPerformed(evt);
            }
        });
        panMenu.add(btnRegistrarEntrevista, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 170, -1));

        btnRegistrarCliente.setBackground(new java.awt.Color(255, 153, 51));
        btnRegistrarCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRegistrarCliente.setText("Registrar Cliente");
        panMenu.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 170, -1));

        btnConsultarCliente.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultarCliente.setText("Consultar Cliente");
        panMenu.add(btnConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 170, -1));

        btnConsultarEntrevista.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarEntrevista.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultarEntrevista.setText("Consultar Entrevista");
        panMenu.add(btnConsultarEntrevista, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, -1));

        btnConsultarFaltas.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarFaltas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultarFaltas.setText("Consultar Faltas");
        panMenu.add(btnConsultarFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 170, -1));

        btnConsultarRecordPagos.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarRecordPagos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultarRecordPagos.setText("Consultar Record de Pagos");
        btnConsultarRecordPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRecordPagosActionPerformed(evt);
            }
        });
        panMenu.add(btnConsultarRecordPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        btnConsultarRecordUtilidad.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarRecordUtilidad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultarRecordUtilidad.setText("Consultar Record de Utilidad");
        btnConsultarRecordUtilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRecordUtilidadActionPerformed(evt);
            }
        });
        panMenu.add(btnConsultarRecordUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        btnConsultarCandidatos.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarCandidatos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultarCandidatos.setText("Consultar candidatos");
        btnConsultarCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCandidatosActionPerformed(evt);
            }
        });
        panMenu.add(btnConsultarCandidatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 170, -1));

        btnAsignarCandidato.setBackground(new java.awt.Color(255, 153, 51));
        btnAsignarCandidato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAsignarCandidato.setText("Asignar Candidato");
        btnAsignarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarCandidatoActionPerformed(evt);
            }
        });
        panMenu.add(btnAsignarCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        getContentPane().add(panMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 350));

        jpanEncabezado.setBackground(new java.awt.Color(255, 153, 51));

        lblRegistrarCandidato.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato.setText("Menu Principal");

        javax.swing.GroupLayout jpanEncabezadoLayout = new javax.swing.GroupLayout(jpanEncabezado);
        jpanEncabezado.setLayout(jpanEncabezadoLayout);
        jpanEncabezadoLayout.setHorizontalGroup(
            jpanEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrarCandidato)
                .addContainerGap(531, Short.MAX_VALUE))
        );
        jpanEncabezadoLayout.setVerticalGroup(
            jpanEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanEncabezadoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegistrarCandidato)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jpanEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jmenGeneral.setText("General");

        jMenu7.setText("Gestionar");

        jMenu8.setText("Cliente");

        jMenuItem15.setText("Registrar cliente");
        jMenu8.add(jMenuItem15);

        jMenuItem16.setText("Cobro mensual");
        jMenu8.add(jMenuItem16);

        jMenu7.add(jMenu8);

        jMenuItem9.setText("Proyecto");
        jMenu7.add(jMenuItem9);

        jmenGeneral.add(jMenu7);

        jmenDiasFeriados.setText("Configurar dias feriados");
        jmenGeneral.add(jmenDiasFeriados);

        jMenuBar1.add(jmenGeneral);

        jmenRecursoHumano.setText("Recurso humano");

        jmenGestionarCandidato.setText("Gestionar candidato");

        jmenRegistrarCandidato.setText("Registrar candidato");
        jmenGestionarCandidato.add(jmenRegistrarCandidato);

        jmenAsignarCandidato.setText("Asignar candidato");
        jmenGestionarCandidato.add(jmenAsignarCandidato);

        jmenRecursoHumano.add(jmenGestionarCandidato);

        jMenu1.setText("Gestionar entrevistas");

        jmenRegistrarEntrevistas.setText("Registrar entrevistas");
        jMenu1.add(jmenRegistrarEntrevistas);

        jmenConsultarEntrevistas.setText("Consultar entrevistas");
        jMenu1.add(jmenConsultarEntrevistas);

        jmenRecursoHumano.add(jMenu1);

        jMenu3.setText("Gestionar faltas");

        jmenRegistrarFaltas.setText("Registrar faltas");
        jMenu3.add(jmenRegistrarFaltas);

        jmenConsultarFaltas.setText("Consultar faltas");
        jMenu3.add(jmenConsultarFaltas);

        jmenRecursoHumano.add(jMenu3);

        jmenConsultarHorasLaboradas.setText("Consultar horas laboradas");
        jmenRecursoHumano.add(jmenConsultarHorasLaboradas);

        jMenuBar1.add(jmenRecursoHumano);

        jmenNomina.setText("Nomina");

        jmenPagoNomina.setText("Pago de nomina");
        jmenNomina.add(jmenPagoNomina);

        jMenuBar1.add(jmenNomina);

        jmenBalances.setText("Balances");

        jmenRecordPagos.setText("Consultar record de pagos");
        jmenBalances.add(jmenRecordPagos);

        jmenRecordUtilidad.setText("Consultar record de utilidad");
        jmenBalances.add(jmenRecordUtilidad);

        jMenuBar1.add(jmenBalances);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarFaltasActionPerformed

    private void btnRegistrarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCandidatoActionPerformed

    private void btnRegistrarEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntrevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEntrevistaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsultarRecordPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRecordPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarRecordPagosActionPerformed

    private void btnConsultarRecordUtilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRecordUtilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarRecordUtilidadActionPerformed

    private void btnConsultarCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCandidatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarCandidatosActionPerformed

    private void btnAsignarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignarCandidatoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarCandidato;
    private javax.swing.JButton btnConsultarCandidatos;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarEntrevista;
    private javax.swing.JButton btnConsultarFaltas;
    private javax.swing.JButton btnConsultarRecordPagos;
    private javax.swing.JButton btnConsultarRecordUtilidad;
    private javax.swing.JButton btnRegistrarCandidato;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEntrevista;
    private javax.swing.JButton btnRegistrarFaltas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jmenAsignarCandidato;
    private javax.swing.JMenu jmenBalances;
    private javax.swing.JMenuItem jmenConsultarEntrevistas;
    private javax.swing.JMenuItem jmenConsultarFaltas;
    private javax.swing.JMenuItem jmenConsultarHorasLaboradas;
    private javax.swing.JMenuItem jmenDiasFeriados;
    private javax.swing.JMenu jmenGeneral;
    private javax.swing.JMenu jmenGestionarCandidato;
    private javax.swing.JMenu jmenNomina;
    private javax.swing.JMenuItem jmenPagoNomina;
    private javax.swing.JMenuItem jmenRecordPagos;
    private javax.swing.JMenuItem jmenRecordUtilidad;
    private javax.swing.JMenu jmenRecursoHumano;
    private javax.swing.JMenuItem jmenRegistrarCandidato;
    private javax.swing.JMenuItem jmenRegistrarEntrevistas;
    private javax.swing.JMenuItem jmenRegistrarFaltas;
    private javax.swing.JPanel jpanEncabezado;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRegistrarCandidato;
    private javax.swing.JPanel panMenu;
    // End of variables declaration//GEN-END:variables
}
