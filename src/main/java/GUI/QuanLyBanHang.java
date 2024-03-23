/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.BanHangDao;
import DAO.ChiTietSanPhamDAO;
import ENTITY.ChiTietSanPham;
import ENTITY.HoaDon;
import ENTITY.HoaDonChiTiet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TieuLong
 */
public class QuanLyBanHang extends javax.swing.JPanel {

    private ChiTietSanPham ctsp = new ChiTietSanPham();
    private DefaultTableModel dtm = new DefaultTableModel();
    private BanHangDao ctspsi = new BanHangDao();
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    private List<ChiTietSanPham> list = new ArrayList<>();

    /**
     * Creates new form QuanLyBanHang
     */
    public QuanLyBanHang() {
        initComponents();
        dtm = (DefaultTableModel) tblSanPham.getModel();
        LoadCbbLocKD(ctspsi.getListKieuDang1());
        LoadCbbLocS(ctspsi.getListSize1());
        list = ctspsi.getAll();
        showData(list);
    }

    private void showData(List<ChiTietSanPham> list) {
        dtm.setRowCount(0);
        for (ChiTietSanPham ctsp : list) {
            dtm.addRow(new Object[]{ctsp.getMactsp(), ctsp.getIdsp(), ctsp.getIdsize(), ctsp.getIdkieu(), ctsp.getDongia(), ctsp.getSoluong()});
        }
    }

    private void LoadCbbLocKD(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbKieu.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbLocS(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbSize.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }


//    private void fillTableGioHang(List<HoaDonChiTiet> list) {
//        DefaultTableModel dtm = new DefaultTableModel();
//        dtm = (DefaultTableModel) tblSanPham.getModel();
//        dtm.setRowCount(0);
//        for (HoaDonChiTiet x : list) {
//            dtm.addRow(new Object[]{x.getIdctsp(), x.getIdctsp(), x.getIdctsp(), x.getSoluong()});
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQUANLYBANHANG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHoaDonCho = new javax.swing.JTable();
        jLabelHoaDonCho = new javax.swing.JLabel();
        jLabelGioHang = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGioHang = new javax.swing.JTable();
        jLabelSanPham = new javax.swing.JLabel();
        jLabelSDTKhachHang = new javax.swing.JLabel();
        jTextFieldSDTKhachHang = new javax.swing.JTextField();
        jLabelTenKhachHang = new javax.swing.JLabel();
        jTextFieldTenKhachHang = new javax.swing.JTextField();
        jButtonTimKiemKhachHang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonThemMoiKhachHang = new javax.swing.JButton();
        jButtonTreoHoaDon = new javax.swing.JButton();
        cbbKieu = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        jLabelTenSanPham = new javax.swing.JLabel();
        txtTk = new javax.swing.JTextField();
        jButtonTimTenSanPham = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        jLabelQUANLYBANHANG.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelQUANLYBANHANG.setText("QUẢN LÝ BÁN HÀNG");

        jTableHoaDonCho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Tạo Hóa Đơn", "Tổng Tiền", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(jTableHoaDonCho);

        jLabelHoaDonCho.setText("Hóa Đơn Chờ");

        jLabelGioHang.setText("Giỏ Hàng");

        jTableGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Size", "Đơn giá", "Số lượng nhập"
            }
        ));
        jTableGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableGioHang);

        jLabelSanPham.setText("Sản Phẩm");

        jLabelSDTKhachHang.setText("SDT Khách Hàng");

        jLabelTenKhachHang.setText("Tên Khách Hàng");

        jButtonTimKiemKhachHang.setText("Tìm Kiếm");

        jLabel1.setText("Khách Hàng");

        jButtonThemMoiKhachHang.setText("Thêm Mới");

        jButtonTreoHoaDon.setText("Treo Hóa Đơn");

        cbbKieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKieuActionPerformed(evt);
            }
        });

        cbbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSizeActionPerformed(evt);
            }
        });

        jLabelTenSanPham.setText("Tìm Tên Sản Phẩm");

        txtTk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTkMouseClicked(evt);
            }
        });

        jButtonTimTenSanPham.setText("Tìm");
        jButtonTimTenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimTenSanPhamActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên sản phẩm", "Size", "Kiểu Dáng", "Đơn Giá", "Số Lượng"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelGioHang)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHoaDonCho))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelQUANLYBANHANG)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelSDTKhachHang)
                                                .addComponent(jLabelTenKhachHang))
                                            .addGap(28, 28, 28)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldSDTKhachHang)
                                                .addComponent(jTextFieldTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonTimKiemKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonThemMoiKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSanPham)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelTenSanPham)
                                .addGap(18, 18, 18)
                                .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonTimTenSanPham)
                                .addGap(49, 49, 49)
                                .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonTreoHoaDon))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQUANLYBANHANG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoaDonCho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelSDTKhachHang)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTenKhachHang)
                                        .addComponent(jTextFieldTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonThemMoiKhachHang)))
                                .addComponent(jTextFieldSDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonTimKiemKhachHang)
                                .addGap(34, 34, 34)))
                        .addGap(15, 15, 15)))
                .addGap(29, 29, 29)
                .addComponent(jLabelGioHang)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTreoHoaDon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSanPham)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTenSanPham)
                        .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTimTenSanPham)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTimTenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimTenSanPhamActionPerformed
        // TODO add your handling code here:

        String tk = txtTk.getText();
        ctspsi.Tk(tk);
        list = ctspsi.Tk(tk);
        showData(list);
    }//GEN-LAST:event_jButtonTimTenSanPhamActionPerformed

    private void txtTkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTkMouseClicked
        // TODO add your handling code here:
        txtTk.setText("");
        list = ctspsi.getAll();
        showData(list);
    }//GEN-LAST:event_txtTkMouseClicked

    private void cbbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSizeActionPerformed
        // TODO add your handling code here:
        String ten = cbbSize.getSelectedItem().toString();
        ctspsi.Loc1(ten);
        list = ctspsi.Loc1(ten);
        showData(list);
    }//GEN-LAST:event_cbbSizeActionPerformed

    private void cbbKieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKieuActionPerformed
        // TODO add your handling code here:
//        String ma = cbbKieu.getSelectedItem().toString();
//        ctspsi.Loc1(ma);
//        list = ctspsi.Loc1(ma);
//        showData(list);
    }//GEN-LAST:event_cbbKieuActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

        int rowIndex = tblSanPham.getSelectedRow();
DefaultTableModel model1 = (DefaultTableModel) tblSanPham.getModel();

// Chỉ định chỉ số các cột bạn quan tâm
int[] columnsOfInterest = {0, 1, 5, 4}; // Ví dụ: lấy cột 0, 1, 5 và 4

// Kiểm tra xem có dòng được chọn không
if (rowIndex != -1) {
    // Lấy dữ liệu từ các cột quan tâm
    Object[] rowData = new Object[columnsOfInterest.length];
    for (int i = 0; i < columnsOfInterest.length; i++) {
        int columnIndex = columnsOfInterest[i];
        rowData[i] = model1.getValueAt(rowIndex, columnIndex);
    }

    // Yêu cầu người dùng nhập số lượng
    String quantityString = JOptionPane.showInputDialog(null, "Nhập số lượng:", "Nhập số lượng", JOptionPane.PLAIN_MESSAGE);
    if (quantityString != null && !quantityString.isEmpty()) {
        try {
            int quantity = Integer.parseInt(quantityString);
            int currentQuantity = (int) model1.getValueAt(rowIndex, columnsOfInterest[3]); // Lấy dữ liệu từ cột số lượng
            if (quantity <= currentQuantity) {
                // Tạo DefaultTableModel cho jTableGioHang nếu chưa có
                DefaultTableModel model2 = (DefaultTableModel) jTableGioHang.getModel();
                if (model2.getRowCount() == 0) {
                    // Thêm các cột vào bảng jTableGioHang
                    for (int i = 0; i < columnsOfInterest.length; i++) {
                        int columnIndex = columnsOfInterest[i];
                        model2.addColumn(model1.getColumnName(columnIndex));
                    }
                    // Thêm cột mới để hiển thị số lượng nhập vào
                    model2.addColumn("Số lượng nhập");
                }

                // Thêm dữ liệu vào jTableGioHang từ hàng đầu tiên
                Object[] newData = new Object[rowData.length + 1];
                System.arraycopy(rowData, 0, newData, 0, rowData.length); // Sao chép dữ liệu từ rowData
                newData[rowData.length] = quantity; // Thêm số lượng nhập vào cuối mảng newData
                model2.insertRow(0, newData); // Thêm dữ liệu mới vào bảng
            } else {
                JOptionPane.showMessageDialog(null, "Số lượng nhập vào phải nhỏ hơn hoặc bằng số lượng hiện có của sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
}



    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void jTableGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGioHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableGioHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbKieu;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JButton jButtonThemMoiKhachHang;
    private javax.swing.JButton jButtonTimKiemKhachHang;
    private javax.swing.JButton jButtonTimTenSanPham;
    private javax.swing.JButton jButtonTreoHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGioHang;
    private javax.swing.JLabel jLabelHoaDonCho;
    private javax.swing.JLabel jLabelQUANLYBANHANG;
    private javax.swing.JLabel jLabelSDTKhachHang;
    private javax.swing.JLabel jLabelSanPham;
    private javax.swing.JLabel jLabelTenKhachHang;
    private javax.swing.JLabel jLabelTenSanPham;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableGioHang;
    private javax.swing.JTable jTableHoaDonCho;
    private javax.swing.JTextField jTextFieldSDTKhachHang;
    private javax.swing.JTextField jTextFieldTenKhachHang;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTk;
    // End of variables declaration//GEN-END:variables
}
