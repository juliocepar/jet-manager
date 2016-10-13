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
import java.util.ArrayList;
import modelo.MCandidato;
/**
 *
 * @author Julio César
 */

public class DaoCandidato {
    
    public boolean InsertarCandidato(MCandidato can) {
        String sql = "INSERT INTO TCandidato (CanRif, CanNombres, CanApellidos, CanFechaNac, CanEdoCivil, CanDireccion, CanPais, CanCiudad, CanEmail, CanCodTelefono, CanTelefono, CanEstatus) VALUES(";
        sql += Validaciones.Apost(can.getRif()) + ", ";
        sql += Validaciones.Apost(can.getNombres()) + ", ";
        sql += Validaciones.Apost(can.getApellidos()) + ", ";
        sql += Validaciones.Apost(new SimpleDateFormat("yyyy-MM-dd").format(can.getFechaNacimiento())) + ", ";
        sql += Validaciones.Apost(String.valueOf(can.getEdoCivil())) + ", ";
        sql += Validaciones.Apost(can.getDireccion()) + ", ";
        sql += Validaciones.Apost(can.getPais()) + ", ";
        sql += Validaciones.Apost(can.getCiudad()) + ", ";
        sql += Validaciones.Apost(can.getEmail()) + ", ";
        sql += Validaciones.Apost(can.getCodTelefono()) + ", ";
        sql += Validaciones.Apost(can.getTelefono()) + ", ";
        sql += "'A')";
        //TODO Queda pendiente la inserción de las palabras clave
        return ConexionSqlite1.ejecutar(sql);
    }
    
    public ResultSet BuscarCandidato(String id) {
        ResultSet res;
        String sql = "SELECT * FROM TCandidato WHERE CanRif='" + id + "'";
        res = ConexionSqlite1.consultar(sql);
        return res;
    }
    
     public ResultSet ConsultarCandidatos(){
        ResultSet consulta;
        
        String sql;
        sql="SELECT * from TCandidato";
        consulta= ConexionSqlite1.consultar(sql);
        
        return consulta;
    }
     
     public boolean modificarCandidato(MCandidato can) {
         String sql = "UPDATE TCandidato SET ";
         sql += "CanNombres = " + Validaciones.Apost(can.getNombres()) + ", ";
         sql += "CanApellidos = " + Validaciones.Apost(can.getApellidos()) + ", ";
         sql += "CanFechaNac = " + Validaciones.Apost(new SimpleDateFormat("yyyy-MM-dd").format(can.getFechaNacimiento())) + ", ";
         sql += "CanEdoCivil = " + Validaciones.Apost(String.valueOf(can.getEdoCivil())) + ", ";
         sql += "CanDireccion = " + Validaciones.Apost(can.getDireccion()) + ", ";
         sql += "CanCiudad = " + Validaciones.Apost(can.getCiudad()) + ", ";
         sql += "CanPais = " + Validaciones.Apost(can.getPais()) + ", ";
         sql += "CanEmail = " + Validaciones.Apost(can.getEmail()) + ", ";
         sql += "CanCodTelefono = " + Validaciones.Apost(can.getCodTelefono()) + ", ";
         sql += "CanTelefono = " + Validaciones.Apost(can.getTelefono()) + " WHERE CanRif = " + Validaciones.Apost(can.getRif());
         return ConexionSqlite1.ejecutar(sql);
     }
     
     public boolean eliminarCandidato(MCandidato can) {
         String sql = "UPDATE TCandidato SET CanEstatus = 'E' WHERE CanRif = '" + can.getRif() + "'";
         return ConexionSqlite1.ejecutar(sql);
     }
     
     public ResultSet consultarCandidatosPorNombresApellidos(String nom, String ape) {
         ResultSet consulta;
         String sql = "SELECT * FROM TCandidato WHERE (CanNombres LIKE '%" + nom + "%' OR CanApellidos LIKE '%" + ape + "%') AND CanEstatus != 'E'";
         consulta = ConexionSqlite1.consultar(sql);
         return consulta;
     }
     
     //Aún no sé si esta consulta funciona
     public ResultSet consultarCandidatosPorPalabrasClave(ArrayList<String> palabras) {
         ResultSet consulta;
         String sql = "SELECT PCRifCandidato, CanNombres, CanApellidos, CanEmail, CanPais FROM TPalabraPorCandidato, TPalabraClave, TCandidato"
                 + "WHERE PCRifCandidato = CanRif AND PCIdPalabra = PalId AND (UPPER(PalPalabra) = UPPER('" + palabras.get(0) + "')";
         for(int i=1; i<palabras.size(); i++) {
             sql += " OR UPPER(PalPalabra) = UPPER('" + palabras.get(i) + "')";
         }
         sql += ") ORDER BY PCRifCandidato";
         consulta = ConexionSqlite1.consultar(sql);
         return consulta;
     }
     
}

