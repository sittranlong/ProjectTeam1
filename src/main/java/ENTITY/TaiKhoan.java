/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.util.Date;

/**
 *
 * @author TieuLong
 */
public class TaiKhoan {
    private String mataikhoan;
    private String tentaikhoan;
    private String chucvu;
    private String pass;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(String mataikhoan, String tentaikhoan, String chucvu, String pass, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.mataikhoan = mataikhoan;
        this.tentaikhoan = tentaikhoan;
        this.chucvu = chucvu;
        this.pass = pass;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public String getMataikhoan() {
        return mataikhoan;
    }

    public void setMataikhoan(String mataikhoan) {
        this.mataikhoan = mataikhoan;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    
    
}
