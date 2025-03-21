/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.JOptionPane;

/**
 *
 * @author jimbe
 */
public class ManagerMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMenu
     */
    public ManagerMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qlnvbtn = new javax.swing.JButton();
        qldanhgiabtn = new javax.swing.JButton();
        qlgiamgiabtn = new javax.swing.JButton();
        qldanhgiabtn1 = new javax.swing.JButton();
        qlsanpham = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manager Menu");

        qlnvbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qlnvbtn.setText("QL Tài khoản");
        qlnvbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlnvbtnMouseClicked(evt);
            }
        });

        qldanhgiabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qldanhgiabtn.setText("DS Đánh giá");
        qldanhgiabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qldanhgiabtnMouseClicked(evt);
            }
        });

        qlgiamgiabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qlgiamgiabtn.setText("QL Giảm giá");
        qlgiamgiabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlgiamgiabtnMouseClicked(evt);
            }
        });
        qlgiamgiabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlgiamgiabtnActionPerformed(evt);
            }
        });

        qldanhgiabtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qldanhgiabtn1.setText("Logout");
        qldanhgiabtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qldanhgiabtn1MouseClicked(evt);
            }
        });

        qlsanpham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qlsanpham.setText("QL Sản phẩm");
        qlsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlsanphamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qldanhgiabtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(qldanhgiabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qlgiamgiabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qlnvbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(qlsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(qlnvbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qlgiamgiabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qldanhgiabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qlsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qldanhgiabtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qldanhgiabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qldanhgiabtnMouseClicked
        new DSDanhGia().setVisible(true);
        dispose();
    }//GEN-LAST:event_qldanhgiabtnMouseClicked

    private void qlgiamgiabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlgiamgiabtnMouseClicked
        new PhieuGiamGia().setVisible(true);
        dispose();
    }//GEN-LAST:event_qlgiamgiabtnMouseClicked

    private void qldanhgiabtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qldanhgiabtn1MouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Đã hủy đăng xuất");
        }
    }//GEN-LAST:event_qldanhgiabtn1MouseClicked

    private void qlnvbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlnvbtnMouseClicked
        new QLNhanVien().setVisible(true);
        dispose();
    }//GEN-LAST:event_qlnvbtnMouseClicked

    private void qlgiamgiabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlgiamgiabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qlgiamgiabtnActionPerformed

    private void qlsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlsanphamMouseClicked
        // TODO add your handling code here:
        new QLSanPham().setVisible(true);
        dispose();
    }//GEN-LAST:event_qlsanphamMouseClicked

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
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton qldanhgiabtn;
    private javax.swing.JButton qldanhgiabtn1;
    private javax.swing.JButton qlgiamgiabtn;
    private javax.swing.JButton qlnvbtn;
    private javax.swing.JButton qlsanpham;
    // End of variables declaration//GEN-END:variables
}
