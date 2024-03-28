/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;


import DAO.ChiTietSanPhamDAO;
import ENTITY.ChiTietSanPham;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Phan Loc
 */
public class QuanLySanPham extends javax.swing.JPanel {

    private DefaultTableModel dtm = new DefaultTableModel();
    private ChiTietSanPhamDAO ctspsi = new ChiTietSanPhamDAO();
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    List<ChiTietSanPham> list = new ArrayList<>();
    private String strAnh = "C:\\";
    /**
     * Creates new form NewJPanel
     */
    public QuanLySanPham() {
        initComponents();
        
        dtm = (DefaultTableModel) tblSanPham.getModel();

        LoadCbbMS(ctspsi.getListMauSac());
        LoadCbbKD(ctspsi.getListKieuDang());
        LoadCbbS(ctspsi.getListSize());
        LoadCbbCC(ctspsi.getListChieuCao());
        LoadCbbLocTT(ctspsi.getListTrangThai());
        LoadCbbLocMS(ctspsi.getListMauSac());
        LoadCbbLocKD(ctspsi.getListKieuDang());
        LoadCbbSP(ctspsi.getListSanPham());
        list = ctspsi.getAll();
        showData(list);
    }

    
    private void showData(List<ChiTietSanPham> list) {
        dtm.setRowCount(0);
        for (ChiTietSanPham ctsp : list) {
            dtm.addRow(ctsp.toDataRow());
        }
    }

    public void reset(){
        txtMa.setText("");
        txtGia.setText("");
        txtMota.setText("");
        txtSoLuong.setText("");
        cbbChieuCao.setSelectedIndex(0);
        cbbKieu.setSelectedIndex(0);
        cbbMau.setSelectedIndex(0);
        cbbSize.setSelectedIndex(0);        
        cbbSanPham.setSelectedIndex(0);
        cbbSanPham.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        lblAnh.setText("HINH ANH");
        lblAnh.setIcon(null);
        list = ctspsi.getAll();
    }
    private void fillData(int index) {
        ChiTietSanPham ctsp = list.get(index);
        txtMa.setText(ctsp.getMactsp());
        txtGia.setText(ctsp.getDongia()+ "");
        txtSoLuong.setText(ctsp.getSoluong()+ "");
        txtMota.setText(ctsp.getMota());
        cbbChieuCao.setSelectedItem(ctsp.getIdde()+ "");
        cbbSanPham.setSelectedItem(ctsp.getIdsp());
        cbbKieu.setSelectedItem(ctsp.getIdkieu());
        cbbMau.setSelectedItem(ctsp.getIdms());        
        cbbSanPham.setSelectedItem(ctsp.getIdsp());
        cbbSize.setSelectedItem(ctsp.getIdsize()+ "");
        lblAnh.setIcon(resizeImage(String.valueOf(ctsp.getHinhanh())));
        int trangThai = ctsp.getTrangThai();
        if (trangThai == 0) {
            rdHet.setSelected(true);
        } else {
            rdCon.setSelected(true);
        }

    }

    public ImageIcon resizeImage(String imagePath) {
        ImageIcon myImage = new ImageIcon(imagePath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    private void LoadCbbMS(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbMau.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbKD(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbKieu.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbS(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbSize.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbCC(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbChieuCao.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbLocTT(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbTt.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbLocKD(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbKD.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }

    private void LoadCbbLocMS(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbMS.getModel();
        for (String string : list) {
            dcbm.addElement(string);
        }
    }
    
    private void LoadCbbSP(List<String> list) {
        dcbm = (DefaultComboBoxModel) cbbSanPham.getModel();
        for (String string : list) {
            dcbm.addElement(string);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btXuatExel = new javax.swing.JButton();
        btLamMoi = new javax.swing.JButton();
        btChonAnh = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        rdCon = new javax.swing.JRadioButton();
        rdHet = new javax.swing.JRadioButton();
        cbbSanPham = new javax.swing.JComboBox<>();
        cbbMau = new javax.swing.JComboBox<>();
        cbbKieu = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        cbbChieuCao = new javax.swing.JComboBox<>();
        lblAnh = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        btTK = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbbKD = new javax.swing.JComboBox<>();
        cbbMS = new javax.swing.JComboBox<>();
        cbbTt = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CHI TIẾT SẢN PHẨM");

        jLabel2.setText("Mã CTSP");

        jLabel3.setText("Giá");

        jLabel4.setText("Số Lượng");

        jLabel5.setText("Mô Tả");

        jLabel6.setText("Trạng Thái");

        jLabel7.setText("Ảnh Sản Phẩm");

        jLabel8.setText("�?ế Giày");

        jLabel9.setText("Size");

        jLabel10.setText("Kiểu Dáng");

        jLabel11.setText("Màu Sắc");

        jLabel12.setText("Tên Sản Phẩm");

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btXuatExel.setText("Xuất Excel");
        btXuatExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatExelActionPerformed(evt);
            }
        });

        btLamMoi.setText("Làm Mới");
        btLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLamMoiActionPerformed(evt);
            }
        });

        btChonAnh.setText("Ch�?n Ảnh");
        btChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonAnhActionPerformed(evt);
            }
        });

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane1.setViewportView(txtMota);

        rdCon.setText("Còn Hàng");

        rdHet.setText("Hết Hàng");

        lblAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdCon)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(48, 48, 48)
                                        .addComponent(cbbMau, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbChieuCao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38)
                                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdHet)
                        .addGap(434, 434, 434)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXuatExel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(btXuatExel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbbChieuCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel5))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdHet)
                    .addComponent(rdCon))
                .addContainerGap())
        );

        jLabel13.setText("Màu Sắc");

        btTK.setText("Tìm Kiếm");
        btTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKActionPerformed(evt);
            }
        });

        jLabel14.setText("Tìm Kiếm Sản Phẩm");

        jLabel15.setText("Trạng Thái");

        jLabel16.setText("Kiểu Dáng");

        cbbKD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKDActionPerformed(evt);
            }
        });

        cbbMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMSActionPerformed(evt);
            }
        });

        cbbTt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        cbbTt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btTK)
                        .addGap(18, 18, 18)
                        .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14)))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbbKD, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbbMS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbbTt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTK)
                    .addComponent(cbbKD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã CTSP", "Tên Sản Phẩm", "Kiểu Dáng", "Size", "Màu Sắc", "Chi�?u Cao �?ế", "Giá", "Số Lượng", "Mô Tả", "Trạng Thái"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        int row = tblSanPham.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonAnhActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jfc = new JFileChooser("C:\\");
            jfc.setDialogTitle("Ch�?n Ảnh :");
            jfc.showOpenDialog(null);
            File fl = jfc.getSelectedFile();
            strAnh = fl.getAbsolutePath();
            if (strAnh != null) {
                lblAnh.setIcon(resizeImage(strAnh));
            } else {
                JOptionPane.showMessageDialog(this, "Bạn Chưa Ch�?n Ảnh!"
                    + "Nếu Chưa Ch�?n Thì Hệ Thống Sẽ Ch�?n Ảnh Mặc �?ịnh");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Ch�?n Ảnh!"
                + "Nếu Chưa Ch�?n Thì Hệ Thống Sẽ Ch�?n Ảnh Mặc �?ịnh");
        }
    }//GEN-LAST:event_btChonAnhActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String sanPham = (String) cbbSanPham.getSelectedItem();
        String mauSac = (String) cbbMau.getSelectedItem();
        String kieuDang = (String) cbbKieu.getSelectedItem();
        String size = (String) cbbSize.getSelectedItem();
        String deGiay = (String) cbbChieuCao.getSelectedItem();
        String ma = txtMa.getText();
        String donGia = txtGia.getText();
        String soLuong = (String) txtSoLuong.getText();
        String moTa = txtMota.getText();
        String trangThai = "0";
        if (rdCon.isSelected()) {
            trangThai = "1";
        }

        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được b�? trống");
//        } else if (sanPham.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Tên không được b�? trống");
//        } else if (!sanPham.matches("[A-Z a-z]+")) {
//            JOptionPane.showMessageDialog(this, "Tên phải là chữ");
        } else if (soLuong.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng không được b�? trống");
        } else if (!soLuong.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số");
        } else if (donGia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "�?ơn giá không được b�? trống");
        } else if (!donGia.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "�?ơn giá phải là số");
        } else if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mô tả không được b�? trống");
        } else {
            ChiTietSanPham ctsp = new ChiTietSanPham(sanPham, mauSac, kieuDang, size, deGiay, ma, Integer.parseInt(donGia), Integer.parseInt(soLuong), moTa, Integer.parseInt(trangThai));

            ctsp.setHinhanh(strAnh);

            JOptionPane.showMessageDialog(this, ctspsi.add(ctsp));
            list = ctspsi.getAll();
            showData(list);
            reset();
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        String id = list.get(tblSanPham.getSelectedRow()).getId();
        String idsp = (String) cbbSanPham.getSelectedItem();
        String idms = (String) cbbMau.getSelectedItem();
        String idkieu = (String) cbbKieu.getSelectedItem();
        String idsize = (String) cbbSize.getSelectedItem();
        String idde = (String) cbbChieuCao.getSelectedItem();
        String mactsp = txtMa.getText();
        String donGia = txtGia.getText();
        String soLuong = (String) txtSoLuong.getText();
        String moTa = txtMota.getText();
        String trangThai = "0";
        if (rdCon.isSelected()) {
            trangThai = "1";
        }
        ChiTietSanPham ctsp = new ChiTietSanPham(idsp, idms, idkieu, idsize, idde, mactsp, Integer.parseInt(donGia), Integer.parseInt(soLuong), moTa, Integer.parseInt(trangThai));
        ctsp.setHinhanh(strAnh);
        JOptionPane.showMessageDialog(this, ctspsi.update(ctsp, id));
        list = ctspsi.getAll();
        showData(list);
        txtMa.setText("");
        txtGia.setText("");
        txtMota.setText("");
        txtSoLuong.setText("");
        cbbChieuCao.setSelectedIndex(0);
        cbbKieu.setSelectedIndex(0);
        cbbMau.setSelectedIndex(0);
        cbbSize.setSelectedIndex(0);
        cbbSanPham.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        lblAnh.setText("HINH ANH");
        lblAnh.setIcon(null);
        reset();
    }//GEN-LAST:event_btSuaActionPerformed

    private void btLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLamMoiActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtGia.setText("");
        txtMota.setText("");
        txtSoLuong.setText("");
        cbbChieuCao.setSelectedIndex(0);
        cbbKieu.setSelectedIndex(0);
        cbbMau.setSelectedIndex(0);
        cbbSize.setSelectedIndex(0);
        cbbSanPham.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        lblAnh.setText("HINH ANH");
        lblAnh.setIcon(null);
        list = ctspsi.getAll();
        showData(list);
    }//GEN-LAST:event_btLamMoiActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        String id = list.get(tblSanPham.getSelectedRow()).getId();
        JOptionPane.showMessageDialog(this, ctspsi.delete(id));
        list = ctspsi.getAll();
        showData(list);
        txtMa.setText("");
        txtGia.setText("");
        txtMota.setText("");
        txtSoLuong.setText("");
        cbbChieuCao.setSelectedIndex(0);
        cbbKieu.setSelectedIndex(0);
        cbbMau.setSelectedIndex(0);
        cbbSize.setSelectedIndex(0);
        cbbSanPham.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        reset();
    }//GEN-LAST:event_btXoaActionPerformed

    private void btXuatExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatExelActionPerformed
        // TODO add your handling code here:
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("dsNV");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(2);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SACH SAN PHAM");

            row = sheet.createRow(3);

            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã Sản Phẩm");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên Sản Phẩm");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Kiểu Dáng");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Size");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Màu Sắc");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Chi�?u Cao �?ế");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Giá");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Số Lượng");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Mô Tả");

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Trạng Thái");

            cell = row.createCell(10, CellType.STRING);
            cell.setCellValue("Hình Ảnh");

            for (int i = 0; i < list.size(); i++) {
                //Modelbook book =arr.get(i);
                row = sheet.createRow(4 + i);

                //                cell = row.createCell(0, CellType.NUMERIC);
                //                cell.setCellValue(i + 1);
                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(list.get(i).getMactsp());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(list.get(i).getIdsp());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(list.get(i).getIdkieu());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(list.get(i).getIdsize());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(list.get(i).getIdms());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(list.get(i).getIdde());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(list.get(i).getDongia());

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue(list.get(i).getSoluong());

                cell = row.createCell(8, CellType.ERROR);
                cell.setCellValue(list.get(i).getMota());

                cell = row.createCell(9, CellType.ERROR);
                cell.setCellValue(list.get(i).getTrangThai());

                cell = row.createCell(10, CellType.ERROR);
                cell.setCellValue(list.get(i).getHinhanh());

            }

            File f = new File("D://danhsach.xlsx");
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "in thanh cong D:\\danhsach");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }
    }//GEN-LAST:event_btXuatExelActionPerformed

    private void btTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKActionPerformed
        // TODO add your handling code here:
        String tk = txtTK.getText();
        ctspsi.Tk(tk);
        list = ctspsi.Tk(tk);
        showData(list);
    }//GEN-LAST:event_btTKActionPerformed

    private void cbbKDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKDActionPerformed
        // TODO add your handling code here:
        String ma = cbbKD.getSelectedItem().toString();
        ctspsi.Loc(ma);
        list = ctspsi.Loc(ma);
        showData(list);
    }//GEN-LAST:event_cbbKDActionPerformed

    private void cbbMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMSActionPerformed
        // TODO add your handling code here:
        String ten = cbbMS.getSelectedItem().toString();
        ctspsi.Loc(ten);
        list = ctspsi.Loc(ten);
        showData(list);
    }//GEN-LAST:event_cbbMSActionPerformed

    private void cbbTtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTtActionPerformed
        // TODO add your handling code here:
        String trangThai = cbbTt.getSelectedItem().toString();

        ctspsi.Loc1(trangThai);
        list = ctspsi.Loc1(trangThai);
        showData(list);
    }//GEN-LAST:event_cbbTtActionPerformed

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        //        try {
            //            // TODO add your handling code here:
            //            JFileChooser jfc = new JFileChooser("C:\\Users\\Phan Loc\\Downloads\\PRO1041_DUAN1_BLOCK2 (1)\\src\\main\\resources");
            //            jfc.showOpenDialog(null);
            //            File file = jfc.getSelectedFile();
            //            strAnh = file.getName();
            //            Image img = ImageIO.read(file);
            //            lblAnh.setText("");
            //            int width = lblAnh.getWidth();
            //            int height = lblAnh.getHeight();
            //            lblAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
            //        } catch (IOException ex) {
            //            System.out.println("Error: " + ex.toString());
            //        }
    }//GEN-LAST:event_lblAnhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChonAnh;
    private javax.swing.JButton btLamMoi;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btTK;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXuatExel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChieuCao;
    private javax.swing.JComboBox<String> cbbKD;
    private javax.swing.JComboBox<String> cbbKieu;
    private javax.swing.JComboBox<String> cbbMS;
    private javax.swing.JComboBox<String> cbbMau;
    private javax.swing.JComboBox<String> cbbSanPham;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JComboBox<String> cbbTt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JRadioButton rdCon;
    private javax.swing.JRadioButton rdHet;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables
}
