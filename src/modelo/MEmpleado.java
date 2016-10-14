/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Julio César
 */
public class MEmpleado extends MCandidato {
    private String id;
    private String tipoMoneda;
    private String tipoPago;
    private double salario;

    public MEmpleado() {
    }

    public MEmpleado(String id, String tipoMoneda, String tipoPago, double salario) {
        this.id = id;
        this.tipoMoneda = tipoMoneda;
        this.tipoPago = tipoPago;
        this.salario = salario;
    }

    public MEmpleado(String id, String tipoMoneda, String tipoPago, double salario, String rif, String nombres, String apellidos, Date fechaNacimiento, char edoCivil, String direccion, String ciudad, String pais, String email, String telefono, String codTelefono, String[] palabrasClave) {
        super(rif, nombres, apellidos, fechaNacimiento, edoCivil, direccion, ciudad, pais, email, telefono, codTelefono, palabrasClave);
        this.id = id;
        this.tipoMoneda = tipoMoneda;
        this.tipoPago = tipoPago;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
