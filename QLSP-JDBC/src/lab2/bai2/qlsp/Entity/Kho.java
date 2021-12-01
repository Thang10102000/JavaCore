/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bai2.qlsp.Entity;


public class Kho {
     private  String ID, name,nSX ;
     private  int soLuong;
     private  String ngayNhap;

    public Kho() {
    }

    public Kho(String ID, String name,  int soLuong,String nSX, String ngayNhap) {
        this.ID = ID;
        this.name = name;
        this.nSX = nSX;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }
     public Object[] toArray(){
        return new Object[]{ID, name, soLuong,nSX,ngayNhap};
}

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getnSX() {
        return nSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setnSX(String nSX) {
        this.nSX = nSX;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
     
}
