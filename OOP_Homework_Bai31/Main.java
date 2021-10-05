package OOP_Homework_Bai31;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy quanly = new QuanLy();
        while (true) {
            System.out.println("Chuong trinh quan ly ho gia dinh su dung dien");
            System.out.println("1: Them moi ho gia dinh");
            System.out.println("2: Xoa ho gia dinh");
            System.out.println("3: Hien thi thong tin ho gia dinh");
            System.out.println("4: Sua cac thong tin cua ho gia dinh");
            System.out.println("5: Tinh so tien dien");
         
            System.out.println("6: Thoat:");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1": {
                			System.out.print("\n------------------------------------------------------------------------\n");
                			System.out.print("NHAP THONG TIN KHACH HANG \n");
                			System.out.print("------------------------------------------------------------------------\n");
                            System.out.print("Nhap ten chu ho: ");
                            String tenchuho = scanner.nextLine();
                            System.out.print("Nhap so nha: ");
                            String sonha = scanner.nextLine();
                            System.out.print("Nhap ma so cong to: ");
                            int masocongto = scanner.nextInt();                            
                            
                        	System.out.print("\n------------------------------------------------------------------------\n");
                            System.out.print("NHAP BIEN LAI  \n");
                            System.out.print("------------------------------------------------------------------------\n");
                            System.out.print("Nhap chi so cu: ");
                            int chisocu = scanner.nextInt();  
                            System.out.print("Nhap tri so moi: ");
                            int chisomoi = scanner.nextInt();  
                            System.out.print("\n------------------------------------------------------------------------\n");
                          
                           
                            BienLai khachhang = new BienLai(tenchuho,sonha,masocongto,chisocu,chisomoi);
                            System.out.print("\n------------------------------------------------------------------------\n");
                           
                            System.out.println(khachhang.toString());
                            quanly.addCustomer(khachhang);
                            System.out.print("\n------------------------------------------------------------------------\n");
                            scanner.nextLine();
                            break;
                }
                case "2": {
                	System.out.print("Nhap ma so dien cua ho gia dinh can xoa ");
                    int masocongto = scanner.nextInt();
                    System.out.println(quanly.deleteCustomer(masocongto) ? "Xoa thanh cong" : "That bai( co the bo ban chua nhap dung masocongto can xoa)");
                
                break;
                }
              
                case "3": {
                	 quanly.ShowInformation();
                    break;
                }
                case "4": {
                	System.out.print("Nhap ten chu ho: ");
                    String tenchuho = scanner.nextLine();
                    System.	out.print("Nhap so nha: ");
                    String sonha = scanner.nextLine();
                    System.out.print("Nhap ma so cong to: ");
                    int masocongto = scanner.nextInt(); 
                    
                    quanly.editInfo(masocongto, tenchuho, sonha);
                    
                    break;
                }
                case "5": {
                	 System.out.print("Nhap ma so cong to: ");
                     int masocongto = scanner.nextInt(); 
                 	System.out.print("\n------------------------------------------------------------------------\n");
                    quanly.TotalMoney(masocongto);
                	System.out.print("\n------------------------------------------------------------------------\n");
                     break;
                }

                case "6": {
                	System.out.println("cam on ban da su dung chuong trinh");
                    return;
                    
                }
                default:
                    System.out.println("nhap sai yeu cau ");
                    continue;
            }

        }
    }

}
