/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bai2.qlsp.Entity;

public class User {

    private int ID;
    private String taiKhoan, matKhau;

    public User() {

    }

    public User(int ID, String taiKhoan, String matKhau) {
        this.ID = ID;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public int getID() {
        return ID;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

}
