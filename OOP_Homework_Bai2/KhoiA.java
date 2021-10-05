package OOP_Homework_Bai2;

public class KhoiA extends ThiSinh{
	
	public static final String TOAN ="Toan";
	public static final String LY ="Ly";
	public static final String HOA ="Hoa";
	
	//khoi tao constructor cho khoi A
	public KhoiA(String sobaodanh, String hoTen, String diaChi, int mucUuTien) {
		super(sobaodanh, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "----------------------------------------------------------------------------------------------\nKhoi A : [Sobaodanh=" + Sobaodanh + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", MucUuTien=" + MucUuTien
				+ ", Sobaodanh()=" + getSobaodanh() + ", HoTen()=" + getHoTen() + ", DiaChi=" + getDiaChi()
				+ ", Mu do uu tien=" + getMucUuTien() + "]\n----------------------------------------------------------------------------------------------\n";

	}
	
}
