/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.KhachHang;
import ENTITY.KieuDang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TieuLong
 */
public class KhachHangDAO {

    public boolean Add(KhachHang kd) {
        String query = "INSERT INTO [dbo].[KHACHHANG]\n"
                + "           ([Makh]\n"
                + "           ,[Ten]\n"
                + "           ,[Diachi]\n"
                + "           ,[Sdt])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kd.getMakh());
            ps.setObject(2, kd.getTen());
            ps.setObject(3, kd.getDiachi());
            ps.setObject(4, kd.getSdt());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<KhachHang> getAll() {
        String query = "SELECT [Makh]\n"
                + "      ,[Ten]\n"
                + "      ,[Diachi]\n"
                + "      ,[Sdt]\n"
                + "  FROM [dbo].[KHACHHANG]";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<KhachHang> list = new ArrayList<>();
            while (rs.next()) {
                KhachHang dg = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(dg);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[KHACHHANG]\n"
                + "      WHERE Makh = ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }

    public boolean Update(KhachHang dg, String ma) {
        String query = "UPDATE [dbo].[KHACHHANG]\n"
                + "   SET [Makh] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[Diachi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + " WHERE [Makh] = ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, dg.getMakh());
            ps.setObject(2, dg.getTen());
            ps.setObject(3, dg.getDiachi());
            ps.setObject(4, dg.getTen());
            ps.setObject(3, ma);

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<KhachHang> Tk(String ten) {
        ArrayList<KhachHang> listLh = new ArrayList<>();
        String sql = "SELECT [Makh]\n"
                + "      ,[Ten]\n"
                + "      ,[Diachi]\n"
                + "      ,[Sdt]\n" +
        "  FROM [dbo].[KHACHHANG] where Makh = ? or Sdt = ?";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ten);
            ps.setObject(2, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang ctsp = new KhachHang();
                ctsp.setMakh(rs.getString(1));
                ctsp.setTen(rs.getString(2));
                ctsp.setDiachi(rs.getString(3));
                ctsp.setSdt(rs.getString(4));
                listLh.add(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return listLh;
    }

}
