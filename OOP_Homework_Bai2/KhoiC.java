package OOP_Homework_Bai2;

public class KhoiC extends ThiSinh{
	
	public static String VAN ="van";
	public static String SU ="Su";
	public static String DIA="Dia";

//khoi tao coonstructor 
public KhoiC(String sobaodanh, String hoTen, String diaChi, int mucUuTien) {
	super(sobaodanh, hoTen, diaChi, mucUuTien);
	// TODO Auto-generated constructor stub
	}
//generate to String

@Override
public String toString() {
	return "----------------------------------------------------------------------------------------------\nKhoi A : [Sobaodanh=" + Sobaodanh + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", MucUuTien=" + MucUuTien
			+ ", Sobaodanh()=" + getSobaodanh() + ", HoTen()=" + getHoTen() + ", DiaChi=" + getDiaChi()
			+ ", Mu do uu tien=" + getMucUuTien() + "]\n----------------------------------------------------------------------------------------------\n";
	
}

}
