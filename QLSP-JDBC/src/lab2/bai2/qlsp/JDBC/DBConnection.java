/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bai2.qlsp.JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
    public static java.sql.Connection getConnection() throws SQLException  {
                String url = "jdbc:mysql://localhost:3306/QLSP";
		String user = "root";
		String password = "Anhanh123";
       
                 java.sql.Connection connection = null;
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // jdbc:sqlserver://WKS-DEV-23;encrypt=false;user=user;password=xxxxxx;applicationName=xxx;databaseName=XXXXX
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        //return DriverManager.getConnection("jdbc:sqlserver:////localhost:1433;user=sa;password=Anhanh123;databaseName=QLSP"); 
        System.err.println("connection" + connection);
        return connection;
        
    }
    
    public static void main(String[] args) throws SQLException {
        getConnection();
    }
}
