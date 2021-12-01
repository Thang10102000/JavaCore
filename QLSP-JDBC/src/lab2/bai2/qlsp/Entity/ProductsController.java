/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bai2.qlsp.Entity;

import lab2.bai2.qlsp.JDBC.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProductsController {
    String url = "jdbc:mysql://localhost:3306/QLSP";
		String user = "root";
		String password = "Anhanh123";
    public static ArrayList<Products> getAllProducts () {
        ArrayList<Products> list= new ArrayList<>();
       
        try {
              Connection  connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
            	ResultSet resultSet = statement.executeQuery(" SELECT *FROM sanpham");
               while (resultSet.next()) {
               String id = resultSet.getString("ID");
                String name = resultSet.getString("name");
                  int  soLuong = resultSet.getInt("soLuong");
                  double giaSP = resultSet.getDouble("giaSP");
                  Products products = new Products(id, name, soLuong,  giaSP);
                  list.add(products);
                  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductsController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return  list;
    }
    
    public void add(Products products) throws SQLException{
        Connection  connection = DBConnection.getConnection();
           Statement statement = connection.createStatement();
            String sql = "INSERT INTO `sanpham` (`name`, `soLuong`, `giaSP`)"
                            + " VALUES ('"+products.getName()+"',"+products.getSoluong()+","+products.getGiaSP()+");";
              int resultSet = statement.executeUpdate(sql);
              System.out.println(sql);
}
}