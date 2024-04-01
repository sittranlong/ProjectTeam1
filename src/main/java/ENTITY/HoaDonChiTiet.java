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
public class HoaDonChiTiet {
    private String id;
    private String idhd;
    private String idctsp;
    private int soluong;
    private String thanhtien;
    private String ngayTao;
    private String ngayChinhSua;
    private String trangThai;
    private String manv;
    private String makh;
    private String tensp;
    private String mahd;
    private int size;
    private int donGia;

    public HoaDonChiTiet () {
    }

    public HoaDonChiTiet ( String id , String idhd , String idctsp , int soluong , String thanhtien , String ngayTao , String ngayChinhSua , String trangThai , String manv , String makh , String tensp , String mahd , int size , int donGia ) {
        this.id = id;
        this.idhd = idhd;
        this.idctsp = idctsp;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
        this.manv = manv;
        this.makh = makh;
        this.tensp = tensp;
        this.mahd = mahd;
        this.size = size;
        this.donGia = donGia;
    }

    public String getId () {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public String getIdhd () {
        return idhd;
    }

    public void setIdhd ( String idhd ) {
        this.idhd = idhd;
    }

    public String getIdctsp () {
        return idctsp;
    }

    public void setIdctsp ( String idctsp ) {
        this.idctsp = idctsp;
    }

    public int getSoluong () {
        return soluong;
    }

    public void setSoluong ( int soluong ) {
        this.soluong = soluong;
    }

    public String getThanhtien () {
        return thanhtien;
    }

    public void setThanhtien ( String thanhtien ) {
        this.thanhtien = thanhtien;
    }

    public String getNgayTao () {
        return ngayTao;
    }

    public void setNgayTao ( String ngayTao ) {
        this.ngayTao = ngayTao;
    }

    public String getNgayChinhSua () {
        return ngayChinhSua;
    }

    public void setNgayChinhSua ( String ngayChinhSua ) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public String getTrangThai () {
        return trangThai;
    }

    public void setTrangThai ( String trangThai ) {
        this.trangThai = trangThai;
    }

    public String getManv () {
        return manv;
    }

    public void setManv ( String manv ) {
        this.manv = manv;
    }

    public String getMakh () {
        return makh;
    }

    public void setMakh ( String makh ) {
        this.makh = makh;
    }

    public String getTensp () {
        return tensp;
    }

    public void setTensp ( String tensp ) {
        this.tensp = tensp;
    }

    public String getMahd () {
        return mahd;
    }

    public void setMahd ( String mahd ) {
        this.mahd = mahd;
    }

    public int getSize () {
        return size;
    }

    public void setSize ( int size ) {
        this.size = size;
    }

    public int getDonGia () {
        return donGia;
    }

    public void setDonGia ( int donGia ) {
        this.donGia = donGia;
    }

    @Override
    public String toString () {
        return "HoaDonChiTiet{" + "id=" + id + ", idhd=" + idhd + ", idctsp=" + idctsp + ", soluong=" + soluong + ", thanhtien=" + thanhtien + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + ", manv=" + manv + ", makh=" + makh + ", tensp=" + tensp + ", mahd=" + mahd + ", size=" + size + ", donGia=" + donGia + '}';
    }

    
    
}
