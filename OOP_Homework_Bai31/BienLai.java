package OOP_Homework_Bai31;

public class BienLai extends KhachHang{
	protected int chisocu;
	protected int chisomoi;
	public BienLai(String tenchuho, String sonha, int masocongto, int chisocu, int chisomoi) {
		super(tenchuho, sonha, masocongto);
		this.chisocu = chisocu;
		this.chisomoi = chisomoi;
	}
	public int getChisocu() {
		return chisocu;
	}
	public void setChisocu(int chisocu) {
		this.chisocu = chisocu;
	}
	public int getChisomoi() {
		return chisomoi;
	}
	public void setChisomoi(int chisomoi) {
		this.chisomoi = chisomoi;
	}
	
	@Override
	public String toString() {
		return "\n------------------------------------------------------------------------\n"
				+ "Thong tin khach hang [ten chu ho =" + tenchuho + ", so nha=" + sonha
				+ ", ma so cong to=" + masocongto +",so dien cu = "+chisocu+ ",so dien moi ="+chisomoi+"]"
				+ "\n------------------------------------------------------------------------\n";
	}

}
