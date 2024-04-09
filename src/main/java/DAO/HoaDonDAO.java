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
        String sql = " SELECT \n"
                + "    HD.Mahd AS MaHoaDon,\n"
                + "    NV.Manv AS MaNhanVien,\n"
                + "    KH.Makh AS MaKhachHang,\n"
                + "    HD.NgayTao AS NgayTao,\n"
                + "    SP.Ten AS TenSanPham,\n"
                + "    SUM(HDC.Tongtien) AS TongTien\n"
                + "FROM \n"
                + "    HOADON HD\n"
                + "    INNER JOIN NHANVIEN NV ON HD.Idnv = NV.Id\n"
                + "    INNER JOIN KHACHHANG KH ON HD.Idkh = KH.Id\n"
                + "    INNER JOIN HOADONCHITIET HDC ON HD.Id = HDC.Idhd\n"
                + "    INNER JOIN CHITIETSANPHAM CTSP ON HDC.Idctsp = CTSP.Id\n"
                + "    INNER JOIN SANPHAM SP ON CTSP.Idsp = SP.Id\n"
                + "GROUP BY \n"
                + "     HD.Mahd, NV.Manv, KH.Makh, HD.NgayTao, SP.Ten";
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

    public Integer themHD(HoaDon hd) {
        int row;
        String sql = "insert into HOADON(idkh,idnv,mahd,ngaytao,TrangThai)\n"
                + "values (?, ?, ?)";
        row = DatabaseHelper.excuteUpdate(sql, hd.getIdkh(), hd.getIdnv(), hd.getMahd(),
                hd.getNgayTao(), hd.getTrangThai());
        return row;
    }

}
