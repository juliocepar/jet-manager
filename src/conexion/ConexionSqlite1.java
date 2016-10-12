/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

public class ConexionSqlite1
{   
    static Connection connection = null;
         public static Connection Enlace() throws ClassNotFoundException{
       
        Class.forName("org.sqlite.JDBC");
        
        
        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ABUNASSAR PENARANDA\\Documents\\NetBeansProjects\\JetManager\\JetManager_backup_backup.db" );
        }
        catch (SQLException e){
            System.err.println(e.getMessage());           
        }
       
         return connection;
}
    //Para los insert, update, delete
         public boolean ejecutar(String sql){
             Statement stm;
                       try{
           stm = connection.createStatement();
           stm.executeUpdate(sql);
           stm.close();
           connection.close();
           return false;
          }catch(Exception e){
            System.err.println(e.getMessage()); 
          return false;
          }
         }
 //Para los select
         public ResultSet consultar(String sql){
        Connection c = null;
        Statement stmt = null;
        ResultSet rs= null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ABUNASSAR PENARANDA\\Documents\\NetBeansProjects\\JetManager\\JetManager_backup_backup.db");
     // c.setAutoCommit(false);
      //System.out.println("Opened database successfully");

      stmt = c.createStatement();
      rs = stmt.executeQuery( sql );

      
      /*rs.close();
      stmt.close();
      c.close();
*/
    } catch ( ClassNotFoundException | SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
 return rs;
  }
         
}
             
         