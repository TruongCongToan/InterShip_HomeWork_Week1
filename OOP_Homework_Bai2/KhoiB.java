package OOP_Homework_Bai2;

public class KhoiB extends ThiSinh{

	public static String TOAN = "Toan";
	public static String  HOA ="Hoa";
	public static String  SINH = "Sinh";
	
	//khoi tao cac constructor
	public KhoiB(String sobaodanh, String hoTen, String diaChi, int mucUuTien) {
		super(sobaodanh, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
	}

	//generate to String
	@Override
	public String toString() {
		return "----------------------------------------------------------------------------------------------\nKhoi B : [Sobaodanh=" + Sobaodanh + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", MucUuTien=" + MucUuTien
				+ ", Sobaodanh()=" + getSobaodanh() + ", HoTen()=" + getHoTen() + ", DiaChi=" + getDiaChi()
				+ ", Mu do uu tien=" + getMucUuTien() + "]\n----------------------------------------------------------------------------------------------\n";
	
	}
	
}
