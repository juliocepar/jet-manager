/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConexionSqlite1;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.MCliente;

/**
 *
 * @author Vicky
 */
public class DaoCliente {
       
    public  ResultSet consultarCliente(String rif){
        String sql="Select * from TCliente where CliRif='"+rif+"';";
        ResultSet rs;
        rs= ConexionSqlite1.consultar(sql);

        return rs;    
    }
    public  boolean agregarCliente(MCliente cli){
        String sql="insert into TCliente (CliRif,CliRazonSocial,CliEmail,CliTelefono,CliDireccion,CliCiuidad,CliPais)"+
                "values('"+cli.getCliId()+"','"+cli.getCliNombre()+"','"+cli.getCliEmail()+"','"+cli.getCliTelf()+"','"+
                cli.getCliDirec()+"','"+cli.getCliCiudad()+"','"+cli.getCliPais()+"')";
        boolean agregado= ConexionSqlite1.ejecutar(sql);
        return agregado;
    }
    public static boolean eliminarCliente(String rif){
        String sql="update TCliente set CliEstatus='E' where CliRif='"+rif+"'";
        boolean eliminado= ConexionSqlite1.ejecutar(sql);
        return eliminado;      
        
    }
    public static ResultSet todosClientes(){
        String sql= "Select * from TCliente where CliEstatus='A'";
        ResultSet rs= ConexionSqlite1.consultar(sql);
        return rs;
    }
}
