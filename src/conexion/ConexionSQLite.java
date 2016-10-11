/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class ConexionSQLite {
    
     public static void main( String args[] )
  {
    Connection c;
         c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ABUNASSAR PENARANDA\\Documents\\JetManager_backup.db");
    } catch ( ClassNotFoundException | SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
}
    
    

/*public static void main(String[] ars) throws ClassNotFoundException{
       
        Class.forName("org.sqlite.JDBC");
        
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/ABUNASSAR PENARANDA/Documents/JetManager_backup.db" );
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            
            //statement.executeUpdate("drop table if exists TProyectos");
            //statement.executeUpdate("create table TProyecto (id integer, name string)");
            //statement.executeUpdate("insert into TProyecto values(1, 'Prueba') ");
            //ResultSet rs= statement.executeQuery("select * from TProyecto ");
         //   ResultSet rs2 = statement.executeQuery("Select * from TCliente");
            
           // while (rs2.next()){
               // System.out.println("Name: " + rs.getString("name"));
               // System.out.println("ID: " + rs.getString("id"));
             ///   System.out.println("Cliente " + rs2.getString("CliRif"));
          //  }
            
        }
        catch (SQLException e){
            
            System.err.println(e.getMessage());
            
        }
        finally{
            try{
                if (connection!= null)
                    connection.close();
            }
            catch (SQLException e){
                 System.err.println(e);
                
            }
            
        }
    }
}
*/