package Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 18. Write a program to generate SQLException
 */
public class Sql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null; 
        PreparedStatement preparedStatement = null; 

        try { 
         
            // establish a connection to the database 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:20000/test", "username", "password"); 
  
            // Your SQL query with an intentional error (table name is misspelled) 
            String sql = "SELECT * FROM student"; 
  
            // create a PreparedStatement 
            preparedStatement = connection.prepareStatement(sql); 
  
            // execute the query (this will throw an SQLException in case of an error) 
            preparedStatement.executeQuery(); 
        } catch (SQLException  e) { 
            // handle the SQL exception 
            e.printStackTrace();
        } finally { 
            // close the resources in the finally block 
            try { 
                if (preparedStatement != null) { 
                    preparedStatement.close(); 
                } 
                if (connection != null) { 
                    connection.close(); 
                } 
            } catch (SQLException e) { 
                e.printStackTrace(); 
            } 
        } 
	}

}
