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
    
    public ResultSet consultarEntrevistasPorCandidato(String rif) {
        ResultSet res;
        sql = "SELECT * FROM TEntrevista WHERE EntRifCandidato = '" + rif + "'";
        res = ConexionSqlite1.consultar(sql);
        return res;
    }
    
    public ResultSet consultarCandidatosNoAsignados() {
        ResultSet res;
        sql = "SELECT EntRifCandidato, CanNombres, CanApellidos, CanPais, CanEmail FROM TEntrevista, TCandidato "
                + "WHERE EntRifCandidato = CanRif AND EntResultado != 'A'";
        res = ConexionSqlite1.consultar(sql);
        return res;
    }
    
    public void modificarEstatusEntrevista(String rif, char estatus) {
        sql = "UPDATE TEntrevista SET EntResultado = '" + estatus + "' WHERE EntRifCandidato = '" + rif + "'";
        ConexionSqlite1.ejecutar(sql);
    }
    
}

