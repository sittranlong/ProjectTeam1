/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.ChiTietSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TieuLong
 */
public class ChiTietSanPhamDAO {
    public List<ChiTietSanPham> getAll() {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<>();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, DG.DOCAODE, S.TENSIZE, KD.TENKIEU, MS.TENMAU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.MOTA, CTSP.TRANGTHAI, CTSP.HINHANH, CTSP.ID     \n"
                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
                + "                         DEGIAY DG ON CTSP.Idde = DG.Id INNER JOIN\n"
                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
                + "                         MAUSAC MS ON CTSP.Idms = MS.Id INNER JOIN\n"
                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
                + "                         SIZE S ON CTSP.Idsize = S.Id";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPham ctsp = new ChiTietSanPham();
                ctsp.setMactsp(rs.getString(1));
                ctsp.setSanPham(rs.getString(2));
                ctsp.setDeGiay(rs.getString(3));
                ctsp.setSize(rs.getString(4));
                ctsp.setKieuDang(rs.getString(5));
                ctsp.setMauSac(rs.getString(6));
//                SanPham sp = new SanPham();
//                sp.setTen(rs.getString(2));
////                ctsp.setSanPham();
//                DeGiay dg = new DeGiay();
//                dg.setDoCao(rs.getInt(3));
//                ctsp.setDeGiay(dg);
//                Size s = new Size();
//                s.setTen(rs.getInt(4));
//                ctsp.setSize(s);
//                KieuDang kd = new KieuDang();
//                kd.setTen(rs.getString(5));
//                ctsp.setKieuDang(kd);
//                MauSac ms = new MauSac();
//                ms.setTen(rs.getString(6));
//                ctsp.setMauSac(ms);
                ctsp.setDonGia(rs.getInt(7));
                ctsp.setSoLuong(rs.getInt(8));
                ctsp.setMoTa(rs.getString(9));
                ctsp.setTrangThai(rs.getInt(10));
                ctsp.setHinhAnh(rs.getString(11));
                ctsp.setId(rs.getString(12));
                listLh.add(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return listLh;
    }

    public boolean add(ChiTietSanPham ctsp) {
//        String query = "insert into CHITIETSANPHAM(Mactsp,Idsp.Ten,idde.Docaode,idsize.Tensize,idkieu.Tenkieu,idms.Tenmau,dongia,soluong,mota,trangthai)\n" +
//"VALUES (?,?,?,?,?,?,?,?,?,?)";
//        String query = "insert into CHITIETSANPHAM(Idsp,idms,idkieu,idsize,idde,dongia,mota,trangthai,hinhanh,mactsp,soluong)\n"
//                + "select sp.id,ms.id,kd.id,sz.id,de.id,?,?,?,? from SANPHAM sp,MAUSAC ms,KIEUDANG kd, SIZE sz,DEGIAY de where sp.Masp = ? AND sp.Soluong = ? AND sp.Ten=? AND ms.Mamau=? AND kd.Makieu= ? and sz.Tensize = ? AND de.Docaode = ?";
        String query = "insert into CHITIETSANPHAM(idsp,idms,idkieu,idsize,idde,mactsp,hinhanh,dongia,soluong,mota,trangthai)\n"
                + "                select\n"
                + "                                 Idsp = (SELECT sp.id from SANPHAM sp WHERE sp.Ten = ? ),\n"
                + "                               Idms = (SELECT ms.id from MAUSAC ms WHERE ms.Tenmau = ?),\n"
                + "                            Idkieu = (SELECT kd.id from KIEUDANG kd WHERE kd.Tenkieu = ?),\n"
                + "                             Idsize = (SELECT s.id from SIZE s WHERE s.Tensize = ?),\n"
                + "                              Idde = (SELECT dg.id from DEGIAY dg WHERE dg.Docaode = ?),\n"
                + "                                 [Mactsp] = ?,\n"                
                + "                               [Hinhanh] = ?,\n"
                + "                                [Dongia] = ?,\n"
                + "                              [soluong] = ?,\n"
                + "                               [Mota] = ?,\n"
                + "                             [Trangthai] = ?";
        
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ctsp.getSanPham());
//            ps.setObject(3, ctsp.getMa());
            ps.setObject(2, ctsp.getMauSac());
            ps.setObject(3, ctsp.getKieuDang());
            ps.setObject(4, ctsp.getSize());
            ps.setObject(5, ctsp.getDeGiay());
            ps.setObject(6, ctsp.getMactsp());
            ps.setObject(7, ctsp.getHinhAnh());
            ps.setObject(8, ctsp.getDonGia());
            ps.setObject(9, ctsp.getSoLuong());
            ps.setObject(10, ctsp.getMoTa());
            ps.setObject(11, ctsp.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[CHITIETSANPHAM]\n"
                + "      where Id like ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ChiTietSanPham ctsp, String id) {
        String query = "UPDATE [dbo].[CHITIETSANPHAM] \n"
                + "			SET Idsp = (SELECT sp.id  from SANPHAM sp WHERE sp.Ten = ?)\n"
                + "                ,Idms = (SELECT ms.id from MAUSAC ms WHERE ms.Tenmau = ?)\n"
                + "                ,Idkieu = (SELECT kd.id from KIEUDANG kd WHERE kd.Tenkieu = ?)\n"
                + "                ,Idsize = (SELECT s.id from SIZE s WHERE s.Tensize = ?)\n"
                + "                ,Idde = (SELECT dg.id from DEGIAY dg WHERE dg.Docaode = ?)\n"
                + "                ,[Mactsp] = ?\n"                
                + "                ,[Dongia] = ?\n"
                + "                ,[Mota] = ?\n"
                + "                 ,[Soluong] = ?\n"
                + "                ,[Trangthai] = ?\n"
                + "                 ,[Hinhanh] = ?\n"
                + "				 where id like ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ctsp.getSanPham());
            ps.setObject(2, ctsp.getMauSac());
            ps.setObject(3, ctsp.getKieuDang());
            ps.setObject(4, ctsp.getSize());
            ps.setObject(5, ctsp.getDeGiay());
            ps.setObject(6, ctsp.getMactsp());
            ps.setObject(7, ctsp.getDonGia());
            ps.setObject(8, ctsp.getMoTa());
            ps.setObject(9, ctsp.getSoLuong());
            ps.setObject(10, ctsp.getTrangThai());
            ps.setObject(11, ctsp.getHinhAnh());
            ps.setObject(12, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<ChiTietSanPham> Tk(String ten) {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<>();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, DG.DOCAODE, S.TENSIZE, KD.MAKIEU, MS.MAMAU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.MOTA, CTSP.TRANGTHAI, CTSP.HINHANH, CTSP.ID     \n"
                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
                + "                         DEGIAY DG ON CTSP.Idde = DG.Id INNER JOIN\n"
                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
                + "                         MAUSAC MS ON CTSP.Idms = MS.Id INNER JOIN\n"
                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
                + "                         SIZE S ON CTSP.Idsize = S.Id Where SP.TEN =? OR CTSP.MACTSP = ?";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ten);
            ps.setObject(2, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {ChiTietSanPham ctsp = new ChiTietSanPham();
                ctsp.setMactsp(rs.getString(1));
                ctsp.setSanPham(rs.getString(2));
                ctsp.setDeGiay(rs.getString(3));
                ctsp.setSize(rs.getString(4));
                ctsp.setKieuDang(rs.getString(5));
                ctsp.setMauSac(rs.getString(6));

                ctsp.setDonGia(rs.getInt(7));
                ctsp.setSoLuong(rs.getInt(8));
                ctsp.setMoTa(rs.getString(9));
                ctsp.setTrangThai(rs.getInt(10));
                ctsp.setHinhAnh(rs.getString(11));
                ctsp.setId(rs.getString(12));
                listLh.add(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return listLh;
    }

    public List<ChiTietSanPham> Loc(String ten) {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<>();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, DG.DOCAODE, S.TENSIZE, KD.TENKIEU, MS.TENMAU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.MOTA, CTSP.TRANGTHAI, CTSP.HINHANH, CTSP.ID     \n"
                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
                + "                         DEGIAY DG ON CTSP.Idde = DG.Id INNER JOIN\n"
                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
                + "                         MAUSAC MS ON CTSP.Idms = MS.Id INNER JOIN\n"
                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
                + "                         SIZE S ON CTSP.Idsize = S.Id Where   KD.TENKIEU = ? OR MS.TENMAU = ? ";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ten);
            ps.setObject(2, ten);
//            ps.setObject(3, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPham ctsp = new ChiTietSanPham();
                ctsp.setMactsp(rs.getString(1));
                ctsp.setSanPham(rs.getString(2));
                ctsp.setDeGiay(rs.getString(3));
                ctsp.setSize(rs.getString(4));
                ctsp.setKieuDang(rs.getString(5));
                ctsp.setMauSac(rs.getString(6));

                ctsp.setDonGia(rs.getInt(7));
                ctsp.setSoLuong(rs.getInt(8));
                ctsp.setMoTa(rs.getString(9));
                ctsp.setTrangThai(rs.getInt(10));
                ctsp.setHinhAnh(rs.getString(11));
                ctsp.setId(rs.getString(12));
                listLh.add(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return listLh;
    }

    public List<ChiTietSanPham> Loc1(String ten) {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<>();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, DG.DOCAODE, S.TENSIZE, KD.TENKIEU, MS.TENMAU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.MOTA, CTSP.TRANGTHAI, CTSP.HINHANH, CTSP.ID     \n"
                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
                + "                         DEGIAY DG ON CTSP.Idde = DG.Id INNER JOIN\n"
                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
                + "                         MAUSAC MS ON CTSP.Idms = MS.Id INNER JOIN\n"
                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
                + "                         SIZE S ON CTSP.Idsize = S.Id Where   CTSP.TRANGTHAI = ? ";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPham ctsp = new ChiTietSanPham();
                ctsp.setMactsp(rs.getString(1));
                ctsp.setSanPham(rs.getString(2));
                ctsp.setDeGiay(rs.getString(3));
                ctsp.setSize(rs.getString(4));
                ctsp.setKieuDang(rs.getString(5));
                ctsp.setMauSac(rs.getString(6));

                ctsp.setDonGia(rs.getInt(7));
                ctsp.setSoLuong(rs.getInt(8));
                ctsp.setMoTa(rs.getString(9));
                ctsp.setTrangThai(rs.getInt(10));
                ctsp.setHinhAnh(rs.getString(11));
                ctsp.setId(rs.getString(12));
                listLh.add(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return listLh;
    }

    public List<String> getListMauSac() {
        List<String> list = new ArrayList<>();
        String query = "Select MAUSAC.TENMAU from MAUSAC ";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<String> getListSanPham() {
        List<String> list = new ArrayList<>();
        String query = "Select SANPHAM.TEN from SANPHAM ";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<String> getListKieuDang() {
        List<String> list = new ArrayList<>();
        String query = "select KIEUDANG.TENKIEU from KIEUDANG ";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<String> getListSize() {
        List<String> list = new ArrayList<>();
        String query = "select SIZE.Tensize from SIZE ";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<String> getListChieuCao() {
        List<String> list = new ArrayList<>();
        String query = "select DEGIAY.Docaode from DEGIAY";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<String> getListTrangThai() {
        List<String> list = new ArrayList<>();
        String query = "select CHITIETSANPHAM.Trangthai from CHITIETSANPHAM";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
