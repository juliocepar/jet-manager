/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author jesus
 */


public class MFaltas {
    private String cedula;
    private Date fecha;
    private String tipo;
    private String descripcion;
       

    public MFaltas(String cedula, Date fecha, String tipo, String descripcion) {
        super();
        this.cedula = cedula;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        
    }

    public MFaltas() {
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
       }
    
