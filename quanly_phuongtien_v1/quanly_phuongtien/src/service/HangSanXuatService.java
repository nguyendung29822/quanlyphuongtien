package service;

import model.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatService {
    private ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();

    public HangSanXuatService() {
        hangSanXuatArrayList.add(new HangSanXuat("HD", "HonDa", "JaPan"));
        hangSanXuatArrayList.add(new HangSanXuat("KI", "KiA", "Korea"));
        hangSanXuatArrayList.add(new HangSanXuat("AU", "AuDi", "Germany"));
    }
    public ArrayList<HangSanXuat> findAll(){
        return hangSanXuatArrayList;
    }
    public HangSanXuat timKiemTheoMaHangSanXuat(String ten){
        for (int i = 0; i < hangSanXuatArrayList.size(); i++) {
            if(hangSanXuatArrayList.get(i).getMaHangSanXuat().equals(ten)){
                return hangSanXuatArrayList.get(i);
            }
        }
        return null;
    }

}
