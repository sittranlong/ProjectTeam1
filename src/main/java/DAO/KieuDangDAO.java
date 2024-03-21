/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
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
public class KieuDangDAO {
    public boolean Add(KieuDang kd) {
        String query = "INSERT INTO [dbo].[KIEUDANG]\n"
                + "           ([Makieu]\n"
                + "           ,[Tenkieu])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kd.getMakieu());
            ps.setObject(2, kd.getTenkieu());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<KieuDang> getAll() {
        String query = "SELECT"
                + "[Tenkieu]\n"
                + "      ,[Makieu]\n"
                + "  FROM [dbo].[KIEUDANG]";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<KieuDang> list = new ArrayList<>();
            while (rs.next()) {
                KieuDang dg = new KieuDang(rs.getString(1), rs.getString(2));
                list.add(dg);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[KIEUDANG]\n"
                + "      WHERE Makieu = ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }
}
