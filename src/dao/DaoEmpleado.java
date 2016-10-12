/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConexionSqlite1;
import java.sql.ResultSet;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class DaoEmpleado {
    private static ConexionSqlite1 con;
    
    
    public ResultSet ConsultarEmpleados(){
        ResultSet consulta;
        
        String sql;
        con = new ConexionSqlite1();
        sql="SELECT * from TEmpleado";
        consulta= con.consultar(sql);
        
        
        return consulta;
    }
    
}
