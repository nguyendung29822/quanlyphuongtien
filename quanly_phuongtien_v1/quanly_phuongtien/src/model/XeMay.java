package model;

import java.io.Serializable;

public class XeMay extends PhuongTien implements Serializable {
    private String congSuat;


    public XeMay(String bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(String bKS) {

    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                "} " + super.toString();
    }
}
