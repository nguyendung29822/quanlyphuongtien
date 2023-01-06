package model;

import java.io.Serializable;

public class XeTai extends PhuongTien implements Serializable {
    private double trongTai;

    public XeTai(String bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat,tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }





    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                "} " + super.toString();
    }
}
