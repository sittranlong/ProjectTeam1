/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DATABASE.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class JDBCHelper {
    public static ResultSet excuteQuery(String sql, Object...args){
        Connection cn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            cn = DatabaseHelper.getConnection ();
            pstm = cn.prepareCall ( sql );
            for ( int i = 0 ; i < args.length ; i ++ ) {
                pstm.setObject ( i + 1, args[i]);
            }
            rs = pstm.executeQuery ();
        } catch ( Exception e ) {
            e.printStackTrace ();
        }
        return rs;
    }

    static int excuteUpdate(String sql, String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
