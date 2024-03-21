/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


//import sevice.ChiTietSanPhamServiceImpl;
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
 * @author Hoang
 */
public class QuanLySanPham extends javax.swing.JPanel {

    private DefaultTableModel dtm = new DefaultTableModel();
    private ChiTietSanPhamDAO ctspsi = new ChiTietSanPhamDAO();
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    private List<ChiTietSanPham> list = new ArrayList<>();
    private String strAnh = "C:\\";

    /**
     * Creates new form SanPhamJPN
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
            dtm.addRow(new Object[]{ctsp.getMactsp(), ctsp.getSanPham(), ctsp.getKieuDang(), ctsp.getSize(), ctsp.getMauSac(), ctsp.getDeGiay(), ctsp.getDonGia(), ctsp.getSoLuong(), ctsp.getMoTa(), ctsp.getHinhAnh()});
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
        txtGia.setText(ctsp.getDonGia() + "");
        txtSoLuong.setText(ctsp.getSoLuong() + "");
        txtMota.setText(ctsp.getMoTa());
        cbbChieuCao.setSelectedItem(ctsp.getDeGiay() + "");
        cbbSanPham.setSelectedItem(ctsp.getSanPham());
        cbbKieu.setSelectedItem(ctsp.getKieuDang());
        cbbMau.setSelectedItem(ctsp.getMauSac());        
        cbbSanPham.setSelectedItem(ctsp.getSanPham());
        cbbSize.setSelectedItem(ctsp.getSize() + "");
        lblAnh.setIcon(resizeImage(String.valueOf(ctsp.getHinhAnh())));
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btLamMoi = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btXuatExel = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        cbbMau = new javax.swing.JComboBox<>();
        cbbKieu = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbbChieuCao = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        rdCon = new javax.swing.JRadioButton();
        txtGia = new javax.swing.JTextField();
        rdHet = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lblAnh = new javax.swing.JLabel();
        btChonAnh = new javax.swing.JButton();
        btAddMS = new javax.swing.JButton();
        btAddKD = new javax.swing.JButton();
        btAddSize = new javax.swing.JButton();
        btAddCC = new javax.swing.JButton();
        cbbSanPham = new javax.swing.JComboBox<>();
        btAddSP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbbTt = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        txtTK = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btTK = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cbbKD = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cbbMS = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("THÔNG TIN SẢN PHẨM");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TÊN SẢN PHẨM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("GIÁ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SỐ LƯỢNG");

        btLamMoi.setBackground(new java.awt.Color(0, 153, 153));
        btLamMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btLamMoi.setText("Làm mới ");
        btLamMoi.setBorder(null);
        btLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLamMoiActionPerformed(evt);
            }
        });

        btThem.setBackground(new java.awt.Color(0, 153, 153));
        btThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("Thêm");
        btThem.setBorder(null);
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(0, 153, 153));
        btXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.setBorder(null);
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btXuatExel.setBackground(new java.awt.Color(0, 153, 153));
        btXuatExel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btXuatExel.setForeground(new java.awt.Color(255, 255, 255));
        btXuatExel.setText("Xuất Exel");
        btXuatExel.setBorder(null);
        btXuatExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatExelActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(0, 153, 153));
        btSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setText("Sửa");
        btSua.setBorder(null);
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btXuatExel, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btXuatExel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("SIZE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("KIỂU DÁNG");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("MÀU SẮC");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("MÔ TẢ");

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane2.setViewportView(txtMota);

        cbbMau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbbMauMouseEntered(evt);
            }
        });
        cbbMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMauActionPerformed(evt);
            }
        });

        cbbKieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbbKieuMouseEntered(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("TRẠNG THÁI");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("CHIỀU CAO ĐẾ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("ẢNH SẢN PHẨM");

        cbbChieuCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbChieuCaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbbChieuCaoMouseEntered(evt);
            }
        });
        cbbChieuCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChieuCaoActionPerformed(evt);
            }
        });

        cbbSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbbSizeMouseEntered(evt);
            }
        });
        cbbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSizeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdCon);
        rdCon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdCon.setText("Còn Hàng");
        rdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdHet);
        rdHet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdHet.setText("Hết Hàng");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Mã CTSP");

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        lblAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });

        btChonAnh.setBackground(new java.awt.Color(0, 153, 153));
        btChonAnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btChonAnh.setForeground(new java.awt.Color(255, 255, 255));
        btChonAnh.setText("Chọn Ảnh");
        btChonAnh.setBorder(null);
        btChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonAnhActionPerformed(evt);
            }
        });

        btAddMS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMSActionPerformed(evt);
            }
        });

        btAddKD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddKD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddKDActionPerformed(evt);
            }
        });

        btAddSize.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddSizeActionPerformed(evt);
            }
        });

        btAddCC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCCActionPerformed(evt);
            }
        });

        cbbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbbSanPhamMouseEntered(evt);
            }
        });
        cbbSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSanPhamActionPerformed(evt);
            }
        });

        btAddSP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(rdCon)
                        .addGap(6, 6, 6)
                        .addComponent(rdHet)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbMau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbKieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbChieuCao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAddCC)
                                    .addComponent(btAddSize)
                                    .addComponent(btAddMS)
                                    .addComponent(btAddKD))
                                .addGap(78, 100, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(btChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addComponent(lblAnh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btAddSP)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btAddSP)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(btAddMS)
                                            .addGap(84, 84, 84)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel9)
                                                    .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btAddSize)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(btChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btAddCC)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14)
                                                .addComponent(cbbChieuCao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdCon)
                                            .addComponent(rdHet)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel13)))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAddKD)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cbbMau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbbKieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))))
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CTSP", "Tên Sản Phẩm", "Kiểu", "Size", "Màu Sắc", "Chiều Cao Đế", "Giá", "Số Lượng", "Mô Tả", "Trạng Thái"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LỌC SẢN PHẨM");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Trạng Thái");

        cbbTt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        cbbTt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbbTt, 0, 124, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbTt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tìm kiếm sản phẩm");

        btTK.setBackground(new java.awt.Color(0, 153, 153));
        btTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTK.setForeground(new java.awt.Color(255, 255, 255));
        btTK.setText("Tìm");
        btTK.setBorder(null);
        btTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTK, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTK, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Kiểu Dáng");

        cbbKD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbbKD, 0, 124, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbKD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Màu Sắc");

        cbbMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbbMS, 0, 123, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int row = tblSanPham.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void cbbMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMSActionPerformed
        // TODO add your handling code here:
        String ten = cbbMS.getSelectedItem().toString();
        ctspsi.Loc(ten);
        list = ctspsi.Loc(ten);
        showData(list);
    }//GEN-LAST:event_cbbMSActionPerformed

    private void cbbKDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKDActionPerformed
        // TODO add your handling code here:
        String ma = cbbKD.getSelectedItem().toString();
        ctspsi.Loc(ma);
        list = ctspsi.Loc(ma);
        showData(list);
    }//GEN-LAST:event_cbbKDActionPerformed

    private void cbbTtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTtActionPerformed
        // TODO add your handling code here:
        String trangThai = cbbTt.getSelectedItem().toString();

        ctspsi.Loc1(trangThai);
        list = ctspsi.Loc1(trangThai);
        showData(list);
    }//GEN-LAST:event_cbbTtActionPerformed

    private void btTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKActionPerformed
        // TODO add your handling code here:
        String tk = txtTK.getText();
        ctspsi.Tk(tk);
        list = ctspsi.Tk(tk);
        showData(list);
    }//GEN-LAST:event_btTKActionPerformed

    private void btAddCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCCActionPerformed
        // TODO add your handling code here:
        DeGiayGUI ms = new DeGiayGUI();
        ms.setVisible(true);
    }//GEN-LAST:event_btAddCCActionPerformed

    private void btAddSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddSizeActionPerformed
        // TODO add your handling code here:
        SizeGUI ms = new SizeGUI();
        ms.setVisible(true);
    }//GEN-LAST:event_btAddSizeActionPerformed

    private void btAddKDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddKDActionPerformed
        // TODO add your handling code here:
        KieuDangGUI ms = new KieuDangGUI();
        ms.setVisible(true);
    }//GEN-LAST:event_btAddKDActionPerformed

    private void btAddMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMSActionPerformed
        // TODO add your handling code here:
        MauSacGUI ms = new MauSacGUI();
        ms.setVisible(true);
    }//GEN-LAST:event_btAddMSActionPerformed

    private void btChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonAnhActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jfc = new JFileChooser("C:\\");
            jfc.setDialogTitle("Chọn Ảnh :");
            jfc.showOpenDialog(null);
            File fl = jfc.getSelectedFile();
            strAnh = fl.getAbsolutePath();
            if (strAnh != null) {
                lblAnh.setIcon(resizeImage(strAnh));
            } else {
                JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Ảnh!"
                    + "Nếu Chưa Chọn Thì Hệ Thống Sẽ Chọn Ảnh Mặc Định");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Ảnh!"
                + "Nếu Chưa Chọn Thì Hệ Thống Sẽ Chọn Ảnh Mặc Định");
        }
    }//GEN-LAST:event_btChonAnhActionPerformed

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

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void rdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdConActionPerformed

    private void cbbSizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbSizeMouseEntered
        // TODO add your handling code here:
        cbbSize.removeAllItems();
        LoadCbbS(ctspsi.getListSize());
    }//GEN-LAST:event_cbbSizeMouseEntered

    private void cbbChieuCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChieuCaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbChieuCaoActionPerformed

    private void cbbChieuCaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbChieuCaoMouseEntered
        // TODO add your handling code here:
        cbbChieuCao.removeAllItems();
        LoadCbbCC(ctspsi.getListChieuCao());
    }//GEN-LAST:event_cbbChieuCaoMouseEntered

    private void cbbChieuCaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbChieuCaoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbChieuCaoMouseClicked

    private void cbbKieuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbKieuMouseEntered
        // TODO add your handling code here:
        cbbKieu.removeAllItems();
        LoadCbbKD(ctspsi.getListKieuDang());
    }//GEN-LAST:event_cbbKieuMouseEntered

    private void cbbMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMauActionPerformed

    }//GEN-LAST:event_cbbMauActionPerformed

    private void cbbMauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbMauMouseEntered
        // TODO add your handling code here:
        cbbMau.removeAllItems();
        LoadCbbMS(ctspsi.getListMauSac());
    }//GEN-LAST:event_cbbMauMouseEntered

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        String id = list.get(tblSanPham.getSelectedRow()).getId();
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
        ChiTietSanPham ctsp = new ChiTietSanPham(sanPham, mauSac, kieuDang, size, deGiay, ma, Integer.parseInt(donGia), Integer.parseInt(soLuong), moTa, Integer.parseInt(trangThai));
        ctsp.setHinhAnh(strAnh);
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
            cell.setCellValue("Chiều Cao Đế");

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
                cell.setCellValue(list.get(i).getSanPham());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(list.get(i).getKieuDang());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(list.get(i).getSize());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(list.get(i).getMauSac());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(list.get(i).getDeGiay());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(list.get(i).getDonGia());

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue(list.get(i).getSoLuong());

                cell = row.createCell(8, CellType.ERROR);
                cell.setCellValue(list.get(i).getMoTa());

                cell = row.createCell(9, CellType.ERROR);
                cell.setCellValue(list.get(i).getTrangThai());

                cell = row.createCell(10, CellType.ERROR);
                cell.setCellValue(list.get(i).getHinhAnh());

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

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
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

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
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
            JOptionPane.showMessageDialog(this, "Mã không được bỏ trống");
//        } else if (sanPham.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Tên không được bỏ trống");
//        } else if (!sanPham.matches("[A-Z a-z]+")) {
//            JOptionPane.showMessageDialog(this, "Tên phải là chữ");
        } else if (soLuong.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng không được bỏ trống");
        } else if (!soLuong.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số");
        } else if (donGia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Đơn giá không được bỏ trống");
        } else if (!donGia.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số");
        } else if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mô tả không được bỏ trống");
        } else {
            ChiTietSanPham ctsp = new ChiTietSanPham(sanPham, mauSac, kieuDang, size, deGiay, ma, Integer.parseInt(donGia), Integer.parseInt(soLuong), moTa, Integer.parseInt(trangThai));

            ctsp.setHinhAnh(strAnh);

            JOptionPane.showMessageDialog(this, ctspsi.add(ctsp));
            list = ctspsi.getAll();
            showData(list);
            reset();
        }
    }//GEN-LAST:event_btThemActionPerformed

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

    private void cbbSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbSanPhamMouseEntered
        // TODO add your handling code here:
        cbbSanPham.removeAllItems();
        LoadCbbSP(ctspsi.getListSanPham());
    }//GEN-LAST:event_cbbSanPhamMouseEntered

    private void cbbSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSanPhamActionPerformed

    private void btAddSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddSPActionPerformed
        // TODO add your handling code here:
        SanPhamGUI ms = new SanPhamGUI();
        ms.setVisible(true);
    }//GEN-LAST:event_btAddSPActionPerformed

    private void cbbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSizeActionPerformed


   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCC;
    private javax.swing.JButton btAddKD;
    private javax.swing.JButton btAddMS;
    private javax.swing.JButton btAddSP;
    private javax.swing.JButton btAddSize;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
