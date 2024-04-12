package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TieuLong
 */
public class HoaDonDAO {

    public ArrayList<HoaDon> getList() {
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            Connection connection = DatabaseHelper.getConnection();
            String sql = "SELECT * FROM dbo.HOADON";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahd(resultSet.getString("Mahd"));
                hd.setIdnv(resultSet.getString("Idnv"));
                hd.setIdkh(resultSet.getString("Idkh"));
                hd.setNgayTao(resultSet.getDate("Ngaytao"));
                hd.setNgayChinhSua(resultSet.getDate("NgayChinhSua"));
                hd.setTongTien(resultSet.getInt("TrangThai"));
                list.add(hd);
            }
            connection.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
