/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Models.Accounts;
import Models.Bills;
import Models.Coupons;
import Models.Products;
import Models.Reviews;
import Models.Users;
import SQL.DbConnection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author jimbe
 */
public class QuanLySQL {

    DbConnection connection;

    public ArrayList<Accounts> getAccountList() {
        String query = "select * from Account";
        ArrayList<Accounts> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mk = rs.getString(2);
                String mail = rs.getString(3);
                Integer chucvu = rs.getInt(4);
                Accounts acc = new Accounts(mk, mail, chucvu);
                list.add(acc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Bills> getBillsList() {
        String query = "select * from HoaDon";
        ArrayList<Bills> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String chiTiet = rs.getString(2);
                String ngayTT = rs.getString(3);
                Float tongTien = rs.getFloat(4);
                String trangThai = rs.getString(5);
                String giamGia = rs.getString(6);
                String phuongThuc = rs.getString(7);
                String diachi = rs.getString(8);
                String ngMua = rs.getString(9);
                Bills bill = new Bills(chiTiet, ngayTT, tongTien, trangThai, giamGia, phuongThuc, diachi, ngMua);
                list.add(bill);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Bills> getSpecificBillsList(String nguoiMua) {
        String query = "select * from HoaDon where nguoiMua = ?";
        ArrayList<Bills> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, nguoiMua.trim());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String chiTiet = rs.getString(2);
                String ngayTT = rs.getString(3);
                Float tongTien = rs.getFloat(4);
                String trangThai = rs.getString(5);
                String giamGia = rs.getString(6);
                String phuongThuc = rs.getString(7);
                String diachi = rs.getString(8);
                String ngMua = rs.getString(9);
                Bills bill = new Bills(chiTiet, ngayTT, tongTien, trangThai, giamGia, phuongThuc, diachi, ngMua);
                list.add(bill);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Products> getProductsList() {
        String query = "select * from SanPham";
        ArrayList<Products> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String ten = rs.getString(2);
                Boolean trangthai = rs.getBoolean(3);
                Float gia = rs.getFloat(4);
                Integer soLuong = rs.getInt(5);
                String img = rs.getString(6);
                String ngaythem = rs.getString(7);
                Products prod = new Products(id, ten, trangthai, gia, soLuong, img, ngaythem);
                list.add(prod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Reviews> getReviewsList() {
        String query = "select * from Reviews";
        ArrayList<Reviews> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer sosao = rs.getInt(2);
                String nd = rs.getString(3);
                String ngaydg = rs.getString(4);
                Reviews review = new Reviews(sosao, nd, ngaydg);
                list.add(review);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Users> getStaffsList() {
        String query = "select * from Users where loaiTK = 'Nhân viên'";
        ArrayList<Users> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String email = rs.getString(2);
                String loaiTK = rs.getString(3);
                String hoTen = rs.getString(4);
                String sdt = rs.getString(5);
                String diachi = rs.getString(6);
                Users user = new Users(email, loaiTK, hoTen, sdt, diachi);
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Users> getOtherUsersList() {
        String query = "select * from Users where loaiTK = 'Khách'";
        ArrayList<Users> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String email = rs.getString(2);
                String loaiTK = rs.getString(3);
                String hoTen = rs.getString(4);
                String sdt = rs.getString(5);
                String diachi = rs.getString(6);
                Users user = new Users(email, loaiTK, hoTen, sdt, diachi);
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Coupons> getCouponList() {
        String query = "select * from Coupon";
        ArrayList<Coupons> list = new ArrayList<>();
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                Integer giam = rs.getInt(2);
                String han = rs.getString(3);
                Boolean trangthai = rs.getBoolean(4);
                Coupons gg = new Coupons(id, giam, han, trangthai);
                list.add(gg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean addUser(Users user) {
        String query = "insert into Users(Email, loaiTK,hoTen,sdt,diaChi) values(?,?,?,?,?)";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, user.getEmail());
            ps.setObject(2, user.getLoaiTK());
            ps.setObject(3, user.getLoaiTK());
            ps.setObject(4, user.getSdt());
            ps.setObject(5, user.getDiaChi());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addProduct(Products product) {
        String query = "insert into SanPham values(?,?,?,?,?,?,?)";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, product.getID());
            ps.setObject(2, product.getTenSP());
            ps.setObject(3, product.getTrangThai());
            ps.setObject(4, product.getGia());
            ps.setObject(5, product.getSoLuong());
            ps.setObject(6, product.getImg());
            ps.setObject(7, product.getNgayThem());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addBill(Bills bill) {
        String query = "insert into HoaDon(chiTiet, ngayThanhToan, tongTien, trangThai, giamGia, phuongThucThanhToan, diachi, nguoiMua) values(?,?,?,?,?,?,?,?)";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, bill.getChiTiet());
            ps.setObject(2, bill.getNgayThanhToan());
            ps.setObject(3, bill.getTongTien());
            ps.setObject(4, bill.getTrangThai());
            ps.setObject(5, bill.getGiamGia());
            ps.setObject(6, bill.getPhuongThucTT());
            ps.setObject(7, bill.getDiachi());
            ps.setObject(8, bill.getNgMua());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addAccount(Accounts acc) {
        String query = "insert into Account(matKhau, Email, chucVu) values(?,?,?)";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, acc.getMatKhau());
            ps.setObject(2, acc.getEmail());
            ps.setObject(3, acc.getChucVu());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean Review(Reviews review) {
        String query = "insert into Reviews(SoSao, ND, ngayDanhGia) values(?,?,?)";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, review.getSoSao());
            ps.setObject(2, review.getNDDanhGia());
            ps.setObject(3, review.getNgayDanhGia());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addCoupon(Coupons gg) {
        String query = "insert into Coupon values(?,?,?,?)";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            ps.setObject(1, gg.getID());
            ps.setObject(2, gg.getPhanTramGiam());
            ps.setObject(3, dateFormat.parse(gg.getHan()));
            ps.setObject(4, gg.getTrangThai());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCoupon(String id) {
        String query = "delete from Coupon where ID = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updCouponStatus(String now) {
        String query = "update Coupon set trangThai = 0 where Han < ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            ps.setObject(1, dateFormat.parse(now));
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delExpiredCoupon(String now) {
        String query = "delete from Coupon where Han < ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            ps.setObject(1, dateFormat.parse(now));
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delProduct(String id) {
        String query = "delete from SanPham where ID = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteAccount(String email) {
        String query = "delete from Account where Email = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, email);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(String email) {
        String query = "delete from Users where Email = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, email);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean RemoveStaffRole(String email) {
        String query = "update Users set loaiTK = 'Khách' where Email = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, email);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean AddStaffRole(String email) {
        String query = "update Users set loaiTK = 'Nhân viên' where Email = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, email);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean RemoveAccountStaffRole(String email) {
        String query = "update Account set chucVu = 0 where Email = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, email);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean AddAccountStaffRole(String email) {
        String query = "update Account set chucVu = 1 where Email = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, email);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean usedCoupon(String ID) {
        String query = "update Coupon set trangThai = 0 where ID = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, ID);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateProduct(Products prod) {
        String query = "update SanPham set tenSP = ?, trangThai = ?, gia = ?, soLuong = ?, img = ?, ngayThem = ? where ID = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, prod.getTenSP());
            ps.setObject(2, prod.getTrangThai());
            ps.setObject(3, prod.getGia());
            ps.setObject(4, prod.getSoLuong());
            ps.setObject(5, prod.getImg());
            ps.setObject(6, prod.getNgayThem());
            ps.setObject(7, prod.getID());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateProductAmount(String tenSP, Integer soLuong) {
        String query = "update SanPham set soLuong = ? where tenSP = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, soLuong);
            ps.setObject(2, tenSP);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateBillStatus(String chiTiet, String details) {
        String query = "update HoaDon set trangThai = ? where chiTiet = ?";
        try (Connection cn = connection.getConnection(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setObject(1, details);
            ps.setObject(2, chiTiet);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
