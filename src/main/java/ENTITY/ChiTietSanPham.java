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
    private String idsp;
    private String idms;
    private String idkieu;
    private String idsize;
    private String idde;
    private String mactsp;
    private String hinhanh;
    private int soluong;
    private int dongia;
    private String mota;
    private Date ngayTao;
    private Date ngayChinhSua;
    private int trangThai;

    // Các phương thức getter và setter

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String id, String idsp, String idms, String idkieu, String idsize, String idde, String mactsp, String hinhanh, int soluong, int dongia, String mota, Date ngayTao, Date ngayChinhSua, int trangThai) {
        this.id = id;
        this.idsp = idsp;
        this.idms = idms;
        this.idkieu = idkieu;
        this.idsize = idsize;
        this.idde = idde;
        this.mactsp = mactsp;
        this.hinhanh = hinhanh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.mota = mota;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.trangThai = trangThai;
    }

    public ChiTietSanPham(String id, String idsp, String idms, String idkieu, String idsize, String idde, String mactsp, String hinhanh, int soluong, int dongia, String mota, int trangThai) {
        this.id = id;
        this.idsp = idsp;
        this.idms = idms;
        this.idkieu = idkieu;
        this.idsize = idsize;
        this.idde = idde;
        this.mactsp = mactsp;
        this.hinhanh = hinhanh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.mota = mota;
        this.trangThai = trangThai;
    }

    public ChiTietSanPham(String idsp, String idms, String idkieu, String idsize, String idde, String mactsp, int soluong, int dongia, String mota, int trangThai) {
        this.idsp = idsp;
        this.idms = idms;
        this.idkieu = idkieu;
        this.idsize = idsize;
        this.idde = idde;
        this.mactsp = mactsp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.mota = mota;
        this.trangThai = trangThai;
    }

    

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getIdms() {
        return idms;
    }

    public void setIdms(String idms) {
        this.idms = idms;
    }

    public String getIdkieu() {
        return idkieu;
    }

    public void setIdkieu(String idkieu) {
        this.idkieu = idkieu;
    }

    public String getIdsize() {
        return idsize;
    }

    public void setIdsize(String idsize) {
        this.idsize = idsize;
    }

    public String getIdde() {
        return idde;
    }

    public void setIdde(String idde) {
        this.idde = idde;
    }

    public String getMactsp() {
        return mactsp;
    }

    public void setMactsp(String mactsp) {
        this.mactsp = mactsp;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
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
    public String TrangThai(){
        if(trangThai == 0){
            return "Hết Hàng";
        }else{
            return "Còn Hàng";
        }
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "id=" + id + ", idsp=" + idsp + ", idms=" + idms + ", idkieu=" + idkieu + ", idsize=" + idsize + ", idde=" + idde + ", mactsp=" + mactsp + ", hinhanh=" + hinhanh + ", soluong=" + soluong + ", dongia=" + dongia + ", mota=" + mota + ", ngayTao=" + ngayTao + ", ngayChinhSua=" + ngayChinhSua + ", trangThai=" + trangThai + '}';
    }
    
    public Object[] toDataRow(){
        return new Object[] {mactsp,idsp,idkieu,idsize,idms,idde,dongia,soluong,mota,TrangThai()};
    }
}
