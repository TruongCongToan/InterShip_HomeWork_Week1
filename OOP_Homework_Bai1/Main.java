package OOP_Homework_Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanlysach = new QuanLySach();
        while (true) {
            System.out.println("Chuong trinh quan ly tai lieu");
            System.out.println("1: Them moi tai lieu");
            System.out.println("2: Xoa tai lieu");
            System.out.println("3: Hien thi thong tin tai lieu");
            System.out.println("4: Tim kiem theo loai");
         
         
            System.out.println("5: Thoat:");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1": {
                    System.out.println("a: Them moi Sach");
                    System.out.println("b: Them moi Bao");
                    System.out.println("c: Them moi tap chi");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhap ma tai lieu: ");
                            String matailieu = scanner.nextLine();
                            System.out.print("Nhap ten nha xuat ban: ");
                            String tenNXB = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int sobanphathanh = scanner.nextInt();
                            System.out.print("Nhap ten tac gia: ");
                            scanner.nextLine();
                            String tentacgia = scanner.nextLine();
                            System.out.print(" Nhap So trang: ");
                            int sotrang = scanner.nextInt();
                            
                            Document book = new Books(matailieu, tenNXB, sobanphathanh, tentacgia, sotrang);
                            quanlysach.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                        	 System.out.print(" Nhap ma cua tai lieu: ");
                             String matailieu = scanner.nextLine();
                             System.out.print("Nhap ten nha xuat ban: ");
                             String tenNXB = scanner.nextLine();
                             System.out.print("Nhap so ban phat hanh: ");
                             int sobanphathanh = scanner.nextInt();
                             
                            System.out.print("Nhap ngay phat hanh: ");
                            int ngayphathanh = scanner.nextInt();
                            Document newspaper = new Newspaper(matailieu,tenNXB,sobanphathanh,ngayphathanh);
                            quanlysach.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                       	 System.out.print("Nhap ma cua tai lieu: ");
                         String matailieu = scanner.nextLine();
                         System.out.print("Nhap ten nha xuat ban: ");
                         String tenNXB = scanner.nextLine();
                         System.out.print("Nhap so ban phat hanh ");
                         int sobanphathanh = scanner.nextInt();
                            
                            System.out.print("Nhap so phat hanh ");
                            int sophathanh = scanner.nextInt();
                            System.out.print("Nhap ngay phat hanh : ");
                            int thangphathanh = scanner.nextInt();
                            Document journal = new Magazine(matailieu, tenNXB, sobanphathanh, sophathanh, thangphathanh);
                            quanlysach.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "4": {
                    System.out.println("a: Tim kiem theo loai la sach");
                    System.out.println("b: Tim kiem theo loai la tap chi");
                    System.out.println("c: Tim kiem theo loai la bao");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                           quanlysach.searchByBooks();
                            break;
                        }
                        case "b": {
                        	 quanlysach.searchByMagazine();
                            break;
                        }
                        case "c":
                        	quanlysach.searchByNewspaper();          
                        	break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    quanlysach.ShowInformation();
                    break;
                }
                case "2": {
                    System.out.print("Nhap ma tai lieu can xoa ");
                    String matailieu = scanner.nextLine();
                    System.out.println(quanlysach.deleteDocument(matailieu) ? "Xoa thanh cong" : "That bai( co the bo ban chua nhap dung matailieu can xoa)");
                }
                break;
                case "5": {
                	System.out.println("cam on ban da su dung chuong trinh");
                    return;
                    
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

}
