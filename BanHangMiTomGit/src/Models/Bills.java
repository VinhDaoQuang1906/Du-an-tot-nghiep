/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jimbe
 */
public class Bills {
    private String chiTiet;
    private String ngayThanhToan;
    private Float tongTien;
    private String trangThai;
    private String giamGia;
    private String phuongThucTT;
    String diachi;
    String ngMua;

    public Bills() {
    }

    public Bills(String chiTiet, String ngayThanhToan, Float tongTien, String trangThai, String giamGia, String phuongThucTT, String diachi, String ngMua) {
        this.chiTiet = chiTiet;
        this.ngayThanhToan = ngayThanhToan;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.giamGia = giamGia;
        this.phuongThucTT = phuongThucTT;
        this.diachi = diachi;
        this.ngMua = ngMua;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Float getTongTien() {
        return tongTien;
    }

    public void setTongTien(Float tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(String giamGia) {
        this.giamGia = giamGia;
    }

    public String getPhuongThucTT() {
        return phuongThucTT;
    }

    public void setPhuongThucTT(String phuongThucTT) {
        this.phuongThucTT = phuongThucTT;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgMua() {
        return ngMua;
    }

    public void setNgMua(String ngMua) {
        this.ngMua = ngMua;
    }
    
    
}
