/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TieuLong
 */
public class MauSacDAO {
    
    public boolean Add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MAUSAC]\n"
                + "           ([Mamau]\n"
                + "           ,[Tenmau])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ms.getMamau());
            ps.setObject(2, ms.getTenmau());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<MauSac> getAll() {
        String query = "SELECT "
                + "[Tenmau]\n"
                + "      ,[Mamau]\n"
                + "  FROM [dbo].[MAUSAC]";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<MauSac> list = new ArrayList<>();
            while (rs.next()) {
                MauSac dg = new MauSac(rs.getString(1), rs.getString(2));
                list.add(dg);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[MAUSAC]\n"
                + "      WHERE Mamau = ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }
    
}
