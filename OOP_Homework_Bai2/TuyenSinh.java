package OOP_Homework_Bai2;
import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
	List<ThiSinh> thisinhs;

//Luu dang array list
	public TuyenSinh() {
		this.thisinhs= new ArrayList<>();
	}
	//them moi thi sinh
	public void addThiSinh(ThiSinh thisinh) {
		this.thisinhs.add(thisinh);
	}
	//hien thi thong tin
	public void showInfo() {
		this.thisinhs.forEach(thisinh -> System.out.println(thisinh.toString()));
	}
	//tim kiem thi sinh theo so bao danh
	public ThiSinh searchById(String sobaodanh) {
		ThiSinh tsinh = this.thisinhs.stream()
				.filter(thisinh -> thisinh.getSobaodanh().equals(sobaodanh)).findFirst().orElse(null);
		if(tsinh == null) {
		return null;	
		}
		return tsinh;
	}

}
