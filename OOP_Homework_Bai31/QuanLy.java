package OOP_Homework_Bai31;

import java.util.List;

import OOP_Homework_Bai31.KhachHang;

import java.util.ArrayList;
public class QuanLy {
List <BienLai> khachhangs;

public QuanLy() {
	this.khachhangs = new ArrayList<>();
	}
//them moi khach hang
public void addCustomer(BienLai khachhang) {
	this.khachhangs.add(khachhang);
}
//hien thi thong tin danh sach khach hang
public void ShowInformation() {
	  this.khachhangs.forEach(documents -> System.out.println(documents.toString()));
}
//xoa khach hang
//xoa khach hang
public boolean deleteCustomer(int masocongto) {
	 BienLai doc = this.khachhangs.stream()
           .filter(document -> document.getMasocongto()==masocongto).findFirst().orElse(null);
	 if(doc == null) {
	return false;}
	 this.khachhangs.remove(doc);
	 return true;
}
//sua thong tin khach hang
public void editInfo(int masocongto,String tenchuho,String sonha) {
	BienLai doc = this.khachhangs.stream()
            .filter(khachhang -> khachhang.getMasocongto()==masocongto).findFirst().orElse(null);
	if(doc ==null) {
		return;
	}
	doc.setSonha(sonha);
	doc.setTenchuho(tenchuho);
	System.out.println("Chinh sua thanh cong !");
	}
//tinh tong so tien dien
public void TotalMoney(int masocongto) {
	BienLai doc = this.khachhangs.stream()
            .filter(khachhang -> khachhang.getMasocongto()==masocongto).findFirst().orElse(null);
	if(doc ==null) {
		return;
		}
		double tongtien = (double) (doc.chisomoi-doc.chisocu)*5;
		System.out.println("Tong so tien dien la : "+tongtien+ "VND");
	}
}
