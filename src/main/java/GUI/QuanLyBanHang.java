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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyBanHang extends javax.swing.JPanel {

    private List<HoaDon> danhSachHoaDonCho;
    private ChiTietSanPham ctsp = new ChiTietSanPham ();
    private DefaultTableModel dtm = new DefaultTableModel ();
    private BanHangDao ctspsi = new BanHangDao ();
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel ();
    private List<ChiTietSanPham> list = new ArrayList<> ();
    private DefaultTableModel dtmGioHang;
    private BanHangDao banHangDao;
    private String tenNhanVien;
    private String tenKhachHang;
    private KhachHangDAO khs = new KhachHangDAO ();
    private List<KhachHang> listDg = new ArrayList<> ();
    String idHoaDonCT;
    String idHoaDon;
    String maHoaDon;
    String idKhachHang;
    String idNhanVien;

    public QuanLyBanHang () {
        initComponents ();
        setVisible ( true );
        LoadCbbLocKD ( ctspsi.getListKieuDang1 () );
        LoadCbbLocS ( ctspsi.getListSize1 () );
        list = ctspsi.getAll ();
        showData ( list );
        banHangDao = new BanHangDao ();
        dtmGioHang = ( DefaultTableModel ) tblGioHang.getModel ();
        loadTenKhachHangToComboBox ();
        tblSanPham.setEnabled ( false );
        jButtonTaoHoaDon.setEnabled ( true );
        jTextFieldTenNhanVien.setEditable ( false );
        jTextFieldTongTien.setEditable ( false );
    }

    @SuppressWarnings ( "unchecked" )
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
        jTextFieldTongTien = new javax.swing.JTextField();
        jLabelTongTien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxHinhThucThanhToan = new javax.swing.JComboBox<>();
        jButtonThanhToan = new javax.swing.JButton();
        jButtonHuyThanhToan = new javax.swing.JButton();
        jTextFieldTenNhanVien = new javax.swing.JTextField();
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
                "Tên sản phẩm", "Size", "Màu Sắc", "Độ cao đế", "Kiểu dáng", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane2.setViewportView(tblGioHang);
        if (tblGioHang.getColumnModel().getColumnCount() > 0) {
            tblGioHang.getColumnModel().getColumn(2).setResizable(false);
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
                "Mã Sản Phẩm", "Tên sản phẩm", "Size", "Màu Sắc", "Độ Cao Đế", "Kiểu Dáng", "Số Lượng Tồn", "Đơn Giá"
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

        jTextFieldTongTien.setEditable(false);
        jTextFieldTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTongTienActionPerformed(evt);
            }
        });

        jLabelTongTien.setText("Tổng Tiền");

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

        jLabelTenNhanVien.setText("Tên Nhân Viên");

        jLabelThongTinHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelThongTinHoaDon.setText("Thông Tin Hóa Đơn");

        jLabel2.setText("Giảm giá");

        jComboBoxGiamGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%" }));
        jComboBoxGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGiamGiaActionPerformed(evt);
            }
        });

        jButtonXoaSPGioHang.setText("Làm mới giỏ hàng");
        jButtonXoaSPGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaSPGioHangActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelGioHang)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabelTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonHuyThanhToan)))
                                .addContainerGap(207, Short.MAX_VALUE))
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
                                                    .addComponent(jTextFieldTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelTenKhachHang)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBoxTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonThemMoiKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonTaoHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(jComboBoxHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
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
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTongTien)
                            .addComponent(jTextFieldTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonThanhToan)
                            .addComponent(jButtonHuyThanhToan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelGioHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonXoaSPGioHang))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showData ( List<ChiTietSanPham> list ) {
        DefaultTableModel dtm = new DefaultTableModel ();
        dtm = ( DefaultTableModel ) tblSanPham.getModel ();
        dtm.setRowCount ( 0 );
        for ( ChiTietSanPham ctsp : list ) {
            dtm.addRow ( new Object[] { ctsp.getMactsp () , ctsp.getIdsp () ,
                ctsp.getIdsize () , ctsp.getIdms () , ctsp.getIdde () , ctsp.getIdkieu () , ctsp.getSoluong () ,
                ctsp.getDongia () } );
        }
    }

    private void LoadCbbLocKD ( List<String> list ) {
        dcbm = ( DefaultComboBoxModel ) cbbKieu.getModel ();
        for ( String string : list ) {
            dcbm.addElement ( string );
        }
    }

    private void LoadCbbLocS ( List<String> list ) {
        dcbm = ( DefaultComboBoxModel ) cbbSize.getModel ();
        for ( String string : list ) {
            dcbm.addElement ( string );
        }
    }

    private void loadTenKhachHangToComboBox () {
        // Gọi phương thức từ KhachHangDAO để lấy danh sách tên khách hàng từ cơ sở dữ liệu
        KhachHangDAO khachHangDAO = new KhachHangDAO ();
        List<String> tenKhachHangList = khachHangDAO.getAllTenKhachHang ();

        // Xóa tất cả các mục khách hàng hiện có trong JComboBox để cập nhật danh sách mới
        jComboBoxTenKhachHang.removeAllItems ();

        // Thêm các tên khách hàng từ danh sách vào JComboBox
        for ( String tenKhachHang : tenKhachHangList ) {
            jComboBoxTenKhachHang.addItem ( tenKhachHang );
        }
    }

    private void jButtonTimTenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimTenSanPhamActionPerformed
        // TODO add your handling code here:
        String tk = txtTk.getText (); // Lấy dữ liệu từ trường văn bản
        // Kiểm tra xem trường văn bản có dữ liệu hay không
        if (  ! tk.isEmpty () ) { // Nếu có dữ liệu
            ctspsi.Tk ( tk );
            list = ctspsi.Tk ( tk );
            showData ( list );
        } else { // Nếu không có dữ liệu
            JOptionPane.showMessageDialog ( null , "Vui lòng nhập dữ liệu để tìm" ); // Hiển thị thông báo
        }
    }//GEN-LAST:event_jButtonTimTenSanPhamActionPerformed

    private void txtTkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTkMouseClicked
        // TODO add your handling code here:
        txtTk.setText ( "" );
        list = ctspsi.getAll ();
        showData ( list );
    }//GEN-LAST:event_txtTkMouseClicked

    private void cbbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSizeActionPerformed
        // TODO add your handling code here:
        String ten = cbbSize.getSelectedItem ().toString ();
        ctspsi.Loc1 ( ten );
        list = ctspsi.Loc1 ( ten );
        showData ( list );
    }//GEN-LAST:event_cbbSizeActionPerformed

    private void cbbKieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKieuActionPerformed
        // TODO add your handling code here:
        String ma = cbbKieu.getSelectedItem ().toString ();
        ctspsi.Loc1 ( ma );
        list = ctspsi.Loc1 ( ma );
        showData ( list );
    }//GEN-LAST:event_cbbKieuActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int rowIndex = tblSanPham.getSelectedRow ();
        if ( rowIndex != -1 ) {
            // Lấy dữ liệu từ hàng được chọn trong bảng sản phẩm
            String maSanPham = tblSanPham.getValueAt ( rowIndex , 0 ).toString ();
            String tenSanPham = tblSanPham.getValueAt ( rowIndex , 1 ).toString ();
            String size = tblSanPham.getValueAt ( rowIndex , 2 ).toString ();
            String mauSac = tblSanPham.getValueAt ( rowIndex , 3 ).toString ();
            String doCaoDe = tblSanPham.getValueAt ( rowIndex , 4 ).toString ();
            String kieuDang = tblSanPham.getValueAt ( rowIndex , 5 ).toString ();
            int soLuongTon = Integer.parseInt ( tblSanPham.getValueAt ( rowIndex , 6 ).toString () );
            double donGia = Double.parseDouble ( tblSanPham.getValueAt ( rowIndex , 7 ).toString () );

            // Yêu cầu người dùng nhập số lượng
            String quantityString = JOptionPane.showInputDialog ( null , "Nhập số lượng:" , "Nhập số lượng" , JOptionPane.PLAIN_MESSAGE );
            if ( quantityString != null &&  ! quantityString.isEmpty () ) {
                try {
                    int soLuongMua = Integer.parseInt ( quantityString );
                    if ( soLuongMua > 0 && soLuongMua <= soLuongTon ) {
                        // Tính toán thành tiền
                        double thanhTien = soLuongMua * donGia;

                        // Thêm dữ liệu vào bảng giỏ hàng
                        dtmGioHang = ( DefaultTableModel ) tblGioHang.getModel ();
                        Object[] rowData = { tenSanPham , size , mauSac , doCaoDe , kieuDang , soLuongMua , donGia , thanhTien };
                        dtmGioHang.addRow ( rowData );

                        // Cập nhật số lượng tồn trong bảng sản phẩm
                        tblSanPham.setValueAt ( soLuongTon - soLuongMua , rowIndex , 6 );

                        // Cập nhật bảng giỏ hàng
                        tinhTongTien ();
                    } else {
                        JOptionPane.showMessageDialog ( null , "Số lượng nhập vào phải lớn hơn 0 và không vượt quá số lượng tồn" , "Lỗi" , JOptionPane.ERROR_MESSAGE );
                    }
                } catch ( NumberFormatException ex ) {
                    JOptionPane.showMessageDialog ( null , "Vui lòng nhập số lượng hợp lệ" , "Lỗi" , JOptionPane.ERROR_MESSAGE );
                }
            }
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private String findIdctsp ( String tenSanPham , String size , String mauSac , String doCaoDe , String kieuDang ) throws Exception {
        String idctsp = null;
        try ( Connection connection = DatabaseHelper.getConnection () ) {
            String sql = "SELECT CHITIETSANPHAM.Id \n"
                    + "FROM CHITIETSANPHAM \n"
                    + "INNER JOIN SANPHAM ON CHITIETSANPHAM.Idsp = SANPHAM.Id \n"
                    + "INNER JOIN MAUSAC ON CHITIETSANPHAM.Idms = MAUSAC.Id \n"
                    + "INNER JOIN KIEUDANG ON CHITIETSANPHAM.Idkieu = KIEUDANG.Id \n"
                    + "INNER JOIN SIZE ON CHITIETSANPHAM.Idsize = SIZE.Id \n"
                    + "INNER JOIN DEGIAY ON CHITIETSANPHAM.Idde = DEGIAY.Id \n"
                    + "WHERE SANPHAM.Ten = ? \n"
                    + "    AND SIZE.Tensize = ? \n"
                    + "    AND MAUSAC.Tenmau = ? \n"
                    + "    AND DEGIAY.Docaode = ? \n"
                    + "    AND KIEUDANG.Tenkieu = ?;";
            try ( PreparedStatement preparedStatement = connection.prepareStatement ( sql ) ) {
                preparedStatement.setString ( 1 , tenSanPham );
                preparedStatement.setString ( 2 , size );
                preparedStatement.setString ( 3 , mauSac );
                preparedStatement.setString ( 4 , doCaoDe );
                preparedStatement.setString ( 5 , kieuDang );
                try ( ResultSet resultSet = preparedStatement.executeQuery () ) {
                    if ( resultSet.next () ) {
                        idctsp = resultSet.getString ( "Id" );
                    }
                }
            }
        } catch ( SQLException e ) {
            e.printStackTrace ();
        }
        return idctsp;
    }

    private boolean saveInvoiceDetail ( String id , String idHoaDon , String tenSanPham , String size , String mauSac , String doCaoDe ,
            String kieuDang , int soLuong , double tongTien ) throws SQLException , Exception {
        try ( Connection connection = DatabaseHelper.getConnection ();  PreparedStatement preparedStatement = connection.prepareStatement (
                "INSERT INTO HOADONCHITIET (Id, Idhd, Idctsp, SoLuong, TongTien, NgayTao, NgayChinhSua, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?)" ) ) {

            // Tìm idctsp từ các thông tin chi tiết sản phẩm
            String idSPCT = findIdctsp ( tenSanPham , size , mauSac , doCaoDe , kieuDang );
            if ( idSPCT == null ) {
                // Không tìm thấy idctsp
                System.err.println ( "Không tìm thấy idctsp cho các thông tin chi tiết sản phẩm." );
                return false;
            }

            // Ngày tạo và ngày chỉnh sửa
            java.util.Date ngayTao = new java.util.Date ();
            java.sql.Date ngayTaoSQL = new java.sql.Date ( ngayTao.getTime () );
            java.sql.Date ngayChinhSuaSQL = new java.sql.Date ( ngayTao.getTime () );

            preparedStatement.setString ( 1 , id );
            preparedStatement.setString ( 2 , idHoaDon );
            preparedStatement.setString ( 3 , idSPCT );
            preparedStatement.setInt ( 4 , soLuong );
            preparedStatement.setDouble ( 5 , tongTien );
            preparedStatement.setDate ( 6 , ngayTaoSQL );
            preparedStatement.setDate ( 7 , ngayChinhSuaSQL );
            preparedStatement.setInt ( 8 , 1 ); // Trạng thái mặc định, ví dụ: đã thanh toán

            int rowsAffected = preparedStatement.executeUpdate ();
            return rowsAffected > 0;

        } catch ( SQLException e ) {
            // In ra thông tin chi tiết của SQLException
            System.err.println ( "SQLException: " + e.getMessage () );
            System.err.println ( "SQLState: " + e.getSQLState () );
            System.err.println ( "VendorError: " + e.getErrorCode () );
            e.printStackTrace ();
            return false;
        } catch ( Exception e ) {
            // Xử lý ngoại lệ khác (nếu có)
            e.printStackTrace ();
            return false;
        }
    }

// Phương thức tạo mới hóa đơn
    private boolean createNewInvoice ( String idHoaDon , String idKhachHang , String idNhanVien , String maHoaDon , Date ngayTao , Date ngayChinhSua , int trangThai ) throws Exception {
        try ( Connection connection = DatabaseHelper.getConnection () ) {
            String sql = "INSERT INTO HOADON (Id,Idkh,Idnv, MaHd, NgayTao,NgayChinhSua, TrangThai) VALUES (?,?,?, ?, ?, ?, ?)";
            try ( PreparedStatement preparedStatement = connection.prepareStatement ( sql ) ) {
                preparedStatement.setString ( 1 , idHoaDon );
                preparedStatement.setString ( 2 , idKhachHang );
                preparedStatement.setString ( 3 , idNhanVien );
                preparedStatement.setString ( 4 , maHoaDon );
                preparedStatement.setDate ( 5 , new java.sql.Date ( ngayTao.getTime () ) );
                preparedStatement.setDate ( 6 , new java.sql.Date ( ngayChinhSua.getTime () ) );
                preparedStatement.setInt ( 7 , trangThai );
                int rowsAffected = preparedStatement.executeUpdate ();
                return rowsAffected > 0;
            }
        }
    }

    private void jButtonThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThanhToanActionPerformed
        // Tạo hóa đơn mới
        idHoaDon = UUID.randomUUID ().toString (); // Tạo id hóa đơn mới
        maHoaDon = "HD" + " " + idHoaDon; // Tạo mã hóa đơn mới
        idHoaDonCT = UUID.randomUUID ().toString (); // Tạo id hóa đơn mới
        try {
            // Lấy ID của khách hàng từ tên khách hàng trong combobox
            idKhachHang = getIdByTenKhachHang ( jComboBoxTenKhachHang.getSelectedItem ().toString () );
            // Lấy ID của nhân viên từ tên tài khoản đang đăng nhập
            idNhanVien = getIdByTenNhanVien ( Dashboard.taiKhoan.getTentaikhoan () );
        } catch ( Exception ex ) {
            Logger.getLogger ( QuanLyBanHang.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        Date ngayTao = new Date (); // Lấy ngày giờ hiện tại
        Date ngayChinhSua = new Date (); // Lấy ngày giờ hiện tại
        int trangThai = 1; // Mặc định trạng thái là đã thanh toán
        try {
            // Lưu thông tin hóa đơn mới vào cơ sở dữ liệu
            boolean successCreateInvoice = createNewInvoice ( idHoaDon , idKhachHang , idNhanVien , maHoaDon , ngayTao , ngayChinhSua , trangThai );
            if (  ! successCreateInvoice ) {
                JOptionPane.showMessageDialog ( this , "Không thể tạo hóa đơn mới." , "Lỗi" , JOptionPane.ERROR_MESSAGE );
                return;
            }

            // Lưu các thông tin chi tiết của hóa đơn vào cơ sở dữ liệu
            DefaultTableModel model = ( DefaultTableModel ) tblGioHang.getModel ();
            for ( int i = 0 ; i < model.getRowCount () ; i ++ ) {
                // Lấy thông tin chi tiết của sản phẩm từ bảng giỏ hàng
                String tenSanPham = ( String ) model.getValueAt ( i , 0 );
                String size = ( String ) model.getValueAt ( i , 1 );
                String mauSac = ( String ) model.getValueAt ( i , 2 );
                String doCaoDe = ( String ) model.getValueAt ( i , 3 );
                String kieuDang = ( String ) model.getValueAt ( i , 4 );
                int soLuong = ( int ) model.getValueAt ( i , 5 );
                double thanhTien = ( double ) model.getValueAt ( i , 7 );

                // Kiểm tra idHoaDon
                if ( idHoaDon != null ) {
                    // Lưu thông tin chi tiết sản phẩm vào cơ sở dữ liệu
                    boolean successSaveInvoiceDetail = saveInvoiceDetail ( idHoaDonCT , idHoaDon , tenSanPham , size , mauSac , doCaoDe , kieuDang , soLuong , thanhTien );
                    if (  ! successSaveInvoiceDetail ) {
                        JOptionPane.showMessageDialog ( this , "Không thể lưu thông tin hóa đơn chi tiết." , "Lỗi" , JOptionPane.ERROR_MESSAGE );
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog ( this , "Lỗi: idHoaDon không hợp lệ." , "Lỗi" , JOptionPane.ERROR_MESSAGE );
                    return;
                }
            }

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog ( this , "Thanh toán thành công. Hóa đơn mới đã được tạo." , "Thông báo" , JOptionPane.INFORMATION_MESSAGE );
            // Reset giao diện
            ClearForm ();

        } catch ( Exception ex ) {
            Logger.getLogger ( QuanLyBanHang.class.getName () ).log ( Level.SEVERE , null , ex );
            JOptionPane.showMessageDialog ( this , "Đã xảy ra lỗi khi thanh toán. Vui lòng thử lại." , "Lỗi" , JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jButtonThanhToanActionPerformed

    private void jButtonHuyThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyThanhToanActionPerformed
        ClearForm ();
    }//GEN-LAST:event_jButtonHuyThanhToanActionPerformed

    private void displayEmployeeNameFromDatabase () throws Exception {
        try {
            // Kết nối đến cơ sở dữ liệu
            Connection connection = DatabaseHelper.getConnection ();
            // Tạo câu truy vấn SQL để lấy tên nhân viên từ bảng NHANVIEN dựa trên tên tài khoản từ bảng TAIKHOAN
            String sql = "SELECT NV.Ten FROM NHANVIEN NV JOIN TAIKHOAN TK ON NV.MataiKhoan = TK.Mataikhoan WHERE TK.Tentaikhoan = ?";
            // Tạo PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement ( sql );
            // Đặt tham số cho câu truy vấn
            preparedStatement.setString ( 1 , Dashboard.taiKhoan.getTentaikhoan () );
            // Thực thi câu truy vấn
            ResultSet resultSet = preparedStatement.executeQuery ();
            // Kiểm tra xem có kết quả trả về không
            if ( resultSet.next () ) {
                // Lấy tên nhân viên từ kết quả trả về và hiển thị trong JTextFieldTenNhanVien
                String tenNhanVien = resultSet.getString ( "Ten" );
                jTextFieldTenNhanVien.setText ( tenNhanVien );
            }
            // Đóng kết nối
            connection.close ();
        } catch ( SQLException e ) {
            e.printStackTrace ();
            throw new Exception ( "Lỗi khi lấy tên nhân viên từ cơ sở dữ liệu." );
        }
    }

    private void jButtonTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaoHoaDonActionPerformed
        try {
            // Hiển thị tên nhân viên từ cơ sở dữ liệu
            displayEmployeeNameFromDatabase ();
            tblSanPham.setEnabled ( true );
            // Lấy tên nhân viên từ cơ sở dữ liệu và hiển thị trên JTextFieldTenNhanVien
            String tenNhanVien = jTextFieldTenNhanVien.getText ();
        } catch ( Exception ex ) {
            Logger.getLogger ( QuanLyBanHang.class.getName () ).log ( Level.SEVERE , null , ex );
        }

    }//GEN-LAST:event_jButtonTaoHoaDonActionPerformed

    private void jButtonThemMoiKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemMoiKhachHangActionPerformed
        JOptionPane.showMessageDialog ( this , "Thêm Khách Hàng tại menu item trên thanh menu." , "Thông Báo" , JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jButtonThemMoiKhachHangActionPerformed

    private void jTextFieldTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTongTienActionPerformed

    private void jButtonXoaSPGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaSPGioHangActionPerformed
        // Lấy chỉ số của hàng được chọn trong bảng giỏ hàng
        int selectedRow = tblGioHang.getSelectedRow ();

        // Kiểm tra xem có hàng được chọn không
        if ( selectedRow != -1 ) {
            // Lấy mô hình của bảng giỏ hàng
            DefaultTableModel gioHangModel = ( DefaultTableModel ) tblGioHang.getModel ();

            // Lấy thông tin sản phẩm cần xóa từ hàng được chọn
            String maSanPham = gioHangModel.getValueAt ( selectedRow , 0 ).toString ();
            int soLuongMua = Integer.parseInt ( gioHangModel.getValueAt ( selectedRow , 5 ).toString () );

            // Cập nhật số lượng tồn trên bảng sản phẩm
            for ( int i = 0 ; i < tblSanPham.getRowCount () ; i ++ ) {
                if ( tblSanPham.getValueAt ( i , 0 ).toString ().equals ( maSanPham ) ) {
                    // Lấy số lượng tồn hiện tại từ bảng sản phẩm
                    int soLuongTon = Integer.parseInt ( tblSanPham.getValueAt ( i , 6 ).toString () );
                    // Cập nhật số lượng tồn mới
                    tblSanPham.setValueAt ( soLuongTon + soLuongMua , i , 6 );
                    break; // Kết thúc vòng lặp sau khi cập nhật
                }
            }

            // Loại bỏ hàng được chọn từ bảng giỏ hàng
            gioHangModel.removeRow ( selectedRow );

            // Cập nhật tổng tiền sau khi loại bỏ hàng
            tinhTongTien ();

        } else {
            // Hiển thị thông báo yêu cầu chọn sản phẩm để xóa nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog ( null , "Vui lòng chọn sản phẩm để xóa" , "Thông báo" , JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_jButtonXoaSPGioHangActionPerformed

    private void jComboBoxGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGiamGiaActionPerformed
        tinhTongTienSauGiamGia ();
    }//GEN-LAST:event_jComboBoxGiamGiaActionPerformed

    private double tinhTongTien () {
        double tongTien = 0.0;
        for ( int i = 0 ; i < tblGioHang.getRowCount () ; i ++ ) {
            double giaTriCotCuoi = Double.parseDouble ( tblGioHang.getValueAt ( i , tblGioHang.getColumnCount () - 1 ).toString () );
            tongTien += giaTriCotCuoi;
        }
        String tongTienString = String.valueOf ( tongTien );
        // hoặc: String tongTienString = Double.toString(tongTien);

        // Set text cho jTextFieldTongTien
        jTextFieldTongTien.setText ( tongTienString );
        return tongTien;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGioHang;
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
    private javax.swing.JTextField jTextFieldTenNhanVien;
    private javax.swing.JTextField jTextFieldTongTien;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTk;
    // End of variables declaration//GEN-END:variables

    private void ClearForm () {
        // Xóa tất cả các hàng khỏi bảng tblGioHang
        DefaultTableModel model = ( DefaultTableModel ) tblGioHang.getModel ();
        model.setRowCount ( 0 );

        // Đặt lại các trường văn bản về giá trị mặc định hoặc rỗng
        jTextFieldTenNhanVien.setText ( "" );
        jTextFieldTongTien.setText ( "" );
    }

    private void tinhTongTienSauGiamGia () {
        try {
            // Tính tổng tiền
            double tongTien = tinhTongTien ();

            // Lấy giá trị giảm giá từ jComboBoxGiamGia
            String giamGiaStr = jComboBoxGiamGia.getSelectedItem ().toString ().replace ( "%" , "" );
            double giamGia = Double.parseDouble ( giamGiaStr );

            // Kiểm tra giảm giá hợp lệ (không âm và không lớn hơn tổng tiền)
            if ( giamGia < 0 || giamGia > 100 ) {
                throw new IllegalArgumentException ( "Giảm giá không hợp lệ." );
            }

            // Tính tổng tiền sau khi giảm giá
            double tongTienSauGiamGia = tongTien * ( 100 - giamGia ) / 100.0;

            // Hiển thị tổng tiền
            jTextFieldTongTien.setText ( String.valueOf ( tongTienSauGiamGia ) );
        } catch ( NumberFormatException ex ) {
            // Xử lý ngoại lệ khi nhập liệu không hợp lệ
            JOptionPane.showMessageDialog ( this , "Vui lòng nhập số hợp lệ." , "Lỗi" , JOptionPane.ERROR_MESSAGE );
        } catch ( IllegalArgumentException ex ) {
            // Xử lý ngoại lệ khi dữ liệu không hợp lệ
            JOptionPane.showMessageDialog ( this , ex.getMessage () , "Lỗi" , JOptionPane.ERROR_MESSAGE );
        }
    }

    private String getIdByTenKhachHang ( String tenKhachHang ) throws Exception {
        idKhachHang = null;
        try ( Connection connection = DatabaseHelper.getConnection () ) {
            String sql = "SELECT Id FROM KhachHang WHERE Ten = ?";
            try ( PreparedStatement preparedStatement = connection.prepareStatement ( sql ) ) {
                preparedStatement.setString ( 1 , tenKhachHang );
                try ( ResultSet resultSet = preparedStatement.executeQuery () ) {
                    if ( resultSet.next () ) {
                        idKhachHang = resultSet.getString ( "Id" );
                    }
                }
            }
        } catch ( SQLException e ) {
            e.printStackTrace ();
        }
        return idKhachHang;
    }

    private String getIdByTenNhanVien ( String tentaikhoan ) throws Exception {
        idNhanVien = null;
        try ( Connection connection = DatabaseHelper.getConnection () ) {
            String sql = "SELECT NV.Id FROM NHANVIEN NV JOIN TAIKHOAN TK ON NV.MataiKhoan = TK.Mataikhoan WHERE TK.Tentaikhoan = ?";
            try ( PreparedStatement preparedStatement = connection.prepareStatement ( sql ) ) {
                preparedStatement.setString ( 1 , tentaikhoan );
                try ( ResultSet resultSet = preparedStatement.executeQuery () ) {
                    if ( resultSet.next () ) {
                        idNhanVien = resultSet.getString ( "Id" );
                    }
                }
            }
        } catch ( SQLException e ) {
            e.printStackTrace ();
        }
        return idNhanVien;
    }

    // Cập nhật số lượng tồn sau khi xóa sản phẩm từ giỏ hàng
    private void capNhatSoLuongTon ( String maSanPham , int soLuongMua ) {
        for ( int i = 0 ; i < tblSanPham.getRowCount () ; i ++ ) {
            if ( tblSanPham.getValueAt ( i , 0 ).toString ().equals ( maSanPham ) ) {
                // Lấy số lượng tồn hiện tại từ bảng sản phẩm
                int soLuongTonHienTai = Integer.parseInt ( tblSanPham.getValueAt ( i , 6 ).toString () );
                // Cập nhật số lượng tồn mới
                tblSanPham.setValueAt ( soLuongTonHienTai + soLuongMua , i , 6 );
                break; // Kết thúc vòng lặp sau khi cập nhật
            }
        }
    }

}
