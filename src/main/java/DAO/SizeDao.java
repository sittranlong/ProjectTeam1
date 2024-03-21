/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import ENTITY.SanPham;
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
    public List<Size> getAll() {
        String query = "SELECT [Tensize]\n"
                + "      ,[Masize]\n"
                + "  FROM [dbo].[SIZE]";
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<Size> listSp = new ArrayList<>();
            while (rs.next()) {
                listSp.add(new Size(rs.getInt(1), rs.getString(2)));
            }
            return listSp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Size sp) {
        String query = "INSERT INTO [dbo].[SIZE]\n"
                + "           ([Tensize]\n"
                + "           ,[Masize])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, sp.getMasize());
            ps.setObject(2, sp.getTensize());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[SIZE]\n"
                + "      WHERE Masize = ?";
        int check = 0;
        try ( Connection con = DatabaseHelper.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
