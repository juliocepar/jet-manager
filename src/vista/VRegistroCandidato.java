/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Julio César
 */
public class VRegistroCandidato extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistrarCandidato
     */
    public VRegistroCandidato() {
        initComponents();
        ((JTextField)calFechaNacimiento.getDateEditor()).setEditable(false);
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JComboBox<String> getCmbEdoCivil() {
        return cmbEdoCivil;
    }

    public JComboBox<String> getCmbPais() {
        return cmbPais;
    }

    public JComboBox<String> getCmbRif() {
        return cmbRif;
    }

    public JDateChooser getCalFechaNacimiento() {
        return calFechaNacimiento;
    }

    public JLabel getLblCodTelefono() {
        return lblCodTelefono;
    }

    public JTextArea getTxaDireccion() {
        return txaDireccion;
    }

    public JTextArea getTxaPalabrasClave() {
        return txaPalabrasClave;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public JTextField getTxtCiudad() {
        return txtCiudad;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public JTextField getTxtRif() {
        return txtRif;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }
    
    public void agregarListener(ActionListener al) {
        this.btnCancelar.addActionListener(al);
        this.btnGuardar.addActionListener(al);
        this.btnBuscar.addActionListener(al);
        this.btnModificar.addActionListener(al);
        this.btnEliminar.addActionListener(al);
        this.btnSalir.addActionListener(al);
    }
    
    public void agregarItemListener(ItemListener il) {
        this.cmbPais.addItemListener(il);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanFondo = new javax.swing.JPanel();
        jpanEncabezado = new javax.swing.JPanel();
        lblRegistrarCandidato = new javax.swing.JLabel();
        lblRif = new javax.swing.JLabel();
        txtRif = new javax.swing.JTextField();
        cmbRif = new javax.swing.JComboBox<>();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblEdoCivil = new javax.swing.JLabel();
        cmbEdoCivil = new javax.swing.JComboBox<>();
        lblDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDireccion = new javax.swing.JTextArea();
        lblPais = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblCodTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblPalabrasClave = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaPalabrasClave = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        calFechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jpanFondo.setBackground(new java.awt.Color(102, 102, 102));

        jpanEncabezado.setBackground(new java.awt.Color(255, 153, 51));

        lblRegistrarCandidato.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato.setText("GESTIONAR CANDIDATO");

        javax.swing.GroupLayout jpanEncabezadoLayout = new javax.swing.GroupLayout(jpanEncabezado);
        jpanEncabezado.setLayout(jpanEncabezadoLayout);
        jpanEncabezadoLayout.setHorizontalGroup(
            jpanEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanEncabezadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblRegistrarCandidato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanEncabezadoLayout.setVerticalGroup(
            jpanEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanEncabezadoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegistrarCandidato)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblRif.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblRif.setForeground(new java.awt.Color(255, 255, 255));
        lblRif.setText("ID");

        txtRif.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        cmbRif.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cmbRif.setMaximumRowCount(3);
        cmbRif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "E", "P" }));
        cmbRif.setFocusable(false);

        lblNombres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombres.setEnabled(false);

        lblApellidos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");

        txtApellidos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApellidos.setEnabled(false);

        lblFechaNacimiento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de nacimiento");

        lblEdoCivil.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblEdoCivil.setForeground(new java.awt.Color(255, 255, 255));
        lblEdoCivil.setText("Edo. civil");

        cmbEdoCivil.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cmbEdoCivil.setMaximumRowCount(4);
        cmbEdoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Casado(a)", "Divorciado(a)", "Viudo(a)" }));
        cmbEdoCivil.setEnabled(false);
        cmbEdoCivil.setFocusable(false);

        lblDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Dirección");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaDireccion.setColumns(20);
        txaDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txaDireccion.setLineWrap(true);
        txaDireccion.setRows(3);
        txaDireccion.setWrapStyleWord(true);
        txaDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txaDireccion.setEnabled(false);
        jScrollPane1.setViewportView(txaDireccion);

        lblPais.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPais.setForeground(new java.awt.Color(255, 255, 255));
        lblPais.setText("País");

        cmbPais.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cmbPais.setMaximumRowCount(10);
        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Anguilla", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bahréin", "Bangladesh", "Barbados", "Belarús", "Bélgica", "Belice", "Benín", "Birmania", "Bolivia", "Bosnia-Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Congo", "Congo, República Democrática del", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea Ecuatorial", "Guinea-Bissau", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajstán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia", "Madagascar", "Malasia", "Malawi", "Maldivas", "Malí", "Malta", "Marruecos", "Marshall", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Qatar", "Reino Unido", "República Centroafricana", "República Checa", "República Dominicana", "Ruanda", "Rumania", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santa Sede (Vaticano)", "Santo Tomé y Príncipe", "Senegal", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Suecia", "Suiza", "Surinam", "Tailandia", "Taiwán", "Tanzania", "Tayikistán", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Yugoslavia", "Zambia", "Zimbabue" }));
        cmbPais.setEnabled(false);
        cmbPais.setFocusable(false);

        lblCiudad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad.setText("Ciudad");

        txtCiudad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCiudad.setEnabled(false);

        lblCorreo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo electrónico");

        txtCorreo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCorreo.setEnabled(false);

        lblTelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono:");

        lblCodTelefono.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        lblCodTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblCodTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodTelefono.setText("+1");

        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtTelefono.setToolTipText("");
        txtTelefono.setEnabled(false);

        lblPalabrasClave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPalabrasClave.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabrasClave.setText("Palabras clave");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaPalabrasClave.setColumns(20);
        txaPalabrasClave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txaPalabrasClave.setLineWrap(true);
        txaPalabrasClave.setRows(5);
        txaPalabrasClave.setToolTipText("Escribe las palabras clave separadas con comas");
        txaPalabrasClave.setWrapStyleWord(true);
        txaPalabrasClave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txaPalabrasClave.setEnabled(false);
        jScrollPane2.setViewportView(txaPalabrasClave);

        btnGuardar.setBackground(new java.awt.Color(255, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);

        btnCancelar.setBackground(new java.awt.Color(255, 153, 51));
        btnCancelar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);

        calFechaNacimiento.setEnabled(false);
        calFechaNacimiento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        btnModificar.setBackground(new java.awt.Color(255, 153, 51));
        btnModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);

        btnBuscar.setBackground(new java.awt.Color(255, 153, 51));
        btnBuscar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);

        btnEliminar.setBackground(new java.awt.Color(255, 153, 51));
        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);

        btnSalir.setBackground(new java.awt.Color(255, 153, 51));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout jpanFondoLayout = new javax.swing.GroupLayout(jpanFondo);
        jpanFondo.setLayout(jpanFondoLayout);
        jpanFondoLayout.setHorizontalGroup(
            jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanFondoLayout.createSequentialGroup()
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo)
                            .addComponent(jScrollPane1)
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblFechaNacimiento)
                                .addGap(9, 9, 9)
                                .addComponent(calFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanFondoLayout.createSequentialGroup()
                                        .addComponent(lblNombres)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDireccion)
                                    .addComponent(lblCorreo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblApellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblEdoCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbEdoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblCiudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCodTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpanFondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(jpanFondoLayout.createSequentialGroup()
                                .addComponent(lblPalabrasClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbRif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(189, 189, 189))
        );
        jpanFondoLayout.setVerticalGroup(
            jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanFondoLayout.createSequentialGroup()
                .addComponent(jpanEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRif)
                    .addComponent(cmbRif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(27, 27, 27)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanFondoLayout.createSequentialGroup()
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(calFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(lblDireccion))
                    .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEdoCivil)
                        .addComponent(cmbEdoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanFondoLayout.createSequentialGroup()
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPais)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCiudad)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanFondoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblPalabrasClave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jpanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calFechaNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyTyped
       evt.consume();
    }//GEN-LAST:event_jDateChooser1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser calFechaNacimiento;
    private javax.swing.JComboBox<String> cmbEdoCivil;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbRif;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanEncabezado;
    private javax.swing.JPanel jpanFondo;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodTelefono;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdoCivil;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPalabrasClave;
    private javax.swing.JLabel lblRegistrarCandidato;
    private javax.swing.JLabel lblRif;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextArea txaDireccion;
    private javax.swing.JTextArea txaPalabrasClave;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRif;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
