/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Validaciones;
import conexion.ConexionSqlite1;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import modelo.MCandidato;
/**
 *
 * @author Julio César
 */

public class DaoCandidato {
    private ConexionSqlite1 con;

    public DaoCandidato() {
        con = new ConexionSqlite1();
    }
    
    public void InsertarCandidato(MCandidato can) {
        String sql = "INSERT INTO TCandidato (CanRif, CanNombres, CanApellidos, CanFechaNac, CanEdoCivil, CanDireccion, CanPais, CanCiudad, CanEmail, CanTelefono, CanEstatus) VALUES(";
        sql += Validaciones.Apost(can.getRif());
        sql += Validaciones.Apost(can.getNombres()) + ", ";
        sql += Validaciones.Apost(can.getApellidos()) + ", ";
        sql += new SimpleDateFormat("yyyy-MM-dd").format(can.getFechaNacimiento()) + ", ";
        sql += Validaciones.Apost(String.valueOf(can.getEdoCivil())) + ", ";
        sql += Validaciones.Apost(can.getDireccion()) + ", ";
        sql += Validaciones.Apost(can.getPais()) + ", ";
        sql += Validaciones.Apost(can.getCiudad()) + ", ";
        sql += Validaciones.Apost(can.getEmail()) + ", ";
        sql += Validaciones.Apost(can.getTelefono()) + ", ";
        sql += "'A')";
        con.ejecutar(sql);
    }
    
    public ResultSet BuscarCandidato(String id) {
        ResultSet res;
        con = new ConexionSqlite1();
        String sql = "SELECT * FROM TCandidato WHERE CanRif='" + id + "'";
        res = con.consultar(sql);
        return res;
    }
    
     public ResultSet ConsultarCandidatos(){
        ResultSet consulta;
        
        String sql;
        con = new ConexionSqlite1();
        sql="SELECT * from TCandidato";
        consulta= con.consultar(sql);
        
        
        return consulta;
    }
}

