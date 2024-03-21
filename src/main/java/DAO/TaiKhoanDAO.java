/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author TieuLong
 */
public class TaiKhoanDAO {

    private Connection connection;

    public TaiKhoanDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertTaiKhoan(TaiKhoan taiKhoan) throws SQLException {
        String sql = "INSERT INTO TAIKHOAN (Mataikhoan, Tentaikhoan, Chucvu, Pass, NgayTao, NgayChinhSua, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, taiKhoan.getMataikhoan());
        statement.setString(2, taiKhoan.getTentaikhoan());
        statement.setString(3, taiKhoan.getChucvu());
        statement.setString(4, taiKhoan.getPass());
        statement.setTimestamp(5, new java.sql.Timestamp(taiKhoan.getNgayTao().getTime()));
        statement.setTimestamp(6, new java.sql.Timestamp(taiKhoan.getNgayChinhSua().getTime()));
        statement.setInt(7, taiKhoan.getTrangThai());
        statement.executeUpdate();
    }

    // Add other methods for updating, deleting, and querying TaiKhoan table
}
