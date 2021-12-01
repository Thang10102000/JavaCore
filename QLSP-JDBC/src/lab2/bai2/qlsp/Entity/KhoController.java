/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bai2.qlsp.Entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab2.bai2.qlsp.JDBC.DBConnection;

/**
 *
 * @author Admin
 */
public class KhoController {

    String url = "jdbc:mysql://localhost:3306/QLSP";
    String user = "root";
    String password = "Anhanh123";

    public static ArrayList<Kho> getAllKho() {
        ArrayList<Kho> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" select k.ID, k.name,s.soLuong,NSX,ngay\n"
                    + "from   kho k\n"
                    + "join sanpham s on s.name = k.name ");
            while (resultSet.next()) {
                String id = resultSet.getString("ID");
                String name = resultSet.getString("name");
                int soLuong = resultSet.getInt("soLuong");
                String nSX = resultSet.getString("nSX");
                String ngayNhap = resultSet.getString("ngay");
                Kho kho = new Kho(id, name, soLuong, nSX, ngayNhap);
                list.add(kho);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductsController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
