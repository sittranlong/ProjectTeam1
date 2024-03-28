/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.HoaDonChiTietDAO;
import DAO.HoaDonDAO;
import ENTITY.HoaDon;
import ENTITY.HoaDonChiTiet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 *
 * @author TieuLong
 */
public class QuanLyHoaDon extends javax.swing.JPanel {

    private DefaultTableModel model = new DefaultTableModel();
    private HoaDonDAO hdd = new HoaDonDAO();
    private HoaDonChiTietDAO hdctd = new HoaDonChiTietDAO();

    /**
     * O
     * Creates new form QuanLyHoaDon
     */
    public QuanLyHoaDon() {
        initComponents();
        model = (DefaultTableModel) tb_hoadon.getModel();
        model = (DefaultTableModel) tb_hoadonchitiet.getModel();
        loadTable();
        loadTable2();
    }

    public void loadTable() {
        model.setRowCount(0);
        List<HoaDon> list = hdd.getHD();
        for (HoaDon hd : list) {
            model.addRow(new Object[]{
                hd.getMahd(),
                hd.getIdnv(),
                hd.getIdkh(),
                hd.getNgayTao(),
                hd.getTenSP(),
                hd.getTongTien()
            });
        }
    }
     public void loadTable2() {
        model.setRowCount(0);
        List<HoaDonChiTiet> list = hdctd.getHDCT();
        for (HoaDonChiTiet hdCT : list) {
            model.addRow(new Object[]{
                hdCT.getMahd(),
                hdCT.getManv(),
                hdCT.getMakh(),
                hdCT.getNgayTao(),
                hdCT.getNgayChinhSua(),
                hdCT.getTensp(),
                hdCT.getSoluong(),
                hdCT.getThanhtien(),
            });
        }
    }


    
    public void fillTable() {
        int row = tb_hoadon.getSelectedRow();
        tf_makhachhang.setText(tb_hoadon.getValueAt(row, 0) + "");
        tf_makhachhang.setText(tb_hoadon.getValueAt(row, 1) + "");
        tf_manhanvien.setText(tb_hoadon.getValueAt(row, 2) + "");
        tf_ngaytao.setText(tb_hoadon.getValueAt(row, 3) + "");
        tf_tensanpham.setText(tb_hoadon.getValueAt(row, 4) + "");
        tf_tongtien.setText(tb_hoadon.getValueAt(row, 5) + "");
    }

    public void clear() {
        tf_makhachhang.setText("");
        tf_makhachhang.setText("");
        tf_manhanvien.setText("");
        tf_ngaytao.setText("");
        tf_tensanpham.setText("");
        tf_tongtien.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_tb_hoadon = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_hoadon = new javax.swing.JTable();
        lb_mahoadon = new javax.swing.JLabel();
        lb_manhanvien = new javax.swing.JLabel();
        lb_makhachhang = new javax.swing.JLabel();
        lb_ngaytao = new javax.swing.JLabel();
        lb_tensanpham = new javax.swing.JLabel();
        lb_tongtien = new javax.swing.JLabel();
        tf_mahoadon = new javax.swing.JTextField();
        tf_manhanvien = new javax.swing.JTextField();
        tf_makhachhang = new javax.swing.JTextField();
        tf_ngaytao = new javax.swing.JTextField();
        tf_tensanpham = new javax.swing.JTextField();
        tf_tongtien = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        btn_themhoadon = new javax.swing.JButton();
        btn_xuathoadon = new javax.swing.JButton();
        btn_xoahoadon = new javax.swing.JButton();
        pn_tb_hoadonchitiet = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_hoadonchitiet = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tf_timkiem = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_tb_hoadon.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Hóa đơn");

        tb_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Ngày tạo", "Tên sản phẩm", "Thành tiền"
            }
        ));
        tb_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_hoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_hoadon);

        javax.swing.GroupLayout pn_tb_hoadonLayout = new javax.swing.GroupLayout(pn_tb_hoadon);
        pn_tb_hoadon.setLayout(pn_tb_hoadonLayout);
        pn_tb_hoadonLayout.setHorizontalGroup(
            pn_tb_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tb_hoadonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_tb_hoadonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        pn_tb_hoadonLayout.setVerticalGroup(
            pn_tb_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tb_hoadonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        add(pn_tb_hoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 84, 610, 417));

        lb_mahoadon.setText("Mã hóa đơn");
        add(lb_mahoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 151, -1, -1));

        lb_manhanvien.setText("Mã nhân viên");
        add(lb_manhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 191, -1, -1));

        lb_makhachhang.setText("Mã khách hàng");
        add(lb_makhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 236, -1, -1));

        lb_ngaytao.setText("Ngày tạo");
        add(lb_ngaytao, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 276, -1, -1));

        lb_tensanpham.setText("Tên sản phẩm");
        add(lb_tensanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 316, -1, -1));

        lb_tongtien.setText("Tổng tiền");
        add(lb_tongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 356, -1, -1));
        add(tf_mahoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 148, 107, -1));
        add(tf_manhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 188, 107, -1));
        add(tf_makhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 233, 107, -1));

        tf_ngaytao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ngaytaoActionPerformed(evt);
            }
        });
        add(tf_ngaytao, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 273, 107, -1));
        add(tf_tensanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 313, 107, -1));
        add(tf_tongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 353, 107, -1));

        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });
        add(btn_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 450, 80, -1));

        btn_themhoadon.setText("Thêm hóa đơn");
        btn_themhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themhoadonActionPerformed(evt);
            }
        });
        add(btn_themhoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        btn_xuathoadon.setText("Xuất hóa đơn");
        btn_xuathoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuathoadonActionPerformed(evt);
            }
        });
        add(btn_xuathoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        btn_xoahoadon.setText("Xóa hóa đơn");
        btn_xoahoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoahoadonActionPerformed(evt);
            }
        });
        add(btn_xoahoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 110, -1));

        pn_tb_hoadonchitiet.setBackground(new java.awt.Color(0, 204, 204));

        tb_hoadonchitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn chi tiết", "Mã nhân viên", "Mã khách hàng", "Ngày tạo", "Ngày chỉnh sửa", "Tên sản phẩm", "Số lượng", "Thành tiền"
            }
        ));
        jScrollPane2.setViewportView(tb_hoadonchitiet);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Hóa đơn chi tiết");

        javax.swing.GroupLayout pn_tb_hoadonchitietLayout = new javax.swing.GroupLayout(pn_tb_hoadonchitiet);
        pn_tb_hoadonchitiet.setLayout(pn_tb_hoadonchitietLayout);
        pn_tb_hoadonchitietLayout.setHorizontalGroup(
            pn_tb_hoadonchitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tb_hoadonchitietLayout.createSequentialGroup()
                .addGroup(pn_tb_hoadonchitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_tb_hoadonchitietLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel2))
                    .addGroup(pn_tb_hoadonchitietLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_tb_hoadonchitietLayout.setVerticalGroup(
            pn_tb_hoadonchitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tb_hoadonchitietLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        add(pn_tb_hoadonchitiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 522, 962, 380));
        add(tf_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ngaytaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ngaytaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ngaytaoActionPerformed

    private void btn_themhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themhoadonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_themhoadonActionPerformed

    private void tb_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_hoadonMouseClicked
        fillTable();        // TODO add your handling code here:
    }//GEN-LAST:event_tb_hoadonMouseClicked

    private void btn_xoahoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoahoadonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xoahoadonActionPerformed

    private void btn_xuathoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuathoadonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xuathoadonActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_timkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_themhoadon;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoahoadon;
    private javax.swing.JButton btn_xuathoadon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_mahoadon;
    private javax.swing.JLabel lb_makhachhang;
    private javax.swing.JLabel lb_manhanvien;
    private javax.swing.JLabel lb_ngaytao;
    private javax.swing.JLabel lb_tensanpham;
    private javax.swing.JLabel lb_tongtien;
    private java.awt.Panel pn_tb_hoadon;
    private java.awt.Panel pn_tb_hoadonchitiet;
    private javax.swing.JTable tb_hoadon;
    private javax.swing.JTable tb_hoadonchitiet;
    private javax.swing.JTextField tf_mahoadon;
    private javax.swing.JTextField tf_makhachhang;
    private javax.swing.JTextField tf_manhanvien;
    private javax.swing.JTextField tf_ngaytao;
    private javax.swing.JTextField tf_tensanpham;
    private javax.swing.JTextField tf_timkiem;
    private javax.swing.JTextField tf_tongtien;
    // End of variables declaration//GEN-END:variables

//    private void loadTable() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
