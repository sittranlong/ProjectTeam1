/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.ChiTietSanPham;
import ENTITY.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phan Loc
 */
public class BanHangDao {

    public List<ChiTietSanPham> getAll () {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<> ();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, S.TENSIZE, KD.TENKIEU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.ID     \n"
                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
                + "                         SIZE S ON CTSP.Idsize = S.Id";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( sql ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                ChiTietSanPham ctsp = new ChiTietSanPham ();
                ctsp.setMactsp ( rs.getString ( 1 ) );
                ctsp.setIdsp ( rs.getString ( 2 ) );
                ctsp.setIdsize ( rs.getString ( 3 ) );
                ctsp.setIdkieu ( rs.getString ( 4 ) );

                ctsp.setDongia ( rs.getInt ( 5 ) );
                ctsp.setSoluong ( rs.getInt ( 6 ) );
                ctsp.setId ( rs.getString ( 7 ) );
                listLh.add ( ctsp );
            }
        } catch ( Exception e ) {
            e.printStackTrace ( System.out );

        }
        return listLh;
    }

    public List<ChiTietSanPham> Tk ( String ten ) {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<> ();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, DG.DOCAODE, S.TENSIZE, KD.MAKIEU, MS.MAMAU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.MOTA, CTSP.TRANGTHAI, CTSP.HINHANH, CTSP.ID     \n"
                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
                + "                         DEGIAY DG ON CTSP.Idde = DG.Id INNER JOIN\n"
                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
                + "                         MAUSAC MS ON CTSP.Idms = MS.Id INNER JOIN\n"
                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
                + "                         SIZE S ON CTSP.Idsize = S.Id Where SP.TEN =? OR CTSP.MACTSP = ?";
        try (
                Connection con = DatabaseHelper.getConnection ();  
                PreparedStatement ps = con.prepareStatement ( sql ) ) {
            ps.setObject ( 1 , ten );
            ps.setObject ( 2 , ten );
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                ChiTietSanPham ctsp = new ChiTietSanPham ();
                ctsp.setMactsp ( rs.getString ( 1 ) );
                ctsp.setIdsp ( rs.getString ( 2 ) );
                ctsp.setIdde ( rs.getString ( 3 ) );
                ctsp.setIdsize ( rs.getString ( 4 ) );
                ctsp.setIdkieu ( rs.getString ( 5 ) );
                ctsp.setIdms ( rs.getString ( 6 ) );

                ctsp.setDongia ( rs.getInt ( 7 ) );
                ctsp.setSoluong ( rs.getInt ( 8 ) );
                ctsp.setId ( rs.getString ( 9 ) );
                listLh.add ( ctsp );
            }
        } catch ( Exception e ) {
            e.printStackTrace ( System.out );

        }
        return listLh;
    }

    public List<ChiTietSanPham> Loc1 ( String ten ) {
        ArrayList<ChiTietSanPham> listLh = new ArrayList<> ();
        String sql = "SELECT CTSP.MACTSP, SP.TEN, CAST(S.TENSIZE AS NVARCHAR(100)) AS TENSIZE, KD.TENKIEU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.ID     \n"
                + "FROM CHITIETSANPHAM CTSP \n"
                + "INNER JOIN DEGIAY DG ON CTSP.Idde = DG.Id \n"
                + "INNER JOIN KIEUDANG KD ON CTSP.Idkieu = KD.Id \n"
                + "INNER JOIN MAUSAC MS ON CTSP.Idms = MS.Id \n"
                + "INNER JOIN SANPHAM SP ON CTSP.Idsp = SP.Id \n"
                + "INNER JOIN SIZE S ON CTSP.Idsize = S.Id \n"
                + "WHERE KD.TENKIEU = ? OR CAST(S.TENSIZE AS NVARCHAR(100)) = ?";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( sql ) ) {
            ps.setObject ( 1 , ten );
            ps.setObject ( 2 , ten );
//            ps.setObject(3, ten);
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                ChiTietSanPham ctsp = new ChiTietSanPham ();
                ctsp.setMactsp ( rs.getString ( 1 ) );
                ctsp.setIdsp ( rs.getString ( 2 ) );
                ctsp.setIdkieu ( rs.getString ( 4 ) );
                ctsp.setIdsize ( rs.getString ( 3 ) );
                ctsp.setIdkieu ( rs.getString ( 4 ) );

                ctsp.setDongia ( rs.getInt ( 5 ) );
                ctsp.setSoluong ( rs.getInt ( 6 ) );
                ctsp.setId ( rs.getString ( 7 ) );
                listLh.add ( ctsp );
            }
        } catch ( Exception e ) {
            e.printStackTrace ( System.out );

        }
        return listLh;
    }

    public List<String> getListMauSac () {
        List<String> list = new ArrayList<> ();
        String query = "Select MAUSAC.TENMAU from MAUSAC ";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }

    public List<String> getListSanPham () {
        List<String> list = new ArrayList<> ();
        String query = "Select SANPHAM.TEN from SANPHAM ";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }

    public List<String> getListKieuDang1 () {
        List<String> list = new ArrayList<> ();
        String query = "select KIEUDANG.TENKIEU from KIEUDANG ";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }

    public List<String> getListSize1 () {
        List<String> list = new ArrayList<> ();
        String query = "select SIZE.Tensize from SIZE ";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }

    public List<String> getListChieuCao () {
        List<String> list = new ArrayList<> ();
        String query = "select DEGIAY.Docaode from DEGIAY";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }

    public List<String> getListHoaDon () {
        List<String> list = new ArrayList<> ();
        String query = "select * from HOADON";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }

    public List<String> getListHoaDonChiTiet () {
        List<String> list = new ArrayList<> ();
        String query = "select * from HOADONCHITIET";
        try ( Connection con = DatabaseHelper.getConnection ();  PreparedStatement ps = con.prepareStatement ( query ) ) {
            ResultSet rs = ps.executeQuery ();
            while ( rs.next () ) {
                String str = rs.getString ( 1 );
                list.add ( str );
            }
        } catch ( Exception e ) {
        }
        return list;
    }
    
    

//     public List<ChiTietSanPham> TkCTSP(String ten) {
//        ArrayList<ChiTietSanPham> listLh = new ArrayList<>();
//        String sql = "SELECT CTSP.MACTSP, SP.TEN, S.TENSIZE, KD.MAKIEU, CTSP.DONGIA, CTSP.SOLUONG, CTSP.MOTA, CTSP.TRANGTHAI, CTSP.HINHANH, CTSP.ID     \n"
//                + "FROM            CHITIETSANPHAM CTSP INNER JOIN\n"
//                + "                         DEGIAY DG ON CTSP.Idde = DG.Id INNER JOIN\n"
//                + "                         KIEUDANG KD ON CTSP.Idkieu = KD.Id INNER JOIN\n"
//                + "                         MAUSAC MS ON CTSP.Idms = MS.Id INNER JOIN\n"
//                + "                         SANPHAM SP ON CTSP.Idsp = SP.Id INNER JOIN\n"
//                + "                         SIZE S ON CTSP.Idsize = S.Id Where CTSP.MACTSP = ?";
//        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, ten);
//            ps.setObject(2, ten);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                ChiTietSanPham ctsp = new ChiTietSanPham();
//                ctsp.setMactsp(rs.getString(1));
//                ctsp.setIdsp(rs.getString(2));
//                ctsp.setIdsize(rs.getString(4));
//                ctsp.setIdkieu(rs.getString(5));
//                ctsp.setDongia(rs.getInt(6));
//                ctsp.setSoluong(rs.getInt(7));
//                ctsp.setId(rs.getString(8));
//                listLh.add(ctsp);
//            }
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//
//        }
//        return listLh;
//    }
    
    public ArrayList<HoaDon> getListTreoHD(){
        ArrayList<HoaDon> list = new ArrayList<> ();
        String sql = "select Mahd, hd.Ngaytao, ct.Tongtien, hd.TrangThai from hoadon hd join HOADONCHITIET ct on hd.Id = ct.Idhd";
        ResultSet rs = JDBCHelper.excuteQuery ( sql );
        try {
            while ( rs.next ()) {                
                HoaDon hd = new HoaDon ();
                hd.setMahd (rs.getString ( "mahd"));
                hd.setNgayTao ( rs.getDate ( "ngaytao"));
                hd.setTongTien ( rs.getInt ( "tongtien"));
                hd.setTrangThai ( rs.getInt ( "trangthai"));
                list.add ( hd );
            }
        } catch ( Exception e ) {
            e.printStackTrace ();
        }
        return list;
}
}
