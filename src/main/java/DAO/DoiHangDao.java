/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.HoaDon;
import ENTITY.HoaDonChiTiet;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DELL 5458
 */
public class DoiHangDao {

    public ArrayList<HoaDon> getDTHD () {
        ArrayList<HoaDon> list = new ArrayList<> ();
        String sql = "select Mahd, Soluong, hd.Ngaytao, Tongtien from hoadon hd join HOADONCHITIET ct on hd.Id = ct.Idhd";
        ResultSet rs = JDBCHelper.excuteQuery ( sql );
        try {
            while ( rs.next () ) {
                HoaDon h = new HoaDon ();
                h.setMahd ( rs.getString ( "mahd" ) );
                h.setSoLuong ( rs.getInt ( "soluong" ) );
                h.setNgayTao ( rs.getDate ( "ngaytao" ) );
                h.setTongTien ( rs.getInt ( "tongtien" ) );
                list.add ( h );
            }
        } catch ( Exception e ) {
            e.printStackTrace ();
        }
        return list;
    }

    public ArrayList<HoaDon> getDTHDCT () {
        ArrayList<HoaDon> list = new ArrayList<> ();
        String sql = "SELECT hd.Mahd, ct.Soluong, sp.Dongia, ct.Soluong * sp.Dongia as tongtien\n"
                + "FROM HOADON hd\n"
                + "INNER JOIN HOADONCHITIET ct ON hd.Id = ct.Idhd\n"
                + "INNER JOIN CHITIETSANPHAM sp ON ct.Idctsp = sp.Id;";
        ResultSet rs = JDBCHelper.excuteQuery ( sql );
        try {
            while ( rs.next () ) {
                HoaDon h = new HoaDon ();
                h.setMahd ( rs.getString ( "mahd" ) );
                h.setSoLuong ( rs.getInt ( "soluong" ) );
                h.setDonGia ( rs.getDouble ( "dongia" ) );
                h.setTongTien ( rs.getInt ( "tongtien" ) );
                list.add ( h );
            }
        } catch ( Exception e ) {
            e.printStackTrace ();
        }
        return list;
    }

    public ArrayList<HoaDonChiTiet> getDH () {
        ArrayList<HoaDonChiTiet> list = new ArrayList<> ();
        String sql = "SELECT sp.Masp, sp.Ten, ctsp.Soluong, ctsp.Dongia, ctsp.TrangThai\n"
                + "FROM SANPHAM sp\n"
                + "INNER JOIN CHITIETSANPHAM ctsp ON sp.Id = ctsp.Idsp;";
        ResultSet rs = JDBCHelper.excuteQuery ( sql );
        try {
            while ( rs.next ()) {                
                HoaDonChiTiet ct = new HoaDonChiTiet ();
                ct.setMaSP ( rs.getString ( "masp"));
                ct.setTensp ( rs.getString ( "ten"));
                ct.setSoluong ( rs.getInt ( "soluong"));
                ct.setDonGia ( rs.getInt ( "dongia"));
                ct.setTrangThai ( rs.getString ( "trangthai"));
                list.add ( ct );
            }
        } catch ( Exception e ) {
            e.printStackTrace ();
        }
        return list;
    }
}
