/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.Size;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TieuLong
 */
public class SizeDao {
    
    public boolean Add3(Size s) {
        String query = "INSERT INTO [dbo].[SIZE]\n"
                + "           ([Tensize]\n"
                + "           ,[Masize])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, s.getTensize());
            ps.setObject(2, s.getMasize());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<Size> getAll3() {
        String query = "SELECT [Tensize]\n"
                + "      ,[Masize]\n"
                + "  FROM [dbo].[SIZE]";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<Size> list = new ArrayList<>();
            while (rs.next()) {
                Size dg = new Size(rs.getInt(1), rs.getString(2));
                list.add(dg);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean delete3(String ma) {
        String query = "DELETE FROM [dbo].[SIZE]\n"
                + "      WHERE Masize = ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }
}
