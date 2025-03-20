/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jimbe
 */
public class Products {
    private String ID;
    private String tenSP;
    private Boolean trangThai;
    private Float gia;
    private Integer soLuong;
    private String img;
    private String ngayThem;

    public Products() {
    }

    public Products(String ID, String tenSP, Boolean trangThai, Float gia, Integer soLuong, String img, String ngayThem) {
        this.ID = ID;
        this.tenSP = tenSP;
        this.trangThai = trangThai;
        this.gia = gia;
        this.soLuong = soLuong;
        this.img = img;
        this.ngayThem = ngayThem;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(String ngayThem) {
        this.ngayThem = ngayThem;
    }
    
    
}
