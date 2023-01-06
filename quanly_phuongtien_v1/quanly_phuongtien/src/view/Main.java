package view;

import model.*;
import service.HangSanXuatService;
import service.PhuongTienService;

import java.io.File;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        PhuongTienService phuongTienService = new PhuongTienService();
//        PhuongTienService phuongTienService = new PhuongTienService();
//        PhuongTienService phuongTienService = new PhuongTienService();
        PhuongTienService phuongTienService = new PhuongTienService();
        int luachon = 0;
        do {
            System.out.println("------CHƯƠNG TRINH QUẢN LÝ PHUONG TIỆN GIAO THÔNG------");
            System.out.println("vui lòng lựa chọn chức năng");
            System.out.println("1.them moi phuong tien\n" +
                    "2.hiển thị phương tiện\n" +
                    "3.xóa phương tiện\n" +
                    "4.tìm kiếm theo biển kiểm soát\n" +
                    "5.copy danh sách phương tiện xuống tập tin\n" +
                    "6.đọc danh sách phương tiện từ tập tin\n" +
                    "7.thoát");
            luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("vui lòng lựa chọn loại phương tiện cần thêm mới :");
                    System.out.println("1.xe tai\n" +
                            "2.oto\n" +
                            "3.xe may");
                    luachon = Integer.parseInt(scanner.nextLine());
                    if (luachon == 1) {
                        System.out.println("mời nhập biển kiểm soát :");
                        String bKS = scanner.nextLine();
                        System.out.println("danh sách hãng sản xuất");
                        HangSanXuatService hangSanXuatService = new HangSanXuatService();
                        List<HangSanXuat> hangSanXuatList = hangSanXuatService.findAll();
                        for (int i = 0; i < hangSanXuatList.size(); i++) {
                            System.out.println(hangSanXuatList.get(i));
                        }
                        System.out.println("mời nhập tên hãng sản xuất");
                        String ten = scanner.nextLine();
                        HangSanXuat tenMaHangSanXuat = hangSanXuatService.timKiemTheoMaHangSanXuat(ten);
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        System.out.println("mời nhập trọng tải");
                        Double trongTai = Double.parseDouble(scanner.nextLine());
                        XeTai xeTai = new XeTai(bKS, tenMaHangSanXuat, namSanXuat, chuSoHuu, trongTai);
//                        dsxetai.themPhuongTienXeTai(xeTai);
                        phuongTienService.themPhuongTienXeTai(xeTai);
                        break;
                    } else if (luachon == 2) {
                        System.out.println("mời nhập biển kiểm soát :");
                        String bKS = scanner.nextLine();
                        System.out.println("danh sách hãng sản xuất");
                        HangSanXuatService hangSanXuatService = new HangSanXuatService();
                        List<HangSanXuat> hangSanXuatList = hangSanXuatService.findAll();
                        for (int i = 0; i < hangSanXuatList.size(); i++) {
                            System.out.println(hangSanXuatList.get(i));
                        }
                        System.out.println("mời nhập tên hãng sản xuất");
                        String ten = scanner.nextLine();
                        HangSanXuat tenMaHangSanXuat = hangSanXuatService.timKiemTheoMaHangSanXuat(ten);
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        System.out.println("mời nhập số chỗ ngồi :");
                        Double soChoNgoi = Double.parseDouble(scanner.nextLine());
                        System.out.println("mời nhập kiểu xe :");
                        String kieuXe = scanner.nextLine();
                        Oto oto = new Oto(bKS, tenMaHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                        phuongTienService.themPhuongTienXeOto(oto);
                        break;
                    } else if (luachon == 3) {
                        System.out.println("mời nhập biển kiểm soát :");
                        String bKS = scanner.nextLine();
                        System.out.println("danh sách hãng sản xuất");
                        HangSanXuatService hangSanXuatService = new HangSanXuatService();
                        List<HangSanXuat> hangSanXuatList = hangSanXuatService.findAll();
                        for (int i = 0; i < hangSanXuatList.size(); i++) {
                            System.out.println(hangSanXuatList.get(i));
                        }
                        System.out.println("mời nhập tên hãng sản xuất");
                        String ten = scanner.nextLine();
                        HangSanXuat tenMaHangSanXuat = hangSanXuatService.timKiemTheoMaHangSanXuat(ten);
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        System.out.println("mời nhập công suất :");
                        String congSuat = scanner.nextLine();
                        XeMay xeMay = new XeMay(bKS, tenMaHangSanXuat, namSanXuat, chuSoHuu, congSuat);
                        phuongTienService.themPhuongTienXeMay(xeMay);
                        break;
                    }
                case 2:
                    System.out.println("1.hiển thị xe tải\n" +
                            "2.hiển thị xe ô tô\n" +
                            "3.hiển thị xe máy\n" +
                            "4.hiển thị tất cả.");
                    luachon = Integer.parseInt(scanner.nextLine());
                    if (luachon == 1) {
//                        dsxetai.hienThiDanhSachXeTai();
                        phuongTienService.hienThiDanhSachXeTai();
                        break;
                    } else if (luachon == 2) {
                        phuongTienService.hienThiDanhSachOto();
                        break;
                    } else if (luachon == 3) {
                        phuongTienService.hienThiDanhSachXeMay();
                        break;
                    } else if (luachon == 4) {
                        phuongTienService.hienThiTatCa();
                        break;
                    }
                case 3:
                    System.out.println("1.xóa xe tải\n" +
                            "2.xóa xe ô tô\n" +
                            "3.xóa xe máy");
                    luachon = Integer.parseInt(scanner.nextLine());
                    switch (luachon) {
                        case 1:
                            System.out.println("mời nhập vào biển kiểm soát");
                            String bKS = scanner.nextLine();
                            boolean check = phuongTienService.kiemTraBienKiemSoatXeTai(bKS);
                            if (check == true) {
                                System.out.println("xác nhận xóa :");
                                System.out.println("1.yes\n" +
                                        "2.no");
                                luachon = Integer.parseInt(scanner.nextLine());
                                if (luachon == 1) {
                                    phuongTienService.xoaPhuongTienXeTai(bKS);
                                    System.out.println("xóa phương tiện thành công!!!");
                                } else if (luachon == 2) {
                                    break;
                                }
                            } else {
                                System.out.println("biển kiểm soát không tồn tại");
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("mời nhập vào biển kiểm soát");
                            String bKS1 = scanner.nextLine();
                            if (phuongTienService.kiemTraBienKiemSoatOto(bKS1)) {
                                System.out.println("1.yes\n" +
                                        "2.no");
                                luachon = Integer.parseInt(scanner.nextLine());
                                if (luachon == 1) {
                                    phuongTienService.xoaPhuongTienOto(bKS1);
                                } else if (luachon == 2) {
                                    break;
                                }
                            } else {
                                System.out.println("biển kiểm soát không ồn tại");
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("mời nhập vào biển kiểm soát");
                            String bKS2 = scanner.nextLine();
                            luachon = Integer.parseInt(scanner.nextLine());

                            if (phuongTienService.kiemTraBienKiemSoatXeMay(bKS2)) {
                                System.out.println("1.yes\n" +
                                        "2.no");
                                luachon = Integer.parseInt(scanner.nextLine());
                                if (luachon == 1) {
                                    phuongTienService.xoaPhuongTienXeMay(bKS2);
                                } else if (luachon == 2) {
                                    break;
                                }
                            } else {
                                System.out.println("biển kiểm soát không tồn tại");
                                break;
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("mời nhập vào biển kiểm soát cần tìm :");
                    String bKS = scanner.nextLine();
                    System.out.println("kết quả tìm kiếm :");
                    phuongTienService.timKiemXeTai(bKS);
                    phuongTienService.timKiemOto(bKS);
                    phuongTienService.timKiemXeMay(bKS);
                    break;
                case 5:
                    System.out.println("---copy danh sách phương tiện xuống tập tin---");
                    System.out.println("mời nhập tên file :");
                    String tenFile = scanner.nextLine();
                    File f = new File(tenFile);
                    phuongTienService.ghiDuLieuXeTai(f);
                    break;

                case 6:
                    System.out.println("-----đọc danh sách phương tiện------");
                    System.out.println("mời nhập tên file :");
                    String path = scanner.nextLine();
                    File file = new File(path);
                    phuongTienService.docDuLieuXeTai(file);
                    break;

            }
        } while (luachon != 0);

    }
}
