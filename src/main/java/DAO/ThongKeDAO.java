/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.HoaDonChiTiet;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL 5458
 */
public class ThongKeDAO {

    public ArrayList<HoaDonChiTiet> getTK () {
        ArrayList<HoaDonChiTiet> list = new ArrayList<> ();
        String sql = "SELECT \n"
                + "    sp.Masp, \n"
                + "    sp.Ten, \n"
                + "    cts.Dongia, \n"
                + "    SUM(ct.Soluong) as SoLuong, \n"
                + "    SUM(ct.Soluong) * cts.Dongia as DoanhSo\n"
                + "FROM SANPHAM sp\n"
                + "INNER JOIN CHITIETSANPHAM cts ON sp.Id = cts.Idsp\n"
                + "INNER JOIN HOADONCHITIET ct ON cts.Id = ct.Idctsp\n"
                + "GROUP BY sp.Masp, sp.Ten, cts.Dongia;	";
        ResultSet rs = JDBCHelper.excuteQuery ( sql );
        try {
            while ( rs.next () ) {
                HoaDonChiTiet ct = new HoaDonChiTiet ();
                ct.setMaSP ( rs.getString ( "masp" ) );
                ct.setTensp ( rs.getString ( "ten" ) );
                ct.setDonGia ( rs.getInt ( "dongia" ) );
                ct.setSoluong ( rs.getInt ( "soluong" ) );
                ct.setThanhtien ( rs.getString ( "doanhso" ) );
                list.add ( ct );
            }
        } catch ( Exception e ) {
            e.printStackTrace ();
        }

        return list;
    }
}
