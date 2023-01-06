package model;

import java.io.Serializable;

public class Oto extends PhuongTien implements Serializable {
    private double soChoNgoi;
    private String kieuXe;


    public Oto(String bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, double soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bKS) {

    }

    public double getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(double soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                "} " + super.toString();
    }
}
