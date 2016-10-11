/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Vicky
 */
public class MProyecto {
    private String proyId, proyTitulo, proyIdCliente, proyIdioma, proyDesc;
    private int proyNroCandidatos;
    private Date proyFechaInicio, proyFechaFin;

    public MProyecto(String proyId, String proyTitulo, String proyIdCliente, String proyIdioma, String proyDesc, int proyNroCandidatos, Date proyFechaInicio, Date proyFechaFin) {
        this.proyId = proyId;
        this.proyTitulo = proyTitulo;
        this.proyIdCliente = proyIdCliente;
        this.proyIdioma = proyIdioma;
        this.proyDesc = proyDesc;
        this.proyNroCandidatos = proyNroCandidatos;
        this.proyFechaInicio = proyFechaInicio;
        this.proyFechaFin = proyFechaFin;
    }

    public String getProyId() {
        return proyId;
    }

    public void setProyId(String proyId) {
        this.proyId = proyId;
    }

    public String getProyTitulo() {
        return proyTitulo;
    }

    public void setProyTitulo(String proyTitulo) {
        this.proyTitulo = proyTitulo;
    }

    public String getProyIdCliente() {
        return proyIdCliente;
    }

    public void setProyIdCliente(String proyIdCliente) {
        this.proyIdCliente = proyIdCliente;
    }

    public String getProyIdioma() {
        return proyIdioma;
    }

    public void setProyIdioma(String proyIdioma) {
        this.proyIdioma = proyIdioma;
    }

    public String getProyDesc() {
        return proyDesc;
    }

    public void setProyDesc(String proyDesc) {
        this.proyDesc = proyDesc;
    }

    public int getProyNroCandidatos() {
        return proyNroCandidatos;
    }

    public void setProyNroCandidatos(int proyNroCandidatos) {
        this.proyNroCandidatos = proyNroCandidatos;
    }

    public Date getProyFechaInicio() {
        return proyFechaInicio;
    }

    public void setProyFechaInicio(Date proyFechaInicio) {
        this.proyFechaInicio = proyFechaInicio;
    }

    public Date getProyFechaFin() {
        return proyFechaFin;
    }

    public void setProyFechaFin(Date proyFechaFin) {
        this.proyFechaFin = proyFechaFin;
    }
    
    
}
