/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author TieuLong
 */
public class NhanVienDAO {

    public static ArrayList<NhanVien> getList() {
        try {
            ArrayList<NhanVien> list = new ArrayList<>();
            Connection connection = DatabaseHelper.getConnection();
            String sql = "SELECT * FROM dbo.NhanVien WHERE TrangThai = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(UUID.fromString(resultSet.getString("Id")));
                nhanVien.setMataiKhoan(resultSet.getString("MataiKhoan"));
                nhanVien.setManv(resultSet.getString("Manv"));
                nhanVien.setTen(resultSet.getString("Ten"));
                nhanVien.setDiachi(resultSet.getString("Diachi"));
                nhanVien.setGioitinh(resultSet.getString("Gioitinh"));
                nhanVien.setNgaysinh(resultSet.getDate("Ngaysinh"));
                nhanVien.setEmail(resultSet.getString("Email"));
                nhanVien.setSdt(resultSet.getString("Sdt"));
                nhanVien.setLuong(resultSet.getInt("Luong"));
                nhanVien.setNgayTao(resultSet.getDate("NgayTao"));
                nhanVien.setNgayChinhSua(resultSet.getDate("NgayChinhSua"));
                nhanVien.setTrangThai(resultSet.getInt("TrangThai"));

                list.add(nhanVien);
            }

            connection.close();
            return list;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void insertNhanVien(NhanVien nhanVien) {
        try {
            Connection connection = DatabaseHelper.getConnection();
            String sql = "INSERT INTO dbo.NHANVIEN (Id, MataiKhoan, Manv, Ten, Diachi, Gioitinh, Ngaysinh, Email, Sdt, Luong, NgayTao, NgayChinhSua, TrangThai) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, nhanVien.getId());
            preparedStatement.setString(2, nhanVien.getMataiKhoan());
            preparedStatement.setString(3, nhanVien.getManv());
            preparedStatement.setString(4, nhanVien.getTen());
            preparedStatement.setString(5, nhanVien.getDiachi());
            preparedStatement.setString(6, nhanVien.getGioitinh());
            preparedStatement.setDate(7, new java.sql.Date(nhanVien.getNgaysinh().getTime()));
            preparedStatement.setString(8, nhanVien.getEmail());
            preparedStatement.setString(9, nhanVien.getSdt());
            preparedStatement.setInt(10, nhanVien.getLuong());
            preparedStatement.setDate(11, new java.sql.Date(nhanVien.getNgayTao().getTime()));
            preparedStatement.setDate(12, new java.sql.Date(nhanVien.getNgayChinhSua().getTime()));
            preparedStatement.setInt(13, nhanVien.getTrangThai());

            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateNhanVien(NhanVien nhanVien) {
        try {
            Connection connection = DatabaseHelper.getConnection();
            String sql = "UPDATE dbo.NHANVIEN SET MataiKhoan=?, Manv=?, Ten=?, Diachi=?, Gioitinh=?, Ngaysinh=?, Email=?, Sdt=?, Luong=?, NgayChinhSua=? WHERE Id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien.getMataiKhoan());
            preparedStatement.setString(2, nhanVien.getManv());
            preparedStatement.setString(3, nhanVien.getTen());
            preparedStatement.setString(4, nhanVien.getDiachi());
            preparedStatement.setString(5, nhanVien.getGioitinh());
            preparedStatement.setDate(6, new java.sql.Date(nhanVien.getNgaysinh().getTime()));
            preparedStatement.setString(7, nhanVien.getEmail());
            preparedStatement.setString(8, nhanVien.getSdt());
            preparedStatement.setInt(9, nhanVien.getLuong());
            preparedStatement.setDate(10, new java.sql.Date(nhanVien.getNgayChinhSua().getTime()));
            preparedStatement.setObject(11, nhanVien.getId());

            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteNhanVien(UUID id) {
        try {
            Connection connection = DatabaseHelper.getConnection();
            String sql = "UPDATE dbo.NHANVIEN SET TrangThai=0 WHERE Id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, id);

            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<NhanVien> searchNhanVien(String keyword) {
        try {
            ArrayList<NhanVien> resultList = new ArrayList<>();
            Connection connection = DatabaseHelper.getConnection();

            String sql = "SELECT * FROM dbo.NHANVIEN WHERE TrangThai = 1 AND (Ten LIKE ? OR Sdt LIKE ? OR Manv LIKE ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + keyword + "%");
            preparedStatement.setString(2, "%" + keyword + "%");
            preparedStatement.setString(3, "%" + keyword + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(UUID.fromString(resultSet.getString("Id")));
                nhanVien.setMataiKhoan(resultSet.getString("MataiKhoan"));
                nhanVien.setManv(resultSet.getString("Manv"));
                nhanVien.setTen(resultSet.getString("Ten"));
                nhanVien.setDiachi(resultSet.getString("Diachi"));
                nhanVien.setGioitinh(resultSet.getString("Gioitinh"));
                nhanVien.setNgaysinh(resultSet.getDate("Ngaysinh"));
                nhanVien.setEmail(resultSet.getString("Email"));
                nhanVien.setSdt(resultSet.getString("Sdt"));
                nhanVien.setLuong(resultSet.getInt("Luong"));
                nhanVien.setNgayTao(resultSet.getDate("NgayTao"));
                nhanVien.setNgayChinhSua(resultSet.getDate("NgayChinhSua"));
                nhanVien.setTrangThai(resultSet.getInt("TrangThai"));

                resultList.add(nhanVien);
            }

            connection.close();
            return resultList;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
