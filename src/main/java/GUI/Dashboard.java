/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ENTITY.TaiKhoan;
import javax.swing.JFrame;

/**
 *
 * @author TieuLong
 */
public class Dashboard extends javax.swing.JFrame {

    static TaiKhoan taiKhoan;
    static DoiMatKhau doiMatKhau;
    QuanLyBanHang quanLyBanHang;
    QuanLyDoiTra quanLyDoiTra;
    QuanLyHoaDon quanLyHoaDon;
    QuanLyKhachHang quanLyKhachHang;
    QuanLyNhanVien quanLyNhanVien;
    QuanLySanPham quanLySanPham;
    QuanLyThongKe quanLyThongKe;
    SanPham sanPham;
    ThuocTinhSanPham thuocTinhSanPham;

    /**
     * Creates new form Dashboard
     */
    public Dashboard(TaiKhoan tk) {
        this.taiKhoan = tk;
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Mở cửa sổ trong chế độ toàn màn hình
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        System.out.println(tk.toString());
    }

    public static void DoiMatKhau(String pass) {
        taiKhoan.setPass(pass);
        System.out.println(taiKhoan.toString());
    }

    public void CapNhatDashboard() {
        if (quanLyBanHang != null) {
            
        }
        if (quanLyDoiTra != null) {
            
        }
        if (quanLyHoaDon != null) {

        }
        if (quanLyKhachHang != null) {

        }
        if (quanLyNhanVien != null) {
            quanLyNhanVien.LoadList();
            quanLyNhanVien.ClearForm();
            quanLyNhanVien.FillTable();
            quanLyNhanVien.selectFirstRow();
        }
        if (quanLySanPham != null) {

        }
        if (quanLyThongKe != null) {

        }
        if (sanPham != null) {

        }
        if (thuocTinhSanPham != null) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneDashboard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSanPham = new javax.swing.JMenu();
        jMenuItemQLSPCT = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuHoaDon = new javax.swing.JMenu();
        jMenuItemQLHoaDonVaHDCT = new javax.swing.JMenuItem();
        jMenuItemQLThongKe = new javax.swing.JMenuItem();
        jMenuBanHang = new javax.swing.JMenu();
        jMenuItemQLBanHang = new javax.swing.JMenuItem();
        jMenuItemQLDoiHang = new javax.swing.JMenuItem();
        jMenuNguoiDung = new javax.swing.JMenu();
        jMenuItemQLKhachHang = new javax.swing.JMenuItem();
        jMenuItemQLNhanVien = new javax.swing.JMenuItem();
        jMenuTaiKhoan = new javax.swing.JMenu();
        jMenuItemDoiMatKhau = new javax.swing.JMenuItem();
        jMenuItemDangXuat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneDashboard.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneDashboardStateChanged(evt);
            }
        });

        jMenuSanPham.setText("Quản Lý Sản Phẩm");

        jMenuItemQLSPCT.setText("Chi Tiết Sản Phẩm");
        jMenuItemQLSPCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLSPCTActionPerformed(evt);
            }
        });
        jMenuSanPham.add(jMenuItemQLSPCT);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Thuộc Tính Sản Phẩm");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSanPham.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenuSanPham);

        jMenuHoaDon.setText("Hóa Đơn");

        jMenuItemQLHoaDonVaHDCT.setText("Quản Lý Hóa Đơn & Hóa Đơn Chi Tiết");
        jMenuItemQLHoaDonVaHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLHoaDonVaHDCTActionPerformed(evt);
            }
        });
        jMenuHoaDon.add(jMenuItemQLHoaDonVaHDCT);

        jMenuItemQLThongKe.setText("Thống Kê");
        jMenuItemQLThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLThongKeActionPerformed(evt);
            }
        });
        jMenuHoaDon.add(jMenuItemQLThongKe);

        jMenuBar1.add(jMenuHoaDon);

        jMenuBanHang.setText("Bán Hàng");

        jMenuItemQLBanHang.setText("Quản Lý Bán Hàng");
        jMenuItemQLBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLBanHangActionPerformed(evt);
            }
        });
        jMenuBanHang.add(jMenuItemQLBanHang);

        jMenuItemQLDoiHang.setText("Quản Lý Đổi Hàng");
        jMenuItemQLDoiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLDoiHangActionPerformed(evt);
            }
        });
        jMenuBanHang.add(jMenuItemQLDoiHang);

        jMenuBar1.add(jMenuBanHang);

        jMenuNguoiDung.setText("Người Dùng");

        jMenuItemQLKhachHang.setText("Quản Lý Khách Hàng");
        jMenuItemQLKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLKhachHangActionPerformed(evt);
            }
        });
        jMenuNguoiDung.add(jMenuItemQLKhachHang);

        jMenuItemQLNhanVien.setText("Quản Lý Nhân Viên");
        jMenuItemQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLNhanVienActionPerformed(evt);
            }
        });
        jMenuNguoiDung.add(jMenuItemQLNhanVien);

        jMenuBar1.add(jMenuNguoiDung);

        jMenuTaiKhoan.setText("Tài Khoản");

        jMenuItemDoiMatKhau.setText("Đổi Mật Khẩu");
        jMenuItemDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDoiMatKhauActionPerformed(evt);
            }
        });
        jMenuTaiKhoan.add(jMenuItemDoiMatKhau);

        jMenuItemDangXuat.setText("Đăng Xuất");
        jMenuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDangXuatActionPerformed(evt);
            }
        });
        jMenuTaiKhoan.add(jMenuItemDangXuat);

        jMenuBar1.add(jMenuTaiKhoan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneDashboardStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneDashboardStateChanged
        CapNhatDashboard();
    }//GEN-LAST:event_jTabbedPaneDashboardStateChanged

    private void jMenuItemDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDoiMatKhauActionPerformed
        if (doiMatKhau == null) {
            doiMatKhau = new DoiMatKhau(taiKhoan);
            System.out.println("Đổi mật khẩu thành công!");
        }
    }//GEN-LAST:event_jMenuItemDoiMatKhauActionPerformed

    private void jMenuItemQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLNhanVienActionPerformed
        if (quanLyNhanVien == null) {
            quanLyNhanVien = new QuanLyNhanVien();
            jTabbedPaneDashboard.add("Quản Lý Nhân Viên", quanLyNhanVien);
            jTabbedPaneDashboard.setSelectedComponent(quanLyNhanVien);
        }
    }//GEN-LAST:event_jMenuItemQLNhanVienActionPerformed

    private void jMenuItemQLKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLKhachHangActionPerformed
        if (quanLyKhachHang == null) {
            quanLyKhachHang = new QuanLyKhachHang();
            jTabbedPaneDashboard.add("Quản Lý Khách Hàng", quanLyKhachHang);
            jTabbedPaneDashboard.setSelectedComponent(quanLyKhachHang);
        }
    }//GEN-LAST:event_jMenuItemQLKhachHangActionPerformed

    private void jMenuItemQLBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLBanHangActionPerformed
        if (quanLyBanHang == null) {
            quanLyBanHang = new QuanLyBanHang();
            jTabbedPaneDashboard.add("Quản Lý Bán Hàng", quanLyBanHang);
            jTabbedPaneDashboard.setSelectedComponent(quanLyBanHang);
        }
    }//GEN-LAST:event_jMenuItemQLBanHangActionPerformed

    private void jMenuItemQLDoiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLDoiHangActionPerformed
        if (quanLyDoiTra == null) {
            quanLyDoiTra = new QuanLyDoiTra(); // Tạo một đối tượng mới cho lớp quản lý đổi hàng
            jTabbedPaneDashboard.add("Quản Lý Đổi Trả", quanLyDoiTra);
            jTabbedPaneDashboard.setSelectedComponent(quanLyDoiTra);
        }
    }//GEN-LAST:event_jMenuItemQLDoiHangActionPerformed

    private void jMenuItemQLThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLThongKeActionPerformed
        if (quanLyThongKe == null) {
            quanLyThongKe = new QuanLyThongKe(); // Tạo một đối tượng mới cho lớp quản lý thống kê
            jTabbedPaneDashboard.add("Quản Lý Thống Kê", quanLyThongKe);
            jTabbedPaneDashboard.setSelectedComponent(quanLyThongKe);
        }
    }//GEN-LAST:event_jMenuItemQLThongKeActionPerformed

    private void jMenuItemQLHoaDonVaHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLHoaDonVaHDCTActionPerformed
        if (quanLyHoaDon == null) {
            quanLyHoaDon = new QuanLyHoaDon(); // Tạo một đối tượng mới cho lớp quản lý hoá đơn
            jTabbedPaneDashboard.add("Quản Lý Hoá Đơn", quanLyHoaDon);
            jTabbedPaneDashboard.setSelectedComponent(quanLyHoaDon);
        }
    }//GEN-LAST:event_jMenuItemQLHoaDonVaHDCTActionPerformed

    private void jMenuItemQLSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLSPCTActionPerformed
        if (quanLySanPham == null) {
            quanLySanPham = new QuanLySanPham();
            jTabbedPaneDashboard.add("Quản Lý CT Sản Phẩm", quanLySanPham);
            jTabbedPaneDashboard.setSelectedComponent(quanLySanPham);
        }
    }//GEN-LAST:event_jMenuItemQLSPCTActionPerformed

    private void jMenuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDangXuatActionPerformed
        this.setVisible(false);
        new DangNhap();
    }//GEN-LAST:event_jMenuItemDangXuatActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (thuocTinhSanPham == null) {
            thuocTinhSanPham = new ThuocTinhSanPham();
            jTabbedPaneDashboard.add("Quản Lý CT Sản Phẩm", thuocTinhSanPham);
            jTabbedPaneDashboard.setSelectedComponent(thuocTinhSanPham);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard(taiKhoan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenuBanHang;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHoaDon;
    private javax.swing.JMenuItem jMenuItemDangXuat;
    private javax.swing.JMenuItem jMenuItemDoiMatKhau;
    private javax.swing.JMenuItem jMenuItemQLBanHang;
    private javax.swing.JMenuItem jMenuItemQLDoiHang;
    private javax.swing.JMenuItem jMenuItemQLHoaDonVaHDCT;
    private javax.swing.JMenuItem jMenuItemQLKhachHang;
    private javax.swing.JMenuItem jMenuItemQLNhanVien;
    private javax.swing.JMenuItem jMenuItemQLSPCT;
    private javax.swing.JMenuItem jMenuItemQLThongKe;
    private javax.swing.JMenu jMenuNguoiDung;
    private javax.swing.JMenu jMenuSanPham;
    private javax.swing.JMenu jMenuTaiKhoan;
    private javax.swing.JTabbedPane jTabbedPaneDashboard;
    // End of variables declaration//GEN-END:variables
}
