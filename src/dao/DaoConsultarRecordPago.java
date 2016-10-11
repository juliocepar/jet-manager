/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import PackageConeccion.ConeccionBD;
import conexion.ConexionSQLite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class DaoConsultarRecordPago extends ConexionSQLite {
    
      public ResultSet BuscarPorProyecto(String ProyectoConsultar) throws SQLException{
        
        String Sqlite;
        ResultSet RecordProyecto;
        
    
    Sqlite= "SELECT * FROM TEmpleado, TEntrevista, TProyecto WHERE  EntIdProyecto=" +ProyectoConsultar; 
    
    Sqlite += " AND  EntResultado = 'A'";
   
    
    RecordProyecto =  ConeccionBD.consultar(Sqlite);
    return RecordProyecto;
    
   
    } 
    
}
