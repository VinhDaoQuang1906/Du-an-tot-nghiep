/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jimbe
 */
public class Coupons {
    private String ID;
    private Integer phanTramGiam;
    private String han;
    private Boolean trangThai;

    public Coupons() {
    }

    public Coupons(String ID, Integer phanTramGiam, String han, Boolean trangThai) {
        this.ID = ID;
        this.phanTramGiam = phanTramGiam;
        this.han = han;
        this.trangThai = trangThai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getPhanTramGiam() {
        return phanTramGiam;
    }

    public void setPhanTramGiam(Integer phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    public String getHan() {
        return han;
    }

    public void setHan(String han) {
        this.han = han;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
