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
public class ChiTietSanPham {
    private String id;
    private String sanPham;
    private String mauSac;
    private String kieuDang;
    private String size;
    private String deGiay;
    private String mactsp;
    private String hinhAnh;
    private int soLuong;
    private int donGia;
    private String moTa;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    // Các phương thức getter và setter

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String id, String sanPham, String mauSac, String kieuDang, String size, String deGiay, String mactsp, String hinhAnh, int soLuong, int donGia, String moTa, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.sanPham = sanPham;
        this.mauSac = mauSac;
        this.kieuDang = kieuDang;
        this.size = size;
        this.deGiay = deGiay;
        this.mactsp = mactsp;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public ChiTietSanPham(String sanPham, String mauSac, String kieuDang, String size, String deGiay, String mactsp, int soLuong, int donGia, String moTa, int trangThai) {
        this.sanPham = sanPham;
        this.mauSac = mauSac;
        this.kieuDang = kieuDang;
        this.size = size;
        this.deGiay = deGiay;
        this.mactsp = mactsp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDeGiay() {
        return deGiay;
    }

    public void setDeGiay(String deGiay) {
        this.deGiay = deGiay;
    }

    public String getMactsp() {
        return mactsp;
    }

    public void setMactsp(String mactsp) {
        this.mactsp = mactsp;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayChinhSua() {
        return ngayChinhSua;
    }

    public void setNgayChinhSua(Date ngayChinhSua) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "id=" + id + ", sanPham=" + sanPham + ", mauSac=" + mauSac + ", kieuDang=" + kieuDang + ", size=" + size + ", deGiay=" + deGiay + ", mactsp=" + mactsp + ", hinhAnh=" + hinhAnh + ", soLuong=" + soLuong + ", donGia=" + donGia + ", moTa=" + moTa + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }

    
    
}
