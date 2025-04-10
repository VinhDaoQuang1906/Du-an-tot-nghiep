/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jimbe
 */
public class Accounts {
    private String matKhau;
    private String Email;
    private Integer chucVu;

    public Accounts() {
    }

    public Accounts(String matKhau, String Email, Integer chucVu) {
        this.matKhau = matKhau;
        this.Email = Email;
        this.chucVu = chucVu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Integer getChucVu() {
        return chucVu;
    }

    public void setChucVu(Integer chucVu) {
        this.chucVu = chucVu;
    }
    

    
    
}
