/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.HoaDon;
import ENTITY.HoaDonChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TieuLong
 */
public class HoaDonChiTietDAO {

    public ArrayList<HoaDonChiTiet> getHDCT(String idhd) {
        try {
            ArrayList<HoaDonChiTiet> list = new ArrayList<>();
            Connection connection = DatabaseHelper.getConnection();
            String sql = "SELECT * FROM HOADONCHITIET WHERE Idhd = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, idhd.toString()); // Set the parameter value before executing the query
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                // Set properties of hdct
                list.add(hdct);
            }
            connection.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null; // Return null if an exception occurs
        }
    }

    public Integer xoaHD(String Mahd) {
        int row;
        String sql = "delete from HoaDon\n"
                + "where id = ?";
        row = DatabaseHelper.excuteUpdate(sql, Mahd);
        return row;
    }

}
