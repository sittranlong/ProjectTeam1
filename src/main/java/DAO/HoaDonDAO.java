/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TieuLong
 */
public class HoaDonDAO {

    public ArrayList<HoaDon> getHD() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "FROM HoaDon AS hd\n"
                + "JOIN HoaDonChiTiet AS hct ON hd.Id = hct.Idhd\n"
                + "JOIN SanPham AS sp ON hct.Idctsp = sp.Id";
        ResultSet rs = JDBCHelper.excuteQuery(sql);
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahd(rs.getString("mahd"));
                hd.setIdnv(rs.getString("idnv"));
                hd.setIdkh(rs.getString("idkh"));
                hd.setNgayTao(rs.getDate("ngaytao"));
                hd.setTenSP(rs.getString("ten"));
                hd.setTongTien(rs.getInt("Tongtien"));
                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Integer xoaHD(String Mahd) {
        int row;
        String sql = "delete from HoaDon\n"
                + "where id = ?";
        row = DatabaseHelper.excuteUpdate(sql, Mahd);
        return row;
    }

//    public Integer themHD(HoaDon hd) {
//        int row;
//        String sql = "insert into HOADON(idkh,idnv,mahd,ngaytao,TrangThai)\n"
//                + "values (?, ?, ?)";
//        row = DatabaseHelper.excuteUpdate(sql, hd.getIdkh(), hd.getIdnv(), hd.getMahd(),
//                hd.getNgayTao(), hd.getTrangThai());
//        return row;
//    }
}
