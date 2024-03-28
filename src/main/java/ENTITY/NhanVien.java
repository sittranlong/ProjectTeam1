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
public class NhanVien {

    private UUID id;
    private String mataiKhoan;
    private String manv;
    private String ten;
    private String diachi;
    private String gioitinh;
    private Date ngaysinh;
    private String email;
    private String sdt;
    private int luong;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(UUID id, String mataiKhoan, String manv, String ten, String diachi, String gioitinh, Date ngaysinh, String email, String sdt, int luong, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.mataiKhoan = mataiKhoan;
        this.manv = manv;
        this.ten = ten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.sdt = sdt;
        this.luong = luong;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMataiKhoan() {
        return mataiKhoan;
    }

    public void setMataiKhoan(String mataiKhoan) {
        this.mataiKhoan = mataiKhoan;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
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
        return "NhanVien{" + "id=" + id + ", mataiKhoan=" + mataiKhoan + ", manv=" + manv + ", ten=" + ten + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + ", email=" + email + ", sdt=" + sdt + ", luong=" + luong + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }

}
