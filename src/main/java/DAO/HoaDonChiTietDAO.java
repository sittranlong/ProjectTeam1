package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.HoaDonChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author TieuLong
 */
public class HoaDonChiTietDAO {

    public ArrayList<HoaDonChiTiet> getHDCTByMaHD(String mahd) {
        try {
            ArrayList<HoaDonChiTiet> list = new ArrayList<>();
            Connection connection = DatabaseHelper.getConnection();
            String sql = "SELECT hct.*\n"
                    + "FROM HOADONCHITIET hct\n"
                    + "JOIN HOADON hd ON hct.Idhd = hd.Id\n"
                    + "WHERE hd.Mahd = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mahd); // Add parameter value
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setId(resultSet.getString("id"));
                hdct.setIdhd(resultSet.getString("idhd"));
                hdct.setIdctsp(resultSet.getString("idctsp"));
                hdct.setSoluong(resultSet.getInt("soluong"));
                hdct.setThanhtien(resultSet.getDouble("tongtien") + "");
                hdct.setNgayTao(resultSet.getDate("ngaytao") + "");
                hdct.setNgayChinhSua(resultSet.getDate("ngaychinhsua") + "");
                hdct.setTrangThai(resultSet.getInt("trangthai") + "");
                list.add(hdct);
            }
            connection.close();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Return null in case of exception or no results
    }

}
