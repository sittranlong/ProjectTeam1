/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.HoaDonDAO;
import ENTITY.HoaDon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TieuLong
 */
public class QuanLyHoaDon extends javax.swing.JPanel {
    private  DefaultTableModel model = new DefaultTableModel();
    private HoaDonDAO hdd = new HoaDonDAO();
    
    /**
     * Creates new form QuanLyHoaDon
     */
    public QuanLyHoaDon() {
        initComponents();
        model = ( DefaultTableModel ) tb_hoadon.getModel();
        loadTable ();
    }
    public void loadTable(){
        model.setRowCount(  0);
        Arrylist<HoaDon> list = hdd.getHD();
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
        jScrollPane1.setViewportView(tb_hoadon);

        javax.swing.GroupLayout pn_tb_hoadonLayout = new javax.swing.GroupLayout(pn_tb_hoadon);
        pn_tb_hoadon.setLayout(pn_tb_hoadonLayout);
        pn_tb_hoadonLayout.setHorizontalGroup(
            pn_tb_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_tb_hoadonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
            .addGroup(pn_tb_hoadonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
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

        lb_mahoadon.setText("Mã hóa đơn");

        lb_manhanvien.setText("Mã nhân viên");

        lb_makhachhang.setText("Mã khách hàng");

        lb_ngaytao.setText("Ngày tạo");

        lb_tensanpham.setText("Tên sản phẩm");

        lb_tongtien.setText("Tổng tiền");

        tf_ngaytao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ngaytaoActionPerformed(evt);
            }
        });

        btn_timkiem.setText("Tìm kiếm");

        btn_themhoadon.setText("Thêm hóa đơn");

        btn_xuathoadon.setText("Xuất hóa đơn");

        btn_xoahoadon.setText("Xóa hóa đơn");

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
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_tb_hoadonchitietLayout.setVerticalGroup(
            pn_tb_hoadonchitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tb_hoadonchitietLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_manhanvien)
                            .addComponent(lb_makhachhang)
                            .addComponent(lb_mahoadon)
                            .addComponent(lb_ngaytao)
                            .addComponent(lb_tensanpham)
                            .addComponent(lb_tongtien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_tensanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(tf_ngaytao)
                            .addComponent(tf_tongtien)
                            .addComponent(tf_mahoadon)
                            .addComponent(tf_manhanvien)
                            .addComponent(tf_makhachhang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_xuathoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_themhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_xoahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(pn_tb_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_tb_hoadonchitiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(pn_tb_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_mahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_mahoadon))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_manhanvien))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_makhachhang)
                            .addComponent(tf_makhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_ngaytao)
                            .addComponent(tf_ngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_tensanpham)
                            .addComponent(tf_tensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_tongtien)
                            .addComponent(tf_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themhoadon)
                            .addComponent(btn_timkiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_xuathoadon)
                            .addComponent(btn_xoahoadon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(pn_tb_hoadonchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ngaytaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ngaytaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ngaytaoActionPerformed


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
    private javax.swing.JTextField tf_tongtien;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
