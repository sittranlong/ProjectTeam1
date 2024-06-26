/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.TaiKhoanDAO;
import ENTITY.TaiKhoan;
import static GUI.Dashboard.taiKhoan;
import javax.swing.JOptionPane;

/**
 *
 * @author TieuLong
 */
public class DoiMatKhau extends javax.swing.JFrame {

    TaiKhoan taiKhoan;

    public DoiMatKhau(TaiKhoan tk) {
        initComponents();
        this.taiKhoan = tk;
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleDangNhap = new javax.swing.JLabel();
        jLabelNhapMatKhauCu = new javax.swing.JLabel();
        jLabelNhapMatKhauMoi = new javax.swing.JLabel();
        jLabelNhapLaiMatKhauMoi = new javax.swing.JLabel();
        jTextFieldMatKhauCu = new javax.swing.JTextField();
        jTextFieldMatKhauMoi = new javax.swing.JTextField();
        jTextFieldNhapLaiMatKhauMoi = new javax.swing.JTextField();
        jButtonXacNhan = new javax.swing.JButton();
        jButtonHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleDangNhap.setText("ĐỔI MẬT KHẨU");

        jLabelNhapMatKhauCu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNhapMatKhauCu.setText("Nhập Mật Khẩu Cũ");

        jLabelNhapMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNhapMatKhauMoi.setText("Nhập Mật Khẩu Mới");

        jLabelNhapLaiMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNhapLaiMatKhauMoi.setText("Nhập Lại Mật Khẩu Mới");

        jTextFieldMatKhauCu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldNhapLaiMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButtonXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonXacNhan.setText("Xác Nhận");
        jButtonXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXacNhanActionPerformed(evt);
            }
        });

        jButtonHuy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonHuy.setText("Hủy");
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelNhapLaiMatKhauMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNhapMatKhauMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNhapMatKhauCu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMatKhauCu)
                            .addComponent(jTextFieldMatKhauMoi)
                            .addComponent(jTextFieldNhapLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblTitleDangNhap)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButtonXacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitleDangNhap)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNhapMatKhauCu)
                    .addComponent(jTextFieldMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNhapMatKhauMoi)
                    .addComponent(jTextFieldMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNhapLaiMatKhauMoi)
                    .addComponent(jTextFieldNhapLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonXacNhan)
                    .addComponent(jButtonHuy))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jButtonXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXacNhanActionPerformed
        if (jTextFieldMatKhauCu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu cũ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jTextFieldMatKhauCu.requestFocus();
            return;
        }
        if (jTextFieldMatKhauMoi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu mới!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jTextFieldMatKhauMoi.requestFocus();
            return;
        }
        if (jTextFieldNhapLaiMatKhauMoi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng xác nhận mật khẩu cũ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jTextFieldNhapLaiMatKhauMoi.requestFocus();
            return;
        }
        if (!jTextFieldMatKhauCu.getText().equals(taiKhoan.getPass())) {
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ không đúng, vui lòng nhập lại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jTextFieldMatKhauCu.requestFocus();
            return;
        }
        if (!jTextFieldNhapLaiMatKhauMoi.getText().equals(jTextFieldMatKhauMoi.getText())) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không khớp!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jTextFieldNhapLaiMatKhauMoi.requestFocus();
            return;
        }

        if (jTextFieldMatKhauCu.getText().equals(taiKhoan.getPass()) && jTextFieldNhapLaiMatKhauMoi.getText().equals(jTextFieldMatKhauMoi.getText())) {
            TaiKhoanDAO.DoiMatKhau(taiKhoan.getTentaikhoan(), jTextFieldNhapLaiMatKhauMoi.getText());
            taiKhoan.setPass(jTextFieldNhapLaiMatKhauMoi.getText());
            Dashboard.DoiMatKhau(jTextFieldNhapLaiMatKhauMoi.getText());
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            Dashboard.doiMatKhau = null;
            this.dispose();
        }
    }//GEN-LAST:event_jButtonXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DoiMatKhau(taiKhoan).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JButton jButtonXacNhan;
    private javax.swing.JLabel jLabelNhapLaiMatKhauMoi;
    private javax.swing.JLabel jLabelNhapMatKhauCu;
    private javax.swing.JLabel jLabelNhapMatKhauMoi;
    private javax.swing.JTextField jTextFieldMatKhauCu;
    private javax.swing.JTextField jTextFieldMatKhauMoi;
    private javax.swing.JTextField jTextFieldNhapLaiMatKhauMoi;
    private javax.swing.JLabel lblTitleDangNhap;
    // End of variables declaration//GEN-END:variables
}
