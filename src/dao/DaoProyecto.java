/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import conexion.ConexionSqlite1;
/**
 *
 * @author Vicky
 */
public class DaoProyecto {
    private static ConexionSqlite1 con;
    
    
    public ResultSet ConsultarProyectos(){
        ResultSet consulta;
        
        String sql;
        con = new ConexionSqlite1();
        sql="SELECT * from TProyecto";
        consulta= con.consultar(sql);
        
        
        return consulta;
    }
}
