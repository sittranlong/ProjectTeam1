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
public class KhachHang {
    private UUID id;
    private String makh;
    private String ten;
    private String diachi;
    private String sdt;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    // Các phương thức getter và setter

    public KhachHang(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
    }
    
    public KhachHang() {
    }

    public KhachHang(UUID id, String makh, String ten, String diachi, String sdt, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.makh = makh;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public KhachHang(String makh, String ten, String diachi, String sdt) {
        this.makh = makh;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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
        return "KhachHang{" + "id=" + id + ", makh=" + makh + ", ten=" + ten + ", diachi=" + diachi + ", sdt=" + sdt + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }
    
    
}
