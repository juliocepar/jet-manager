/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCandidato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.MCandidato;
import vista.VRegistroCandidato;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class CRegistroCandidato implements ActionListener, KeyListener, ItemListener {

   private VRegistroCandidato vregcan;
   private MCandidato can;

   public void Inicializar() {
       //Se borran todos los campos de texto y se seleccionan las opciones por defecto
       vregcan.getCmbPais().setSelectedIndex(0);
       vregcan.getTxtRif().setText("");
       vregcan.getTxtNombres().setText("");
       vregcan.getTxtApellidos().setText("");
       ((JTextField)vregcan.getCalFechaNacimiento().getDateEditor()).setText("");
       vregcan.getCmbEdoCivil().setSelectedIndex(0);
       vregcan.getTxaDireccion().setText("");
       vregcan.getCmbPais().setSelectedIndex(0);
       vregcan.getTxtCiudad().setText("");
       vregcan.getTxtCorreo().setText("");
       vregcan.getTxtTelefono().setText("");
       vregcan.getTxaPalabrasClave().setText("");
       
       //Se habilitan y deshabilitan los componentes
       vregcan.getCmbRif().setEnabled(true);
       vregcan.getTxtRif().setEnabled(true);
       vregcan.getTxtNombres().setEnabled(false);
       vregcan.getTxtApellidos().setEnabled(false);
       vregcan.getCalFechaNacimiento().setEnabled(false);
       vregcan.getCmbEdoCivil().setEnabled(false);
       vregcan.getTxaDireccion().setEnabled(false);
       vregcan.getCmbPais().setEnabled(false);
       vregcan.getTxtCiudad().setEnabled(false);
       vregcan.getTxtCorreo().setEnabled(false);
       vregcan.getTxtTelefono().setEnabled(false);
       vregcan.getTxaPalabrasClave().setEnabled(false);
       vregcan.getBtnModificar().setEnabled(false);
       vregcan.getBtnCancelar().setEnabled(false);
       vregcan.getBtnGuardar().setEnabled(false);
       vregcan.getBtnBuscar().setEnabled(false);
   }
   
   public void HabilitarRegistro() {
       vregcan.getCmbRif().setEnabled(false);
       vregcan.getTxtRif().setEnabled(false);
       vregcan.getTxtNombres().setEnabled(true);
       vregcan.getTxtApellidos().setEnabled(true);
       vregcan.getCalFechaNacimiento().setEnabled(true);
       vregcan.getCmbEdoCivil().setEnabled(true);
       vregcan.getTxaDireccion().setEnabled(true);
       vregcan.getCmbPais().setEnabled(true);
       vregcan.getTxtCiudad().setEnabled(true);
       vregcan.getTxtCorreo().setEnabled(true);
       vregcan.getTxtTelefono().setEnabled(true);
       vregcan.getTxaPalabrasClave().setEnabled(true);
       vregcan.getBtnCancelar().setEnabled(true);
       vregcan.getBtnModificar().setEnabled(false);
       vregcan.getBtnGuardar().setEnabled(true);
   }
   
    public CRegistroCandidato() {
        this.vregcan = new VRegistroCandidato();
        vregcan.agregarListener((ActionListener) this);
        vregcan.agregarItemListener((ItemListener) this);
        Inicializar();
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
                    
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                            TraerResultados();
                        }
                    }
                    
                    @Override
                    public void keyReleased(KeyEvent e) {
                        if(vregcan.getTxtRif().getText().isEmpty()) {
                            vregcan.getBtnBuscar().setEnabled(false);
                            return;
                        }
                        vregcan.getBtnBuscar().setEnabled(true);
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
   
    public int IndiceEdoCivil(char e) {
        switch(e) {
            case 'S':
                return 0;
            case 'C':
                return 1;
            case 'D':
                return 2;
            default:
                return 3;
        }
    }
    
    public void LlenarCampos() {
        vregcan.getTxtNombres().setText(can.getNombres());
        vregcan.getTxtApellidos().setText(can.getApellidos());
        vregcan.getCalFechaNacimiento().setDate(can.getFechaNacimiento());
        vregcan.getCmbEdoCivil().setSelectedIndex(IndiceEdoCivil(can.getEdoCivil()));
        vregcan.getTxaDireccion().setText(can.getDireccion());
        vregcan.getCmbPais().setSelectedItem(can.getPais());
        vregcan.getTxtCiudad().setText(can.getCiudad());
        vregcan.getTxtCorreo().setText(can.getEmail());
        vregcan.getTxtTelefono().setText(can.getTelefono());
        //TODO Palabras clave del candidato
    }
    
    public void TraerResultados() {
        DaoCandidato daoc = new DaoCandidato();
        ResultSet res;
        res = daoc.BuscarCandidato(vregcan.getCmbRif().getSelectedItem().toString() +
                vregcan.getTxtRif().getText());
        if(res.equals(null)) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(vregcan,
                    "Candidato no existe. ¿Desea registrarlo?",
                    "Gestionar candidato",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if(showConfirmDialog == 1) {
                HabilitarRegistro();
            }
        }
        else {
            try {
                can.setNombres(res.getString("CanNombres"));
                can.setApellidos(res.getString("CanApellidos"));
                can.setFechaNacimiento(res.getDate("CanFechaNac"));
                can.setEdoCivil((char)res.getShort("CanEdoCivil"));
                can.setDireccion(res.getString("CanDireccion"));
                can.setPais(res.getString("CanPais"));
                can.setCiudad(res.getString("CanCiudad"));
                can.setEmail(res.getString("CanEmail"));
                can.setTelefono(res.getString("CanTelefono"));
                LlenarCampos();
                if(res.getString("CanEstatus").equals("'A'")) {
                    vregcan.getBtnModificar().setEnabled(true);
                }
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vregcan.getBtnCancelar())) {
            Inicializar();
        }
        
        if(e.getSource().equals(vregcan.getBtnModificar())) {
            HabilitarRegistro();
        }
        
        if(e.getSource().equals(vregcan.getBtnGuardar())) {
            JOptionPane.showMessageDialog(vregcan,
                    "Cambios guardados exitosamente...",
                    "Gestionar candidato",
                    JOptionPane.INFORMATION_MESSAGE);
            Inicializar();
        }
        
        if(e.getSource().equals(vregcan.getBtnBuscar())) {
            TraerResultados();
        }
        
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
