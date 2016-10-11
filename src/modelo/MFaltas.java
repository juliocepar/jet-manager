/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
/**
 *
 * @author jesus
 */


public class MFaltas {
    private int cedula;
    private Date fecha;
    private char tipo;
    private String descripcion;
    private int horas;    

    public MFaltas(int cedula, Date fecha, char tipo, String descripcion, int horas) {
        super();
        this.cedula = cedula;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.horas = horas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
       }
    
