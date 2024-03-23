/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author TieuLong
 */
public class HoaDon {
  private String id;
    private String idkh;
    private String idnv;
    private String mahd;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;
    private String tenSP;
    private int tongTien;

    public HoaDon () {
    }

    public HoaDon ( String id , String idkh , String idnv , String mahd , Date ngayTao , Date ngayChinhSua , int trangThai , String tenSP , int tongTien ) {
        this.id = id;
        this.idkh = idkh;
        this.idnv = idnv;
        this.mahd = mahd;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
        this.tenSP = tenSP;
        this.tongTien = tongTien;
    }

    public String getId () {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public String getIdkh () {
        return idkh;
    }

    public void setIdkh ( String idkh ) {
        this.idkh = idkh;
    }

    public String getIdnv () {
        return idnv;
    }

    public void setIdnv ( String idnv ) {
        this.idnv = idnv;
    }

    public String getMahd () {
        return mahd;
    }

    public void setMahd ( String mahd ) {
        this.mahd = mahd;
    }

    public Date getNgayTao () {
        return ngayTao;
    }

    public void setNgayTao ( Date ngayTao ) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayChinhSua () {
        return ngayChinhSua;
    }

    public void setNgayChinhSua ( Date ngayChinhSua ) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public int getTrangThai () {
        return trangThai;
    }

    public void setTrangThai ( int trangThai ) {
        this.trangThai = trangThai;
    }

    public String getTenSP () {
        return tenSP;
    }

    public void setTenSP ( String tenSP ) {
        this.tenSP = tenSP;
    }

    public int getTongTien () {
        return tongTien;
    }

    public void setTongTien ( int tongTien ) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString () {
        return "HoaDon{" + "id=" + id + ", idkh=" + idkh + ", idnv=" + idnv + ", mahd=" + mahd + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + ", tenSP=" + tenSP + ", tongTien=" + tongTien + '}';
    }

   
}
