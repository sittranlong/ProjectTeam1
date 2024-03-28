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

    private List<HoaDon> danhSachHoaDonCho;
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
        setVisible(true);
        dtm = (DefaultTableModel) tblSanPham.getModel();
        LoadCbbLocKD(ctspsi.getListKieuDang1());
        LoadCbbLocS(ctspsi.getListSize1());
        list = ctspsi.getAll();
        showData(list);
    }

    private void hienThiHoaDonCho() {
        dtm.setRowCount(0);
        // Thêm 4 hóa đơn chờ vào
        for (HoaDon hoaDon : danhSachHoaDonCho) {
            Object[] row = new Object[]{
                hoaDon.getMahd(),
                hoaDon.getNgayTao(),
                hoaDon.getTongTien(),
                hoaDon.getTrangThai()
            };
            dtm.addRow(row);
        }
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
        jLabelSanPham1 = new javax.swing.JLabel();
        jLabelSanPham2 = new javax.swing.JLabel();
        jButtonTaoHoaDon = new javax.swing.JButton();
        jLabelMaHoaDon = new javax.swing.JLabel();
        jTextFieldSoLuong = new javax.swing.JTextField();
        jLabelSoLuong = new javax.swing.JLabel();
        jTextFieldTongTien = new javax.swing.JTextField();
        jLabelTongTien = new javax.swing.JLabel();
        jTextFieldTienKhachDua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTienThua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxHinhThucThanhToan = new javax.swing.JComboBox<>();
        jButtonThanhToan = new javax.swing.JButton();
        jButtonHuyThanhToan = new javax.swing.JButton();
        jTextFieldTenNhanVien = new javax.swing.JTextField();
        jTextFieldMaHoaDon = new javax.swing.JTextField();
        jLabelTenNhanVien = new javax.swing.JLabel();
        jLabelThongTinHoaDon = new javax.swing.JLabel();

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
                "Mã sản phẩm", "Tên sản phẩm", "Size", "Đơn giá", "Số lượng"
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
        jButtonTreoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTreoHoaDonActionPerformed(evt);
            }
        });

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

        jLabelSanPham1.setText("Size");

        jLabelSanPham2.setText("Kiểu Dáng");

        jButtonTaoHoaDon.setText("Tạo Hóa Đơn");
        jButtonTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaoHoaDonActionPerformed(evt);
            }
        });

        jLabelMaHoaDon.setText("Mã Hóa Đơn");

        jLabelSoLuong.setText("Số Lượng");

        jLabelTongTien.setText("Tổng Tiền");

        jLabel6.setText("Tiền Khách Đưa");

        jLabel7.setText("Tiền Thừa");

        jLabel8.setText("Hình Thức TT");

        jComboBoxHinhThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHinhThucThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHinhThucThanhToanActionPerformed(evt);
            }
        });

        jButtonThanhToan.setText("Thanh Toán");
        jButtonThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThanhToanActionPerformed(evt);
            }
        });

        jButtonHuyThanhToan.setText("Hủy Thanh Toán");
        jButtonHuyThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyThanhToanActionPerformed(evt);
            }
        });

        jLabelTenNhanVien.setText("Tên Nhân Viên");

        jLabelThongTinHoaDon.setText("Thông Tin Hóa Đơn");

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
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelQUANLYBANHANG)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelSDTKhachHang)
                                            .addComponent(jLabelTenKhachHang))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldSDTKhachHang)
                                            .addComponent(jTextFieldTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonTimKiemKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonThemMoiKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                            .addComponent(jButtonTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonTreoHoaDon)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSanPham)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelTenSanPham)
                                .addGap(18, 18, 18)
                                .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonTimTenSanPham))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelSanPham2)
                            .addGap(18, 18, 18)
                            .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(jLabelSanPham1)
                            .addGap(18, 18, 18)
                            .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelThongTinHoaDon)
                    .addComponent(jLabelMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonThanhToan)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHuyThanhToan))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQUANLYBANHANG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoaDonCho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelGioHang)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelThongTinHoaDon))
                        .addGap(18, 18, 18)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonTimKiemKhachHang)
                                    .addComponent(jLabelTenNhanVien)
                                    .addComponent(jTextFieldTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMaHoaDon)
                                    .addComponent(jTextFieldMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTreoHoaDon)
                            .addComponent(jLabelSoLuong)
                            .addComponent(jTextFieldSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTaoHoaDon)
                            .addComponent(jLabelTongTien)
                            .addComponent(jTextFieldTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHuyThanhToan)
                            .addComponent(jButtonThanhToan))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSanPham)
                    .addComponent(jLabelSanPham1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTenSanPham)
                        .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTimTenSanPham)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSanPham2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTimTenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimTenSanPhamActionPerformed
        // TODO add your handling code here:

        
        String tk = txtTk.getText(); // Lấy dữ liệu từ trường văn bản

    // Kiểm tra xem trường văn bản có dữ liệu hay không
    if (!tk.isEmpty()) { // Nếu có dữ liệu
        ctspsi.Tk(tk);
        list = ctspsi.Tk(tk);
        showData(list);
    } else { // Nếu không có dữ liệu
        JOptionPane.showMessageDialog(null, "Vui lòng nhập dữ liệu để tìm"); // Hiển thị thông báo
    }
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
        String ma = cbbKieu.getSelectedItem().toString();
        ctspsi.Loc1(ma);
        list = ctspsi.Loc1(ma);
        showData(list);
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

    private void jButtonTreoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTreoHoaDonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonTreoHoaDonActionPerformed

    private void jComboBoxHinhThucThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHinhThucThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHinhThucThanhToanActionPerformed

    private void jButtonThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThanhToanActionPerformed

    private void jButtonHuyThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHuyThanhToanActionPerformed

    private void jButtonTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaoHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTaoHoaDonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbKieu;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JButton jButtonHuyThanhToan;
    private javax.swing.JButton jButtonTaoHoaDon;
    private javax.swing.JButton jButtonThanhToan;
    private javax.swing.JButton jButtonThemMoiKhachHang;
    private javax.swing.JButton jButtonTimKiemKhachHang;
    private javax.swing.JButton jButtonTimTenSanPham;
    private javax.swing.JButton jButtonTreoHoaDon;
    private javax.swing.JComboBox<String> jComboBoxHinhThucThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGioHang;
    private javax.swing.JLabel jLabelHoaDonCho;
    private javax.swing.JLabel jLabelMaHoaDon;
    private javax.swing.JLabel jLabelQUANLYBANHANG;
    private javax.swing.JLabel jLabelSDTKhachHang;
    private javax.swing.JLabel jLabelSanPham;
    private javax.swing.JLabel jLabelSanPham1;
    private javax.swing.JLabel jLabelSanPham2;
    private javax.swing.JLabel jLabelSoLuong;
    private javax.swing.JLabel jLabelTenKhachHang;
    private javax.swing.JLabel jLabelTenNhanVien;
    private javax.swing.JLabel jLabelTenSanPham;
    private javax.swing.JLabel jLabelThongTinHoaDon;
    private javax.swing.JLabel jLabelTongTien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableGioHang;
    private javax.swing.JTable jTableHoaDonCho;
    private javax.swing.JTextField jTextFieldMaHoaDon;
    private javax.swing.JTextField jTextFieldSDTKhachHang;
    private javax.swing.JTextField jTextFieldSoLuong;
    private javax.swing.JTextField jTextFieldTenKhachHang;
    private javax.swing.JTextField jTextFieldTenNhanVien;
    private javax.swing.JTextField jTextFieldTienKhachDua;
    private javax.swing.JTextField jTextFieldTienThua;
    private javax.swing.JTextField jTextFieldTongTien;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTk;
    // End of variables declaration//GEN-END:variables
}
