/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Vicky
 */
public class VRegistroEntrevista extends javax.swing.JFrame {

    /**
     * Creates new form VRegistroEntrevista
     */
    public VRegistroEntrevista() {
        initComponents();
        ((JTextField) this.DTPFechaEntrevista.getDateEditor()).setEditable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSalPret = new javax.swing.JTextField();
        txtSalOfer = new javax.swing.JTextField();
        txtEntrevistador = new javax.swing.JTextField();
        txtNomCandidato = new javax.swing.JTextField();
        txtRifCandidato = new javax.swing.JTextField();
        cmbCargoAsp = new javax.swing.JComboBox<>();
        cmbTitProy = new javax.swing.JComboBox<>();
        DTPFechaEntrevista = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        cmbRif = new javax.swing.JComboBox<>();
        jpanEncabezado1 = new javax.swing.JPanel();
        lblRegistrarCandidato1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JetManager-Registrar Entrevista");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rif");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargo Aspirado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proyecto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entrevistado por");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salario Pretendido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(Opcional)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Observaciones");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        txtSalPret.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel1.add(txtSalPret, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, 30));

        txtSalOfer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel1.add(txtSalOfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 130, 30));

        txtEntrevistador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel1.add(txtEntrevistador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 270, 30));

        txtNomCandidato.setEditable(false);
        txtNomCandidato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNomCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCandidatoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 200, 30));

        txtRifCandidato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel1.add(txtRifCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 140, 30));

        cmbCargoAsp.setEditable(true);
        cmbCargoAsp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbCargoAsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        cmbCargoAsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoAspActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCargoAsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, 30));

        cmbTitProy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTitProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTitProyActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTitProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 290, 30));

        DTPFechaEntrevista.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel1.add(DTPFechaEntrevista, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 160, 30));

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 400, 90));

        btnCancelar.setBackground(new java.awt.Color(255, 153, 51));
        btnCancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 153, 51));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salario Ofertado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de Entrevista");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        cmbTipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Presencial", "En línea" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 150, 30));

        btnSalir.setBackground(new java.awt.Color(255, 153, 51));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

        cmbRif.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbRif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "J", "E" }));
        jPanel1.add(cmbRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 760, 597));

        jpanEncabezado1.setBackground(new java.awt.Color(255, 153, 51));
        jpanEncabezado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarCandidato1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato1.setText("REGISTRAR ENTREVISTAS");
        jpanEncabezado1.add(lblRegistrarCandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        getContentPane().add(jpanEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomCandidatoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbTitProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTitProyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTitProyActionPerformed

    private void cmbCargoAspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoAspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoAspActionPerformed

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
            java.util.logging.Logger.getLogger(VRegistroEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRegistroEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRegistroEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRegistroEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRegistroEntrevista().setVisible(true);
            }
        });
    }

    public JDateChooser getDTPFechaEntrevista() {
        return DTPFechaEntrevista;
    }

    public void setDTPFechaEntrevista(JDateChooser DTPFechaEntrevista) {
        this.DTPFechaEntrevista = DTPFechaEntrevista;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JComboBox<String> getCmbCargoAsp() {
        return cmbCargoAsp;
    }

    public void setCmbCargoAsp(JComboBox<String> cmbCargoAsp) {
        this.cmbCargoAsp = cmbCargoAsp;
    }

    public JComboBox<String> getCmbTitProy() {
        return cmbTitProy;
    }

    public void setCmbTitProy(JComboBox<String> cmbTitProy) {
        this.cmbTitProy = cmbTitProy;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getTxtEntrevistador() {
        return txtEntrevistador;
    }

    public void setTxtEntrevistador(JTextField txtEntrevistador) {
        this.txtEntrevistador = txtEntrevistador;
    }

    public JTextField getTxtIDCandidato() {
        return txtRifCandidato;
    }

    public void setTxtIDCandidato(JTextField txtIDCandidato) {
        this.txtRifCandidato = txtIDCandidato;
    }

    public JTextField getTxtNomCandidato() {
        return txtNomCandidato;
    }

    public void setTxtNomCandidato(JTextField txtNomCandidato) {
        this.txtNomCandidato = txtNomCandidato;
    }

    public JTextArea getTxtObservaciones() {
        return txtObservaciones;
    }

    public void setTxtObservaciones(JTextArea txtObservaciones) {
        this.txtObservaciones = txtObservaciones;
    }

    public JTextField getTxtSalOfer() {
        return txtSalOfer;
    }

    public void setTxtSalOfer(JTextField txtSalOfer) {
        this.txtSalOfer = txtSalOfer;
    }

    public JTextField getTxtSalPret() {
        return txtSalPret;
    }

    public void setTxtSalPret(JTextField txtSalPret) {
        this.txtSalPret = txtSalPret;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JComboBox<String> getCmbTipo() {
        return cmbTipo;
    }

    public void setCmbTipo(JComboBox<String> cmbTipo) {
        this.cmbTipo = cmbTipo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DTPFechaEntrevista;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCargoAsp;
    private javax.swing.JComboBox<String> cmbRif;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbTitProy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanEncabezado1;
    private javax.swing.JLabel lblRegistrarCandidato1;
    private javax.swing.JTextField txtEntrevistador;
    private javax.swing.JTextField txtNomCandidato;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRifCandidato;
    private javax.swing.JTextField txtSalOfer;
    private javax.swing.JTextField txtSalPret;
    // End of variables declaration//GEN-END:variables


public void agregarListener(ActionListener accion){
    btnCancelar.addActionListener(accion);
    btnRegistrar.addActionListener(accion);
}

}
