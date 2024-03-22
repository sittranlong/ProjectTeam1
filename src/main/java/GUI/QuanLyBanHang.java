/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author TieuLong
 */
public class QuanLyBanHang extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyBanHang
     */
    public QuanLyBanHang() {
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

        jLabelQUANLYBANHANG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHoaDonCho = new javax.swing.JTable();
        jLabelHoaDonCho = new javax.swing.JLabel();
        jLabelGioHang = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGioHang = new javax.swing.JTable();
        jLabelSanPham = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSanPham = new javax.swing.JTable();
        jLabelSDTKhachHang = new javax.swing.JLabel();
        jTextFieldSDTKhachHang = new javax.swing.JTextField();
        jLabelTenKhachHang = new javax.swing.JLabel();
        jTextFieldTenKhachHang = new javax.swing.JTextField();
        jButtonTimKiemKhachHang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonThemMoiKhachHang = new javax.swing.JButton();
        jButtonTreoHoaDon = new javax.swing.JButton();
        jComboBoxLocKieuDang = new javax.swing.JComboBox<>();
        jComboBoxLocSize = new javax.swing.JComboBox<>();
        jComboBoxLocDeGiay = new javax.swing.JComboBox<>();
        jComboBoxLocGiaSanPham = new javax.swing.JComboBox<>();
        jLabelTenSanPham = new javax.swing.JLabel();
        jTextFieldTimTenSanPham = new javax.swing.JTextField();
        jButtonTimTenSanPham = new javax.swing.JButton();

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
                "Mã đơn hàng", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane2.setViewportView(jTableGioHang);

        jLabelSanPham.setText("Sản Phẩm");

        jTableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Màu Sắc", "Kiểu Dáng", "Size", "Đế Giày", "Số lượng tồn kho", "Giá sản phẩm"
            }
        ));
        jScrollPane3.setViewportView(jTableSanPham);

        jLabelSDTKhachHang.setText("SDT Khách Hàng");

        jLabelTenKhachHang.setText("Tên Khách Hàng");

        jButtonTimKiemKhachHang.setText("Tìm Kiếm");

        jLabel1.setText("Khách Hàng");

        jButtonThemMoiKhachHang.setText("Thêm Mới");

        jButtonTreoHoaDon.setText("Treo Hóa Đơn");

        jComboBoxLocKieuDang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxLocSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxLocDeGiay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxLocGiaSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTenSanPham.setText("Tìm Tên Sản Phẩm");

        jButtonTimTenSanPham.setText("Tìm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelSanPham)
                            .addGap(29, 29, 29)
                            .addComponent(jLabelTenSanPham)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldTimTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonTimTenSanPham)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLocKieuDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jComboBoxLocSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jComboBoxLocDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jComboBoxLocGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonTreoHoaDon))))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelSanPham)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxLocKieuDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLocSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLocDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLocGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTenSanPham)
                            .addComponent(jTextFieldTimTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTimTenSanPham))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonThemMoiKhachHang;
    private javax.swing.JButton jButtonTimKiemKhachHang;
    private javax.swing.JButton jButtonTimTenSanPham;
    private javax.swing.JButton jButtonTreoHoaDon;
    private javax.swing.JComboBox<String> jComboBoxLocDeGiay;
    private javax.swing.JComboBox<String> jComboBoxLocGiaSanPham;
    private javax.swing.JComboBox<String> jComboBoxLocKieuDang;
    private javax.swing.JComboBox<String> jComboBoxLocSize;
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
    private javax.swing.JTable jTableSanPham;
    private javax.swing.JTextField jTextFieldSDTKhachHang;
    private javax.swing.JTextField jTextFieldTenKhachHang;
    private javax.swing.JTextField jTextFieldTimTenSanPham;
    // End of variables declaration//GEN-END:variables
}
