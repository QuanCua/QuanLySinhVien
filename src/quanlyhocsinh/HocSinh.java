/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

/**
 *
 * @author Asus
 */
public class HocSinh {

    private String hoTen;
    private String ngheNghiep;
    private String congTy;
    private String soDienThoai;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String ngheNghiep, String congTy, String soDienThoai) {
        this.hoTen = hoTen;
        this.ngheNghiep = ngheNghiep;
        this.congTy = congTy;
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNgiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getCongTy() {
        return congTy;
    }

    public void setCongTy(String congTy) {
        this.congTy = congTy;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

}
