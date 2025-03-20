/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Manage.QuanLySQL;
import Models.Users;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jimbe
 */
public class QLNhanVien extends javax.swing.JFrame {

    String search2 = "no";
    String search = "no";
    QuanLySQL ql = new QuanLySQL();

    void load(ArrayList<Users> list) {
        DefaultTableModel model = (DefaultTableModel) tblNV.getModel();
        model.setRowCount(0);
        for (Users user : list) {
            model.addRow(new Object[]{
                user.getEmail(), user.getTen()
            });
        }
    }

    void loadKhach(ArrayList<Users> list) {
        DefaultTableModel model = (DefaultTableModel) tblNV1.getModel();
        model.setRowCount(0);
        for (Users user : list) {
            model.addRow(new Object[]{
                user.getEmail(), user.getTen()
            });
        }
    }

    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVien() {
        initComponents();
        load(ql.getStaffsList());
        loadKhach(ql.getOtherUsersList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNV1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDel = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRemoveRole = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnGiveRole = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDelCustomer = new javax.swing.JTextField();
        btnXoa1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSearchStaff = new javax.swing.JButton();
        btnSearchCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email/TK", "Họ tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNV);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách nhân viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("<<Back");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        tblNV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email/TK", "Họ tên"
            }
        ));
        tblNV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNV1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNV1);
        if (tblNV1.getColumnModel().getColumnCount() > 0) {
            tblNV1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Danh sách tài khoản khách");

        jLabel4.setText("Xóa nhân viên/tài khoản liên quan");

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel5.setText("Tước quyền nhân viên");

        btnRemoveRole.setText("Xác nhận");
        btnRemoveRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveRoleMouseClicked(evt);
            }
        });

        jLabel6.setText("Trao quyền nhân viên");

        btnGiveRole.setText("Xác nhận");
        btnGiveRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGiveRoleMouseClicked(evt);
            }
        });

        jLabel7.setText("Xóa khách/tài khoản liên quan");

        btnXoa1.setText("Xóa");
        btnXoa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoa1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Thêm TK>>");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Reload");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Reload");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        btnSearchStaff.setText("Search");
        btnSearchStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchStaffMouseClicked(evt);
            }
        });

        btnSearchCustomer.setText("Search");
        btnSearchCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(btnRemoveRole)
                            .addComponent(btnXoa)
                            .addComponent(txtDel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(btnXoa1)
                            .addComponent(btnGiveRole)
                            .addComponent(txtDelCustomer))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchStaff)
                    .addComponent(btnSearchCustomer))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchStaff))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveRole)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGiveRole)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new ManagerMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new SignUp().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String email = txtDel.getText();
            ql.deleteUser(email);
            ql.deleteAccount(email);
            JOptionPane.showMessageDialog(this, "Đã xóa thông tin nhân viên và tài khoản nhân viên");
        } else {
            JOptionPane.showMessageDialog(this, "Đã hủy xóa");
        }
        load(ql.getStaffsList());
    }//GEN-LAST:event_btnXoaMouseClicked

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVMouseClicked
        if (search.equals("yes")) {
        } else {
            int row = tblNV.getSelectedRow();
            Users user = ql.getStaffsList().get(row);
            txtDel.setText(user.getEmail());
        }
    }//GEN-LAST:event_tblNVMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        search = "no";
        load(ql.getStaffsList());
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        search2 = "no";
        loadKhach(ql.getOtherUsersList());
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnXoa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa1MouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String email = txtDelCustomer.getText();
            ql.deleteUser(email);
            ql.deleteAccount(email);
            JOptionPane.showMessageDialog(this, "Đã xóa khách và tài khoản khách");
        } else {
            JOptionPane.showMessageDialog(this, "Đã hủy xóa");
        }
        loadKhach(ql.getOtherUsersList());
    }//GEN-LAST:event_btnXoa1MouseClicked

    private void tblNV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNV1MouseClicked
        if (search2.equals("yes")) {
        } else {
            int row = tblNV1.getSelectedRow();
            Users user = ql.getOtherUsersList().get(row);
            txtDelCustomer.setText(user.getEmail());
        }
    }//GEN-LAST:event_tblNV1MouseClicked

    private void btnRemoveRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveRoleMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String email = txtDel.getText();
            ql.RemoveStaffRole(email);
            ql.RemoveAccountStaffRole(email);
            JOptionPane.showMessageDialog(this, "Đã đổi chức vụ tài khoản thành 'Khách'");
        } else {
            JOptionPane.showMessageDialog(this, "Đã hủy tước quyền");
        }
        loadKhach(ql.getOtherUsersList());
        load(ql.getStaffsList());
    }//GEN-LAST:event_btnRemoveRoleMouseClicked

    private void btnGiveRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiveRoleMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String email = txtDelCustomer.getText();
            ql.AddStaffRole(email);
            ql.AddAccountStaffRole(email);
            JOptionPane.showMessageDialog(this, "Đã đổi chức vụ tài khoản thành 'Nhân viên'");
        } else {
            JOptionPane.showMessageDialog(this, "Đã hủy trao quyền");
        }
        loadKhach(ql.getOtherUsersList());
        load(ql.getStaffsList());
    }//GEN-LAST:event_btnGiveRoleMouseClicked

    private void btnSearchStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchStaffMouseClicked
        search = "yes";
        ArrayList<Users> templist = new ArrayList<>();
        Users searched = new Users();
        for (Users user : ql.getStaffsList()) {
            if (user.getEmail().equals(txtDel.getText())) {
                searched = user;
            }
        }
        templist.add(searched);
        load(templist);
    }//GEN-LAST:event_btnSearchStaffMouseClicked

    private void btnSearchCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchCustomerMouseClicked
        search2 = "yes";
        ArrayList<Users> templist = new ArrayList<>();
        Users searched = new Users();
        for (Users user : ql.getOtherUsersList()) {
            if (user.getEmail().equals(txtDelCustomer.getText())) {
                searched = user;
            }
        }
        templist.add(searched);
        loadKhach(templist);
    }//GEN-LAST:event_btnSearchCustomerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiveRole;
    private javax.swing.JButton btnRemoveRole;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchStaff;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNV;
    private javax.swing.JTable tblNV1;
    private javax.swing.JTextField txtDel;
    private javax.swing.JTextField txtDelCustomer;
    // End of variables declaration//GEN-END:variables
}
