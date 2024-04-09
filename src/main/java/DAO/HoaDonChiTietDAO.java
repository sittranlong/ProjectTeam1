/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.HoaDon;
import ENTITY.HoaDonChiTiet;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TieuLong
 */
public class HoaDonChiTietDAO {

    public ArrayList<HoaDonChiTiet> getHDCT() {
        ArrayList<HoaDonChiTiet> list = new ArrayList<>();
        String sql = "";
        ResultSet rs = JDBCHelper.excuteQuery(sql);
        try {
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setId(rs.getString("id"));
                hdct.setManv(rs.getString("manv"));
                hdct.setMakh(rs.getString("makh"));
                hdct.setNgayTao(rs.getString("ngaytao"));
                hdct.setNgayChinhSua(rs.getString("ngaychinhsua"));
                hdct.setTensp(rs.getString("tensp"));
                hdct.setThanhtien(rs.getString("thanhtien"));
                list.add(hdct);
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

}
