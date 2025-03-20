/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jimbe
 */
public class Reviews {
    private Integer soSao;
    private String NDDanhGia;
    private String ngayDanhGia;

    public Reviews() {
    }

    public Reviews(Integer soSao, String NDDanhGia, String ngayDanhGia) {
        this.soSao = soSao;
        this.NDDanhGia = NDDanhGia;
        this.ngayDanhGia = ngayDanhGia;
    }

    public Integer getSoSao() {
        return soSao;
    }

    public void setSoSao(Integer soSao) {
        this.soSao = soSao;
    }

    public String getNDDanhGia() {
        return NDDanhGia;
    }

    public void setNDDanhGia(String NDDanhGia) {
        this.NDDanhGia = NDDanhGia;
    }

    public String getNgayDanhGia() {
        return ngayDanhGia;
    }

    public void setNgayDanhGia(String ngayDanhGia) {
        this.ngayDanhGia = ngayDanhGia;
    }
    
}
