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
public class MauSac {
    private UUID id;
    private String tenmau;
    private String mamau;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    // Các phương thức getter và setter

    public MauSac() {
    }

    public MauSac(UUID id, String tenmau, String mamau, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.tenmau = tenmau;
        this.mamau = mamau;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public MauSac(String tenmau, String mamau) {
        this.tenmau = tenmau;
        this.mamau = mamau;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTenmau() {
        return tenmau;
    }

    public void setTenmau(String tenmau) {
        this.tenmau = tenmau;
    }

    public String getMamau() {
        return mamau;
    }

    public void setMamau(String mamau) {
        this.mamau = mamau;
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
        return "MauSac{" + "id=" + id + ", tenmau=" + tenmau + ", mamau=" + mamau + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }
    
}
