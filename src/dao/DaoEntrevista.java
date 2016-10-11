/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.*;
import java.sql.*;
import conexion.ConexionSqlite1;
/**
 *
 * @author Vicky
 */
public class DaoEntrevista {
    String sql;
    Statement stm;
    Connection con;
    static ConexionSqlite1 cn;
    
    public boolean insertarEntrevista(MEntrevista ent){
      
        sql="insert into TEntrevista values ('"+ent.getEntIDCandidato()+"',"+ent.getEntTipo()+
                ",'"+ent.getEntIdProy()+"','"+ent.getEntFecha()+"','"+ent.getEntCargoAsp()+"',"+
                ent.getEntSalOfer()+","+ent.getSalPret()+",'"+ent.getEntObservaciones()+"','A','"+
                ent.getEntEntrevistador()+"', 'E');";
        
                return cn.ejecutar(sql);
                }
}

