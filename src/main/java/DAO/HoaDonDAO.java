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
        String sql = "SELECT * FROM  HOADON";
        ResultSet rs = JDBCHelper.excuteQuery(sql);
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(rs.getString("Id"));
                hd.setIdkh(rs.getString("Idkh"));
                hd.setIdnv(rs.getString("Idnv"));
                hd.setMahd(rs.getString("Mahd"));
                hd.setNgayTao(rs.getDate("NgayTao"));
                hd.setNgayChinhSua(rs.getDate("NgayChinhSua"));
                hd.setTrangThai(rs.getInt("TrangThai"));
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

    public Integer themHD(HoaDon hd) {
        int row;
        String sql = "insert into HOADON(idkh,idnv,mahd,ngaytao,TrangThai)\n"
                + "values (?, ?, ?)";
        row = DatabaseHelper.excuteUpdate(sql, hd.getIdkh(), hd.getIdnv(), hd.getMahd(),
                hd.getNgayTao(), hd.getTrangThai());
        return row;
    }

}
