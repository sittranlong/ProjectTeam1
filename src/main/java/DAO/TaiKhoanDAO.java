/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TieuLong
 */
public class TaiKhoanDAO {

    private Connection connection;

    public TaiKhoanDAO(Connection connection) {
        this.connection = connection;
    }

    public static ArrayList<TaiKhoan> getList() {
        try {
            ArrayList<TaiKhoan> list = new ArrayList<>();
            Connection conn = DatabaseHelper.getConnection();
            String sql = "SELECT * FROM [TAIKHOAN]";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setMataikhoan(rs.getString("mataikhoan"));
                taiKhoan.setTentaikhoan(rs.getString("tentaikhoan"));
                taiKhoan.setChucvu(rs.getString("chucvu"));
                taiKhoan.setPass(rs.getString("pass"));
                taiKhoan.setNgayTao(rs.getDate("ngayTao"));
                taiKhoan.setNgayChinhSua(rs.getDate("ngayChinhSua"));
                taiKhoan.setTrangThai(rs.getInt("trangThai"));
                list.add(taiKhoan);
            }

            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
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

    public static void DoiMatKhau(String user, String pass) {
        try {
            Connection conn = DatabaseHelper.getConnection();
            String sql = "UPDATE dbo.[TAIKHOAN] SET Password = ? WHERE Username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, pass);
            ps.setString(2, user);

            int rs = ps.executeUpdate();
            System.out.println(rs);
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
