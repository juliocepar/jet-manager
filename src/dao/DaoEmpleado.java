/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.MEmpleado;
import conexion.ConexionSqlite1;
import java.sql.ResultSet;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class DaoEmpleado {
    private static ConexionSqlite1 con;
    
    public void insertarEmpleados(MEmpleado emp) {
        String sql = "INSERT INTO TEmpleado (EmpRif, EmpTipoMoneda, EmpTipoPago, EmpSalario, EmpEstatus) VALUES(";
        sql += "'" + emp.getRif() + "', ";
        sql += "'" + emp.getTipoMoneda() + "', ";
        sql += "'" + emp.getTipoPago() + "', ";
        sql += emp.getSalario() + ", ";
        sql += "'A')";
        System.out.println("sql = " + sql);
        ConexionSqlite1.ejecutar(sql);
    }
    
    public ResultSet ConsultarEmpleados(){
        ResultSet consulta;
        
        String sql;
        sql="SELECT * from TEmpleado";
        consulta= ConexionSqlite1.consultar(sql);
        
        
        return consulta;
    }
    
}
