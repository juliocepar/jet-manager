/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author jesus
 */
import modelo.MFaltas;
import conexion.*;
import java.text.SimpleDateFormat;
import modelo.*;


public class DaoRegFaltas {
    MFaltas mf;
    private final ConexionSqlite1 con;
    public DaoRegFaltas(){
    con = new ConexionSqlite1();
    mf = new MFaltas();
    }
    public void Registrarfal(MFaltas fal){
        String sql = "INSERT INTO TFalta (FalIdEmpleado, FalFecha, FalJustificada, FalObservaciones, FalEstatus) VALUES (";
        sql += Validaciones.Apost(mf.getCedula());
        sql += Validaciones.Apost(new SimpleDateFormat("yyyy-MM-dd").format(mf.getFecha())) + ", ";
        sql += Validaciones.Apost(mf.getTipo()) + ", ";
        sql += Validaciones.Apost(String.valueOf(mf.getDescripcion())) + ", ";
        sql += "'A')";
        con.ejecutar(sql);
        
    
    }
}
