package service;

import model.Oto;
import model.XeMay;
import model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PhuongTienService {

    private ArrayList<XeTai> danhSachXeTai = new ArrayList<>();
    private ArrayList<XeMay> danhSachXeMay = new ArrayList<>();
    private ArrayList<Oto> danhSachOto = new ArrayList<>();

    public PhuongTienService() {
    }

    public void themPhuongTienXeTai(XeTai xeTai) {
        this.danhSachXeTai.add(xeTai);
    }

    public void themPhuongTienXeOto(Oto oto) {
        this.danhSachOto.add(oto);
    }

    public void themPhuongTienXeMay(XeMay xeMay) {
        this.danhSachXeMay.add(xeMay);
    }

    public void hienThiDanhSachXeTai() {
        for (XeTai xetai : danhSachXeTai) {
            System.out.println(xetai);
        }
    }

    public void hienThiDanhSachOto() {
        for (Oto oto : danhSachOto) {
            System.out.println(oto);
        }
    }

    public void hienThiDanhSachXeMay() {
        for (XeMay xemay : danhSachXeMay) {
            System.out.println(xemay);
        }
    }

    public void hienThiTatCa() {
        this.hienThiDanhSachXeTai();
        this.hienThiDanhSachXeMay();
        this.hienThiDanhSachOto();
    }
    public void xoaPhuongTienXeTai(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            if (danhSachXeTai.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                danhSachXeTai.remove(i);
            }
        }
    }


    public void xoaPhuongTienOto(String bienKiemSoat) {
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                danhSachOto.remove(i);
            }
        }
    }

    public void xoaPhuongTienXeMay(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if (danhSachXeMay.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                danhSachXeMay.remove(i);
            }
        }
    }

    public boolean kiemTraBienKiemSoatXeTai(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            if (danhSachXeTai.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraBienKiemSoatOto(String bienKiemSoat) {
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraBienKiemSoatXeMay(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if (danhSachXeMay.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                return true;
            }
        }
        return false;
    }

    public void timKiemXeTai(String bienKiemSoat) {
        for (XeTai xetai : danhSachXeTai) {
            if (xetai.getBienKiemSoat().indexOf(bienKiemSoat) >= 0) {
                System.out.println(xetai);
            }
        }
    }

    public void timKiemOto(String bienKiemSoat) {
        for (Oto oto : danhSachOto) {
            if (oto.getBienKiemSoat().indexOf(bienKiemSoat) >= 0) {
                System.out.println(oto);
            }
        }
    }

    public void timKiemXeMay(String bienKiemSoat) {
        for (XeMay xemay : danhSachXeMay) {
            if (xemay.getBienKiemSoat().indexOf(bienKiemSoat) >= 0) {
                System.out.println(xemay);
            }
        }
    }

    public void ghiDuLieuXeTai(File file) {
        try {
            FileOutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(danhSachXeTai);
//            for (XeTai xeTai : danhSachXeTai) {
//                oos.writeObject(xeTai);
//            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docDuLieuXeTai(File file) {
        try {
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            danhSachXeTai = (ArrayList<XeTai>) ois.readObject();
            System.out.println(danhSachXeTai);

//            while (true) {
//                Object oj = ois.readObject();
//                if (oj == null) {
//                    break;
//                }
//                if (oj != null) {
//                    xeTai = (XeTai) oj;
//                    this.danhSachXeTai.add(xeTai);
//                }
//            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
