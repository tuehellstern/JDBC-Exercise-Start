/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.exercise.soloution;
import java.sql.*;
/**
 *
 * @author tuhe
 */
public class JDBCExercise {

    public static void main(String[] args) throws SQLException
    {
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = null;
        
        try 
        {  
          //=== Load the JDBC-driver
          Class.forName(DB.driver);
          
          //=== Connect to the database
          connection = DriverManager.getConnection(DB.URL, DB.ID,DB.PW );            
              
          //==== Instantiate a statement object 
          statement = connection.createStatement();
          
          //=== Build an SQL-query-statement
          String query = "SELECT * FROM parts";
          
          //=== Execute the query and receive the result
          rs = statement.executeQuery(query);
          System.out.println("== Parts ==");
          //=== read the result
          while (rs.next()) 
          {
            System.out.println(
                rs.getInt(1)+"\t" + 
                rs.getString(2)+"\t" + 
                rs.getInt(3)+"\t" + 
                rs.getDouble(4)+"\t" + 
                rs.getInt(5));
          }       
        }
        //=== If database driver is unavailable or query fails
        catch (Exception ee) 
        { 
          System.out.println("fail");
          System.err.println(ee); 
        }        
        //=== Always close the statement and connection
        finally
        {
          statement.close();
          connection.close(); 
        }        
    }
}
