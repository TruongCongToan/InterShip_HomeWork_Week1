package OOP_Homework_Bai2;

import java.util.Scanner;

public class Main {
	public static ThiSinh Taomoithisinh(Scanner scanner, String choice) {
        System.out.print("Nhap so bao danh: ");
        String Sobaodanh = scanner.nextLine();
        System.out.print("Nhap ten cua thi sinh: ");
        String HoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String DiaChi = scanner.nextLine();
        System.out.print("Nhap mu do uu tien: ");
        int MucUuTien = scanner.nextInt();
        scanner.nextLine();
        if (choice.equals("a")) {
            return new KhoiA(Sobaodanh, HoTen,DiaChi,MucUuTien);
        } else if (choice.equals("b")) {
            return new KhoiB(Sobaodanh, HoTen,DiaChi,MucUuTien);
        } else {
            return new KhoiC(Sobaodanh, HoTen,DiaChi,MucUuTien);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyensinh = new TuyenSinh();
        while (true) {
            System.out.println("\nChuong trinh quan ly thi sinh");
            System.out.println("1: Them moi thi sinh");
            System.out.println("2: Hien thi thong tin cua thi sinh");
            System.out.println("3: Tim thi sinh theo so bao danh");
            System.out.println("4: Thoat chuong trinh");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1": {
                    System.out.println("a: Them thi sinh khoi A");
                    System.out.println("b: Them thi sinh khoi B");
                    System.out.println("c: Them thi sinh khoi C");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "a": {
                            tuyensinh.addThiSinh(Taomoithisinh(scanner,"a"));
                            break;

                        }
                        case "b": {
                        	   tuyensinh.addThiSinh(Taomoithisinh(scanner,"b"));
                            break;
                        }
                        case "c": {
                        	   tuyensinh.addThiSinh(Taomoithisinh(scanner,"c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                	tuyensinh.showInfo();
                    break;
                }
                case "3": {
                    System.out.print("Nhap so bao danh muon tim: ");
                    String Sobaodanh = scanner.nextLine();
                    ThiSinh thisinh = tuyensinh.searchById(Sobaodanh);
                    if (thisinh == null) {
                        System.out.println("Khong tim thay sinh vien co ma nay");
                    } else {
                        System.out.println(thisinh.toString());
                    }
                    break;
                }
                case "4": {
                	System.out.println("Cam on ban da su dung chuong trinh");
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    
}
