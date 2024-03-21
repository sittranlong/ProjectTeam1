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
public class DeGiay {
    private UUID id;
    private String made;
    private String chatlieude;
    private int docaode;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    // Các phương thức getter và setter

    public DeGiay() {
    }

    public DeGiay(String made, String chatlieude, int docaode) {
        this.made = made;
        this.chatlieude = chatlieude;
        this.docaode = docaode;
    }

    public DeGiay(UUID id, String made, String chatlieude, int docaode, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.made = made;
        this.chatlieude = chatlieude;
        this.docaode = docaode;
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

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getChatlieude() {
        return chatlieude;
    }

    public void setChatlieude(String chatlieude) {
        this.chatlieude = chatlieude;
    }

    public int getDocaode() {
        return docaode;
    }

    public void setDocaode(int docaode) {
        this.docaode = docaode;
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
        return "DeGiay{" + "id=" + id + ", made=" + made + ", chatlieude=" + chatlieude + ", docaode=" + docaode + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }
    
}
