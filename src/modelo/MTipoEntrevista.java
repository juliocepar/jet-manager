/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Vicky
 */
public class MTipoEntrevista {
    private String descripcion;
    private int id;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MTipoEntrevista(String descripcion, int id) {
        this.descripcion = descripcion;
        this.id = id;
    }
    
    
}
