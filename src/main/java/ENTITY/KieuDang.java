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
public class KieuDang {
    private UUID id;
    private String tenkieu;
    private String makieu;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    // Các phương thức getter và setter

    public KieuDang() {
    }

    public KieuDang(UUID id, String tenkieu, String makieu, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.tenkieu = tenkieu;
        this.makieu = makieu;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public KieuDang(String tenkieu, String makieu) {
        this.tenkieu = tenkieu;
        this.makieu = makieu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTenkieu() {
        return tenkieu;
    }

    public void setTenkieu(String tenkieu) {
        this.tenkieu = tenkieu;
    }

    public String getMakieu() {
        return makieu;
    }

    public void setMakieu(String makieu) {
        this.makieu = makieu;
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
        return "KieuDang{" + "id=" + id + ", tenkieu=" + tenkieu + ", makieu=" + makieu + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }
    
}
