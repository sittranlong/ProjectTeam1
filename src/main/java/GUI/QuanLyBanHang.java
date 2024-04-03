package GUI;

import DAO.BanHangDao;
import DAO.KhachHangDAO;
import DATABASE.DatabaseHelper;
import ENTITY.ChiTietSanPham;
import ENTITY.HoaDon;
import ENTITY.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private DefaultTableModel dtmSanPham;
    private DefaultTableModel dtmGioHang;
    private BanHangDao banHangDao;
    private String tenNhanVien;
    private String tenKhachHang;
    private KhachHangDAO khs = new KhachHangDAO();
    private List<KhachHang> listDg = new ArrayList<>();
    String idHoaDonCT;

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
        tblSanPham.setEnabled(false);
        banHangDao = new BanHangDao();
        dtmSanPham = (DefaultTableModel) tblSanPham.getModel();
        dtmGioHang = (DefaultTableModel) tblGioHang.getModel();
        loadSanPham();
        loadTenKhachHangToComboBox();
        tblSanPham.setEnabled(false);
        jButtonTaoHoaDon.setEnabled(true);
        jTextFieldTenNhanVien.setEditable(false);
        jTextFieldMaHoaDon.setEditable(false);
        jTextFieldTongTien.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQUANLYBANHANG = new javax.swing.JLabel();
        jLabelGioHang = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jLabelSanPham = new javax.swing.JLabel();
        jLabelTenKhachHang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonThemMoiKhachHang = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();
        jComboBoxGiamGia = new javax.swing.JComboBox<>();
        jComboBoxTenKhachHang = new javax.swing.JComboBox<>();
        jButtonXoaSPGioHang = new javax.swing.JButton();

        jLabelQUANLYBANHANG.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelQUANLYBANHANG.setText("QUẢN LÝ BÁN HÀNG");

        jLabelGioHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelGioHang.setText("Giỏ Hàng");

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sản phẩm", "Size", "Màu Sắc", "Độ cao đế", "Kiểu dáng", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGioHang);
        if (tblGioHang.getColumnModel().getColumnCount() > 0) {
            tblGioHang.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabelSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSanPham.setText("Sản Phẩm");

        jLabelTenKhachHang.setText("Tên Khách Hàng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Khách Hàng");

        jButtonThemMoiKhachHang.setText("Thêm Mới Khách Hàng");
        jButtonThemMoiKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemMoiKhachHangActionPerformed(evt);
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

            },
            new String [] {
                "Mã Sản Phẩm", "Tên sản phẩm", "Size", "Màu Sắc", "Độ Cao Đế", "Kiểu Dáng", "Số Lượng", "Đơn Giá"
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

        jTextFieldTongTien.setEditable(false);
        jTextFieldTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTongTienActionPerformed(evt);
            }
        });

        jLabelTongTien.setText("Tổng Tiền");

        jTextFieldTienKhachDua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTienKhachDuaFocusLost(evt);
            }
        });

        jLabel6.setText("Tiền Khách Đưa");

        jLabel7.setText("Tiền Thừa");

        jLabel8.setText("Hình Thức TT");

        jComboBoxHinhThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "Chuyển Khoản" }));

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

        jTextFieldTenNhanVien.setEditable(false);

        jTextFieldMaHoaDon.setEditable(false);

        jLabelTenNhanVien.setText("Tên Nhân Viên");

        jLabelThongTinHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelThongTinHoaDon.setText("Thông Tin Hóa Đơn");

        jLabel2.setText("Giảm giá");

        jComboBoxGiamGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%" }));

        jButtonXoaSPGioHang.setText("Xóa Sản Phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSanPham)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTenSanPham)
                        .addGap(18, 18, 18)
                        .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTimTenSanPham)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSanPham2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQUANLYBANHANG)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabelSanPham1)
                                .addGap(18, 18, 18)
                                .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonXoaSPGioHang)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelGioHang)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabelTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(282, 282, 282))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelThongTinHoaDon)
                                                            .addComponent(jLabel1))
                                                        .addGap(112, 112, 112)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBoxGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelTenKhachHang)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBoxTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonThemMoiKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonTaoHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(24, 24, 24)
                                            .addComponent(jTextFieldTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonHuyThanhToan))))
                                .addGap(0, 90, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelQUANLYBANHANG)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSanPham1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSanPham2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSanPham)
                        .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTenSanPham)
                        .addComponent(jButtonTimTenSanPham)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTenKhachHang)
                                    .addComponent(jButtonThemMoiKhachHang)
                                    .addComponent(jComboBoxTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonTaoHoaDon))
                            .addComponent(jLabelThongTinHoaDon, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTenNhanVien)
                            .addComponent(jTextFieldTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMaHoaDon)
                            .addComponent(jTextFieldMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTongTien)
                            .addComponent(jTextFieldTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonThanhToan)
                            .addComponent(jButtonHuyThanhToan)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelGioHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonXoaSPGioHang)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showData(List<ChiTietSanPham> list) {
        dtm.setRowCount(0);
        for (ChiTietSanPham ctsp : list) {
            dtm.addRow(new Object[]{ctsp.getMactsp(), ctsp.getIdsp(), ctsp.getIdsize(), ctsp.getIdkieu(), ctsp.getDongia(), ctsp.getSoluong(), khs.getAllTenKhachHang()});
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

    private void loadTenKhachHangToComboBox() {
        // Gọi phương thức từ KhachHangDAO để lấy danh sách tên khách hàng từ cơ sở dữ liệu
        KhachHangDAO khachHangDAO = new KhachHangDAO();
        List<String> tenKhachHangList = khachHangDAO.getAllTenKhachHang();

        // Xóa tất cả các mục khách hàng hiện có trong JComboBox để cập nhật danh sách mới
        jComboBoxTenKhachHang.removeAllItems();

        // Thêm các tên khách hàng từ danh sách vào JComboBox
        for (String tenKhachHang : tenKhachHangList) {
            jComboBoxTenKhachHang.addItem(tenKhachHang);
        }
    }

// Gọi phương thức này từ bất kỳ nơi nào bạn

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
        int[] columnsOfInterest = {0, 1, 2, 3, 4, 5, 6, 7}; // Ví dụ: lấy cột 0, 1, 5 và 4

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
                    if (quantity <= currentQuantity && quantity <= 30) { // Kiểm tra số lượng nhập vào không vượt quá 30
                        // Tạo DefaultTableModel cho jTableGioHang nếu chưa có
                        DefaultTableModel model2 = (DefaultTableModel) tblGioHang.getModel();
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
                        tinhTongTien();
                    } else {
                        JOptionPane.showMessageDialog(null, "Số lượng nhập vào phải nhỏ hơn hoặc bằng 30 và không vượt quá số lượng hiện có của sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }


    private void jButtonThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThanhToanActionPerformed
        try {
            // Lưu thông tin hóa đơn và hóa đơn chi tiết vào cơ sở dữ liệu
            // Cập nhật thông tin hóa đơn
            String sqlHoaDon = "UPDATE HOADON SET Ngaytao = ?, NgayChinhSua = ?, TrangThai = ? WHERE Mahd = ?";
            // Thực hiện câu lệnh SQL để cập nhật thông tin hóa đơn
            // Lưu thông tin hóa đơn
            Connection connection = DatabaseHelper.getConnection();
            PreparedStatement preparedStatementHoaDon = connection.prepareStatement(sqlHoaDon);
            preparedStatementHoaDon.setDate(1, new java.sql.Date(new Date().getTime())); // Ngày tạo hóa đơn
            preparedStatementHoaDon.setDate(2, new java.sql.Date(new Date().getTime())); // Ngày chỉnh sửa hóa đơn
            preparedStatementHoaDon.setString(3, "Đã thanh toán"); // Trạng thái hóa đơn
            preparedStatementHoaDon.setString(4, jTextFieldMaHoaDon.getText()); // Mã hóa đơn

            // Thực hiện cập nhật thông tin hóa đơn
            int rowsAffectedHoaDon = preparedStatementHoaDon.executeUpdate();

            // Lưu thông tin hóa đơn chi tiết
            String sqlHoaDonChiTiet = "UPDATE HOADONCHITIET\n"
                    + "SET Soluong = ?,\n"
                    + "    Tongtien = ?,\n"
                    + "    NgayChinhSua = GETDATE(),\n"
                    + "    TrangThai = ?\n"
                    + "WHERE Id = ?;";
            PreparedStatement preparedStatementHoaDonChiTiet = connection.prepareStatement(sqlHoaDonChiTiet);

            // Lưu từng dòng trong jTableGioHang vào cơ sở dữ liệu
            for (int i = 0; i < tblGioHang.getRowCount(); i++) {
                String tenSanPham = tblGioHang.getValueAt(i, 1).toString();
                int soLuong = Integer.parseInt(tblGioHang.getValueAt(i, 6).toString());
                double donGia = Double.parseDouble(tblGioHang.getValueAt(i, 7).toString());
                preparedStatementHoaDonChiTiet.setInt(1, soLuong);
                preparedStatementHoaDonChiTiet.setDouble(2, soLuong * donGia);
                preparedStatementHoaDonChiTiet.setDate(3, new java.sql.Date(new Date().getTime()));
                preparedStatementHoaDonChiTiet.setInt(4, 1);
                preparedStatementHoaDonChiTiet.setString(5, idHoaDonCT);
                preparedStatementHoaDonChiTiet.executeUpdate();
            }

            // Đóng kết nối và hiển thị thông báo cho người dùng
            connection.close();
            JOptionPane.showMessageDialog(this, "Hóa đơn đã được lưu vào cơ sở dữ liệu.");
            // Làm sạch giao diện
            jTextFieldTenNhanVien.setText("");
            jTextFieldMaHoaDon.setText("");
            jTextFieldTongTien.setText("");
            dtmGioHang.setRowCount(0);
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu hóa đơn vào cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(QuanLyBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonThanhToanActionPerformed

    private void jButtonHuyThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyThanhToanActionPerformed
        try {
            // Xóa thông tin hóa đơn, hóa đơn chi tiết tương ứng với hóa đơn
            Connection connection = null;
            PreparedStatement preparedStatementHoaDon = null;
            PreparedStatement preparedStatementHoaDonChiTiet = null;

            try {
                connection = DatabaseHelper.getConnection();
                // Tắt chế độ tự động commit để có thể rollback nếu cần thiết
                connection.setAutoCommit(false);

                // Xóa thông tin hóa đơn chi tiết
                String sqlHoaDonChiTiet = "DELETE FROM HOADONCHITIET WHERE Idhd = ?";
                preparedStatementHoaDonChiTiet = connection.prepareStatement(sqlHoaDonChiTiet);
                preparedStatementHoaDonChiTiet.setString(1, jTextFieldMaHoaDon.getText());
                preparedStatementHoaDonChiTiet.executeUpdate();

                // Xóa thông tin hóa đơn
                String sqlHoaDon = "DELETE FROM HOADON WHERE Mahd = ?";
                preparedStatementHoaDon = connection.prepareStatement(sqlHoaDon);
                preparedStatementHoaDon.setString(1, jTextFieldMaHoaDon.getText());
                preparedStatementHoaDon.executeUpdate();

                // Commit các thay đổi nếu không có vấn đề nào xảy ra
                connection.commit();
                JOptionPane.showMessageDialog(this, "Hóa đơn đã được xóa khỏi cơ sở dữ liệu.");
                // Làm sạch giao diện
                jTextFieldTenNhanVien.setText("");
                jTextFieldMaHoaDon.setText("");
                jTextFieldTongTien.setText("");
                dtmGioHang.setRowCount(0);
            } catch (SQLException ex) {
                // Nếu có lỗi xảy ra, rollback lại các thay đổi đã thực hiện
                if (connection != null) {
                    connection.rollback();
                }
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa hóa đơn từ cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Đóng tất cả các tài nguyên
                if (preparedStatementHoaDonChiTiet != null) {
                    preparedStatementHoaDonChiTiet.close();
                }
                if (preparedStatementHoaDon != null) {
                    preparedStatementHoaDon.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(QuanLyBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonHuyThanhToanActionPerformed

    private void displayEmployeeNameFromDatabase() throws Exception {
        try {
            // Kết nối đến cơ sở dữ liệu
            Connection connection = DatabaseHelper.getConnection();
            // Tạo câu truy vấn SQL để lấy tên nhân viên từ bảng NHANVIEN dựa trên tên tài khoản từ bảng TAIKHOAN
            String sql = "SELECT NV.Ten FROM NHANVIEN NV JOIN TAIKHOAN TK ON NV.MataiKhoan = TK.Mataikhoan WHERE TK.Tentaikhoan = ?";
            // Tạo PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Đặt tham số cho câu truy vấn
            preparedStatement.setString(1, Dashboard.taiKhoan.getTentaikhoan());
            // Thực thi câu truy vấn
            ResultSet resultSet = preparedStatement.executeQuery();
            // Kiểm tra xem có kết quả trả về không
            if (resultSet.next()) {
                // Lấy tên nhân viên từ kết quả trả về và hiển thị trong JTextFieldTenNhanVien
                String tenNhanVien = resultSet.getString("Ten");
                jTextFieldTenNhanVien.setText(tenNhanVien);
            }
            // Đóng kết nối
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Lỗi khi lấy tên nhân viên từ cơ sở dữ liệu.");
        }
    }

    // Quản lý kết nối và tài nguyên một cách an toàn
    private boolean createNewInvoice(String idHoaDon, String maHoaDon, Date ngayTao, Integer trangThai) throws Exception {
        try ( Connection connection = DatabaseHelper.getConnection()) {
            String sql = "INSERT INTO HOADON (Id, Mahd, Ngaytao, TrangThai) VALUES (?, ?, ?, ?)";
            try ( PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, idHoaDon);
                preparedStatement.setString(2, maHoaDon);
                preparedStatement.setDate(3, new java.sql.Date(ngayTao.getTime()));
                preparedStatement.setInt(4, trangThai);
                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean createNewInvoiceDetail(String idHoaDonChiTiet, String idHoaDon, Date ngayTao, Integer trangThai) throws Exception {
        try ( Connection connection = DatabaseHelper.getConnection()) {
            String sql = "INSERT INTO HOADONCHITIET (Id, Idhd, Ngaytao, TrangThai) VALUES (?, ?, ?, ?)";
            try ( PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, idHoaDon);
                preparedStatement.setString(2, idHoaDon);
                preparedStatement.setDate(3, new java.sql.Date(ngayTao.getTime()));
                preparedStatement.setInt(4, trangThai);
                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    private void jButtonTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaoHoaDonActionPerformed
        try {
            // Hiển thị tên nhân viên từ cơ sở dữ liệu
            displayEmployeeNameFromDatabase();
            tblSanPham.setEnabled(true);

            // Lấy tên nhân viên từ cơ sở dữ liệu và hiển thị trên JTextFieldTenNhanVien
            String tenNhanVien = jTextFieldTenNhanVien.getText();

            // Tạo hóa đơn mới và lưu vào cơ sở dữ liệu
            String idHoaDon = UUID.randomUUID().toString();
            String maHoaDon = "HD" + UUID.randomUUID().toString();
            Date ngayTao = new Date();
            Integer trangThai = 1;
            // Tạo hóa đơn CT mới và lưu vào cơ sở dữ liệu
            idHoaDonCT = UUID.randomUUID().toString();
            String idMaHoaDon = idHoaDon;
            Date ngayTaoCT = ngayTao;
            Integer trangThaiCT = 0;

            boolean success1 = createNewInvoice(idHoaDon, maHoaDon, ngayTao, trangThai);
            boolean success2 = createNewInvoiceDetail(idHoaDonCT, idMaHoaDon, ngayTaoCT, trangThaiCT);

            if (success1 && success2) {
                JOptionPane.showMessageDialog(this, "Hóa đơn mới đã được tạo thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                jTextFieldMaHoaDon.setText(maHoaDon);
                jTextFieldTenNhanVien.setText(tenNhanVien);
            } else {
                JOptionPane.showMessageDialog(this, "Không thể tạo hóa đơn mới.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(QuanLyBanHang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi tạo hóa đơn mới.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTaoHoaDonActionPerformed

    private void jButtonThemMoiKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemMoiKhachHangActionPerformed
        JOptionPane.showMessageDialog(this, "Thêm Khách Hàng tại menu item trên thanh menu.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonThemMoiKhachHangActionPerformed

    private void jTextFieldTienKhachDuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTienKhachDuaFocusLost
        capNhatDuLieu();
    }//GEN-LAST:event_jTextFieldTienKhachDuaFocusLost

    private void jTextFieldTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTongTienActionPerformed
    private void loadSanPham() {
        List<ChiTietSanPham> listSanPham = banHangDao.getAll();
        dtmSanPham.setRowCount(0);
        for (ChiTietSanPham ctsp : listSanPham) {
            dtmSanPham.addRow(new Object[]{ctsp.getMactsp(), ctsp.getIdsp(), ctsp.getIdsize(), ctsp.getIdkieu(), ctsp.getDongia(), ctsp.getSoluong()});
        }
    }

    private double tinhTongTien() {
        double tongTien = 0.0;
        for (int i = 0; i < tblGioHang.getRowCount(); i++) {
            double giaTriCotCuoi = Double.parseDouble(tblGioHang.getValueAt(i, tblGioHang.getColumnCount() - 1).toString());
            tongTien += giaTriCotCuoi;
        }
        String tongTienString = String.valueOf(tongTien);
        // hoặc: String tongTienString = Double.toString(tongTien);

        // Set text cho jTextFieldTongTien
        jTextFieldTongTien.setText(tongTienString);
        return tongTien;
    }

    private void capNhatDuLieu() {
        // Tính tổng tiền
        double tongTien = tinhTongTien();

        // Lấy giá trị giảm giá từ jComboBoxGiamGia
        double giamGia = Integer.parseInt(jComboBoxGiamGia.getSelectedItem().toString());

        // Tính tổng tiền sau khi giảm giá
        double tongTienSauGiamGia = tongTien * (100 - giamGia) / 100.0;

        // Hiển thị tổng tiền
        jTextFieldTongTien.setText(String.valueOf(tongTienSauGiamGia));

        // Lấy giá trị tiền khách đưa từ jTextFieldTienKhachDua
        int tienKhachDua = Integer.parseInt(jTextFieldTienKhachDua.getText());

        // Tính tiền thừa
        double tienThua = tienKhachDua - tongTienSauGiamGia;

        // Hiển thị tiền thừa
        jTextFieldTienThua.setText(String.valueOf(tienThua));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbKieu;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JButton jButtonHuyThanhToan;
    private javax.swing.JButton jButtonTaoHoaDon;
    private javax.swing.JButton jButtonThanhToan;
    private javax.swing.JButton jButtonThemMoiKhachHang;
    private javax.swing.JButton jButtonTimTenSanPham;
    private javax.swing.JButton jButtonXoaSPGioHang;
    private javax.swing.JComboBox<String> jComboBoxGiamGia;
    private javax.swing.JComboBox<String> jComboBoxHinhThucThanhToan;
    private javax.swing.JComboBox<String> jComboBoxTenKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGioHang;
    private javax.swing.JLabel jLabelMaHoaDon;
    private javax.swing.JLabel jLabelQUANLYBANHANG;
    private javax.swing.JLabel jLabelSanPham;
    private javax.swing.JLabel jLabelSanPham1;
    private javax.swing.JLabel jLabelSanPham2;
    private javax.swing.JLabel jLabelTenKhachHang;
    private javax.swing.JLabel jLabelTenNhanVien;
    private javax.swing.JLabel jLabelTenSanPham;
    private javax.swing.JLabel jLabelThongTinHoaDon;
    private javax.swing.JLabel jLabelTongTien;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldMaHoaDon;
    private javax.swing.JTextField jTextFieldTenNhanVien;
    private javax.swing.JTextField jTextFieldTienKhachDua;
    private javax.swing.JTextField jTextFieldTienThua;
    private javax.swing.JTextField jTextFieldTongTien;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTk;
    // End of variables declaration//GEN-END:variables

}
