package OOP_Homework_Bai2;

public class ThiSinh {
	protected String Sobaodanh;
	protected String HoTen;
	protected String DiaChi;
	protected int MucUuTien;
	
	//Kho tao constructor
	public ThiSinh(String sobaodanh, String hoTen, String diaChi, int mucUuTien) {
		super();
		Sobaodanh = sobaodanh;
		HoTen = hoTen;
		DiaChi = diaChi;
		MucUuTien = mucUuTien;
	}
	
	//khoi tao getter and setters
	public String getSobaodanh() {
		return Sobaodanh;
	}

	public void setSobaodanh(String sobaodanh) {
		Sobaodanh = sobaodanh;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getMucUuTien() {
		return MucUuTien;
	}

	public void setMucUuTien(int mucUuTien) {
		MucUuTien = mucUuTien;
	}
	
	
}
