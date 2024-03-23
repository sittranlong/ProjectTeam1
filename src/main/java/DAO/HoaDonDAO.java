/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TieuLong
 */
public class HoaDonDAO {
    public ArrayList<HoaDon> getHD () {
        ArrayList<HoaDon> list = new ArrayList<> ();
        String sql = "select * from hoadon hd join HOADONCHITIET ct on hd.Id = ct.Idhd";
        ResultSet rs = JDBCHelper.excuteQuery ( sql );
        try {
            while ( rs.next () ) {
                HoaDon hd = new HoaDon ();
                hd.setMahd ( rs.getString ( "mahd" ) );
                hd.setIdnv ( rs.getString ( "idnv" ) );
                hd.setIdkh ( rs.getString ( "idkh" ) );
<<<<<<< HEAD
                hd.setNgayTao ( rs.getDate ("ngaytao" ) );
=======
                hd.setNgayTao ( rs.getDate("ngaytao" ) );
>>>>>>> b0d6ba7b7643d21bead46e026b2868e733c481b7
                hd.setTenSP ( rs.getString ( "ten"));
                hd.setTongTien ( rs.getInt ( "tongtien" ) );
                list.add ( hd );
            }
        } catch ( Exception e ) {
            e.printStackTrace ();
        }
        return list;
    }
}
